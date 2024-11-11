package defpackage;

/* loaded from: classes.dex */
public class nz extends tv {
    private static final byte[] d = new byte[0];
    private byte[] b;
    private final int[] c;

    public nz(yv yvVar) {
        super(yvVar);
        this.b = d;
        this.c = new int[32];
    }

    private static int a(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (iArr[i4] > i) {
                i = iArr[i4];
                i3 = i4;
            }
            if (iArr[i4] > i2) {
                i2 = iArr[i4];
            }
        }
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 - i3;
            int i9 = iArr[i7] * i8 * i8;
            if (i9 > i6) {
                i5 = i7;
                i6 = i9;
            }
        }
        if (i3 <= i5) {
            int i10 = i3;
            i3 = i5;
            i5 = i10;
        }
        if (i3 - i5 <= length / 16) {
            throw aw.a();
        }
        int i11 = i3 - 1;
        int i12 = i11;
        int i13 = -1;
        while (i11 > i5) {
            int i14 = i11 - i5;
            int i15 = i14 * i14 * (i3 - i11) * (i2 - iArr[i11]);
            if (i15 > i13) {
                i12 = i11;
                i13 = i15;
            }
            i11--;
        }
        return i12 << 3;
    }

    private void a(int i) {
        if (this.b.length < i) {
            this.b = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.c[i2] = 0;
        }
    }

    @Override // defpackage.tv
    public gz a(int i, gz gzVar) {
        yv c = c();
        int c2 = c.c();
        if (gzVar == null || gzVar.c() < c2) {
            gzVar = new gz(c2);
        } else {
            gzVar.a();
        }
        a(c2);
        byte[] a = c.a(i, this.b);
        int[] iArr = this.c;
        for (int i2 = 0; i2 < c2; i2++) {
            int i3 = (a[i2] & 255) >> 3;
            iArr[i3] = iArr[i3] + 1;
        }
        int a2 = a(iArr);
        int i4 = 1;
        int i5 = a[0] & 255;
        int i6 = a[1] & 255;
        while (i4 < c2 - 1) {
            int i7 = i4 + 1;
            int i8 = a[i7] & 255;
            if ((((i6 * 4) - i5) - i8) / 2 < a2) {
                gzVar.d(i4);
            }
            i5 = i6;
            i4 = i7;
            i6 = i8;
        }
        return gzVar;
    }

    @Override // defpackage.tv
    public hz a() {
        yv c = c();
        int c2 = c.c();
        int a = c.a();
        hz hzVar = new hz(c2, a);
        a(c2);
        int[] iArr = this.c;
        for (int i = 1; i < 5; i++) {
            byte[] a2 = c.a((a * i) / 5, this.b);
            int i2 = (c2 * 4) / 5;
            for (int i3 = c2 / 5; i3 < i2; i3++) {
                int i4 = (a2[i3] & 255) >> 3;
                iArr[i4] = iArr[i4] + 1;
            }
        }
        int a3 = a(iArr);
        byte[] b = c.b();
        for (int i5 = 0; i5 < a; i5++) {
            int i6 = i5 * c2;
            for (int i7 = 0; i7 < c2; i7++) {
                if ((b[i6 + i7] & 255) < a3) {
                    hzVar.c(i7, i5);
                }
            }
        }
        return hzVar;
    }
}
