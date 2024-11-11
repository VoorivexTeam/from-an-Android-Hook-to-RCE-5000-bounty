package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1370ld;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.f */
/* loaded from: classes.dex */
public final class C1266f extends C1370ld.a {

    /* renamed from: f */
    private final /* synthetic */ String f6606f;

    /* renamed from: g */
    private final /* synthetic */ C1370ld f6607g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1266f(C1370ld c1370ld, String str) {
        super(c1370ld);
        this.f6607g = c1370ld;
        this.f6606f = str;
    }

    @Override // com.google.android.gms.internal.measurement.C1370ld.a
    /* renamed from: a */
    final void mo7506a() {
        InterfaceC1413ob interfaceC1413ob;
        interfaceC1413ob = this.f6607g.f6735g;
        interfaceC1413ob.beginAdUnitExposure(this.f6606f, this.f6737c);
    }
}
