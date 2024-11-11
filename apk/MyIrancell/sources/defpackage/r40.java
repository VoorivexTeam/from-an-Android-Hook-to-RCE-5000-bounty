package defpackage;

import android.content.Context;
import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.CertificateException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* loaded from: classes.dex */
public final class r40 {
    private static String a(Context context, int i) {
        InputStream inputStream = null;
        try {
            inputStream = context.getResources().openRawResource(i);
            String str = new String(ku.a(inputStream));
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return str;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static String a(String str, Context context, int i) {
        try {
            PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(Base64.decode(b(context, i).replaceAll("-----BEGIN RSA PRIVATE KEY-----", "").replaceAll("-----END RSA PRIVATE KEY-----", "").replaceAll("\n", ""), 0));
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initSign(keyFactory.generatePrivate(pKCS8EncodedKeySpec));
            signature.update(str.getBytes("UTF-8"));
            return new String(Base64.encode(signature.sign(), 0));
        } catch (Exception e) {
            throw e;
        }
    }

    public static boolean a(Context context, String str, String str2, int i) {
        String str3;
        try {
            try {
                str3 = a(context, i);
            } catch (IOException e) {
                e.printStackTrace();
                str3 = null;
                PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str3.replaceAll("-----BEGIN RSA PUBLIC KEY-----", "").replaceAll("-----END RSA PUBLIC KEY-----", "").replaceAll("\n", "").getBytes(), 0)));
                byte[] decode = Base64.decode(str2.getBytes(), 0);
                Signature signature = Signature.getInstance("SHA256withRSA");
                signature.initVerify(generatePublic);
                signature.update(str.getBytes());
                return signature.verify(decode);
            } catch (CertificateException e2) {
                e2.printStackTrace();
                str3 = null;
                PublicKey generatePublic2 = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str3.replaceAll("-----BEGIN RSA PUBLIC KEY-----", "").replaceAll("-----END RSA PUBLIC KEY-----", "").replaceAll("\n", "").getBytes(), 0)));
                byte[] decode2 = Base64.decode(str2.getBytes(), 0);
                Signature signature2 = Signature.getInstance("SHA256withRSA");
                signature2.initVerify(generatePublic2);
                signature2.update(str.getBytes());
                return signature2.verify(decode2);
            }
            PublicKey generatePublic22 = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str3.replaceAll("-----BEGIN RSA PUBLIC KEY-----", "").replaceAll("-----END RSA PUBLIC KEY-----", "").replaceAll("\n", "").getBytes(), 0)));
            byte[] decode22 = Base64.decode(str2.getBytes(), 0);
            Signature signature22 = Signature.getInstance("SHA256withRSA");
            signature22.initVerify(generatePublic22);
            signature22.update(str.getBytes());
            return signature22.verify(decode22);
        } catch (Exception e3) {
            e3.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String b(android.content.Context r2, int r3) {
        /*
            r0 = 0
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d
            java.io.InputStream r2 = r2.openRawResource(r3)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d
            java.lang.String r3 = new java.lang.String     // Catch: java.io.IOException -> L19 java.lang.Throwable -> L28
            byte[] r1 = defpackage.ku.a(r2)     // Catch: java.io.IOException -> L19 java.lang.Throwable -> L28
            r3.<init>(r1)     // Catch: java.io.IOException -> L19 java.lang.Throwable -> L28
            if (r2 == 0) goto L17
            r2.close()     // Catch: java.io.IOException -> L17
        L17:
            r0 = r3
            goto L27
        L19:
            r3 = move-exception
            goto L1f
        L1b:
            r3 = move-exception
            goto L2a
        L1d:
            r3 = move-exception
            r2 = r0
        L1f:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L27
            r2.close()     // Catch: java.io.IOException -> L27
        L27:
            return r0
        L28:
            r3 = move-exception
            r0 = r2
        L2a:
            if (r0 == 0) goto L2f
            r0.close()     // Catch: java.io.IOException -> L2f
        L2f:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r40.b(android.content.Context, int):java.lang.String");
    }
}
