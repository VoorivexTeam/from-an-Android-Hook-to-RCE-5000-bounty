package com.neevar.neevarpaymentsdk;

import android.util.Base64;

/* renamed from: com.neevar.neevarpaymentsdk.e */
/* loaded from: classes.dex */
class C2297e {
    /* renamed from: a */
    public static String m10997a(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    /* renamed from: a */
    public static byte[] m10998a(String str) {
        return Base64.decode(str, 2);
    }
}
