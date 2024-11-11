package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.ld;
import defpackage.gp;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n extends ld.a {
    private final /* synthetic */ String g;
    private final /* synthetic */ Object h;
    private final /* synthetic */ ld k;
    private final /* synthetic */ int f = 5;
    private final /* synthetic */ Object i = null;
    private final /* synthetic */ Object j = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ld ldVar, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.k = ldVar;
        this.g = str;
        this.h = obj;
    }

    @Override // com.google.android.gms.internal.measurement.ld.a
    final void a() {
        ob obVar;
        obVar = this.k.g;
        obVar.logHealthData(this.f, this.g, gp.a(this.h), gp.a(this.i), gp.a(this.j));
    }
}
