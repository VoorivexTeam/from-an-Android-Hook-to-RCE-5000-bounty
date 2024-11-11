package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.internal.measurement.HandlerC1365l8;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.g */
/* loaded from: classes.dex */
public abstract class AbstractC1732g {

    /* renamed from: d */
    private static volatile Handler f7558d;

    /* renamed from: a */
    private final InterfaceC1751h6 f7559a;

    /* renamed from: b */
    private final Runnable f7560b;

    /* renamed from: c */
    private volatile long f7561c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1732g(InterfaceC1751h6 interfaceC1751h6) {
        C1057u.m7286a(interfaceC1751h6);
        this.f7559a = interfaceC1751h6;
        this.f7560b = new RunnableC1768j(this, interfaceC1751h6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ long m9327a(AbstractC1732g abstractC1732g, long j) {
        abstractC1732g.f7561c = 0L;
        return 0L;
    }

    /* renamed from: d */
    private final Handler m9328d() {
        Handler handler;
        if (f7558d != null) {
            return f7558d;
        }
        synchronized (AbstractC1732g.class) {
            if (f7558d == null) {
                f7558d = new HandlerC1365l8(this.f7559a.mo9325l().getMainLooper());
            }
            handler = f7558d;
        }
        return handler;
    }

    /* renamed from: a */
    public abstract void mo9329a();

    /* renamed from: a */
    public final void m9330a(long j) {
        m9332c();
        if (j >= 0) {
            this.f7561c = this.f7559a.mo9321h().mo7375a();
            if (m9328d().postDelayed(this.f7560b, j)) {
                return;
            }
            this.f7559a.mo9324k().m9309t().m9366a("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    /* renamed from: b */
    public final boolean m9331b() {
        return this.f7561c != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m9332c() {
        this.f7561c = 0L;
        m9328d().removeCallbacks(this.f7560b);
    }
}
