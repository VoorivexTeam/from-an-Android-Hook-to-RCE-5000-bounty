package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class da implements m2<ga> {
    private static da c = new da();
    private final m2<ga> b;

    public da() {
        this(l2.a(new fa()));
    }

    private da(m2<ga> m2Var) {
        this.b = l2.a((m2) m2Var);
    }

    public static boolean a() {
        return ((ga) c.zza()).zza();
    }

    public static boolean b() {
        return ((ga) c.zza()).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final /* synthetic */ ga zza() {
        return this.b.zza();
    }
}
