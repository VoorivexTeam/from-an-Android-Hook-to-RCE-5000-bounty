package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.f;
import com.airbnb.lottie.k;

/* loaded from: classes.dex */
public class p7 extends n7 {
    private final Paint w;
    private final Rect x;
    private final Rect y;
    private h5<ColorFilter, ColorFilter> z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p7(f fVar, q7 q7Var) {
        super(fVar, q7Var);
        this.w = new n4(3);
        this.x = new Rect();
        this.y = new Rect();
    }

    private Bitmap g() {
        return this.n.a(this.o.k());
    }

    @Override // defpackage.n7, defpackage.s4
    public void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        if (g() != null) {
            rectF.set(0.0f, 0.0f, r3.getWidth() * u9.a(), r3.getHeight() * u9.a());
            this.m.mapRect(rectF);
        }
    }

    @Override // defpackage.n7, defpackage.e6
    public <T> void a(T t, x9<T> x9Var) {
        super.a((p7) t, (x9<p7>) x9Var);
        if (t == k.C) {
            this.z = x9Var == null ? null : new w5(x9Var);
        }
    }

    @Override // defpackage.n7
    public void b(Canvas canvas, Matrix matrix, int i) {
        Bitmap g = g();
        if (g == null || g.isRecycled()) {
            return;
        }
        float a = u9.a();
        this.w.setAlpha(i);
        h5<ColorFilter, ColorFilter> h5Var = this.z;
        if (h5Var != null) {
            this.w.setColorFilter(h5Var.f());
        }
        canvas.save();
        canvas.concat(matrix);
        this.x.set(0, 0, g.getWidth(), g.getHeight());
        this.y.set(0, 0, (int) (g.getWidth() * a), (int) (g.getHeight() * a));
        canvas.drawBitmap(g, this.x, this.y, this.w);
        canvas.restore();
    }
}
