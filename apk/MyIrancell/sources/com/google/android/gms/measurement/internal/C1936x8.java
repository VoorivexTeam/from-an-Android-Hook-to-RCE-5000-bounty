package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.HandlerC1365l8;

/* renamed from: com.google.android.gms.measurement.internal.x8 */
/* loaded from: classes.dex */
public final class C1936x8 extends AbstractC1688c3 {

    /* renamed from: c */
    private Handler f8177c;

    /* renamed from: d */
    protected C1766i9 f8178d;

    /* renamed from: e */
    protected C1742g9 f8179e;

    /* renamed from: f */
    private C1694c9 f8180f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1936x8(C1774j5 c1774j5) {
        super(c1774j5);
        this.f8178d = new C1766i9(this);
        this.f8179e = new C1742g9(this);
        this.f8180f = new C1694c9(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public final void m9878C() {
        mo9194c();
        if (this.f8177c == null) {
            this.f8177c = new HandlerC1365l8(Looper.getMainLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m9879a(long j) {
        mo9194c();
        m9878C();
        mo9324k().m9304B().m9366a("Activity resumed, time", Long.valueOf(j));
        this.f8180f.m9124a();
        this.f8179e.m9353a(j);
        C1766i9 c1766i9 = this.f8178d;
        c1766i9.f7637a.mo9194c();
        if (c1766i9.f7637a.f7550a.m9411c()) {
            if (c1766i9.f7637a.m9326m().m9480a(C1828o.f7834S)) {
                c1766i9.f7637a.m9323j().f8043y.m9794a(false);
            }
            c1766i9.m9381a(c1766i9.f7637a.mo9321h().mo7375a(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final void m9883b(long j) {
        mo9194c();
        m9878C();
        mo9324k().m9304B().m9366a("Activity paused, time", Long.valueOf(j));
        this.f8180f.m9125b();
        this.f8179e.m9356b(j);
        C1766i9 c1766i9 = this.f8178d;
        if (c1766i9.f7637a.m9326m().m9480a(C1828o.f7834S)) {
            c1766i9.f7637a.m9323j().f8043y.m9794a(true);
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1688c3
    /* renamed from: A */
    protected final boolean mo9090A() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B */
    public final void m9885B() {
        mo9320g().m9344a(new RunnableC1670a9(this, mo9321h().mo7376b()));
    }

    /* renamed from: a */
    public final boolean m9886a(boolean z, boolean z2, long j) {
        return this.f8179e.m9354a(z, z2, j);
    }
}
