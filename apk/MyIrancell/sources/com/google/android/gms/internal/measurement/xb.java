package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class xb implements yb {
    private static final x1<Boolean> a;
    private static final x1<Double> b;
    private static final x1<Long> c;
    private static final x1<Long> d;
    private static final x1<String> e;

    static {
        d2 d2Var = new d2(u1.a("com.google.android.gms.measurement"));
        a = d2Var.a("measurement.test.boolean_flag", false);
        b = d2Var.a("measurement.test.double_flag", -3.0d);
        c = d2Var.a("measurement.test.int_flag", -2L);
        d = d2Var.a("measurement.test.long_flag", -1L);
        e = d2Var.a("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.yb
    public final long a() {
        return d.b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.yb
    public final long b() {
        return c.b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.yb
    public final String c() {
        return e.b();
    }

    @Override // com.google.android.gms.internal.measurement.yb
    public final boolean zza() {
        return a.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.yb
    public final double zzb() {
        return b.b().doubleValue();
    }
}
