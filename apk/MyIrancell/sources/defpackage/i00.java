package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class i00 {
    private final wz a = new wz(uz.o);

    private void a(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = i2 + i3;
        int i6 = i4 == 0 ? 1 : 2;
        int[] iArr = new int[i5 / i6];
        for (int i7 = 0; i7 < i5; i7++) {
            if (i4 == 0 || i7 % 2 == i4 - 1) {
                iArr[i7 / i6] = bArr[i7 + i] & 255;
            }
        }
        try {
            this.a.a(iArr, i3 / i6);
            for (int i8 = 0; i8 < i2; i8++) {
                if (i4 == 0 || i8 % 2 == i4 - 1) {
                    bArr[i8 + i] = (byte) iArr[i8 / i6];
                }
            }
        } catch (xz unused) {
            throw vv.a();
        }
    }

    public kz a(hz hzVar, Map<wv, ?> map) {
        int i;
        byte[] a = new g00(hzVar).a();
        a(a, 0, 10, 10, 0);
        int i2 = a[0] & 15;
        if (i2 == 2 || i2 == 3 || i2 == 4) {
            a(a, 20, 84, 40, 1);
            a(a, 20, 84, 40, 2);
            i = 94;
        } else {
            if (i2 != 5) {
                throw xv.a();
            }
            a(a, 20, 68, 56, 1);
            a(a, 20, 68, 56, 2);
            i = 78;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(a, 0, bArr, 0, 10);
        System.arraycopy(a, 20, bArr, 10, bArr.length - 10);
        return h00.a(bArr, i2);
    }
}
