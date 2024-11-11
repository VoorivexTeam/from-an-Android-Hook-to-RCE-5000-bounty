package p000;

import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v00 {

    /* renamed from: a */
    private final int[] f13535a = new int[4];

    /* renamed from: b */
    private final StringBuilder f13536b = new StringBuilder();

    /* renamed from: a */
    private static Map<EnumC2528gw, Object> m15891a(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(EnumC2528gw.class);
        enumMap.put((EnumMap) EnumC2528gw.ISSUE_NUMBER, (EnumC2528gw) Integer.valueOf(str));
        return enumMap;
    }

    /* renamed from: a */
    int m15892a(C2531gz c2531gz, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f13535a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m12052c = c2531gz.m12052c();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 2 && i < m12052c; i3++) {
            int m16536a = y00.m16536a(c2531gz, iArr2, i, y00.f14086g);
            sb.append((char) ((m16536a % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (m16536a >= 10) {
                i2 |= 1 << (1 - i3);
            }
            if (i3 != 1) {
                i = c2531gz.m12053c(c2531gz.m12050b(i));
            }
        }
        if (sb.length() != 2) {
            throw C0438aw.m3194a();
        }
        if (Integer.parseInt(sb.toString()) % 4 == i2) {
            return i;
        }
        throw C0438aw.m3194a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C2488fw m15893a(int i, C2531gz c2531gz, int[] iArr) {
        StringBuilder sb = this.f13536b;
        sb.setLength(0);
        int m15892a = m15892a(c2531gz, iArr, sb);
        String sb2 = sb.toString();
        Map<EnumC2528gw, Object> m15891a = m15891a(sb2);
        float f = i;
        C2488fw c2488fw = new C2488fw(sb2, null, new C2568hw[]{new C2568hw((iArr[0] + iArr[1]) / 2.0f, f), new C2568hw(m15892a, f)}, EnumC3224sv.UPC_EAN_EXTENSION);
        if (m15891a != null) {
            c2488fw.m11837a(m15891a);
        }
        return c2488fw;
    }
}
