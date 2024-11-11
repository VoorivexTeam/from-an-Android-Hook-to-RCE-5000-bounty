package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class cb implements m2<fb> {
    private static cb c = new cb();
    private final m2<fb> b;

    public cb() {
        this(l2.a(new eb()));
    }

    private cb(m2<fb> m2Var) {
        this.b = l2.a((m2) m2Var);
    }

    public static boolean a() {
        return ((fb) c.zza()).zza();
    }

    @Override // com.google.android.gms.internal.measurement.m2
    public final /* synthetic */ fb zza() {
        return this.b.zza();
    }
}
