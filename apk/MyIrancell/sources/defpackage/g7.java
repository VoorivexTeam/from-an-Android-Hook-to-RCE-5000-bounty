package defpackage;

import com.airbnb.lottie.f;

/* loaded from: classes.dex */
public class g7 implements x6 {
    private final String a;
    private final j6 b;
    private final j6 c;
    private final t6 d;
    private final boolean e;

    public g7(String str, j6 j6Var, j6 j6Var2, t6 t6Var, boolean z) {
        this.a = str;
        this.b = j6Var;
        this.c = j6Var2;
        this.d = t6Var;
        this.e = z;
    }

    public j6 a() {
        return this.b;
    }

    @Override // defpackage.x6
    public q4 a(f fVar, n7 n7Var) {
        return new d5(fVar, n7Var, this);
    }

    public String b() {
        return this.a;
    }

    public j6 c() {
        return this.c;
    }

    public t6 d() {
        return this.d;
    }

    public boolean e() {
        return this.e;
    }
}
