package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class vb implements m2<yb> {
    private static vb c = new vb();
    private final m2<yb> b;

    public vb() {
        this(l2.a(new xb()));
    }

    private vb(m2<yb> m2Var) {
        this.b = l2.a((m2) m2Var);
    }

    public static boolean a() {
        return ((yb) c.zza()).zza();
    }

    public static double b() {
        return ((yb) c.zza()).zzb();
    }

    public static long c() {
        return ((yb) c.zza()).b();
    }

    public static long d() {
        return ((yb) c.zza()).a();
    }

    public static String e() {
        return ((yb) c.zza()).c();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final /* synthetic */ yb zza() {
        return this.b.zza();
    }
}
