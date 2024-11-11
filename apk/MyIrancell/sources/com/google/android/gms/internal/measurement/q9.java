package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class q9 implements m2<p9> {
    private static q9 c = new q9();
    private final m2<p9> b;

    public q9() {
        this(l2.a(new s9()));
    }

    private q9(m2<p9> m2Var) {
        this.b = l2.a((m2) m2Var);
    }

    public static boolean a() {
        return ((p9) c.zza()).zza();
    }

    public static boolean b() {
        return ((p9) c.zza()).zzb();
    }

    public static boolean c() {
        return ((p9) c.zza()).b();
    }

    public static boolean d() {
        return ((p9) c.zza()).a();
    }

    public static boolean e() {
        return ((p9) c.zza()).c();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final /* synthetic */ p9 zza() {
        return this.b.zza();
    }
}
