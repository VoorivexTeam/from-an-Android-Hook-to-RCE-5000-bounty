package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class kb implements lb {
    private static final x1<Boolean> a;
    private static final x1<Boolean> b;
    private static final x1<Boolean> c;

    static {
        d2 d2Var = new d2(u1.a("com.google.android.gms.measurement"));
        d2Var.a("measurement.id.lifecycle.app_in_background_parameter", 0L);
        a = d2Var.a("measurement.lifecycle.app_backgrounded_engagement", false);
        b = d2Var.a("measurement.lifecycle.app_backgrounded_tracking", true);
        c = d2Var.a("measurement.lifecycle.app_in_background_parameter", false);
        d2Var.a("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.lb
    public final boolean b() {
        return c.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.lb
    public final boolean zza() {
        return a.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.lb
    public final boolean zzb() {
        return b.b().booleanValue();
    }
}
