package com.comviva.webaxn.utils;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;

/* renamed from: com.comviva.webaxn.utils.c */
/* loaded from: classes.dex */
public class C0690c {

    /* renamed from: j */
    private static SecureRandom f4677j = new SecureRandom();

    /* renamed from: k */
    private static final char[] f4678k = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();

    /* renamed from: l */
    private static final String[] f4679l = {"f`Bi$Go-Ox;Z9Eq{W8Hu'g)U!M3FzAw?yD2L~T(e:tN&j>@d/^nR|#raK,[*6415%+\"JYp}V0Q_hP.<Ic7kXl]=bs\\vSCm", "Xv*Baz=Hh7:Rs(Fi~.Z3;U0\\T1'Y6/g$Jr]b!Iu,k_W%P`N9O#V-j\"tG^lA8mE[yfM?})@5&{>LexDpK4qo2Cwn<|dcSQ+", "Sl4_AUo8]Gbw^.Rp`:Nk9;On@<Wv)Fg7,Y0}Qx[Py\\X3/f%Ju\"h(V!K5H2I~T*e'tM+sa?&zjcLEZir$>q|#16{m-DBCd=", "Pfv`{BSj0^'Jbt!\\GZs@;Kez(/Up~\"Om8:Qo$>Xy=Il%Cg7?d9Dk)Mx|c*R4F1AwE3N&a}2W,#qYL.<HVn6]5ihu[T+r_-"};

    /* renamed from: m */
    static final byte[] f4680m = {13, 10};

    /* renamed from: n */
    private static final byte[] f4681n = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    /* renamed from: a */
    private final byte[] f4682a;

    /* renamed from: b */
    private final int f4683b;

    /* renamed from: c */
    private final int f4684c;

    /* renamed from: d */
    private byte[] f4685d;

    /* renamed from: e */
    private int f4686e;

    /* renamed from: f */
    private int f4687f;

    /* renamed from: g */
    private int f4688g;

    /* renamed from: h */
    private boolean f4689h;

    /* renamed from: i */
    private int f4690i;

    public C0690c() {
        this(76, f4680m);
    }

    public C0690c(int i, byte[] bArr) {
        String str;
        byte[] bArr2 = new byte[bArr.length];
        this.f4682a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        if (i > 0) {
            this.f4684c = bArr.length + 4;
        } else {
            this.f4684c = 4;
        }
        this.f4683b = this.f4684c - 1;
        if (m5375a(bArr)) {
            try {
                str = new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                str = new String(bArr);
            }
            throw new IllegalArgumentException("lineSeperator must not contain base64 characters: [" + str + "]");
        }
    }

    /* renamed from: a */
    private static int m5372a(Context context, int i, int i2) {
        int nextInt = f4677j.nextInt();
        if (nextInt < 0) {
            nextInt *= -1;
        }
        return (nextInt % ((i2 - i) + 1)) + i;
    }

    /* renamed from: a */
    public static String m5373a(Context context, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int m5372a = m5372a(context, 0, f4679l.length - 1);
        int m5372a2 = m5372a(context, 0, 3);
        int m5372a3 = m5372a(context, 0, 3);
        byteArrayOutputStream.write((m5372a & 15) | ((m5372a2 & 3) << 4) | ((m5372a3 & 3) << 6));
        String str2 = f4679l[m5372a];
        int length = str2.length();
        int i = 1;
        for (int length2 = str.length() - 1; length2 >= 0; length2--) {
            if (m5372a3 != 0 && i % m5372a3 == 0) {
                byteArrayOutputStream.write(m5372a(context, 0, 256));
            }
            char charAt = str.charAt(length2);
            int indexOf = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?".indexOf(charAt);
            if (indexOf != -1) {
                charAt = str2.charAt((((byteArrayOutputStream.size() - 1) + m5372a2) + indexOf) % length);
            }
            byteArrayOutputStream.write(charAt);
            i++;
        }
        return m5378c(byteArrayOutputStream.toByteArray());
    }

    /* renamed from: a */
    public static boolean m5374a(byte b) {
        if (b != 61) {
            if (b >= 0) {
                byte[] bArr = f4681n;
                if (b >= bArr.length || bArr[b] == -1) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m5375a(byte[] bArr) {
        for (byte b : bArr) {
            if (m5374a(b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m5376b() {
        byte[] bArr = this.f4685d;
        if (bArr == null) {
            this.f4685d = new byte[8192];
            this.f4686e = 0;
            this.f4687f = 0;
        } else {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f4685d = bArr2;
        }
    }

    /* renamed from: b */
    public static byte[] m5377b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        C0690c c0690c = new C0690c();
        c0690c.m5382c(new byte[r2], 0, r2);
        c0690c.m5380a(bArr, 0, bArr.length);
        c0690c.m5380a(bArr, 0, -1);
        int i = c0690c.f4686e;
        byte[] bArr2 = new byte[i];
        c0690c.m5381b(bArr2, 0, i);
        return bArr2;
    }

    /* renamed from: c */
    public static String m5378c(byte[] bArr) {
        String str;
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer((bArr.length * 3) / 2);
        int i = length - 3;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = ((bArr[i2] & 255) << 16) | ((bArr[i2 + 1] & 255) << 8) | (bArr[i2 + 2] & 255);
            stringBuffer.append(f4678k[(i3 >> 18) & 63]);
            stringBuffer.append(f4678k[(i3 >> 12) & 63]);
            stringBuffer.append(f4678k[(i3 >> 6) & 63]);
            stringBuffer.append(f4678k[i3 & 63]);
            i2 += 3;
        }
        int i4 = 0 + length;
        if (i2 != i4 - 2) {
            if (i2 == i4 - 1) {
                int i5 = (bArr[i2] & 255) << 16;
                stringBuffer.append(f4678k[(i5 >> 18) & 63]);
                stringBuffer.append(f4678k[(i5 >> 12) & 63]);
                str = "==";
            }
            return stringBuffer.toString();
        }
        int i6 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
        stringBuffer.append(f4678k[(i6 >> 18) & 63]);
        stringBuffer.append(f4678k[(i6 >> 12) & 63]);
        stringBuffer.append(f4678k[(i6 >> 6) & 63]);
        str = "=";
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    /* renamed from: a */
    int m5379a() {
        if (this.f4685d != null) {
            return this.f4686e - this.f4687f;
        }
        return 0;
    }

    /* renamed from: a */
    void m5380a(byte[] bArr, int i, int i2) {
        byte b;
        if (this.f4689h) {
            return;
        }
        if (i2 < 0) {
            this.f4689h = true;
        }
        int i3 = 0;
        while (i3 < i2) {
            byte[] bArr2 = this.f4685d;
            if (bArr2 == null || bArr2.length - this.f4686e < this.f4683b) {
                m5376b();
            }
            int i4 = i + 1;
            byte b2 = bArr[i];
            if (b2 == 61) {
                int i5 = this.f4690i << 6;
                this.f4690i = i5;
                int i6 = this.f4688g;
                if (i6 == 2) {
                    int i7 = i5 << 6;
                    this.f4690i = i7;
                    byte[] bArr3 = this.f4685d;
                    int i8 = this.f4686e;
                    this.f4686e = i8 + 1;
                    bArr3[i8] = (byte) ((i7 >> 16) & 255);
                } else if (i6 == 3) {
                    byte[] bArr4 = this.f4685d;
                    int i9 = this.f4686e;
                    int i10 = i9 + 1;
                    this.f4686e = i10;
                    bArr4[i9] = (byte) ((i5 >> 16) & 255);
                    this.f4686e = i10 + 1;
                    bArr4[i10] = (byte) ((i5 >> 8) & 255);
                }
                this.f4689h = true;
                return;
            }
            if (b2 >= 0) {
                byte[] bArr5 = f4681n;
                if (b2 < bArr5.length && (b = bArr5[b2]) >= 0) {
                    int i11 = this.f4688g + 1;
                    this.f4688g = i11;
                    int i12 = i11 % 4;
                    this.f4688g = i12;
                    int i13 = (this.f4690i << 6) + b;
                    this.f4690i = i13;
                    if (i12 == 0) {
                        byte[] bArr6 = this.f4685d;
                        int i14 = this.f4686e;
                        int i15 = i14 + 1;
                        this.f4686e = i15;
                        bArr6[i14] = (byte) ((i13 >> 16) & 255);
                        int i16 = i15 + 1;
                        this.f4686e = i16;
                        bArr6[i15] = (byte) ((i13 >> 8) & 255);
                        this.f4686e = i16 + 1;
                        bArr6[i16] = (byte) (i13 & 255);
                    }
                }
            }
            i3++;
            i = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r4 >= r3.f4686e) goto L8;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    int m5381b(byte[] r4, int r5, int r6) {
        /*
            r3 = this;
            byte[] r0 = r3.f4685d
            if (r0 == 0) goto L22
            int r0 = r3.m5379a()
            int r6 = java.lang.Math.min(r0, r6)
            byte[] r0 = r3.f4685d
            r1 = 0
            if (r0 == r4) goto L1f
            int r2 = r3.f4687f
            java.lang.System.arraycopy(r0, r2, r4, r5, r6)
            int r4 = r3.f4687f
            int r4 = r4 + r6
            r3.f4687f = r4
            int r5 = r3.f4686e
            if (r4 < r5) goto L21
        L1f:
            r3.f4685d = r1
        L21:
            return r6
        L22:
            boolean r4 = r3.f4689h
            if (r4 == 0) goto L28
            r4 = -1
            goto L29
        L28:
            r4 = 0
        L29:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.C0690c.m5381b(byte[], int, int):int");
    }

    /* renamed from: c */
    void m5382c(byte[] bArr, int i, int i2) {
        if (bArr == null || bArr.length != i2) {
            return;
        }
        this.f4685d = bArr;
        this.f4686e = i;
        this.f4687f = i;
    }
}
