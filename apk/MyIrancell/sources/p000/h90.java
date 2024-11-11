package p000;

import java.util.List;
import p000.a80;

/* loaded from: classes.dex */
public final class h90 implements a80.InterfaceC0010a {

    /* renamed from: a */
    private final List<a80> f10412a;

    /* renamed from: b */
    private final a90 f10413b;

    /* renamed from: c */
    private final d90 f10414c;

    /* renamed from: d */
    private final w80 f10415d;

    /* renamed from: e */
    private final int f10416e;

    /* renamed from: f */
    private final g80 f10417f;

    /* renamed from: g */
    private final k70 f10418g;

    /* renamed from: h */
    private final v70 f10419h;

    /* renamed from: i */
    private final int f10420i;

    /* renamed from: j */
    private final int f10421j;

    /* renamed from: k */
    private final int f10422k;

    /* renamed from: l */
    private int f10423l;

    public h90(List<a80> list, a90 a90Var, d90 d90Var, w80 w80Var, int i, g80 g80Var, k70 k70Var, v70 v70Var, int i2, int i3, int i4) {
        this.f10412a = list;
        this.f10415d = w80Var;
        this.f10413b = a90Var;
        this.f10414c = d90Var;
        this.f10416e = i;
        this.f10417f = g80Var;
        this.f10418g = k70Var;
        this.f10419h = v70Var;
        this.f10420i = i2;
        this.f10421j = i3;
        this.f10422k = i4;
    }

    @Override // p000.a80.InterfaceC0010a
    /* renamed from: a */
    public int mo95a() {
        return this.f10420i;
    }

    @Override // p000.a80.InterfaceC0010a
    /* renamed from: a */
    public i80 mo96a(g80 g80Var) {
        return m12149a(g80Var, this.f10413b, this.f10414c, this.f10415d);
    }

    /* renamed from: a */
    public i80 m12149a(g80 g80Var, a90 a90Var, d90 d90Var, w80 w80Var) {
        if (this.f10416e >= this.f10412a.size()) {
            throw new AssertionError();
        }
        this.f10423l++;
        if (this.f10414c != null && !this.f10415d.m16167a(g80Var.m11925g())) {
            throw new IllegalStateException("network interceptor " + this.f10412a.get(this.f10416e - 1) + " must retain the same host and port");
        }
        if (this.f10414c != null && this.f10423l > 1) {
            throw new IllegalStateException("network interceptor " + this.f10412a.get(this.f10416e - 1) + " must call proceed() exactly once");
        }
        h90 h90Var = new h90(this.f10412a, a90Var, d90Var, w80Var, this.f10416e + 1, g80Var, this.f10418g, this.f10419h, this.f10420i, this.f10421j, this.f10422k);
        a80 a80Var = this.f10412a.get(this.f10416e);
        i80 intercept = a80Var.intercept(h90Var);
        if (d90Var != null && this.f10416e + 1 < this.f10412a.size() && h90Var.f10423l != 1) {
            throw new IllegalStateException("network interceptor " + a80Var + " must call proceed() exactly once");
        }
        if (intercept == null) {
            throw new NullPointerException("interceptor " + a80Var + " returned null");
        }
        if (intercept.m12385a() != null) {
            return intercept;
        }
        throw new IllegalStateException("interceptor " + a80Var + " returned a response with no body");
    }

    @Override // p000.a80.InterfaceC0010a
    /* renamed from: b */
    public int mo97b() {
        return this.f10421j;
    }

    @Override // p000.a80.InterfaceC0010a
    /* renamed from: c */
    public int mo98c() {
        return this.f10422k;
    }

    @Override // p000.a80.InterfaceC0010a
    /* renamed from: d */
    public g80 mo99d() {
        return this.f10417f;
    }

    @Override // p000.a80.InterfaceC0010a
    /* renamed from: e */
    public o70 mo100e() {
        return this.f10415d;
    }

    /* renamed from: f */
    public k70 m12150f() {
        return this.f10418g;
    }

    /* renamed from: g */
    public v70 m12151g() {
        return this.f10419h;
    }

    /* renamed from: h */
    public d90 m12152h() {
        return this.f10414c;
    }

    /* renamed from: i */
    public a90 m12153i() {
        return this.f10413b;
    }
}
