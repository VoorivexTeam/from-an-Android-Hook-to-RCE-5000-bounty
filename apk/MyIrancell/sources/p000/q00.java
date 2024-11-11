package p000;

import java.util.Map;

/* loaded from: classes.dex */
public final class q00 extends t00 {

    /* renamed from: b */
    private static final int[] f12653b = {6, 8, 10, 12, 14};

    /* renamed from: c */
    private static final int[] f12654c = {1, 1, 1, 1};

    /* renamed from: d */
    private static final int[] f12655d = {1, 1, 3};

    /* renamed from: e */
    static final int[][] f12656e = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a */
    private int f12657a = -1;

    /* renamed from: a */
    private static int m14869a(int[] iArr) {
        int length = f12656e.length;
        float f = 0.38f;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            float m15476a = t00.m15476a(iArr, f12656e[i2], 0.78f);
            if (m15476a < f) {
                i = i2;
                f = m15476a;
            }
        }
        if (i >= 0) {
            return i;
        }
        throw C0438aw.m3194a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
    
        return;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m14870a(p000.C2531gz r3, int r4) {
        /*
            r2 = this;
            int r0 = r2.f12657a
            int r0 = r0 * 10
            if (r0 >= r4) goto L7
            goto L8
        L7:
            r0 = r4
        L8:
            int r4 = r4 + (-1)
        La:
            if (r0 <= 0) goto L1a
            if (r4 < 0) goto L1a
            boolean r1 = r3.m12048a(r4)
            if (r1 == 0) goto L15
            goto L1a
        L15:
            int r0 = r0 + (-1)
            int r4 = r4 + (-1)
            goto La
        L1a:
            if (r0 != 0) goto L1d
            return
        L1d:
            aw r3 = p000.C0438aw.m3194a()
            goto L23
        L22:
            throw r3
        L23:
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.q00.m14870a(gz, int):void");
    }

    /* renamed from: a */
    private static void m14871a(C2531gz c2531gz, int i, int i2, StringBuilder sb) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i < i2) {
            t00.m15477a(c2531gz, i, iArr);
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = i3 * 2;
                iArr2[i3] = iArr[i4];
                iArr3[i3] = iArr[i4 + 1];
            }
            sb.append((char) (m14869a(iArr2) + 48));
            sb.append((char) (m14869a(iArr3) + 48));
            for (int i5 = 0; i5 < 10; i5++) {
                i += iArr[i5];
            }
        }
    }

    /* renamed from: c */
    private static int m14872c(C2531gz c2531gz) {
        int m12052c = c2531gz.m12052c();
        int m12050b = c2531gz.m12050b(0);
        if (m12050b != m12052c) {
            return m12050b;
        }
        throw C0438aw.m3194a();
    }

    /* renamed from: c */
    private static int[] m14873c(C2531gz c2531gz, int i, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int m12052c = c2531gz.m12052c();
        int i2 = i;
        boolean z = false;
        int i3 = 0;
        while (i < m12052c) {
            if (c2531gz.m12048a(i) ^ z) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                int i4 = length - 1;
                if (i3 != i4) {
                    i3++;
                } else {
                    if (t00.m15476a(iArr2, iArr, 0.78f) < 0.38f) {
                        return new int[]{i2, i};
                    }
                    i2 += iArr2[0] + iArr2[1];
                    int i5 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i4] = 0;
                    i3--;
                }
                iArr2[i3] = 1;
                z = !z;
            }
            i++;
        }
        throw C0438aw.m3194a();
    }

    @Override // p000.t00
    /* renamed from: a */
    public C2488fw mo11530a(int i, C2531gz c2531gz, Map<EnumC3412wv, ?> map) {
        boolean z;
        int[] m14875b = m14875b(c2531gz);
        int[] m14874a = m14874a(c2531gz);
        StringBuilder sb = new StringBuilder(20);
        m14871a(c2531gz, m14875b[1], m14874a[0], sb);
        String sb2 = sb.toString();
        int[] iArr = map != null ? (int[]) map.get(EnumC3412wv.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = f12653b;
        }
        int length = sb2.length();
        int length2 = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length2) {
                z = false;
                break;
            }
            int i4 = iArr[i2];
            if (length == i4) {
                z = true;
                break;
            }
            if (i4 > i3) {
                i3 = i4;
            }
            i2++;
        }
        if (!z && length > i3) {
            z = true;
        }
        if (!z) {
            throw C3452xv.m16518a();
        }
        float f = i;
        return new C2488fw(sb2, null, new C2568hw[]{new C2568hw(m14875b[1], f), new C2568hw(m14874a[0], f)}, EnumC3224sv.ITF);
    }

    /* renamed from: a */
    int[] m14874a(C2531gz c2531gz) {
        c2531gz.m12055g();
        try {
            int[] m14873c = m14873c(c2531gz, m14872c(c2531gz), f12655d);
            m14870a(c2531gz, m14873c[0]);
            int i = m14873c[0];
            m14873c[0] = c2531gz.m12052c() - m14873c[1];
            m14873c[1] = c2531gz.m12052c() - i;
            return m14873c;
        } finally {
            c2531gz.m12055g();
        }
    }

    /* renamed from: b */
    int[] m14875b(C2531gz c2531gz) {
        int[] m14873c = m14873c(c2531gz, m14872c(c2531gz), f12654c);
        this.f12657a = (m14873c[1] - m14873c[0]) / 4;
        m14870a(c2531gz, m14873c[0]);
        return m14873c;
    }
}
