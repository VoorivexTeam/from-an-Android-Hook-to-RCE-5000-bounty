package ir.tapsell.sdk.utils;

import okio.Buffer;

/* renamed from: ir.tapsell.sdk.utils.g */
/* loaded from: classes.dex */
public class C2765g {
    /* renamed from: a */
    public static boolean m13164a(String str) {
        return str.contains("ir.tapsell.sdk");
    }

    /* renamed from: b */
    public static String m13165b(String str) {
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
