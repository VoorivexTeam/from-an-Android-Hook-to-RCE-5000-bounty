package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.xb */
/* loaded from: classes.dex */
public final class C1539xb implements InterfaceC1553yb {

    /* renamed from: a */
    private static final AbstractC1529x1<Boolean> f7009a;

    /* renamed from: b */
    private static final AbstractC1529x1<Double> f7010b;

    /* renamed from: c */
    private static final AbstractC1529x1<Long> f7011c;

    /* renamed from: d */
    private static final AbstractC1529x1<Long> f7012d;

    /* renamed from: e */
    private static final AbstractC1529x1<String> f7013e;

    static {
        C1239d2 c1239d2 = new C1239d2(C1487u1.m8491a("com.google.android.gms.measurement"));
        f7009a = c1239d2.m7729a("measurement.test.boolean_flag", false);
        f7010b = c1239d2.m7726a("measurement.test.double_flag", -3.0d);
        f7011c = c1239d2.m7727a("measurement.test.int_flag", -2L);
        f7012d = c1239d2.m7727a("measurement.test.long_flag", -1L);
        f7013e = c1239d2.m7728a("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1553yb
    /* renamed from: a */
    public final long mo8886a() {
        return f7012d.m8878b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1553yb
    /* renamed from: b */
    public final long mo8887b() {
        return f7011c.m8878b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1553yb
    /* renamed from: c */
    public final String mo8888c() {
        return f7013e.m8878b();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1553yb
    public final boolean zza() {
        return f7009a.m8878b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1553yb
    public final double zzb() {
        return f7010b.m8878b().doubleValue();
    }
}
