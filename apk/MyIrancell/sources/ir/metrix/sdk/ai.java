package ir.metrix.sdk;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;
import okio.Buffer;

/* loaded from: classes.dex */
public class ai {
    public static int a(long j, int i) {
        long j2 = i;
        return (int) (((j % j2) + j2) % j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a() {
        return System.currentTimeMillis();
    }

    public static String a(String str, String str2) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            messageDigest.update(bytes, 0, bytes.length);
            return a(messageDigest.digest());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String a(byte[] bArr) {
        return a("%0" + (bArr.length << 1) + "x", new BigInteger(1, bArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(String str) {
        return str == null || str.length() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(String str) {
        if (a(str)) {
            str = "_default_instance";
        }
        return c(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(Locale.US);
    }

    public static String d(String str) {
        return str.replaceAll("[\\x00-\\x09\\x11\\x12\\x14-\\x1F\\x7F]", "");
    }

    public static String e(String str) {
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

    public static String f(String str) {
        return a(str, "SHA-256");
    }
}
