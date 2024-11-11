package ir.tapsell.sdk.utils;

import okio.Buffer;

/* loaded from: classes.dex */
public class g {
    public static boolean a(String str) {
        return str.contains("ir.tapsell.sdk");
    }

    public static String b(String str) {
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
}
