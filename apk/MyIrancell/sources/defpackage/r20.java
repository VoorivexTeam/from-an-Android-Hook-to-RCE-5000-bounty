package defpackage;

/* loaded from: classes.dex */
public final class r20 {
    public static final r20 f = new r20(929, 3);
    private final int[] a;
    private final int[] b;
    private final s20 c;
    private final s20 d;
    private final int e;

    private r20(int i, int i2) {
        this.e = i;
        this.a = new int[i];
        this.b = new int[i];
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            this.a[i4] = i3;
            i3 = (i3 * i2) % i;
        }
        for (int i5 = 0; i5 < i - 1; i5++) {
            this.b[this.a[i5]] = i5;
        }
        this.c = new s20(this, new int[]{0});
        this.d = new s20(this, new int[]{1});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(int i) {
        return this.a[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(int i, int i2) {
        return (i + i2) % this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s20 a() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(int i) {
        if (i != 0) {
            return this.a[(this.e - this.b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s20 b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.c;
        }
        int[] iArr = new int[i + 1];
        iArr[0] = i2;
        return new s20(this, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(int i) {
        if (i != 0) {
            return this.b[i];
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.a;
        int[] iArr2 = this.b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.e - 1)];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s20 c() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d(int i, int i2) {
        int i3 = this.e;
        return ((i + i3) - i2) % i3;
    }
}
