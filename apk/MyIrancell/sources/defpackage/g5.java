package defpackage;

import defpackage.h5;
import defpackage.m7;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class g5 implements q4, h5.b {
    private final String a;
    private final boolean b;
    private final List<h5.b> c = new ArrayList();
    private final m7.a d;
    private final h5<?, Float> e;
    private final h5<?, Float> f;
    private final h5<?, Float> g;

    public g5(n7 n7Var, m7 m7Var) {
        this.a = m7Var.b();
        this.b = m7Var.f();
        this.d = m7Var.e();
        this.e = m7Var.d().a();
        this.f = m7Var.a().a();
        this.g = m7Var.c().a();
        n7Var.a(this.e);
        n7Var.a(this.f);
        n7Var.a(this.g);
        this.e.a(this);
        this.f.a(this);
        this.g.a(this);
    }

    @Override // defpackage.q4
    public String a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(h5.b bVar) {
        this.c.add(bVar);
    }

    @Override // defpackage.q4
    public void a(List<q4> list, List<q4> list2) {
    }

    @Override // h5.b
    public void b() {
        for (int i = 0; i < this.c.size(); i++) {
            this.c.get(i).b();
        }
    }

    public h5<?, Float> d() {
        return this.f;
    }

    public h5<?, Float> e() {
        return this.g;
    }

    public h5<?, Float> f() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m7.a g() {
        return this.d;
    }

    public boolean h() {
        return this.b;
    }
}
