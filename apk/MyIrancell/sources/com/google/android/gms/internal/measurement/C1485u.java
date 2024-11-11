package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C1370ld;
import p000.BinderC2521gp;

/* renamed from: com.google.android.gms.internal.measurement.u */
/* loaded from: classes.dex */
final class C1485u extends C1370ld.a {

    /* renamed from: f */
    private final /* synthetic */ Activity f6946f;

    /* renamed from: g */
    private final /* synthetic */ Bundle f6947g;

    /* renamed from: h */
    private final /* synthetic */ C1370ld.b f6948h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1485u(C1370ld.b bVar, Activity activity, Bundle bundle) {
        super(C1370ld.this);
        this.f6948h = bVar;
        this.f6946f = activity;
        this.f6947g = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.C1370ld.a
    /* renamed from: a */
    final void mo7506a() {
        InterfaceC1413ob interfaceC1413ob;
        interfaceC1413ob = C1370ld.this.f6735g;
        interfaceC1413ob.onActivityCreated(BinderC2521gp.m12036a(this.f6946f), this.f6947g, this.f6737c);
    }
}
