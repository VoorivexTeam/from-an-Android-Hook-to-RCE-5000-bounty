package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.n8 */
/* loaded from: classes.dex */
public final class C1395n8 implements InterfaceC1335j8 {

    /* renamed from: a */
    private static final AbstractC1529x1<Boolean> f6771a;

    static {
        C1239d2 c1239d2 = new C1239d2(C1487u1.m8491a("com.google.android.gms.measurement"));
        f6771a = c1239d2.m7729a("measurement.app_launch.event_ordering_fix", false);
        c1239d2.m7727a("measurement.id.app_launch.event_ordering_fix", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1335j8
    public final boolean zza() {
        return f6771a.m8878b().booleanValue();
    }
}
