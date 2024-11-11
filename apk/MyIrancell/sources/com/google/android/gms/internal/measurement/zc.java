package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class zc implements m2<yc> {
    private static zc c = new zc();
    private final m2<yc> b;

    public zc() {
        this(l2.a(new bd()));
    }

    private zc(m2<yc> m2Var) {
        this.b = l2.a((m2) m2Var);
    }

    public static boolean a() {
        return ((yc) c.zza()).zza();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final /* synthetic */ yc zza() {
        return this.b.zza();
    }
}
