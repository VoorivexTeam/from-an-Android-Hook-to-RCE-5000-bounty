package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.g9 */
/* loaded from: classes.dex */
public final class C1742g9 {

    /* renamed from: a */
    private long f7579a;

    /* renamed from: b */
    private long f7580b;

    /* renamed from: c */
    private final AbstractC1732g f7581c;

    /* renamed from: d */
    private final /* synthetic */ C1936x8 f7582d;

    public C1742g9(C1936x8 c1936x8) {
        this.f7582d = c1936x8;
        this.f7581c = new C1778j9(this, this.f7582d.f7550a);
        long mo7376b = c1936x8.mo9321h().mo7376b();
        this.f7579a = mo7376b;
        this.f7580b = mo7376b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final void m9351c() {
        this.f7582d.mo9194c();
        m9354a(false, false, this.f7582d.mo9321h().mo7376b());
        this.f7582d.m9196o().m9900a(this.f7582d.mo9321h().mo7376b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m9352a() {
        this.f7581c.m9332c();
        this.f7579a = 0L;
        this.f7580b = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m9353a(long j) {
        this.f7582d.mo9194c();
        this.f7581c.m9332c();
        this.f7579a = j;
        this.f7580b = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d8, code lost:
    
        if (r8 == false) goto L28;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m9354a(boolean r7, boolean r8, long r9) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1742g9.m9354a(boolean, boolean, long):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final long m9355b() {
        long mo7376b = this.f7582d.mo9321h().mo7376b();
        long j = mo7376b - this.f7580b;
        this.f7580b = mo7376b;
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m9356b(long j) {
        this.f7581c.m9332c();
        if (this.f7579a != 0) {
            this.f7582d.m9323j().f8041w.m9793a(this.f7582d.m9323j().f8041w.m9792a() + (j - this.f7579a));
        }
    }
}
