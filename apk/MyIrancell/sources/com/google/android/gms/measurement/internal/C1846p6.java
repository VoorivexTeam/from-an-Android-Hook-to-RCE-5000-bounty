package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.C0903h;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.internal.measurement.C1440qa;
import com.google.android.gms.internal.measurement.C1523w9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;
import p000.C0500c0;

/* renamed from: com.google.android.gms.measurement.internal.p6 */
/* loaded from: classes.dex */
public final class C1846p6 extends AbstractC1688c3 {

    /* renamed from: c */
    protected C1752h7 f7963c;

    /* renamed from: d */
    private InterfaceC1787k6 f7964d;

    /* renamed from: e */
    private final Set<InterfaceC1823n6> f7965e;

    /* renamed from: f */
    private boolean f7966f;

    /* renamed from: g */
    private final AtomicReference<String> f7967g;

    /* renamed from: h */
    protected boolean f7968h;

    /* JADX INFO: Access modifiers changed from: protected */
    public C1846p6(C1774j5 c1774j5) {
        super(c1774j5);
        this.f7965e = new CopyOnWriteArraySet();
        this.f7968h = true;
        this.f7967g = new AtomicReference<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public final void m9701M() {
        if (m9326m().m9480a(C1828o.f7853b0)) {
            mo9194c();
            String m9807a = m9323j().f8037s.m9807a();
            if (m9807a != null) {
                if ("unset".equals(m9807a)) {
                    m9741a("app", "_npa", (Object) null, mo9321h().mo7375a());
                } else {
                    m9741a("app", "_npa", Long.valueOf("true".equals(m9807a) ? 1L : 0L), mo9321h().mo7375a());
                }
            }
        }
        if (!this.f7550a.m9411c() || !this.f7968h) {
            mo9324k().m9303A().m9365a("Updating Scion state (FE)");
            m9199r().m9856C();
            return;
        }
        mo9324k().m9303A().m9365a("Recording app launch after enabling measurement for the first time (FE)");
        m9722I();
        if (C1440qa.m8253a() && m9326m().m9480a(C1828o.f7831Q0)) {
            m9202u().f8178d.m9380a();
        }
        if (C1523w9.m8639a() && m9326m().m9480a(C1828o.f7843W0)) {
            if (this.f7550a.m9423t().f8185a.m9420q().f8029k.m9792a() > 0) {
                return;
            }
            this.f7550a.m9423t().m9889a();
        }
    }

    /* renamed from: a */
    private final void m9705a(String str, String str2, long j, Object obj) {
        mo9320g().m9344a(new RunnableC1879s6(this, str, str2, obj, j));
    }

    /* renamed from: b */
    private final ArrayList<Bundle> m9706b(String str, String str2, String str3) {
        if (mo9320g().m9347t()) {
            mo9324k().m9309t().m9365a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        }
        if (C1791ka.m9464a()) {
            mo9324k().m9309t().m9365a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f7550a.mo9320g().m9342a(atomicReference, 5000L, "get conditional user properties", new RunnableC1923w6(this, atomicReference, str, str2, str3));
        List list = (List) atomicReference.get();
        if (list != null) {
            return C1959z9.m9921b((List<zzv>) list);
        }
        mo9324k().m9309t().m9366a("Timed out waiting for get conditional user properties", str);
        return new ArrayList<>();
    }

    /* renamed from: b */
    private final Map<String, Object> m9707b(String str, String str2, String str3, boolean z) {
        C1749h4 m9309t;
        String str4;
        if (mo9320g().m9347t()) {
            m9309t = mo9324k().m9309t();
            str4 = "Cannot get user properties from analytics worker thread";
        } else {
            if (!C1791ka.m9464a()) {
                AtomicReference atomicReference = new AtomicReference();
                this.f7550a.mo9320g().m9342a(atomicReference, 5000L, "get user properties", new RunnableC1945y6(this, atomicReference, str, str2, str3, z));
                List<zzkq> list = (List) atomicReference.get();
                if (list == null) {
                    mo9324k().m9309t().m9366a("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                    return Collections.emptyMap();
                }
                C0500c0 c0500c0 = new C0500c0(list.size());
                for (zzkq zzkqVar : list) {
                    c0500c0.put(zzkqVar.f8225c, zzkqVar.zza());
                }
                return c0500c0;
            }
            m9309t = mo9324k().m9309t();
            str4 = "Cannot get user properties from main thread";
        }
        m9309t.m9365a(str4);
        return Collections.emptyMap();
    }

    /* renamed from: b */
    private final void m9708b(Bundle bundle, long j) {
        C1057u.m7286a(bundle);
        C1739g6.m9348a(bundle, "app_id", String.class, null);
        C1739g6.m9348a(bundle, "origin", String.class, null);
        C1739g6.m9348a(bundle, "name", String.class, null);
        C1739g6.m9348a(bundle, "value", Object.class, null);
        C1739g6.m9348a(bundle, "trigger_event_name", String.class, null);
        C1739g6.m9348a(bundle, "trigger_timeout", Long.class, 0L);
        C1739g6.m9348a(bundle, "timed_out_event_name", String.class, null);
        C1739g6.m9348a(bundle, "timed_out_event_params", Bundle.class, null);
        C1739g6.m9348a(bundle, "triggered_event_name", String.class, null);
        C1739g6.m9348a(bundle, "triggered_event_params", Bundle.class, null);
        C1739g6.m9348a(bundle, "time_to_live", Long.class, 0L);
        C1739g6.m9348a(bundle, "expired_event_name", String.class, null);
        C1739g6.m9348a(bundle, "expired_event_params", Bundle.class, null);
        C1057u.m7296b(bundle.getString("name"));
        C1057u.m7296b(bundle.getString("origin"));
        C1057u.m7286a(bundle.get("value"));
        bundle.putLong("creation_timestamp", j);
        String string = bundle.getString("name");
        Object obj = bundle.get("value");
        if (m9322i().m9955b(string) != 0) {
            mo9324k().m9309t().m9366a("Invalid conditional user property name", m9319f().m9122c(string));
            return;
        }
        if (m9322i().m9956b(string, obj) != 0) {
            mo9324k().m9309t().m9367a("Invalid conditional user property value", m9319f().m9122c(string), obj);
            return;
        }
        Object m9958c = m9322i().m9958c(string, obj);
        if (m9958c == null) {
            mo9324k().m9309t().m9367a("Unable to normalize conditional user property value", m9319f().m9122c(string), obj);
            return;
        }
        C1739g6.m9349a(bundle, m9958c);
        long j2 = bundle.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
            mo9324k().m9309t().m9367a("Invalid conditional user property timeout", m9319f().m9122c(string), Long.valueOf(j2));
            return;
        }
        long j3 = bundle.getLong("time_to_live");
        if (j3 > 15552000000L || j3 < 1) {
            mo9324k().m9309t().m9367a("Invalid conditional user property time to live", m9319f().m9122c(string), Long.valueOf(j3));
        } else {
            mo9320g().m9344a(new RunnableC1901u6(this, bundle));
        }
    }

    /* renamed from: b */
    private final void m9710b(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        mo9320g().m9344a(new RunnableC1857q6(this, str, str2, j, C1959z9.m9920b(bundle), z, z2, z3, str3));
    }

    /* renamed from: b */
    private final void m9711b(String str, String str2, String str3, Bundle bundle) {
        long mo7375a = mo9321h().mo7375a();
        C1057u.m7296b(str2);
        Bundle bundle2 = new Bundle();
        if (str != null) {
            bundle2.putString("app_id", str);
        }
        bundle2.putString("name", str2);
        bundle2.putLong("creation_timestamp", mo7375a);
        if (str3 != null) {
            bundle2.putString("expired_event_name", str3);
            bundle2.putBundle("expired_event_params", bundle);
        }
        mo9320g().m9344a(new RunnableC1934x6(this, bundle2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final void m9712c(Bundle bundle) {
        mo9194c();
        m9110x();
        C1057u.m7286a(bundle);
        C1057u.m7296b(bundle.getString("name"));
        C1057u.m7296b(bundle.getString("origin"));
        C1057u.m7286a(bundle.get("value"));
        if (!this.f7550a.m9411c()) {
            mo9324k().m9304B().m9365a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzkq zzkqVar = new zzkq(bundle.getString("name"), bundle.getLong("triggered_timestamp"), bundle.get("value"), bundle.getString("origin"));
        try {
            zzan m9936a = m9322i().m9936a(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), bundle.getString("origin"), 0L, true, false);
            m9199r().m9871a(new zzv(bundle.getString("app_id"), bundle.getString("origin"), zzkqVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), m9322i().m9936a(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), bundle.getString("origin"), 0L, true, false), bundle.getLong("trigger_timeout"), m9936a, bundle.getLong("time_to_live"), m9322i().m9936a(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString("origin"), 0L, true, false)));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final void m9713c(boolean z) {
        mo9194c();
        mo9193a();
        m9110x();
        mo9324k().m9303A().m9366a("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        m9323j().m9781b(z);
        m9701M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final void m9714d(Bundle bundle) {
        mo9194c();
        m9110x();
        C1057u.m7286a(bundle);
        C1057u.m7296b(bundle.getString("name"));
        if (!this.f7550a.m9411c()) {
            mo9324k().m9304B().m9365a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            m9199r().m9871a(new zzv(bundle.getString("app_id"), bundle.getString("origin"), new zzkq(bundle.getString("name"), 0L, null, null), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), m9322i().m9936a(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString("origin"), bundle.getLong("creation_timestamp"), true, false)));
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1688c3
    /* renamed from: A */
    protected final boolean mo9090A() {
        return false;
    }

    /* renamed from: B */
    public final void m9715B() {
        if (mo9325l().getApplicationContext() instanceof Application) {
            ((Application) mo9325l().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f7963c);
        }
    }

    /* renamed from: C */
    public final Boolean m9716C() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) mo9320g().m9342a(atomicReference, 15000L, "boolean test flag value", new RunnableC1868r6(this, atomicReference));
    }

    /* renamed from: D */
    public final String m9717D() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) mo9320g().m9342a(atomicReference, 15000L, "String test flag value", new RunnableC1956z6(this, atomicReference));
    }

    /* renamed from: E */
    public final Long m9718E() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) mo9320g().m9342a(atomicReference, 15000L, "long test flag value", new RunnableC1680b7(this, atomicReference));
    }

    /* renamed from: F */
    public final Integer m9719F() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) mo9320g().m9342a(atomicReference, 15000L, "int test flag value", new RunnableC1668a7(this, atomicReference));
    }

    /* renamed from: G */
    public final Double m9720G() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) mo9320g().m9342a(atomicReference, 15000L, "double test flag value", new RunnableC1716e7(this, atomicReference));
    }

    /* renamed from: H */
    public final String m9721H() {
        mo9193a();
        return this.f7967g.get();
    }

    /* renamed from: I */
    public final void m9722I() {
        mo9194c();
        mo9193a();
        m9110x();
        if (this.f7550a.m9417n()) {
            if (m9326m().m9480a(C1828o.f7897x0)) {
                C1803la m = m9326m();
                m.mo9317d();
                Boolean m9482b = m.m9482b("google_analytics_deferred_deep_link_enabled");
                if (m9482b != null && m9482b.booleanValue()) {
                    mo9324k().m9303A().m9365a("Deferred Deep Link feature enabled.");
                    mo9320g().m9344a(new Runnable(this) { // from class: com.google.android.gms.measurement.internal.o6

                        /* renamed from: b */
                        private final C1846p6 f7915b;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.f7915b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C1846p6 c1846p6 = this.f7915b;
                            c1846p6.mo9194c();
                            if (c1846p6.m9323j().f8044z.m9795a()) {
                                c1846p6.mo9324k().m9303A().m9365a("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long m9792a = c1846p6.m9323j().f8019A.m9792a();
                            c1846p6.m9323j().f8019A.m9793a(1 + m9792a);
                            if (m9792a < 5) {
                                c1846p6.f7550a.m9418o();
                            } else {
                                c1846p6.mo9324k().m9312w().m9365a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                c1846p6.m9323j().f8044z.m9794a(true);
                            }
                        }
                    });
                }
            }
            m9199r().m9858E();
            this.f7968h = false;
            String m9791z = m9323j().m9791z();
            if (TextUtils.isEmpty(m9791z)) {
                return;
            }
            m9318e().m9220o();
            if (m9791z.equals(Build.VERSION.RELEASE)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", m9791z);
            m9738a("auto", "_ou", bundle);
        }
    }

    /* renamed from: J */
    public final String m9723J() {
        C1880s7 m9768C = this.f7550a.m9400E().m9768C();
        if (m9768C != null) {
            return m9768C.f8054a;
        }
        return null;
    }

    /* renamed from: K */
    public final String m9724K() {
        C1880s7 m9768C = this.f7550a.m9400E().m9768C();
        if (m9768C != null) {
            return m9768C.f8055b;
        }
        return null;
    }

    /* renamed from: L */
    public final String m9725L() {
        if (this.f7550a.m9396A() != null) {
            return this.f7550a.m9396A();
        }
        try {
            return C0903h.m6773a();
        } catch (IllegalStateException e) {
            this.f7550a.mo9324k().m9309t().m9366a("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    /* renamed from: a */
    public final ArrayList<Bundle> m9726a(String str, String str2) {
        mo9193a();
        return m9706b((String) null, str, str2);
    }

    /* renamed from: a */
    public final ArrayList<Bundle> m9727a(String str, String str2, String str3) {
        C1057u.m7296b(str);
        m9195n();
        throw null;
    }

    /* renamed from: a */
    public final Map<String, Object> m9728a(String str, String str2, String str3, boolean z) {
        C1057u.m7296b(str);
        m9195n();
        throw null;
    }

    /* renamed from: a */
    public final Map<String, Object> m9729a(String str, String str2, boolean z) {
        mo9193a();
        return m9707b((String) null, str, str2, z);
    }

    /* renamed from: a */
    public final void m9730a(long j) {
        mo9193a();
        mo9320g().m9344a(new RunnableC1728f7(this, j));
    }

    /* renamed from: a */
    public final void m9731a(Bundle bundle) {
        m9732a(bundle, mo9321h().mo7375a());
    }

    /* renamed from: a */
    public final void m9732a(Bundle bundle, long j) {
        C1057u.m7286a(bundle);
        mo9193a();
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            mo9324k().m9312w().m9365a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        m9708b(bundle2, j);
    }

    /* renamed from: a */
    public final void m9733a(InterfaceC1787k6 interfaceC1787k6) {
        InterfaceC1787k6 interfaceC1787k62;
        mo9194c();
        mo9193a();
        m9110x();
        if (interfaceC1787k6 != null && interfaceC1787k6 != (interfaceC1787k62 = this.f7964d)) {
            C1057u.m7298b(interfaceC1787k62 == null, "EventInterceptor already set.");
        }
        this.f7964d = interfaceC1787k6;
    }

    /* renamed from: a */
    public final void m9734a(InterfaceC1823n6 interfaceC1823n6) {
        mo9193a();
        m9110x();
        C1057u.m7286a(interfaceC1823n6);
        if (this.f7965e.add(interfaceC1823n6)) {
            return;
        }
        mo9324k().m9312w().m9365a("OnEventListener already registered");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m9735a(String str) {
        this.f7967g.set(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m9736a(String str, String str2, long j, Bundle bundle) {
        mo9193a();
        mo9194c();
        m9737a(str, str2, j, bundle, true, this.f7964d == null || C1959z9.m9926f(str2), false, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0117  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9737a(java.lang.String r28, java.lang.String r29, long r30, android.os.Bundle r32, boolean r33, boolean r34, boolean r35, java.lang.String r36) {
        /*
            Method dump skipped, instructions count: 1456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1846p6.m9737a(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    /* renamed from: a */
    public final void m9738a(String str, String str2, Bundle bundle) {
        m9740a(str, str2, bundle, true, true, mo9321h().mo7375a());
    }

    /* renamed from: a */
    public final void m9739a(String str, String str2, Bundle bundle, boolean z) {
        m9740a(str, str2, bundle, false, true, mo9321h().mo7375a());
    }

    /* renamed from: a */
    public final void m9740a(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        mo9193a();
        m9710b(str == null ? "app" : str, str2, j, bundle == null ? new Bundle() : bundle, z2, !z2 || this.f7964d == null || C1959z9.m9926f(str2), !z, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9741a(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.C1057u.m7296b(r9)
            com.google.android.gms.common.internal.C1057u.m7296b(r10)
            r8.mo9194c()
            r8.mo9193a()
            r8.m9110x()
            com.google.android.gms.measurement.internal.la r0 = r8.m9326m()
            com.google.android.gms.measurement.internal.x3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C1828o.f7853b0
            boolean r0 = r0.m9480a(r1)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L6f
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L6f
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L5f
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L5f
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            if (r10 == 0) goto L44
            r4 = r2
            goto L46
        L44:
            r4 = 0
        L46:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.s4 r0 = r8.m9323j()
            com.google.android.gms.measurement.internal.v4 r0 = r0.f8037s
            long r4 = r10.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L5a
            java.lang.String r11 = "true"
        L5a:
            r0.m9808a(r11)
            r6 = r10
            goto L6d
        L5f:
            if (r11 != 0) goto L6f
            com.google.android.gms.measurement.internal.s4 r10 = r8.m9323j()
            com.google.android.gms.measurement.internal.v4 r10 = r10.f8037s
            java.lang.String r0 = "unset"
            r10.m9808a(r0)
            r6 = r11
        L6d:
            r3 = r1
            goto L71
        L6f:
            r3 = r10
            r6 = r11
        L71:
            com.google.android.gms.measurement.internal.j5 r10 = r8.f7550a
            boolean r10 = r10.m9411c()
            if (r10 != 0) goto L87
            com.google.android.gms.measurement.internal.f4 r9 = r8.mo9324k()
            com.google.android.gms.measurement.internal.h4 r9 = r9.m9304B()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.m9365a(r10)
            return
        L87:
            com.google.android.gms.measurement.internal.j5 r10 = r8.f7550a
            boolean r10 = r10.m9417n()
            if (r10 != 0) goto L90
            return
        L90:
            com.google.android.gms.measurement.internal.zzkq r10 = new com.google.android.gms.measurement.internal.zzkq
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.w7 r9 = r8.m9199r()
            r9.m9870a(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1846p6.m9741a(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    /* renamed from: a */
    public final void m9742a(String str, String str2, Object obj, boolean z) {
        m9743a(str, str2, obj, z, mo9321h().mo7375a());
    }

    /* renamed from: a */
    public final void m9743a(String str, String str2, Object obj, boolean z, long j) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int i = 6;
        if (z) {
            i = m9322i().m9955b(str2);
        } else {
            C1959z9 i2 = m9322i();
            if (i2.m9952a("user property", str2)) {
                if (!i2.m9954a("user property", C1799l6.f7740a, str2)) {
                    i = 15;
                } else if (i2.m9951a("user property", 24, str2)) {
                    i = 0;
                }
            }
        }
        if (i != 0) {
            m9322i();
            this.f7550a.m9426w().m9939a(i, "_ev", C1959z9.m9909a(str2, 24, true), str2 != null ? str2.length() : 0);
            return;
        }
        if (obj == null) {
            m9705a(str3, str2, j, (Object) null);
            return;
        }
        int m9956b = m9322i().m9956b(str2, obj);
        if (m9956b != 0) {
            m9322i();
            this.f7550a.m9426w().m9939a(m9956b, "_ev", C1959z9.m9909a(str2, 24, true), ((obj instanceof String) || (obj instanceof CharSequence)) ? String.valueOf(obj).length() : 0);
        } else {
            Object m9958c = m9322i().m9958c(str2, obj);
            if (m9958c != null) {
                m9705a(str3, str2, j, m9958c);
            }
        }
    }

    /* renamed from: a */
    public final void m9744a(String str, String str2, String str3, Bundle bundle) {
        C1057u.m7296b(str);
        m9195n();
        throw null;
    }

    /* renamed from: a */
    public final void m9745a(boolean z) {
        m9110x();
        mo9193a();
        mo9320g().m9344a(new RunnableC1692c7(this, z));
    }

    /* renamed from: b */
    public final void m9746b(long j) {
        mo9193a();
        mo9320g().m9344a(new RunnableC1764i7(this, j));
    }

    /* renamed from: b */
    public final void m9747b(Bundle bundle) {
        C1057u.m7286a(bundle);
        C1057u.m7296b(bundle.getString("app_id"));
        m9195n();
        throw null;
    }

    /* renamed from: b */
    public final void m9748b(InterfaceC1823n6 interfaceC1823n6) {
        mo9193a();
        m9110x();
        C1057u.m7286a(interfaceC1823n6);
        if (this.f7965e.remove(interfaceC1823n6)) {
            return;
        }
        mo9324k().m9312w().m9365a("OnEventListener had not been registered");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m9749b(String str, String str2, Bundle bundle) {
        mo9193a();
        mo9194c();
        m9736a(str, str2, mo9321h().mo7375a(), bundle);
    }

    /* renamed from: b */
    public final void m9750b(boolean z) {
        m9110x();
        mo9193a();
        mo9320g().m9344a(new RunnableC1740g7(this, z));
    }

    /* renamed from: c */
    public final void m9751c(long j) {
        m9735a((String) null);
        mo9320g().m9344a(new RunnableC1890t6(this, j));
    }

    /* renamed from: c */
    public final void m9752c(String str, String str2, Bundle bundle) {
        mo9193a();
        m9711b((String) null, str, str2, bundle);
    }
}
