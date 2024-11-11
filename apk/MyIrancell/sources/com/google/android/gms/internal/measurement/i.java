package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.ld;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i extends ld.a {
    private final /* synthetic */ m9 f;
    private final /* synthetic */ ld g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ld ldVar, m9 m9Var) {
        super(ldVar);
        this.g = ldVar;
        this.f = m9Var;
    }

    @Override // com.google.android.gms.internal.measurement.ld.a
    final void a() {
        ob obVar;
        obVar = this.g.g;
        obVar.getGmpAppId(this.f);
    }

    @Override // com.google.android.gms.internal.measurement.ld.a
    protected final void b() {
        this.f.a((Bundle) null);
    }
}
