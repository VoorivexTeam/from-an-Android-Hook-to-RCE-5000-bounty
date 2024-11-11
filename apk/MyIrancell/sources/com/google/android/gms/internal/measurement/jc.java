package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class jc implements kc {
    private static final x1<Boolean> a;
    private static final x1<Boolean> b;
    private static final x1<Boolean> c;
    private static final x1<Boolean> d;
    private static final x1<Boolean> e;
    private static final x1<Boolean> f;
    private static final x1<Boolean> g;
    private static final x1<Boolean> h;

    static {
        d2 d2Var = new d2(u1.a("com.google.android.gms.measurement"));
        a = d2Var.a("measurement.service.audience.scoped_filters_v27", true);
        b = d2Var.a("measurement.service.audience.session_scoped_user_engagement", true);
        c = d2Var.a("measurement.client.audience.scoped_engagement_removal_when_session_expired", true);
        d = d2Var.a("measurement.service.audience.scoped_engagement_removal_when_session_expired", true);
        e = d2Var.a("measurement.service.audience.session_scoped_event_aggregates", true);
        f = d2Var.a("measurement.service.audience.use_bundle_timestamp_for_property_filters", true);
        d2Var.a("measurement.id.scoped_audience_filters", 0L);
        g = d2Var.a("measurement.service.audience.fix_prepending_previous_sequence_timestamp", true);
        h = d2Var.a("measurement.service.audience.remove_disabled_session_scoped_user_engagement", false);
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final boolean a() {
        return c.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final boolean b() {
        return b.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final boolean c() {
        return d.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final boolean e() {
        return e.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final boolean f() {
        return g.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final boolean j() {
        return h.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final boolean o() {
        return f.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.kc
    public final boolean zzb() {
        return a.b().booleanValue();
    }
}
