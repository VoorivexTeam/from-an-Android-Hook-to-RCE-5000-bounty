package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class z90 {
    private int a;
    private final int[] b = new int[10];

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(int i) {
        return this.b[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z90 a(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i < iArr.length) {
                this.a = (1 << i) | this.a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.a = 0;
        Arrays.fill(this.b, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(z90 z90Var) {
        for (int i = 0; i < 10; i++) {
            if (z90Var.d(i)) {
                a(i, z90Var.a(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        if ((this.a & 2) != 0) {
            return this.b[1];
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(int i) {
        return (this.a & 16) != 0 ? this.b[4] : i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        if ((this.a & 128) != 0) {
            return this.b[7];
        }
        return 65535;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(int i) {
        return (this.a & 32) != 0 ? this.b[5] : i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return Integer.bitCount(this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(int i) {
        return ((1 << i) & this.a) != 0;
    }
}
