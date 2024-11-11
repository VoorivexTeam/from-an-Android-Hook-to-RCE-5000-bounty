package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.c3 */
/* loaded from: classes.dex */
public abstract class AbstractC1688c3 extends C1701d4 {

    /* renamed from: b */
    private boolean f7418b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1688c3(C1774j5 c1774j5) {
        super(c1774j5);
        this.f7550a.m9406a(this);
    }

    /* renamed from: A */
    protected abstract boolean mo9090A();

    /* renamed from: v */
    protected void mo9108v() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public final boolean m9109w() {
        return this.f7418b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public final void m9110x() {
        if (!m9109w()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: y */
    public final void m9111y() {
        if (this.f7418b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (mo9090A()) {
            return;
        }
        this.f7550a.m9416m();
        this.f7418b = true;
    }

    /* renamed from: z */
    public final void m9112z() {
        if (this.f7418b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo9108v();
        this.f7550a.m9416m();
        this.f7418b = true;
    }
}
