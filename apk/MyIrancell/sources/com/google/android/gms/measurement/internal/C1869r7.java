package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.C1057u;
import java.util.Map;
import p000.C0500c0;

/* renamed from: com.google.android.gms.measurement.internal.r7 */
/* loaded from: classes.dex */
public final class C1869r7 extends AbstractC1688c3 {

    /* renamed from: c */
    protected C1880s7 f8006c;

    /* renamed from: d */
    private volatile C1880s7 f8007d;

    /* renamed from: e */
    private C1880s7 f8008e;

    /* renamed from: f */
    private final Map<Activity, C1880s7> f8009f;

    /* renamed from: g */
    private String f8010g;

    public C1869r7(C1774j5 c1774j5) {
        super(c1774j5);
        this.f8009f = new C0500c0();
    }

    /* renamed from: a */
    private static String m9761a(String str) {
        String[] split = str.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    /* renamed from: a */
    private final void m9762a(Activity activity, C1880s7 c1880s7, boolean z) {
        C1880s7 c1880s72 = this.f8007d == null ? this.f8008e : this.f8007d;
        C1880s7 c1880s73 = c1880s7.f8055b == null ? new C1880s7(c1880s7.f8054a, m9761a(activity.getClass().getCanonicalName()), c1880s7.f8056c) : c1880s7;
        this.f8008e = this.f8007d;
        this.f8007d = c1880s73;
        mo9320g().m9344a(new RunnableC1902u7(this, z, mo9321h().mo7376b(), c1880s72, c1880s73));
    }

    /* renamed from: a */
    public static void m9764a(C1880s7 c1880s7, Bundle bundle, boolean z) {
        if (bundle != null && c1880s7 != null && (!bundle.containsKey("_sc") || z)) {
            String str = c1880s7.f8054a;
            if (str != null) {
                bundle.putString("_sn", str);
            } else {
                bundle.remove("_sn");
            }
            bundle.putString("_sc", c1880s7.f8055b);
            bundle.putLong("_si", c1880s7.f8056c);
            return;
        }
        if (bundle != null && c1880s7 == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m9765a(C1880s7 c1880s7, boolean z, long j) {
        m9196o().m9900a(mo9321h().mo7376b());
        if (m9202u().m9886a(c1880s7.f8057d, z, j)) {
            c1880s7.f8057d = false;
        }
    }

    /* renamed from: d */
    private final C1880s7 m9766d(Activity activity) {
        C1057u.m7286a(activity);
        C1880s7 c1880s7 = this.f8009f.get(activity);
        if (c1880s7 != null) {
            return c1880s7;
        }
        C1880s7 c1880s72 = new C1880s7(null, m9761a(activity.getClass().getCanonicalName()), m9322i().m9961t());
        this.f8009f.put(activity, c1880s72);
        return c1880s72;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1688c3
    /* renamed from: A */
    protected final boolean mo9090A() {
        return false;
    }

    /* renamed from: B */
    public final C1880s7 m9767B() {
        m9110x();
        mo9194c();
        return this.f8006c;
    }

    /* renamed from: C */
    public final C1880s7 m9768C() {
        mo9193a();
        return this.f8007d;
    }

    /* renamed from: a */
    public final void m9769a(Activity activity) {
        m9762a(activity, m9766d(activity), false);
        C1949z o = m9196o();
        o.mo9320g().m9344a(new RunnableC1662a1(o, o.mo9321h().mo7376b()));
    }

    /* renamed from: a */
    public final void m9770a(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f8009f.put(activity, new C1880s7(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    /* renamed from: a */
    public final void m9771a(Activity activity, String str, String str2) {
        if (this.f8007d == null) {
            mo9324k().m9314y().m9365a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.f8009f.get(activity) == null) {
            mo9324k().m9314y().m9365a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = m9761a(activity.getClass().getCanonicalName());
        }
        boolean equals = this.f8007d.f8055b.equals(str2);
        boolean m9924c = C1959z9.m9924c(this.f8007d.f8054a, str);
        if (equals && m9924c) {
            mo9324k().m9314y().m9365a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > 100)) {
            mo9324k().m9314y().m9366a("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > 100)) {
            mo9324k().m9314y().m9366a("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        mo9324k().m9304B().m9367a("Setting current screen to name, class", str == null ? "null" : str, str2);
        C1880s7 c1880s7 = new C1880s7(str, str2, m9322i().m9961t());
        this.f8009f.put(activity, c1880s7);
        m9762a(activity, c1880s7, true);
    }

    /* renamed from: a */
    public final void m9772a(String str, C1880s7 c1880s7) {
        mo9194c();
        synchronized (this) {
            if (this.f8010g == null || this.f8010g.equals(str) || c1880s7 != null) {
                this.f8010g = str;
            }
        }
    }

    /* renamed from: b */
    public final void m9773b(Activity activity) {
        C1880s7 m9766d = m9766d(activity);
        this.f8008e = this.f8007d;
        this.f8007d = null;
        mo9320g().m9344a(new RunnableC1891t7(this, m9766d, mo9321h().mo7376b()));
    }

    /* renamed from: b */
    public final void m9774b(Activity activity, Bundle bundle) {
        C1880s7 c1880s7;
        if (bundle == null || (c1880s7 = this.f8009f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c1880s7.f8056c);
        bundle2.putString("name", c1880s7.f8054a);
        bundle2.putString("referrer_name", c1880s7.f8055b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* renamed from: c */
    public final void m9775c(Activity activity) {
        this.f8009f.remove(activity);
    }
}
