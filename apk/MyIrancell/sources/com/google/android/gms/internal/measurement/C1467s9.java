package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.s9 */
/* loaded from: classes.dex */
public final class C1467s9 implements InterfaceC1425p9 {

    /* renamed from: a */
    private static final AbstractC1529x1<Boolean> f6896a;

    /* renamed from: b */
    private static final AbstractC1529x1<Boolean> f6897b;

    /* renamed from: c */
    private static final AbstractC1529x1<Boolean> f6898c;

    /* renamed from: d */
    private static final AbstractC1529x1<Boolean> f6899d;

    static {
        C1239d2 c1239d2 = new C1239d2(C1487u1.m8491a("com.google.android.gms.measurement"));
        f6896a = c1239d2.m7729a("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f6897b = c1239d2.m7729a("measurement.audience.refresh_event_count_filters_timestamp", false);
        f6898c = c1239d2.m7729a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f6899d = c1239d2.m7729a("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1425p9
    /* renamed from: a */
    public final boolean mo8198a() {
        return f6898c.m8878b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1425p9
    /* renamed from: b */
    public final boolean mo8199b() {
        return f6897b.m8878b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1425p9
    /* renamed from: c */
    public final boolean mo8200c() {
        return f6899d.m8878b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1425p9
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1425p9
    public final boolean zzb() {
        return f6896a.m8878b().booleanValue();
    }
}
