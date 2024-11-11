package defpackage;

import com.airbnb.lottie.f;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class j7 implements x6 {
    private final String a;
    private final List<x6> b;
    private final boolean c;

    public j7(String str, List<x6> list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    public List<x6> a() {
        return this.b;
    }

    @Override // defpackage.x6
    public q4 a(f fVar, n7 n7Var) {
        return new r4(fVar, n7Var, this);
    }

    public String b() {
        return this.a;
    }

    public boolean c() {
        return this.c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.a + "' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}
