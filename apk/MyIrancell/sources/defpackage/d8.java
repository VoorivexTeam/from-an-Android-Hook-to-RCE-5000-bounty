package defpackage;

import android.graphics.Color;
import defpackage.k9;

/* loaded from: classes.dex */
public class d8 implements h9<Integer> {
    public static final d8 a = new d8();

    private d8() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.h9
    public Integer a(k9 k9Var, float f) {
        boolean z = k9Var.peek() == k9.b.BEGIN_ARRAY;
        if (z) {
            k9Var.a();
        }
        double j = k9Var.j();
        double j2 = k9Var.j();
        double j3 = k9Var.j();
        double j4 = k9Var.j();
        if (z) {
            k9Var.d();
        }
        if (j <= 1.0d && j2 <= 1.0d && j3 <= 1.0d && j4 <= 1.0d) {
            j *= 255.0d;
            j2 *= 255.0d;
            j3 *= 255.0d;
            j4 *= 255.0d;
        }
        return Integer.valueOf(Color.argb((int) j4, (int) j, (int) j2, (int) j3));
    }
}
