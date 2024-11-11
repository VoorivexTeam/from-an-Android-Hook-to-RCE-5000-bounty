package p000;

import android.view.animation.Interpolator;

/* renamed from: o3 */
/* loaded from: classes.dex */
abstract class AbstractInterpolatorC3012o3 implements Interpolator {

    /* renamed from: a */
    private final float[] f12388a;

    /* renamed from: b */
    private final float f12389b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractInterpolatorC3012o3(float[] fArr) {
        this.f12388a = fArr;
        this.f12389b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f12388a;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f12389b;
        float f3 = (f - (min * f2)) / f2;
        float[] fArr2 = this.f12388a;
        return fArr2[min] + (f3 * (fArr2[min + 1] - fArr2[min]));
    }
}
