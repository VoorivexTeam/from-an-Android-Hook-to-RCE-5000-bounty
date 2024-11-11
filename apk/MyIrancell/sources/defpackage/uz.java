package defpackage;

/* loaded from: classes.dex */
public final class uz {
    public static final uz h = new uz(4201, 4096, 1);
    public static final uz i = new uz(1033, 1024, 1);
    public static final uz j = new uz(67, 64, 1);
    public static final uz k = new uz(19, 16, 1);
    public static final uz l = new uz(285, 256, 0);
    public static final uz m;
    public static final uz n;
    public static final uz o;
    private final int[] a;
    private final int[] b;
    private final vz c;
    private final vz d;
    private final int e;
    private final int f;
    private final int g;

    static {
        uz uzVar = new uz(301, 256, 1);
        m = uzVar;
        n = uzVar;
        o = j;
    }

    public uz(int i2, int i3, int i4) {
        this.f = i2;
        this.e = i3;
        this.g = i4;
        this.a = new int[i3];
        this.b = new int[i3];
        int i5 = 1;
        for (int i6 = 0; i6 < i3; i6++) {
            this.a[i6] = i5;
            i5 *= 2;
            if (i5 >= i3) {
                i5 = (i5 ^ i2) & (i3 - 1);
            }
        }
        for (int i7 = 0; i7 < i3 - 1; i7++) {
            this.b[this.a[i7]] = i7;
        }
        this.c = new vz(this, new int[]{0});
        this.d = new vz(this, new int[]{1});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i2, int i3) {
        return i2 ^ i3;
    }

    public int a() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(int i2) {
        return this.a[i2];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public vz a(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (i3 == 0) {
            return this.c;
        }
        int[] iArr = new int[i2 + 1];
        iArr[0] = i3;
        return new vz(this, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(int i2) {
        if (i2 != 0) {
            return this.a[(this.e - this.b[i2]) - 1];
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.a;
        int[] iArr2 = this.b;
        return iArr[(iArr2[i2] + iArr2[i3]) % (this.e - 1)];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public vz b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(int i2) {
        if (i2 != 0) {
            return this.b[i2];
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public vz d() {
        return this.c;
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f) + ',' + this.e + ')';
    }
}
