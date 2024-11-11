package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.f;

/* loaded from: classes.dex */
public class f7 implements x6 {
    private final String a;
    private final u6<PointF, PointF> b;
    private final n6 c;
    private final j6 d;
    private final boolean e;

    public f7(String str, u6<PointF, PointF> u6Var, n6 n6Var, j6 j6Var, boolean z) {
        this.a = str;
        this.b = u6Var;
        this.c = n6Var;
        this.d = j6Var;
        this.e = z;
    }

    public j6 a() {
        return this.d;
    }

    @Override // defpackage.x6
    public q4 a(f fVar, n7 n7Var) {
        return new c5(fVar, n7Var, this);
    }

    public String b() {
        return this.a;
    }

    public u6<PointF, PointF> c() {
        return this.b;
    }

    public n6 d() {
        return this.c;
    }

    public boolean e() {
        return this.e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.b + ", size=" + this.c + '}';
    }
}
