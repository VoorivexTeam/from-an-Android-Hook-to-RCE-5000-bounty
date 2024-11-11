package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C1370ld;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.nd */
/* loaded from: classes.dex */
public final class C1400nd extends C1370ld.a {

    /* renamed from: f */
    private final /* synthetic */ String f6777f;

    /* renamed from: g */
    private final /* synthetic */ String f6778g;

    /* renamed from: h */
    private final /* synthetic */ Bundle f6779h;

    /* renamed from: i */
    private final /* synthetic */ C1370ld f6780i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1400nd(C1370ld c1370ld, String str, String str2, Bundle bundle) {
        super(c1370ld);
        this.f6780i = c1370ld;
        this.f6777f = str;
        this.f6778g = str2;
        this.f6779h = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.C1370ld.a
    /* renamed from: a */
    final void mo7506a() {
        InterfaceC1413ob interfaceC1413ob;
        interfaceC1413ob = this.f6780i.f6735g;
        interfaceC1413ob.clearConditionalUserProperty(this.f6777f, this.f6778g, this.f6779h);
    }
}
