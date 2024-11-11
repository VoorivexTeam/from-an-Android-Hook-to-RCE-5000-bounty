package p000;

/* loaded from: classes.dex */
public final class r20 {

    /* renamed from: f */
    public static final r20 f12861f = new r20(929, 3);

    /* renamed from: a */
    private final int[] f12862a;

    /* renamed from: b */
    private final int[] f12863b;

    /* renamed from: c */
    private final s20 f12864c;

    /* renamed from: d */
    private final s20 f12865d;

    /* renamed from: e */
    private final int f12866e;

    private r20(int i, int i2) {
        this.f12866e = i;
        this.f12862a = new int[i];
        this.f12863b = new int[i];
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            this.f12862a[i4] = i3;
            i3 = (i3 * i2) % i;
        }
        for (int i5 = 0; i5 < i - 1; i5++) {
            this.f12863b[this.f12862a[i5]] = i5;
        }
        this.f12864c = new s20(this, new int[]{0});
        this.f12865d = new s20(this, new int[]{1});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m15174a(int i) {
        return this.f12862a[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m15175a(int i, int i2) {
        return (i + i2) % this.f12866e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public s20 m15176a() {
        return this.f12865d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m15177b() {
        return this.f12866e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m15178b(int i) {
        if (i != 0) {
            return this.f12862a[(this.f12866e - this.f12863b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public s20 m15179b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.f12864c;
        }
        int[] iArr = new int[i + 1];
        iArr[0] = i2;
        return new s20(this, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m15180c(int i) {
        if (i != 0) {
            return this.f12863b[i];
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m15181c(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f12862a;
        int[] iArr2 = this.f12863b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f12866e - 1)];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public s20 m15182c() {
        return this.f12864c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m15183d(int i, int i2) {
        int i3 = this.f12866e;
        return ((i + i3) - i2) % i3;
    }
}
