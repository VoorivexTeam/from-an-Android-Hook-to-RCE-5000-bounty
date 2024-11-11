package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class p9 extends m9 {
    private boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p9(o9 o9Var) {
        super(o9Var);
        this.b.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean q() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r() {
        if (!q()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void s() {
        if (this.c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        t();
        this.b.s();
        this.c = true;
    }

    protected abstract boolean t();
}
