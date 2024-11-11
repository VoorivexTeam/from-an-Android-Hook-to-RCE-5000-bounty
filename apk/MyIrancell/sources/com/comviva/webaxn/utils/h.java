package com.comviva.webaxn.utils;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class h {
    protected static final byte[] a = {0, 0, 0, 0, 0, 0, 0, 0};
    static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    protected int a(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int length = (str.length() - i) >> 1;
        if (length < i2) {
            i2 = length;
        }
        int length2 = bArr.length;
        if (i2 > length2) {
            i2 = length2;
        }
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i2; i7++) {
            int i8 = 0;
            boolean z = true;
            byte b2 = 0;
            while (i8 < 2) {
                b2 = (byte) (b2 << 4);
                int i9 = i + 1;
                char charAt = str.charAt(i);
                if (charAt >= 'a' && charAt <= 'f') {
                    i4 = charAt - 'a';
                } else if (charAt >= 'A' && charAt <= 'F') {
                    i4 = charAt - 'A';
                } else if (charAt < '0' || charAt > '9') {
                    z = false;
                    i8++;
                    i = i9;
                } else {
                    i3 = (byte) (charAt - '0');
                    b2 = (byte) (i3 | b2);
                    i8++;
                    i = i9;
                }
                i3 = ((byte) i4) + 10;
                b2 = (byte) (i3 | b2);
                i8++;
                i = i9;
            }
            if (z) {
                bArr[i6] = b2;
                i5++;
                i6++;
            }
        }
        return i5;
    }

    public String a(String str, String str2) {
        String lowerCase = str2.toLowerCase();
        int length = str.length();
        byte[] bArr = new byte[length];
        byte[] bArr2 = new byte[24];
        byte[] bArr3 = new byte[length];
        if (lowerCase.length() / 2 != 16 && lowerCase.length() / 2 != 24) {
            throw new s("Wrong key Size (" + lowerCase.length() + "): Should be a 32 or 48 characters string");
        }
        if (lowerCase.length() / 2 == 16) {
            lowerCase = lowerCase.concat(lowerCase.substring(0, 16));
        }
        byte[] bytes = str.getBytes();
        if (a(lowerCase, bArr2, 0, 24) != 24) {
            throw new s("Error while converting keyStrings to byte[] ");
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "DESede");
        Cipher cipher = Cipher.getInstance("DESede/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, new IvParameterSpec(a));
        return a(cipher.doFinal(bytes));
    }

    public String a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public String a(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.setLength(i2 << 1);
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3 + 1;
            int i6 = i4 + i;
            stringBuffer.setCharAt(i3, b[(bArr[i6] >> 4) & 15]);
            i3 = i5 + 1;
            stringBuffer.setCharAt(i5, b[bArr[i6] & 15]);
        }
        return stringBuffer.toString();
    }
}
