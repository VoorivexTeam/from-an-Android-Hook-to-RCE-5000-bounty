package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class wb implements tb {
    private static final x1<Boolean> a = new d2(u1.a("com.google.android.gms.measurement")).a("measurement.config.string.always_update_disk_on_set", false);

    @Override // com.google.android.gms.internal.measurement.tb
    public final boolean zza() {
        return a.b().booleanValue();
    }
}
