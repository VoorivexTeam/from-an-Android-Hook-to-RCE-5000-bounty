package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class jb implements gb {
    private static final x1<Boolean> a;
    private static final x1<Boolean> b;
    private static final x1<Boolean> c;
    private static final x1<Boolean> d;
    private static final x1<Boolean> e;

    static {
        d2 d2Var = new d2(u1.a("com.google.android.gms.measurement"));
        a = d2Var.a("measurement.sdk.collection.enable_extend_user_property_size", true);
        b = d2Var.a("measurement.sdk.collection.last_deep_link_referrer2", false);
        c = d2Var.a("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        d = d2Var.a("measurement.sdk.collection.last_gclid_from_referrer2", false);
        e = d2Var.a("measurement.sdk.collection.worker_thread_referrer", true);
        d2Var.a("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final boolean a() {
        return c.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final boolean b() {
        return b.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final boolean c() {
        return d.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final boolean e() {
        return e.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final boolean zzb() {
        return a.b().booleanValue();
    }
}
