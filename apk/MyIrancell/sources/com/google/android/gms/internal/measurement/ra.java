package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class ra implements oa {
    private static final x1<Boolean> a = new d2(u1.a("com.google.android.gms.measurement")).a("measurement.lifecycle.app_background_timestamp_when_backgrounded", true);

    @Override // com.google.android.gms.internal.measurement.oa
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.oa
    public final boolean zzb() {
        return a.b().booleanValue();
    }
}
