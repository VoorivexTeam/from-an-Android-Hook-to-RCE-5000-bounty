package p000;

/* loaded from: classes.dex */
public abstract class a10 extends t00 {

    /* renamed from: b */
    private final int[] f19b;

    /* renamed from: e */
    private final int[] f22e;

    /* renamed from: f */
    private final int[] f23f;

    /* renamed from: a */
    private final int[] f18a = new int[4];

    /* renamed from: c */
    private final float[] f20c = new float[4];

    /* renamed from: d */
    private final float[] f21d = new float[4];

    /* JADX INFO: Access modifiers changed from: protected */
    public a10() {
        int[] iArr = new int[8];
        this.f19b = iArr;
        this.f22e = new int[iArr.length / 2];
        this.f23f = new int[iArr.length / 2];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static int m19a(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static int m20a(int[] iArr, int[][] iArr2) {
        for (int i = 0; i < iArr2.length; i++) {
            if (t00.m15476a(iArr, iArr2[i], 0.45f) < 0.2f) {
                return i;
            }
        }
        throw C0438aw.m3194a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static void m21a(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] < f) {
                f = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] - 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public static void m22b(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] > f) {
                f = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] + 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public static boolean m23b(int[] iArr) {
        float f = (iArr[0] + iArr[1]) / ((iArr[2] + r1) + iArr[3]);
        if (f < 0.7916667f || f > 0.89285713f) {
            return false;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 : iArr) {
            if (i3 > i2) {
                i2 = i3;
            }
            if (i3 < i) {
                i = i3;
            }
        }
        return i2 < i * 10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final int[] m24b() {
        return this.f19b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final int[] m25c() {
        return this.f18a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final int[] m26d() {
        return this.f23f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final float[] m27e() {
        return this.f21d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public final int[] m28f() {
        return this.f22e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final float[] m29g() {
        return this.f20c;
    }
}
