package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.ld;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p extends ld.a {
    private final /* synthetic */ boolean f;
    private final /* synthetic */ ld g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ld ldVar, boolean z) {
        super(ldVar);
        this.g = ldVar;
        this.f = z;
    }

    @Override // com.google.android.gms.internal.measurement.ld.a
    final void a() {
        ob obVar;
        obVar = this.g.g;
        obVar.setDataCollectionEnabled(this.f);
    }
}
