package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class ea implements ba {
    private static final x1<Boolean> a;

    static {
        d2 d2Var = new d2(u1.a("com.google.android.gms.measurement"));
        a = d2Var.a("measurement.service.fix_gmp_version", false);
        d2Var.a("measurement.id.service.fix_gmp_version", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.ba
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.ba
    public final boolean zzb() {
        return a.b().booleanValue();
    }
}
