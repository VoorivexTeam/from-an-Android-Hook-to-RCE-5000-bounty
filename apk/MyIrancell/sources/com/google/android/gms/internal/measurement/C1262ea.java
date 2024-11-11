package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ea */
/* loaded from: classes.dex */
public final class C1262ea implements InterfaceC1217ba {

    /* renamed from: a */
    private static final AbstractC1529x1<Boolean> f6604a;

    static {
        C1239d2 c1239d2 = new C1239d2(C1487u1.m8491a("com.google.android.gms.measurement"));
        f6604a = c1239d2.m7729a("measurement.service.fix_gmp_version", false);
        c1239d2.m7727a("measurement.id.service.fix_gmp_version", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1217ba
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1217ba
    public final boolean zzb() {
        return f6604a.m8878b().booleanValue();
    }
}
