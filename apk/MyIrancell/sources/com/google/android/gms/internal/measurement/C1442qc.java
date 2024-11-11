package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.qc */
/* loaded from: classes.dex */
public final class C1442qc implements InterfaceC1456rc {

    /* renamed from: a */
    private static final AbstractC1529x1<Boolean> f6853a;

    /* renamed from: b */
    private static final AbstractC1529x1<Boolean> f6854b;

    /* renamed from: c */
    private static final AbstractC1529x1<Boolean> f6855c;

    static {
        C1239d2 c1239d2 = new C1239d2(C1487u1.m8491a("com.google.android.gms.measurement"));
        f6853a = c1239d2.m7729a("measurement.client.sessions.background_sessions_enabled", true);
        c1239d2.m7729a("measurement.client.sessions.immediate_start_enabled_foreground", true);
        f6854b = c1239d2.m7729a("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        f6855c = c1239d2.m7729a("measurement.client.sessions.session_id_enabled", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1456rc
    /* renamed from: b */
    public final boolean mo8257b() {
        return f6855c.m8878b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1456rc
    public final boolean zza() {
        return f6853a.m8878b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1456rc
    public final boolean zzb() {
        return f6854b.m8878b().booleanValue();
    }
}
