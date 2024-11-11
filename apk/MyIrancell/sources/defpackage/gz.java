package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class gz implements Cloneable {
    private int[] b;
    private int c;

    public gz() {
        this.c = 0;
        this.b = new int[1];
    }

    public gz(int i) {
        this.c = i;
        this.b = e(i);
    }

    gz(int[] iArr, int i) {
        this.b = iArr;
        this.c = i;
    }

    private static int[] e(int i) {
        return new int[(i + 31) / 32];
    }

    public void a() {
        int length = this.b.length;
        for (int i = 0; i < length; i++) {
            this.b[i] = 0;
        }
    }

    public void a(int i, int i2) {
        this.b[i / 32] = i2;
    }

    public boolean a(int i) {
        return ((1 << (i & 31)) & this.b[i / 32]) != 0;
    }

    public boolean a(int i, int i2, boolean z) {
        int i3;
        if (i2 < i) {
            throw new IllegalArgumentException();
        }
        if (i2 == i) {
            return true;
        }
        int i4 = i2 - 1;
        int i5 = i / 32;
        int i6 = i4 / 32;
        int i7 = i5;
        while (i7 <= i6) {
            int i8 = i7 > i5 ? 0 : i & 31;
            int i9 = i7 < i6 ? 31 : i4 & 31;
            if (i8 == 0 && i9 == 31) {
                i3 = -1;
            } else {
                i3 = 0;
                while (i8 <= i9) {
                    i3 |= 1 << i8;
                    i8++;
                }
            }
            int i10 = this.b[i7] & i3;
            if (!z) {
                i3 = 0;
            }
            if (i10 != i3) {
                return false;
            }
            i7++;
        }
        return true;
    }

    public int b(int i) {
        int i2 = this.c;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (((1 << (i & 31)) - 1) ^ (-1)) & this.b[i3];
        while (i4 == 0) {
            i3++;
            int[] iArr = this.b;
            if (i3 == iArr.length) {
                return this.c;
            }
            i4 = iArr[i3];
        }
        int numberOfTrailingZeros = (i3 * 32) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.c;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    public int[] b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int c(int i) {
        int i2 = this.c;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (((1 << (i & 31)) - 1) ^ (-1)) & (this.b[i3] ^ (-1));
        while (i4 == 0) {
            i3++;
            int[] iArr = this.b;
            if (i3 == iArr.length) {
                return this.c;
            }
            i4 = iArr[i3] ^ (-1);
        }
        int numberOfTrailingZeros = (i3 * 32) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.c;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public gz m6clone() {
        return new gz((int[]) this.b.clone(), this.c);
    }

    public void d(int i) {
        int[] iArr = this.b;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof gz)) {
            return false;
        }
        gz gzVar = (gz) obj;
        return this.c == gzVar.c && Arrays.equals(this.b, gzVar.b);
    }

    public void g() {
        int[] iArr = new int[this.b.length];
        int i = (this.c - 1) / 32;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = this.b[i3];
            long j2 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j3 = ((j2 & 858993459) << 2) | ((j2 >> 2) & 858993459);
            long j4 = ((j3 & 252645135) << 4) | ((j3 >> 4) & 252645135);
            long j5 = ((j4 & 16711935) << 8) | ((j4 >> 8) & 16711935);
            iArr[i - i3] = (int) (((j5 & 65535) << 16) | ((j5 >> 16) & 65535));
        }
        int i4 = this.c;
        int i5 = i2 * 32;
        if (i4 != i5) {
            int i6 = i5 - i4;
            int i7 = 1;
            for (int i8 = 0; i8 < 31 - i6; i8++) {
                i7 = (i7 << 1) | 1;
            }
            int i9 = (iArr[0] >> i6) & i7;
            for (int i10 = 1; i10 < i2; i10++) {
                int i11 = iArr[i10];
                iArr[i10 - 1] = i9 | (i11 << (32 - i6));
                i9 = (i11 >> i6) & i7;
            }
            iArr[i2 - 1] = i9;
        }
        this.b = iArr;
    }

    public int hashCode() {
        return (this.c * 31) + Arrays.hashCode(this.b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.c);
        for (int i = 0; i < this.c; i++) {
            if ((i & 7) == 0) {
                sb.append(' ');
            }
            sb.append(a(i) ? 'X' : '.');
        }
        return sb.toString();
    }
}
