package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.ld;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t extends ld.a {
    private final /* synthetic */ Bundle f;
    private final /* synthetic */ ld g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ld ldVar, Bundle bundle) {
        super(ldVar);
        this.g = ldVar;
        this.f = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.ld.a
    final void a() {
        ob obVar;
        obVar = this.g.g;
        obVar.setConditionalUserProperty(this.f, this.b);
    }
}
