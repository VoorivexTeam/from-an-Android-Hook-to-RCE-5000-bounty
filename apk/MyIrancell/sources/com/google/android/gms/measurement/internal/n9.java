package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n9 extends g {
    private final /* synthetic */ o9 e;
    private final /* synthetic */ k9 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(k9 k9Var, h6 h6Var, o9 o9Var) {
        super(h6Var);
        this.f = k9Var;
        this.e = o9Var;
    }

    @Override // com.google.android.gms.measurement.internal.g
    public final void a() {
        this.f.u();
        this.f.k().B().a("Starting upload from DelayedRunnable");
        this.e.q();
    }
}
