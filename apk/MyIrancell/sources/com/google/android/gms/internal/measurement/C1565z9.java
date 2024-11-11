package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.z9 */
/* loaded from: classes.dex */
public final class C1565z9 implements InterfaceC1202aa {

    /* renamed from: a */
    private static final AbstractC1529x1<Boolean> f7029a;

    static {
        C1239d2 c1239d2 = new C1239d2(C1487u1.m8491a("com.google.android.gms.measurement"));
        f7029a = c1239d2.m7729a("measurement.engagement_time_main_thread", false);
        c1239d2.m7727a("measurement.id.engagement_time_main_thread", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1202aa
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1202aa
    public final boolean zzb() {
        return f7029a.m8878b().booleanValue();
    }
}
