package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.internal.measurement.ld;
import defpackage.gp;

/* loaded from: classes.dex */
final class a0 extends ld.a {
    private final /* synthetic */ Activity f;
    private final /* synthetic */ m9 g;
    private final /* synthetic */ ld.b h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ld.b bVar, Activity activity, m9 m9Var) {
        super(ld.this);
        this.h = bVar;
        this.f = activity;
        this.g = m9Var;
    }

    @Override // com.google.android.gms.internal.measurement.ld.a
    final void a() {
        ob obVar;
        obVar = ld.this.g;
        obVar.onActivitySaveInstanceState(gp.a(this.f), this.g, this.c);
    }
}
