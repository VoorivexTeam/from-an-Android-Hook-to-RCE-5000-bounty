package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C1370ld;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.t */
/* loaded from: classes.dex */
public final class C1471t extends C1370ld.a {

    /* renamed from: f */
    private final /* synthetic */ Bundle f6903f;

    /* renamed from: g */
    private final /* synthetic */ C1370ld f6904g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1471t(C1370ld c1370ld, Bundle bundle) {
        super(c1370ld);
        this.f6904g = c1370ld;
        this.f6903f = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.C1370ld.a
    /* renamed from: a */
    final void mo7506a() {
        InterfaceC1413ob interfaceC1413ob;
        interfaceC1413ob = this.f6904g.f6735g;
        interfaceC1413ob.setConditionalUserProperty(this.f6903f, this.f6736b);
    }
}
