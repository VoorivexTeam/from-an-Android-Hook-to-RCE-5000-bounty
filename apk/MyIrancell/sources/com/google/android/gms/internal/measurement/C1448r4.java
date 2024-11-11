package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.measurement.r4 */
/* loaded from: classes.dex */
public final class C1448r4 {

    /* renamed from: a */
    static final Charset f6862a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f6863b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f6863b = bArr;
        ByteBuffer.wrap(bArr);
        byte[] bArr2 = f6863b;
        AbstractC1475t3.m8478a(bArr2, 0, bArr2.length, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m8287a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: a */
    public static int m8288a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m8289a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> T m8290a(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Object m8291a(Object obj, Object obj2) {
        return ((InterfaceC1533x5) obj).mo8096g().mo7533a((InterfaceC1533x5) obj2).mo7536d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> T m8292a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m8293a(InterfaceC1533x5 interfaceC1533x5) {
        if (!(interfaceC1533x5 instanceof AbstractC1558z2)) {
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m8294a(byte[] bArr) {
        return C1437q7.m8209a(bArr);
    }

    /* renamed from: b */
    public static String m8295b(byte[] bArr) {
        return new String(bArr, f6862a);
    }

    /* renamed from: c */
    public static int m8296c(byte[] bArr) {
        int length = bArr.length;
        int m8287a = m8287a(length, bArr, 0, length);
        if (m8287a == 0) {
            return 1;
        }
        return m8287a;
    }
}
