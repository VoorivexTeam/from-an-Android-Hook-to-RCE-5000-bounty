package defpackage;

import android.graphics.PointF;
import defpackage.k9;

/* loaded from: classes.dex */
public class w8 implements h9<PointF> {
    public static final w8 a = new w8();

    private w8() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.h9
    public PointF a(k9 k9Var, float f) {
        k9.b peek = k9Var.peek();
        if (peek != k9.b.BEGIN_ARRAY && peek != k9.b.BEGIN_OBJECT) {
            if (peek == k9.b.NUMBER) {
                PointF pointF = new PointF(((float) k9Var.j()) * f, ((float) k9Var.j()) * f);
                while (k9Var.h()) {
                    k9Var.o();
                }
                return pointF;
            }
            throw new IllegalArgumentException("Cannot convert json to point. Next token is " + peek);
        }
        return n8.d(k9Var, f);
    }
}
