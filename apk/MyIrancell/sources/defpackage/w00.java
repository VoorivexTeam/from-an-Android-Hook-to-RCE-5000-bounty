package defpackage;

import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w00 {
    private static final int[] c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};
    private final int[] a = new int[4];
    private final StringBuilder b = new StringBuilder();

    private static int a(int i) {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == c[i2]) {
                return i2;
            }
        }
        throw aw.a();
    }

    private static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            i += charSequence.charAt(i2) - '0';
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            i3 += charSequence.charAt(i4) - '0';
        }
        return (i3 * 3) % 10;
    }

    private static String a(String str) {
        String valueOf;
        char charAt = str.charAt(0);
        String str2 = "";
        if (charAt == '0') {
            str2 = "£";
        } else if (charAt == '5') {
            str2 = "$";
        } else if (charAt == '9') {
            if ("90000".equals(str)) {
                return null;
            }
            if ("99991".equals(str)) {
                return "0.00";
            }
            if ("99990".equals(str)) {
                return "Used";
            }
        }
        int parseInt = Integer.parseInt(str.substring(1));
        String valueOf2 = String.valueOf(parseInt / 100);
        int i = parseInt % 100;
        if (i < 10) {
            valueOf = "0" + i;
        } else {
            valueOf = String.valueOf(i);
        }
        return str2 + valueOf2 + '.' + valueOf;
    }

    private static Map<gw, Object> b(String str) {
        String a;
        if (str.length() != 5 || (a = a(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(gw.class);
        enumMap.put((EnumMap) gw.SUGGESTED_PRICE, (gw) a);
        return enumMap;
    }

    int a(gz gzVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int c2 = gzVar.c();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 5 && i < c2; i3++) {
            int a = y00.a(gzVar, iArr2, i, y00.g);
            sb.append((char) ((a % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (a >= 10) {
                i2 |= 1 << (4 - i3);
            }
            if (i3 != 4) {
                i = gzVar.c(gzVar.b(i));
            }
        }
        if (sb.length() != 5) {
            throw aw.a();
        }
        if (a((CharSequence) sb.toString()) == a(i2)) {
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
        Map<gw, Object> b = b(sb2);
        float f = i;
        fw fwVar = new fw(sb2, null, new hw[]{new hw((iArr[0] + iArr[1]) / 2.0f, f), new hw(a, f)}, sv.UPC_EAN_EXTENSION);
        if (b != null) {
            fwVar.a(b);
        }
        return fwVar;
    }
}
