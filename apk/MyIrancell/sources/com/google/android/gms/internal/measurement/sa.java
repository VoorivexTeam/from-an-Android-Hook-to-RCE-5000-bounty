package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class sa implements ta {
    private static final x1<Boolean> a;
    private static final x1<Boolean> b;
    private static final x1<Boolean> c;

    static {
        d2 d2Var = new d2(u1.a("com.google.android.gms.measurement"));
        a = d2Var.a("measurement.client.sessions.check_on_reset_and_enable", false);
        b = d2Var.a("measurement.client.sessions.check_on_startup", true);
        c = d2Var.a("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // com.google.android.gms.internal.measurement.ta
    public final boolean a() {
        return c.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.ta
    public final boolean b() {
        return b.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.ta
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.ta
    public final boolean zzb() {
        return a.b().booleanValue();
    }
}
