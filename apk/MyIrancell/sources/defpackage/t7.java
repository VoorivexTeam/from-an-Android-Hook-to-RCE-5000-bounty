package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.f;
import com.airbnb.lottie.k;

/* loaded from: classes.dex */
public class t7 extends n7 {
    private final q7 A;
    private h5<ColorFilter, ColorFilter> B;
    private final RectF w;
    private final Paint x;
    private final float[] y;
    private final Path z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t7(f fVar, q7 q7Var) {
        super(fVar, q7Var);
        this.w = new RectF();
        this.x = new n4();
        this.y = new float[8];
        this.z = new Path();
        this.A = q7Var;
        this.x.setAlpha(0);
        this.x.setStyle(Paint.Style.FILL);
        this.x.setColor(q7Var.m());
    }

    @Override // defpackage.n7, defpackage.s4
    public void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        this.w.set(0.0f, 0.0f, this.A.o(), this.A.n());
        this.m.mapRect(this.w);
        rectF.set(this.w);
    }

    @Override // defpackage.n7, defpackage.e6
    public <T> void a(T t, x9<T> x9Var) {
        super.a((t7) t, (x9<t7>) x9Var);
        if (t == k.C) {
            this.B = x9Var == null ? null : new w5(x9Var);
        }
    }

    @Override // defpackage.n7
    public void b(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.A.m());
        if (alpha == 0) {
            return;
        }
        int intValue = (int) ((i / 255.0f) * (((alpha / 255.0f) * (this.u.c() == null ? 100 : this.u.c().f().intValue())) / 100.0f) * 255.0f);
        this.x.setAlpha(intValue);
        h5<ColorFilter, ColorFilter> h5Var = this.B;
        if (h5Var != null) {
            this.x.setColorFilter(h5Var.f());
        }
        if (intValue > 0) {
            float[] fArr = this.y;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.A.o();
            float[] fArr2 = this.y;
            fArr2[3] = 0.0f;
            fArr2[4] = this.A.o();
            this.y[5] = this.A.n();
            float[] fArr3 = this.y;
            fArr3[6] = 0.0f;
            fArr3[7] = this.A.n();
            matrix.mapPoints(this.y);
            this.z.reset();
            Path path = this.z;
            float[] fArr4 = this.y;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.z;
            float[] fArr5 = this.y;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.z;
            float[] fArr6 = this.y;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.z;
            float[] fArr7 = this.y;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.z;
            float[] fArr8 = this.y;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.z.close();
            canvas.drawPath(this.z, this.x);
        }
    }
}
