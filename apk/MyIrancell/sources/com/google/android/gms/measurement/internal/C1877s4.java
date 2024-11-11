package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.s4 */
/* loaded from: classes.dex */
public final class C1877s4 extends AbstractC1703d6 {

    /* renamed from: C */
    static final Pair<String, Long> f8018C = new Pair<>("", 0L);

    /* renamed from: A */
    public C1888t4 f8019A;

    /* renamed from: B */
    public final C1910v4 f8020B;

    /* renamed from: c */
    private SharedPreferences f8021c;

    /* renamed from: d */
    public C1921w4 f8022d;

    /* renamed from: e */
    public final C1888t4 f8023e;

    /* renamed from: f */
    public final C1888t4 f8024f;

    /* renamed from: g */
    public final C1888t4 f8025g;

    /* renamed from: h */
    public final C1888t4 f8026h;

    /* renamed from: i */
    public final C1888t4 f8027i;

    /* renamed from: j */
    public final C1888t4 f8028j;

    /* renamed from: k */
    public final C1888t4 f8029k;

    /* renamed from: l */
    public final C1910v4 f8030l;

    /* renamed from: m */
    private String f8031m;

    /* renamed from: n */
    private boolean f8032n;

    /* renamed from: o */
    private long f8033o;

    /* renamed from: p */
    public final C1888t4 f8034p;

    /* renamed from: q */
    public final C1888t4 f8035q;

    /* renamed from: r */
    public final C1899u4 f8036r;

    /* renamed from: s */
    public final C1910v4 f8037s;

    /* renamed from: t */
    public final C1899u4 f8038t;

    /* renamed from: u */
    public final C1899u4 f8039u;

    /* renamed from: v */
    public final C1888t4 f8040v;

    /* renamed from: w */
    public final C1888t4 f8041w;

    /* renamed from: x */
    public boolean f8042x;

    /* renamed from: y */
    public C1899u4 f8043y;

    /* renamed from: z */
    public C1899u4 f8044z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1877s4(C1774j5 c1774j5) {
        super(c1774j5);
        this.f8023e = new C1888t4(this, "last_upload", 0L);
        this.f8024f = new C1888t4(this, "last_upload_attempt", 0L);
        this.f8025g = new C1888t4(this, "backoff", 0L);
        this.f8026h = new C1888t4(this, "last_delete_stale", 0L);
        this.f8034p = new C1888t4(this, "time_before_start", 10000L);
        this.f8035q = new C1888t4(this, "session_timeout", 1800000L);
        this.f8036r = new C1899u4(this, "start_new_session", true);
        this.f8040v = new C1888t4(this, "last_pause_time", 0L);
        this.f8041w = new C1888t4(this, "time_active", 0L);
        this.f8037s = new C1910v4(this, "non_personalized_ads", null);
        this.f8038t = new C1899u4(this, "use_dynamite_api", false);
        this.f8039u = new C1899u4(this, "allow_remote_dynamite", false);
        this.f8027i = new C1888t4(this, "midnight_offset", 0L);
        this.f8028j = new C1888t4(this, "first_open_time", 0L);
        this.f8029k = new C1888t4(this, "app_install_time", 0L);
        this.f8030l = new C1910v4(this, "app_instance_id", null);
        this.f8043y = new C1899u4(this, "app_backgrounded", false);
        this.f8044z = new C1899u4(this, "deep_link_retrieval_complete", false);
        this.f8019A = new C1888t4(this, "deep_link_retrieval_attempts", 0L);
        this.f8020B = new C1910v4(this, "firebase_feature_rollouts", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public final boolean m9776A() {
        return this.f8021c.contains("deferred_analytics_collection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final Pair<String, Boolean> m9777a(String str) {
        mo9194c();
        long mo7376b = mo9321h().mo7376b();
        if (this.f8031m != null && mo7376b < this.f8033o) {
            return new Pair<>(this.f8031m, Boolean.valueOf(this.f8032n));
        }
        this.f8033o = mo7376b + m9326m().m9477a(str, C1828o.f7852b);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(mo9325l());
            if (advertisingIdInfo != null) {
                this.f8031m = advertisingIdInfo.getId();
                this.f8032n = advertisingIdInfo.isLimitAdTrackingEnabled();
            }
            if (this.f8031m == null) {
                this.f8031m = "";
            }
        } catch (Exception e) {
            mo9324k().m9303A().m9366a("Unable to get advertising id", e);
            this.f8031m = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.f8031m, Boolean.valueOf(this.f8032n));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m9778a(boolean z) {
        mo9194c();
        SharedPreferences.Editor edit = m9785t().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m9779a(long j) {
        return j - this.f8035q.m9792a() > this.f8040v.m9792a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final String m9780b(String str) {
        mo9194c();
        String str2 = (String) m9777a(str).first;
        MessageDigest m9929y = C1959z9.m9929y();
        if (m9929y == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, m9929y.digest(str2.getBytes())));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m9781b(boolean z) {
        mo9194c();
        SharedPreferences.Editor edit = m9785t().edit();
        edit.putBoolean("measurement_enabled", z);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m9782c(String str) {
        mo9194c();
        SharedPreferences.Editor edit = m9785t().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m9783c(boolean z) {
        mo9194c();
        mo9324k().m9304B().m9366a("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = m9785t().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m9784d(String str) {
        mo9194c();
        SharedPreferences.Editor edit = m9785t().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1703d6
    /* renamed from: n */
    protected final void mo9219n() {
        SharedPreferences sharedPreferences = mo9325l().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f8021c = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.f8042x = z;
        if (!z) {
            SharedPreferences.Editor edit = this.f8021c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f8022d = new C1921w4(this, "health_monitor", Math.max(0L, C1828o.f7854c.m9875a(null).longValue()));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1703d6
    /* renamed from: r */
    protected final boolean mo9123r() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public final SharedPreferences m9785t() {
        mo9194c();
        m9220o();
        return this.f8021c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final String m9786u() {
        mo9194c();
        return m9785t().getString("gmp_app_id", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public final String m9787v() {
        mo9194c();
        return m9785t().getString("admob_app_id", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public final Boolean m9788w() {
        mo9194c();
        if (m9785t().contains("use_service")) {
            return Boolean.valueOf(m9785t().getBoolean("use_service", false));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public final void m9789x() {
        mo9194c();
        Boolean m9790y = m9790y();
        SharedPreferences.Editor edit = m9785t().edit();
        edit.clear();
        edit.apply();
        if (m9790y != null) {
            m9781b(m9790y.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public final Boolean m9790y() {
        mo9194c();
        if (m9785t().contains("measurement_enabled")) {
            return Boolean.valueOf(m9785t().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public final String m9791z() {
        mo9194c();
        String string = m9785t().getString("previous_os_version", null);
        m9318e().m9220o();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = m9785t().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }
}
