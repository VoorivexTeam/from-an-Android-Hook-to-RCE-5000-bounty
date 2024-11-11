package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
final class b00 {
    private static final char[] b;
    private static final char[] d;
    private static final char[] a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private static final char[] c = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private static final char[] e = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};

    /* loaded from: classes.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.C40_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.TEXT_ENCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.ANSIX12_ENCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.EDIFACT_ENCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.BASE256_ENCODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum b {
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
        b = cArr;
        d = cArr;
    }

    private static int a(int i, int i2) {
        int i3 = i - (((i2 * 149) % 255) + 1);
        return i3 >= 0 ? i3 : i3 + 256;
    }

    private static b a(iz izVar, StringBuilder sb, StringBuilder sb2) {
        String str;
        boolean z = false;
        do {
            int a2 = izVar.a(8);
            if (a2 == 0) {
                throw xv.a();
            }
            if (a2 <= 128) {
                if (z) {
                    a2 += 128;
                }
                sb.append((char) (a2 - 1));
                return b.ASCII_ENCODE;
            }
            if (a2 == 129) {
                return b.PAD_ENCODE;
            }
            if (a2 <= 229) {
                int i = a2 - 130;
                if (i < 10) {
                    sb.append('0');
                }
                sb.append(i);
            } else {
                if (a2 == 230) {
                    return b.C40_ENCODE;
                }
                if (a2 == 231) {
                    return b.BASE256_ENCODE;
                }
                if (a2 == 232) {
                    sb.append((char) 29);
                } else if (a2 != 233 && a2 != 234) {
                    if (a2 == 235) {
                        z = true;
                    } else {
                        if (a2 == 236) {
                            str = "[)>\u001e05\u001d";
                        } else if (a2 == 237) {
                            str = "[)>\u001e06\u001d";
                        } else {
                            if (a2 == 238) {
                                return b.ANSIX12_ENCODE;
                            }
                            if (a2 == 239) {
                                return b.TEXT_ENCODE;
                            }
                            if (a2 == 240) {
                                return b.EDIFACT_ENCODE;
                            }
                            if (a2 != 241 && a2 >= 242 && (a2 != 254 || izVar.a() != 0)) {
                                throw xv.a();
                            }
                        }
                        sb.append(str);
                        sb2.insert(0, "\u001e\u0004");
                    }
                }
            }
        } while (izVar.a() > 0);
        return b.ASCII_ENCODE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static kz a(byte[] bArr) {
        iz izVar = new iz(bArr);
        StringBuilder sb = new StringBuilder(100);
        StringBuilder sb2 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        b bVar = b.ASCII_ENCODE;
        do {
            if (bVar == b.ASCII_ENCODE) {
                bVar = a(izVar, sb, sb2);
            } else {
                int i = a.a[bVar.ordinal()];
                if (i == 1) {
                    b(izVar, sb);
                } else if (i == 2) {
                    d(izVar, sb);
                } else if (i == 3) {
                    a(izVar, sb);
                } else if (i == 4) {
                    c(izVar, sb);
                } else {
                    if (i != 5) {
                        throw xv.a();
                    }
                    a(izVar, sb, arrayList);
                }
                bVar = b.ASCII_ENCODE;
            }
            if (bVar == b.PAD_ENCODE) {
                break;
            }
        } while (izVar.a() > 0);
        if (sb2.length() > 0) {
            sb.append((CharSequence) sb2);
        }
        String sb3 = sb.toString();
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new kz(bArr, sb3, arrayList, null);
    }

    private static void a(int i, int i2, int[] iArr) {
        int i3 = ((i << 8) + i2) - 1;
        int i4 = i3 / 1600;
        iArr[0] = i4;
        int i5 = i3 - (i4 * 1600);
        int i6 = i5 / 40;
        iArr[1] = i6;
        iArr[2] = i5 - (i6 * 40);
    }

    private static void a(iz izVar, StringBuilder sb) {
        int a2;
        int i;
        char c2;
        int[] iArr = new int[3];
        while (izVar.a() != 8 && (a2 = izVar.a(8)) != 254) {
            a(a2, izVar.a(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i3 == 0) {
                    c2 = '\r';
                } else if (i3 == 1) {
                    c2 = '*';
                } else if (i3 == 2) {
                    c2 = '>';
                } else if (i3 == 3) {
                    c2 = ' ';
                } else {
                    if (i3 < 14) {
                        i = i3 + 44;
                    } else {
                        if (i3 >= 40) {
                            throw xv.a();
                        }
                        i = i3 + 51;
                    }
                    c2 = (char) i;
                }
                sb.append(c2);
            }
            if (izVar.a() <= 0) {
                return;
            }
        }
    }

    private static void a(iz izVar, StringBuilder sb, Collection<byte[]> collection) {
        int c2 = izVar.c() + 1;
        int i = c2 + 1;
        int a2 = a(izVar.a(8), c2);
        if (a2 == 0) {
            a2 = izVar.a() / 8;
        } else if (a2 >= 250) {
            a2 = ((a2 - 249) * 250) + a(izVar.a(8), i);
            i++;
        }
        if (a2 < 0) {
            throw xv.a();
        }
        byte[] bArr = new byte[a2];
        int i2 = 0;
        while (i2 < a2) {
            if (izVar.a() < 8) {
                throw xv.a();
            }
            bArr[i2] = (byte) a(izVar.a(8), i);
            i2++;
            i++;
        }
        collection.add(bArr);
        try {
            sb.append(new String(bArr, "ISO8859_1"));
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalStateException("Platform does not support required encoding: " + e2);
        }
    }

    private static void b(iz izVar, StringBuilder sb) {
        int a2;
        int i;
        char c2;
        char c3;
        int[] iArr = new int[3];
        boolean z = false;
        int i2 = 0;
        while (izVar.a() != 8 && (a2 = izVar.a(8)) != 254) {
            a(a2, izVar.a(8), iArr);
            for (int i3 = 0; i3 < 3; i3++) {
                int i4 = iArr[i3];
                if (i2 != 0) {
                    if (i2 == 1) {
                        if (z) {
                            i = i4 + 128;
                            c3 = (char) i;
                            sb.append(c3);
                            z = false;
                        }
                        c2 = (char) i4;
                        sb.append(c2);
                    } else if (i2 == 2) {
                        char[] cArr = b;
                        if (i4 < cArr.length) {
                            c2 = cArr[i4];
                            if (z) {
                                c3 = (char) (c2 + 128);
                                sb.append(c3);
                                z = false;
                            }
                        } else if (i4 == 27) {
                            c2 = 29;
                        } else {
                            if (i4 != 30) {
                                throw xv.a();
                            }
                            z = true;
                        }
                        sb.append(c2);
                    } else {
                        if (i2 != 3) {
                            throw xv.a();
                        }
                        if (z) {
                            i = i4 + 224;
                            c3 = (char) i;
                            sb.append(c3);
                            z = false;
                        } else {
                            i4 += 96;
                            c2 = (char) i4;
                            sb.append(c2);
                        }
                    }
                    i2 = 0;
                } else if (i4 < 3) {
                    i2 = i4 + 1;
                } else {
                    char[] cArr2 = a;
                    if (i4 >= cArr2.length) {
                        throw xv.a();
                    }
                    char c4 = cArr2[i4];
                    if (z) {
                        sb.append((char) (c4 + 128));
                        z = false;
                    } else {
                        sb.append(c4);
                    }
                }
            }
            if (izVar.a() <= 0) {
                return;
            }
        }
    }

    private static void c(iz izVar, StringBuilder sb) {
        while (izVar.a() > 16) {
            for (int i = 0; i < 4; i++) {
                int a2 = izVar.a(6);
                if (a2 == 31) {
                    int b2 = 8 - izVar.b();
                    if (b2 != 8) {
                        izVar.a(b2);
                        return;
                    }
                    return;
                }
                if ((a2 & 32) == 0) {
                    a2 |= 64;
                }
                sb.append((char) a2);
            }
            if (izVar.a() <= 0) {
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(defpackage.iz r9, java.lang.StringBuilder r10) {
        /*
            r0 = 3
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 0
            r4 = 0
        L6:
            int r5 = r9.a()
            r6 = 8
            if (r5 != r6) goto Lf
            return
        Lf:
            int r5 = r9.a(r6)
            r7 = 254(0xfe, float:3.56E-43)
            if (r5 != r7) goto L18
            return
        L18:
            int r6 = r9.a(r6)
            a(r5, r6, r1)
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
            char[] r4 = defpackage.b00.e
            int r7 = r4.length
            if (r6 >= r7) goto L3b
            char r4 = r4[r6]
            if (r3 == 0) goto L6c
        L37:
            int r4 = r4 + 128
            char r3 = (char) r4
            goto L66
        L3b:
            xv r9 = defpackage.xv.a()
            throw r9
        L40:
            xv r9 = defpackage.xv.a()
            throw r9
        L45:
            char[] r4 = defpackage.b00.d
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
            xv r9 = defpackage.xv.a()
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
            char[] r7 = defpackage.b00.c
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
            xv r9 = defpackage.xv.a()
            throw r9
        L93:
            int r5 = r9.a()
            if (r5 > 0) goto L6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b00.d(iz, java.lang.StringBuilder):void");
    }
}
