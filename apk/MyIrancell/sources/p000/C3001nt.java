package p000;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: nt */
/* loaded from: classes.dex */
public class C3001nt implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f12353a = new float[9];

    /* renamed from: b */
    private final float[] f12354b = new float[9];

    /* renamed from: c */
    private final Matrix f12355c = new Matrix();

    @Override // android.animation.TypeEvaluator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f12353a);
        matrix2.getValues(this.f12354b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f12354b;
            float f2 = fArr[i];
            float[] fArr2 = this.f12353a;
            fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
        }
        this.f12355c.setValues(this.f12354b);
        return this.f12355c;
    }
}
