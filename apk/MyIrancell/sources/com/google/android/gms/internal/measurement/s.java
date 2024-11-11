package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.ld;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s extends ld.a {
    private final /* synthetic */ Long f;
    private final /* synthetic */ String g;
    private final /* synthetic */ String h;
    private final /* synthetic */ Bundle i;
    private final /* synthetic */ boolean j;
    private final /* synthetic */ boolean k;
    private final /* synthetic */ ld l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ld ldVar, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(ldVar);
        this.l = ldVar;
        this.f = l;
        this.g = str;
        this.h = str2;
        this.i = bundle;
        this.j = z;
        this.k = z2;
    }

    @Override // com.google.android.gms.internal.measurement.ld.a
    final void a() {
        ob obVar;
        Long l = this.f;
        long longValue = l == null ? this.b : l.longValue();
        obVar = this.l.g;
        obVar.logEvent(this.g, this.h, this.i, this.j, this.k, longValue);
    }
}
