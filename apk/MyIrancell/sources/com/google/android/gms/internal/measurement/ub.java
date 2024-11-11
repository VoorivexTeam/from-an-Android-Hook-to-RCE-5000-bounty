package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class ub implements m2<tb> {
    private static ub c = new ub();
    private final m2<tb> b;

    public ub() {
        this(l2.a(new wb()));
    }

    private ub(m2<tb> m2Var) {
        this.b = l2.a((m2) m2Var);
    }

    public static boolean a() {
        return ((tb) c.zza()).zza();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final /* synthetic */ tb zza() {
        return this.b.zza();
    }
}
