package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.internal.measurement.C1218bb;
import com.google.android.gms.internal.measurement.C1484tc;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.b4 */
/* loaded from: classes.dex */
public final class C1677b4 extends AbstractC1688c3 {

    /* renamed from: c */
    private String f7382c;

    /* renamed from: d */
    private String f7383d;

    /* renamed from: e */
    private int f7384e;

    /* renamed from: f */
    private String f7385f;

    /* renamed from: g */
    private long f7386g;

    /* renamed from: h */
    private long f7387h;

    /* renamed from: i */
    private List<String> f7388i;

    /* renamed from: j */
    private int f7389j;

    /* renamed from: k */
    private String f7390k;

    /* renamed from: l */
    private String f7391l;

    /* renamed from: m */
    private String f7392m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1677b4(C1774j5 c1774j5, long j) {
        super(c1774j5);
        this.f7387h = j;
    }

    /* renamed from: I */
    private final String m9099I() {
        C1749h4 m9313x;
        String str;
        if (C1484tc.m8488a() && m9326m().m9480a(C1828o.f7817J0)) {
            m9313x = mo9324k().m9304B();
            str = "Disabled IID for tests.";
        } else {
            try {
                Class<?> loadClass = mo9325l().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (loadClass == null) {
                    return null;
                }
                try {
                    Object invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, mo9325l());
                    if (invoke == null) {
                        return null;
                    }
                    try {
                        return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                    } catch (Exception unused) {
                        m9313x = mo9324k().m9314y();
                        str = "Failed to retrieve Firebase Instance Id";
                    }
                } catch (Exception unused2) {
                    m9313x = mo9324k().m9313x();
                    str = "Failed to obtain Firebase Analytics instance";
                }
            } catch (ClassNotFoundException unused3) {
                return null;
            }
        }
        m9313x.m9365a(str);
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1688c3
    /* renamed from: A */
    protected final boolean mo9090A() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public final String m9100B() {
        m9110x();
        return this.f7382c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public final String m9101C() {
        m9110x();
        return this.f7390k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public final String m9102D() {
        m9110x();
        return this.f7391l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public final String m9103E() {
        m9110x();
        return this.f7392m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public final int m9104F() {
        m9110x();
        return this.f7384e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public final int m9105G() {
        m9110x();
        return this.f7389j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public final List<String> m9106H() {
        return this.f7388i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final zzm m9107a(String str) {
        boolean z;
        Boolean bool;
        Boolean m9482b;
        mo9194c();
        mo9193a();
        String m9100B = m9100B();
        String m9101C = m9101C();
        m9110x();
        String str2 = this.f7383d;
        long m9104F = m9104F();
        m9110x();
        String str3 = this.f7385f;
        long m9491n = m9326m().m9491n();
        m9110x();
        mo9194c();
        if (this.f7386g == 0) {
            this.f7386g = this.f7550a.m9426w().m9932a(mo9325l(), mo9325l().getPackageName());
        }
        long j = this.f7386g;
        boolean m9411c = this.f7550a.m9411c();
        boolean z2 = !m9323j().f8042x;
        mo9194c();
        mo9193a();
        String m9099I = !this.f7550a.m9411c() ? null : m9099I();
        long m9413f = this.f7550a.m9413f();
        int m9105G = m9105G();
        boolean booleanValue = m9326m().m9495r().booleanValue();
        C1803la m = m9326m();
        m.mo9193a();
        Boolean m9482b2 = m.m9482b("google_analytics_ssaid_collection_enabled");
        boolean booleanValue2 = Boolean.valueOf(m9482b2 == null || m9482b2.booleanValue()).booleanValue();
        C1877s4 j2 = m9323j();
        j2.mo9194c();
        boolean z3 = j2.m9785t().getBoolean("deferred_analytics_collection", false);
        String m9102D = m9102D();
        if (!m9326m().m9480a(C1828o.f7851a0) || (m9482b = m9326m().m9482b("google_analytics_default_allow_ad_personalization_signals")) == null) {
            z = z2;
            bool = null;
        } else {
            bool = Boolean.valueOf(!m9482b.booleanValue());
            z = z2;
        }
        return new zzm(m9100B, m9101C, str2, m9104F, str3, m9491n, j, str, m9411c, z, m9099I, 0L, m9413f, m9105G, booleanValue, booleanValue2, z3, m9102D, bool, this.f7387h, m9326m().m9480a(C1828o.f7871k0) ? this.f7388i : null, (C1218bb.m7671a() && m9326m().m9480a(C1828o.f7811G0)) ? m9103E() : null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:1|(1:3)(6:121|122|(1:124)(2:139|(1:141))|125|126|(4:128|(1:130)(1:137)|132|133))|4|(1:120)(1:8)|9|(1:119)(1:13)|14|(1:(1:17)(1:18))|(10:20|(2:101|(2:103|(2:105|106))(2:(1:(2:117|29)(1:116))(2:110|(1:112))|106))(3:24|25|27)|30|(1:32)|33|34|(1:36)(1:90)|37|38|(7:87|(2:89|85)|(3:50|(1:52)(1:55)|53)|56|(3:58|(3:60|(1:62)(3:64|(3:67|(1:69)(1:70)|65)|71)|63)|(1:73))|74|(1:(2:77|78)(2:80|81))(2:82|83))(9:42|(1:44)(1:86)|45|(2:84|85)|(0)|56|(0)|74|(0)(0)))|118|30|(0)|33|34|(0)(0)|37|38|(1:40)|87|(0)|(0)|56|(0)|74|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0167, code lost:
    
        if (r2 == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0265, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0266, code lost:
    
        mo9324k().m9309t().m9367a("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.C1725f4.m9298a(r0), r2);
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
    @Override // com.google.android.gms.measurement.internal.AbstractC1688c3
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void mo9108v() {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1677b4.mo9108v():void");
    }
}
