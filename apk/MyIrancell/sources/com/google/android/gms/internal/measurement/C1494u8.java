package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.u8 */
/* loaded from: classes.dex */
public final class C1494u8 implements InterfaceC1508v8 {

    /* renamed from: a */
    private static final AbstractC1529x1<Boolean> f6956a;

    static {
        C1239d2 c1239d2 = new C1239d2(C1487u1.m8491a("com.google.android.gms.measurement"));
        f6956a = c1239d2.m7729a("measurement.service.disable_install_state_reporting", false);
        c1239d2.m7727a("measurement.id.service.disable_install_state_reporting", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1508v8
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1508v8
    public final boolean zzb() {
        return f6956a.m8878b().booleanValue();
    }
}
