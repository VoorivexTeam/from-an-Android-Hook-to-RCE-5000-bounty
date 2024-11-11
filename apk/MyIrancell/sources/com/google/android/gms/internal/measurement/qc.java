package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class qc implements rc {
    private static final x1<Boolean> a;
    private static final x1<Boolean> b;
    private static final x1<Boolean> c;

    static {
        d2 d2Var = new d2(u1.a("com.google.android.gms.measurement"));
        a = d2Var.a("measurement.client.sessions.background_sessions_enabled", true);
        d2Var.a("measurement.client.sessions.immediate_start_enabled_foreground", true);
        b = d2Var.a("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        c = d2Var.a("measurement.client.sessions.session_id_enabled", true);
    }

    @Override // com.google.android.gms.internal.measurement.rc
    public final boolean b() {
        return c.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.rc
    public final boolean zza() {
        return a.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.rc
    public final boolean zzb() {
        return b.b().booleanValue();
    }
}
