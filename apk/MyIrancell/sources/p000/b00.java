package p000;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
final class b00 {

    /* renamed from: b */
    private static final char[] f2697b;

    /* renamed from: d */
    private static final char[] f2699d;

    /* renamed from: a */
    private static final char[] f2696a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* renamed from: c */
    private static final char[] f2698c = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /* renamed from: e */
    private static final char[] f2700e = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};

    /* renamed from: b00$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0444a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2701a;

        static {
            int[] iArr = new int[EnumC0445b.values().length];
            f2701a = iArr;
            try {
                iArr[EnumC0445b.C40_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2701a[EnumC0445b.TEXT_ENCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2701a[EnumC0445b.ANSIX12_ENCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2701a[EnumC0445b.EDIFACT_ENCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2701a[EnumC0445b.BASE256_ENCODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b00$b */
    /* loaded from: classes.dex */
    public enum EnumC0445b {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};
        f2697b = cArr;
        f2699d = cArr;
    }

    /* renamed from: a */
    private static int m3259a(int i, int i2) {
        int i3 = i - (((i2 * 149) % 255) + 1);
        return i3 >= 0 ? i3 : i3 + 256;
    }

    /* renamed from: a */
    private static EnumC0445b m3260a(C2793iz c2793iz, StringBuilder sb, StringBuilder sb2) {
        String str;
        boolean z = false;
        do {
            int m13269a = c2793iz.m13269a(8);
            if (m13269a == 0) {
                throw C3452xv.m16518a();
            }
            if (m13269a <= 128) {
                if (z) {
                    m13269a += 128;
                }
                sb.append((char) (m13269a - 1));
                return EnumC0445b.ASCII_ENCODE;
            }
            if (m13269a == 129) {
                return EnumC0445b.PAD_ENCODE;
            }
            if (m13269a <= 229) {
                int i = m13269a - 130;
                if (i < 10) {
                    sb.append('0');
                }
                sb.append(i);
            } else {
                if (m13269a == 230) {
                    return EnumC0445b.C40_ENCODE;
                }
                if (m13269a == 231) {
                    return EnumC0445b.BASE256_ENCODE;
                }
                if (m13269a == 232) {
                    sb.append((char) 29);
                } else if (m13269a != 233 && m13269a != 234) {
                    if (m13269a == 235) {
                        z = true;
                    } else {
                        if (m13269a == 236) {
                            str = "[)>\u001e05\u001d";
                        } else if (m13269a == 237) {
                            str = "[)>\u001e06\u001d";
                        } else {
                            if (m13269a == 238) {
                                return EnumC0445b.ANSIX12_ENCODE;
                            }
                            if (m13269a == 239) {
                                return EnumC0445b.TEXT_ENCODE;
                            }
                            if (m13269a == 240) {
                                return EnumC0445b.EDIFACT_ENCODE;
                            }
                            if (m13269a != 241 && m13269a >= 242 && (m13269a != 254 || c2793iz.m13268a() != 0)) {
                                throw C3452xv.m16518a();
                            }
                        }
                        sb.append(str);
                        sb2.insert(0, "\u001e\u0004");
                    }
                }
            }
        } while (c2793iz.m13268a() > 0);
        return EnumC0445b.ASCII_ENCODE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2878kz m3261a(byte[] bArr) {
        C2793iz c2793iz = new C2793iz(bArr);
        StringBuilder sb = new StringBuilder(100);
        StringBuilder sb2 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        EnumC0445b enumC0445b = EnumC0445b.ASCII_ENCODE;
        do {
            if (enumC0445b == EnumC0445b.ASCII_ENCODE) {
                enumC0445b = m3260a(c2793iz, sb, sb2);
            } else {
                int i = C0444a.f2701a[enumC0445b.ordinal()];
                if (i == 1) {
                    m3265b(c2793iz, sb);
                } else if (i == 2) {
                    m3267d(c2793iz, sb);
                } else if (i == 3) {
                    m3263a(c2793iz, sb);
                } else if (i == 4) {
                    m3266c(c2793iz, sb);
                } else {
                    if (i != 5) {
                        throw C3452xv.m16518a();
                    }
                    m3264a(c2793iz, sb, arrayList);
                }
                enumC0445b = EnumC0445b.ASCII_ENCODE;
            }
            if (enumC0445b == EnumC0445b.PAD_ENCODE) {
                break;
            }
        } while (c2793iz.m13268a() > 0);
        if (sb2.length() > 0) {
            sb.append((CharSequence) sb2);
        }
        String sb3 = sb.toString();
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new C2878kz(bArr, sb3, arrayList, null);
    }

    /* renamed from: a */
    private static void m3262a(int i, int i2, int[] iArr) {
        int i3 = ((i << 8) + i2) - 1;
        int i4 = i3 / 1600;
        iArr[0] = i4;
        int i5 = i3 - (i4 * 1600);
        int i6 = i5 / 40;
        iArr[1] = i6;
        iArr[2] = i5 - (i6 * 40);
    }

    /* renamed from: a */
    private static void m3263a(C2793iz c2793iz, StringBuilder sb) {
        int m13269a;
        int i;
        char c;
        int[] iArr = new int[3];
        while (c2793iz.m13268a() != 8 && (m13269a = c2793iz.m13269a(8)) != 254) {
            m3262a(m13269a, c2793iz.m13269a(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i3 == 0) {
                    c = '\r';
                } else if (i3 == 1) {
                    c = '*';
                } else if (i3 == 2) {
                    c = '>';
                } else if (i3 == 3) {
                    c = ' ';
                } else {
                    if (i3 < 14) {
                        i = i3 + 44;
                    } else {
                        if (i3 >= 40) {
                            throw C3452xv.m16518a();
                        }
                        i = i3 + 51;
                    }
                    c = (char) i;
                }
                sb.append(c);
            }
            if (c2793iz.m13268a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m3264a(C2793iz c2793iz, StringBuilder sb, Collection<byte[]> collection) {
        int m13271c = c2793iz.m13271c() + 1;
        int i = m13271c + 1;
        int m3259a = m3259a(c2793iz.m13269a(8), m13271c);
        if (m3259a == 0) {
            m3259a = c2793iz.m13268a() / 8;
        } else if (m3259a >= 250) {
            m3259a = ((m3259a - 249) * 250) + m3259a(c2793iz.m13269a(8), i);
            i++;
        }
        if (m3259a < 0) {
            throw C3452xv.m16518a();
        }
        byte[] bArr = new byte[m3259a];
        int i2 = 0;
        while (i2 < m3259a) {
            if (c2793iz.m13268a() < 8) {
                throw C3452xv.m16518a();
            }
            bArr[i2] = (byte) m3259a(c2793iz.m13269a(8), i);
            i2++;
            i++;
        }
        collection.add(bArr);
        try {
            sb.append(new String(bArr, "ISO8859_1"));
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("Platform does not support required encoding: " + e);
        }
    }

    /* renamed from: b */
    private static void m3265b(C2793iz c2793iz, StringBuilder sb) {
        int m13269a;
        int i;
        char c;
        char c2;
        int[] iArr = new int[3];
        boolean z = false;
        int i2 = 0;
        while (c2793iz.m13268a() != 8 && (m13269a = c2793iz.m13269a(8)) != 254) {
            m3262a(m13269a, c2793iz.m13269a(8), iArr);
            for (int i3 = 0; i3 < 3; i3++) {
                int i4 = iArr[i3];
                if (i2 != 0) {
                    if (i2 == 1) {
                        if (z) {
                            i = i4 + 128;
                            c2 = (char) i;
                            sb.append(c2);
                            z = false;
                        }
                        c = (char) i4;
                        sb.append(c);
                    } else if (i2 == 2) {
                        char[] cArr = f2697b;
                        if (i4 < cArr.length) {
                            c = cArr[i4];
                            if (z) {
                                c2 = (char) (c + 128);
                                sb.append(c2);
                                z = false;
                            }
                        } else if (i4 == 27) {
                            c = 29;
                        } else {
                            if (i4 != 30) {
                                throw C3452xv.m16518a();
                            }
                            z = true;
                        }
                        sb.append(c);
                    } else {
                        if (i2 != 3) {
                            throw C3452xv.m16518a();
                        }
                        if (z) {
                            i = i4 + 224;
                            c2 = (char) i;
                            sb.append(c2);
                            z = false;
                        } else {
                            i4 += 96;
                            c = (char) i4;
                            sb.append(c);
                        }
                    }
                    i2 = 0;
                } else if (i4 < 3) {
                    i2 = i4 + 1;
                } else {
                    char[] cArr2 = f2696a;
                    if (i4 >= cArr2.length) {
                        throw C3452xv.m16518a();
                    }
                    char c3 = cArr2[i4];
                    if (z) {
                        sb.append((char) (c3 + 128));
                        z = false;
                    } else {
                        sb.append(c3);
                    }
                }
            }
            if (c2793iz.m13268a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: c */
    private static void m3266c(C2793iz c2793iz, StringBuilder sb) {
        while (c2793iz.m13268a() > 16) {
            for (int i = 0; i < 4; i++) {
                int m13269a = c2793iz.m13269a(6);
                if (m13269a == 31) {
                    int m13270b = 8 - c2793iz.m13270b();
                    if (m13270b != 8) {
                        c2793iz.m13269a(m13270b);
                        return;
                    }
                    return;
                }
                if ((m13269a & 32) == 0) {
                    m13269a |= 64;
                }
                sb.append((char) m13269a);
            }
            if (c2793iz.m13268a() <= 0) {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if (r3 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        r3 = (char) (r4 + 128);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004c, code lost:
    
        if (r3 != false) goto L22;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m3267d(p000.C2793iz r9, java.lang.StringBuilder r10) {
        /*
            r0 = 3
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 0
            r4 = 0
        L6:
            int r5 = r9.m13268a()
            r6 = 8
            if (r5 != r6) goto Lf
            return
        Lf:
            int r5 = r9.m13269a(r6)
            r7 = 254(0xfe, float:3.56E-43)
            if (r5 != r7) goto L18
            return
        L18:
            int r6 = r9.m13269a(r6)
            m3262a(r5, r6, r1)
            r5 = 0
        L20:
            if (r5 >= r0) goto L93
            r6 = r1[r5]
            if (r4 == 0) goto L71
            r7 = 1
            if (r4 == r7) goto L61
            r8 = 2
            if (r4 == r8) goto L45
            if (r4 != r0) goto L40
            char[] r4 = p000.b00.f2700e
            int r7 = r4.length
            if (r6 >= r7) goto L3b
            char r4 = r4[r6]
            if (r3 == 0) goto L6c
        L37:
            int r4 = r4 + 128
            char r3 = (char) r4
            goto L66
        L3b:
            xv r9 = p000.C3452xv.m16518a()
            throw r9
        L40:
            xv r9 = p000.C3452xv.m16518a()
            throw r9
        L45:
            char[] r4 = p000.b00.f2699d
            int r8 = r4.length
            if (r6 >= r8) goto L4f
            char r4 = r4[r6]
            if (r3 == 0) goto L6c
            goto L37
        L4f:
            r4 = 27
            if (r6 != r4) goto L56
            r4 = 29
            goto L6c
        L56:
            r3 = 30
            if (r6 != r3) goto L5c
            r3 = 1
            goto L6f
        L5c:
            xv r9 = p000.C3452xv.m16518a()
            throw r9
        L61:
            if (r3 == 0) goto L6b
            int r6 = r6 + 128
            char r3 = (char) r6
        L66:
            r10.append(r3)
            r3 = 0
            goto L6f
        L6b:
            char r4 = (char) r6
        L6c:
            r10.append(r4)
        L6f:
            r4 = 0
            goto L8b
        L71:
            if (r6 >= r0) goto L77
            int r6 = r6 + 1
            r4 = r6
            goto L8b
        L77:
            char[] r7 = p000.b00.f2698c
            int r8 = r7.length
            if (r6 >= r8) goto L8e
            char r6 = r7[r6]
            if (r3 == 0) goto L88
            int r6 = r6 + 128
            char r3 = (char) r6
            r10.append(r3)
            r3 = 0
            goto L8b
        L88:
            r10.append(r6)
        L8b:
            int r5 = r5 + 1
            goto L20
        L8e:
            xv r9 = p000.C3452xv.m16518a()
            throw r9
        L93:
            int r5 = r9.m13268a()
            if (r5 > 0) goto L6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.b00.m3267d(iz, java.lang.StringBuilder):void");
    }
}
