package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.o4;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h7 {
    private static final h7 f = new h7(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;
    private int d;
    private boolean e;

    private h7() {
        this(0, new int[8], new Object[8], true);
    }

    private h7(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h7 a(h7 h7Var, h7 h7Var2) {
        int i = h7Var.a + h7Var2.a;
        int[] copyOf = Arrays.copyOf(h7Var.b, i);
        System.arraycopy(h7Var2.b, 0, copyOf, h7Var.a, h7Var2.a);
        Object[] copyOf2 = Arrays.copyOf(h7Var.c, i);
        System.arraycopy(h7Var2.c, 0, copyOf2, h7Var.a, h7Var2.a);
        return new h7(i, copyOf, copyOf2, true);
    }

    private static void a(int i, Object obj, b8 b8Var) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            b8Var.e(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 1) {
            b8Var.c(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 2) {
            b8Var.a(i2, (h3) obj);
            return;
        }
        if (i3 != 3) {
            if (i3 != 5) {
                throw new RuntimeException(w4.d());
            }
            b8Var.e(i2, ((Integer) obj).intValue());
        } else if (b8Var.zza() == o4.f.k) {
            b8Var.a(i2);
            ((h7) obj).b(b8Var);
            b8Var.b(i2);
        } else {
            b8Var.b(i2);
            ((h7) obj).b(b8Var);
            b8Var.a(i2);
        }
    }

    public static h7 d() {
        return f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h7 e() {
        return new h7();
    }

    public final void a() {
        this.e = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.a;
        if (i2 == this.b.length) {
            int i3 = this.a + (i2 < 4 ? 8 : i2 >> 1);
            this.b = Arrays.copyOf(this.b, i3);
            this.c = Arrays.copyOf(this.c, i3);
        }
        int[] iArr = this.b;
        int i4 = this.a;
        iArr[i4] = i;
        this.c[i4] = obj;
        this.a = i4 + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(b8 b8Var) {
        if (b8Var.zza() == o4.f.l) {
            for (int i = this.a - 1; i >= 0; i--) {
                b8Var.a(this.b[i] >>> 3, this.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.a; i2++) {
            b8Var.a(this.b[i2] >>> 3, this.c[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            c6.a(sb, i, String.valueOf(this.b[i2] >>> 3), this.c[i2]);
        }
    }

    public final int b() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            i2 += v3.d(this.b[i3] >>> 3, (h3) this.c[i3]);
        }
        this.d = i2;
        return i2;
    }

    public final void b(b8 b8Var) {
        if (this.a == 0) {
            return;
        }
        if (b8Var.zza() == o4.f.k) {
            for (int i = 0; i < this.a; i++) {
                a(this.b[i], this.c[i], b8Var);
            }
            return;
        }
        for (int i2 = this.a - 1; i2 >= 0; i2--) {
            a(this.b[i2], this.c[i2], b8Var);
        }
    }

    public final int c() {
        int e;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                e = v3.e(i5, ((Long) this.c[i3]).longValue());
            } else if (i6 == 1) {
                e = v3.g(i5, ((Long) this.c[i3]).longValue());
            } else if (i6 == 2) {
                e = v3.c(i5, (h3) this.c[i3]);
            } else if (i6 == 3) {
                e = (v3.e(i5) << 1) + ((h7) this.c[i3]).c();
            } else {
                if (i6 != 5) {
                    throw new IllegalStateException(w4.d());
                }
                e = v3.i(i5, ((Integer) this.c[i3]).intValue());
            }
            i2 += e;
        }
        this.d = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h7)) {
            return false;
        }
        h7 h7Var = (h7) obj;
        int i = this.a;
        if (i == h7Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = h7Var.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                }
                if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (z) {
                Object[] objArr = this.c;
                Object[] objArr2 = h7Var.c;
                int i3 = this.a;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    }
                    if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    }
                    i4++;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
