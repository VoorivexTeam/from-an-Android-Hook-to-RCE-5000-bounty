package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.ld;
import defpackage.gp;

/* loaded from: classes.dex */
final class u extends ld.a {
    private final /* synthetic */ Activity f;
    private final /* synthetic */ Bundle g;
    private final /* synthetic */ ld.b h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ld.b bVar, Activity activity, Bundle bundle) {
        super(ld.this);
        this.h = bVar;
        this.f = activity;
        this.g = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.ld.a
    final void a() {
        ob obVar;
        obVar = ld.this.g;
        obVar.onActivityCreated(gp.a(this.f), this.g, this.c);
    }
}
