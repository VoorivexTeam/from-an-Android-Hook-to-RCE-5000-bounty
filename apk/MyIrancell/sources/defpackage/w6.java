package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.f;

/* loaded from: classes.dex */
public class w6 implements x6 {
    private final String a;
    private final u6<PointF, PointF> b;
    private final n6 c;
    private final boolean d;
    private final boolean e;

    public w6(String str, u6<PointF, PointF> u6Var, n6 n6Var, boolean z, boolean z2) {
        this.a = str;
        this.b = u6Var;
        this.c = n6Var;
        this.d = z;
        this.e = z2;
    }

    public String a() {
        return this.a;
    }

    @Override // defpackage.x6
    public q4 a(f fVar, n7 n7Var) {
        return new t4(fVar, n7Var, this);
    }

    public u6<PointF, PointF> b() {
        return this.b;
    }

    public n6 c() {
        return this.c;
    }

    public boolean d() {
        return this.e;
    }

    public boolean e() {
        return this.d;
    }
}
