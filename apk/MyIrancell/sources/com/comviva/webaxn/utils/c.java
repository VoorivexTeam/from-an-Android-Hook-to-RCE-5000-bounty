package com.comviva.webaxn.utils;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public class c {
    private static SecureRandom j = new SecureRandom();
    private static final char[] k = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
    private static final String[] l = {"f`Bi$Go-Ox;Z9Eq{W8Hu'g)U!M3FzAw?yD2L~T(e:tN&j>@d/^nR|#raK,[*6415%+\"JYp}V0Q_hP.<Ic7kXl]=bs\\vSCm", "Xv*Baz=Hh7:Rs(Fi~.Z3;U0\\T1'Y6/g$Jr]b!Iu,k_W%P`N9O#V-j\"tG^lA8mE[yfM?})@5&{>LexDpK4qo2Cwn<|dcSQ+", "Sl4_AUo8]Gbw^.Rp`:Nk9;On@<Wv)Fg7,Y0}Qx[Py\\X3/f%Ju\"h(V!K5H2I~T*e'tM+sa?&zjcLEZir$>q|#16{m-DBCd=", "Pfv`{BSj0^'Jbt!\\GZs@;Kez(/Up~\"Om8:Qo$>Xy=Il%Cg7?d9Dk)Mx|c*R4F1AwE3N&a}2W,#qYL.<HVn6]5ihu[T+r_-"};
    static final byte[] m = {13, 10};
    private static final byte[] n = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
    private final byte[] a;
    private final int b;
    private final int c;
    private byte[] d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private int i;

    public c() {
        this(76, m);
    }

    public c(int i, byte[] bArr) {
        String str;
        byte[] bArr2 = new byte[bArr.length];
        this.a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        if (i > 0) {
            this.c = bArr.length + 4;
        } else {
            this.c = 4;
        }
        this.b = this.c - 1;
        if (a(bArr)) {
            try {
                str = new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                str = new String(bArr);
            }
            throw new IllegalArgumentException("lineSeperator must not contain base64 characters: [" + str + "]");
        }
    }

    private static int a(Context context, int i, int i2) {
        int nextInt = j.nextInt();
        if (nextInt < 0) {
            nextInt *= -1;
        }
        return (nextInt % ((i2 - i) + 1)) + i;
    }

    public static String a(Context context, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int a = a(context, 0, l.length - 1);
        int a2 = a(context, 0, 3);
        int a3 = a(context, 0, 3);
        byteArrayOutputStream.write((a & 15) | ((a2 & 3) << 4) | ((a3 & 3) << 6));
        String str2 = l[a];
        int length = str2.length();
        int i = 1;
        for (int length2 = str.length() - 1; length2 >= 0; length2--) {
            if (a3 != 0 && i % a3 == 0) {
                byteArrayOutputStream.write(a(context, 0, 256));
            }
            char charAt = str.charAt(length2);
            int indexOf = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?".indexOf(charAt);
            if (indexOf != -1) {
                charAt = str2.charAt((((byteArrayOutputStream.size() - 1) + a2) + indexOf) % length);
            }
            byteArrayOutputStream.write(charAt);
            i++;
        }
        return c(byteArrayOutputStream.toByteArray());
    }

    public static boolean a(byte b) {
        if (b != 61) {
            if (b >= 0) {
                byte[] bArr = n;
                if (b >= bArr.length || bArr[b] == -1) {
                }
            }
            return false;
        }
        return true;
    }

    private static boolean a(byte[] bArr) {
        for (byte b : bArr) {
            if (a(b)) {
                return true;
            }
        }
        return false;
    }

    private void b() {
        byte[] bArr = this.d;
        if (bArr == null) {
            this.d = new byte[8192];
            this.e = 0;
            this.f = 0;
        } else {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.d = bArr2;
        }
    }

    public static byte[] b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        c cVar = new c();
        cVar.c(new byte[r2], 0, r2);
        cVar.a(bArr, 0, bArr.length);
        cVar.a(bArr, 0, -1);
        int i = cVar.e;
        byte[] bArr2 = new byte[i];
        cVar.b(bArr2, 0, i);
        return bArr2;
    }

    public static String c(byte[] bArr) {
        String str;
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer((bArr.length * 3) / 2);
        int i = length - 3;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = ((bArr[i2] & 255) << 16) | ((bArr[i2 + 1] & 255) << 8) | (bArr[i2 + 2] & 255);
            stringBuffer.append(k[(i3 >> 18) & 63]);
            stringBuffer.append(k[(i3 >> 12) & 63]);
            stringBuffer.append(k[(i3 >> 6) & 63]);
            stringBuffer.append(k[i3 & 63]);
            i2 += 3;
        }
        int i4 = 0 + length;
        if (i2 != i4 - 2) {
            if (i2 == i4 - 1) {
                int i5 = (bArr[i2] & 255) << 16;
                stringBuffer.append(k[(i5 >> 18) & 63]);
                stringBuffer.append(k[(i5 >> 12) & 63]);
                str = "==";
            }
            return stringBuffer.toString();
        }
        int i6 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
        stringBuffer.append(k[(i6 >> 18) & 63]);
        stringBuffer.append(k[(i6 >> 12) & 63]);
        stringBuffer.append(k[(i6 >> 6) & 63]);
        str = "=";
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    int a() {
        if (this.d != null) {
            return this.e - this.f;
        }
        return 0;
    }

    void a(byte[] bArr, int i, int i2) {
        byte b;
        if (this.h) {
            return;
        }
        if (i2 < 0) {
            this.h = true;
        }
        int i3 = 0;
        while (i3 < i2) {
            byte[] bArr2 = this.d;
            if (bArr2 == null || bArr2.length - this.e < this.b) {
                b();
            }
            int i4 = i + 1;
            byte b2 = bArr[i];
            if (b2 == 61) {
                int i5 = this.i << 6;
                this.i = i5;
                int i6 = this.g;
                if (i6 == 2) {
                    int i7 = i5 << 6;
                    this.i = i7;
                    byte[] bArr3 = this.d;
                    int i8 = this.e;
                    this.e = i8 + 1;
                    bArr3[i8] = (byte) ((i7 >> 16) & 255);
                } else if (i6 == 3) {
                    byte[] bArr4 = this.d;
                    int i9 = this.e;
                    int i10 = i9 + 1;
                    this.e = i10;
                    bArr4[i9] = (byte) ((i5 >> 16) & 255);
                    this.e = i10 + 1;
                    bArr4[i10] = (byte) ((i5 >> 8) & 255);
                }
                this.h = true;
                return;
            }
            if (b2 >= 0) {
                byte[] bArr5 = n;
                if (b2 < bArr5.length && (b = bArr5[b2]) >= 0) {
                    int i11 = this.g + 1;
                    this.g = i11;
                    int i12 = i11 % 4;
                    this.g = i12;
                    int i13 = (this.i << 6) + b;
                    this.i = i13;
                    if (i12 == 0) {
                        byte[] bArr6 = this.d;
                        int i14 = this.e;
                        int i15 = i14 + 1;
                        this.e = i15;
                        bArr6[i14] = (byte) ((i13 >> 16) & 255);
                        int i16 = i15 + 1;
                        this.e = i16;
                        bArr6[i15] = (byte) ((i13 >> 8) & 255);
                        this.e = i16 + 1;
                        bArr6[i16] = (byte) (i13 & 255);
                    }
                }
            }
            i3++;
            i = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r4 >= r3.e) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    int b(byte[] r4, int r5, int r6) {
        /*
            r3 = this;
            byte[] r0 = r3.d
            if (r0 == 0) goto L22
            int r0 = r3.a()
            int r6 = java.lang.Math.min(r0, r6)
            byte[] r0 = r3.d
            r1 = 0
            if (r0 == r4) goto L1f
            int r2 = r3.f
            java.lang.System.arraycopy(r0, r2, r4, r5, r6)
            int r4 = r3.f
            int r4 = r4 + r6
            r3.f = r4
            int r5 = r3.e
            if (r4 < r5) goto L21
        L1f:
            r3.d = r1
        L21:
            return r6
        L22:
            boolean r4 = r3.h
            if (r4 == 0) goto L28
            r4 = -1
            goto L29
        L28:
            r4 = 0
        L29:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.c.b(byte[], int, int):int");
    }

    void c(byte[] bArr, int i, int i2) {
        if (bArr == null || bArr.length != i2) {
            return;
        }
        this.d = bArr;
        this.e = i;
        this.f = i;
    }
}
