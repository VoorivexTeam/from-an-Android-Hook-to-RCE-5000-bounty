package com.comviva.webaxn.utils;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.comviva.webaxn.utils.p */
/* loaded from: classes.dex */
public class C0729p {
    /* renamed from: a */
    public static byte[] m5938a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[24];
        for (int i = 0; i < 16; i++) {
            bArr3[i] = bArr2[i];
        }
        for (int i2 = 0; i2 < 8; i2++) {
            bArr3[i2 + 16] = bArr2[i2];
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr3, "DESede");
        try {
            Cipher cipher = Cipher.getInstance("DESede/ECB/NoPadding");
            cipher.init(1, secretKeySpec);
            return cipher.doFinal(bArr);
        } catch (InvalidKeyException e) {
            throw new Exception(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new Exception(e2);
        } catch (BadPaddingException e3) {
            throw new Exception(e3);
        } catch (IllegalBlockSizeException e4) {
            throw new Exception(e4);
        } catch (NoSuchPaddingException e5) {
            throw new Exception(e5);
        }
    }
}
