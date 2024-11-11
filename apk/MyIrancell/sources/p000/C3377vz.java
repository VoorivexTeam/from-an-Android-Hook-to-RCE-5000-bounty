package p000;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: vz */
/* loaded from: classes.dex */
public final class C3377vz {

    /* renamed from: a */
    private final C3324uz f13720a;

    /* renamed from: b */
    private final int[] f13721b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3377vz(C3324uz c3324uz, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f13720a = c3324uz;
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            this.f13721b = iArr;
            return;
        }
        int i = 1;
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.f13721b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i];
        this.f13721b = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m16061a() {
        return this.f13721b.length - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m16062a(int i) {
        if (i == 0) {
            return m16065b(0);
        }
        int[] iArr = this.f13721b;
        int length = iArr.length;
        if (i != 1) {
            int i2 = iArr[0];
            for (int i3 = 1; i3 < length; i3++) {
                i2 = C3324uz.m15875c(this.f13720a.m15880b(i, i2), this.f13721b[i3]);
            }
            return i2;
        }
        int i4 = 0;
        for (int i5 : iArr) {
            i4 = C3324uz.m15875c(i4, i5);
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C3377vz m16063a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.f13720a.m15884d();
        }
        int length = this.f13721b.length;
        int[] iArr = new int[i + length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = this.f13720a.m15880b(this.f13721b[i3], i2);
        }
        return new C3377vz(this.f13720a, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C3377vz m16064a(C3377vz c3377vz) {
        if (!this.f13720a.equals(c3377vz.f13720a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (m16067b()) {
            return c3377vz;
        }
        if (c3377vz.m16067b()) {
            return this;
        }
        int[] iArr = this.f13721b;
        int[] iArr2 = c3377vz.f13721b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = C3324uz.m15875c(iArr2[i - length], iArr[i]);
        }
        return new C3377vz(this.f13720a, iArr3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m16065b(int i) {
        return this.f13721b[(r0.length - 1) - i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C3377vz m16066b(C3377vz c3377vz) {
        if (!this.f13720a.equals(c3377vz.f13720a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (m16067b() || c3377vz.m16067b()) {
            return this.f13720a.m15884d();
        }
        int[] iArr = this.f13721b;
        int length = iArr.length;
        int[] iArr2 = c3377vz.f13721b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                iArr3[i4] = C3324uz.m15875c(iArr3[i4], this.f13720a.m15880b(i2, iArr2[i3]));
            }
        }
        return new C3377vz(this.f13720a, iArr3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m16067b() {
        return this.f13721b[0] == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C3377vz m16068c(int i) {
        if (i == 0) {
            return this.f13720a.m15884d();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f13721b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f13720a.m15880b(this.f13721b[i2], i);
        }
        return new C3377vz(this.f13720a, iArr);
    }

    public String toString() {
        char c;
        StringBuilder sb = new StringBuilder(m16061a() * 8);
        for (int m16061a = m16061a(); m16061a >= 0; m16061a--) {
            int m16065b = m16065b(m16061a);
            if (m16065b != 0) {
                if (m16065b < 0) {
                    sb.append(" - ");
                    m16065b = -m16065b;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (m16061a == 0 || m16065b != 1) {
                    int m15883c = this.f13720a.m15883c(m16065b);
                    if (m15883c == 0) {
                        c = '1';
                    } else if (m15883c == 1) {
                        c = 'a';
                    } else {
                        sb.append("a^");
                        sb.append(m15883c);
                    }
                    sb.append(c);
                }
                if (m16061a != 0) {
                    if (m16061a == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(m16061a);
                    }
                }
            }
        }
        return sb.toString();
    }
}
