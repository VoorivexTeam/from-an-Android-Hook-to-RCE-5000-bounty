package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC0864f;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p000.HandlerC2824jq;

/* renamed from: com.google.android.gms.common.internal.i */
/* loaded from: classes.dex */
public final class C1030i implements Handler.Callback {

    /* renamed from: a */
    private final a f6218a;

    /* renamed from: h */
    private final Handler f6225h;

    /* renamed from: b */
    private final ArrayList<AbstractC0864f.b> f6219b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<AbstractC0864f.b> f6220c = new ArrayList<>();

    /* renamed from: d */
    private final ArrayList<AbstractC0864f.c> f6221d = new ArrayList<>();

    /* renamed from: e */
    private volatile boolean f6222e = false;

    /* renamed from: f */
    private final AtomicInteger f6223f = new AtomicInteger(0);

    /* renamed from: g */
    private boolean f6224g = false;

    /* renamed from: i */
    private final Object f6226i = new Object();

    /* renamed from: com.google.android.gms.common.internal.i$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        boolean mo6825a();

        /* renamed from: q */
        Bundle mo6826q();
    }

    public C1030i(Looper looper, a aVar) {
        this.f6218a = aVar;
        this.f6225h = new HandlerC2824jq(looper, this);
    }

    /* renamed from: a */
    public final void m7150a() {
        this.f6222e = false;
        this.f6223f.incrementAndGet();
    }

    /* renamed from: a */
    public final void m7151a(int i) {
        C1057u.m7291a(this.f6225h, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f6225h.removeMessages(1);
        synchronized (this.f6226i) {
            this.f6224g = true;
            ArrayList arrayList = new ArrayList(this.f6219b);
            int i2 = this.f6223f.get();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                AbstractC0864f.b bVar = (AbstractC0864f.b) obj;
                if (!this.f6222e || this.f6223f.get() != i2) {
                    break;
                } else if (this.f6219b.contains(bVar)) {
                    bVar.mo6688a(i);
                }
            }
            this.f6220c.clear();
            this.f6224g = false;
        }
    }

    /* renamed from: a */
    public final void m7152a(Bundle bundle) {
        C1057u.m7291a(this.f6225h, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f6226i) {
            boolean z = true;
            C1057u.m7297b(!this.f6224g);
            this.f6225h.removeMessages(1);
            this.f6224g = true;
            if (this.f6220c.size() != 0) {
                z = false;
            }
            C1057u.m7297b(z);
            ArrayList arrayList = new ArrayList(this.f6219b);
            int i = this.f6223f.get();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                AbstractC0864f.b bVar = (AbstractC0864f.b) obj;
                if (!this.f6222e || !this.f6218a.mo6825a() || this.f6223f.get() != i) {
                    break;
                } else if (!this.f6220c.contains(bVar)) {
                    bVar.mo6689b(bundle);
                }
            }
            this.f6220c.clear();
            this.f6224g = false;
        }
    }

    /* renamed from: a */
    public final void m7153a(ConnectionResult connectionResult) {
        C1057u.m7291a(this.f6225h, "onConnectionFailure must only be called on the Handler thread");
        this.f6225h.removeMessages(1);
        synchronized (this.f6226i) {
            ArrayList arrayList = new ArrayList(this.f6221d);
            int i = this.f6223f.get();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                AbstractC0864f.c cVar = (AbstractC0864f.c) obj;
                if (this.f6222e && this.f6223f.get() == i) {
                    if (this.f6221d.contains(cVar)) {
                        cVar.mo6740a(connectionResult);
                    }
                }
                return;
            }
        }
    }

    /* renamed from: a */
    public final void m7154a(AbstractC0864f.b bVar) {
        C1057u.m7286a(bVar);
        synchronized (this.f6226i) {
            if (this.f6219b.contains(bVar)) {
                String valueOf = String.valueOf(bVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
                sb.append("registerConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                sb.toString();
            } else {
                this.f6219b.add(bVar);
            }
        }
        if (this.f6218a.mo6825a()) {
            Handler handler = this.f6225h;
            handler.sendMessage(handler.obtainMessage(1, bVar));
        }
    }

    /* renamed from: a */
    public final void m7155a(AbstractC0864f.c cVar) {
        C1057u.m7286a(cVar);
        synchronized (this.f6226i) {
            if (this.f6221d.contains(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                sb.toString();
            } else {
                this.f6221d.add(cVar);
            }
        }
    }

    /* renamed from: b */
    public final void m7156b() {
        this.f6222e = true;
    }

    /* renamed from: b */
    public final void m7157b(AbstractC0864f.c cVar) {
        C1057u.m7286a(cVar);
        synchronized (this.f6226i) {
            if (!this.f6221d.remove(cVar)) {
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
        AbstractC0864f.b bVar = (AbstractC0864f.b) message.obj;
        synchronized (this.f6226i) {
            if (this.f6222e && this.f6218a.mo6825a() && this.f6219b.contains(bVar)) {
                bVar.mo6689b(this.f6218a.mo6826q());
            }
        }
        return true;
    }
}
