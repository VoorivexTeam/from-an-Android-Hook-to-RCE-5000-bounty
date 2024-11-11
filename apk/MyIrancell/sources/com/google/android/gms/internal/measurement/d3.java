package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, byte[] bArr, int i2, int i3, c3 c3Var) {
        if ((i >>> 3) == 0) {
            throw w4.c();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return b(bArr, i2, c3Var);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return a(bArr, i2, c3Var) + c3Var.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw w4.c();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = a(bArr, i2, c3Var);
            i6 = c3Var.a;
            if (i6 == i5) {
                break;
            }
            i2 = a(i6, bArr, i2, i3, c3Var);
        }
        if (i2 > i3 || i6 != i5) {
            throw w4.e();
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, byte[] bArr, int i2, int i3, h7 h7Var, c3 c3Var) {
        if ((i >>> 3) == 0) {
            throw w4.c();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int b = b(bArr, i2, c3Var);
            h7Var.a(i, Long.valueOf(c3Var.b));
            return b;
        }
        if (i4 == 1) {
            h7Var.a(i, Long.valueOf(b(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int a = a(bArr, i2, c3Var);
            int i5 = c3Var.a;
            if (i5 < 0) {
                throw w4.b();
            }
            if (i5 > bArr.length - a) {
                throw w4.a();
            }
            h7Var.a(i, i5 == 0 ? h3.c : h3.a(bArr, a, i5));
            return a + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw w4.c();
            }
            h7Var.a(i, Integer.valueOf(a(bArr, i2)));
            return i2 + 4;
        }
        h7 e = h7.e();
        int i6 = (i & (-8)) | 4;
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int a2 = a(bArr, i2, c3Var);
            int i8 = c3Var.a;
            i7 = i8;
            if (i8 == i6) {
                i2 = a2;
                break;
            }
            int a3 = a(i7, bArr, a2, i3, e, c3Var);
            i7 = i8;
            i2 = a3;
        }
        if (i2 > i3 || i7 != i6) {
            throw w4.e();
        }
        h7Var.a(i, e);
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, byte[] bArr, int i2, int i3, x4<?> x4Var, c3 c3Var) {
        p4 p4Var = (p4) x4Var;
        int a = a(bArr, i2, c3Var);
        while (true) {
            p4Var.d(c3Var.a);
            if (a >= i3) {
                break;
            }
            int a2 = a(bArr, a, c3Var);
            if (i != c3Var.a) {
                break;
            }
            a = a(bArr, a2, c3Var);
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, byte[] bArr, int i2, c3 c3Var) {
        int i3;
        int i4;
        int i5 = i & 127;
        int i6 = i2 + 1;
        byte b = bArr[i2];
        if (b < 0) {
            int i7 = i5 | ((b & Byte.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                i3 = b2 << 14;
            } else {
                i5 = i7 | ((b2 & Byte.MAX_VALUE) << 14);
                i6 = i8 + 1;
                byte b3 = bArr[i8];
                if (b3 >= 0) {
                    i4 = b3 << 21;
                } else {
                    i7 = i5 | ((b3 & Byte.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b4 = bArr[i6];
                    if (b4 >= 0) {
                        i3 = b4 << 28;
                    } else {
                        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] >= 0) {
                                c3Var.a = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            c3Var.a = i7 | i3;
            return i8;
        }
        i4 = b << 7;
        c3Var.a = i5 | i4;
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(q6<?> q6Var, int i, byte[] bArr, int i2, int i3, x4<?> x4Var, c3 c3Var) {
        int a = a(q6Var, bArr, i2, i3, c3Var);
        while (true) {
            x4Var.add(c3Var.c);
            if (a >= i3) {
                break;
            }
            int a2 = a(bArr, a, c3Var);
            if (i != c3Var.a) {
                break;
            }
            a = a(q6Var, bArr, a2, i3, c3Var);
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(q6 q6Var, byte[] bArr, int i, int i2, int i3, c3 c3Var) {
        b6 b6Var = (b6) q6Var;
        Object zza = b6Var.zza();
        int a = b6Var.a((b6) zza, bArr, i, i2, i3, c3Var);
        b6Var.c((b6) zza);
        c3Var.c = zza;
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(q6 q6Var, byte[] bArr, int i, int i2, c3 c3Var) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = a(i4, bArr, i3, c3Var);
            i4 = c3Var.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw w4.a();
        }
        Object zza = q6Var.zza();
        int i6 = i4 + i5;
        q6Var.a(zza, bArr, i5, i6, c3Var);
        q6Var.c(zza);
        c3Var.c = zza;
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(byte[] bArr, int i, c3 c3Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return a(b, bArr, i2, c3Var);
        }
        c3Var.a = b;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(byte[] bArr, int i, x4<?> x4Var, c3 c3Var) {
        p4 p4Var = (p4) x4Var;
        int a = a(bArr, i, c3Var);
        int i2 = c3Var.a + a;
        while (a < i2) {
            a = a(bArr, a, c3Var);
            p4Var.d(c3Var.a);
        }
        if (a == i2) {
            return a;
        }
        throw w4.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(byte[] bArr, int i, c3 c3Var) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c3Var.b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        c3Var.b = j2;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long b(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double c(byte[] bArr, int i) {
        return Double.longBitsToDouble(b(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(byte[] bArr, int i, c3 c3Var) {
        int a = a(bArr, i, c3Var);
        int i2 = c3Var.a;
        if (i2 < 0) {
            throw w4.b();
        }
        if (i2 == 0) {
            c3Var.c = "";
            return a;
        }
        c3Var.c = new String(bArr, a, i2, r4.a);
        return a + i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float d(byte[] bArr, int i) {
        return Float.intBitsToFloat(a(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(byte[] bArr, int i, c3 c3Var) {
        int a = a(bArr, i, c3Var);
        int i2 = c3Var.a;
        if (i2 < 0) {
            throw w4.b();
        }
        if (i2 == 0) {
            c3Var.c = "";
            return a;
        }
        c3Var.c = q7.b(bArr, a, i2);
        return a + i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(byte[] bArr, int i, c3 c3Var) {
        int a = a(bArr, i, c3Var);
        int i2 = c3Var.a;
        if (i2 < 0) {
            throw w4.b();
        }
        if (i2 > bArr.length - a) {
            throw w4.a();
        }
        if (i2 == 0) {
            c3Var.c = h3.c;
            return a;
        }
        c3Var.c = h3.a(bArr, a, i2);
        return a + i2;
    }
}
