package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class vz {
    private final uz a;
    private final int[] b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public vz(uz uzVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.a = uzVar;
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            this.b = iArr;
            return;
        }
        int i = 1;
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i];
        this.b = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        return this.b.length - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(int i) {
        if (i == 0) {
            return b(0);
        }
        int[] iArr = this.b;
        int length = iArr.length;
        if (i != 1) {
            int i2 = iArr[0];
            for (int i3 = 1; i3 < length; i3++) {
                i2 = uz.c(this.a.b(i, i2), this.b[i3]);
            }
            return i2;
        }
        int i4 = 0;
        for (int i5 : iArr) {
            i4 = uz.c(i4, i5);
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public vz a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.a.d();
        }
        int length = this.b.length;
        int[] iArr = new int[i + length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = this.a.b(this.b[i3], i2);
        }
        return new vz(this.a, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public vz a(vz vzVar) {
        if (!this.a.equals(vzVar.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (b()) {
            return vzVar;
        }
        if (vzVar.b()) {
            return this;
        }
        int[] iArr = this.b;
        int[] iArr2 = vzVar.b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = uz.c(iArr2[i - length], iArr[i]);
        }
        return new vz(this.a, iArr3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(int i) {
        return this.b[(r0.length - 1) - i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public vz b(vz vzVar) {
        if (!this.a.equals(vzVar.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (b() || vzVar.b()) {
            return this.a.d();
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = vzVar.b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                iArr3[i4] = uz.c(iArr3[i4], this.a.b(i2, iArr2[i3]));
            }
        }
        return new vz(this.a, iArr3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        return this.b[0] == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public vz c(int i) {
        if (i == 0) {
            return this.a.d();
        }
        if (i == 1) {
            return this;
        }
        int length = this.b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.a.b(this.b[i2], i);
        }
        return new vz(this.a, iArr);
    }

    public String toString() {
        char c;
        StringBuilder sb = new StringBuilder(a() * 8);
        for (int a = a(); a >= 0; a--) {
            int b = b(a);
            if (b != 0) {
                if (b < 0) {
                    sb.append(" - ");
                    b = -b;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (a == 0 || b != 1) {
                    int c2 = this.a.c(b);
                    if (c2 == 0) {
                        c = '1';
                    } else if (c2 == 1) {
                        c = 'a';
                    } else {
                        sb.append("a^");
                        sb.append(c2);
                    }
                    sb.append(c);
                }
                if (a != 0) {
                    if (a == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(a);
                    }
                }
            }
        }
        return sb.toString();
    }
}
