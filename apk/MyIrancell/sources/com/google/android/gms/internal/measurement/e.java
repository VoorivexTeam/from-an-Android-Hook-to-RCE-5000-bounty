package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.internal.measurement.ld;
import defpackage.gp;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e extends ld.a {
    private final /* synthetic */ Activity f;
    private final /* synthetic */ String g;
    private final /* synthetic */ String h;
    private final /* synthetic */ ld i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ld ldVar, Activity activity, String str, String str2) {
        super(ldVar);
        this.i = ldVar;
        this.f = activity;
        this.g = str;
        this.h = str2;
    }

    @Override // com.google.android.gms.internal.measurement.ld.a
    final void a() {
        ob obVar;
        obVar = this.i.g;
        obVar.setCurrentScreen(gp.a(this.f), this.g, this.h, this.b);
    }
}
