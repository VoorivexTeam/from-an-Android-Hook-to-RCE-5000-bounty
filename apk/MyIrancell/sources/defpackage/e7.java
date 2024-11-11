package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.f;

/* loaded from: classes.dex */
public class e7 implements x6 {
    private final String a;
    private final a b;
    private final j6 c;
    private final u6<PointF, PointF> d;
    private final j6 e;
    private final j6 f;
    private final j6 g;
    private final j6 h;
    private final j6 i;
    private final boolean j;

    /* loaded from: classes.dex */
    public enum a {
        STAR(1),
        POLYGON(2);

        private final int value;

        a(int i) {
            this.value = i;
        }

        public static a forValue(int i) {
            for (a aVar : values()) {
                if (aVar.value == i) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public e7(String str, a aVar, j6 j6Var, u6<PointF, PointF> u6Var, j6 j6Var2, j6 j6Var3, j6 j6Var4, j6 j6Var5, j6 j6Var6, boolean z) {
        this.a = str;
        this.b = aVar;
        this.c = j6Var;
        this.d = u6Var;
        this.e = j6Var2;
        this.f = j6Var3;
        this.g = j6Var4;
        this.h = j6Var5;
        this.i = j6Var6;
        this.j = z;
    }

    public j6 a() {
        return this.f;
    }

    @Override // defpackage.x6
    public q4 a(f fVar, n7 n7Var) {
        return new b5(fVar, n7Var, this);
    }

    public j6 b() {
        return this.h;
    }

    public String c() {
        return this.a;
    }

    public j6 d() {
        return this.g;
    }

    public j6 e() {
        return this.i;
    }

    public j6 f() {
        return this.c;
    }

    public u6<PointF, PointF> g() {
        return this.d;
    }

    public j6 h() {
        return this.e;
    }

    public a i() {
        return this.b;
    }

    public boolean j() {
        return this.j;
    }
}
