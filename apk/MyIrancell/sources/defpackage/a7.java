package defpackage;

import com.airbnb.lottie.f;
import defpackage.l7;
import java.util.List;

/* loaded from: classes.dex */
public class a7 implements x6 {
    private final String a;
    private final b7 b;
    private final k6 c;
    private final l6 d;
    private final n6 e;
    private final n6 f;
    private final j6 g;
    private final l7.b h;
    private final l7.c i;
    private final float j;
    private final List<j6> k;
    private final j6 l;
    private final boolean m;

    public a7(String str, b7 b7Var, k6 k6Var, l6 l6Var, n6 n6Var, n6 n6Var2, j6 j6Var, l7.b bVar, l7.c cVar, float f, List<j6> list, j6 j6Var2, boolean z) {
        this.a = str;
        this.b = b7Var;
        this.c = k6Var;
        this.d = l6Var;
        this.e = n6Var;
        this.f = n6Var2;
        this.g = j6Var;
        this.h = bVar;
        this.i = cVar;
        this.j = f;
        this.k = list;
        this.l = j6Var2;
        this.m = z;
    }

    public l7.b a() {
        return this.h;
    }

    @Override // defpackage.x6
    public q4 a(f fVar, n7 n7Var) {
        return new w4(fVar, n7Var, this);
    }

    public j6 b() {
        return this.l;
    }

    public n6 c() {
        return this.f;
    }

    public k6 d() {
        return this.c;
    }

    public b7 e() {
        return this.b;
    }

    public l7.c f() {
        return this.i;
    }

    public List<j6> g() {
        return this.k;
    }

    public float h() {
        return this.j;
    }

    public String i() {
        return this.a;
    }

    public l6 j() {
        return this.d;
    }

    public n6 k() {
        return this.e;
    }

    public j6 l() {
        return this.g;
    }

    public boolean m() {
        return this.m;
    }
}
