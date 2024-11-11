package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.internal.measurement.C1370ld;
import p000.BinderC2521gp;

/* renamed from: com.google.android.gms.internal.measurement.a0 */
/* loaded from: classes.dex */
final class C1192a0 extends C1370ld.a {

    /* renamed from: f */
    private final /* synthetic */ Activity f6483f;

    /* renamed from: g */
    private final /* synthetic */ BinderC1381m9 f6484g;

    /* renamed from: h */
    private final /* synthetic */ C1370ld.b f6485h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1192a0(C1370ld.b bVar, Activity activity, BinderC1381m9 binderC1381m9) {
        super(C1370ld.this);
        this.f6485h = bVar;
        this.f6483f = activity;
        this.f6484g = binderC1381m9;
    }

    @Override // com.google.android.gms.internal.measurement.C1370ld.a
    /* renamed from: a */
    final void mo7506a() {
        InterfaceC1413ob interfaceC1413ob;
        interfaceC1413ob = C1370ld.this.f6735g;
        interfaceC1413ob.onActivitySaveInstanceState(BinderC2521gp.m12036a(this.f6483f), this.f6484g, this.f6737c);
    }
}
