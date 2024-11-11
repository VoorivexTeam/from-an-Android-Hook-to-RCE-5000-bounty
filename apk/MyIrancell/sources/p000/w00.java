package p000;

import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w00 {

    /* renamed from: c */
    private static final int[] f13729c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: a */
    private final int[] f13730a = new int[4];

    /* renamed from: b */
    private final StringBuilder f13731b = new StringBuilder();

    /* renamed from: a */
    private static int m16098a(int i) {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f13729c[i2]) {
                return i2;
            }
        }
        throw C0438aw.m3194a();
    }

    /* renamed from: a */
    private static int m16099a(CharSequence charSequence) {
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

    /* renamed from: a */
    private static String m16100a(String str) {
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

    /* renamed from: b */
    private static Map<EnumC2528gw, Object> m16101b(String str) {
        String m16100a;
        if (str.length() != 5 || (m16100a = m16100a(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(EnumC2528gw.class);
        enumMap.put((EnumMap) EnumC2528gw.SUGGESTED_PRICE, (EnumC2528gw) m16100a);
        return enumMap;
    }

    /* renamed from: a */
    int m16102a(C2531gz c2531gz, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f13730a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m12052c = c2531gz.m12052c();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 5 && i < m12052c; i3++) {
            int m16536a = y00.m16536a(c2531gz, iArr2, i, y00.f14086g);
            sb.append((char) ((m16536a % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (m16536a >= 10) {
                i2 |= 1 << (4 - i3);
            }
            if (i3 != 4) {
                i = c2531gz.m12053c(c2531gz.m12050b(i));
            }
        }
        if (sb.length() != 5) {
            throw C0438aw.m3194a();
        }
        if (m16099a((CharSequence) sb.toString()) == m16098a(i2)) {
            return i;
        }
        throw C0438aw.m3194a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C2488fw m16103a(int i, C2531gz c2531gz, int[] iArr) {
        StringBuilder sb = this.f13731b;
        sb.setLength(0);
        int m16102a = m16102a(c2531gz, iArr, sb);
        String sb2 = sb.toString();
        Map<EnumC2528gw, Object> m16101b = m16101b(sb2);
        float f = i;
        C2488fw c2488fw = new C2488fw(sb2, null, new C2568hw[]{new C2568hw((iArr[0] + iArr[1]) / 2.0f, f), new C2568hw(m16102a, f)}, EnumC3224sv.UPC_EAN_EXTENSION);
        if (m16101b != null) {
            c2488fw.m11837a(m16101b);
        }
        return c2488fw;
    }
}
