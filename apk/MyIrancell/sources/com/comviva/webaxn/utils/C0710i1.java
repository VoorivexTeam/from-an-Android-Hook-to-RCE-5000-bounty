package com.comviva.webaxn.utils;

import android.content.Context;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Formatter;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.comviva.webaxn.utils.i1 */
/* loaded from: classes.dex */
public class C0710i1 {

    /* renamed from: a */
    private final C0761z1 f4860a;

    public C0710i1(Context context) {
        this.f4860a = new C0761z1(C0713j1.m5563a(context).m5614S());
    }

    public C0710i1(C0761z1 c0761z1) {
        this.f4860a = c0761z1;
    }

    /* renamed from: b */
    private static String m5537b(byte[] bArr) {
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

    /* renamed from: c */
    public static String m5538c(byte[] bArr) {
        try {
            return m5537b(MessageDigest.getInstance("SHA-1").digest(bArr));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public String m5539a() {
        return this.f4860a.toString();
    }

    /* renamed from: a */
    public byte[] m5540a(byte[] bArr) {
        byte[] doFinal;
        String m5538c;
        try {
            String m6248e = this.f4860a.m6248e();
            if (!((m6248e == null || (m5538c = m5538c(bArr)) == null || !m5538c.equals(m6248e)) ? false : true)) {
                return null;
            }
            if (TextUtils.isEmpty(this.f4860a.m6245c()) || TextUtils.isEmpty(this.f4860a.m6247d())) {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                byte[] bytes = C0761z1.m6237g().getBytes("UTF-8");
                cipher.init(2, new SecretKeySpec(bytes, 0, bytes.length, "AES"), new IvParameterSpec(C0761z1.m6236f().getBytes("UTF-8")));
                doFinal = cipher.doFinal(bArr);
            } else {
                int m6242b = this.f4860a.m6242b();
                long[] jArr = new long[m6242b];
                for (int i = 0; i < m6242b; i++) {
                    jArr[i] = this.f4860a.m6239a(i);
                }
                byte[] bytes2 = C0704g1.m5476a(jArr).getBytes("UTF-8");
                int m6238a = this.f4860a.m6238a();
                Cipher cipher2 = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                byte[] m5541a = m5541a(bArr, 0, m6238a);
                cipher2.init(2, new SecretKeySpec(bytes2, 0, bytes2.length, "AES"), new IvParameterSpec(this.f4860a.m6247d().getBytes("UTF-8")));
                byte[] doFinal2 = cipher2.doFinal(m5541a);
                byte[] m5541a2 = m5541a(bArr, m6238a, bArr.length);
                cipher2.init(2, new SecretKeySpec(doFinal2, 0, doFinal2.length, "AES"), new IvParameterSpec(this.f4860a.m6245c().getBytes("UTF-8")));
                doFinal = cipher2.doFinal(m5541a2);
            }
            return doFinal;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public byte[] m5541a(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        return bArr2;
    }

    /* renamed from: a */
    public byte[] m5542a(byte[] bArr, boolean z) {
        byte[] bArr2;
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            if (z) {
                SecureRandom secureRandom = new SecureRandom();
                int m6242b = this.f4860a.m6242b();
                long[] jArr = new long[m6242b];
                for (int i = 0; i < m6242b; i++) {
                    jArr[i] = 17592186044415L & secureRandom.nextLong();
                    this.f4860a.m6240a(i, jArr[i]);
                }
                String m5476a = C0704g1.m5476a(jArr);
                long[] jArr2 = new long[m6242b];
                for (int i2 = 0; i2 < m6242b; i2++) {
                    jArr2[i2] = secureRandom.nextLong();
                    jArr2[i2] = jArr2[i2] & 17592186044415L;
                }
                String m5476a2 = C0704g1.m5476a(jArr2);
                long[] jArr3 = {secureRandom.nextLong()};
                jArr3[0] = jArr3[0] & 17592186044415L;
                String m5476a3 = C0704g1.m5476a(jArr3);
                byte[] bytes = m5476a2.getBytes("UTF-8");
                cipher.init(1, new SecretKeySpec(bytes, 0, bytes.length, "AES"), new IvParameterSpec(m5476a3.getBytes("UTF-8")));
                this.f4860a.m6241a(m5476a3);
                byte[] doFinal = cipher.doFinal(bArr);
                long[] jArr4 = {secureRandom.nextLong()};
                jArr4[0] = 17592186044415L & jArr4[0];
                String m5476a4 = C0704g1.m5476a(jArr4);
                byte[] bytes2 = m5476a.getBytes("UTF-8");
                cipher.init(1, new SecretKeySpec(bytes2, 0, bytes2.length, "AES"), new IvParameterSpec(m5476a4.getBytes("UTF-8")));
                this.f4860a.m6244b(m5476a4);
                byte[] doFinal2 = cipher.doFinal(bytes);
                this.f4860a.m6243b(doFinal2.length);
                byte[] bArr3 = new byte[doFinal2.length + doFinal.length];
                try {
                    System.arraycopy(doFinal2, 0, bArr3, 0, doFinal2.length);
                    System.arraycopy(doFinal, 0, bArr3, doFinal2.length, doFinal.length);
                    bArr2 = bArr3;
                } catch (Exception unused) {
                    return bArr3;
                }
            } else if (TextUtils.isEmpty(C0761z1.m6237g()) || TextUtils.isEmpty(C0761z1.m6236f())) {
                bArr2 = null;
            } else {
                byte[] bytes3 = C0761z1.m6237g().getBytes("UTF-8");
                cipher.init(1, new SecretKeySpec(bytes3, 0, bytes3.length, "AES"), new IvParameterSpec(C0761z1.m6236f().getBytes("UTF-8")));
                bArr2 = cipher.doFinal(bArr);
            }
            try {
                this.f4860a.m6246c(m5538c(bArr2));
            } catch (Exception unused2) {
                return bArr2;
            }
        } catch (Exception unused3) {
            return null;
        }
    }

    /* renamed from: b */
    public String m5543b() {
        return this.f4860a.m6248e();
    }
}
