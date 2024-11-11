package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class vc implements sc {
    private static final x1<Boolean> a = new d2(u1.a("com.google.android.gms.measurement")).a("measurement.integration.disable_firebase_instance_id", false);

    @Override // com.google.android.gms.internal.measurement.sc
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final boolean zzb() {
        return a.b().booleanValue();
    }
}
