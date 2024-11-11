package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C1370ld;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.h */
/* loaded from: classes.dex */
public final class C1296h extends C1370ld.a {

    /* renamed from: f */
    private final /* synthetic */ BinderC1381m9 f6632f;

    /* renamed from: g */
    private final /* synthetic */ C1370ld f6633g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1296h(C1370ld c1370ld, BinderC1381m9 binderC1381m9) {
        super(c1370ld);
        this.f6633g = c1370ld;
        this.f6632f = binderC1381m9;
    }

    @Override // com.google.android.gms.internal.measurement.C1370ld.a
    /* renamed from: a */
    final void mo7506a() {
        InterfaceC1413ob interfaceC1413ob;
        interfaceC1413ob = this.f6633g.f6735g;
        interfaceC1413ob.getCachedAppInstanceId(this.f6632f);
    }

    @Override // com.google.android.gms.internal.measurement.C1370ld.a
    /* renamed from: b */
    protected final void mo7703b() {
        this.f6632f.mo7833a((Bundle) null);
    }
}
