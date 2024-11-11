package com.neevar.neevarpaymentsdk;

import android.util.Base64;

/* loaded from: classes.dex */
class e {
    public static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    public static byte[] a(String str) {
        return Base64.decode(str, 2);
    }
}
