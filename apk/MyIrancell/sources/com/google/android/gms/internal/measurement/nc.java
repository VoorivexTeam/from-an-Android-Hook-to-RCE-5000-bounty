package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class nc implements m2<rc> {
    private static nc c = new nc();
    private final m2<rc> b;

    public nc() {
        this(l2.a(new qc()));
    }

    private nc(m2<rc> m2Var) {
        this.b = l2.a((m2) m2Var);
    }

    public static boolean a() {
        return ((rc) c.zza()).zza();
    }

    public static boolean b() {
        return ((rc) c.zza()).zzb();
    }

    public static boolean c() {
        return ((rc) c.zza()).b();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final /* synthetic */ rc zza() {
        return this.b.zza();
    }
}
