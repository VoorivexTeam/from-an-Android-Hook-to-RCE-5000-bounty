package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class db implements ab {
    private static final x1<Boolean> a = new d2(u1.a("com.google.android.gms.measurement")).a("measurement.ga.ga_app_id", false);

    @Override // com.google.android.gms.internal.measurement.ab
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.ab
    public final boolean zzb() {
        return a.b().booleanValue();
    }
}
