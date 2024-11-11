package defpackage;

/* loaded from: classes.dex */
public final class lz extends oz {
    @Override // defpackage.oz
    public hz a(hz hzVar, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return a(hzVar, i, i2, qz.a(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16));
    }

    @Override // defpackage.oz
    public hz a(hz hzVar, int i, int i2, qz qzVar) {
        if (i <= 0 || i2 <= 0) {
            throw aw.a();
        }
        hz hzVar2 = new hz(i, i2);
        int i3 = i * 2;
        float[] fArr = new float[i3];
        for (int i4 = 0; i4 < i2; i4++) {
            float f = i4 + 0.5f;
            for (int i5 = 0; i5 < i3; i5 += 2) {
                fArr[i5] = (i5 / 2) + 0.5f;
                fArr[i5 + 1] = f;
            }
            qzVar.a(fArr);
            oz.a(hzVar, fArr);
            for (int i6 = 0; i6 < i3; i6 += 2) {
                try {
                    if (hzVar.b((int) fArr[i6], (int) fArr[i6 + 1])) {
                        hzVar2.c(i6 / 2, i4);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw aw.a();
                }
            }
        }
        return hzVar2;
    }
}
