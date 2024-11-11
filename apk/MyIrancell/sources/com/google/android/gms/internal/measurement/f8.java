package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class f8 implements m2<i8> {
    private static f8 c = new f8();
    private final m2<i8> b;

    public f8() {
        this(l2.a(new h8()));
    }

    private f8(m2<i8> m2Var) {
        this.b = l2.a((m2) m2Var);
    }

    public static boolean a() {
        return ((i8) c.zza()).zza();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final /* synthetic */ i8 zza() {
        return this.b.zza();
    }
}
