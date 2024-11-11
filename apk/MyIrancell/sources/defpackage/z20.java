package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
final class z20 {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', '$', '%', '*', '+', '-', '.', '/', ':'};

    private static char a(int i) {
        char[] cArr = a;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw xv.a();
    }

    private static int a(iz izVar) {
        int a2 = izVar.a(8);
        if ((a2 & 128) == 0) {
            return a2 & 127;
        }
        if ((a2 & 192) == 128) {
            return izVar.a(8) | ((a2 & 63) << 8);
        }
        if ((a2 & 224) == 192) {
            return izVar.a(16) | ((a2 & 31) << 16);
        }
        throw xv.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e7 A[LOOP:0: B:2:0x001e->B:47:0x00e7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.kz a(byte[] r17, defpackage.f30 r18, defpackage.b30 r19, java.util.Map<defpackage.wv, ?> r20) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z20.a(byte[], f30, b30, java.util.Map):kz");
    }

    private static void a(iz izVar, StringBuilder sb, int i) {
        if (i * 13 > izVar.a()) {
            throw xv.a();
        }
        byte[] bArr = new byte[i * 2];
        int i2 = 0;
        while (i > 0) {
            int a2 = izVar.a(13);
            int i3 = (a2 % 96) | ((a2 / 96) << 8);
            int i4 = i3 + (i3 < 959 ? 41377 : 42657);
            bArr[i2] = (byte) ((i4 >> 8) & 255);
            bArr[i2 + 1] = (byte) (i4 & 255);
            i2 += 2;
            i--;
        }
        try {
            sb.append(new String(bArr, "GB2312"));
        } catch (UnsupportedEncodingException unused) {
            throw xv.a();
        }
    }

    private static void a(iz izVar, StringBuilder sb, int i, jz jzVar, Collection<byte[]> collection, Map<wv, ?> map) {
        if (i * 8 > izVar.a()) {
            throw xv.a();
        }
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) izVar.a(8);
        }
        try {
            sb.append(new String(bArr, jzVar == null ? rz.a(bArr, map) : jzVar.name()));
            collection.add(bArr);
        } catch (UnsupportedEncodingException unused) {
            throw xv.a();
        }
    }

    private static void a(iz izVar, StringBuilder sb, int i, boolean z) {
        while (i > 1) {
            if (izVar.a() < 11) {
                throw xv.a();
            }
            int a2 = izVar.a(11);
            sb.append(a(a2 / 45));
            sb.append(a(a2 % 45));
            i -= 2;
        }
        if (i == 1) {
            if (izVar.a() < 6) {
                throw xv.a();
            }
            sb.append(a(izVar.a(6)));
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

    private static void b(iz izVar, StringBuilder sb, int i) {
        if (i * 13 > izVar.a()) {
            throw xv.a();
        }
        byte[] bArr = new byte[i * 2];
        int i2 = 0;
        while (i > 0) {
            int a2 = izVar.a(13);
            int i3 = (a2 % 192) | ((a2 / 192) << 8);
            int i4 = i3 + (i3 < 7936 ? 33088 : 49472);
            bArr[i2] = (byte) (i4 >> 8);
            bArr[i2 + 1] = (byte) i4;
            i2 += 2;
            i--;
        }
        try {
            sb.append(new String(bArr, "SJIS"));
        } catch (UnsupportedEncodingException unused) {
            throw xv.a();
        }
    }

    private static void c(iz izVar, StringBuilder sb, int i) {
        int a2;
        while (i >= 3) {
            if (izVar.a() < 10) {
                throw xv.a();
            }
            int a3 = izVar.a(10);
            if (a3 >= 1000) {
                throw xv.a();
            }
            sb.append(a(a3 / 100));
            sb.append(a((a3 / 10) % 10));
            sb.append(a(a3 % 10));
            i -= 3;
        }
        if (i == 2) {
            if (izVar.a() < 7) {
                throw xv.a();
            }
            int a4 = izVar.a(7);
            if (a4 >= 100) {
                throw xv.a();
            }
            sb.append(a(a4 / 10));
            a2 = a4 % 10;
        } else {
            if (i != 1) {
                return;
            }
            if (izVar.a() < 4) {
                throw xv.a();
            }
            a2 = izVar.a(4);
            if (a2 >= 10) {
                throw xv.a();
            }
        }
        sb.append(a(a2));
    }
}
