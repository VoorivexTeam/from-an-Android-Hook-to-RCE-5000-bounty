package ir.metrix.sdk;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;
import okio.Buffer;

/* renamed from: ir.metrix.sdk.ai */
/* loaded from: classes.dex */
public class C2617ai {
    /* renamed from: a */
    public static int m12547a(long j, int i) {
        long j2 = i;
        return (int) (((j % j2) + j2) % j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static long m12548a() {
        return System.currentTimeMillis();
    }

    /* renamed from: a */
    public static String m12549a(String str, String str2) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            messageDigest.update(bytes, 0, bytes.length);
            return m12551a(messageDigest.digest());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m12550a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: a */
    public static String m12551a(byte[] bArr) {
        return m12550a("%0" + (bArr.length << 1) + "x", new BigInteger(1, bArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m12552a(String str) {
        return str == null || str.length() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m12553b(String str) {
        if (m12552a(str)) {
            str = "_default_instance";
        }
        return m12554c(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m12554c(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(Locale.US);
    }

    /* renamed from: d */
    public static String m12555d(String str) {
        return str.replaceAll("[\\x00-\\x09\\x11\\x12\\x14-\\x1F\\x7F]", "");
    }

    /* renamed from: e */
    public static String m12556e(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt <= 31 || codePointAt >= 127) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, 0, i);
                while (i < length) {
                    int codePointAt2 = str.codePointAt(i);
                    if (codePointAt2 > 31 && codePointAt2 < 127) {
                        buffer.writeUtf8CodePoint(codePointAt2);
                    }
                    i += Character.charCount(codePointAt2);
                }
                return buffer.readUtf8();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    /* renamed from: f */
    public static String m12557f(String str) {
        return m12549a(str, "SHA-256");
    }
}
