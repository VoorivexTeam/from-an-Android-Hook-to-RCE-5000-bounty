package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class k extends RecyclerView.l {
    boolean g = true;

    public final void a(RecyclerView.c0 c0Var, boolean z) {
        c(c0Var, z);
        b(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean a(RecyclerView.c0 c0Var) {
        return !this.g || c0Var.n();
    }

    public abstract boolean a(RecyclerView.c0 c0Var, int i, int i2, int i3, int i4);

    public abstract boolean a(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2, int i, int i2, int i3, int i4);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean a(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i;
        int i2;
        int i3 = cVar.a;
        int i4 = cVar.b;
        if (c0Var2.x()) {
            int i5 = cVar.a;
            i2 = cVar.b;
            i = i5;
        } else {
            i = cVar2.a;
            i2 = cVar2.b;
        }
        return a(c0Var, c0Var2, i3, i4, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean a(RecyclerView.c0 c0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        return (cVar == null || (cVar.a == cVar2.a && cVar.b == cVar2.b)) ? f(c0Var) : a(c0Var, cVar.a, cVar.b, cVar2.a, cVar2.b);
    }

    public final void b(RecyclerView.c0 c0Var, boolean z) {
        d(c0Var, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean b(RecyclerView.c0 c0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i = cVar.a;
        int i2 = cVar.b;
        View view = c0Var.a;
        int left = cVar2 == null ? view.getLeft() : cVar2.a;
        int top = cVar2 == null ? view.getTop() : cVar2.b;
        if (c0Var.p() || (i == left && i2 == top)) {
            return g(c0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return a(c0Var, i, i2, left, top);
    }

    public void c(RecyclerView.c0 c0Var, boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean c(RecyclerView.c0 c0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        if (cVar.a != cVar2.a || cVar.b != cVar2.b) {
            return a(c0Var, cVar.a, cVar.b, cVar2.a, cVar2.b);
        }
        j(c0Var);
        return false;
    }

    public void d(RecyclerView.c0 c0Var, boolean z) {
    }

    public abstract boolean f(RecyclerView.c0 c0Var);

    public abstract boolean g(RecyclerView.c0 c0Var);

    public final void h(RecyclerView.c0 c0Var) {
        n(c0Var);
        b(c0Var);
    }

    public final void i(RecyclerView.c0 c0Var) {
        o(c0Var);
    }

    public final void j(RecyclerView.c0 c0Var) {
        p(c0Var);
        b(c0Var);
    }

    public final void k(RecyclerView.c0 c0Var) {
        q(c0Var);
    }

    public final void l(RecyclerView.c0 c0Var) {
        r(c0Var);
        b(c0Var);
    }

    public final void m(RecyclerView.c0 c0Var) {
        s(c0Var);
    }

    public void n(RecyclerView.c0 c0Var) {
    }

    public void o(RecyclerView.c0 c0Var) {
    }

    public void p(RecyclerView.c0 c0Var) {
    }

    public void q(RecyclerView.c0 c0Var) {
    }

    public void r(RecyclerView.c0 c0Var) {
    }

    public void s(RecyclerView.c0 c0Var) {
    }
}
