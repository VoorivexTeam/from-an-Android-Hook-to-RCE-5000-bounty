package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1370ld;
import p000.BinderC2521gp;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.q */
/* loaded from: classes.dex */
public final class C1429q extends C1370ld.a {

    /* renamed from: f */
    private final /* synthetic */ String f6838f;

    /* renamed from: g */
    private final /* synthetic */ String f6839g;

    /* renamed from: h */
    private final /* synthetic */ Object f6840h;

    /* renamed from: i */
    private final /* synthetic */ boolean f6841i;

    /* renamed from: j */
    private final /* synthetic */ C1370ld f6842j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1429q(C1370ld c1370ld, String str, String str2, Object obj, boolean z) {
        super(c1370ld);
        this.f6842j = c1370ld;
        this.f6838f = str;
        this.f6839g = str2;
        this.f6840h = obj;
        this.f6841i = z;
    }

    @Override // com.google.android.gms.internal.measurement.C1370ld.a
    /* renamed from: a */
    final void mo7506a() {
        InterfaceC1413ob interfaceC1413ob;
        interfaceC1413ob = this.f6842j.f6735g;
        interfaceC1413ob.setUserProperty(this.f6838f, this.f6839g, BinderC2521gp.m12036a(this.f6840h), this.f6841i, this.f6736b);
    }
}
