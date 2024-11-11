package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1370ld;
import p000.BinderC2521gp;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.n */
/* loaded from: classes.dex */
public final class C1386n extends C1370ld.a {

    /* renamed from: g */
    private final /* synthetic */ String f6758g;

    /* renamed from: h */
    private final /* synthetic */ Object f6759h;

    /* renamed from: k */
    private final /* synthetic */ C1370ld f6762k;

    /* renamed from: f */
    private final /* synthetic */ int f6757f = 5;

    /* renamed from: i */
    private final /* synthetic */ Object f6760i = null;

    /* renamed from: j */
    private final /* synthetic */ Object f6761j = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1386n(C1370ld c1370ld, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.f6762k = c1370ld;
        this.f6758g = str;
        this.f6759h = obj;
    }

    @Override // com.google.android.gms.internal.measurement.C1370ld.a
    /* renamed from: a */
    final void mo7506a() {
        InterfaceC1413ob interfaceC1413ob;
        interfaceC1413ob = this.f6762k.f6735g;
        interfaceC1413ob.logHealthData(this.f6757f, this.f6758g, BinderC2521gp.m12036a(this.f6759h), BinderC2521gp.m12036a(this.f6760i), BinderC2521gp.m12036a(this.f6761j));
    }
}
