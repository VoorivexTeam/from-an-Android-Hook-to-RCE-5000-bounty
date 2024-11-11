package defpackage;

import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class y00 extends t00 {
    static final int[] d = {1, 1, 1};
    static final int[] e = {1, 1, 1, 1, 1};
    static final int[][] f;
    static final int[][] g;
    private final StringBuilder a = new StringBuilder(20);
    private final x00 b = new x00();
    private final p00 c = new p00();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f = iArr;
        int[][] iArr2 = new int[20];
        g = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            g[i] = iArr4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(gz gzVar, int[] iArr, int i, int[][] iArr2) {
        t00.a(gzVar, i, iArr);
        int length = iArr2.length;
        float f2 = 0.48f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float a = t00.a(iArr, iArr2[i3], 0.7f);
            if (a < f2) {
                i2 = i3;
                f2 = a;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw aw.a();
    }

    static boolean a(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt < 0 || charAt > 9) {
                throw xv.a();
            }
            i += charAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw xv.a();
            }
            i3 += charAt2;
        }
        return i3 % 10 == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int[] a(gz gzVar) {
        int[] iArr = new int[d.length];
        int[] iArr2 = null;
        boolean z = false;
        int i = 0;
        while (!z) {
            Arrays.fill(iArr, 0, d.length, 0);
            iArr2 = a(gzVar, i, false, d, iArr);
            int i2 = iArr2[0];
            int i3 = iArr2[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                z = gzVar.a(i4, i2, false);
            }
            i = i3;
        }
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int[] a(gz gzVar, int i, boolean z, int[] iArr) {
        return a(gzVar, i, z, iArr, new int[iArr.length]);
    }

    private static int[] a(gz gzVar, int i, boolean z, int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int c = gzVar.c();
        int c2 = z ? gzVar.c(i) : gzVar.b(i);
        boolean z2 = z;
        int i2 = 0;
        int i3 = c2;
        while (c2 < c) {
            if (gzVar.a(c2) ^ z2) {
                iArr2[i2] = iArr2[i2] + 1;
            } else {
                int i4 = length - 1;
                if (i2 != i4) {
                    i2++;
                } else {
                    if (t00.a(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{i3, c2};
                    }
                    i3 += iArr2[0] + iArr2[1];
                    int i5 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i4] = 0;
                    i2--;
                }
                iArr2[i2] = 1;
                z2 = !z2;
            }
            c2++;
        }
        throw aw.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int a(gz gzVar, int[] iArr, StringBuilder sb);

    @Override // defpackage.t00
    public fw a(int i, gz gzVar, Map<wv, ?> map) {
        return a(i, gzVar, a(gzVar), map);
    }

    public fw a(int i, gz gzVar, int[] iArr, Map<wv, ?> map) {
        int i2;
        String a;
        iw iwVar = map == null ? null : (iw) map.get(wv.NEED_RESULT_POINT_CALLBACK);
        boolean z = true;
        if (iwVar != null) {
            iwVar.a(new hw((iArr[0] + iArr[1]) / 2.0f, i));
        }
        StringBuilder sb = this.a;
        sb.setLength(0);
        int a2 = a(gzVar, iArr, sb);
        if (iwVar != null) {
            iwVar.a(new hw(a2, i));
        }
        int[] a3 = a(gzVar, a2);
        if (iwVar != null) {
            iwVar.a(new hw((a3[0] + a3[1]) / 2.0f, i));
        }
        int i3 = a3[1];
        int i4 = (i3 - a3[0]) + i3;
        if (i4 >= gzVar.c() || !gzVar.a(i3, i4, false)) {
            throw aw.a();
        }
        String sb2 = sb.toString();
        if (sb2.length() < 8) {
            throw xv.a();
        }
        if (!a(sb2)) {
            throw vv.a();
        }
        sv b = b();
        float f2 = i;
        fw fwVar = new fw(sb2, null, new hw[]{new hw((iArr[1] + iArr[0]) / 2.0f, f2), new hw((a3[1] + a3[0]) / 2.0f, f2)}, b);
        try {
            fw a4 = this.b.a(i, gzVar, a3[1]);
            fwVar.a(gw.UPC_EAN_EXTENSION, a4.e());
            fwVar.a(a4.c());
            fwVar.a(a4.d());
            i2 = a4.e().length();
        } catch (ew unused) {
            i2 = 0;
        }
        int[] iArr2 = map != null ? (int[]) map.get(wv.ALLOWED_EAN_EXTENSIONS) : null;
        if (iArr2 != null) {
            int length = iArr2.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    z = false;
                    break;
                }
                if (i2 == iArr2[i5]) {
                    break;
                }
                i5++;
            }
            if (!z) {
                throw aw.a();
            }
        }
        if ((b == sv.EAN_13 || b == sv.UPC_A) && (a = this.c.a(sb2)) != null) {
            fwVar.a(gw.POSSIBLE_COUNTRY, a);
        }
        return fwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(String str) {
        return a((CharSequence) str);
    }

    int[] a(gz gzVar, int i) {
        return a(gzVar, i, false, d);
    }

    abstract sv b();
}
