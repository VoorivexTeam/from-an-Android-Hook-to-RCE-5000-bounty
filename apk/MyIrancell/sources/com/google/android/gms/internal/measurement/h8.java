package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class h8 implements i8 {
    private static final x1<Boolean> a = new d2(u1.a("com.google.android.gms.measurement")).a("measurement.module.collection.conditionally_omit_admob_app_id", true);

    @Override // com.google.android.gms.internal.measurement.i8
    public final boolean zza() {
        return a.b().booleanValue();
    }
}
