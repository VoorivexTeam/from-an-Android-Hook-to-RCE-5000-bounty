package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.ld;
import defpackage.gp;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q extends ld.a {
    private final /* synthetic */ String f;
    private final /* synthetic */ String g;
    private final /* synthetic */ Object h;
    private final /* synthetic */ boolean i;
    private final /* synthetic */ ld j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ld ldVar, String str, String str2, Object obj, boolean z) {
        super(ldVar);
        this.j = ldVar;
        this.f = str;
        this.g = str2;
        this.h = obj;
        this.i = z;
    }

    @Override // com.google.android.gms.internal.measurement.ld.a
    final void a() {
        ob obVar;
        obVar = this.j.g;
        obVar.setUserProperty(this.f, this.g, gp.a(this.h), this.i, this.b);
    }
}
