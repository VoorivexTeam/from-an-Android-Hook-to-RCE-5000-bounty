package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class nb implements m2<mb> {
    private static nb c = new nb();
    private final m2<mb> b;

    public nb() {
        this(l2.a(new qb()));
    }

    private nb(m2<mb> m2Var) {
        this.b = l2.a((m2) m2Var);
    }

    public static boolean a() {
        return ((mb) c.zza()).zza();
    }

    public static boolean b() {
        return ((mb) c.zza()).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final /* synthetic */ mb zza() {
        return this.b.zza();
    }
}
