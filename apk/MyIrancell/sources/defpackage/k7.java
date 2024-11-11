package defpackage;

import com.airbnb.lottie.f;

/* loaded from: classes.dex */
public class k7 implements x6 {
    private final String a;
    private final int b;
    private final p6 c;
    private final boolean d;

    public k7(String str, int i, p6 p6Var, boolean z) {
        this.a = str;
        this.b = i;
        this.c = p6Var;
        this.d = z;
    }

    public String a() {
        return this.a;
    }

    @Override // defpackage.x6
    public q4 a(f fVar, n7 n7Var) {
        return new e5(fVar, n7Var, this);
    }

    public p6 b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public String toString() {
        return "ShapePath{name=" + this.a + ", index=" + this.b + '}';
    }
}
