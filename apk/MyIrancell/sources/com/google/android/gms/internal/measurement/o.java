package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.ld;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o extends ld.a {
    private final /* synthetic */ String f;
    private final /* synthetic */ m9 g;
    private final /* synthetic */ ld h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ld ldVar, String str, m9 m9Var) {
        super(ldVar);
        this.h = ldVar;
        this.f = str;
        this.g = m9Var;
    }

    @Override // com.google.android.gms.internal.measurement.ld.a
    final void a() {
        ob obVar;
        obVar = this.h.g;
        obVar.getMaxUserProperties(this.f, this.g);
    }

    @Override // com.google.android.gms.internal.measurement.ld.a
    protected final void b() {
        this.g.a((Bundle) null);
    }
}
