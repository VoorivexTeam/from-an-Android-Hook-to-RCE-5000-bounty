package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.f;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class s7 extends n7 {
    private final r4 w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s7(f fVar, q7 q7Var) {
        super(fVar, q7Var);
        r4 r4Var = new r4(fVar, this, new j7("__container", q7Var.l(), false));
        this.w = r4Var;
        r4Var.a(Collections.emptyList(), Collections.emptyList());
    }

    @Override // defpackage.n7, defpackage.s4
    public void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        this.w.a(rectF, this.m, z);
    }

    @Override // defpackage.n7
    void b(Canvas canvas, Matrix matrix, int i) {
        this.w.a(canvas, matrix, i);
    }

    @Override // defpackage.n7
    protected void b(d6 d6Var, int i, List<d6> list, d6 d6Var2) {
        this.w.a(d6Var, i, list, d6Var2);
    }
}
