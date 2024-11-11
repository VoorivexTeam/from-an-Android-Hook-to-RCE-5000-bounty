package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class bb implements m2<ab> {
    private static bb c = new bb();
    private final m2<ab> b;

    public bb() {
        this(l2.a(new db()));
    }

    private bb(m2<ab> m2Var) {
        this.b = l2.a((m2) m2Var);
    }

    public static boolean a() {
        return ((ab) c.zza()).zza();
    }

    public static boolean b() {
        return ((ab) c.zza()).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final /* synthetic */ ab zza() {
        return this.b.zza();
    }
}
