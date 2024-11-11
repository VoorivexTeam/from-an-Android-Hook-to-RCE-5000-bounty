package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.f;
import defpackage.jq;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class i implements Handler.Callback {
    private final a a;
    private final Handler h;
    private final ArrayList<f.b> b = new ArrayList<>();
    private final ArrayList<f.b> c = new ArrayList<>();
    private final ArrayList<f.c> d = new ArrayList<>();
    private volatile boolean e = false;
    private final AtomicInteger f = new AtomicInteger(0);
    private boolean g = false;
    private final Object i = new Object();

    /* loaded from: classes.dex */
    public interface a {
        boolean a();

        Bundle q();
    }

    public i(Looper looper, a aVar) {
        this.a = aVar;
        this.h = new jq(looper, this);
    }

    public final void a() {
        this.e = false;
        this.f.incrementAndGet();
    }

    public final void a(int i) {
        u.a(this.h, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.h.removeMessages(1);
        synchronized (this.i) {
            this.g = true;
            ArrayList arrayList = new ArrayList(this.b);
            int i2 = this.f.get();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                f.b bVar = (f.b) obj;
                if (!this.e || this.f.get() != i2) {
                    break;
                } else if (this.b.contains(bVar)) {
                    bVar.a(i);
                }
            }
            this.c.clear();
            this.g = false;
        }
    }

    public final void a(Bundle bundle) {
        u.a(this.h, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.i) {
            boolean z = true;
            u.b(!this.g);
            this.h.removeMessages(1);
            this.g = true;
            if (this.c.size() != 0) {
                z = false;
            }
            u.b(z);
            ArrayList arrayList = new ArrayList(this.b);
            int i = this.f.get();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                f.b bVar = (f.b) obj;
                if (!this.e || !this.a.a() || this.f.get() != i) {
                    break;
                } else if (!this.c.contains(bVar)) {
                    bVar.b(bundle);
                }
            }
            this.c.clear();
            this.g = false;
        }
    }

    public final void a(ConnectionResult connectionResult) {
        u.a(this.h, "onConnectionFailure must only be called on the Handler thread");
        this.h.removeMessages(1);
        synchronized (this.i) {
            ArrayList arrayList = new ArrayList(this.d);
            int i = this.f.get();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                f.c cVar = (f.c) obj;
                if (this.e && this.f.get() == i) {
                    if (this.d.contains(cVar)) {
                        cVar.a(connectionResult);
                    }
                }
                return;
            }
        }
    }

    public final void a(f.b bVar) {
        u.a(bVar);
        synchronized (this.i) {
            if (this.b.contains(bVar)) {
                String valueOf = String.valueOf(bVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
                sb.append("registerConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                sb.toString();
            } else {
                this.b.add(bVar);
            }
        }
        if (this.a.a()) {
            Handler handler = this.h;
            handler.sendMessage(handler.obtainMessage(1, bVar));
        }
    }

    public final void a(f.c cVar) {
        u.a(cVar);
        synchronized (this.i) {
            if (this.d.contains(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                sb.toString();
            } else {
                this.d.add(cVar);
            }
        }
    }

    public final void b() {
        this.e = true;
    }

    public final void b(f.c cVar) {
        u.a(cVar);
        synchronized (this.i) {
            if (!this.d.remove(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
                sb.append("unregisterConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
                sb.toString();
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(45);
            sb.append("Don't know how to handle message: ");
            sb.append(i);
            Log.wtf("GmsClientEvents", sb.toString(), new Exception());
            return false;
        }
        f.b bVar = (f.b) message.obj;
        synchronized (this.i) {
            if (this.e && this.a.a() && this.b.contains(bVar)) {
                bVar.b(this.a.q());
            }
        }
        return true;
    }
}
