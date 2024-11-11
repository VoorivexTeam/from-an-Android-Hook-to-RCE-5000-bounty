package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.kb */
/* loaded from: classes.dex */
public final class C1353kb implements InterfaceC1368lb {

    /* renamed from: a */
    private static final AbstractC1529x1<Boolean> f6703a;

    /* renamed from: b */
    private static final AbstractC1529x1<Boolean> f6704b;

    /* renamed from: c */
    private static final AbstractC1529x1<Boolean> f6705c;

    static {
        C1239d2 c1239d2 = new C1239d2(C1487u1.m8491a("com.google.android.gms.measurement"));
        c1239d2.m7727a("measurement.id.lifecycle.app_in_background_parameter", 0L);
        f6703a = c1239d2.m7729a("measurement.lifecycle.app_backgrounded_engagement", false);
        f6704b = c1239d2.m7729a("measurement.lifecycle.app_backgrounded_tracking", true);
        f6705c = c1239d2.m7729a("measurement.lifecycle.app_in_background_parameter", false);
        c1239d2.m7727a("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1368lb
    /* renamed from: b */
    public final boolean mo7957b() {
        return f6705c.m8878b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1368lb
    public final boolean zza() {
        return f6703a.m8878b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1368lb
    public final boolean zzb() {
        return f6704b.m8878b().booleanValue();
    }
}
