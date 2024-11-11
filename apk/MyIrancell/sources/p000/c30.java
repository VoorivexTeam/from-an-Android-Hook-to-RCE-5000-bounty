package p000;

/* loaded from: classes.dex */
final class c30 {

    /* renamed from: c */
    private static final int[][] f2904c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: d */
    private static final int[] f2905d = {0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4};

    /* renamed from: a */
    private final b30 f2906a;

    /* renamed from: b */
    private final byte f2907b;

    private c30(int i) {
        this.f2906a = b30.forBits((i >> 3) & 3);
        this.f2907b = (byte) (i & 7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static c30 m3545a(int i, int i2) {
        c30 m3546b = m3546b(i, i2);
        return m3546b != null ? m3546b : m3546b(i ^ 21522, i2 ^ 21522);
    }

    /* renamed from: b */
    private static c30 m3546b(int i, int i2) {
        int m3547c;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        for (int[] iArr : f2904c) {
            int i5 = iArr[0];
            if (i5 == i || i5 == i2) {
                return new c30(iArr[1]);
            }
            int m3547c2 = m3547c(i, i5);
            if (m3547c2 < i3) {
                i4 = iArr[1];
                i3 = m3547c2;
            }
            if (i != i2 && (m3547c = m3547c(i2, i5)) < i3) {
                i4 = iArr[1];
                i3 = m3547c;
            }
        }
        if (i3 <= 3) {
            return new c30(i4);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m3547c(int i, int i2) {
        int i3 = i ^ i2;
        int[] iArr = f2905d;
        return iArr[i3 & 15] + iArr[(i3 >>> 4) & 15] + iArr[(i3 >>> 8) & 15] + iArr[(i3 >>> 12) & 15] + iArr[(i3 >>> 16) & 15] + iArr[(i3 >>> 20) & 15] + iArr[(i3 >>> 24) & 15] + iArr[(i3 >>> 28) & 15];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public byte m3548a() {
        return this.f2907b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public b30 m3549b() {
        return this.f2906a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c30)) {
            return false;
        }
        c30 c30Var = (c30) obj;
        return this.f2906a == c30Var.f2906a && this.f2907b == c30Var.f2907b;
    }

    public int hashCode() {
        return (this.f2906a.ordinal() << 3) | this.f2907b;
    }
}
