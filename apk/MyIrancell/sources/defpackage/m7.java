package defpackage;

import com.airbnb.lottie.f;

/* loaded from: classes.dex */
public class m7 implements x6 {
    private final String a;
    private final a b;
    private final j6 c;
    private final j6 d;
    private final j6 e;
    private final boolean f;

    /* loaded from: classes.dex */
    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a forId(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i);
        }
    }

    public m7(String str, a aVar, j6 j6Var, j6 j6Var2, j6 j6Var3, boolean z) {
        this.a = str;
        this.b = aVar;
        this.c = j6Var;
        this.d = j6Var2;
        this.e = j6Var3;
        this.f = z;
    }

    public j6 a() {
        return this.d;
    }

    @Override // defpackage.x6
    public q4 a(f fVar, n7 n7Var) {
        return new g5(n7Var, this);
    }

    public String b() {
        return this.a;
    }

    public j6 c() {
        return this.e;
    }

    public j6 d() {
        return this.c;
    }

    public a e() {
        return this.b;
    }

    public boolean f() {
        return this.f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.c + ", end: " + this.d + ", offset: " + this.e + "}";
    }
}
