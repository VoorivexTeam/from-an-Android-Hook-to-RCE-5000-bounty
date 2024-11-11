package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class wa implements m2<za> {
    private static wa c = new wa();
    private final m2<za> b;

    public wa() {
        this(l2.a(new ya()));
    }

    private wa(m2<za> m2Var) {
        this.b = l2.a((m2) m2Var);
    }

    public static boolean a() {
        return ((za) c.zza()).zza();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final /* synthetic */ za zza() {
        return this.b.zza();
    }
}
