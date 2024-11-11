package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class y9 implements v9 {
    private static final x1<Boolean> a = new d2(u1.a("com.google.android.gms.measurement")).a("measurement.sdk.referrer.delayed_install_referrer_api", false);

    @Override // com.google.android.gms.internal.measurement.v9
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.v9
    public final boolean zzb() {
        return a.b().booleanValue();
    }
}
