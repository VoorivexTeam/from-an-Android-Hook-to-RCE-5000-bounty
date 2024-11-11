package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class w9 implements m2<v9> {
    private static w9 c = new w9();
    private final m2<v9> b;

    public w9() {
        this(l2.a(new y9()));
    }

    private w9(m2<v9> m2Var) {
        this.b = l2.a((m2) m2Var);
    }

    public static boolean a() {
        return ((v9) c.zza()).zza();
    }

    public static boolean b() {
        return ((v9) c.zza()).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final /* synthetic */ v9 zza() {
        return this.b.zza();
    }
}
