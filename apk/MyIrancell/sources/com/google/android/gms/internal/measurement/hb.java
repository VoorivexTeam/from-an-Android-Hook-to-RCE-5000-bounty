package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class hb implements m2<gb> {
    private static hb c = new hb();
    private final m2<gb> b;

    public hb() {
        this(l2.a(new jb()));
    }

    private hb(m2<gb> m2Var) {
        this.b = l2.a((m2) m2Var);
    }

    public static boolean a() {
        return ((gb) c.zza()).zza();
    }

    public static boolean b() {
        return ((gb) c.zza()).zzb();
    }

    public static boolean c() {
        return ((gb) c.zza()).b();
    }

    public static boolean d() {
        return ((gb) c.zza()).a();
    }

    public static boolean e() {
        return ((gb) c.zza()).c();
    }

    public static boolean f() {
        return ((gb) c.zza()).e();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final /* synthetic */ gb zza() {
        return this.b.zza();
    }
}
