package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.qa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class p6 extends c3 {
    protected h7 c;
    private k6 d;
    private final Set<n6> e;
    private boolean f;
    private final AtomicReference<String> g;
    protected boolean h;

    /* JADX INFO: Access modifiers changed from: protected */
    public p6(j5 j5Var) {
        super(j5Var);
        this.e = new CopyOnWriteArraySet();
        this.h = true;
        this.g = new AtomicReference<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        if (m().a(o.b0)) {
            c();
            String a = j().s.a();
            if (a != null) {
                if ("unset".equals(a)) {
                    a("app", "_npa", (Object) null, h().a());
                } else {
                    a("app", "_npa", Long.valueOf("true".equals(a) ? 1L : 0L), h().a());
                }
            }
        }
        if (!this.a.c() || !this.h) {
            k().A().a("Updating Scion state (FE)");
            r().C();
            return;
        }
        k().A().a("Recording app launch after enabling measurement for the first time (FE)");
        I();
        if (qa.a() && m().a(o.Q0)) {
            u().d.a();
        }
        if (com.google.android.gms.internal.measurement.w9.a() && m().a(o.W0)) {
            if (this.a.t().a.q().k.a() > 0) {
                return;
            }
            this.a.t().a();
        }
    }

    private final void a(String str, String str2, long j, Object obj) {
        g().a(new s6(this, str, str2, obj, j));
    }

    private final ArrayList<Bundle> b(String str, String str2, String str3) {
        if (g().t()) {
            k().t().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        }
        if (ka.a()) {
            k().t().a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.a.g().a(atomicReference, 5000L, "get conditional user properties", new w6(this, atomicReference, str, str2, str3));
        List list = (List) atomicReference.get();
        if (list != null) {
            return z9.b((List<zzv>) list);
        }
        k().t().a("Timed out waiting for get conditional user properties", str);
        return new ArrayList<>();
    }

    private final Map<String, Object> b(String str, String str2, String str3, boolean z) {
        h4 t;
        String str4;
        if (g().t()) {
            t = k().t();
            str4 = "Cannot get user properties from analytics worker thread";
        } else {
            if (!ka.a()) {
                AtomicReference atomicReference = new AtomicReference();
                this.a.g().a(atomicReference, 5000L, "get user properties", new y6(this, atomicReference, str, str2, str3, z));
                List<zzkq> list = (List) atomicReference.get();
                if (list == null) {
                    k().t().a("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                    return Collections.emptyMap();
                }
                defpackage.c0 c0Var = new defpackage.c0(list.size());
                for (zzkq zzkqVar : list) {
                    c0Var.put(zzkqVar.c, zzkqVar.zza());
                }
                return c0Var;
            }
            t = k().t();
            str4 = "Cannot get user properties from main thread";
        }
        t.a(str4);
        return Collections.emptyMap();
    }

    private final void b(Bundle bundle, long j) {
        com.google.android.gms.common.internal.u.a(bundle);
        g6.a(bundle, "app_id", String.class, null);
        g6.a(bundle, "origin", String.class, null);
        g6.a(bundle, "name", String.class, null);
        g6.a(bundle, "value", Object.class, null);
        g6.a(bundle, "trigger_event_name", String.class, null);
        g6.a(bundle, "trigger_timeout", Long.class, 0L);
        g6.a(bundle, "timed_out_event_name", String.class, null);
        g6.a(bundle, "timed_out_event_params", Bundle.class, null);
        g6.a(bundle, "triggered_event_name", String.class, null);
        g6.a(bundle, "triggered_event_params", Bundle.class, null);
        g6.a(bundle, "time_to_live", Long.class, 0L);
        g6.a(bundle, "expired_event_name", String.class, null);
        g6.a(bundle, "expired_event_params", Bundle.class, null);
        com.google.android.gms.common.internal.u.b(bundle.getString("name"));
        com.google.android.gms.common.internal.u.b(bundle.getString("origin"));
        com.google.android.gms.common.internal.u.a(bundle.get("value"));
        bundle.putLong("creation_timestamp", j);
        String string = bundle.getString("name");
        Object obj = bundle.get("value");
        if (i().b(string) != 0) {
            k().t().a("Invalid conditional user property name", f().c(string));
            return;
        }
        if (i().b(string, obj) != 0) {
            k().t().a("Invalid conditional user property value", f().c(string), obj);
            return;
        }
        Object c = i().c(string, obj);
        if (c == null) {
            k().t().a("Unable to normalize conditional user property value", f().c(string), obj);
            return;
        }
        g6.a(bundle, c);
        long j2 = bundle.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
            k().t().a("Invalid conditional user property timeout", f().c(string), Long.valueOf(j2));
            return;
        }
        long j3 = bundle.getLong("time_to_live");
        if (j3 > 15552000000L || j3 < 1) {
            k().t().a("Invalid conditional user property time to live", f().c(string), Long.valueOf(j3));
        } else {
            g().a(new u6(this, bundle));
        }
    }

    private final void b(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        g().a(new q6(this, str, str2, j, z9.b(bundle), z, z2, z3, str3));
    }

    private final void b(String str, String str2, String str3, Bundle bundle) {
        long a = h().a();
        com.google.android.gms.common.internal.u.b(str2);
        Bundle bundle2 = new Bundle();
        if (str != null) {
            bundle2.putString("app_id", str);
        }
        bundle2.putString("name", str2);
        bundle2.putLong("creation_timestamp", a);
        if (str3 != null) {
            bundle2.putString("expired_event_name", str3);
            bundle2.putBundle("expired_event_params", bundle);
        }
        g().a(new x6(this, bundle2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(Bundle bundle) {
        c();
        x();
        com.google.android.gms.common.internal.u.a(bundle);
        com.google.android.gms.common.internal.u.b(bundle.getString("name"));
        com.google.android.gms.common.internal.u.b(bundle.getString("origin"));
        com.google.android.gms.common.internal.u.a(bundle.get("value"));
        if (!this.a.c()) {
            k().B().a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzkq zzkqVar = new zzkq(bundle.getString("name"), bundle.getLong("triggered_timestamp"), bundle.get("value"), bundle.getString("origin"));
        try {
            zzan a = i().a(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), bundle.getString("origin"), 0L, true, false);
            r().a(new zzv(bundle.getString("app_id"), bundle.getString("origin"), zzkqVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), i().a(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), bundle.getString("origin"), 0L, true, false), bundle.getLong("trigger_timeout"), a, bundle.getLong("time_to_live"), i().a(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString("origin"), 0L, true, false)));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(boolean z) {
        c();
        a();
        x();
        k().A().a("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        j().b(z);
        M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(Bundle bundle) {
        c();
        x();
        com.google.android.gms.common.internal.u.a(bundle);
        com.google.android.gms.common.internal.u.b(bundle.getString("name"));
        if (!this.a.c()) {
            k().B().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            r().a(new zzv(bundle.getString("app_id"), bundle.getString("origin"), new zzkq(bundle.getString("name"), 0L, null, null), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), i().a(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString("origin"), bundle.getLong("creation_timestamp"), true, false)));
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // com.google.android.gms.measurement.internal.c3
    protected final boolean A() {
        return false;
    }

    public final void B() {
        if (l().getApplicationContext() instanceof Application) {
            ((Application) l().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.c);
        }
    }

    public final Boolean C() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) g().a(atomicReference, 15000L, "boolean test flag value", new r6(this, atomicReference));
    }

    public final String D() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) g().a(atomicReference, 15000L, "String test flag value", new z6(this, atomicReference));
    }

    public final Long E() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) g().a(atomicReference, 15000L, "long test flag value", new b7(this, atomicReference));
    }

    public final Integer F() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) g().a(atomicReference, 15000L, "int test flag value", new a7(this, atomicReference));
    }

    public final Double G() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) g().a(atomicReference, 15000L, "double test flag value", new e7(this, atomicReference));
    }

    public final String H() {
        a();
        return this.g.get();
    }

    public final void I() {
        c();
        a();
        x();
        if (this.a.n()) {
            if (m().a(o.x0)) {
                la m = m();
                m.d();
                Boolean b = m.b("google_analytics_deferred_deep_link_enabled");
                if (b != null && b.booleanValue()) {
                    k().A().a("Deferred Deep Link feature enabled.");
                    g().a(new Runnable(this) { // from class: com.google.android.gms.measurement.internal.o6
                        private final p6 b;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            p6 p6Var = this.b;
                            p6Var.c();
                            if (p6Var.j().z.a()) {
                                p6Var.k().A().a("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long a = p6Var.j().A.a();
                            p6Var.j().A.a(1 + a);
                            if (a < 5) {
                                p6Var.a.o();
                            } else {
                                p6Var.k().w().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                p6Var.j().z.a(true);
                            }
                        }
                    });
                }
            }
            r().E();
            this.h = false;
            String z = j().z();
            if (TextUtils.isEmpty(z)) {
                return;
            }
            e().o();
            if (z.equals(Build.VERSION.RELEASE)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", z);
            a("auto", "_ou", bundle);
        }
    }

    public final String J() {
        s7 C = this.a.E().C();
        if (C != null) {
            return C.a;
        }
        return null;
    }

    public final String K() {
        s7 C = this.a.E().C();
        if (C != null) {
            return C.b;
        }
        return null;
    }

    public final String L() {
        if (this.a.A() != null) {
            return this.a.A();
        }
        try {
            return com.google.android.gms.common.api.internal.h.a();
        } catch (IllegalStateException e) {
            this.a.k().t().a("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    public final ArrayList<Bundle> a(String str, String str2) {
        a();
        return b((String) null, str, str2);
    }

    public final ArrayList<Bundle> a(String str, String str2, String str3) {
        com.google.android.gms.common.internal.u.b(str);
        n();
        throw null;
    }

    public final Map<String, Object> a(String str, String str2, String str3, boolean z) {
        com.google.android.gms.common.internal.u.b(str);
        n();
        throw null;
    }

    public final Map<String, Object> a(String str, String str2, boolean z) {
        a();
        return b((String) null, str, str2, z);
    }

    public final void a(long j) {
        a();
        g().a(new f7(this, j));
    }

    public final void a(Bundle bundle) {
        a(bundle, h().a());
    }

    public final void a(Bundle bundle, long j) {
        com.google.android.gms.common.internal.u.a(bundle);
        a();
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            k().w().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        b(bundle2, j);
    }

    public final void a(k6 k6Var) {
        k6 k6Var2;
        c();
        a();
        x();
        if (k6Var != null && k6Var != (k6Var2 = this.d)) {
            com.google.android.gms.common.internal.u.b(k6Var2 == null, "EventInterceptor already set.");
        }
        this.d = k6Var;
    }

    public final void a(n6 n6Var) {
        a();
        x();
        com.google.android.gms.common.internal.u.a(n6Var);
        if (this.e.add(n6Var)) {
            return;
        }
        k().w().a("OnEventListener already registered");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str) {
        this.g.set(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, String str2, long j, Bundle bundle) {
        a();
        c();
        a(str, str2, j, bundle, true, this.d == null || z9.f(str2), false, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r28, java.lang.String r29, long r30, android.os.Bundle r32, boolean r33, boolean r34, boolean r35, java.lang.String r36) {
        /*
            Method dump skipped, instructions count: 1456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.p6.a(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    public final void a(String str, String str2, Bundle bundle) {
        a(str, str2, bundle, true, true, h().a());
    }

    public final void a(String str, String str2, Bundle bundle, boolean z) {
        a(str, str2, bundle, false, true, h().a());
    }

    public final void a(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        a();
        b(str == null ? "app" : str, str2, j, bundle == null ? new Bundle() : bundle, z2, !z2 || this.d == null || z9.f(str2), !z, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.u.b(r9)
            com.google.android.gms.common.internal.u.b(r10)
            r8.c()
            r8.a()
            r8.x()
            com.google.android.gms.measurement.internal.la r0 = r8.m()
            com.google.android.gms.measurement.internal.x3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.o.b0
            boolean r0 = r0.a(r1)
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
            com.google.android.gms.measurement.internal.s4 r0 = r8.j()
            com.google.android.gms.measurement.internal.v4 r0 = r0.s
            long r4 = r10.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L5a
            java.lang.String r11 = "true"
        L5a:
            r0.a(r11)
            r6 = r10
            goto L6d
        L5f:
            if (r11 != 0) goto L6f
            com.google.android.gms.measurement.internal.s4 r10 = r8.j()
            com.google.android.gms.measurement.internal.v4 r10 = r10.s
            java.lang.String r0 = "unset"
            r10.a(r0)
            r6 = r11
        L6d:
            r3 = r1
            goto L71
        L6f:
            r3 = r10
            r6 = r11
        L71:
            com.google.android.gms.measurement.internal.j5 r10 = r8.a
            boolean r10 = r10.c()
            if (r10 != 0) goto L87
            com.google.android.gms.measurement.internal.f4 r9 = r8.k()
            com.google.android.gms.measurement.internal.h4 r9 = r9.B()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.a(r10)
            return
        L87:
            com.google.android.gms.measurement.internal.j5 r10 = r8.a
            boolean r10 = r10.n()
            if (r10 != 0) goto L90
            return
        L90:
            com.google.android.gms.measurement.internal.zzkq r10 = new com.google.android.gms.measurement.internal.zzkq
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.w7 r9 = r8.r()
            r9.a(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.p6.a(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void a(String str, String str2, Object obj, boolean z) {
        a(str, str2, obj, z, h().a());
    }

    public final void a(String str, String str2, Object obj, boolean z, long j) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int i = 6;
        if (z) {
            i = i().b(str2);
        } else {
            z9 i2 = i();
            if (i2.a("user property", str2)) {
                if (!i2.a("user property", l6.a, str2)) {
                    i = 15;
                } else if (i2.a("user property", 24, str2)) {
                    i = 0;
                }
            }
        }
        if (i != 0) {
            i();
            this.a.w().a(i, "_ev", z9.a(str2, 24, true), str2 != null ? str2.length() : 0);
            return;
        }
        if (obj == null) {
            a(str3, str2, j, (Object) null);
            return;
        }
        int b = i().b(str2, obj);
        if (b != 0) {
            i();
            this.a.w().a(b, "_ev", z9.a(str2, 24, true), ((obj instanceof String) || (obj instanceof CharSequence)) ? String.valueOf(obj).length() : 0);
        } else {
            Object c = i().c(str2, obj);
            if (c != null) {
                a(str3, str2, j, c);
            }
        }
    }

    public final void a(String str, String str2, String str3, Bundle bundle) {
        com.google.android.gms.common.internal.u.b(str);
        n();
        throw null;
    }

    public final void a(boolean z) {
        x();
        a();
        g().a(new c7(this, z));
    }

    public final void b(long j) {
        a();
        g().a(new i7(this, j));
    }

    public final void b(Bundle bundle) {
        com.google.android.gms.common.internal.u.a(bundle);
        com.google.android.gms.common.internal.u.b(bundle.getString("app_id"));
        n();
        throw null;
    }

    public final void b(n6 n6Var) {
        a();
        x();
        com.google.android.gms.common.internal.u.a(n6Var);
        if (this.e.remove(n6Var)) {
            return;
        }
        k().w().a("OnEventListener had not been registered");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(String str, String str2, Bundle bundle) {
        a();
        c();
        a(str, str2, h().a(), bundle);
    }

    public final void b(boolean z) {
        x();
        a();
        g().a(new g7(this, z));
    }

    public final void c(long j) {
        a((String) null);
        g().a(new t6(this, j));
    }

    public final void c(String str, String str2, Bundle bundle) {
        a();
        b((String) null, str, str2, bundle);
    }
}
