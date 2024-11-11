package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class n9 implements o9 {
    private static final x1<Boolean> a = new d2(u1.a("com.google.android.gms.measurement")).a("measurement.client.firebase_feature_rollout.v1.enable", true);

    @Override // com.google.android.gms.internal.measurement.o9
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.o9
    public final boolean zzb() {
        return a.b().booleanValue();
    }
}
