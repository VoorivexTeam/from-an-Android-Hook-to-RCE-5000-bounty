package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class k8 implements m2<j8> {
    private static k8 c = new k8();
    private final m2<j8> b;

    public k8() {
        this(l2.a(new n8()));
    }

    private k8(m2<j8> m2Var) {
        this.b = l2.a((m2) m2Var);
    }

    public static boolean a() {
        return ((j8) c.zza()).zza();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final /* synthetic */ j8 zza() {
        return this.b.zza();
    }
}
