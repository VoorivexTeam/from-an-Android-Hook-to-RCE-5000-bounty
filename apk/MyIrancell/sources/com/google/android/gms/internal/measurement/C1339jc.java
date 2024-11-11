package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.jc */
/* loaded from: classes.dex */
public final class C1339jc implements InterfaceC1354kc {

    /* renamed from: a */
    private static final AbstractC1529x1<Boolean> f6683a;

    /* renamed from: b */
    private static final AbstractC1529x1<Boolean> f6684b;

    /* renamed from: c */
    private static final AbstractC1529x1<Boolean> f6685c;

    /* renamed from: d */
    private static final AbstractC1529x1<Boolean> f6686d;

    /* renamed from: e */
    private static final AbstractC1529x1<Boolean> f6687e;

    /* renamed from: f */
    private static final AbstractC1529x1<Boolean> f6688f;

    /* renamed from: g */
    private static final AbstractC1529x1<Boolean> f6689g;

    /* renamed from: h */
    private static final AbstractC1529x1<Boolean> f6690h;

    static {
        C1239d2 c1239d2 = new C1239d2(C1487u1.m8491a("com.google.android.gms.measurement"));
        f6683a = c1239d2.m7729a("measurement.service.audience.scoped_filters_v27", true);
        f6684b = c1239d2.m7729a("measurement.service.audience.session_scoped_user_engagement", true);
        f6685c = c1239d2.m7729a("measurement.client.audience.scoped_engagement_removal_when_session_expired", true);
        f6686d = c1239d2.m7729a("measurement.service.audience.scoped_engagement_removal_when_session_expired", true);
        f6687e = c1239d2.m7729a("measurement.service.audience.session_scoped_event_aggregates", true);
        f6688f = c1239d2.m7729a("measurement.service.audience.use_bundle_timestamp_for_property_filters", true);
        c1239d2.m7727a("measurement.id.scoped_audience_filters", 0L);
        f6689g = c1239d2.m7729a("measurement.service.audience.fix_prepending_previous_sequence_timestamp", true);
        f6690h = c1239d2.m7729a("measurement.service.audience.remove_disabled_session_scoped_user_engagement", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1354kc
    /* renamed from: a */
    public final boolean mo7942a() {
        return f6685c.m8878b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1354kc
    /* renamed from: b */
    public final boolean mo7943b() {
        return f6684b.m8878b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1354kc
    /* renamed from: c */
    public final boolean mo7944c() {
        return f6686d.m8878b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1354kc
    /* renamed from: e */
    public final boolean mo7945e() {
        return f6687e.m8878b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1354kc
    /* renamed from: f */
    public final boolean mo7946f() {
        return f6689g.m8878b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1354kc
    /* renamed from: j */
    public final boolean mo7947j() {
        return f6690h.m8878b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1354kc
    /* renamed from: o */
    public final boolean mo7948o() {
        return f6688f.m8878b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1354kc
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1354kc
    public final boolean zzb() {
        return f6683a.m8878b().booleanValue();
    }
}
