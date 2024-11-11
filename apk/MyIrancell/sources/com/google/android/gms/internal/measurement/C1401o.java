package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C1370ld;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.o */
/* loaded from: classes.dex */
public final class C1401o extends C1370ld.a {

    /* renamed from: f */
    private final /* synthetic */ String f6781f;

    /* renamed from: g */
    private final /* synthetic */ BinderC1381m9 f6782g;

    /* renamed from: h */
    private final /* synthetic */ C1370ld f6783h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1401o(C1370ld c1370ld, String str, BinderC1381m9 binderC1381m9) {
        super(c1370ld);
        this.f6783h = c1370ld;
        this.f6781f = str;
        this.f6782g = binderC1381m9;
    }

    @Override // com.google.android.gms.internal.measurement.C1370ld.a
    /* renamed from: a */
    final void mo7506a() {
        InterfaceC1413ob interfaceC1413ob;
        interfaceC1413ob = this.f6783h.f6735g;
        interfaceC1413ob.getMaxUserProperties(this.f6781f, this.f6782g);
    }

    @Override // com.google.android.gms.internal.measurement.C1370ld.a
    /* renamed from: b */
    protected final void mo7703b() {
        this.f6782g.mo7833a((Bundle) null);
    }
}
