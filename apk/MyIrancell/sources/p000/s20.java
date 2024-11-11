package p000;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s20 {

    /* renamed from: a */
    private final r20 f13004a;

    /* renamed from: b */
    private final int[] f13005b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s20(r20 r20Var, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f13004a = r20Var;
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            this.f13005b = iArr;
            return;
        }
        int i = 1;
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.f13005b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i];
        this.f13005b = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m15322a() {
        return this.f13005b.length - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m15323a(int i) {
        if (i == 0) {
            return m15326b(0);
        }
        int[] iArr = this.f13005b;
        int length = iArr.length;
        if (i != 1) {
            int i2 = iArr[0];
            for (int i3 = 1; i3 < length; i3++) {
                r20 r20Var = this.f13004a;
                i2 = r20Var.m15175a(r20Var.m15181c(i, i2), this.f13005b[i3]);
            }
            return i2;
        }
        int i4 = 0;
        for (int i5 : iArr) {
            i4 = this.f13004a.m15175a(i4, i5);
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public s20 m15324a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.f13004a.m15182c();
        }
        int length = this.f13005b.length;
        int[] iArr = new int[i + length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = this.f13004a.m15181c(this.f13005b[i3], i2);
        }
        return new s20(this.f13004a, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public s20 m15325a(s20 s20Var) {
        if (!this.f13004a.equals(s20Var.f13004a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (m15328b()) {
            return s20Var;
        }
        if (s20Var.m15328b()) {
            return this;
        }
        int[] iArr = this.f13005b;
        int[] iArr2 = s20Var.f13005b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = this.f13004a.m15175a(iArr2[i - length], iArr[i]);
        }
        return new s20(this.f13004a, iArr3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m15326b(int i) {
        return this.f13005b[(r0.length - 1) - i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public s20 m15327b(s20 s20Var) {
        if (!this.f13004a.equals(s20Var.f13004a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (m15328b() || s20Var.m15328b()) {
            return this.f13004a.m15182c();
        }
        int[] iArr = this.f13005b;
        int length = iArr.length;
        int[] iArr2 = s20Var.f13005b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                r20 r20Var = this.f13004a;
                iArr3[i4] = r20Var.m15175a(iArr3[i4], r20Var.m15181c(i2, iArr2[i3]));
            }
        }
        return new s20(this.f13004a, iArr3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m15328b() {
        return this.f13005b[0] == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public s20 m15329c() {
        int length = this.f13005b.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = this.f13004a.m15183d(0, this.f13005b[i]);
        }
        return new s20(this.f13004a, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public s20 m15330c(int i) {
        if (i == 0) {
            return this.f13004a.m15182c();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f13005b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f13004a.m15181c(this.f13005b[i2], i);
        }
        return new s20(this.f13004a, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public s20 m15331c(s20 s20Var) {
        if (this.f13004a.equals(s20Var.f13004a)) {
            return s20Var.m15328b() ? this : m15325a(s20Var.m15329c());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(m15322a() * 8);
        for (int m15322a = m15322a(); m15322a >= 0; m15322a--) {
            int m15326b = m15326b(m15322a);
            if (m15326b != 0) {
                if (m15326b < 0) {
                    sb.append(" - ");
                    m15326b = -m15326b;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (m15322a == 0 || m15326b != 1) {
                    sb.append(m15326b);
                }
                if (m15322a != 0) {
                    if (m15322a == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(m15322a);
                    }
                }
            }
        }
        return sb.toString();
    }
}
