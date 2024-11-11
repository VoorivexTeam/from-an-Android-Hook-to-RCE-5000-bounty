package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class oc implements lc {
    private static final x1<Boolean> a;
    private static final x1<Boolean> b;
    private static final x1<Boolean> c;

    static {
        d2 d2Var = new d2(u1.a("com.google.android.gms.measurement"));
        a = d2Var.a("measurement.service.sessions.remove_disabled_session_number", true);
        b = d2Var.a("measurement.service.sessions.session_number_enabled", true);
        c = d2Var.a("measurement.service.sessions.session_number_backfill_enabled", true);
    }

    @Override // com.google.android.gms.internal.measurement.lc
    public final boolean b() {
        return c.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.lc
    public final boolean zza() {
        return a.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.lc
    public final boolean zzb() {
        return b.b().booleanValue();
    }
}
