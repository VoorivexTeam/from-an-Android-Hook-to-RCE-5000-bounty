package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1370ld;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.c */
/* loaded from: classes.dex */
public final class C1221c extends C1370ld.a {

    /* renamed from: f */
    private final /* synthetic */ String f6533f;

    /* renamed from: g */
    private final /* synthetic */ C1370ld f6534g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1221c(C1370ld c1370ld, String str) {
        super(c1370ld);
        this.f6534g = c1370ld;
        this.f6533f = str;
    }

    @Override // com.google.android.gms.internal.measurement.C1370ld.a
    /* renamed from: a */
    final void mo7506a() {
        InterfaceC1413ob interfaceC1413ob;
        interfaceC1413ob = this.f6534g.f6735g;
        interfaceC1413ob.setUserId(this.f6533f, this.f6736b);
    }
}
