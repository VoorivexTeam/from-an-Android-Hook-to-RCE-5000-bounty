package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C1370ld;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.k */
/* loaded from: classes.dex */
public final class C1341k extends C1370ld.a {

    /* renamed from: f */
    private final /* synthetic */ BinderC1381m9 f6691f;

    /* renamed from: g */
    private final /* synthetic */ C1370ld f6692g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1341k(C1370ld c1370ld, BinderC1381m9 binderC1381m9) {
        super(c1370ld);
        this.f6692g = c1370ld;
        this.f6691f = binderC1381m9;
    }

    @Override // com.google.android.gms.internal.measurement.C1370ld.a
    /* renamed from: a */
    final void mo7506a() {
        InterfaceC1413ob interfaceC1413ob;
        interfaceC1413ob = this.f6692g.f6735g;
        interfaceC1413ob.generateEventId(this.f6691f);
    }

    @Override // com.google.android.gms.internal.measurement.C1370ld.a
    /* renamed from: b */
    protected final void mo7703b() {
        this.f6691f.mo7833a((Bundle) null);
    }
}
