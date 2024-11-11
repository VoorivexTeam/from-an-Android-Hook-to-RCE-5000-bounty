package p000;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C0540f;
import com.airbnb.lottie.InterfaceC0545k;

/* renamed from: t7 */
/* loaded from: classes.dex */
public class C3241t7 extends AbstractC2976n7 {

    /* renamed from: A */
    private final C3112q7 f13220A;

    /* renamed from: B */
    private AbstractC2538h5<ColorFilter, ColorFilter> f13221B;

    /* renamed from: w */
    private final RectF f13222w;

    /* renamed from: x */
    private final Paint f13223x;

    /* renamed from: y */
    private final float[] f13224y;

    /* renamed from: z */
    private final Path f13225z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3241t7(C0540f c0540f, C3112q7 c3112q7) {
        super(c0540f, c3112q7);
        this.f13222w = new RectF();
        this.f13223x = new C2967n4();
        this.f13224y = new float[8];
        this.f13225z = new Path();
        this.f13220A = c3112q7;
        this.f13223x.setAlpha(0);
        this.f13223x.setStyle(Paint.Style.FILL);
        this.f13223x.setColor(c3112q7.m14970m());
    }

    @Override // p000.AbstractC2976n7, p000.InterfaceC3190s4
    /* renamed from: a */
    public void mo11276a(RectF rectF, Matrix matrix, boolean z) {
        super.mo11276a(rectF, matrix, z);
        this.f13222w.set(0.0f, 0.0f, this.f13220A.m14972o(), this.f13220A.m14971n());
        this.f12251m.mapRect(this.f13222w);
        rectF.set(this.f13222w);
    }

    @Override // p000.AbstractC2976n7, p000.InterfaceC2418e6
    /* renamed from: a */
    public <T> void mo3320a(T t, C3429x9<T> c3429x9) {
        super.mo3320a((C3241t7) t, (C3429x9<C3241t7>) c3429x9);
        if (t == InterfaceC0545k.f3153C) {
            this.f13221B = c3429x9 == null ? null : new C3385w5(c3429x9);
        }
    }

    @Override // p000.AbstractC2976n7
    /* renamed from: b */
    public void mo14281b(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.f13220A.m14970m());
        if (alpha == 0) {
            return;
        }
        int intValue = (int) ((i / 255.0f) * (((alpha / 255.0f) * (this.f12259u.m15945c() == null ? 100 : this.f12259u.m15945c().mo12108f().intValue())) / 100.0f) * 255.0f);
        this.f13223x.setAlpha(intValue);
        AbstractC2538h5<ColorFilter, ColorFilter> abstractC2538h5 = this.f13221B;
        if (abstractC2538h5 != null) {
            this.f13223x.setColorFilter(abstractC2538h5.mo12108f());
        }
        if (intValue > 0) {
            float[] fArr = this.f13224y;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.f13220A.m14972o();
            float[] fArr2 = this.f13224y;
            fArr2[3] = 0.0f;
            fArr2[4] = this.f13220A.m14972o();
            this.f13224y[5] = this.f13220A.m14971n();
            float[] fArr3 = this.f13224y;
            fArr3[6] = 0.0f;
            fArr3[7] = this.f13220A.m14971n();
            matrix.mapPoints(this.f13224y);
            this.f13225z.reset();
            Path path = this.f13225z;
            float[] fArr4 = this.f13224y;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.f13225z;
            float[] fArr5 = this.f13224y;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.f13225z;
            float[] fArr6 = this.f13224y;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.f13225z;
            float[] fArr7 = this.f13224y;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.f13225z;
            float[] fArr8 = this.f13224y;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.f13225z.close();
            canvas.drawPath(this.f13225z, this.f13223x);
        }
    }
}
