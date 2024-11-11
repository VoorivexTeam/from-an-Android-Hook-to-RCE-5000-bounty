package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class a9 implements b9 {
    private static final x1<Boolean> a;
    private static final x1<Boolean> b;

    static {
        d2 d2Var = new d2(u1.a("com.google.android.gms.measurement"));
        a = d2Var.a("measurement.sdk.dynamite.allow_remote_dynamite", false);
        d2Var.a("measurement.collection.init_params_control_enabled", true);
        b = d2Var.a("measurement.sdk.dynamite.use_dynamite2", false);
        d2Var.a("measurement.id.sdk.dynamite.use_dynamite", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.b9
    public final boolean zza() {
        return a.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.b9
    public final boolean zzb() {
        return b.b().booleanValue();
    }
}
