package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.util.C1109o;
import java.lang.reflect.InvocationTargetException;
import p000.C2440ep;

/* renamed from: com.google.android.gms.measurement.internal.la */
/* loaded from: classes.dex */
public final class C1803la extends C1727f6 {

    /* renamed from: b */
    private Boolean f7750b;

    /* renamed from: c */
    private InterfaceC1827na f7751c;

    /* renamed from: d */
    private Boolean f7752d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1803la(C1774j5 c1774j5) {
        super(c1774j5);
        this.f7751c = C1672b.f7375a;
    }

    /* renamed from: a */
    private final String m9472a(String str, String str2) {
        C1749h4 m9309t;
        String str3;
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (ClassNotFoundException e) {
            e = e;
            m9309t = mo9324k().m9309t();
            str3 = "Could not find SystemProperties class";
            m9309t.m9366a(str3, e);
            return str2;
        } catch (IllegalAccessException e2) {
            e = e2;
            m9309t = mo9324k().m9309t();
            str3 = "Could not access SystemProperties.get()";
            m9309t.m9366a(str3, e);
            return str2;
        } catch (NoSuchMethodException e3) {
            e = e3;
            m9309t = mo9324k().m9309t();
            str3 = "Could not find SystemProperties.get() method";
            m9309t.m9366a(str3, e);
            return str2;
        } catch (InvocationTargetException e4) {
            e = e4;
            m9309t = mo9324k().m9309t();
            str3 = "SystemProperties.get() threw an exception";
            m9309t.m9366a(str3, e);
            return str2;
        }
    }

    /* renamed from: v */
    public static long m9473v() {
        return C1828o.f7804D.m9875a(null).longValue();
    }

    /* renamed from: w */
    public static long m9474w() {
        return C1828o.f7856d.m9875a(null).longValue();
    }

    /* renamed from: x */
    private final Bundle m9475x() {
        try {
            if (mo9325l().getPackageManager() == null) {
                mo9324k().m9309t().m9365a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo m11475a = C2440ep.m11628a(mo9325l()).m11475a(mo9325l().getPackageName(), 128);
            if (m11475a != null) {
                return m11475a.metaData;
            }
            mo9324k().m9309t().m9365a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            mo9324k().m9309t().m9366a("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* renamed from: a */
    public final int m9476a(String str) {
        return m9481b(str, C1828o.f7878o);
    }

    /* renamed from: a */
    public final long m9477a(String str, C1931x3<Long> c1931x3) {
        if (str != null) {
            String mo9098a = this.f7751c.mo9098a(str, c1931x3.m9876a());
            if (!TextUtils.isEmpty(mo9098a)) {
                try {
                    return c1931x3.m9875a(Long.valueOf(Long.parseLong(mo9098a))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return c1931x3.m9875a(null).longValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != false) goto L10;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m9478a(com.google.android.gms.measurement.internal.C1714e5 r6) {
        /*
            r5 = this;
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = r6.m9273n()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L33
            boolean r1 = com.google.android.gms.internal.measurement.C1218bb.m7671a()
            if (r1 == 0) goto L2f
            com.google.android.gms.measurement.internal.la r1 = r5.m9326m()
            java.lang.String r2 = r6.m9269l()
            com.google.android.gms.measurement.internal.x3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C1828o.f7811G0
            boolean r1 = r1.m9486d(r2, r3)
            if (r1 == 0) goto L2f
            java.lang.String r1 = r6.m9277p()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L33
        L2f:
            java.lang.String r1 = r6.m9275o()
        L33:
            com.google.android.gms.measurement.internal.x3<java.lang.String> r2 = com.google.android.gms.measurement.internal.C1828o.f7858e
            r3 = 0
            java.lang.Object r2 = r2.m9875a(r3)
            java.lang.String r2 = (java.lang.String) r2
            android.net.Uri$Builder r2 = r0.scheme(r2)
            com.google.android.gms.measurement.internal.x3<java.lang.String> r4 = com.google.android.gms.measurement.internal.C1828o.f7860f
            java.lang.Object r3 = r4.m9875a(r3)
            java.lang.String r3 = (java.lang.String) r3
            android.net.Uri$Builder r2 = r2.encodedAuthority(r3)
            java.lang.String r3 = "config/app/"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r4 = r1.length()
            if (r4 == 0) goto L5d
            java.lang.String r1 = r3.concat(r1)
            goto L62
        L5d:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L62:
            android.net.Uri$Builder r1 = r2.path(r1)
            java.lang.String r6 = r6.m9271m()
            java.lang.String r2 = "app_instance_id"
            android.net.Uri$Builder r6 = r1.appendQueryParameter(r2, r6)
            java.lang.String r1 = "platform"
            java.lang.String r2 = "android"
            android.net.Uri$Builder r6 = r6.appendQueryParameter(r1, r2)
            long r1 = r5.m9491n()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "gmp_version"
            r6.appendQueryParameter(r2, r1)
            android.net.Uri r6 = r0.build()
            java.lang.String r6 = r6.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1803la.m9478a(com.google.android.gms.measurement.internal.e5):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m9479a(InterfaceC1827na interfaceC1827na) {
        this.f7751c = interfaceC1827na;
    }

    /* renamed from: a */
    public final boolean m9480a(C1931x3<Boolean> c1931x3) {
        return m9486d(null, c1931x3);
    }

    /* renamed from: b */
    public final int m9481b(String str, C1931x3<Integer> c1931x3) {
        if (str != null) {
            String mo9098a = this.f7751c.mo9098a(str, c1931x3.m9876a());
            if (!TextUtils.isEmpty(mo9098a)) {
                try {
                    return c1931x3.m9875a(Integer.valueOf(Integer.parseInt(mo9098a))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return c1931x3.m9875a(null).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final Boolean m9482b(String str) {
        C1057u.m7296b(str);
        Bundle m9475x = m9475x();
        if (m9475x == null) {
            mo9324k().m9309t().m9365a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (m9475x.containsKey(str)) {
            return Boolean.valueOf(m9475x.getBoolean(str));
        }
        return null;
    }

    /* renamed from: c */
    public final double m9483c(String str, C1931x3<Double> c1931x3) {
        if (str != null) {
            String mo9098a = this.f7751c.mo9098a(str, c1931x3.m9876a());
            if (!TextUtils.isEmpty(mo9098a)) {
                try {
                    return c1931x3.m9875a(Double.valueOf(Double.parseDouble(mo9098a))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return c1931x3.m9875a(null).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.lang.String> m9484c(java.lang.String r4) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.C1057u.m7296b(r4)
            android.os.Bundle r0 = r3.m9475x()
            r1 = 0
            if (r0 != 0) goto L19
            com.google.android.gms.measurement.internal.f4 r4 = r3.mo9324k()
            com.google.android.gms.measurement.internal.h4 r4 = r4.m9309t()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.m9365a(r0)
        L17:
            r4 = r1
            goto L28
        L19:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L20
            goto L17
        L20:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L28:
            if (r4 != 0) goto L2b
            return r1
        L2b:
            android.content.Context r0 = r3.mo9325l()     // Catch: android.content.res.Resources.NotFoundException -> L43
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L43
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L43
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            if (r4 != 0) goto L3e
            return r1
        L3e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            return r4
        L43:
            r4 = move-exception
            com.google.android.gms.measurement.internal.f4 r0 = r3.mo9324k()
            com.google.android.gms.measurement.internal.h4 r0 = r0.m9309t()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.m9366a(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1803la.m9484c(java.lang.String):java.util.List");
    }

    /* renamed from: d */
    public final boolean m9485d(String str) {
        return "1".equals(this.f7751c.mo9098a(str, "gaia_collection_enabled"));
    }

    /* renamed from: d */
    public final boolean m9486d(String str, C1931x3<Boolean> c1931x3) {
        Boolean m9875a;
        if (str != null) {
            String mo9098a = this.f7751c.mo9098a(str, c1931x3.m9876a());
            if (!TextUtils.isEmpty(mo9098a)) {
                m9875a = c1931x3.m9875a(Boolean.valueOf(Boolean.parseBoolean(mo9098a)));
                return m9875a.booleanValue();
            }
        }
        m9875a = c1931x3.m9875a(null);
        return m9875a.booleanValue();
    }

    /* renamed from: e */
    public final boolean m9487e(String str) {
        return "1".equals(this.f7751c.mo9098a(str, "measurement.event_sampling_enabled"));
    }

    /* renamed from: e */
    public final boolean m9488e(String str, C1931x3<Boolean> c1931x3) {
        return m9486d(str, c1931x3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean m9489f(String str) {
        return m9486d(str, C1828o.f7812H);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final String m9490g(String str) {
        C1931x3<String> c1931x3 = C1828o.f7814I;
        return c1931x3.m9875a(str == null ? null : this.f7751c.mo9098a(str, c1931x3.m9876a()));
    }

    /* renamed from: n */
    public final long m9491n() {
        mo9317d();
        return 21028L;
    }

    /* renamed from: o */
    public final boolean m9492o() {
        if (this.f7752d == null) {
            synchronized (this) {
                if (this.f7752d == null) {
                    ApplicationInfo applicationInfo = mo9325l().getApplicationInfo();
                    String m7407a = C1109o.m7407a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f7752d = Boolean.valueOf(str != null && str.equals(m7407a));
                    }
                    if (this.f7752d == null) {
                        this.f7752d = Boolean.TRUE;
                        mo9324k().m9309t().m9365a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f7752d.booleanValue();
    }

    /* renamed from: p */
    public final boolean m9493p() {
        mo9317d();
        Boolean m9482b = m9482b("firebase_analytics_collection_deactivated");
        return m9482b != null && m9482b.booleanValue();
    }

    /* renamed from: q */
    public final Boolean m9494q() {
        mo9317d();
        return m9482b("firebase_analytics_collection_enabled");
    }

    /* renamed from: r */
    public final Boolean m9495r() {
        mo9193a();
        Boolean m9482b = m9482b("google_analytics_adid_collection_enabled");
        return Boolean.valueOf(m9482b == null || m9482b.booleanValue());
    }

    /* renamed from: s */
    public final String m9496s() {
        return m9472a("debug.firebase.analytics.app", "");
    }

    /* renamed from: t */
    public final String m9497t() {
        return m9472a("debug.deferred.deeplink", "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final boolean m9498u() {
        if (this.f7750b == null) {
            Boolean m9482b = m9482b("app_measurement_lite");
            this.f7750b = m9482b;
            if (m9482b == null) {
                this.f7750b = false;
            }
        }
        return this.f7750b.booleanValue() || !this.f7550a.m9399D();
    }
}
