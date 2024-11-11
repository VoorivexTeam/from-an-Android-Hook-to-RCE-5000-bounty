package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.a9 */
/* loaded from: classes.dex */
public final class C1201a9 implements InterfaceC1216b9 {

    /* renamed from: a */
    private static final AbstractC1529x1<Boolean> f6497a;

    /* renamed from: b */
    private static final AbstractC1529x1<Boolean> f6498b;

    static {
        C1239d2 c1239d2 = new C1239d2(C1487u1.m8491a("com.google.android.gms.measurement"));
        f6497a = c1239d2.m7729a("measurement.sdk.dynamite.allow_remote_dynamite", false);
        c1239d2.m7729a("measurement.collection.init_params_control_enabled", true);
        f6498b = c1239d2.m7729a("measurement.sdk.dynamite.use_dynamite2", false);
        c1239d2.m7727a("measurement.id.sdk.dynamite.use_dynamite", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1216b9
    public final boolean zza() {
        return f6497a.m8878b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1216b9
    public final boolean zzb() {
        return f6498b.m8878b().booleanValue();
    }
}
