package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class ib implements m2<lb> {
    private static ib c = new ib();
    private final m2<lb> b;

    public ib() {
        this(l2.a(new kb()));
    }

    private ib(m2<lb> m2Var) {
        this.b = l2.a((m2) m2Var);
    }

    public static boolean a() {
        return ((lb) c.zza()).zza();
    }

    public static boolean b() {
        return ((lb) c.zza()).zzb();
    }

    public static boolean c() {
        return ((lb) c.zza()).b();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final /* synthetic */ lb zza() {
        return this.b.zza();
    }
}
