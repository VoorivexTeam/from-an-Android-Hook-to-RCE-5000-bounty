package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import defpackage.ep;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class j5 implements h6 {
    private static volatile j5 G;
    private volatile Boolean A;
    private Boolean B;
    private Boolean C;
    private int D;
    private final long F;
    private final Context a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;
    private final ka f;
    private final la g;
    private final s4 h;
    private final f4 i;
    private final g5 j;
    private final x8 k;
    private final z9 l;
    private final c4 m;
    private final com.google.android.gms.common.util.e n;
    private final r7 o;
    private final p6 p;
    private final z q;
    private final m7 r;
    private a4 s;
    private w7 t;
    private i u;
    private b4 v;
    private y4 w;
    private Boolean y;
    private long z;
    private boolean x = false;
    private AtomicInteger E = new AtomicInteger(0);

    private j5(m6 m6Var) {
        h4 w;
        String str;
        Bundle bundle;
        boolean z = false;
        com.google.android.gms.common.internal.u.a(m6Var);
        ka kaVar = new ka(m6Var.a);
        this.f = kaVar;
        u3.a = kaVar;
        this.a = m6Var.a;
        this.b = m6Var.b;
        this.c = m6Var.c;
        this.d = m6Var.d;
        this.e = m6Var.h;
        this.A = m6Var.e;
        com.google.android.gms.internal.measurement.zzv zzvVar = m6Var.g;
        if (zzvVar != null && (bundle = zzvVar.h) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.B = (Boolean) obj;
            }
            Object obj2 = zzvVar.h.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.C = (Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.x1.a(this.a);
        com.google.android.gms.common.util.e d = com.google.android.gms.common.util.h.d();
        this.n = d;
        this.F = d.a();
        this.g = new la(this);
        s4 s4Var = new s4(this);
        s4Var.p();
        this.h = s4Var;
        f4 f4Var = new f4(this);
        f4Var.p();
        this.i = f4Var;
        z9 z9Var = new z9(this);
        z9Var.p();
        this.l = z9Var;
        c4 c4Var = new c4(this);
        c4Var.p();
        this.m = c4Var;
        this.q = new z(this);
        r7 r7Var = new r7(this);
        r7Var.y();
        this.o = r7Var;
        p6 p6Var = new p6(this);
        p6Var.y();
        this.p = p6Var;
        x8 x8Var = new x8(this);
        x8Var.y();
        this.k = x8Var;
        m7 m7Var = new m7(this);
        m7Var.p();
        this.r = m7Var;
        g5 g5Var = new g5(this);
        g5Var.p();
        this.j = g5Var;
        com.google.android.gms.internal.measurement.zzv zzvVar2 = m6Var.g;
        if (zzvVar2 != null && zzvVar2.c != 0) {
            z = true;
        }
        boolean z2 = !z;
        if (this.a.getApplicationContext() instanceof Application) {
            p6 v = v();
            if (v.l().getApplicationContext() instanceof Application) {
                Application application = (Application) v.l().getApplicationContext();
                if (v.c == null) {
                    v.c = new h7(v, null);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(v.c);
                    application.registerActivityLifecycleCallbacks(v.c);
                    w = v.k().B();
                    str = "Registered activity lifecycle callback";
                }
            }
            this.j.a(new l5(this, m6Var));
        }
        w = k().w();
        str = "Application context is not an Application";
        w.a(str);
        this.j.a(new l5(this, m6Var));
    }

    private final m7 J() {
        b(this.r);
        return this.r;
    }

    private final void K() {
        if (!this.x) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    public static j5 a(Context context, com.google.android.gms.internal.measurement.zzv zzvVar) {
        Bundle bundle;
        if (zzvVar != null && (zzvVar.f == null || zzvVar.g == null)) {
            zzvVar = new com.google.android.gms.internal.measurement.zzv(zzvVar.b, zzvVar.c, zzvVar.d, zzvVar.e, null, null, zzvVar.h);
        }
        com.google.android.gms.common.internal.u.a(context);
        com.google.android.gms.common.internal.u.a(context.getApplicationContext());
        if (G == null) {
            synchronized (j5.class) {
                if (G == null) {
                    G = new j5(new m6(context, zzvVar));
                }
            }
        } else if (zzvVar != null && (bundle = zzvVar.h) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            G.a(zzvVar.h.getBoolean("dataCollectionDefaultEnabled"));
        }
        return G;
    }

    public static j5 a(Context context, String str, String str2, Bundle bundle) {
        return a(context, new com.google.android.gms.internal.measurement.zzv(0L, 0L, true, null, null, null, bundle));
    }

    private static void a(f6 f6Var) {
        if (f6Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(m6 m6Var) {
        String concat;
        h4 h4Var;
        g().c();
        i iVar = new i(this);
        iVar.p();
        this.u = iVar;
        b4 b4Var = new b4(this, m6Var.f);
        b4Var.y();
        this.v = b4Var;
        a4 a4Var = new a4(this);
        a4Var.y();
        this.s = a4Var;
        w7 w7Var = new w7(this);
        w7Var.y();
        this.t = w7Var;
        this.l.q();
        this.h.q();
        this.w = new y4(this);
        this.v.z();
        k().z().a("App measurement initialized, version", Long.valueOf(this.g.n()));
        k().z().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String B = b4Var.B();
        if (TextUtils.isEmpty(this.b)) {
            if (w().d(B)) {
                h4Var = k().z();
                concat = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                h4 z = k().z();
                String valueOf = String.valueOf(B);
                concat = valueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
                h4Var = z;
            }
            h4Var.a(concat);
        }
        k().A().a("Debug-level message logging enabled");
        if (this.D != this.E.get()) {
            k().t().a("Not all components initialized", Integer.valueOf(this.D), Integer.valueOf(this.E.get()));
        }
        this.x = true;
    }

    private static void b(c3 c3Var) {
        if (c3Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (c3Var.w()) {
            return;
        }
        String valueOf = String.valueOf(c3Var.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("Component not initialized: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    private static void b(d6 d6Var) {
        if (d6Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (d6Var.s()) {
            return;
        }
        String valueOf = String.valueOf(d6Var.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("Component not initialized: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    public final String A() {
        return this.b;
    }

    public final String B() {
        return this.c;
    }

    public final String C() {
        return this.d;
    }

    public final boolean D() {
        return this.e;
    }

    public final r7 E() {
        b(this.o);
        return this.o;
    }

    public final w7 F() {
        b(this.t);
        return this.t;
    }

    public final i G() {
        b(this.u);
        return this.u;
    }

    public final b4 H() {
        b(this.v);
        return this.v;
    }

    public final z I() {
        z zVar = this.q;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException("Component not created");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a() {
        g().c();
        if (q().e.a() == 0) {
            q().e.a(this.n.a());
        }
        if (Long.valueOf(q().j.a()).longValue() == 0) {
            k().B().a("Persisting first open", Long.valueOf(this.F));
            q().j.a(this.F);
        }
        if (n()) {
            if (!TextUtils.isEmpty(H().C()) || !TextUtils.isEmpty(H().D())) {
                w();
                if (z9.a(H().C(), q().u(), H().D(), q().v())) {
                    k().z().a("Rechecking which service to use due to a GMP App Id change");
                    q().x();
                    y().B();
                    this.t.H();
                    this.t.F();
                    q().j.a(this.F);
                    q().l.a(null);
                }
                q().c(H().C());
                q().d(H().D());
            }
            v().a(q().l.a());
            if (com.google.android.gms.internal.measurement.k9.a() && this.g.a(o.P0) && !w().x() && !TextUtils.isEmpty(q().B.a())) {
                k().w().a("Remote config removed with active feature rollouts");
                q().B.a(null);
            }
            if (!TextUtils.isEmpty(H().C()) || !TextUtils.isEmpty(H().D())) {
                boolean c = c();
                if (!q().A() && !this.g.p()) {
                    q().c(!c);
                }
                if (c) {
                    v().I();
                }
                s().d.a();
                F().a(new AtomicReference<>());
            }
        } else if (c()) {
            if (!w().c("android.permission.INTERNET")) {
                k().t().a("App is missing INTERNET permission");
            }
            if (!w().c("android.permission.ACCESS_NETWORK_STATE")) {
                k().t().a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!ep.a(this.a).a() && !this.g.u()) {
                if (!z4.a(this.a)) {
                    k().t().a("AppMeasurementReceiver not registered/enabled");
                }
                if (!z9.a(this.a, false)) {
                    k().t().a("AppMeasurementService not registered/enabled");
                }
            }
            k().t().a("Uploading is not possible. App measurement disabled");
        }
        q().t.a(this.g.a(o.h0));
        q().u.a(this.g.a(o.i0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(c3 c3Var) {
        this.D++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(d6 d6Var) {
        this.D++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str, int i, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        boolean z = true;
        if (!((i == 200 || i == 204 || i == 304) && th == null)) {
            k().w().a("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
            return;
        }
        q().z.a(true);
        if (bArr.length == 0) {
            k().A().a("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String optString = jSONObject.optString("deeplink", "");
            String optString2 = jSONObject.optString("gclid", "");
            double optDouble = jSONObject.optDouble("timestamp", 0.0d);
            if (TextUtils.isEmpty(optString)) {
                k().A().a("Deferred Deep Link is empty.");
                return;
            }
            z9 w = w();
            w.a();
            if (TextUtils.isEmpty(optString) || (queryIntentActivities = w.l().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) == null || queryIntentActivities.isEmpty()) {
                z = false;
            }
            if (!z) {
                k().w().a("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gclid", optString2);
            bundle.putString("_cis", "ddp");
            this.p.a("auto", "_cmp", bundle);
            z9 w2 = w();
            if (TextUtils.isEmpty(optString) || !w2.a(optString, optDouble)) {
                return;
            }
            w2.l().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
        } catch (JSONException e) {
            k().t().a("Failed to parse the Deferred Deep Link response. exception", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        this.A = Boolean.valueOf(z);
    }

    public final boolean b() {
        return this.A != null && this.A.booleanValue();
    }

    public final boolean c() {
        if (com.google.android.gms.internal.measurement.ia.a() && this.g.a(o.X0)) {
            return e() == 0;
        }
        g().c();
        K();
        if (this.g.p()) {
            return false;
        }
        Boolean bool = this.C;
        if (bool != null && bool.booleanValue()) {
            return false;
        }
        Boolean y = q().y();
        if (y != null) {
            return y.booleanValue();
        }
        Boolean q = this.g.q();
        if (q != null) {
            return q.booleanValue();
        }
        Boolean bool2 = this.B;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        if (com.google.android.gms.common.api.internal.h.b()) {
            return false;
        }
        if (!this.g.a(o.X) || this.A == null) {
            return true;
        }
        return this.A.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.h6
    public final ka d() {
        return this.f;
    }

    public final int e() {
        g().c();
        if (this.g.p()) {
            return 1;
        }
        Boolean bool = this.C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        Boolean y = q().y();
        if (y != null) {
            return y.booleanValue() ? 0 : 3;
        }
        Boolean q = this.g.q();
        if (q != null) {
            return q.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.B;
        if (bool2 != null) {
            return bool2.booleanValue() ? 0 : 5;
        }
        if (com.google.android.gms.common.api.internal.h.b()) {
            return 6;
        }
        return (!this.g.a(o.X) || this.A == null || this.A.booleanValue()) ? 0 : 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long f() {
        Long valueOf = Long.valueOf(q().j.a());
        return valueOf.longValue() == 0 ? this.F : Math.min(this.F, valueOf.longValue());
    }

    @Override // com.google.android.gms.measurement.internal.h6
    public final g5 g() {
        b(this.j);
        return this.j;
    }

    @Override // com.google.android.gms.measurement.internal.h6
    public final com.google.android.gms.common.util.e h() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    @Override // com.google.android.gms.measurement.internal.h6
    public final f4 k() {
        b(this.i);
        return this.i;
    }

    @Override // com.google.android.gms.measurement.internal.h6
    public final Context l() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m() {
        this.E.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean n() {
        K();
        g().c();
        Boolean bool = this.y;
        if (bool == null || this.z == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.n.b() - this.z) > 1000)) {
            this.z = this.n.b();
            boolean z = true;
            Boolean valueOf = Boolean.valueOf(w().c("android.permission.INTERNET") && w().c("android.permission.ACCESS_NETWORK_STATE") && (ep.a(this.a).a() || this.g.u() || (z4.a(this.a) && z9.a(this.a, false))));
            this.y = valueOf;
            if (valueOf.booleanValue()) {
                if (!w().a(H().C(), H().D(), H().E()) && TextUtils.isEmpty(H().D())) {
                    z = false;
                }
                this.y = Boolean.valueOf(z);
            }
        }
        return this.y.booleanValue();
    }

    public final void o() {
        g().c();
        b(J());
        String B = H().B();
        Pair<String, Boolean> a = q().a(B);
        if (!this.g.r().booleanValue() || ((Boolean) a.second).booleanValue() || TextUtils.isEmpty((CharSequence) a.first)) {
            k().A().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        if (!J().t()) {
            k().w().a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        URL a2 = w().a(H().m().n(), B, (String) a.first, q().A.a() - 1);
        m7 J = J();
        l7 l7Var = new l7(this) { // from class: com.google.android.gms.measurement.internal.m5
            private final j5 a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
            }

            @Override // com.google.android.gms.measurement.internal.l7
            public final void a(String str, int i, Throwable th, byte[] bArr, Map map) {
                this.a.a(str, i, th, bArr, map);
            }
        };
        J.c();
        J.o();
        com.google.android.gms.common.internal.u.a(a2);
        com.google.android.gms.common.internal.u.a(l7Var);
        J.g().b(new o7(J, B, a2, null, null, l7Var));
    }

    public final la p() {
        return this.g;
    }

    public final s4 q() {
        a((f6) this.h);
        return this.h;
    }

    public final f4 r() {
        f4 f4Var = this.i;
        if (f4Var == null || !f4Var.s()) {
            return null;
        }
        return this.i;
    }

    public final x8 s() {
        b(this.k);
        return this.k;
    }

    public final y4 t() {
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final g5 u() {
        return this.j;
    }

    public final p6 v() {
        b(this.p);
        return this.p;
    }

    public final z9 w() {
        a((f6) this.l);
        return this.l;
    }

    public final c4 x() {
        a((f6) this.m);
        return this.m;
    }

    public final a4 y() {
        b(this.s);
        return this.s;
    }

    public final boolean z() {
        return TextUtils.isEmpty(this.b);
    }
}
