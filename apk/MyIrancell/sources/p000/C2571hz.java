package p000;

import java.util.Arrays;

/* renamed from: hz */
/* loaded from: classes.dex */
public final class C2571hz implements Cloneable {

    /* renamed from: b */
    private final int f10530b;

    /* renamed from: c */
    private final int f10531c;

    /* renamed from: d */
    private final int f10532d;

    /* renamed from: e */
    private final int[] f10533e;

    public C2571hz(int i) {
        this(i, i);
    }

    public C2571hz(int i, int i2) {
        if (i < 1 || i2 < 1) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f10530b = i;
        this.f10531c = i2;
        int i3 = (i + 31) / 32;
        this.f10532d = i3;
        this.f10533e = new int[i3 * i2];
    }

    private C2571hz(int i, int i2, int i3, int[] iArr) {
        this.f10530b = i;
        this.f10531c = i2;
        this.f10532d = i3;
        this.f10533e = iArr;
    }

    /* renamed from: a */
    public C2531gz m12288a(int i, C2531gz c2531gz) {
        if (c2531gz == null || c2531gz.m12052c() < this.f10530b) {
            c2531gz = new C2531gz(this.f10530b);
        } else {
            c2531gz.m12046a();
        }
        int i2 = i * this.f10532d;
        for (int i3 = 0; i3 < this.f10532d; i3++) {
            c2531gz.m12047a(i3 * 32, this.f10533e[i2 + i3]);
        }
        return c2531gz;
    }

    /* renamed from: a */
    public String m12289a(String str, String str2) {
        return m12290a(str, str2, "\n");
    }

    @Deprecated
    /* renamed from: a */
    public String m12290a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.f10531c * (this.f10530b + 1));
        for (int i = 0; i < this.f10531c; i++) {
            for (int i2 = 0; i2 < this.f10530b; i2++) {
                sb.append(m12295b(i2, i) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void m12291a(int i, int i2) {
        int i3 = (i2 * this.f10532d) + (i / 32);
        int[] iArr = this.f10533e;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    /* renamed from: a */
    public void m12292a(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i4 < 1 || i3 < 1) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.f10531c || i5 > this.f10530b) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i2 < i6) {
            int i7 = this.f10532d * i2;
            for (int i8 = i; i8 < i5; i8++) {
                int[] iArr = this.f10533e;
                int i9 = (i8 / 32) + i7;
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    /* renamed from: a */
    public int[] m12293a() {
        int length = this.f10533e.length - 1;
        while (length >= 0 && this.f10533e[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.f10532d;
        int i2 = length / i;
        int i3 = (length % i) * 32;
        int i4 = 31;
        while ((this.f10533e[length] >>> i4) == 0) {
            i4--;
        }
        return new int[]{i3 + i4, i2};
    }

    /* renamed from: b */
    public void m12294b(int i, C2531gz c2531gz) {
        int[] m12051b = c2531gz.m12051b();
        int[] iArr = this.f10533e;
        int i2 = this.f10532d;
        System.arraycopy(m12051b, 0, iArr, i * i2, i2);
    }

    /* renamed from: b */
    public boolean m12295b(int i, int i2) {
        return ((this.f10533e[(i2 * this.f10532d) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    /* renamed from: b */
    public int[] m12296b() {
        int i = this.f10530b;
        int i2 = this.f10531c;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < this.f10531c; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = this.f10532d;
                if (i6 < i7) {
                    int i8 = this.f10533e[(i7 * i5) + i6];
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

    /* renamed from: c */
    public int m12297c() {
        return this.f10531c;
    }

    /* renamed from: c */
    public void m12298c(int i, int i2) {
        int i3 = (i2 * this.f10532d) + (i / 32);
        int[] iArr = this.f10533e;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public C2571hz m16985clone() {
        return new C2571hz(this.f10530b, this.f10531c, this.f10532d, (int[]) this.f10533e.clone());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2571hz)) {
            return false;
        }
        C2571hz c2571hz = (C2571hz) obj;
        return this.f10530b == c2571hz.f10530b && this.f10531c == c2571hz.f10531c && this.f10532d == c2571hz.f10532d && Arrays.equals(this.f10533e, c2571hz.f10533e);
    }

    /* renamed from: g */
    public int[] m12299g() {
        int i = 0;
        while (true) {
            int[] iArr = this.f10533e;
            if (i >= iArr.length || iArr[i] != 0) {
                break;
            }
            i++;
        }
        int[] iArr2 = this.f10533e;
        if (i == iArr2.length) {
            return null;
        }
        int i2 = this.f10532d;
        int i3 = i / i2;
        int i4 = (i % i2) * 32;
        int i5 = iArr2[i];
        int i6 = 0;
        while ((i5 << (31 - i6)) == 0) {
            i6++;
        }
        return new int[]{i4 + i6, i3};
    }

    /* renamed from: h */
    public int m12300h() {
        return this.f10530b;
    }

    public int hashCode() {
        int i = this.f10530b;
        return (((((((i * 31) + i) * 31) + this.f10531c) * 31) + this.f10532d) * 31) + Arrays.hashCode(this.f10533e);
    }

    /* renamed from: j */
    public void m12301j() {
        int m12300h = m12300h();
        int m12297c = m12297c();
        C2531gz c2531gz = new C2531gz(m12300h);
        C2531gz c2531gz2 = new C2531gz(m12300h);
        for (int i = 0; i < (m12297c + 1) / 2; i++) {
            c2531gz = m12288a(i, c2531gz);
            int i2 = (m12297c - 1) - i;
            c2531gz2 = m12288a(i2, c2531gz2);
            c2531gz.m12055g();
            c2531gz2.m12055g();
            m12294b(i, c2531gz2);
            m12294b(i2, c2531gz);
        }
    }

    public String toString() {
        return m12289a("X ", "  ");
    }
}
