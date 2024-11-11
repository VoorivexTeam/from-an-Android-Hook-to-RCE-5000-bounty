package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class j9 implements m2<i9> {
    private static j9 c = new j9();
    private final m2<i9> b;

    public j9() {
        this(l2.a(new l9()));
    }

    private j9(m2<i9> m2Var) {
        this.b = l2.a((m2) m2Var);
    }

    public static boolean a() {
        return ((i9) c.zza()).zza();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final /* synthetic */ i9 zza() {
        return this.b.zza();
    }
}
