package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class z9 implements aa {
    private static final x1<Boolean> a;

    static {
        d2 d2Var = new d2(u1.a("com.google.android.gms.measurement"));
        a = d2Var.a("measurement.engagement_time_main_thread", false);
        d2Var.a("measurement.id.engagement_time_main_thread", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.aa
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.aa
    public final boolean zzb() {
        return a.b().booleanValue();
    }
}
