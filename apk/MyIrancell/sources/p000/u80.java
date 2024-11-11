package p000;

import p000.a80;

/* loaded from: classes.dex */
public final class u80 implements a80 {

    /* renamed from: a */
    public final d80 f13436a;

    public u80(d80 d80Var) {
        this.f13436a = d80Var;
    }

    @Override // p000.a80
    public i80 intercept(a80.InterfaceC0010a interfaceC0010a) {
        h90 h90Var = (h90) interfaceC0010a;
        g80 mo99d = h90Var.mo99d();
        a90 m12153i = h90Var.m12153i();
        return h90Var.m12149a(mo99d, m12153i, m12153i.m108a(this.f13436a, interfaceC0010a, !mo99d.m11923e().equals("GET")), m12153i.m115c());
    }
}
