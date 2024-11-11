package defpackage;

import android.graphics.Color;
import defpackage.k9;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class j8 implements h9<y6> {
    private int a;

    public j8(int i) {
        this.a = i;
    }

    private int a(double d, double[] dArr, double[] dArr2) {
        double d2;
        int i = 1;
        while (true) {
            if (i >= dArr.length) {
                d2 = dArr2[dArr2.length - 1];
                break;
            }
            int i2 = i - 1;
            double d3 = dArr[i2];
            double d4 = dArr[i];
            if (dArr[i] >= d) {
                d2 = t9.a(dArr2[i2], dArr2[i], (d - d3) / (d4 - d3));
                break;
            }
            i++;
        }
        return (int) (d2 * 255.0d);
    }

    private void a(y6 y6Var, List<Float> list) {
        int i = this.a * 4;
        if (list.size() <= i) {
            return;
        }
        int size = (list.size() - i) / 2;
        double[] dArr = new double[size];
        double[] dArr2 = new double[size];
        int i2 = 0;
        while (i < list.size()) {
            if (i % 2 == 0) {
                dArr[i2] = list.get(i).floatValue();
            } else {
                dArr2[i2] = list.get(i).floatValue();
                i2++;
            }
            i++;
        }
        for (int i3 = 0; i3 < y6Var.c(); i3++) {
            int i4 = y6Var.a()[i3];
            y6Var.a()[i3] = Color.argb(a(y6Var.b()[i3], dArr, dArr2), Color.red(i4), Color.green(i4), Color.blue(i4));
        }
    }

    @Override // defpackage.h9
    public y6 a(k9 k9Var, float f) {
        ArrayList arrayList = new ArrayList();
        boolean z = k9Var.peek() == k9.b.BEGIN_ARRAY;
        if (z) {
            k9Var.a();
        }
        while (k9Var.h()) {
            arrayList.add(Float.valueOf((float) k9Var.j()));
        }
        if (z) {
            k9Var.d();
        }
        if (this.a == -1) {
            this.a = arrayList.size() / 4;
        }
        int i = this.a;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.a * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = arrayList.get(i4).floatValue();
            int i6 = i4 % 4;
            if (i6 == 0) {
                fArr[i5] = (float) floatValue;
            } else if (i6 == 1) {
                Double.isNaN(floatValue);
                i2 = (int) (floatValue * 255.0d);
            } else if (i6 == 2) {
                Double.isNaN(floatValue);
                i3 = (int) (floatValue * 255.0d);
            } else if (i6 == 3) {
                Double.isNaN(floatValue);
                iArr[i5] = Color.argb(255, i2, i3, (int) (floatValue * 255.0d));
            }
        }
        y6 y6Var = new y6(fArr, iArr);
        a(y6Var, arrayList);
        return y6Var;
    }
}
