package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class hz implements Cloneable {
    private final int b;
    private final int c;
    private final int d;
    private final int[] e;

    public hz(int i) {
        this(i, i);
    }

    public hz(int i, int i2) {
        if (i < 1 || i2 < 1) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.b = i;
        this.c = i2;
        int i3 = (i + 31) / 32;
        this.d = i3;
        this.e = new int[i3 * i2];
    }

    private hz(int i, int i2, int i3, int[] iArr) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = iArr;
    }

    public gz a(int i, gz gzVar) {
        if (gzVar == null || gzVar.c() < this.b) {
            gzVar = new gz(this.b);
        } else {
            gzVar.a();
        }
        int i2 = i * this.d;
        for (int i3 = 0; i3 < this.d; i3++) {
            gzVar.a(i3 * 32, this.e[i2 + i3]);
        }
        return gzVar;
    }

    public String a(String str, String str2) {
        return a(str, str2, "\n");
    }

    @Deprecated
    public String a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.c * (this.b + 1));
        for (int i = 0; i < this.c; i++) {
            for (int i2 = 0; i2 < this.b; i2++) {
                sb.append(b(i2, i) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    public void a(int i, int i2) {
        int i3 = (i2 * this.d) + (i / 32);
        int[] iArr = this.e;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    public void a(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i4 < 1 || i3 < 1) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.c || i5 > this.b) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i2 < i6) {
            int i7 = this.d * i2;
            for (int i8 = i; i8 < i5; i8++) {
                int[] iArr = this.e;
                int i9 = (i8 / 32) + i7;
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    public int[] a() {
        int length = this.e.length - 1;
        while (length >= 0 && this.e[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.d;
        int i2 = length / i;
        int i3 = (length % i) * 32;
        int i4 = 31;
        while ((this.e[length] >>> i4) == 0) {
            i4--;
        }
        return new int[]{i3 + i4, i2};
    }

    public void b(int i, gz gzVar) {
        int[] b = gzVar.b();
        int[] iArr = this.e;
        int i2 = this.d;
        System.arraycopy(b, 0, iArr, i * i2, i2);
    }

    public boolean b(int i, int i2) {
        return ((this.e[(i2 * this.d) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    public int[] b() {
        int i = this.b;
        int i2 = this.c;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < this.c; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = this.d;
                if (i6 < i7) {
                    int i8 = this.e[(i7 * i5) + i6];
                    if (i8 != 0) {
                        if (i5 < i2) {
                            i2 = i5;
                        }
                        if (i5 > i4) {
                            i4 = i5;
                        }
                        int i9 = i6 * 32;
                        int i10 = 31;
                        if (i9 < i) {
                            int i11 = 0;
                            while ((i8 << (31 - i11)) == 0) {
                                i11++;
                            }
                            int i12 = i11 + i9;
                            if (i12 < i) {
                                i = i12;
                            }
                        }
                        if (i9 + 31 > i3) {
                            while ((i8 >>> i10) == 0) {
                                i10--;
                            }
                            int i13 = i9 + i10;
                            if (i13 > i3) {
                                i3 = i13;
                            }
                        }
                    }
                    i6++;
                }
            }
        }
        int i14 = i3 - i;
        int i15 = i4 - i2;
        if (i14 < 0 || i15 < 0) {
            return null;
        }
        return new int[]{i, i2, i14, i15};
    }

    public int c() {
        return this.c;
    }

    public void c(int i, int i2) {
        int i3 = (i2 * this.d) + (i / 32);
        int[] iArr = this.e;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public hz m7clone() {
        return new hz(this.b, this.c, this.d, (int[]) this.e.clone());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof hz)) {
            return false;
        }
        hz hzVar = (hz) obj;
        return this.b == hzVar.b && this.c == hzVar.c && this.d == hzVar.d && Arrays.equals(this.e, hzVar.e);
    }

    public int[] g() {
        int i = 0;
        while (true) {
            int[] iArr = this.e;
            if (i >= iArr.length || iArr[i] != 0) {
                break;
            }
            i++;
        }
        int[] iArr2 = this.e;
        if (i == iArr2.length) {
            return null;
        }
        int i2 = this.d;
        int i3 = i / i2;
        int i4 = (i % i2) * 32;
        int i5 = iArr2[i];
        int i6 = 0;
        while ((i5 << (31 - i6)) == 0) {
            i6++;
        }
        return new int[]{i4 + i6, i3};
    }

    public int h() {
        return this.b;
    }

    public int hashCode() {
        int i = this.b;
        return (((((((i * 31) + i) * 31) + this.c) * 31) + this.d) * 31) + Arrays.hashCode(this.e);
    }

    public void j() {
        int h = h();
        int c = c();
        gz gzVar = new gz(h);
        gz gzVar2 = new gz(h);
        for (int i = 0; i < (c + 1) / 2; i++) {
            gzVar = a(i, gzVar);
            int i2 = (c - 1) - i;
            gzVar2 = a(i2, gzVar2);
            gzVar.g();
            gzVar2.g();
            b(i, gzVar2);
            b(i2, gzVar);
        }
    }

    public String toString() {
        return a("X ", "  ");
    }
}
