package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class e8 implements m2<d8> {
    private static e8 c = new e8();
    private final m2<d8> b;

    public e8() {
        this(l2.a(new g8()));
    }

    private e8(m2<d8> m2Var) {
        this.b = l2.a((m2) m2Var);
    }

    public static boolean a() {
        return ((d8) c.zza()).zza();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final /* synthetic */ d8 zza() {
        return this.b.zza();
    }
}
