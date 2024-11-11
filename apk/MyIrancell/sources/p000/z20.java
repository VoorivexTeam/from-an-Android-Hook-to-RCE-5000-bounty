package p000;

import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
final class z20 {

    /* renamed from: a */
    private static final char[] f14318a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', '$', '%', '*', '+', '-', '.', '/', ':'};

    /* renamed from: a */
    private static char m16710a(int i) {
        char[] cArr = f14318a;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw C3452xv.m16518a();
    }

    /* renamed from: a */
    private static int m16711a(C2793iz c2793iz) {
        int m13269a = c2793iz.m13269a(8);
        if ((m13269a & 128) == 0) {
            return m13269a & 127;
        }
        if ((m13269a & 192) == 128) {
            return c2793iz.m13269a(8) | ((m13269a & 63) << 8);
        }
        if ((m13269a & 224) == 192) {
            return c2793iz.m13269a(16) | ((m13269a & 31) << 16);
        }
        throw C3452xv.m16518a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e7 A[LOOP:0: B:2:0x001e->B:47:0x00e7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p000.C2878kz m16712a(byte[] r17, p000.f30 r18, p000.b30 r19, java.util.Map<p000.EnumC3412wv, ?> r20) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.z20.m16712a(byte[], f30, b30, java.util.Map):kz");
    }

    /* renamed from: a */
    private static void m16713a(C2793iz c2793iz, StringBuilder sb, int i) {
        if (i * 13 > c2793iz.m13268a()) {
            throw C3452xv.m16518a();
        }
        byte[] bArr = new byte[i * 2];
        int i2 = 0;
        while (i > 0) {
            int m13269a = c2793iz.m13269a(13);
            int i3 = (m13269a % 96) | ((m13269a / 96) << 8);
            int i4 = i3 + (i3 < 959 ? 41377 : 42657);
            bArr[i2] = (byte) ((i4 >> 8) & 255);
            bArr[i2 + 1] = (byte) (i4 & 255);
            i2 += 2;
            i--;
        }
        try {
            sb.append(new String(bArr, "GB2312"));
        } catch (UnsupportedEncodingException unused) {
            throw C3452xv.m16518a();
        }
    }

    /* renamed from: a */
    private static void m16714a(C2793iz c2793iz, StringBuilder sb, int i, EnumC2833jz enumC2833jz, Collection<byte[]> collection, Map<EnumC3412wv, ?> map) {
        if (i * 8 > c2793iz.m13268a()) {
            throw C3452xv.m16518a();
        }
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) c2793iz.m13269a(8);
        }
        try {
            sb.append(new String(bArr, enumC2833jz == null ? C3184rz.m15299a(bArr, map) : enumC2833jz.name()));
            collection.add(bArr);
        } catch (UnsupportedEncodingException unused) {
            throw C3452xv.m16518a();
        }
    }

    /* renamed from: a */
    private static void m16715a(C2793iz c2793iz, StringBuilder sb, int i, boolean z) {
        while (i > 1) {
            if (c2793iz.m13268a() < 11) {
                throw C3452xv.m16518a();
            }
            int m13269a = c2793iz.m13269a(11);
            sb.append(m16710a(m13269a / 45));
            sb.append(m16710a(m13269a % 45));
            i -= 2;
        }
        if (i == 1) {
            if (c2793iz.m13268a() < 6) {
                throw C3452xv.m16518a();
            }
            sb.append(m16710a(c2793iz.m13269a(6)));
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i2 = length + 1;
                        if (sb.charAt(i2) == '%') {
                            sb.deleteCharAt(i2);
                        }
                    }
                    sb.setCharAt(length, (char) 29);
                }
            }
        }
    }

    /* renamed from: b */
    private static void m16716b(C2793iz c2793iz, StringBuilder sb, int i) {
        if (i * 13 > c2793iz.m13268a()) {
            throw C3452xv.m16518a();
        }
        byte[] bArr = new byte[i * 2];
        int i2 = 0;
        while (i > 0) {
            int m13269a = c2793iz.m13269a(13);
            int i3 = (m13269a % 192) | ((m13269a / 192) << 8);
            int i4 = i3 + (i3 < 7936 ? 33088 : 49472);
            bArr[i2] = (byte) (i4 >> 8);
            bArr[i2 + 1] = (byte) i4;
            i2 += 2;
            i--;
        }
        try {
            sb.append(new String(bArr, "SJIS"));
        } catch (UnsupportedEncodingException unused) {
            throw C3452xv.m16518a();
        }
    }

    /* renamed from: c */
    private static void m16717c(C2793iz c2793iz, StringBuilder sb, int i) {
        int m13269a;
        while (i >= 3) {
            if (c2793iz.m13268a() < 10) {
                throw C3452xv.m16518a();
            }
            int m13269a2 = c2793iz.m13269a(10);
            if (m13269a2 >= 1000) {
                throw C3452xv.m16518a();
            }
            sb.append(m16710a(m13269a2 / 100));
            sb.append(m16710a((m13269a2 / 10) % 10));
            sb.append(m16710a(m13269a2 % 10));
            i -= 3;
        }
        if (i == 2) {
            if (c2793iz.m13268a() < 7) {
                throw C3452xv.m16518a();
            }
            int m13269a3 = c2793iz.m13269a(7);
            if (m13269a3 >= 100) {
                throw C3452xv.m16518a();
            }
            sb.append(m16710a(m13269a3 / 10));
            m13269a = m13269a3 % 10;
        } else {
            if (i != 1) {
                return;
            }
            if (c2793iz.m13268a() < 4) {
                throw C3452xv.m16518a();
            }
            m13269a = c2793iz.m13269a(4);
            if (m13269a >= 10) {
                throw C3452xv.m16518a();
            }
        }
        sb.append(m16710a(m13269a));
    }
}
