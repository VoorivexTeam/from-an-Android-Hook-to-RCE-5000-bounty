package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class s9 implements p9 {
    private static final x1<Boolean> a;
    private static final x1<Boolean> b;
    private static final x1<Boolean> c;
    private static final x1<Boolean> d;

    static {
        d2 d2Var = new d2(u1.a("com.google.android.gms.measurement"));
        a = d2Var.a("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        b = d2Var.a("measurement.audience.refresh_event_count_filters_timestamp", false);
        c = d2Var.a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        d = d2Var.a("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.p9
    public final boolean a() {
        return c.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.p9
    public final boolean b() {
        return b.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.p9
    public final boolean c() {
        return d.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.p9
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.p9
    public final boolean zzb() {
        return a.b().booleanValue();
    }
}
