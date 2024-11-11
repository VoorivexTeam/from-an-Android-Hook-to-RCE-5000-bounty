package com.comviva.webaxn.utils;

import android.content.Context;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Formatter;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class i1 {
    private final z1 a;

    public i1(Context context) {
        this.a = new z1(j1.a(context).S());
    }

    public i1(z1 z1Var) {
        this.a = z1Var;
    }

    private static String b(byte[] bArr) {
        Formatter formatter;
        Formatter formatter2 = null;
        r0 = null;
        String str = null;
        try {
            formatter = new Formatter();
            try {
                for (byte b : bArr) {
                    formatter.format("%02x", Byte.valueOf(b));
                }
                str = formatter.toString();
            } catch (Exception unused) {
            } catch (Throwable th) {
                th = th;
                formatter2 = formatter;
                formatter2.close();
                throw th;
            }
        } catch (Exception unused2) {
            formatter = null;
        } catch (Throwable th2) {
            th = th2;
        }
        formatter.close();
        return str;
    }

    public static String c(byte[] bArr) {
        try {
            return b(MessageDigest.getInstance("SHA-1").digest(bArr));
        } catch (Exception unused) {
            return null;
        }
    }

    public String a() {
        return this.a.toString();
    }

    public byte[] a(byte[] bArr) {
        byte[] doFinal;
        String c;
        try {
            String e = this.a.e();
            if (!((e == null || (c = c(bArr)) == null || !c.equals(e)) ? false : true)) {
                return null;
            }
            if (TextUtils.isEmpty(this.a.c()) || TextUtils.isEmpty(this.a.d())) {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                byte[] bytes = z1.g().getBytes("UTF-8");
                cipher.init(2, new SecretKeySpec(bytes, 0, bytes.length, "AES"), new IvParameterSpec(z1.f().getBytes("UTF-8")));
                doFinal = cipher.doFinal(bArr);
            } else {
                int b = this.a.b();
                long[] jArr = new long[b];
                for (int i = 0; i < b; i++) {
                    jArr[i] = this.a.a(i);
                }
                byte[] bytes2 = g1.a(jArr).getBytes("UTF-8");
                int a = this.a.a();
                Cipher cipher2 = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                byte[] a2 = a(bArr, 0, a);
                cipher2.init(2, new SecretKeySpec(bytes2, 0, bytes2.length, "AES"), new IvParameterSpec(this.a.d().getBytes("UTF-8")));
                byte[] doFinal2 = cipher2.doFinal(a2);
                byte[] a3 = a(bArr, a, bArr.length);
                cipher2.init(2, new SecretKeySpec(doFinal2, 0, doFinal2.length, "AES"), new IvParameterSpec(this.a.c().getBytes("UTF-8")));
                doFinal = cipher2.doFinal(a3);
            }
            return doFinal;
        } catch (Exception unused) {
            return null;
        }
    }

    public byte[] a(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        return bArr2;
    }

    public byte[] a(byte[] bArr, boolean z) {
        byte[] bArr2;
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            if (z) {
                SecureRandom secureRandom = new SecureRandom();
                int b = this.a.b();
                long[] jArr = new long[b];
                for (int i = 0; i < b; i++) {
                    jArr[i] = 17592186044415L & secureRandom.nextLong();
                    this.a.a(i, jArr[i]);
                }
                String a = g1.a(jArr);
                long[] jArr2 = new long[b];
                for (int i2 = 0; i2 < b; i2++) {
                    jArr2[i2] = secureRandom.nextLong();
                    jArr2[i2] = jArr2[i2] & 17592186044415L;
                }
                String a2 = g1.a(jArr2);
                long[] jArr3 = {secureRandom.nextLong()};
                jArr3[0] = jArr3[0] & 17592186044415L;
                String a3 = g1.a(jArr3);
                byte[] bytes = a2.getBytes("UTF-8");
                cipher.init(1, new SecretKeySpec(bytes, 0, bytes.length, "AES"), new IvParameterSpec(a3.getBytes("UTF-8")));
                this.a.a(a3);
                byte[] doFinal = cipher.doFinal(bArr);
                long[] jArr4 = {secureRandom.nextLong()};
                jArr4[0] = 17592186044415L & jArr4[0];
                String a4 = g1.a(jArr4);
                byte[] bytes2 = a.getBytes("UTF-8");
                cipher.init(1, new SecretKeySpec(bytes2, 0, bytes2.length, "AES"), new IvParameterSpec(a4.getBytes("UTF-8")));
                this.a.b(a4);
                byte[] doFinal2 = cipher.doFinal(bytes);
                this.a.b(doFinal2.length);
                byte[] bArr3 = new byte[doFinal2.length + doFinal.length];
                try {
                    System.arraycopy(doFinal2, 0, bArr3, 0, doFinal2.length);
                    System.arraycopy(doFinal, 0, bArr3, doFinal2.length, doFinal.length);
                    bArr2 = bArr3;
                } catch (Exception unused) {
                    return bArr3;
                }
            } else if (TextUtils.isEmpty(z1.g()) || TextUtils.isEmpty(z1.f())) {
                bArr2 = null;
            } else {
                byte[] bytes3 = z1.g().getBytes("UTF-8");
                cipher.init(1, new SecretKeySpec(bytes3, 0, bytes3.length, "AES"), new IvParameterSpec(z1.f().getBytes("UTF-8")));
                bArr2 = cipher.doFinal(bArr);
            }
            try {
                this.a.c(c(bArr2));
            } catch (Exception unused2) {
                return bArr2;
            }
        } catch (Exception unused3) {
            return null;
        }
    }

    public String b() {
        return this.a.e();
    }
}
