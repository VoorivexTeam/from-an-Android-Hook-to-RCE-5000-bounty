package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import com.google.android.gms.common.internal.j;
import defpackage.rq;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m0 extends j implements Handler.Callback {
    private final Context d;
    private final Handler e;

    @GuardedBy("mConnectionStatus")
    private final HashMap<j.a, o0> c = new HashMap<>();
    private final com.google.android.gms.common.stats.a f = com.google.android.gms.common.stats.a.a();
    private final long g = 5000;
    private final long h = 300000;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m0(Context context) {
        this.d = context.getApplicationContext();
        this.e = new rq(context.getMainLooper(), this);
    }

    @Override // com.google.android.gms.common.internal.j
    protected final boolean a(j.a aVar, ServiceConnection serviceConnection, String str) {
        boolean d;
        u.a(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.c) {
            o0 o0Var = this.c.get(aVar);
            if (o0Var == null) {
                o0Var = new o0(this, aVar);
                o0Var.a(serviceConnection, serviceConnection, str);
                o0Var.a(str);
                this.c.put(aVar, o0Var);
            } else {
                this.e.removeMessages(0, aVar);
                if (o0Var.a(serviceConnection)) {
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
                o0Var.a(serviceConnection, serviceConnection, str);
                int c = o0Var.c();
                if (c == 1) {
                    serviceConnection.onServiceConnected(o0Var.b(), o0Var.a());
                } else if (c == 2) {
                    o0Var.a(str);
                }
            }
            d = o0Var.d();
        }
        return d;
    }

    @Override // com.google.android.gms.common.internal.j
    protected final void b(j.a aVar, ServiceConnection serviceConnection, String str) {
        u.a(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.c) {
            o0 o0Var = this.c.get(aVar);
            if (o0Var == null) {
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            }
            if (!o0Var.a(serviceConnection)) {
                String valueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
            o0Var.a(serviceConnection, str);
            if (o0Var.e()) {
                this.e.sendMessageDelayed(this.e.obtainMessage(0, aVar), this.g);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.c) {
                j.a aVar = (j.a) message.obj;
                o0 o0Var = this.c.get(aVar);
                if (o0Var != null && o0Var.e()) {
                    if (o0Var.d()) {
                        o0Var.b("GmsClientSupervisor");
                    }
                    this.c.remove(aVar);
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        synchronized (this.c) {
            j.a aVar2 = (j.a) message.obj;
            o0 o0Var2 = this.c.get(aVar2);
            if (o0Var2 != null && o0Var2.c() == 3) {
                String valueOf = String.valueOf(aVar2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                sb.append("Timeout waiting for ServiceConnection callback ");
                sb.append(valueOf);
                sb.toString();
                new Exception();
                ComponentName b = o0Var2.b();
                if (b == null) {
                    b = aVar2.a();
                }
                if (b == null) {
                    b = new ComponentName(aVar2.b(), "unknown");
                }
                o0Var2.onServiceDisconnected(b);
            }
        }
        return true;
    }
}
