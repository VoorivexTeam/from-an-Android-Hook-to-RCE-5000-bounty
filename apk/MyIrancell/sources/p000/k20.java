package p000;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
final class k20 {

    /* renamed from: a */
    private static final char[] f11580a = {';', '<', '>', '@', '[', '\\', ']', '_', '`', '~', '!', '\r', '\t', ',', ':', '\n', '-', '.', '$', '/', '\"', '|', '*', '(', ')', '?', '{', '}', '\''};

    /* renamed from: b */
    private static final char[] f11581b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '&', '\r', '\t', ',', ':', '#', '-', '.', '$', '/', '+', '%', '*', '=', '^'};

    /* renamed from: c */
    private static final Charset f11582c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    private static final BigInteger[] f11583d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k20$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2838a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11584a;

        static {
            int[] iArr = new int[EnumC2839b.values().length];
            f11584a = iArr;
            try {
                iArr[EnumC2839b.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11584a[EnumC2839b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11584a[EnumC2839b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11584a[EnumC2839b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11584a[EnumC2839b.ALPHA_SHIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11584a[EnumC2839b.PUNCT_SHIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k20$b */
    /* loaded from: classes.dex */
    public enum EnumC2839b {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f11583d = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900L);
        f11583d[1] = valueOf;
        int i = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f11583d;
            if (i >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i] = bigIntegerArr2[i - 1].multiply(valueOf);
            i++;
        }
    }

    /* renamed from: a */
    private static int m13539a(int i, int[] iArr, Charset charset, int i2, StringBuilder sb) {
        int i3;
        int i4;
        int i5;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i6 = 922;
        int i7 = 923;
        int i8 = 928;
        int i9 = 902;
        long j = 900;
        if (i == 901) {
            int[] iArr2 = new int[6];
            i3 = i2 + 1;
            int i10 = iArr[i2];
            boolean z = false;
            loop0: while (true) {
                i4 = 0;
                long j2 = 0;
                while (i3 < iArr[0] && !z) {
                    int i11 = i4 + 1;
                    iArr2[i4] = i10;
                    j2 = (j2 * j) + i10;
                    int i12 = i3 + 1;
                    i10 = iArr[i3];
                    if (i10 == 900 || i10 == 901 || i10 == 902 || i10 == 924 || i10 == 928 || i10 == i7 || i10 == i6) {
                        i3 = i12 - 1;
                        i4 = i11;
                        i6 = 922;
                        i7 = 923;
                        j = 900;
                        z = true;
                    } else if (i11 % 5 != 0 || i11 <= 0) {
                        i3 = i12;
                        i4 = i11;
                        i6 = 922;
                        i7 = 923;
                        j = 900;
                    } else {
                        int i13 = 0;
                        while (i13 < 6) {
                            byteArrayOutputStream.write((byte) (j2 >> ((5 - i13) * 8)));
                            i13++;
                            i6 = 922;
                            i7 = 923;
                        }
                        i3 = i12;
                        j = 900;
                    }
                }
            }
            if (i3 != iArr[0] || i10 >= 900) {
                i5 = i4;
            } else {
                i5 = i4 + 1;
                iArr2[i4] = i10;
            }
            for (int i14 = 0; i14 < i5; i14++) {
                byteArrayOutputStream.write((byte) iArr2[i14]);
            }
        } else if (i == 924) {
            int i15 = i2;
            boolean z2 = false;
            int i16 = 0;
            long j3 = 0;
            while (i15 < iArr[0] && !z2) {
                int i17 = i15 + 1;
                int i18 = iArr[i15];
                if (i18 < 900) {
                    i16++;
                    j3 = (j3 * 900) + i18;
                    i15 = i17;
                } else {
                    if (i18 != 900 && i18 != 901 && i18 != i9 && i18 != 924 && i18 != i8) {
                        if (i18 != 923 && i18 != 922) {
                            i15 = i17;
                        }
                    }
                    i15 = i17 - 1;
                    z2 = true;
                }
                if (i16 % 5 == 0 && i16 > 0) {
                    for (int i19 = 0; i19 < 6; i19++) {
                        byteArrayOutputStream.write((byte) (j3 >> ((5 - i19) * 8)));
                    }
                    i16 = 0;
                    j3 = 0;
                }
                i8 = 928;
                i9 = 902;
            }
            i3 = i15;
        } else {
            i3 = i2;
        }
        sb.append(new String(byteArrayOutputStream.toByteArray(), charset));
        return i3;
    }

    /* renamed from: a */
    private static int m13540a(int[] iArr, int i, f20 f20Var) {
        if (i + 2 > iArr[0]) {
            throw C3452xv.m16518a();
        }
        int[] iArr2 = new int[2];
        int i2 = 0;
        while (i2 < 2) {
            iArr2[i2] = iArr[i];
            i2++;
            i++;
        }
        f20Var.m11668a(Integer.parseInt(m13542a(iArr2, 2)));
        StringBuilder sb = new StringBuilder();
        int m13545b = m13545b(iArr, i, sb);
        f20Var.m11669a(sb.toString());
        if (iArr[m13545b] != 923) {
            if (iArr[m13545b] != 922) {
                return m13545b;
            }
            f20Var.m11670a(true);
            return m13545b + 1;
        }
        int i3 = m13545b + 1;
        int[] iArr3 = new int[iArr[0] - i3];
        boolean z = false;
        int i4 = 0;
        while (i3 < iArr[0] && !z) {
            int i5 = i3 + 1;
            int i6 = iArr[i3];
            if (i6 < 900) {
                iArr3[i4] = i6;
                i3 = i5;
                i4++;
            } else {
                if (i6 != 922) {
                    throw C3452xv.m16518a();
                }
                f20Var.m11670a(true);
                i3 = i5 + 1;
                z = true;
            }
        }
        f20Var.m11671a(Arrays.copyOf(iArr3, i4));
        return i3;
    }

    /* renamed from: a */
    private static int m13541a(int[] iArr, int i, StringBuilder sb) {
        int[] iArr2 = new int[15];
        boolean z = false;
        int i2 = 0;
        while (i < iArr[0] && !z) {
            int i3 = i + 1;
            int i4 = iArr[i];
            if (i3 == iArr[0]) {
                z = true;
            }
            if (i4 < 900) {
                iArr2[i2] = i4;
                i2++;
            } else if (i4 == 900 || i4 == 901 || i4 == 924 || i4 == 928 || i4 == 923 || i4 == 922) {
                i3--;
                z = true;
            }
            if ((i2 % 15 == 0 || i4 == 902 || z) && i2 > 0) {
                sb.append(m13542a(iArr2, i2));
                i2 = 0;
            }
            i = i3;
        }
        return i;
    }

    /* renamed from: a */
    private static String m13542a(int[] iArr, int i) {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigInteger = bigInteger.add(f11583d[(i - i2) - 1].multiply(BigInteger.valueOf(iArr[i2])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw C3452xv.m16518a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x001f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p000.C2878kz m13543a(int[] r7, java.lang.String r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r7.length
            r2 = 2
            int r1 = r1 * 2
            r0.<init>(r1)
            java.nio.charset.Charset r1 = p000.k20.f11582c
            r3 = 1
            r3 = r7[r3]
            f20 r4 = new f20
            r4.<init>()
        L13:
            r5 = 0
            r5 = r7[r5]
            if (r2 >= r5) goto L71
            r5 = 913(0x391, float:1.28E-42)
            if (r3 == r5) goto L58
            switch(r3) {
                case 900: goto L53;
                case 901: goto L4e;
                case 902: goto L49;
                default: goto L1f;
            }
        L1f:
            switch(r3) {
                case 922: goto L44;
                case 923: goto L44;
                case 924: goto L4e;
                case 925: goto L41;
                case 926: goto L3e;
                case 927: goto L2a;
                case 928: goto L25;
                default: goto L22;
            }
        L22:
            int r2 = r2 + (-1)
            goto L53
        L25:
            int r2 = m13540a(r7, r2, r4)
            goto L61
        L2a:
            int r1 = r2 + 1
            r2 = r7[r2]
            jz r2 = p000.EnumC2833jz.getCharacterSetECIByValue(r2)
            java.lang.String r2 = r2.name()
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            r6 = r2
            r2 = r1
            r1 = r6
            goto L61
        L3e:
            int r2 = r2 + 2
            goto L61
        L41:
            int r2 = r2 + 1
            goto L61
        L44:
            xv r7 = p000.C3452xv.m16518a()
            throw r7
        L49:
            int r2 = m13541a(r7, r2, r0)
            goto L61
        L4e:
            int r2 = m13539a(r3, r7, r1, r2, r0)
            goto L61
        L53:
            int r2 = m13545b(r7, r2, r0)
            goto L61
        L58:
            int r3 = r2 + 1
            r2 = r7[r2]
            char r2 = (char) r2
            r0.append(r2)
            r2 = r3
        L61:
            int r3 = r7.length
            if (r2 >= r3) goto L6c
            int r3 = r2 + 1
            r2 = r7[r2]
            r6 = r3
            r3 = r2
            r2 = r6
            goto L13
        L6c:
            xv r7 = p000.C3452xv.m16518a()
            throw r7
        L71:
            int r7 = r0.length()
            if (r7 == 0) goto L85
            kz r7 = new kz
            java.lang.String r0 = r0.toString()
            r1 = 0
            r7.<init>(r1, r0, r1, r8)
            r7.m13755a(r4)
            return r7
        L85:
            xv r7 = p000.C3452xv.m16518a()
            goto L8b
        L8a:
            throw r7
        L8b:
            goto L8a
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.k20.m13543a(int[], java.lang.String):kz");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (r6 == 900) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r6 == 900) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        if (r6 == 900) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008c, code lost:
    
        if (r6 == 900) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ab, code lost:
    
        if (r6 == 900) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00cb, code lost:
    
        if (r6 == 900) goto L26;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0023. Please report as an issue. */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m13544a(int[] r16, int[] r17, int r18, java.lang.StringBuilder r19) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.k20.m13544a(int[], int[], int, java.lang.StringBuilder):void");
    }

    /* renamed from: b */
    private static int m13545b(int[] iArr, int i, StringBuilder sb) {
        int[] iArr2 = new int[(iArr[0] - i) * 2];
        int[] iArr3 = new int[(iArr[0] - i) * 2];
        boolean z = false;
        int i2 = 0;
        while (i < iArr[0] && !z) {
            int i3 = i + 1;
            int i4 = iArr[i];
            if (i4 < 900) {
                iArr2[i2] = i4 / 30;
                iArr2[i2 + 1] = i4 % 30;
                i2 += 2;
            } else if (i4 != 913) {
                if (i4 != 928) {
                    switch (i4) {
                        case 900:
                            iArr2[i2] = 900;
                            i2++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i4) {
                            }
                            break;
                    }
                }
                i3--;
                z = true;
            } else {
                iArr2[i2] = 913;
                i = i3 + 1;
                iArr3[i2] = iArr[i3];
                i2++;
            }
            i = i3;
        }
        m13544a(iArr2, iArr3, i2, sb);
        return i;
    }
}
