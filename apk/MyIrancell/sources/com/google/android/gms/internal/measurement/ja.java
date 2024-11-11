package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class ja implements m2<ma> {
    private static ja c = new ja();
    private final m2<ma> b;

    public ja() {
        this(l2.a(new la()));
    }

    private ja(m2<ma> m2Var) {
        this.b = l2.a((m2) m2Var);
    }

    public static boolean a() {
        return ((ma) c.zza()).zza();
    }

    public static boolean b() {
        return ((ma) c.zza()).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final /* synthetic */ ma zza() {
        return this.b.zza();
    }
}
