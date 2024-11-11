package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C1370ld;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.l */
/* loaded from: classes.dex */
public final class C1356l extends C1370ld.a {

    /* renamed from: f */
    private final /* synthetic */ String f6706f;

    /* renamed from: g */
    private final /* synthetic */ String f6707g;

    /* renamed from: h */
    private final /* synthetic */ boolean f6708h;

    /* renamed from: i */
    private final /* synthetic */ BinderC1381m9 f6709i;

    /* renamed from: j */
    private final /* synthetic */ C1370ld f6710j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1356l(C1370ld c1370ld, String str, String str2, boolean z, BinderC1381m9 binderC1381m9) {
        super(c1370ld);
        this.f6710j = c1370ld;
        this.f6706f = str;
        this.f6707g = str2;
        this.f6708h = z;
        this.f6709i = binderC1381m9;
    }

    @Override // com.google.android.gms.internal.measurement.C1370ld.a
    /* renamed from: a */
    final void mo7506a() {
        InterfaceC1413ob interfaceC1413ob;
        interfaceC1413ob = this.f6710j.f6735g;
        interfaceC1413ob.getUserProperties(this.f6706f, this.f6707g, this.f6708h, this.f6709i);
    }

    @Override // com.google.android.gms.internal.measurement.C1370ld.a
    /* renamed from: b */
    protected final void mo7703b() {
        this.f6709i.mo7833a((Bundle) null);
    }
}
