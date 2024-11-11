package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.oc */
/* loaded from: classes.dex */
public final class C1414oc implements InterfaceC1369lc {

    /* renamed from: a */
    private static final AbstractC1529x1<Boolean> f6823a;

    /* renamed from: b */
    private static final AbstractC1529x1<Boolean> f6824b;

    /* renamed from: c */
    private static final AbstractC1529x1<Boolean> f6825c;

    static {
        C1239d2 c1239d2 = new C1239d2(C1487u1.m8491a("com.google.android.gms.measurement"));
        f6823a = c1239d2.m7729a("measurement.service.sessions.remove_disabled_session_number", true);
        f6824b = c1239d2.m7729a("measurement.service.sessions.session_number_enabled", true);
        f6825c = c1239d2.m7729a("measurement.service.sessions.session_number_backfill_enabled", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1369lc
    /* renamed from: b */
    public final boolean mo7972b() {
        return f6825c.m8878b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1369lc
    public final boolean zza() {
        return f6823a.m8878b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1369lc
    public final boolean zzb() {
        return f6824b.m8878b().booleanValue();
    }
}
