package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class xa implements ua {
    private static final x1<Boolean> a;
    private static final x1<Boolean> b;

    static {
        d2 d2Var = new d2(u1.a("com.google.android.gms.measurement"));
        a = d2Var.a("measurement.collection.efficient_engagement_reporting_enabled", false);
        b = d2Var.a("measurement.collection.redundant_engagement_removal_enabled", false);
    }

    @Override // com.google.android.gms.internal.measurement.ua
    public final boolean zza() {
        return a.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.ua
    public final boolean zzb() {
        return b.b().booleanValue();
    }
}
