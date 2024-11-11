package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.internal.measurement.bb;
import com.google.android.gms.internal.measurement.tc;
import java.util.List;

/* loaded from: classes.dex */
public final class b4 extends c3 {
    private String c;
    private String d;
    private int e;
    private String f;
    private long g;
    private long h;
    private List<String> i;
    private int j;
    private String k;
    private String l;
    private String m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b4(j5 j5Var, long j) {
        super(j5Var);
        this.h = j;
    }

    private final String I() {
        h4 x;
        String str;
        if (tc.a() && m().a(o.J0)) {
            x = k().B();
            str = "Disabled IID for tests.";
        } else {
            try {
                Class<?> loadClass = l().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (loadClass == null) {
                    return null;
                }
                try {
                    Object invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, l());
                    if (invoke == null) {
                        return null;
                    }
                    try {
                        return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                    } catch (Exception unused) {
                        x = k().y();
                        str = "Failed to retrieve Firebase Instance Id";
                    }
                } catch (Exception unused2) {
                    x = k().x();
                    str = "Failed to obtain Firebase Analytics instance";
                }
            } catch (ClassNotFoundException unused3) {
                return null;
            }
        }
        x.a(str);
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.c3
    protected final boolean A() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String B() {
        x();
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String C() {
        x();
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String D() {
        x();
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String E() {
        x();
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int F() {
        x();
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int G() {
        x();
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<String> H() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzm a(String str) {
        boolean z;
        Boolean bool;
        Boolean b;
        c();
        a();
        String B = B();
        String C = C();
        x();
        String str2 = this.d;
        long F = F();
        x();
        String str3 = this.f;
        long n = m().n();
        x();
        c();
        if (this.g == 0) {
            this.g = this.a.w().a(l(), l().getPackageName());
        }
        long j = this.g;
        boolean c = this.a.c();
        boolean z2 = !j().x;
        c();
        a();
        String I = !this.a.c() ? null : I();
        long f = this.a.f();
        int G = G();
        boolean booleanValue = m().r().booleanValue();
        la m = m();
        m.a();
        Boolean b2 = m.b("google_analytics_ssaid_collection_enabled");
        boolean booleanValue2 = Boolean.valueOf(b2 == null || b2.booleanValue()).booleanValue();
        s4 j2 = j();
        j2.c();
        boolean z3 = j2.t().getBoolean("deferred_analytics_collection", false);
        String D = D();
        if (!m().a(o.a0) || (b = m().b("google_analytics_default_allow_ad_personalization_signals")) == null) {
            z = z2;
            bool = null;
        } else {
            bool = Boolean.valueOf(!b.booleanValue());
            z = z2;
        }
        return new zzm(B, C, str2, F, str3, n, j, str, c, z, I, 0L, f, G, booleanValue, booleanValue2, z3, D, bool, this.h, m().a(o.k0) ? this.i : null, (bb.a() && m().a(o.G0)) ? E() : null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:1|(1:3)(6:121|122|(1:124)(2:139|(1:141))|125|126|(4:128|(1:130)(1:137)|132|133))|4|(1:120)(1:8)|9|(1:119)(1:13)|14|(1:(1:17)(1:18))|(10:20|(2:101|(2:103|(2:105|106))(2:(1:(2:117|29)(1:116))(2:110|(1:112))|106))(3:24|25|27)|30|(1:32)|33|34|(1:36)(1:90)|37|38|(7:87|(2:89|85)|(3:50|(1:52)(1:55)|53)|56|(3:58|(3:60|(1:62)(3:64|(3:67|(1:69)(1:70)|65)|71)|63)|(1:73))|74|(1:(2:77|78)(2:80|81))(2:82|83))(9:42|(1:44)(1:86)|45|(2:84|85)|(0)|56|(0)|74|(0)(0)))|118|30|(0)|33|34|(0)(0)|37|38|(1:40)|87|(0)|(0)|56|(0)|74|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0167, code lost:
    
        if (r2 == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0265, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0266, code lost:
    
        k().t().a("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.f4.a(r0), r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01fa A[Catch: IllegalStateException -> 0x0265, TRY_ENTER, TryCatch #3 {IllegalStateException -> 0x0265, blocks: (B:34:0x01e3, B:37:0x01f0, B:40:0x01fa, B:42:0x0206, B:45:0x021d, B:47:0x0225, B:50:0x0248, B:52:0x025c, B:53:0x0261, B:55:0x025f, B:84:0x022b, B:85:0x022f, B:87:0x0232, B:89:0x0238), top: B:33:0x01e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0248 A[Catch: IllegalStateException -> 0x0265, TryCatch #3 {IllegalStateException -> 0x0265, blocks: (B:34:0x01e3, B:37:0x01f0, B:40:0x01fa, B:42:0x0206, B:45:0x021d, B:47:0x0225, B:50:0x0248, B:52:0x025c, B:53:0x0261, B:55:0x025f, B:84:0x022b, B:85:0x022f, B:87:0x0232, B:89:0x0238), top: B:33:0x01e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0238 A[Catch: IllegalStateException -> 0x0265, TryCatch #3 {IllegalStateException -> 0x0265, blocks: (B:34:0x01e3, B:37:0x01f0, B:40:0x01fa, B:42:0x0206, B:45:0x021d, B:47:0x0225, B:50:0x0248, B:52:0x025c, B:53:0x0261, B:55:0x025f, B:84:0x022b, B:85:0x022f, B:87:0x0232, B:89:0x0238), top: B:33:0x01e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ef  */
    @Override // com.google.android.gms.measurement.internal.c3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void v() {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.b4.v():void");
    }
}
