package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class g8 extends g {
    private final /* synthetic */ w7 e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8(w7 w7Var, h6 h6Var) {
        super(h6Var);
        this.e = w7Var;
    }

    @Override // com.google.android.gms.measurement.internal.g
    public final void a() {
        this.e.k().w().a("Tasks have been queued for a long time");
    }
}
