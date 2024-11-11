package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class bc implements m2<ec> {
    private static bc c = new bc();
    private final m2<ec> b;

    public bc() {
        this(l2.a(new dc()));
    }

    private bc(m2<ec> m2Var) {
        this.b = l2.a((m2) m2Var);
    }

    public static boolean a() {
        return ((ec) c.zza()).zza();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final /* synthetic */ ec zza() {
        return this.b.zza();
    }
}
