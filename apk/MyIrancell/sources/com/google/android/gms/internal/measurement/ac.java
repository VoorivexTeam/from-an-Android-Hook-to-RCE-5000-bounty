package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class ac implements m2<zb> {
    private static ac c = new ac();
    private final m2<zb> b;

    public ac() {
        this(l2.a(new cc()));
    }

    private ac(m2<zb> m2Var) {
        this.b = l2.a((m2) m2Var);
    }

    public static boolean a() {
        return ((zb) c.zza()).zza();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final /* synthetic */ zb zza() {
        return this.b.zza();
    }
}
