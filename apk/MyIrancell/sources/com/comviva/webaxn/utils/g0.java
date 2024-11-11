package com.comviva.webaxn.utils;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import android.text.TextUtils;
import android.widget.Toast;
import com.comviva.webaxn.ui.y;
import defpackage.lj;
import defpackage.mj;
import defpackage.wj;
import defpackage.xj;
import defpackage.yj;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* loaded from: classes.dex */
public class g0 {
    private static g0 m;
    private Context a;
    private wj b;
    private mj c;
    lj d;
    private yj e;
    private e f;
    private String g;
    private HashMap<String, String> h;
    private KeyguardManager i;
    private FingerprintManager j;
    private KeyStore k;
    private KeyGenerator l;

    private g0(Context context) {
        this.a = context;
        if (Build.VERSION.SDK_INT >= 23) {
            this.i = (KeyguardManager) context.getSystemService(KeyguardManager.class);
            this.j = (FingerprintManager) this.a.getSystemService(FingerprintManager.class);
        }
    }

    public static g0 a(Context context) {
        if (m == null) {
            m = new g0(context);
        }
        return m;
    }

    private boolean a(Cipher cipher, String str) {
        try {
            this.k.load(null);
            cipher.init(1, (SecretKey) this.k.getKey(str, null));
            return true;
        } catch (KeyPermanentlyInvalidatedException unused) {
            return false;
        } catch (IOException e) {
            throw new RuntimeException("Failed to init Cipher", e);
        } catch (InvalidKeyException e2) {
            throw new RuntimeException("Failed to init Cipher", e2);
        } catch (KeyStoreException e3) {
            throw new RuntimeException("Failed to init Cipher", e3);
        } catch (NoSuchAlgorithmException e4) {
            throw new RuntimeException("Failed to init Cipher", e4);
        } catch (UnrecoverableKeyException e5) {
            throw new RuntimeException("Failed to init Cipher", e5);
        } catch (CertificateException e6) {
            throw new RuntimeException("Failed to init Cipher", e6);
        }
    }

    public void a() {
        if (m != null) {
            m = null;
        }
        HashMap<String, String> hashMap = this.h;
        if (hashMap != null) {
            hashMap.clear();
            this.h = null;
        }
        if (this.i != null) {
            this.i = null;
        }
        if (this.j != null) {
            this.j = null;
        }
        this.a = null;
        this.b = null;
        this.e = null;
        this.f = null;
        this.c = null;
        this.d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r1, defpackage.wj r2, defpackage.mj r3, defpackage.lj r4, defpackage.yj r5, com.comviva.webaxn.utils.e r6, com.comviva.webaxn.ui.o1 r7) {
        /*
            r0 = this;
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            if (r5 == 0) goto L11
            java.lang.String r2 = r5.j
        Le:
            r0.g = r2
            goto L16
        L11:
            if (r6 == 0) goto L16
            java.lang.String r2 = r6.j
            goto Le
        L16:
            java.util.HashMap<java.lang.String, java.lang.String> r2 = r0.h
            if (r2 == 0) goto L1d
            r2.clear()
        L1d:
            java.util.HashMap r1 = com.comviva.webaxn.utils.x1.f(r1)
            r0.h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.g0.a(java.lang.String, wj, mj, lj, yj, com.comviva.webaxn.utils.e, com.comviva.webaxn.ui.o1):void");
    }

    public void a(String str, boolean z) {
        try {
            this.k.load(null);
            this.l.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes("CBC").setUserAuthenticationRequired(true).setEncryptionPaddings("PKCS7Padding").build());
            this.l.generateKey();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InvalidAlgorithmParameterException e2) {
            throw new RuntimeException(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new RuntimeException(e3);
        } catch (CertificateException e4) {
            throw new RuntimeException(e4);
        }
    }

    public void b() {
        c();
    }

    public void c() {
        com.comviva.webaxn.ui.y yVar;
        Activity activity;
        try {
            this.k = KeyStore.getInstance("AndroidKeyStore");
            try {
                this.l = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                try {
                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                    Cipher.getInstance("AES/CBC/PKCS7Padding");
                    try {
                        if (e() && d()) {
                            a("default_key", true);
                            a("key_not_invalidated", false);
                        }
                        if (a(cipher, "default_key")) {
                            yVar = new com.comviva.webaxn.ui.y();
                            yVar.a(new FingerprintManager.CryptoObject(cipher));
                            yVar.a(y.d.FINGERPRINT);
                            activity = (Activity) this.a;
                        } else {
                            yVar = new com.comviva.webaxn.ui.y();
                            yVar.a(new FingerprintManager.CryptoObject(cipher));
                            yVar.a(y.d.NEW_FINGERPRINT_ENROLLED);
                            activity = (Activity) this.a;
                        }
                        yVar.show(activity.getFragmentManager(), "myFragment");
                    } catch (Exception unused) {
                    }
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException("Failed to get an instance of Cipher", e);
                } catch (NoSuchPaddingException e2) {
                    throw new RuntimeException("Failed to get an instance of Cipher", e2);
                }
            } catch (NoSuchAlgorithmException e3) {
                throw new RuntimeException("Failed to get an instance of KeyGenerator", e3);
            } catch (NoSuchProviderException e4) {
                throw new RuntimeException("Failed to get an instance of KeyGenerator", e4);
            }
        } catch (KeyStoreException e5) {
            throw new RuntimeException("Failed to get an instance of KeyStore", e5);
        }
    }

    public boolean d() {
        if (this.j.hasEnrolledFingerprints()) {
            return true;
        }
        Toast.makeText(this.a, "Go to 'Settings -> Security -> Fingerprint' and register at least one fingerprint", 1).show();
        return false;
    }

    public boolean e() {
        if (this.i.isKeyguardSecure()) {
            return true;
        }
        Toast.makeText(this.a, "Secure lock screen hasn't set up.\nGo to 'Settings -> Security -> Fingerprint' to set up a fingerprint", 1).show();
        return false;
    }

    public void f() {
        if (TextUtils.isEmpty(this.h.get("onfailure")) || this.b.a(this.h.get("onfailure"), false, this.e, this.f, this.c, this.d)) {
            return;
        }
        xj a = x1.a(this.h.get("onfailure"), this.c.i());
        if (a != null) {
            this.c.a(a);
        }
        if (this.b.a(this.h.get("onfailure"), false, false, this.c, false, false, this.g, this.d) > 0) {
            this.b.E();
        }
    }

    public void g() {
        if (TextUtils.isEmpty(this.h.get("onsuccess")) || this.b.a(this.h.get("onsuccess"), false, this.e, this.f, this.c, this.d)) {
            return;
        }
        xj a = x1.a(this.h.get("onsuccess"), this.c.i());
        if (a != null) {
            this.c.a(a);
        }
        if (this.b.a(this.h.get("onsuccess"), false, false, this.c, false, false, this.g, this.d) > 0) {
            this.b.E();
        }
    }
}
