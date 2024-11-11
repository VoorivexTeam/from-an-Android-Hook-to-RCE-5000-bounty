package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.f;

/* loaded from: classes.dex */
public class z6 implements x6 {
    private final b7 a;
    private final Path.FillType b;
    private final k6 c;
    private final l6 d;
    private final n6 e;
    private final n6 f;
    private final String g;
    private final boolean h;

    public z6(String str, b7 b7Var, Path.FillType fillType, k6 k6Var, l6 l6Var, n6 n6Var, n6 n6Var2, j6 j6Var, j6 j6Var2, boolean z) {
        this.a = b7Var;
        this.b = fillType;
        this.c = k6Var;
        this.d = l6Var;
        this.e = n6Var;
        this.f = n6Var2;
        this.g = str;
        this.h = z;
    }

    public n6 a() {
        return this.f;
    }

    @Override // defpackage.x6
    public q4 a(f fVar, n7 n7Var) {
        return new v4(fVar, n7Var, this);
    }

    public Path.FillType b() {
        return this.b;
    }

    public k6 c() {
        return this.c;
    }

    public b7 d() {
        return this.a;
    }

    public String e() {
        return this.g;
    }

    public l6 f() {
        return this.d;
    }

    public n6 g() {
        return this.e;
    }

    public boolean h() {
        return this.h;
    }
}
