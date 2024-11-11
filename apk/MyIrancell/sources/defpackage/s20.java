package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s20 {
    private final r20 a;
    private final int[] b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s20(r20 r20Var, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.a = r20Var;
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
                r20 r20Var = this.a;
                i2 = r20Var.a(r20Var.c(i, i2), this.b[i3]);
            }
            return i2;
        }
        int i4 = 0;
        for (int i5 : iArr) {
            i4 = this.a.a(i4, i5);
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s20 a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.a.c();
        }
        int length = this.b.length;
        int[] iArr = new int[i + length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = this.a.c(this.b[i3], i2);
        }
        return new s20(this.a, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s20 a(s20 s20Var) {
        if (!this.a.equals(s20Var.a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (b()) {
            return s20Var;
        }
        if (s20Var.b()) {
            return this;
        }
        int[] iArr = this.b;
        int[] iArr2 = s20Var.b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = this.a.a(iArr2[i - length], iArr[i]);
        }
        return new s20(this.a, iArr3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(int i) {
        return this.b[(r0.length - 1) - i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s20 b(s20 s20Var) {
        if (!this.a.equals(s20Var.a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (b() || s20Var.b()) {
            return this.a.c();
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = s20Var.b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                r20 r20Var = this.a;
                iArr3[i4] = r20Var.a(iArr3[i4], r20Var.c(i2, iArr2[i3]));
            }
        }
        return new s20(this.a, iArr3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        return this.b[0] == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s20 c() {
        int length = this.b.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = this.a.d(0, this.b[i]);
        }
        return new s20(this.a, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s20 c(int i) {
        if (i == 0) {
            return this.a.c();
        }
        if (i == 1) {
            return this;
        }
        int length = this.b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.a.c(this.b[i2], i);
        }
        return new s20(this.a, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s20 c(s20 s20Var) {
        if (this.a.equals(s20Var.a)) {
            return s20Var.b() ? this : a(s20Var.c());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public String toString() {
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
                    sb.append(b);
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
