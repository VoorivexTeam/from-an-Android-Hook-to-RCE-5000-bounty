package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.p7 */
/* loaded from: classes.dex */
final class C1423p7 {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m8188b(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (m8197g(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m8197g(b3) || m8197g(b4)) {
            throw C1518w4.m8635f();
        }
        int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((i2 >>> 10) + 55232);
        cArr[i + 1] = (char) ((i2 & 1023) + 56320);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m8189b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (m8197g(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m8197g(b3)))) {
            throw C1518w4.m8635f();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m8190b(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || m8197g(b2)) {
            throw C1518w4.m8635f();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m8191b(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m8194d(byte b) {
        return b >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static boolean m8195e(byte b) {
        return b < -32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static boolean m8196f(byte b) {
        return b < -16;
    }

    /* renamed from: g */
    private static boolean m8197g(byte b) {
        return b > -65;
    }
}
