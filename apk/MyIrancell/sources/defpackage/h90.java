package defpackage;

import defpackage.a80;
import java.util.List;

/* loaded from: classes.dex */
public final class h90 implements a80.a {
    private final List<a80> a;
    private final a90 b;
    private final d90 c;
    private final w80 d;
    private final int e;
    private final g80 f;
    private final k70 g;
    private final v70 h;
    private final int i;
    private final int j;
    private final int k;
    private int l;

    public h90(List<a80> list, a90 a90Var, d90 d90Var, w80 w80Var, int i, g80 g80Var, k70 k70Var, v70 v70Var, int i2, int i3, int i4) {
        this.a = list;
        this.d = w80Var;
        this.b = a90Var;
        this.c = d90Var;
        this.e = i;
        this.f = g80Var;
        this.g = k70Var;
        this.h = v70Var;
        this.i = i2;
        this.j = i3;
        this.k = i4;
    }

    @Override // a80.a
    public int a() {
        return this.i;
    }

    @Override // a80.a
    public i80 a(g80 g80Var) {
        return a(g80Var, this.b, this.c, this.d);
    }

    public i80 a(g80 g80Var, a90 a90Var, d90 d90Var, w80 w80Var) {
        if (this.e >= this.a.size()) {
            throw new AssertionError();
        }
        this.l++;
        if (this.c != null && !this.d.a(g80Var.g())) {
            throw new IllegalStateException("network interceptor " + this.a.get(this.e - 1) + " must retain the same host and port");
        }
        if (this.c != null && this.l > 1) {
            throw new IllegalStateException("network interceptor " + this.a.get(this.e - 1) + " must call proceed() exactly once");
        }
        h90 h90Var = new h90(this.a, a90Var, d90Var, w80Var, this.e + 1, g80Var, this.g, this.h, this.i, this.j, this.k);
        a80 a80Var = this.a.get(this.e);
        i80 intercept = a80Var.intercept(h90Var);
        if (d90Var != null && this.e + 1 < this.a.size() && h90Var.l != 1) {
            throw new IllegalStateException("network interceptor " + a80Var + " must call proceed() exactly once");
        }
        if (intercept == null) {
            throw new NullPointerException("interceptor " + a80Var + " returned null");
        }
        if (intercept.a() != null) {
            return intercept;
        }
        throw new IllegalStateException("interceptor " + a80Var + " returned a response with no body");
    }

    @Override // a80.a
    public int b() {
        return this.j;
    }

    @Override // a80.a
    public int c() {
        return this.k;
    }

    @Override // a80.a
    public g80 d() {
        return this.f;
    }

    @Override // a80.a
    public o70 e() {
        return this.d;
    }

    public k70 f() {
        return this.g;
    }

    public v70 g() {
        return this.h;
    }

    public d90 h() {
        return this.c;
    }

    public a90 i() {
        return this.b;
    }
}
