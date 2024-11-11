package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.internal.measurement.C1370ld;
import p000.BinderC2521gp;

/* renamed from: com.google.android.gms.internal.measurement.v */
/* loaded from: classes.dex */
final class C1499v extends C1370ld.a {

    /* renamed from: f */
    private final /* synthetic */ Activity f6961f;

    /* renamed from: g */
    private final /* synthetic */ C1370ld.b f6962g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1499v(C1370ld.b bVar, Activity activity) {
        super(C1370ld.this);
        this.f6962g = bVar;
        this.f6961f = activity;
    }

    @Override // com.google.android.gms.internal.measurement.C1370ld.a
    /* renamed from: a */
    final void mo7506a() {
        InterfaceC1413ob interfaceC1413ob;
        interfaceC1413ob = C1370ld.this.f6735g;
        interfaceC1413ob.onActivityResumed(BinderC2521gp.m12036a(this.f6961f), this.f6737c);
    }
}
