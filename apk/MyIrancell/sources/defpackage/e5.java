package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.f;
import defpackage.h5;
import defpackage.m7;
import java.util.List;

/* loaded from: classes.dex */
public class e5 implements a5, h5.b {
    private final String b;
    private final boolean c;
    private final f d;
    private final h5<?, Path> e;
    private boolean f;
    private final Path a = new Path();
    private p4 g = new p4();

    public e5(f fVar, n7 n7Var, k7 k7Var) {
        this.b = k7Var.a();
        this.c = k7Var.c();
        this.d = fVar;
        h5<h7, Path> a = k7Var.b().a();
        this.e = a;
        n7Var.a(a);
        this.e.a(this);
    }

    private void d() {
        this.f = false;
        this.d.invalidateSelf();
    }

    @Override // defpackage.q4
    public String a() {
        return this.b;
    }

    @Override // defpackage.q4
    public void a(List<q4> list, List<q4> list2) {
        for (int i = 0; i < list.size(); i++) {
            q4 q4Var = list.get(i);
            if (q4Var instanceof g5) {
                g5 g5Var = (g5) q4Var;
                if (g5Var.g() == m7.a.SIMULTANEOUSLY) {
                    this.g.a(g5Var);
                    g5Var.a(this);
                }
            }
        }
    }

    @Override // h5.b
    public void b() {
        d();
    }

    @Override // defpackage.a5
    public Path c() {
        if (this.f) {
            return this.a;
        }
        this.a.reset();
        if (!this.c) {
            this.a.set(this.e.f());
            this.a.setFillType(Path.FillType.EVEN_ODD);
            this.g.a(this.a);
        }
        this.f = true;
        return this.a;
    }
}
