package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class d6 extends f6 {
    private boolean b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d6(j5 j5Var) {
        super(j5Var);
        this.a.a(this);
    }

    protected void n() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o() {
        if (!s()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void p() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (r()) {
            return;
        }
        this.a.m();
        this.b = true;
    }

    public final void q() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        n();
        this.a.m();
        this.b = true;
    }

    protected abstract boolean r();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean s() {
        return this.b;
    }
}
