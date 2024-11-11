package p000;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC2852k9;

/* renamed from: j8 */
/* loaded from: classes.dex */
public class C2804j8 implements InterfaceC2545h9<C3474y6> {

    /* renamed from: a */
    private int f11485a;

    public C2804j8(int i) {
        this.f11485a = i;
    }

    /* renamed from: a */
    private int m13422a(double d, double[] dArr, double[] dArr2) {
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
                d2 = C3243t9.m15570a(dArr2[i2], dArr2[i], (d - d3) / (d4 - d3));
                break;
            }
            i++;
        }
        return (int) (d2 * 255.0d);
    }

    /* renamed from: a */
    private void m13423a(C3474y6 c3474y6, List<Float> list) {
        int i = this.f11485a * 4;
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
        for (int i3 = 0; i3 < c3474y6.m16585c(); i3++) {
            int i4 = c3474y6.m16583a()[i3];
            c3474y6.m16583a()[i3] = Color.argb(m13422a(c3474y6.m16584b()[i3], dArr, dArr2), Color.red(i4), Color.green(i4), Color.blue(i4));
        }
    }

    @Override // p000.InterfaceC2545h9
    /* renamed from: a, reason: avoid collision after fix types in other method */
    public C3474y6 mo101a(AbstractC2852k9 abstractC2852k9, float f) {
        ArrayList arrayList = new ArrayList();
        boolean z = abstractC2852k9.peek() == AbstractC2852k9.b.BEGIN_ARRAY;
        if (z) {
            abstractC2852k9.mo13636a();
        }
        while (abstractC2852k9.mo13642h()) {
            arrayList.add(Float.valueOf((float) abstractC2852k9.mo13644j()));
        }
        if (z) {
            abstractC2852k9.mo13639d();
        }
        if (this.f11485a == -1) {
            this.f11485a = arrayList.size() / 4;
        }
        int i = this.f11485a;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f11485a * 4; i4++) {
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
        C3474y6 c3474y6 = new C3474y6(fArr, iArr);
        m13423a(c3474y6, arrayList);
        return c3474y6;
    }
}
