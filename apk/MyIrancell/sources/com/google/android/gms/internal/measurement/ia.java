package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class ia implements m2<ha> {
    private static ia c = new ia();
    private final m2<ha> b;

    public ia() {
        this(l2.a(new ka()));
    }

    private ia(m2<ha> m2Var) {
        this.b = l2.a((m2) m2Var);
    }

    public static boolean a() {
        return ((ha) c.zza()).zza();
    }

    public static boolean b() {
        return ((ha) c.zza()).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final /* synthetic */ ha zza() {
        return this.b.zza();
    }
}
