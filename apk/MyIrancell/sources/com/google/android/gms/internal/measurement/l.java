package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.ld;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l extends ld.a {
    private final /* synthetic */ String f;
    private final /* synthetic */ String g;
    private final /* synthetic */ boolean h;
    private final /* synthetic */ m9 i;
    private final /* synthetic */ ld j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ld ldVar, String str, String str2, boolean z, m9 m9Var) {
        super(ldVar);
        this.j = ldVar;
        this.f = str;
        this.g = str2;
        this.h = z;
        this.i = m9Var;
    }

    @Override // com.google.android.gms.internal.measurement.ld.a
    final void a() {
        ob obVar;
        obVar = this.j.g;
        obVar.getUserProperties(this.f, this.g, this.h, this.i);
    }

    @Override // com.google.android.gms.internal.measurement.ld.a
    protected final void b() {
        this.i.a((Bundle) null);
    }
}
