package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.ld;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f extends ld.a {
    private final /* synthetic */ String f;
    private final /* synthetic */ ld g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ld ldVar, String str) {
        super(ldVar);
        this.g = ldVar;
        this.f = str;
    }

    @Override // com.google.android.gms.internal.measurement.ld.a
    final void a() {
        ob obVar;
        obVar = this.g.g;
        obVar.beginAdUnitExposure(this.f, this.c);
    }
}
