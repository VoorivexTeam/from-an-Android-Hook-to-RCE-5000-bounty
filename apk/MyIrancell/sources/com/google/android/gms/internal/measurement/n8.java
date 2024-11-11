package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class n8 implements j8 {
    private static final x1<Boolean> a;

    static {
        d2 d2Var = new d2(u1.a("com.google.android.gms.measurement"));
        a = d2Var.a("measurement.app_launch.event_ordering_fix", false);
        d2Var.a("measurement.id.app_launch.event_ordering_fix", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.j8
    public final boolean zza() {
        return a.b().booleanValue();
    }
}
