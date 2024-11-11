package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.jb */
/* loaded from: classes.dex */
public final class C1338jb implements InterfaceC1293gb {

    /* renamed from: a */
    private static final AbstractC1529x1<Boolean> f6678a;

    /* renamed from: b */
    private static final AbstractC1529x1<Boolean> f6679b;

    /* renamed from: c */
    private static final AbstractC1529x1<Boolean> f6680c;

    /* renamed from: d */
    private static final AbstractC1529x1<Boolean> f6681d;

    /* renamed from: e */
    private static final AbstractC1529x1<Boolean> f6682e;

    static {
        C1239d2 c1239d2 = new C1239d2(C1487u1.m8491a("com.google.android.gms.measurement"));
        f6678a = c1239d2.m7729a("measurement.sdk.collection.enable_extend_user_property_size", true);
        f6679b = c1239d2.m7729a("measurement.sdk.collection.last_deep_link_referrer2", false);
        f6680c = c1239d2.m7729a("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f6681d = c1239d2.m7729a("measurement.sdk.collection.last_gclid_from_referrer2", false);
        f6682e = c1239d2.m7729a("measurement.sdk.collection.worker_thread_referrer", true);
        c1239d2.m7727a("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1293gb
    /* renamed from: a */
    public final boolean mo7852a() {
        return f6680c.m8878b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1293gb
    /* renamed from: b */
    public final boolean mo7853b() {
        return f6679b.m8878b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1293gb
    /* renamed from: c */
    public final boolean mo7854c() {
        return f6681d.m8878b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1293gb
    /* renamed from: e */
    public final boolean mo7855e() {
        return f6682e.m8878b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1293gb
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1293gb
    public final boolean zzb() {
        return f6678a.m8878b().booleanValue();
    }
}
