package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class ca implements m2<ba> {
    private static ca c = new ca();
    private final m2<ba> b;

    public ca() {
        this(l2.a(new ea()));
    }

    private ca(m2<ba> m2Var) {
        this.b = l2.a((m2) m2Var);
    }

    public static boolean a() {
        return ((ba) c.zza()).zza();
    }

    public static boolean b() {
        return ((ba) c.zza()).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final /* synthetic */ ba zza() {
        return this.b.zza();
    }
}
