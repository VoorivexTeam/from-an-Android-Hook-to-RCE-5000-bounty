package com.neevar.neevarpaymentsdk;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* loaded from: classes.dex */
class f {
    public static byte[] a(SecretKey secretKey, byte[] bArr) {
        try {
            Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
            cipher.init(1, secretKey);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] b(SecretKey secretKey, byte[] bArr) {
        try {
            Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
            cipher.init(2, secretKey);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
