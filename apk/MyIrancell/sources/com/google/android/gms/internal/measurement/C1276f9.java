package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.f9 */
/* loaded from: classes.dex */
public final class C1276f9 implements InterfaceC1231c9 {

    /* renamed from: a */
    private static final AbstractC1529x1<Boolean> f6617a;

    static {
        C1239d2 c1239d2 = new C1239d2(C1487u1.m8491a("com.google.android.gms.measurement"));
        f6617a = c1239d2.m7729a("measurement.gold.enhanced_ecommerce.format_logs", false);
        c1239d2.m7729a("measurement.gold.enhanced_ecommerce.nested_complex_events", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1231c9
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1231c9
    public final boolean zzb() {
        return f6617a.m8878b().booleanValue();
    }
}
