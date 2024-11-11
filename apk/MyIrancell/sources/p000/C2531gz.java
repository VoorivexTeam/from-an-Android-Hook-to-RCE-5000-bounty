package p000;

import java.util.Arrays;

/* renamed from: gz */
/* loaded from: classes.dex */
public final class C2531gz implements Cloneable {

    /* renamed from: b */
    private int[] f10345b;

    /* renamed from: c */
    private int f10346c;

    public C2531gz() {
        this.f10346c = 0;
        this.f10345b = new int[1];
    }

    public C2531gz(int i) {
        this.f10346c = i;
        this.f10345b = m12045e(i);
    }

    C2531gz(int[] iArr, int i) {
        this.f10345b = iArr;
        this.f10346c = i;
    }

    /* renamed from: e */
    private static int[] m12045e(int i) {
        return new int[(i + 31) / 32];
    }

    /* renamed from: a */
    public void m12046a() {
        int length = this.f10345b.length;
        for (int i = 0; i < length; i++) {
            this.f10345b[i] = 0;
        }
    }

    /* renamed from: a */
    public void m12047a(int i, int i2) {
        this.f10345b[i / 32] = i2;
    }

    /* renamed from: a */
    public boolean m12048a(int i) {
        return ((1 << (i & 31)) & this.f10345b[i / 32]) != 0;
    }

    /* renamed from: a */
    public boolean m12049a(int i, int i2, boolean z) {
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
            int i10 = this.f10345b[i7] & i3;
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

    /* renamed from: b */
    public int m12050b(int i) {
        int i2 = this.f10346c;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (((1 << (i & 31)) - 1) ^ (-1)) & this.f10345b[i3];
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f10345b;
            if (i3 == iArr.length) {
                return this.f10346c;
            }
            i4 = iArr[i3];
        }
        int numberOfTrailingZeros = (i3 * 32) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f10346c;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    /* renamed from: b */
    public int[] m12051b() {
        return this.f10345b;
    }

    /* renamed from: c */
    public int m12052c() {
        return this.f10346c;
    }

    /* renamed from: c */
    public int m12053c(int i) {
        int i2 = this.f10346c;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (((1 << (i & 31)) - 1) ^ (-1)) & (this.f10345b[i3] ^ (-1));
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f10345b;
            if (i3 == iArr.length) {
                return this.f10346c;
            }
            i4 = iArr[i3] ^ (-1);
        }
        int numberOfTrailingZeros = (i3 * 32) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f10346c;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public C2531gz m16984clone() {
        return new C2531gz((int[]) this.f10345b.clone(), this.f10346c);
    }

    /* renamed from: d */
    public void m12054d(int i) {
        int[] iArr = this.f10345b;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2531gz)) {
            return false;
        }
        C2531gz c2531gz = (C2531gz) obj;
        return this.f10346c == c2531gz.f10346c && Arrays.equals(this.f10345b, c2531gz.f10345b);
    }

    /* renamed from: g */
    public void m12055g() {
        int[] iArr = new int[this.f10345b.length];
        int i = (this.f10346c - 1) / 32;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = this.f10345b[i3];
            long j2 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j3 = ((j2 & 858993459) << 2) | ((j2 >> 2) & 858993459);
            long j4 = ((j3 & 252645135) << 4) | ((j3 >> 4) & 252645135);
            long j5 = ((j4 & 16711935) << 8) | ((j4 >> 8) & 16711935);
            iArr[i - i3] = (int) (((j5 & 65535) << 16) | ((j5 >> 16) & 65535));
        }
        int i4 = this.f10346c;
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
        this.f10345b = iArr;
    }

    public int hashCode() {
        return (this.f10346c * 31) + Arrays.hashCode(this.f10345b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.f10346c);
        for (int i = 0; i < this.f10346c; i++) {
            if ((i & 7) == 0) {
                sb.append(' ');
            }
            sb.append(m12048a(i) ? 'X' : '.');
        }
        return sb.toString();
    }
}
