package defpackage;

import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v00 {
    private final int[] a = new int[4];
    private final StringBuilder b = new StringBuilder();

    private static Map<gw, Object> a(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(gw.class);
        enumMap.put((EnumMap) gw.ISSUE_NUMBER, (gw) Integer.valueOf(str));
        return enumMap;
    }

    int a(gz gzVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int c = gzVar.c();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 2 && i < c; i3++) {
            int a = y00.a(gzVar, iArr2, i, y00.g);
            sb.append((char) ((a % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (a >= 10) {
                i2 |= 1 << (1 - i3);
            }
            if (i3 != 1) {
                i = gzVar.c(gzVar.b(i));
            }
        }
        if (sb.length() != 2) {
            throw aw.a();
        }
        if (Integer.parseInt(sb.toString()) % 4 == i2) {
            return i;
        }
        throw aw.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public fw a(int i, gz gzVar, int[] iArr) {
        StringBuilder sb = this.b;
        sb.setLength(0);
        int a = a(gzVar, iArr, sb);
        String sb2 = sb.toString();
        Map<gw, Object> a2 = a(sb2);
        float f = i;
        fw fwVar = new fw(sb2, null, new hw[]{new hw((iArr[0] + iArr[1]) / 2.0f, f), new hw(a, f)}, sv.UPC_EAN_EXTENSION);
        if (a2 != null) {
            fwVar.a(a2);
        }
        return fwVar;
    }
}
