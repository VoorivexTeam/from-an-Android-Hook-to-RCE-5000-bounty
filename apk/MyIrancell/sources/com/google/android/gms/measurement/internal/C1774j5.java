package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.api.internal.C0903h;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.util.C1102h;
import com.google.android.gms.common.util.InterfaceC1099e;
import com.google.android.gms.internal.measurement.AbstractC1529x1;
import com.google.android.gms.internal.measurement.C1322ia;
import com.google.android.gms.internal.measurement.C1351k9;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C2440ep;

/* renamed from: com.google.android.gms.measurement.internal.j5 */
/* loaded from: classes.dex */
public class C1774j5 implements InterfaceC1751h6 {

    /* renamed from: G */
    private static volatile C1774j5 f7647G;

    /* renamed from: A */
    private volatile Boolean f7648A;

    /* renamed from: B */
    private Boolean f7649B;

    /* renamed from: C */
    private Boolean f7650C;

    /* renamed from: D */
    private int f7651D;

    /* renamed from: F */
    private final long f7653F;

    /* renamed from: a */
    private final Context f7654a;

    /* renamed from: b */
    private final String f7655b;

    /* renamed from: c */
    private final String f7656c;

    /* renamed from: d */
    private final String f7657d;

    /* renamed from: e */
    private final boolean f7658e;

    /* renamed from: f */
    private final C1791ka f7659f;

    /* renamed from: g */
    private final C1803la f7660g;

    /* renamed from: h */
    private final C1877s4 f7661h;

    /* renamed from: i */
    private final C1725f4 f7662i;

    /* renamed from: j */
    private final C1738g5 f7663j;

    /* renamed from: k */
    private final C1936x8 f7664k;

    /* renamed from: l */
    private final C1959z9 f7665l;

    /* renamed from: m */
    private final C1689c4 f7666m;

    /* renamed from: n */
    private final InterfaceC1099e f7667n;

    /* renamed from: o */
    private final C1869r7 f7668o;

    /* renamed from: p */
    private final C1846p6 f7669p;

    /* renamed from: q */
    private final C1949z f7670q;

    /* renamed from: r */
    private final C1812m7 f7671r;

    /* renamed from: s */
    private C1665a4 f7672s;

    /* renamed from: t */
    private C1924w7 f7673t;

    /* renamed from: u */
    private C1756i f7674u;

    /* renamed from: v */
    private C1677b4 f7675v;

    /* renamed from: w */
    private C1943y4 f7676w;

    /* renamed from: y */
    private Boolean f7678y;

    /* renamed from: z */
    private long f7679z;

    /* renamed from: x */
    private boolean f7677x = false;

    /* renamed from: E */
    private AtomicInteger f7652E = new AtomicInteger(0);

    private C1774j5(C1811m6 c1811m6) {
        C1749h4 m9312w;
        String str;
        Bundle bundle;
        boolean z = false;
        C1057u.m7286a(c1811m6);
        C1791ka c1791ka = new C1791ka(c1811m6.f7760a);
        this.f7659f = c1791ka;
        C1898u3.f8087a = c1791ka;
        this.f7654a = c1811m6.f7760a;
        this.f7655b = c1811m6.f7761b;
        this.f7656c = c1811m6.f7762c;
        this.f7657d = c1811m6.f7763d;
        this.f7658e = c1811m6.f7767h;
        this.f7648A = c1811m6.f7764e;
        com.google.android.gms.internal.measurement.zzv zzvVar = c1811m6.f7766g;
        if (zzvVar != null && (bundle = zzvVar.f7038h) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f7649B = (Boolean) obj;
            }
            Object obj2 = zzvVar.f7038h.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f7650C = (Boolean) obj2;
            }
        }
        AbstractC1529x1.m8870a(this.f7654a);
        InterfaceC1099e m7385d = C1102h.m7385d();
        this.f7667n = m7385d;
        this.f7653F = m7385d.mo7375a();
        this.f7660g = new C1803la(this);
        C1877s4 c1877s4 = new C1877s4(this);
        c1877s4.m9221p();
        this.f7661h = c1877s4;
        C1725f4 c1725f4 = new C1725f4(this);
        c1725f4.m9221p();
        this.f7662i = c1725f4;
        C1959z9 c1959z9 = new C1959z9(this);
        c1959z9.m9221p();
        this.f7665l = c1959z9;
        C1689c4 c1689c4 = new C1689c4(this);
        c1689c4.m9221p();
        this.f7666m = c1689c4;
        this.f7670q = new C1949z(this);
        C1869r7 c1869r7 = new C1869r7(this);
        c1869r7.m9111y();
        this.f7668o = c1869r7;
        C1846p6 c1846p6 = new C1846p6(this);
        c1846p6.m9111y();
        this.f7669p = c1846p6;
        C1936x8 c1936x8 = new C1936x8(this);
        c1936x8.m9111y();
        this.f7664k = c1936x8;
        C1812m7 c1812m7 = new C1812m7(this);
        c1812m7.m9221p();
        this.f7671r = c1812m7;
        C1738g5 c1738g5 = new C1738g5(this);
        c1738g5.m9221p();
        this.f7663j = c1738g5;
        com.google.android.gms.internal.measurement.zzv zzvVar2 = c1811m6.f7766g;
        if (zzvVar2 != null && zzvVar2.f7033c != 0) {
            z = true;
        }
        boolean z2 = !z;
        if (this.f7654a.getApplicationContext() instanceof Application) {
            C1846p6 m9425v = m9425v();
            if (m9425v.mo9325l().getApplicationContext() instanceof Application) {
                Application application = (Application) m9425v.mo9325l().getApplicationContext();
                if (m9425v.f7963c == null) {
                    m9425v.f7963c = new C1752h7(m9425v, null);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(m9425v.f7963c);
                    application.registerActivityLifecycleCallbacks(m9425v.f7963c);
                    m9312w = m9425v.mo9324k().m9304B();
                    str = "Registered activity lifecycle callback";
                }
            }
            this.f7663j.m9344a(new RunnableC1798l5(this, c1811m6));
        }
        m9312w = mo9324k().m9312w();
        str = "Application context is not an Application";
        m9312w.m9365a(str);
        this.f7663j.m9344a(new RunnableC1798l5(this, c1811m6));
    }

    /* renamed from: J */
    private final C1812m7 m9387J() {
        m9395b(this.f7671r);
        return this.f7671r;
    }

    /* renamed from: K */
    private final void m9388K() {
        if (!this.f7677x) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    /* renamed from: a */
    public static C1774j5 m9389a(Context context, com.google.android.gms.internal.measurement.zzv zzvVar) {
        Bundle bundle;
        if (zzvVar != null && (zzvVar.f7036f == null || zzvVar.f7037g == null)) {
            zzvVar = new com.google.android.gms.internal.measurement.zzv(zzvVar.f7032b, zzvVar.f7033c, zzvVar.f7034d, zzvVar.f7035e, null, null, zzvVar.f7038h);
        }
        C1057u.m7286a(context);
        C1057u.m7286a(context.getApplicationContext());
        if (f7647G == null) {
            synchronized (C1774j5.class) {
                if (f7647G == null) {
                    f7647G = new C1774j5(new C1811m6(context, zzvVar));
                }
            }
        } else if (zzvVar != null && (bundle = zzvVar.f7038h) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            f7647G.m9409a(zzvVar.f7038h.getBoolean("dataCollectionDefaultEnabled"));
        }
        return f7647G;
    }

    /* renamed from: a */
    public static C1774j5 m9390a(Context context, String str, String str2, Bundle bundle) {
        return m9389a(context, new com.google.android.gms.internal.measurement.zzv(0L, 0L, true, null, null, null, bundle));
    }

    /* renamed from: a */
    private static void m9391a(C1727f6 c1727f6) {
        if (c1727f6 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m9393a(C1811m6 c1811m6) {
        String concat;
        C1749h4 c1749h4;
        mo9320g().mo9194c();
        C1756i c1756i = new C1756i(this);
        c1756i.m9221p();
        this.f7674u = c1756i;
        C1677b4 c1677b4 = new C1677b4(this, c1811m6.f7765f);
        c1677b4.m9111y();
        this.f7675v = c1677b4;
        C1665a4 c1665a4 = new C1665a4(this);
        c1665a4.m9111y();
        this.f7672s = c1665a4;
        C1924w7 c1924w7 = new C1924w7(this);
        c1924w7.m9111y();
        this.f7673t = c1924w7;
        this.f7665l.m9222q();
        this.f7661h.m9222q();
        this.f7676w = new C1943y4(this);
        this.f7675v.m9112z();
        mo9324k().m9315z().m9366a("App measurement initialized, version", Long.valueOf(this.f7660g.m9491n()));
        mo9324k().m9315z().m9365a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String m9100B = c1677b4.m9100B();
        if (TextUtils.isEmpty(this.f7655b)) {
            if (m9426w().m9960d(m9100B)) {
                c1749h4 = mo9324k().m9315z();
                concat = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                C1749h4 m9315z = mo9324k().m9315z();
                String valueOf = String.valueOf(m9100B);
                concat = valueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
                c1749h4 = m9315z;
            }
            c1749h4.m9365a(concat);
        }
        mo9324k().m9303A().m9365a("Debug-level message logging enabled");
        if (this.f7651D != this.f7652E.get()) {
            mo9324k().m9309t().m9367a("Not all components initialized", Integer.valueOf(this.f7651D), Integer.valueOf(this.f7652E.get()));
        }
        this.f7677x = true;
    }

    /* renamed from: b */
    private static void m9394b(AbstractC1688c3 abstractC1688c3) {
        if (abstractC1688c3 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (abstractC1688c3.m9109w()) {
            return;
        }
        String valueOf = String.valueOf(abstractC1688c3.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("Component not initialized: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    private static void m9395b(AbstractC1703d6 abstractC1703d6) {
        if (abstractC1703d6 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (abstractC1703d6.m9223s()) {
            return;
        }
        String valueOf = String.valueOf(abstractC1703d6.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("Component not initialized: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: A */
    public final String m9396A() {
        return this.f7655b;
    }

    /* renamed from: B */
    public final String m9397B() {
        return this.f7656c;
    }

    /* renamed from: C */
    public final String m9398C() {
        return this.f7657d;
    }

    /* renamed from: D */
    public final boolean m9399D() {
        return this.f7658e;
    }

    /* renamed from: E */
    public final C1869r7 m9400E() {
        m9394b(this.f7668o);
        return this.f7668o;
    }

    /* renamed from: F */
    public final C1924w7 m9401F() {
        m9394b(this.f7673t);
        return this.f7673t;
    }

    /* renamed from: G */
    public final C1756i m9402G() {
        m9395b(this.f7674u);
        return this.f7674u;
    }

    /* renamed from: H */
    public final C1677b4 m9403H() {
        m9394b(this.f7675v);
        return this.f7675v;
    }

    /* renamed from: I */
    public final C1949z m9404I() {
        C1949z c1949z = this.f7670q;
        if (c1949z != null) {
            return c1949z;
        }
        throw new IllegalStateException("Component not created");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m9405a() {
        mo9320g().mo9194c();
        if (m9420q().f8023e.m9792a() == 0) {
            m9420q().f8023e.m9793a(this.f7667n.mo7375a());
        }
        if (Long.valueOf(m9420q().f8028j.m9792a()).longValue() == 0) {
            mo9324k().m9304B().m9366a("Persisting first open", Long.valueOf(this.f7653F));
            m9420q().f8028j.m9793a(this.f7653F);
        }
        if (m9417n()) {
            if (!TextUtils.isEmpty(m9403H().m9101C()) || !TextUtils.isEmpty(m9403H().m9102D())) {
                m9426w();
                if (C1959z9.m9916a(m9403H().m9101C(), m9420q().m9786u(), m9403H().m9102D(), m9420q().m9787v())) {
                    mo9324k().m9315z().m9365a("Rechecking which service to use due to a GMP App Id change");
                    m9420q().m9789x();
                    m9428y().m9091B();
                    this.f7673t.m9861H();
                    this.f7673t.m9859F();
                    m9420q().f8028j.m9793a(this.f7653F);
                    m9420q().f8030l.m9808a(null);
                }
                m9420q().m9782c(m9403H().m9101C());
                m9420q().m9784d(m9403H().m9102D());
            }
            m9425v().m9735a(m9420q().f8030l.m9807a());
            if (C1351k9.m7955a() && this.f7660g.m9480a(C1828o.f7829P0) && !m9426w().m9965x() && !TextUtils.isEmpty(m9420q().f8020B.m9807a())) {
                mo9324k().m9312w().m9365a("Remote config removed with active feature rollouts");
                m9420q().f8020B.m9808a(null);
            }
            if (!TextUtils.isEmpty(m9403H().m9101C()) || !TextUtils.isEmpty(m9403H().m9102D())) {
                boolean m9411c = m9411c();
                if (!m9420q().m9776A() && !this.f7660g.m9493p()) {
                    m9420q().m9783c(!m9411c);
                }
                if (m9411c) {
                    m9425v().m9722I();
                }
                m9422s().f8178d.m9380a();
                m9401F().m9872a(new AtomicReference<>());
            }
        } else if (m9411c()) {
            if (!m9426w().m9959c("android.permission.INTERNET")) {
                mo9324k().m9309t().m9365a("App is missing INTERNET permission");
            }
            if (!m9426w().m9959c("android.permission.ACCESS_NETWORK_STATE")) {
                mo9324k().m9309t().m9365a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!C2440ep.m11628a(this.f7654a).m11477a() && !this.f7660g.m9498u()) {
                if (!C1954z4.m9903a(this.f7654a)) {
                    mo9324k().m9309t().m9365a("AppMeasurementReceiver not registered/enabled");
                }
                if (!C1959z9.m9911a(this.f7654a, false)) {
                    mo9324k().m9309t().m9365a("AppMeasurementService not registered/enabled");
                }
            }
            mo9324k().m9309t().m9365a("Uploading is not possible. App measurement disabled");
        }
        m9420q().f8038t.m9794a(this.f7660g.m9480a(C1828o.f7865h0));
        m9420q().f8039u.m9794a(this.f7660g.m9480a(C1828o.f7867i0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m9406a(AbstractC1688c3 abstractC1688c3) {
        this.f7651D++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m9407a(AbstractC1703d6 abstractC1703d6) {
        this.f7651D++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void m9408a(String str, int i, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        boolean z = true;
        if (!((i == 200 || i == 204 || i == 304) && th == null)) {
            mo9324k().m9312w().m9367a("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
            return;
        }
        m9420q().f8044z.m9794a(true);
        if (bArr.length == 0) {
            mo9324k().m9303A().m9365a("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String optString = jSONObject.optString("deeplink", "");
            String optString2 = jSONObject.optString("gclid", "");
            double optDouble = jSONObject.optDouble("timestamp", 0.0d);
            if (TextUtils.isEmpty(optString)) {
                mo9324k().m9303A().m9365a("Deferred Deep Link is empty.");
                return;
            }
            C1959z9 m9426w = m9426w();
            m9426w.mo9193a();
            if (TextUtils.isEmpty(optString) || (queryIntentActivities = m9426w.mo9325l().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) == null || queryIntentActivities.isEmpty()) {
                z = false;
            }
            if (!z) {
                mo9324k().m9312w().m9367a("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gclid", optString2);
            bundle.putString("_cis", "ddp");
            this.f7669p.m9738a("auto", "_cmp", bundle);
            C1959z9 m9426w2 = m9426w();
            if (TextUtils.isEmpty(optString) || !m9426w2.m9950a(optString, optDouble)) {
                return;
            }
            m9426w2.mo9325l().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
        } catch (JSONException e) {
            mo9324k().m9309t().m9366a("Failed to parse the Deferred Deep Link response. exception", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m9409a(boolean z) {
        this.f7648A = Boolean.valueOf(z);
    }

    /* renamed from: b */
    public final boolean m9410b() {
        return this.f7648A != null && this.f7648A.booleanValue();
    }

    /* renamed from: c */
    public final boolean m9411c() {
        if (C1322ia.m7931a() && this.f7660g.m9480a(C1828o.f7845X0)) {
            return m9412e() == 0;
        }
        mo9320g().mo9194c();
        m9388K();
        if (this.f7660g.m9493p()) {
            return false;
        }
        Boolean bool = this.f7650C;
        if (bool != null && bool.booleanValue()) {
            return false;
        }
        Boolean m9790y = m9420q().m9790y();
        if (m9790y != null) {
            return m9790y.booleanValue();
        }
        Boolean m9494q = this.f7660g.m9494q();
        if (m9494q != null) {
            return m9494q.booleanValue();
        }
        Boolean bool2 = this.f7649B;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        if (C0903h.m6774b()) {
            return false;
        }
        if (!this.f7660g.m9480a(C1828o.f7844X) || this.f7648A == null) {
            return true;
        }
        return this.f7648A.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1751h6
    /* renamed from: d */
    public final C1791ka mo9317d() {
        return this.f7659f;
    }

    /* renamed from: e */
    public final int m9412e() {
        mo9320g().mo9194c();
        if (this.f7660g.m9493p()) {
            return 1;
        }
        Boolean bool = this.f7650C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        Boolean m9790y = m9420q().m9790y();
        if (m9790y != null) {
            return m9790y.booleanValue() ? 0 : 3;
        }
        Boolean m9494q = this.f7660g.m9494q();
        if (m9494q != null) {
            return m9494q.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f7649B;
        if (bool2 != null) {
            return bool2.booleanValue() ? 0 : 5;
        }
        if (C0903h.m6774b()) {
            return 6;
        }
        return (!this.f7660g.m9480a(C1828o.f7844X) || this.f7648A == null || this.f7648A.booleanValue()) ? 0 : 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final long m9413f() {
        Long valueOf = Long.valueOf(m9420q().f8028j.m9792a());
        return valueOf.longValue() == 0 ? this.f7653F : Math.min(this.f7653F, valueOf.longValue());
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1751h6
    /* renamed from: g */
    public final C1738g5 mo9320g() {
        m9395b(this.f7663j);
        return this.f7663j;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1751h6
    /* renamed from: h */
    public final InterfaceC1099e mo9321h() {
        return this.f7667n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final void m9414i() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final void m9415j() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1751h6
    /* renamed from: k */
    public final C1725f4 mo9324k() {
        m9395b(this.f7662i);
        return this.f7662i;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1751h6
    /* renamed from: l */
    public final Context mo9325l() {
        return this.f7654a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final void m9416m() {
        this.f7652E.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean m9417n() {
        m9388K();
        mo9320g().mo9194c();
        Boolean bool = this.f7678y;
        if (bool == null || this.f7679z == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.f7667n.mo7376b() - this.f7679z) > 1000)) {
            this.f7679z = this.f7667n.mo7376b();
            boolean z = true;
            Boolean valueOf = Boolean.valueOf(m9426w().m9959c("android.permission.INTERNET") && m9426w().m9959c("android.permission.ACCESS_NETWORK_STATE") && (C2440ep.m11628a(this.f7654a).m11477a() || this.f7660g.m9498u() || (C1954z4.m9903a(this.f7654a) && C1959z9.m9911a(this.f7654a, false))));
            this.f7678y = valueOf;
            if (valueOf.booleanValue()) {
                if (!m9426w().m9953a(m9403H().m9101C(), m9403H().m9102D(), m9403H().m9103E()) && TextUtils.isEmpty(m9403H().m9102D())) {
                    z = false;
                }
                this.f7678y = Boolean.valueOf(z);
            }
        }
        return this.f7678y.booleanValue();
    }

    /* renamed from: o */
    public final void m9418o() {
        mo9320g().mo9194c();
        m9395b(m9387J());
        String m9100B = m9403H().m9100B();
        Pair<String, Boolean> m9777a = m9420q().m9777a(m9100B);
        if (!this.f7660g.m9495r().booleanValue() || ((Boolean) m9777a.second).booleanValue() || TextUtils.isEmpty((CharSequence) m9777a.first)) {
            mo9324k().m9303A().m9365a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        if (!m9387J().m9502t()) {
            mo9324k().m9312w().m9365a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        URL m9938a = m9426w().m9938a(m9403H().m9326m().m9491n(), m9100B, (String) m9777a.first, m9420q().f8019A.m9792a() - 1);
        C1812m7 m9387J = m9387J();
        InterfaceC1800l7 interfaceC1800l7 = new InterfaceC1800l7(this) { // from class: com.google.android.gms.measurement.internal.m5

            /* renamed from: a */
            private final C1774j5 f7759a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f7759a = this;
            }

            @Override // com.google.android.gms.measurement.internal.InterfaceC1800l7
            /* renamed from: a */
            public final void mo9468a(String str, int i, Throwable th, byte[] bArr, Map map) {
                this.f7759a.m9408a(str, i, th, bArr, map);
            }
        };
        m9387J.mo9194c();
        m9387J.m9220o();
        C1057u.m7286a(m9938a);
        C1057u.m7286a(interfaceC1800l7);
        m9387J.mo9320g().m9346b(new RunnableC1836o7(m9387J, m9100B, m9938a, null, null, interfaceC1800l7));
    }

    /* renamed from: p */
    public final C1803la m9419p() {
        return this.f7660g;
    }

    /* renamed from: q */
    public final C1877s4 m9420q() {
        m9391a((C1727f6) this.f7661h);
        return this.f7661h;
    }

    /* renamed from: r */
    public final C1725f4 m9421r() {
        C1725f4 c1725f4 = this.f7662i;
        if (c1725f4 == null || !c1725f4.m9223s()) {
            return null;
        }
        return this.f7662i;
    }

    /* renamed from: s */
    public final C1936x8 m9422s() {
        m9394b(this.f7664k);
        return this.f7664k;
    }

    /* renamed from: t */
    public final C1943y4 m9423t() {
        return this.f7676w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final C1738g5 m9424u() {
        return this.f7663j;
    }

    /* renamed from: v */
    public final C1846p6 m9425v() {
        m9394b(this.f7669p);
        return this.f7669p;
    }

    /* renamed from: w */
    public final C1959z9 m9426w() {
        m9391a((C1727f6) this.f7665l);
        return this.f7665l;
    }

    /* renamed from: x */
    public final C1689c4 m9427x() {
        m9391a((C1727f6) this.f7666m);
        return this.f7666m;
    }

    /* renamed from: y */
    public final C1665a4 m9428y() {
        m9394b(this.f7672s);
        return this.f7672s;
    }

    /* renamed from: z */
    public final boolean m9429z() {
        return TextUtils.isEmpty(this.f7655b);
    }
}
