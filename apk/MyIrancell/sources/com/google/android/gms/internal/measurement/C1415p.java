package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1370ld;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.p */
/* loaded from: classes.dex */
public final class C1415p extends C1370ld.a {

    /* renamed from: f */
    private final /* synthetic */ boolean f6826f;

    /* renamed from: g */
    private final /* synthetic */ C1370ld f6827g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1415p(C1370ld c1370ld, boolean z) {
        super(c1370ld);
        this.f6827g = c1370ld;
        this.f6826f = z;
    }

    @Override // com.google.android.gms.internal.measurement.C1370ld.a
    /* renamed from: a */
    final void mo7506a() {
        InterfaceC1413ob interfaceC1413ob;
        interfaceC1413ob = this.f6827g.f6735g;
        interfaceC1413ob.setDataCollectionEnabled(this.f6826f);
    }
}
