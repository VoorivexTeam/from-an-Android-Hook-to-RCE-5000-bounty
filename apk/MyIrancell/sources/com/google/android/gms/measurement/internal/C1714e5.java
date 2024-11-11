package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C1057u;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.e5 */
/* loaded from: classes.dex */
public final class C1714e5 {

    /* renamed from: A */
    private long f7480A;

    /* renamed from: B */
    private long f7481B;

    /* renamed from: C */
    private long f7482C;

    /* renamed from: D */
    private String f7483D;

    /* renamed from: E */
    private boolean f7484E;

    /* renamed from: F */
    private long f7485F;

    /* renamed from: G */
    private long f7486G;

    /* renamed from: a */
    private final C1774j5 f7487a;

    /* renamed from: b */
    private final String f7488b;

    /* renamed from: c */
    private String f7489c;

    /* renamed from: d */
    private String f7490d;

    /* renamed from: e */
    private String f7491e;

    /* renamed from: f */
    private String f7492f;

    /* renamed from: g */
    private long f7493g;

    /* renamed from: h */
    private long f7494h;

    /* renamed from: i */
    private long f7495i;

    /* renamed from: j */
    private String f7496j;

    /* renamed from: k */
    private long f7497k;

    /* renamed from: l */
    private String f7498l;

    /* renamed from: m */
    private long f7499m;

    /* renamed from: n */
    private long f7500n;

    /* renamed from: o */
    private boolean f7501o;

    /* renamed from: p */
    private long f7502p;

    /* renamed from: q */
    private boolean f7503q;

    /* renamed from: r */
    private boolean f7504r;

    /* renamed from: s */
    private String f7505s;

    /* renamed from: t */
    private Boolean f7506t;

    /* renamed from: u */
    private long f7507u;

    /* renamed from: v */
    private List<String> f7508v;

    /* renamed from: w */
    private String f7509w;

    /* renamed from: x */
    private long f7510x;

    /* renamed from: y */
    private long f7511y;

    /* renamed from: z */
    private long f7512z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1714e5(C1774j5 c1774j5, String str) {
        C1057u.m7286a(c1774j5);
        C1057u.m7296b(str);
        this.f7487a = c1774j5;
        this.f7488b = str;
        c1774j5.mo9320g().mo9194c();
    }

    /* renamed from: A */
    public final boolean m9224A() {
        this.f7487a.mo9320g().mo9194c();
        return this.f7501o;
    }

    /* renamed from: B */
    public final long m9225B() {
        this.f7487a.mo9320g().mo9194c();
        return this.f7493g;
    }

    /* renamed from: C */
    public final long m9226C() {
        this.f7487a.mo9320g().mo9194c();
        return this.f7485F;
    }

    /* renamed from: D */
    public final long m9227D() {
        this.f7487a.mo9320g().mo9194c();
        return this.f7486G;
    }

    /* renamed from: E */
    public final void m9228E() {
        this.f7487a.mo9320g().mo9194c();
        long j = this.f7493g + 1;
        if (j > 2147483647L) {
            this.f7487a.mo9324k().m9312w().m9366a("Bundle index overflow. appId", C1725f4.m9298a(this.f7488b));
            j = 0;
        }
        this.f7484E = true;
        this.f7493g = j;
    }

    /* renamed from: F */
    public final long m9229F() {
        this.f7487a.mo9320g().mo9194c();
        return this.f7510x;
    }

    /* renamed from: G */
    public final long m9230G() {
        this.f7487a.mo9320g().mo9194c();
        return this.f7511y;
    }

    /* renamed from: H */
    public final long m9231H() {
        this.f7487a.mo9320g().mo9194c();
        return this.f7512z;
    }

    /* renamed from: I */
    public final long m9232I() {
        this.f7487a.mo9320g().mo9194c();
        return this.f7480A;
    }

    /* renamed from: a */
    public final void m9233a(long j) {
        this.f7487a.mo9320g().mo9194c();
        this.f7484E |= this.f7494h != j;
        this.f7494h = j;
    }

    /* renamed from: a */
    public final void m9234a(Boolean bool) {
        this.f7487a.mo9320g().mo9194c();
        this.f7484E |= !C1959z9.m9914a(this.f7506t, bool);
        this.f7506t = bool;
    }

    /* renamed from: a */
    public final void m9235a(String str) {
        this.f7487a.mo9320g().mo9194c();
        this.f7484E |= !C1959z9.m9924c(this.f7489c, str);
        this.f7489c = str;
    }

    /* renamed from: a */
    public final void m9236a(List<String> list) {
        this.f7487a.mo9320g().mo9194c();
        if (C1959z9.m9917a(this.f7508v, list)) {
            return;
        }
        this.f7484E = true;
        this.f7508v = list != null ? new ArrayList(list) : null;
    }

    /* renamed from: a */
    public final void m9237a(boolean z) {
        this.f7487a.mo9320g().mo9194c();
        this.f7484E |= this.f7501o != z;
        this.f7501o = z;
    }

    /* renamed from: a */
    public final boolean m9238a() {
        this.f7487a.mo9320g().mo9194c();
        return this.f7484E;
    }

    /* renamed from: b */
    public final long m9239b() {
        this.f7487a.mo9320g().mo9194c();
        return this.f7482C;
    }

    /* renamed from: b */
    public final void m9240b(long j) {
        this.f7487a.mo9320g().mo9194c();
        this.f7484E |= this.f7495i != j;
        this.f7495i = j;
    }

    /* renamed from: b */
    public final void m9241b(String str) {
        this.f7487a.mo9320g().mo9194c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f7484E |= !C1959z9.m9924c(this.f7490d, str);
        this.f7490d = str;
    }

    /* renamed from: b */
    public final void m9242b(boolean z) {
        this.f7487a.mo9320g().mo9194c();
        this.f7484E |= this.f7503q != z;
        this.f7503q = z;
    }

    /* renamed from: c */
    public final long m9243c() {
        this.f7487a.mo9320g().mo9194c();
        return this.f7481B;
    }

    /* renamed from: c */
    public final void m9244c(long j) {
        this.f7487a.mo9320g().mo9194c();
        this.f7484E |= this.f7497k != j;
        this.f7497k = j;
    }

    /* renamed from: c */
    public final void m9245c(String str) {
        this.f7487a.mo9320g().mo9194c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f7484E |= !C1959z9.m9924c(this.f7505s, str);
        this.f7505s = str;
    }

    /* renamed from: c */
    public final void m9246c(boolean z) {
        this.f7487a.mo9320g().mo9194c();
        this.f7484E |= this.f7504r != z;
        this.f7504r = z;
    }

    /* renamed from: d */
    public final String m9247d() {
        this.f7487a.mo9320g().mo9194c();
        return this.f7483D;
    }

    /* renamed from: d */
    public final void m9248d(long j) {
        this.f7487a.mo9320g().mo9194c();
        this.f7484E |= this.f7499m != j;
        this.f7499m = j;
    }

    /* renamed from: d */
    public final void m9249d(String str) {
        this.f7487a.mo9320g().mo9194c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f7484E |= !C1959z9.m9924c(this.f7509w, str);
        this.f7509w = str;
    }

    /* renamed from: e */
    public final String m9250e() {
        this.f7487a.mo9320g().mo9194c();
        String str = this.f7483D;
        m9264i((String) null);
        return str;
    }

    /* renamed from: e */
    public final void m9251e(long j) {
        this.f7487a.mo9320g().mo9194c();
        this.f7484E |= this.f7500n != j;
        this.f7500n = j;
    }

    /* renamed from: e */
    public final void m9252e(String str) {
        this.f7487a.mo9320g().mo9194c();
        this.f7484E |= !C1959z9.m9924c(this.f7491e, str);
        this.f7491e = str;
    }

    /* renamed from: f */
    public final long m9253f() {
        this.f7487a.mo9320g().mo9194c();
        return this.f7502p;
    }

    /* renamed from: f */
    public final void m9254f(long j) {
        this.f7487a.mo9320g().mo9194c();
        this.f7484E |= this.f7507u != j;
        this.f7507u = j;
    }

    /* renamed from: f */
    public final void m9255f(String str) {
        this.f7487a.mo9320g().mo9194c();
        this.f7484E |= !C1959z9.m9924c(this.f7492f, str);
        this.f7492f = str;
    }

    /* renamed from: g */
    public final void m9256g(long j) {
        C1057u.m7293a(j >= 0);
        this.f7487a.mo9320g().mo9194c();
        this.f7484E = (this.f7493g != j) | this.f7484E;
        this.f7493g = j;
    }

    /* renamed from: g */
    public final void m9257g(String str) {
        this.f7487a.mo9320g().mo9194c();
        this.f7484E |= !C1959z9.m9924c(this.f7496j, str);
        this.f7496j = str;
    }

    /* renamed from: g */
    public final boolean m9258g() {
        this.f7487a.mo9320g().mo9194c();
        return this.f7503q;
    }

    /* renamed from: h */
    public final void m9259h(long j) {
        this.f7487a.mo9320g().mo9194c();
        this.f7484E |= this.f7485F != j;
        this.f7485F = j;
    }

    /* renamed from: h */
    public final void m9260h(String str) {
        this.f7487a.mo9320g().mo9194c();
        this.f7484E |= !C1959z9.m9924c(this.f7498l, str);
        this.f7498l = str;
    }

    /* renamed from: h */
    public final boolean m9261h() {
        this.f7487a.mo9320g().mo9194c();
        return this.f7504r;
    }

    /* renamed from: i */
    public final Boolean m9262i() {
        this.f7487a.mo9320g().mo9194c();
        return this.f7506t;
    }

    /* renamed from: i */
    public final void m9263i(long j) {
        this.f7487a.mo9320g().mo9194c();
        this.f7484E |= this.f7486G != j;
        this.f7486G = j;
    }

    /* renamed from: i */
    public final void m9264i(String str) {
        this.f7487a.mo9320g().mo9194c();
        this.f7484E |= !C1959z9.m9924c(this.f7483D, str);
        this.f7483D = str;
    }

    /* renamed from: j */
    public final List<String> m9265j() {
        this.f7487a.mo9320g().mo9194c();
        return this.f7508v;
    }

    /* renamed from: j */
    public final void m9266j(long j) {
        this.f7487a.mo9320g().mo9194c();
        this.f7484E |= this.f7510x != j;
        this.f7510x = j;
    }

    /* renamed from: k */
    public final void m9267k() {
        this.f7487a.mo9320g().mo9194c();
        this.f7484E = false;
    }

    /* renamed from: k */
    public final void m9268k(long j) {
        this.f7487a.mo9320g().mo9194c();
        this.f7484E |= this.f7511y != j;
        this.f7511y = j;
    }

    /* renamed from: l */
    public final String m9269l() {
        this.f7487a.mo9320g().mo9194c();
        return this.f7488b;
    }

    /* renamed from: l */
    public final void m9270l(long j) {
        this.f7487a.mo9320g().mo9194c();
        this.f7484E |= this.f7512z != j;
        this.f7512z = j;
    }

    /* renamed from: m */
    public final String m9271m() {
        this.f7487a.mo9320g().mo9194c();
        return this.f7489c;
    }

    /* renamed from: m */
    public final void m9272m(long j) {
        this.f7487a.mo9320g().mo9194c();
        this.f7484E |= this.f7480A != j;
        this.f7480A = j;
    }

    /* renamed from: n */
    public final String m9273n() {
        this.f7487a.mo9320g().mo9194c();
        return this.f7490d;
    }

    /* renamed from: n */
    public final void m9274n(long j) {
        this.f7487a.mo9320g().mo9194c();
        this.f7484E |= this.f7482C != j;
        this.f7482C = j;
    }

    /* renamed from: o */
    public final String m9275o() {
        this.f7487a.mo9320g().mo9194c();
        return this.f7505s;
    }

    /* renamed from: o */
    public final void m9276o(long j) {
        this.f7487a.mo9320g().mo9194c();
        this.f7484E |= this.f7481B != j;
        this.f7481B = j;
    }

    /* renamed from: p */
    public final String m9277p() {
        this.f7487a.mo9320g().mo9194c();
        return this.f7509w;
    }

    /* renamed from: p */
    public final void m9278p(long j) {
        this.f7487a.mo9320g().mo9194c();
        this.f7484E |= this.f7502p != j;
        this.f7502p = j;
    }

    /* renamed from: q */
    public final String m9279q() {
        this.f7487a.mo9320g().mo9194c();
        return this.f7491e;
    }

    /* renamed from: r */
    public final String m9280r() {
        this.f7487a.mo9320g().mo9194c();
        return this.f7492f;
    }

    /* renamed from: s */
    public final long m9281s() {
        this.f7487a.mo9320g().mo9194c();
        return this.f7494h;
    }

    /* renamed from: t */
    public final long m9282t() {
        this.f7487a.mo9320g().mo9194c();
        return this.f7495i;
    }

    /* renamed from: u */
    public final String m9283u() {
        this.f7487a.mo9320g().mo9194c();
        return this.f7496j;
    }

    /* renamed from: v */
    public final long m9284v() {
        this.f7487a.mo9320g().mo9194c();
        return this.f7497k;
    }

    /* renamed from: w */
    public final String m9285w() {
        this.f7487a.mo9320g().mo9194c();
        return this.f7498l;
    }

    /* renamed from: x */
    public final long m9286x() {
        this.f7487a.mo9320g().mo9194c();
        return this.f7499m;
    }

    /* renamed from: y */
    public final long m9287y() {
        this.f7487a.mo9320g().mo9194c();
        return this.f7500n;
    }

    /* renamed from: z */
    public final long m9288z() {
        this.f7487a.mo9320g().mo9194c();
        return this.f7507u;
    }
}
