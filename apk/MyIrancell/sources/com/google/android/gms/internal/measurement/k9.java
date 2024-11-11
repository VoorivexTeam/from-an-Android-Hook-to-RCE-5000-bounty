package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class k9 implements m2<o9> {
    private static k9 c = new k9();
    private final m2<o9> b;

    public k9() {
        this(l2.a(new n9()));
    }

    private k9(m2<o9> m2Var) {
        this.b = l2.a((m2) m2Var);
    }

    public static boolean a() {
        return ((o9) c.zza()).zza();
    }

    public static boolean b() {
        return ((o9) c.zza()).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final /* synthetic */ o9 zza() {
        return this.b.zza();
    }
}
