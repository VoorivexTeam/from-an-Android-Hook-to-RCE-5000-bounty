package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C1370ld;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.d */
/* loaded from: classes.dex */
public final class C1236d extends C1370ld.a {

    /* renamed from: f */
    private final /* synthetic */ String f6553f;

    /* renamed from: g */
    private final /* synthetic */ String f6554g;

    /* renamed from: h */
    private final /* synthetic */ BinderC1381m9 f6555h;

    /* renamed from: i */
    private final /* synthetic */ C1370ld f6556i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1236d(C1370ld c1370ld, String str, String str2, BinderC1381m9 binderC1381m9) {
        super(c1370ld);
        this.f6556i = c1370ld;
        this.f6553f = str;
        this.f6554g = str2;
        this.f6555h = binderC1381m9;
    }

    @Override // com.google.android.gms.internal.measurement.C1370ld.a
    /* renamed from: a */
    final void mo7506a() {
        InterfaceC1413ob interfaceC1413ob;
        interfaceC1413ob = this.f6556i.f6735g;
        interfaceC1413ob.getConditionalUserProperties(this.f6553f, this.f6554g, this.f6555h);
    }

    @Override // com.google.android.gms.internal.measurement.C1370ld.a
    /* renamed from: b */
    protected final void mo7703b() {
        this.f6555h.mo7833a((Bundle) null);
    }
}
