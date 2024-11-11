package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.sa */
/* loaded from: classes.dex */
public final class C1468sa implements InterfaceC1482ta {

    /* renamed from: a */
    private static final AbstractC1529x1<Boolean> f6900a;

    /* renamed from: b */
    private static final AbstractC1529x1<Boolean> f6901b;

    /* renamed from: c */
    private static final AbstractC1529x1<Boolean> f6902c;

    static {
        C1239d2 c1239d2 = new C1239d2(C1487u1.m8491a("com.google.android.gms.measurement"));
        f6900a = c1239d2.m7729a("measurement.client.sessions.check_on_reset_and_enable", false);
        f6901b = c1239d2.m7729a("measurement.client.sessions.check_on_startup", true);
        f6902c = c1239d2.m7729a("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1482ta
    /* renamed from: a */
    public final boolean mo8430a() {
        return f6902c.m8878b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1482ta
    /* renamed from: b */
    public final boolean mo8431b() {
        return f6901b.m8878b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1482ta
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1482ta
    public final boolean zzb() {
        return f6900a.m8878b().booleanValue();
    }
}
