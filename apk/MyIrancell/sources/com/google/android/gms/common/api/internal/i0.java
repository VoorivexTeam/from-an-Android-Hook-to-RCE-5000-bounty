package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
final class i0 extends y0 {
    private final /* synthetic */ ConnectionResult b;
    private final /* synthetic */ f0 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(f0 f0Var, w0 w0Var, ConnectionResult connectionResult) {
        super(w0Var);
        this.c = f0Var;
        this.b = connectionResult;
    }

    @Override // com.google.android.gms.common.api.internal.y0
    @GuardedBy("mLock")
    public final void a() {
        this.c.d.b(this.b);
    }
}
