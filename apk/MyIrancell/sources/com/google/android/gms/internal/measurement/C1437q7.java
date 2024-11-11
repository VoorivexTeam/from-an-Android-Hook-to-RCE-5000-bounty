package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.q7 */
/* loaded from: classes.dex */
public final class C1437q7 {

    /* renamed from: a */
    private static final AbstractC1465s7 f6846a;

    static {
        f6846a = (!(C1409o7.m8127a() && C1409o7.m8132b()) || C1195a3.m7528a()) ? new C1451r7() : new C1479t7();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m8207a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new C1493u7(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        long j = i3 + 4294967296L;
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m8208a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f6846a.mo8321a(charSequence, bArr, i, i2);
    }

    /* renamed from: a */
    public static boolean m8209a(byte[] bArr) {
        return f6846a.m8427b(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static boolean m8210a(byte[] bArr, int i, int i2) {
        return f6846a.m8427b(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static int m8211b(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static int m8212b(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static int m8213b(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m8214b(byte[] bArr, int i, int i2) {
        return f6846a.mo8322a(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static int m8216d(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m8211b(b);
        }
        if (i3 == 1) {
            return m8212b(b, bArr[i]);
        }
        if (i3 == 2) {
            return m8213b(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }
}
