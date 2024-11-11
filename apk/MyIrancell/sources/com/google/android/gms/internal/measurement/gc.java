package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class gc implements m2<fc> {
    private static gc c = new gc();
    private final m2<fc> b;

    public gc() {
        this(l2.a(new ic()));
    }

    private gc(m2<fc> m2Var) {
        this.b = l2.a((m2) m2Var);
    }

    public static boolean a() {
        return ((fc) c.zza()).zza();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final /* synthetic */ fc zza() {
        return this.b.zza();
    }
}
