package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.f;

/* loaded from: classes.dex */
public class i7 implements x6 {
    private final boolean a;
    private final Path.FillType b;
    private final String c;
    private final i6 d;
    private final l6 e;
    private final boolean f;

    public i7(String str, boolean z, Path.FillType fillType, i6 i6Var, l6 l6Var, boolean z2) {
        this.c = str;
        this.a = z;
        this.b = fillType;
        this.d = i6Var;
        this.e = l6Var;
        this.f = z2;
    }

    public i6 a() {
        return this.d;
    }

    @Override // defpackage.x6
    public q4 a(f fVar, n7 n7Var) {
        return new u4(fVar, n7Var, this);
    }

    public Path.FillType b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public l6 d() {
        return this.e;
    }

    public boolean e() {
        return this.f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.a + '}';
    }
}
