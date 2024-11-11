package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.n9 */
/* loaded from: classes.dex */
public final class C1396n9 implements InterfaceC1411o9 {

    /* renamed from: a */
    private static final AbstractC1529x1<Boolean> f6772a = new C1239d2(C1487u1.m8491a("com.google.android.gms.measurement")).m7729a("measurement.client.firebase_feature_rollout.v1.enable", true);

    @Override // com.google.android.gms.internal.measurement.InterfaceC1411o9
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1411o9
    public final boolean zzb() {
        return f6772a.m8878b().booleanValue();
    }
}
