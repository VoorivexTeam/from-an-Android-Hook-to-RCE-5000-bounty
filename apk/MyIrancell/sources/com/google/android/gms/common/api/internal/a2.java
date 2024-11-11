package com.google.android.gms.common.api.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a2 implements c2 {
    private final /* synthetic */ b2 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a2(b2 b2Var) {
        this.a = b2Var;
    }

    @Override // com.google.android.gms.common.api.internal.c2
    public final void a(BasePendingResult<?> basePendingResult) {
        this.a.a.remove(basePendingResult);
        basePendingResult.d();
    }
}
