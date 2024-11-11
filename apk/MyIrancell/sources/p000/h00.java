package p000;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/* loaded from: classes.dex */
final class h00 {

    /* renamed from: a */
    private static final NumberFormat f10364a = new DecimalFormat("000000000");

    /* renamed from: b */
    private static final NumberFormat f10365b = new DecimalFormat("000");

    /* renamed from: c */
    private static final String[] f10366c = {"\nABCDEFGHIJKLMNOPQRSTUVWXYZ\ufffa\u001c\u001d\u001e\ufffb ￼\"#$%&'()*+,-./0123456789:\ufff1\ufff2\ufff3\ufff4\ufff8", "`abcdefghijklmnopqrstuvwxyz\ufffa\u001c\u001d\u001e\ufffb{￼}~\u007f;<=>?[\\]^_ ,./:@!|￼\ufff5\ufff6￼\ufff0\ufff2\ufff3\ufff4\ufff7", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ\ufffa\u001c\u001d\u001eÛÜÝÞßª¬±²³µ¹º¼½¾\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\ufff7 \ufff9\ufff3\ufff4\ufff8", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú\ufffa\u001c\u001d\u001e\ufffbûüýþÿ¡¨«¯°´·¸»¿\u008a\u008b\u008c\u008d\u008e\u008f\u0090\u0091\u0092\u0093\u0094\ufff7 \ufff2\ufff9\ufff4\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\ufffa￼￼\u001b\ufffb\u001c\u001d\u001e\u001f\u009f ¢£¤¥¦§©\u00ad®¶\u0095\u0096\u0097\u0098\u0099\u009a\u009b\u009c\u009d\u009e\ufff7 \ufff2\ufff3\ufff9\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?"};

    /* renamed from: a */
    private static int m12069a(int i, byte[] bArr) {
        int i2 = i - 1;
        return ((1 << (5 - (i2 % 6))) & bArr[i2 / 6]) == 0 ? 0 : 1;
    }

    /* renamed from: a */
    private static int m12070a(byte[] bArr) {
        return m12071a(bArr, new byte[]{53, 54, 43, 44, 45, 46, 47, 48, 37, 38});
    }

    /* renamed from: a */
    private static int m12071a(byte[] bArr, byte[] bArr2) {
        if (bArr2.length == 0) {
            throw new IllegalArgumentException();
        }
        int i = 0;
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            i += m12069a(bArr2[i2], bArr) << ((bArr2.length - i2) - 1);
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001a. Please report as an issue. */
    /* renamed from: a */
    private static String m12072a(byte[] bArr, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        int i3 = i;
        int i4 = 0;
        int i5 = -1;
        int i6 = 0;
        while (i3 < i + i2) {
            char charAt = f10366c[i4].charAt(bArr[i3]);
            switch (charAt) {
                case 65520:
                case 65521:
                case 65522:
                case 65523:
                case 65524:
                    i6 = i4;
                    i4 = charAt - 65520;
                    i5 = 1;
                    break;
                case 65525:
                    i5 = 2;
                    i6 = i4;
                    i4 = 0;
                    break;
                case 65526:
                    i5 = 3;
                    i6 = i4;
                    i4 = 0;
                    break;
                case 65527:
                    i4 = 0;
                    i5 = -1;
                    break;
                case 65528:
                    i4 = 1;
                    i5 = -1;
                    break;
                case 65529:
                    i5 = -1;
                    break;
                case 65530:
                default:
                    sb.append(charAt);
                    break;
                case 65531:
                    int i7 = i3 + 1;
                    int i8 = bArr[i7] << 24;
                    int i9 = i7 + 1;
                    int i10 = i8 + (bArr[i9] << 18);
                    int i11 = i9 + 1;
                    int i12 = i10 + (bArr[i11] << 12);
                    int i13 = i11 + 1;
                    int i14 = i12 + (bArr[i13] << 6);
                    i3 = i13 + 1;
                    sb.append(f10364a.format(i14 + bArr[i3]));
                    break;
            }
            int i15 = i5 - 1;
            if (i5 == 0) {
                i4 = i6;
            }
            i3++;
            i5 = i15;
        }
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == 65532) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2878kz m12073a(byte[] bArr, int i) {
        StringBuilder sb;
        int i2;
        StringBuilder sb2 = new StringBuilder(144);
        if (i == 2 || i == 3) {
            int i3 = 0;
            String format = i == 2 ? new DecimalFormat("0000000000".substring(0, m12075c(bArr))).format(m12074b(bArr)) : m12076d(bArr);
            String format2 = f10365b.format(m12070a(bArr));
            String format3 = f10365b.format(m12077e(bArr));
            sb2.append(m12072a(bArr, 10, 84));
            if (sb2.toString().startsWith("[)>\u001e01\u001d")) {
                i3 = 9;
                sb = new StringBuilder();
            } else {
                sb = new StringBuilder();
            }
            sb.append(format);
            sb.append((char) 29);
            sb.append(format2);
            sb.append((char) 29);
            sb.append(format3);
            sb.append((char) 29);
            sb2.insert(i3, sb.toString());
        } else {
            if (i != 4) {
                i2 = i == 5 ? 77 : 93;
            }
            sb2.append(m12072a(bArr, 1, i2));
        }
        return new C2878kz(bArr, sb2.toString(), null, String.valueOf(i));
    }

    /* renamed from: b */
    private static int m12074b(byte[] bArr) {
        return m12071a(bArr, new byte[]{33, 34, 35, 36, 25, 26, 27, 28, 29, 30, 19, 20, 21, 22, 23, 24, 13, 14, 15, 16, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2});
    }

    /* renamed from: c */
    private static int m12075c(byte[] bArr) {
        return m12071a(bArr, new byte[]{39, 40, 41, 42, 31, 32});
    }

    /* renamed from: d */
    private static String m12076d(byte[] bArr) {
        return String.valueOf(new char[]{f10366c[0].charAt(m12071a(bArr, new byte[]{39, 40, 41, 42, 31, 32})), f10366c[0].charAt(m12071a(bArr, new byte[]{33, 34, 35, 36, 25, 26})), f10366c[0].charAt(m12071a(bArr, new byte[]{27, 28, 29, 30, 19, 20})), f10366c[0].charAt(m12071a(bArr, new byte[]{21, 22, 23, 24, 13, 14})), f10366c[0].charAt(m12071a(bArr, new byte[]{15, 16, 17, 18, 7, 8})), f10366c[0].charAt(m12071a(bArr, new byte[]{9, 10, 11, 12, 1, 2}))});
    }

    /* renamed from: e */
    private static int m12077e(byte[] bArr) {
        return m12071a(bArr, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52});
    }
}
