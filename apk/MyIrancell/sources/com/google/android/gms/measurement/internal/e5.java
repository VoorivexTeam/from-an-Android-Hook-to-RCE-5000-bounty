package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e5 {
    private long A;
    private long B;
    private long C;
    private String D;
    private boolean E;
    private long F;
    private long G;
    private final j5 a;
    private final String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private long g;
    private long h;
    private long i;
    private String j;
    private long k;
    private String l;
    private long m;
    private long n;
    private boolean o;
    private long p;
    private boolean q;
    private boolean r;
    private String s;
    private Boolean t;
    private long u;
    private List<String> v;
    private String w;
    private long x;
    private long y;
    private long z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e5(j5 j5Var, String str) {
        com.google.android.gms.common.internal.u.a(j5Var);
        com.google.android.gms.common.internal.u.b(str);
        this.a = j5Var;
        this.b = str;
        j5Var.g().c();
    }

    public final boolean A() {
        this.a.g().c();
        return this.o;
    }

    public final long B() {
        this.a.g().c();
        return this.g;
    }

    public final long C() {
        this.a.g().c();
        return this.F;
    }

    public final long D() {
        this.a.g().c();
        return this.G;
    }

    public final void E() {
        this.a.g().c();
        long j = this.g + 1;
        if (j > 2147483647L) {
            this.a.k().w().a("Bundle index overflow. appId", f4.a(this.b));
            j = 0;
        }
        this.E = true;
        this.g = j;
    }

    public final long F() {
        this.a.g().c();
        return this.x;
    }

    public final long G() {
        this.a.g().c();
        return this.y;
    }

    public final long H() {
        this.a.g().c();
        return this.z;
    }

    public final long I() {
        this.a.g().c();
        return this.A;
    }

    public final void a(long j) {
        this.a.g().c();
        this.E |= this.h != j;
        this.h = j;
    }

    public final void a(Boolean bool) {
        this.a.g().c();
        this.E |= !z9.a(this.t, bool);
        this.t = bool;
    }

    public final void a(String str) {
        this.a.g().c();
        this.E |= !z9.c(this.c, str);
        this.c = str;
    }

    public final void a(List<String> list) {
        this.a.g().c();
        if (z9.a(this.v, list)) {
            return;
        }
        this.E = true;
        this.v = list != null ? new ArrayList(list) : null;
    }

    public final void a(boolean z) {
        this.a.g().c();
        this.E |= this.o != z;
        this.o = z;
    }

    public final boolean a() {
        this.a.g().c();
        return this.E;
    }

    public final long b() {
        this.a.g().c();
        return this.C;
    }

    public final void b(long j) {
        this.a.g().c();
        this.E |= this.i != j;
        this.i = j;
    }

    public final void b(String str) {
        this.a.g().c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= !z9.c(this.d, str);
        this.d = str;
    }

    public final void b(boolean z) {
        this.a.g().c();
        this.E |= this.q != z;
        this.q = z;
    }

    public final long c() {
        this.a.g().c();
        return this.B;
    }

    public final void c(long j) {
        this.a.g().c();
        this.E |= this.k != j;
        this.k = j;
    }

    public final void c(String str) {
        this.a.g().c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= !z9.c(this.s, str);
        this.s = str;
    }

    public final void c(boolean z) {
        this.a.g().c();
        this.E |= this.r != z;
        this.r = z;
    }

    public final String d() {
        this.a.g().c();
        return this.D;
    }

    public final void d(long j) {
        this.a.g().c();
        this.E |= this.m != j;
        this.m = j;
    }

    public final void d(String str) {
        this.a.g().c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= !z9.c(this.w, str);
        this.w = str;
    }

    public final String e() {
        this.a.g().c();
        String str = this.D;
        i((String) null);
        return str;
    }

    public final void e(long j) {
        this.a.g().c();
        this.E |= this.n != j;
        this.n = j;
    }

    public final void e(String str) {
        this.a.g().c();
        this.E |= !z9.c(this.e, str);
        this.e = str;
    }

    public final long f() {
        this.a.g().c();
        return this.p;
    }

    public final void f(long j) {
        this.a.g().c();
        this.E |= this.u != j;
        this.u = j;
    }

    public final void f(String str) {
        this.a.g().c();
        this.E |= !z9.c(this.f, str);
        this.f = str;
    }

    public final void g(long j) {
        com.google.android.gms.common.internal.u.a(j >= 0);
        this.a.g().c();
        this.E = (this.g != j) | this.E;
        this.g = j;
    }

    public final void g(String str) {
        this.a.g().c();
        this.E |= !z9.c(this.j, str);
        this.j = str;
    }

    public final boolean g() {
        this.a.g().c();
        return this.q;
    }

    public final void h(long j) {
        this.a.g().c();
        this.E |= this.F != j;
        this.F = j;
    }

    public final void h(String str) {
        this.a.g().c();
        this.E |= !z9.c(this.l, str);
        this.l = str;
    }

    public final boolean h() {
        this.a.g().c();
        return this.r;
    }

    public final Boolean i() {
        this.a.g().c();
        return this.t;
    }

    public final void i(long j) {
        this.a.g().c();
        this.E |= this.G != j;
        this.G = j;
    }

    public final void i(String str) {
        this.a.g().c();
        this.E |= !z9.c(this.D, str);
        this.D = str;
    }

    public final List<String> j() {
        this.a.g().c();
        return this.v;
    }

    public final void j(long j) {
        this.a.g().c();
        this.E |= this.x != j;
        this.x = j;
    }

    public final void k() {
        this.a.g().c();
        this.E = false;
    }

    public final void k(long j) {
        this.a.g().c();
        this.E |= this.y != j;
        this.y = j;
    }

    public final String l() {
        this.a.g().c();
        return this.b;
    }

    public final void l(long j) {
        this.a.g().c();
        this.E |= this.z != j;
        this.z = j;
    }

    public final String m() {
        this.a.g().c();
        return this.c;
    }

    public final void m(long j) {
        this.a.g().c();
        this.E |= this.A != j;
        this.A = j;
    }

    public final String n() {
        this.a.g().c();
        return this.d;
    }

    public final void n(long j) {
        this.a.g().c();
        this.E |= this.C != j;
        this.C = j;
    }

    public final String o() {
        this.a.g().c();
        return this.s;
    }

    public final void o(long j) {
        this.a.g().c();
        this.E |= this.B != j;
        this.B = j;
    }

    public final String p() {
        this.a.g().c();
        return this.w;
    }

    public final void p(long j) {
        this.a.g().c();
        this.E |= this.p != j;
        this.p = j;
    }

    public final String q() {
        this.a.g().c();
        return this.e;
    }

    public final String r() {
        this.a.g().c();
        return this.f;
    }

    public final long s() {
        this.a.g().c();
        return this.h;
    }

    public final long t() {
        this.a.g().c();
        return this.i;
    }

    public final String u() {
        this.a.g().c();
        return this.j;
    }

    public final long v() {
        this.a.g().c();
        return this.k;
    }

    public final String w() {
        this.a.g().c();
        return this.l;
    }

    public final long x() {
        this.a.g().c();
        return this.m;
    }

    public final long y() {
        this.a.g().c();
        return this.n;
    }

    public final long z() {
        this.a.g().c();
        return this.u;
    }
}
