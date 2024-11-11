package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.p9 */
/* loaded from: classes.dex */
public abstract class AbstractC1849p9 extends C1814m9 {

    /* renamed from: c */
    private boolean f7971c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1849p9(C1838o9 c1838o9) {
        super(c1838o9);
        this.f7776b.m9670a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final boolean m9754q() {
        return this.f7971c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public final void m9755r() {
        if (!m9754q()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: s */
    public final void m9756s() {
        if (this.f7971c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo9129t();
        this.f7776b.m9698s();
        this.f7971c = true;
    }

    /* renamed from: t */
    protected abstract boolean mo9129t();
}
