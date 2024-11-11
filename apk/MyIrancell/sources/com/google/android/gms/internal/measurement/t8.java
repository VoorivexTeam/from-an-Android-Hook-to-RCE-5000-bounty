package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class t8 implements q8 {
    private static final x1<Long> A;
    private static final x1<Long> B;
    private static final x1<Long> C;
    private static final x1<Long> D;
    private static final x1<Long> E;
    private static final x1<String> F;
    private static final x1<Long> G;
    private static final x1<Long> a;
    private static final x1<Long> b;
    private static final x1<String> c;
    private static final x1<String> d;
    private static final x1<Long> e;
    private static final x1<Long> f;
    private static final x1<Long> g;
    private static final x1<Long> h;
    private static final x1<Long> i;
    private static final x1<Long> j;
    private static final x1<Long> k;
    private static final x1<Long> l;
    private static final x1<Long> m;
    private static final x1<Long> n;
    private static final x1<Long> o;
    private static final x1<Long> p;
    private static final x1<Long> q;
    private static final x1<Long> r;
    private static final x1<Long> s;
    private static final x1<Long> t;
    private static final x1<Long> u;
    private static final x1<Long> v;
    private static final x1<Long> w;
    private static final x1<Long> x;
    private static final x1<Long> y;
    private static final x1<Long> z;

    static {
        d2 d2Var = new d2(u1.a("com.google.android.gms.measurement"));
        a = d2Var.a("measurement.ad_id_cache_time", 10000L);
        b = d2Var.a("measurement.config.cache_time", 86400000L);
        d2Var.a("measurement.log_tag", "FA");
        c = d2Var.a("measurement.config.url_authority", "app-measurement.com");
        d = d2Var.a("measurement.config.url_scheme", "https");
        e = d2Var.a("measurement.upload.debug_upload_interval", 1000L);
        f = d2Var.a("measurement.lifetimevalue.max_currency_tracked", 4L);
        g = d2Var.a("measurement.store.max_stored_events_per_app", 100000L);
        h = d2Var.a("measurement.experiment.max_ids", 50L);
        i = d2Var.a("measurement.audience.filter_result_max_count", 200L);
        j = d2Var.a("measurement.alarm_manager.minimum_interval", 60000L);
        k = d2Var.a("measurement.upload.minimum_delay", 500L);
        l = d2Var.a("measurement.monitoring.sample_period_millis", 86400000L);
        m = d2Var.a("measurement.upload.realtime_upload_interval", 10000L);
        n = d2Var.a("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        d2Var.a("measurement.config.cache_time.service", 3600000L);
        o = d2Var.a("measurement.service_client.idle_disconnect_millis", 5000L);
        d2Var.a("measurement.log_tag.service", "FA-SVC");
        p = d2Var.a("measurement.upload.stale_data_deletion_interval", 86400000L);
        q = d2Var.a("measurement.upload.backoff_period", 43200000L);
        r = d2Var.a("measurement.upload.initial_upload_delay_time", 15000L);
        s = d2Var.a("measurement.upload.interval", 3600000L);
        t = d2Var.a("measurement.upload.max_bundle_size", 65536L);
        u = d2Var.a("measurement.upload.max_bundles", 100L);
        v = d2Var.a("measurement.upload.max_conversions_per_day", 500L);
        w = d2Var.a("measurement.upload.max_error_events_per_day", 1000L);
        x = d2Var.a("measurement.upload.max_events_per_bundle", 1000L);
        y = d2Var.a("measurement.upload.max_events_per_day", 100000L);
        z = d2Var.a("measurement.upload.max_public_events_per_day", 50000L);
        A = d2Var.a("measurement.upload.max_queue_time", 2419200000L);
        B = d2Var.a("measurement.upload.max_realtime_events_per_day", 10L);
        C = d2Var.a("measurement.upload.max_batch_size", 65536L);
        D = d2Var.a("measurement.upload.retry_count", 6L);
        E = d2Var.a("measurement.upload.retry_time", 1800000L);
        F = d2Var.a("measurement.upload.url", "https://app-measurement.com/a");
        G = d2Var.a("measurement.upload.window_interval", 3600000L);
    }

    @Override // com.google.android.gms.internal.measurement.q8
    public final long A() {
        return o.b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.q8
    public final long B() {
        return B.b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.q8
    public final long C() {
        return x.b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.q8
    public final String D() {
        return F.b();
    }

    @Override // com.google.android.gms.internal.measurement.q8
    public final long E() {
        return t.b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.q8
    public final String a() {
        return d.b();
    }

    @Override // com.google.android.gms.internal.measurement.q8
    public final String b() {
        return c.b();
    }

    @Override // com.google.android.gms.internal.measurement.q8
    public final long c() {
        return e.b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.q8
    public final long d() {
        return u.b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.q8
    public final long e() {
        return f.b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.q8
    public final long f() {
        return h.b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.q8
    public final long g() {
        return q.b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.q8
    public final long h() {
        return m.b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.q8
    public final long i() {
        return v.b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.q8
    public final long j() {
        return i.b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.q8
    public final long k() {
        return r.b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.q8
    public final long l() {
        return n.b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.q8
    public final long m() {
        return j.b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.q8
    public final long n() {
        return k.b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.q8
    public final long o() {
        return g.b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.q8
    public final long p() {
        return p.b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.q8
    public final long q() {
        return l.b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.q8
    public final long r() {
        return C.b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.q8
    public final long s() {
        return y.b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.q8
    public final long t() {
        return G.b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.q8
    public final long u() {
        return z.b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.q8
    public final long v() {
        return D.b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.q8
    public final long w() {
        return A.b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.q8
    public final long x() {
        return w.b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.q8
    public final long y() {
        return E.b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.q8
    public final long z() {
        return s.b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.q8
    public final long zza() {
        return a.b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.q8
    public final long zzb() {
        return b.b().longValue();
    }
}
