package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class dc implements ec {
    private static final x1<Boolean> a = new d2(u1.a("com.google.android.gms.measurement")).a("measurement.experiment.enable_experiment_reporting", true);

    @Override // com.google.android.gms.internal.measurement.ec
    public final boolean zza() {
        return a.b().booleanValue();
    }
}
