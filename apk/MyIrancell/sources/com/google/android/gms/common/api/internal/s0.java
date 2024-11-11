package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.f;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class s0 implements f.b {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ q b;
    private final /* synthetic */ q0 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s0(q0 q0Var, AtomicReference atomicReference, q qVar) {
        this.c = q0Var;
        this.a = atomicReference;
        this.b = qVar;
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void a(int i) {
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void b(Bundle bundle) {
        this.c.a((com.google.android.gms.common.api.f) this.a.get(), this.b, true);
    }
}
