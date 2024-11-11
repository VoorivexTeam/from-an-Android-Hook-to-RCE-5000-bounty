package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.internal.measurement.ld;
import defpackage.gp;

/* loaded from: classes.dex */
final class z extends ld.a {
    private final /* synthetic */ Activity f;
    private final /* synthetic */ ld.b g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ld.b bVar, Activity activity) {
        super(ld.this);
        this.g = bVar;
        this.f = activity;
    }

    @Override // com.google.android.gms.internal.measurement.ld.a
    final void a() {
        ob obVar;
        obVar = ld.this.g;
        obVar.onActivityDestroyed(gp.a(this.f), this.c);
    }
}
