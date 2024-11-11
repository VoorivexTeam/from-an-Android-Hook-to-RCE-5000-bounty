package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class q00 extends t00 {
    private static final int[] b = {6, 8, 10, 12, 14};
    private static final int[] c = {1, 1, 1, 1};
    private static final int[] d = {1, 1, 3};
    static final int[][] e = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};
    private int a = -1;

    private static int a(int[] iArr) {
        int length = e.length;
        float f = 0.38f;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            float a = t00.a(iArr, e[i2], 0.78f);
            if (a < f) {
                i = i2;
                f = a;
            }
        }
        if (i >= 0) {
            return i;
        }
        throw aw.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(defpackage.gz r3, int r4) {
        /*
            r2 = this;
            int r0 = r2.a
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
            boolean r1 = r3.a(r4)
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
            aw r3 = defpackage.aw.a()
            goto L23
        L22:
            throw r3
        L23:
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q00.a(gz, int):void");
    }

    private static void a(gz gzVar, int i, int i2, StringBuilder sb) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i < i2) {
            t00.a(gzVar, i, iArr);
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = i3 * 2;
                iArr2[i3] = iArr[i4];
                iArr3[i3] = iArr[i4 + 1];
            }
            sb.append((char) (a(iArr2) + 48));
            sb.append((char) (a(iArr3) + 48));
            for (int i5 = 0; i5 < 10; i5++) {
                i += iArr[i5];
            }
        }
    }

    private static int c(gz gzVar) {
        int c2 = gzVar.c();
        int b2 = gzVar.b(0);
        if (b2 != c2) {
            return b2;
        }
        throw aw.a();
    }

    private static int[] c(gz gzVar, int i, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int c2 = gzVar.c();
        int i2 = i;
        boolean z = false;
        int i3 = 0;
        while (i < c2) {
            if (gzVar.a(i) ^ z) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                int i4 = length - 1;
                if (i3 != i4) {
                    i3++;
                } else {
                    if (t00.a(iArr2, iArr, 0.78f) < 0.38f) {
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
        throw aw.a();
    }

    @Override // defpackage.t00
    public fw a(int i, gz gzVar, Map<wv, ?> map) {
        boolean z;
        int[] b2 = b(gzVar);
        int[] a = a(gzVar);
        StringBuilder sb = new StringBuilder(20);
        a(gzVar, b2[1], a[0], sb);
        String sb2 = sb.toString();
        int[] iArr = map != null ? (int[]) map.get(wv.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = b;
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
            throw xv.a();
        }
        float f = i;
        return new fw(sb2, null, new hw[]{new hw(b2[1], f), new hw(a[0], f)}, sv.ITF);
    }

    int[] a(gz gzVar) {
        gzVar.g();
        try {
            int[] c2 = c(gzVar, c(gzVar), d);
            a(gzVar, c2[0]);
            int i = c2[0];
            c2[0] = gzVar.c() - c2[1];
            c2[1] = gzVar.c() - i;
            return c2;
        } finally {
            gzVar.g();
        }
    }

    int[] b(gz gzVar) {
        int[] c2 = c(gzVar, c(gzVar), c);
        this.a = (c2[1] - c2[0]) / 4;
        a(gzVar, c2[0]);
        return c2;
    }
}
