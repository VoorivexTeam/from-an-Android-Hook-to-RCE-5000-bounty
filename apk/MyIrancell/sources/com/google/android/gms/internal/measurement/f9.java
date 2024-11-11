package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class f9 implements c9 {
    private static final x1<Boolean> a;

    static {
        d2 d2Var = new d2(u1.a("com.google.android.gms.measurement"));
        a = d2Var.a("measurement.gold.enhanced_ecommerce.format_logs", false);
        d2Var.a("measurement.gold.enhanced_ecommerce.nested_complex_events", false);
    }

    @Override // com.google.android.gms.internal.measurement.c9
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.c9
    public final boolean zzb() {
        return a.b().booleanValue();
    }
}
