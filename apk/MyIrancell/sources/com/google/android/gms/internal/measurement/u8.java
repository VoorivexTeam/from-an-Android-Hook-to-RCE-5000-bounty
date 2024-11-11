package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class u8 implements v8 {
    private static final x1<Boolean> a;

    static {
        d2 d2Var = new d2(u1.a("com.google.android.gms.measurement"));
        a = d2Var.a("measurement.service.disable_install_state_reporting", false);
        d2Var.a("measurement.id.service.disable_install_state_reporting", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.v8
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.v8
    public final boolean zzb() {
        return a.b().booleanValue();
    }
}
