package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.internal.measurement.C1370ld;
import p000.BinderC2521gp;

/* renamed from: com.google.android.gms.internal.measurement.x */
/* loaded from: classes.dex */
final class C1527x extends C1370ld.a {

    /* renamed from: f */
    private final /* synthetic */ Activity f6991f;

    /* renamed from: g */
    private final /* synthetic */ C1370ld.b f6992g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1527x(C1370ld.b bVar, Activity activity) {
        super(C1370ld.this);
        this.f6992g = bVar;
        this.f6991f = activity;
    }

    @Override // com.google.android.gms.internal.measurement.C1370ld.a
    /* renamed from: a */
    final void mo7506a() {
        InterfaceC1413ob interfaceC1413ob;
        interfaceC1413ob = C1370ld.this.f6735g;
        interfaceC1413ob.onActivityStopped(BinderC2521gp.m12036a(this.f6991f), this.f6737c);
    }
}
