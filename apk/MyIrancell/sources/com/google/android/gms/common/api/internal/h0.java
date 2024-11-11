package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.d;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
final class h0 extends y0 {
    private final /* synthetic */ d.c b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(f0 f0Var, w0 w0Var, d.c cVar) {
        super(w0Var);
        this.b = cVar;
    }

    @Override // com.google.android.gms.common.api.internal.y0
    @GuardedBy("mLock")
    public final void a() {
        this.b.a(new ConnectionResult(16, null));
    }
}
