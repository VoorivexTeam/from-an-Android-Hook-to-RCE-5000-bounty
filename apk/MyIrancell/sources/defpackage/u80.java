package defpackage;

import defpackage.a80;

/* loaded from: classes.dex */
public final class u80 implements a80 {
    public final d80 a;

    public u80(d80 d80Var) {
        this.a = d80Var;
    }

    @Override // defpackage.a80
    public i80 intercept(a80.a aVar) {
        h90 h90Var = (h90) aVar;
        g80 d = h90Var.d();
        a90 i = h90Var.i();
        return h90Var.a(d, i, i.a(this.a, aVar, !d.e().equals("GET")), i.c());
    }
}
