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
/* loaded from: classes.dex */
public final class s4 extends d6 {
    static final Pair<String, Long> C = new Pair<>("", 0L);
    public t4 A;
    public final v4 B;
    private SharedPreferences c;
    public w4 d;
    public final t4 e;
    public final t4 f;
    public final t4 g;
    public final t4 h;
    public final t4 i;
    public final t4 j;
    public final t4 k;
    public final v4 l;
    private String m;
    private boolean n;
    private long o;
    public final t4 p;
    public final t4 q;
    public final u4 r;
    public final v4 s;
    public final u4 t;
    public final u4 u;
    public final t4 v;
    public final t4 w;
    public boolean x;
    public u4 y;
    public u4 z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s4(j5 j5Var) {
        super(j5Var);
        this.e = new t4(this, "last_upload", 0L);
        this.f = new t4(this, "last_upload_attempt", 0L);
        this.g = new t4(this, "backoff", 0L);
        this.h = new t4(this, "last_delete_stale", 0L);
        this.p = new t4(this, "time_before_start", 10000L);
        this.q = new t4(this, "session_timeout", 1800000L);
        this.r = new u4(this, "start_new_session", true);
        this.v = new t4(this, "last_pause_time", 0L);
        this.w = new t4(this, "time_active", 0L);
        this.s = new v4(this, "non_personalized_ads", null);
        this.t = new u4(this, "use_dynamite_api", false);
        this.u = new u4(this, "allow_remote_dynamite", false);
        this.i = new t4(this, "midnight_offset", 0L);
        this.j = new t4(this, "first_open_time", 0L);
        this.k = new t4(this, "app_install_time", 0L);
        this.l = new v4(this, "app_instance_id", null);
        this.y = new u4(this, "app_backgrounded", false);
        this.z = new u4(this, "deep_link_retrieval_complete", false);
        this.A = new t4(this, "deep_link_retrieval_attempts", 0L);
        this.B = new v4(this, "firebase_feature_rollouts", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean A() {
        return this.c.contains("deferred_analytics_collection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Pair<String, Boolean> a(String str) {
        c();
        long b = h().b();
        if (this.m != null && b < this.o) {
            return new Pair<>(this.m, Boolean.valueOf(this.n));
        }
        this.o = b + m().a(str, o.b);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(l());
            if (advertisingIdInfo != null) {
                this.m = advertisingIdInfo.getId();
                this.n = advertisingIdInfo.isLimitAdTrackingEnabled();
            }
            if (this.m == null) {
                this.m = "";
            }
        } catch (Exception e) {
            k().A().a("Unable to get advertising id", e);
            this.m = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.m, Boolean.valueOf(this.n));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        c();
        SharedPreferences.Editor edit = t().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(long j) {
        return j - this.q.a() > this.v.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String b(String str) {
        c();
        String str2 = (String) a(str).first;
        MessageDigest y = z9.y();
        if (y == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, y.digest(str2.getBytes())));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(boolean z) {
        c();
        SharedPreferences.Editor edit = t().edit();
        edit.putBoolean("measurement_enabled", z);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(String str) {
        c();
        SharedPreferences.Editor edit = t().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(boolean z) {
        c();
        k().B().a("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = t().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(String str) {
        c();
        SharedPreferences.Editor edit = t().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    @Override // com.google.android.gms.measurement.internal.d6
    protected final void n() {
        SharedPreferences sharedPreferences = l().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.c = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.x = z;
        if (!z) {
            SharedPreferences.Editor edit = this.c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.d = new w4(this, "health_monitor", Math.max(0L, o.c.a(null).longValue()));
    }

    @Override // com.google.android.gms.measurement.internal.d6
    protected final boolean r() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final SharedPreferences t() {
        c();
        o();
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String u() {
        c();
        return t().getString("gmp_app_id", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String v() {
        c();
        return t().getString("admob_app_id", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean w() {
        c();
        if (t().contains("use_service")) {
            return Boolean.valueOf(t().getBoolean("use_service", false));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void x() {
        c();
        Boolean y = y();
        SharedPreferences.Editor edit = t().edit();
        edit.clear();
        edit.apply();
        if (y != null) {
            b(y.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean y() {
        c();
        if (t().contains("measurement_enabled")) {
            return Boolean.valueOf(t().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String z() {
        c();
        String string = t().getString("previous_os_version", null);
        e().o();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = t().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }
}
