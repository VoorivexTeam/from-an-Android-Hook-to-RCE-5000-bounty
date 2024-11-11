package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.d6 */
/* loaded from: classes.dex */
public abstract class AbstractC1703d6 extends C1727f6 {

    /* renamed from: b */
    private boolean f7465b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1703d6(C1774j5 c1774j5) {
        super(c1774j5);
        this.f7550a.m9407a(this);
    }

    /* renamed from: n */
    protected void mo9219n() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public final void m9220o() {
        if (!m9223s()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: p */
    public final void m9221p() {
        if (this.f7465b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (mo9123r()) {
            return;
        }
        this.f7550a.m9416m();
        this.f7465b = true;
    }

    /* renamed from: q */
    public final void m9222q() {
        if (this.f7465b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo9219n();
        this.f7550a.m9416m();
        this.f7465b = true;
    }

    /* renamed from: r */
    protected abstract boolean mo9123r();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public final boolean m9223s() {
        return this.f7465b;
    }
}
