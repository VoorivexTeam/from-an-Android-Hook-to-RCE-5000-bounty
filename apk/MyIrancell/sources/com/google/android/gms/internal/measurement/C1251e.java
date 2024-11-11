package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.internal.measurement.C1370ld;
import p000.BinderC2521gp;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.e */
/* loaded from: classes.dex */
public final class C1251e extends C1370ld.a {

    /* renamed from: f */
    private final /* synthetic */ Activity f6577f;

    /* renamed from: g */
    private final /* synthetic */ String f6578g;

    /* renamed from: h */
    private final /* synthetic */ String f6579h;

    /* renamed from: i */
    private final /* synthetic */ C1370ld f6580i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1251e(C1370ld c1370ld, Activity activity, String str, String str2) {
        super(c1370ld);
        this.f6580i = c1370ld;
        this.f6577f = activity;
        this.f6578g = str;
        this.f6579h = str2;
    }

    @Override // com.google.android.gms.internal.measurement.C1370ld.a
    /* renamed from: a */
    final void mo7506a() {
        InterfaceC1413ob interfaceC1413ob;
        interfaceC1413ob = this.f6580i.f6735g;
        interfaceC1413ob.setCurrentScreen(BinderC2521gp.m12036a(this.f6577f), this.f6578g, this.f6579h, this.f6736b);
    }
}
