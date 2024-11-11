package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import defpackage.ep;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class la extends f6 {
    private Boolean b;
    private na c;
    private Boolean d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public la(j5 j5Var) {
        super(j5Var);
        this.c = b.a;
    }

    private final String a(String str, String str2) {
        h4 t;
        String str3;
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (ClassNotFoundException e) {
            e = e;
            t = k().t();
            str3 = "Could not find SystemProperties class";
            t.a(str3, e);
            return str2;
        } catch (IllegalAccessException e2) {
            e = e2;
            t = k().t();
            str3 = "Could not access SystemProperties.get()";
            t.a(str3, e);
            return str2;
        } catch (NoSuchMethodException e3) {
            e = e3;
            t = k().t();
            str3 = "Could not find SystemProperties.get() method";
            t.a(str3, e);
            return str2;
        } catch (InvocationTargetException e4) {
            e = e4;
            t = k().t();
            str3 = "SystemProperties.get() threw an exception";
            t.a(str3, e);
            return str2;
        }
    }

    public static long v() {
        return o.D.a(null).longValue();
    }

    public static long w() {
        return o.d.a(null).longValue();
    }

    private final Bundle x() {
        try {
            if (l().getPackageManager() == null) {
                k().t().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a = ep.a(l()).a(l().getPackageName(), 128);
            if (a != null) {
                return a.metaData;
            }
            k().t().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            k().t().a("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    public final int a(String str) {
        return b(str, o.o);
    }

    public final long a(String str, x3<Long> x3Var) {
        if (str != null) {
            String a = this.c.a(str, x3Var.a());
            if (!TextUtils.isEmpty(a)) {
                try {
                    return x3Var.a(Long.valueOf(Long.parseLong(a))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return x3Var.a(null).longValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(com.google.android.gms.measurement.internal.e5 r6) {
        /*
            r5 = this;
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = r6.n()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L33
            boolean r1 = com.google.android.gms.internal.measurement.bb.a()
            if (r1 == 0) goto L2f
            com.google.android.gms.measurement.internal.la r1 = r5.m()
            java.lang.String r2 = r6.l()
            com.google.android.gms.measurement.internal.x3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.o.G0
            boolean r1 = r1.d(r2, r3)
            if (r1 == 0) goto L2f
            java.lang.String r1 = r6.p()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L33
        L2f:
            java.lang.String r1 = r6.o()
        L33:
            com.google.android.gms.measurement.internal.x3<java.lang.String> r2 = com.google.android.gms.measurement.internal.o.e
            r3 = 0
            java.lang.Object r2 = r2.a(r3)
            java.lang.String r2 = (java.lang.String) r2
            android.net.Uri$Builder r2 = r0.scheme(r2)
            com.google.android.gms.measurement.internal.x3<java.lang.String> r4 = com.google.android.gms.measurement.internal.o.f
            java.lang.Object r3 = r4.a(r3)
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
            java.lang.String r6 = r6.m()
            java.lang.String r2 = "app_instance_id"
            android.net.Uri$Builder r6 = r1.appendQueryParameter(r2, r6)
            java.lang.String r1 = "platform"
            java.lang.String r2 = "android"
            android.net.Uri$Builder r6 = r6.appendQueryParameter(r1, r2)
            long r1 = r5.n()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "gmp_version"
            r6.appendQueryParameter(r2, r1)
            android.net.Uri r6 = r0.build()
            java.lang.String r6 = r6.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.la.a(com.google.android.gms.measurement.internal.e5):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(na naVar) {
        this.c = naVar;
    }

    public final boolean a(x3<Boolean> x3Var) {
        return d(null, x3Var);
    }

    public final int b(String str, x3<Integer> x3Var) {
        if (str != null) {
            String a = this.c.a(str, x3Var.a());
            if (!TextUtils.isEmpty(a)) {
                try {
                    return x3Var.a(Integer.valueOf(Integer.parseInt(a))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return x3Var.a(null).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean b(String str) {
        com.google.android.gms.common.internal.u.b(str);
        Bundle x = x();
        if (x == null) {
            k().t().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (x.containsKey(str)) {
            return Boolean.valueOf(x.getBoolean(str));
        }
        return null;
    }

    public final double c(String str, x3<Double> x3Var) {
        if (str != null) {
            String a = this.c.a(str, x3Var.a());
            if (!TextUtils.isEmpty(a)) {
                try {
                    return x3Var.a(Double.valueOf(Double.parseDouble(a))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return x3Var.a(null).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.lang.String> c(java.lang.String r4) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.u.b(r4)
            android.os.Bundle r0 = r3.x()
            r1 = 0
            if (r0 != 0) goto L19
            com.google.android.gms.measurement.internal.f4 r4 = r3.k()
            com.google.android.gms.measurement.internal.h4 r4 = r4.t()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
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
            android.content.Context r0 = r3.l()     // Catch: android.content.res.Resources.NotFoundException -> L43
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
            com.google.android.gms.measurement.internal.f4 r0 = r3.k()
            com.google.android.gms.measurement.internal.h4 r0 = r0.t()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.a(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.la.c(java.lang.String):java.util.List");
    }

    public final boolean d(String str) {
        return "1".equals(this.c.a(str, "gaia_collection_enabled"));
    }

    public final boolean d(String str, x3<Boolean> x3Var) {
        Boolean a;
        if (str != null) {
            String a2 = this.c.a(str, x3Var.a());
            if (!TextUtils.isEmpty(a2)) {
                a = x3Var.a(Boolean.valueOf(Boolean.parseBoolean(a2)));
                return a.booleanValue();
            }
        }
        a = x3Var.a(null);
        return a.booleanValue();
    }

    public final boolean e(String str) {
        return "1".equals(this.c.a(str, "measurement.event_sampling_enabled"));
    }

    public final boolean e(String str, x3<Boolean> x3Var) {
        return d(str, x3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f(String str) {
        return d(str, o.H);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String g(String str) {
        x3<String> x3Var = o.I;
        return x3Var.a(str == null ? null : this.c.a(str, x3Var.a()));
    }

    public final long n() {
        d();
        return 21028L;
    }

    public final boolean o() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    ApplicationInfo applicationInfo = l().getApplicationInfo();
                    String a = com.google.android.gms.common.util.o.a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.d = Boolean.valueOf(str != null && str.equals(a));
                    }
                    if (this.d == null) {
                        this.d = Boolean.TRUE;
                        k().t().a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.d.booleanValue();
    }

    public final boolean p() {
        d();
        Boolean b = b("firebase_analytics_collection_deactivated");
        return b != null && b.booleanValue();
    }

    public final Boolean q() {
        d();
        return b("firebase_analytics_collection_enabled");
    }

    public final Boolean r() {
        a();
        Boolean b = b("google_analytics_adid_collection_enabled");
        return Boolean.valueOf(b == null || b.booleanValue());
    }

    public final String s() {
        return a("debug.firebase.analytics.app", "");
    }

    public final String t() {
        return a("debug.deferred.deeplink", "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean u() {
        if (this.b == null) {
            Boolean b = b("app_measurement_lite");
            this.b = b;
            if (b == null) {
                this.b = false;
            }
        }
        return this.b.booleanValue() || !this.a.D();
    }
}
