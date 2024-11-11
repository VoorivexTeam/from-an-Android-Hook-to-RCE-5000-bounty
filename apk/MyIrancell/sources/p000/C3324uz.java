package p000;

/* renamed from: uz */
/* loaded from: classes.dex */
public final class C3324uz {

    /* renamed from: h */
    public static final C3324uz f13516h = new C3324uz(4201, 4096, 1);

    /* renamed from: i */
    public static final C3324uz f13517i = new C3324uz(1033, 1024, 1);

    /* renamed from: j */
    public static final C3324uz f13518j = new C3324uz(67, 64, 1);

    /* renamed from: k */
    public static final C3324uz f13519k = new C3324uz(19, 16, 1);

    /* renamed from: l */
    public static final C3324uz f13520l = new C3324uz(285, 256, 0);

    /* renamed from: m */
    public static final C3324uz f13521m;

    /* renamed from: n */
    public static final C3324uz f13522n;

    /* renamed from: o */
    public static final C3324uz f13523o;

    /* renamed from: a */
    private final int[] f13524a;

    /* renamed from: b */
    private final int[] f13525b;

    /* renamed from: c */
    private final C3377vz f13526c;

    /* renamed from: d */
    private final C3377vz f13527d;

    /* renamed from: e */
    private final int f13528e;

    /* renamed from: f */
    private final int f13529f;

    /* renamed from: g */
    private final int f13530g;

    static {
        C3324uz c3324uz = new C3324uz(301, 256, 1);
        f13521m = c3324uz;
        f13522n = c3324uz;
        f13523o = f13518j;
    }

    public C3324uz(int i, int i2, int i3) {
        this.f13529f = i;
        this.f13528e = i2;
        this.f13530g = i3;
        this.f13524a = new int[i2];
        this.f13525b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f13524a[i5] = i4;
            i4 *= 2;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f13525b[this.f13524a[i6]] = i6;
        }
        this.f13526c = new C3377vz(this, new int[]{0});
        this.f13527d = new C3377vz(this, new int[]{1});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m15875c(int i, int i2) {
        return i ^ i2;
    }

    /* renamed from: a */
    public int m15876a() {
        return this.f13530g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m15877a(int i) {
        return this.f13524a[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C3377vz m15878a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.f13526c;
        }
        int[] iArr = new int[i + 1];
        iArr[0] = i2;
        return new C3377vz(this, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m15879b(int i) {
        if (i != 0) {
            return this.f13524a[(this.f13528e - this.f13525b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m15880b(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f13524a;
        int[] iArr2 = this.f13525b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f13528e - 1)];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C3377vz m15881b() {
        return this.f13527d;
    }

    /* renamed from: c */
    public int m15882c() {
        return this.f13528e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m15883c(int i) {
        if (i != 0) {
            return this.f13525b[i];
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public C3377vz m15884d() {
        return this.f13526c;
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f13529f) + ',' + this.f13528e + ')';
    }
}
