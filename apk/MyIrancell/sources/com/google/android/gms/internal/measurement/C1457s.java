package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C1370ld;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.s */
/* loaded from: classes.dex */
public final class C1457s extends C1370ld.a {

    /* renamed from: f */
    private final /* synthetic */ Long f6879f;

    /* renamed from: g */
    private final /* synthetic */ String f6880g;

    /* renamed from: h */
    private final /* synthetic */ String f6881h;

    /* renamed from: i */
    private final /* synthetic */ Bundle f6882i;

    /* renamed from: j */
    private final /* synthetic */ boolean f6883j;

    /* renamed from: k */
    private final /* synthetic */ boolean f6884k;

    /* renamed from: l */
    private final /* synthetic */ C1370ld f6885l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1457s(C1370ld c1370ld, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(c1370ld);
        this.f6885l = c1370ld;
        this.f6879f = l;
        this.f6880g = str;
        this.f6881h = str2;
        this.f6882i = bundle;
        this.f6883j = z;
        this.f6884k = z2;
    }

    @Override // com.google.android.gms.internal.measurement.C1370ld.a
    /* renamed from: a */
    final void mo7506a() {
        InterfaceC1413ob interfaceC1413ob;
        Long l = this.f6879f;
        long longValue = l == null ? this.f6736b : l.longValue();
        interfaceC1413ob = this.f6885l.f6735g;
        interfaceC1413ob.logEvent(this.f6880g, this.f6881h, this.f6882i, this.f6883j, this.f6884k, longValue);
    }
}
