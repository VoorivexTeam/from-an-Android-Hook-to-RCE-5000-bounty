package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class mc implements m2<lc> {
    private static mc c = new mc();
    private final m2<lc> b;

    public mc() {
        this(l2.a(new oc()));
    }

    private mc(m2<lc> m2Var) {
        this.b = l2.a((m2) m2Var);
    }

    public static boolean a() {
        return ((lc) c.zza()).zza();
    }

    public static boolean b() {
        return ((lc) c.zza()).zzb();
    }

    public static boolean c() {
        return ((lc) c.zza()).b();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final /* synthetic */ lc zza() {
        return this.b.zza();
    }
}
