package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.xa */
/* loaded from: classes.dex */
public final class C1538xa implements InterfaceC1496ua {

    /* renamed from: a */
    private static final AbstractC1529x1<Boolean> f7007a;

    /* renamed from: b */
    private static final AbstractC1529x1<Boolean> f7008b;

    static {
        C1239d2 c1239d2 = new C1239d2(C1487u1.m8491a("com.google.android.gms.measurement"));
        f7007a = c1239d2.m7729a("measurement.collection.efficient_engagement_reporting_enabled", false);
        f7008b = c1239d2.m7729a("measurement.collection.redundant_engagement_removal_enabled", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1496ua
    public final boolean zza() {
        return f7007a.m8878b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1496ua
    public final boolean zzb() {
        return f7008b.m8878b().booleanValue();
    }
}
