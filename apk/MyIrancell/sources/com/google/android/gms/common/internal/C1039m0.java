package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import com.google.android.gms.common.internal.AbstractC1032j;
import com.google.android.gms.common.stats.C1088a;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;
import p000.HandlerC3175rq;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.internal.m0 */
/* loaded from: classes.dex */
public final class C1039m0 extends AbstractC1032j implements Handler.Callback {

    /* renamed from: d */
    private final Context f6240d;

    /* renamed from: e */
    private final Handler f6241e;

    /* renamed from: c */
    @GuardedBy("mConnectionStatus")
    private final HashMap<AbstractC1032j.a, ServiceConnectionC1043o0> f6239c = new HashMap<>();

    /* renamed from: f */
    private final C1088a f6242f = C1088a.m7348a();

    /* renamed from: g */
    private final long f6243g = 5000;

    /* renamed from: h */
    private final long f6244h = 300000;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1039m0(Context context) {
        this.f6240d = context.getApplicationContext();
        this.f6241e = new HandlerC3175rq(context.getMainLooper(), this);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1032j
    /* renamed from: a */
    protected final boolean mo7160a(AbstractC1032j.a aVar, ServiceConnection serviceConnection, String str) {
        boolean m7193d;
        C1057u.m7287a(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f6239c) {
            ServiceConnectionC1043o0 serviceConnectionC1043o0 = this.f6239c.get(aVar);
            if (serviceConnectionC1043o0 == null) {
                serviceConnectionC1043o0 = new ServiceConnectionC1043o0(this, aVar);
                serviceConnectionC1043o0.m7186a(serviceConnection, serviceConnection, str);
                serviceConnectionC1043o0.m7188a(str);
                this.f6239c.put(aVar, serviceConnectionC1043o0);
            } else {
                this.f6241e.removeMessages(0, aVar);
                if (serviceConnectionC1043o0.m7189a(serviceConnection)) {
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
                serviceConnectionC1043o0.m7186a(serviceConnection, serviceConnection, str);
                int m7192c = serviceConnectionC1043o0.m7192c();
                if (m7192c == 1) {
                    serviceConnection.onServiceConnected(serviceConnectionC1043o0.m7190b(), serviceConnectionC1043o0.m7185a());
                } else if (m7192c == 2) {
                    serviceConnectionC1043o0.m7188a(str);
                }
            }
            m7193d = serviceConnectionC1043o0.m7193d();
        }
        return m7193d;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1032j
    /* renamed from: b */
    protected final void mo7161b(AbstractC1032j.a aVar, ServiceConnection serviceConnection, String str) {
        C1057u.m7287a(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f6239c) {
            ServiceConnectionC1043o0 serviceConnectionC1043o0 = this.f6239c.get(aVar);
            if (serviceConnectionC1043o0 == null) {
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            }
            if (!serviceConnectionC1043o0.m7189a(serviceConnection)) {
                String valueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
            serviceConnectionC1043o0.m7187a(serviceConnection, str);
            if (serviceConnectionC1043o0.m7194e()) {
                this.f6241e.sendMessageDelayed(this.f6241e.obtainMessage(0, aVar), this.f6243g);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f6239c) {
                AbstractC1032j.a aVar = (AbstractC1032j.a) message.obj;
                ServiceConnectionC1043o0 serviceConnectionC1043o0 = this.f6239c.get(aVar);
                if (serviceConnectionC1043o0 != null && serviceConnectionC1043o0.m7194e()) {
                    if (serviceConnectionC1043o0.m7193d()) {
                        serviceConnectionC1043o0.m7191b("GmsClientSupervisor");
                    }
                    this.f6239c.remove(aVar);
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        synchronized (this.f6239c) {
            AbstractC1032j.a aVar2 = (AbstractC1032j.a) message.obj;
            ServiceConnectionC1043o0 serviceConnectionC1043o02 = this.f6239c.get(aVar2);
            if (serviceConnectionC1043o02 != null && serviceConnectionC1043o02.m7192c() == 3) {
                String valueOf = String.valueOf(aVar2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                sb.append("Timeout waiting for ServiceConnection callback ");
                sb.append(valueOf);
                sb.toString();
                new Exception();
                ComponentName m7190b = serviceConnectionC1043o02.m7190b();
                if (m7190b == null) {
                    m7190b = aVar2.m7162a();
                }
                if (m7190b == null) {
                    m7190b = new ComponentName(aVar2.m7164b(), "unknown");
                }
                serviceConnectionC1043o02.onServiceDisconnected(m7190b);
            }
        }
        return true;
    }
}
