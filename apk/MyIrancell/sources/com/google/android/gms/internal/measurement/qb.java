package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class qb implements mb {
    private static final x1<Boolean> a;
    private static final x1<Boolean> b;

    static {
        d2 d2Var = new d2(u1.a("com.google.android.gms.measurement"));
        a = d2Var.a("measurement.personalized_ads_signals_collection_enabled", true);
        b = d2Var.a("measurement.personalized_ads_property_translation_enabled", true);
    }

    @Override // com.google.android.gms.internal.measurement.mb
    public final boolean zza() {
        return a.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.mb
    public final boolean zzb() {
        return b.b().booleanValue();
    }
}
