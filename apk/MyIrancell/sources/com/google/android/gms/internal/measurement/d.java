package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.ld;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d extends ld.a {
    private final /* synthetic */ String f;
    private final /* synthetic */ String g;
    private final /* synthetic */ m9 h;
    private final /* synthetic */ ld i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ld ldVar, String str, String str2, m9 m9Var) {
        super(ldVar);
        this.i = ldVar;
        this.f = str;
        this.g = str2;
        this.h = m9Var;
    }

    @Override // com.google.android.gms.internal.measurement.ld.a
    final void a() {
        ob obVar;
        obVar = this.i.g;
        obVar.getConditionalUserProperties(this.f, this.g, this.h);
    }

    @Override // com.google.android.gms.internal.measurement.ld.a
    protected final void b() {
        this.h.a((Bundle) null);
    }
}
