package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class c3 extends d4 {
    private boolean b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c3(j5 j5Var) {
        super(j5Var);
        this.a.a(this);
    }

    protected abstract boolean A();

    protected void v() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean w() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x() {
        if (!w()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void y() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (A()) {
            return;
        }
        this.a.m();
        this.b = true;
    }

    public final void z() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        v();
        this.a.m();
        this.b = true;
    }
}
