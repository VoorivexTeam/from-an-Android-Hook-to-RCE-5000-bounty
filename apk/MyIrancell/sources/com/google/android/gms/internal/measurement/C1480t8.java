package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.t8 */
/* loaded from: classes.dex */
public final class C1480t8 implements InterfaceC1438q8 {

    /* renamed from: A */
    private static final AbstractC1529x1<Long> f6910A;

    /* renamed from: B */
    private static final AbstractC1529x1<Long> f6911B;

    /* renamed from: C */
    private static final AbstractC1529x1<Long> f6912C;

    /* renamed from: D */
    private static final AbstractC1529x1<Long> f6913D;

    /* renamed from: E */
    private static final AbstractC1529x1<Long> f6914E;

    /* renamed from: F */
    private static final AbstractC1529x1<String> f6915F;

    /* renamed from: G */
    private static final AbstractC1529x1<Long> f6916G;

    /* renamed from: a */
    private static final AbstractC1529x1<Long> f6917a;

    /* renamed from: b */
    private static final AbstractC1529x1<Long> f6918b;

    /* renamed from: c */
    private static final AbstractC1529x1<String> f6919c;

    /* renamed from: d */
    private static final AbstractC1529x1<String> f6920d;

    /* renamed from: e */
    private static final AbstractC1529x1<Long> f6921e;

    /* renamed from: f */
    private static final AbstractC1529x1<Long> f6922f;

    /* renamed from: g */
    private static final AbstractC1529x1<Long> f6923g;

    /* renamed from: h */
    private static final AbstractC1529x1<Long> f6924h;

    /* renamed from: i */
    private static final AbstractC1529x1<Long> f6925i;

    /* renamed from: j */
    private static final AbstractC1529x1<Long> f6926j;

    /* renamed from: k */
    private static final AbstractC1529x1<Long> f6927k;

    /* renamed from: l */
    private static final AbstractC1529x1<Long> f6928l;

    /* renamed from: m */
    private static final AbstractC1529x1<Long> f6929m;

    /* renamed from: n */
    private static final AbstractC1529x1<Long> f6930n;

    /* renamed from: o */
    private static final AbstractC1529x1<Long> f6931o;

    /* renamed from: p */
    private static final AbstractC1529x1<Long> f6932p;

    /* renamed from: q */
    private static final AbstractC1529x1<Long> f6933q;

    /* renamed from: r */
    private static final AbstractC1529x1<Long> f6934r;

    /* renamed from: s */
    private static final AbstractC1529x1<Long> f6935s;

    /* renamed from: t */
    private static final AbstractC1529x1<Long> f6936t;

    /* renamed from: u */
    private static final AbstractC1529x1<Long> f6937u;

    /* renamed from: v */
    private static final AbstractC1529x1<Long> f6938v;

    /* renamed from: w */
    private static final AbstractC1529x1<Long> f6939w;

    /* renamed from: x */
    private static final AbstractC1529x1<Long> f6940x;

    /* renamed from: y */
    private static final AbstractC1529x1<Long> f6941y;

    /* renamed from: z */
    private static final AbstractC1529x1<Long> f6942z;

    static {
        C1239d2 c1239d2 = new C1239d2(C1487u1.m8491a("com.google.android.gms.measurement"));
        f6917a = c1239d2.m7727a("measurement.ad_id_cache_time", 10000L);
        f6918b = c1239d2.m7727a("measurement.config.cache_time", 86400000L);
        c1239d2.m7728a("measurement.log_tag", "FA");
        f6919c = c1239d2.m7728a("measurement.config.url_authority", "app-measurement.com");
        f6920d = c1239d2.m7728a("measurement.config.url_scheme", "https");
        f6921e = c1239d2.m7727a("measurement.upload.debug_upload_interval", 1000L);
        f6922f = c1239d2.m7727a("measurement.lifetimevalue.max_currency_tracked", 4L);
        f6923g = c1239d2.m7727a("measurement.store.max_stored_events_per_app", 100000L);
        f6924h = c1239d2.m7727a("measurement.experiment.max_ids", 50L);
        f6925i = c1239d2.m7727a("measurement.audience.filter_result_max_count", 200L);
        f6926j = c1239d2.m7727a("measurement.alarm_manager.minimum_interval", 60000L);
        f6927k = c1239d2.m7727a("measurement.upload.minimum_delay", 500L);
        f6928l = c1239d2.m7727a("measurement.monitoring.sample_period_millis", 86400000L);
        f6929m = c1239d2.m7727a("measurement.upload.realtime_upload_interval", 10000L);
        f6930n = c1239d2.m7727a("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        c1239d2.m7727a("measurement.config.cache_time.service", 3600000L);
        f6931o = c1239d2.m7727a("measurement.service_client.idle_disconnect_millis", 5000L);
        c1239d2.m7728a("measurement.log_tag.service", "FA-SVC");
        f6932p = c1239d2.m7727a("measurement.upload.stale_data_deletion_interval", 86400000L);
        f6933q = c1239d2.m7727a("measurement.upload.backoff_period", 43200000L);
        f6934r = c1239d2.m7727a("measurement.upload.initial_upload_delay_time", 15000L);
        f6935s = c1239d2.m7727a("measurement.upload.interval", 3600000L);
        f6936t = c1239d2.m7727a("measurement.upload.max_bundle_size", 65536L);
        f6937u = c1239d2.m7727a("measurement.upload.max_bundles", 100L);
        f6938v = c1239d2.m7727a("measurement.upload.max_conversions_per_day", 500L);
        f6939w = c1239d2.m7727a("measurement.upload.max_error_events_per_day", 1000L);
        f6940x = c1239d2.m7727a("measurement.upload.max_events_per_bundle", 1000L);
        f6941y = c1239d2.m7727a("measurement.upload.max_events_per_day", 100000L);
        f6942z = c1239d2.m7727a("measurement.upload.max_public_events_per_day", 50000L);
        f6910A = c1239d2.m7727a("measurement.upload.max_queue_time", 2419200000L);
        f6911B = c1239d2.m7727a("measurement.upload.max_realtime_events_per_day", 10L);
        f6912C = c1239d2.m7727a("measurement.upload.max_batch_size", 65536L);
        f6913D = c1239d2.m7727a("measurement.upload.retry_count", 6L);
        f6914E = c1239d2.m7727a("measurement.upload.retry_time", 1800000L);
        f6915F = c1239d2.m7728a("measurement.upload.url", "https://app-measurement.com/a");
        f6916G = c1239d2.m7727a("measurement.upload.window_interval", 3600000L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1438q8
    /* renamed from: A */
    public final long mo8217A() {
        return f6931o.m8878b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1438q8
    /* renamed from: B */
    public final long mo8218B() {
        return f6911B.m8878b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1438q8
    /* renamed from: C */
    public final long mo8219C() {
        return f6940x.m8878b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1438q8
    /* renamed from: D */
    public final String mo8220D() {
        return f6915F.m8878b();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1438q8
    /* renamed from: E */
    public final long mo8221E() {
        return f6936t.m8878b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1438q8
    /* renamed from: a */
    public final String mo8222a() {
        return f6920d.m8878b();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1438q8
    /* renamed from: b */
    public final String mo8223b() {
        return f6919c.m8878b();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1438q8
    /* renamed from: c */
    public final long mo8224c() {
        return f6921e.m8878b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1438q8
    /* renamed from: d */
    public final long mo8225d() {
        return f6937u.m8878b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1438q8
    /* renamed from: e */
    public final long mo8226e() {
        return f6922f.m8878b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1438q8
    /* renamed from: f */
    public final long mo8227f() {
        return f6924h.m8878b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1438q8
    /* renamed from: g */
    public final long mo8228g() {
        return f6933q.m8878b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1438q8
    /* renamed from: h */
    public final long mo8229h() {
        return f6929m.m8878b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1438q8
    /* renamed from: i */
    public final long mo8230i() {
        return f6938v.m8878b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1438q8
    /* renamed from: j */
    public final long mo8231j() {
        return f6925i.m8878b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1438q8
    /* renamed from: k */
    public final long mo8232k() {
        return f6934r.m8878b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1438q8
    /* renamed from: l */
    public final long mo8233l() {
        return f6930n.m8878b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1438q8
    /* renamed from: m */
    public final long mo8234m() {
        return f6926j.m8878b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1438q8
    /* renamed from: n */
    public final long mo8235n() {
        return f6927k.m8878b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1438q8
    /* renamed from: o */
    public final long mo8236o() {
        return f6923g.m8878b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1438q8
    /* renamed from: p */
    public final long mo8237p() {
        return f6932p.m8878b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1438q8
    /* renamed from: q */
    public final long mo8238q() {
        return f6928l.m8878b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1438q8
    /* renamed from: r */
    public final long mo8239r() {
        return f6912C.m8878b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1438q8
    /* renamed from: s */
    public final long mo8240s() {
        return f6941y.m8878b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1438q8
    /* renamed from: t */
    public final long mo8241t() {
        return f6916G.m8878b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1438q8
    /* renamed from: u */
    public final long mo8242u() {
        return f6942z.m8878b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1438q8
    /* renamed from: v */
    public final long mo8243v() {
        return f6913D.m8878b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1438q8
    /* renamed from: w */
    public final long mo8244w() {
        return f6910A.m8878b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1438q8
    /* renamed from: x */
    public final long mo8245x() {
        return f6939w.m8878b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1438q8
    /* renamed from: y */
    public final long mo8246y() {
        return f6914E.m8878b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1438q8
    /* renamed from: z */
    public final long mo8247z() {
        return f6935s.m8878b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1438q8
    public final long zza() {
        return f6917a.m8878b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1438q8
    public final long zzb() {
        return f6918b.m8878b().longValue();
    }
}
