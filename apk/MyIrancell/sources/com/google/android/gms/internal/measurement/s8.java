package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class s8 implements m2<v8> {
    private static s8 c = new s8();
    private final m2<v8> b;

    public s8() {
        this(l2.a(new u8()));
    }

    private s8(m2<v8> m2Var) {
        this.b = l2.a((m2) m2Var);
    }

    public static boolean a() {
        return ((v8) c.zza()).zza();
    }

    public static boolean b() {
        return ((v8) c.zza()).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final /* synthetic */ v8 zza() {
        return this.b.zza();
    }
}
