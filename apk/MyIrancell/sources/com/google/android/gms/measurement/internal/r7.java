package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import java.util.Map;

/* loaded from: classes.dex */
public final class r7 extends c3 {
    protected s7 c;
    private volatile s7 d;
    private s7 e;
    private final Map<Activity, s7> f;
    private String g;

    public r7(j5 j5Var) {
        super(j5Var);
        this.f = new defpackage.c0();
    }

    private static String a(String str) {
        String[] split = str.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    private final void a(Activity activity, s7 s7Var, boolean z) {
        s7 s7Var2 = this.d == null ? this.e : this.d;
        s7 s7Var3 = s7Var.b == null ? new s7(s7Var.a, a(activity.getClass().getCanonicalName()), s7Var.c) : s7Var;
        this.e = this.d;
        this.d = s7Var3;
        g().a(new u7(this, z, h().b(), s7Var2, s7Var3));
    }

    public static void a(s7 s7Var, Bundle bundle, boolean z) {
        if (bundle != null && s7Var != null && (!bundle.containsKey("_sc") || z)) {
            String str = s7Var.a;
            if (str != null) {
                bundle.putString("_sn", str);
            } else {
                bundle.remove("_sn");
            }
            bundle.putString("_sc", s7Var.b);
            bundle.putLong("_si", s7Var.c);
            return;
        }
        if (bundle != null && s7Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(s7 s7Var, boolean z, long j) {
        o().a(h().b());
        if (u().a(s7Var.d, z, j)) {
            s7Var.d = false;
        }
    }

    private final s7 d(Activity activity) {
        com.google.android.gms.common.internal.u.a(activity);
        s7 s7Var = this.f.get(activity);
        if (s7Var != null) {
            return s7Var;
        }
        s7 s7Var2 = new s7(null, a(activity.getClass().getCanonicalName()), i().t());
        this.f.put(activity, s7Var2);
        return s7Var2;
    }

    @Override // com.google.android.gms.measurement.internal.c3
    protected final boolean A() {
        return false;
    }

    public final s7 B() {
        x();
        c();
        return this.c;
    }

    public final s7 C() {
        a();
        return this.d;
    }

    public final void a(Activity activity) {
        a(activity, d(activity), false);
        z o = o();
        o.g().a(new a1(o, o.h().b()));
    }

    public final void a(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f.put(activity, new s7(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void a(Activity activity, String str, String str2) {
        if (this.d == null) {
            k().y().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.f.get(activity) == null) {
            k().y().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = a(activity.getClass().getCanonicalName());
        }
        boolean equals = this.d.b.equals(str2);
        boolean c = z9.c(this.d.a, str);
        if (equals && c) {
            k().y().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > 100)) {
            k().y().a("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > 100)) {
            k().y().a("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        k().B().a("Setting current screen to name, class", str == null ? "null" : str, str2);
        s7 s7Var = new s7(str, str2, i().t());
        this.f.put(activity, s7Var);
        a(activity, s7Var, true);
    }

    public final void a(String str, s7 s7Var) {
        c();
        synchronized (this) {
            if (this.g == null || this.g.equals(str) || s7Var != null) {
                this.g = str;
            }
        }
    }

    public final void b(Activity activity) {
        s7 d = d(activity);
        this.e = this.d;
        this.d = null;
        g().a(new t7(this, d, h().b()));
    }

    public final void b(Activity activity, Bundle bundle) {
        s7 s7Var;
        if (bundle == null || (s7Var = this.f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", s7Var.c);
        bundle2.putString("name", s7Var.a);
        bundle2.putString("referrer_name", s7Var.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void c(Activity activity) {
        this.f.remove(activity);
    }
}
