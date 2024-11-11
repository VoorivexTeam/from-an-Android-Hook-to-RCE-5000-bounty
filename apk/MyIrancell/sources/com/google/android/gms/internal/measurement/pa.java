package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class pa implements m2<oa> {
    private static pa c = new pa();
    private final m2<oa> b;

    public pa() {
        this(l2.a(new ra()));
    }

    private pa(m2<oa> m2Var) {
        this.b = l2.a((m2) m2Var);
    }

    public static boolean a() {
        return ((oa) c.zza()).zza();
    }

    public static boolean b() {
        return ((oa) c.zza()).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final /* synthetic */ oa zza() {
        return this.b.zza();
    }
}
