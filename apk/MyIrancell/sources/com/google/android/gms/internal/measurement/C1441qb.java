package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.qb */
/* loaded from: classes.dex */
public final class C1441qb implements InterfaceC1383mb {

    /* renamed from: a */
    private static final AbstractC1529x1<Boolean> f6851a;

    /* renamed from: b */
    private static final AbstractC1529x1<Boolean> f6852b;

    static {
        C1239d2 c1239d2 = new C1239d2(C1487u1.m8491a("com.google.android.gms.measurement"));
        f6851a = c1239d2.m7729a("measurement.personalized_ads_signals_collection_enabled", true);
        f6852b = c1239d2.m7729a("measurement.personalized_ads_property_translation_enabled", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1383mb
    public final boolean zza() {
        return f6851a.m8878b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1383mb
    public final boolean zzb() {
        return f6852b.m8878b().booleanValue();
    }
}
