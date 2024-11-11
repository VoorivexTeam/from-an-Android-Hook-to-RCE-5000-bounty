package com.neevar.neevarpaymentsdk;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* renamed from: com.neevar.neevarpaymentsdk.f */
/* loaded from: classes.dex */
class C2298f {
    /* renamed from: a */
    public static byte[] m10999a(SecretKey secretKey, byte[] bArr) {
        try {
            Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
            cipher.init(1, secretKey);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public static byte[] m11000b(SecretKey secretKey, byte[] bArr) {
        try {
            Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
            cipher.init(2, secretKey);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
