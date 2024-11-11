package com.comviva.webaxn.utils;

import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes.dex */
public class c1 {
    public c1() {
        a();
    }

    public static String a(byte[] bArr, int i) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 != i; i2++) {
            int i3 = bArr[i2] & 255;
            stringBuffer.append("0123456789ABCDEF".charAt(i3 >> 4));
            stringBuffer.append("0123456789ABCDEF".charAt(i3 & 15));
        }
        return stringBuffer.toString();
    }

    private static void a() {
    }

    public String a(String str, byte[] bArr) {
        try {
            new p();
            byte[] bArr2 = new byte[str.length()];
            byte[] a = a(str);
            byte[] a2 = p.a(p.a(bArr, a), a);
            if (a2 != null) {
                return a(a2, a2.length);
            }
            return null;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchPaddingException e2) {
            e2.printStackTrace();
            return null;
        } catch (Exception e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public byte[] a(String str) {
        int i;
        char[] charArray = str.toCharArray();
        byte[] bArr = new byte[charArray.length];
        int i2 = 0;
        for (int i3 = 0; i3 < charArray.length; i3++) {
            if (charArray[i3] >= '0' && charArray[i3] <= '9') {
                i = i2 + 1;
                bArr[i2] = (byte) (charArray[i3] - '0');
            } else if (charArray[i3] < 'A' || charArray[i3] > 'F') {
                if (charArray[i3] >= 'a' && charArray[i3] <= 'f') {
                    i = i2 + 1;
                    bArr[i2] = (byte) ((charArray[i3] - 'a') + 10);
                }
            } else {
                i = i2 + 1;
                bArr[i2] = (byte) ((charArray[i3] - 'A') + 10);
            }
            i2 = i;
        }
        int i4 = i2 >> 1;
        byte[] bArr2 = new byte[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i5 * 2;
            bArr2[i5] = (byte) (bArr[i6 + 1] | (bArr[i6] << 4));
        }
        return bArr2;
    }

    public byte[] b(String str) {
        byte[] a = a(str);
        return a.length % 8 != 0 ? new byte[(a.length + 8) - (a.length % 8)] : a;
    }
}
