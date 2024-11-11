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
import com.comviva.webaxn.p002ui.DialogFragmentC0674y;
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
import p000.C2899lj;
import p000.C2945mj;
import p000.C3400wj;
import p000.C3440xj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.utils.g0 */
/* loaded from: classes.dex */
public class C0703g0 {

    /* renamed from: m */
    private static C0703g0 f4798m;

    /* renamed from: a */
    private Context f4799a;

    /* renamed from: b */
    private C3400wj f4800b;

    /* renamed from: c */
    private C2945mj f4801c;

    /* renamed from: d */
    C2899lj f4802d;

    /* renamed from: e */
    private C3489yj f4803e;

    /* renamed from: f */
    private C0696e f4804f;

    /* renamed from: g */
    private String f4805g;

    /* renamed from: h */
    private HashMap<String, String> f4806h;

    /* renamed from: i */
    private KeyguardManager f4807i;

    /* renamed from: j */
    private FingerprintManager f4808j;

    /* renamed from: k */
    private KeyStore f4809k;

    /* renamed from: l */
    private KeyGenerator f4810l;

    private C0703g0(Context context) {
        this.f4799a = context;
        if (Build.VERSION.SDK_INT >= 23) {
            this.f4807i = (KeyguardManager) context.getSystemService(KeyguardManager.class);
            this.f4808j = (FingerprintManager) this.f4799a.getSystemService(FingerprintManager.class);
        }
    }

    /* renamed from: a */
    public static C0703g0 m5463a(Context context) {
        if (f4798m == null) {
            f4798m = new C0703g0(context);
        }
        return f4798m;
    }

    /* renamed from: a */
    private boolean m5464a(Cipher cipher, String str) {
        try {
            this.f4809k.load(null);
            cipher.init(1, (SecretKey) this.f4809k.getKey(str, null));
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

    /* renamed from: a */
    public void m5465a() {
        if (f4798m != null) {
            f4798m = null;
        }
        HashMap<String, String> hashMap = this.f4806h;
        if (hashMap != null) {
            hashMap.clear();
            this.f4806h = null;
        }
        if (this.f4807i != null) {
            this.f4807i = null;
        }
        if (this.f4808j != null) {
            this.f4808j = null;
        }
        this.f4799a = null;
        this.f4800b = null;
        this.f4803e = null;
        this.f4804f = null;
        this.f4801c = null;
        this.f4802d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m5466a(java.lang.String r1, p000.C3400wj r2, p000.C2945mj r3, p000.C2899lj r4, p000.C3489yj r5, com.comviva.webaxn.utils.C0696e r6, com.comviva.webaxn.p002ui.C0655o1 r7) {
        /*
            r0 = this;
            r0.f4800b = r2
            r0.f4801c = r3
            r0.f4802d = r4
            r0.f4803e = r5
            r0.f4804f = r6
            if (r5 == 0) goto L11
            java.lang.String r2 = r5.f14223j
        Le:
            r0.f4805g = r2
            goto L16
        L11:
            if (r6 == 0) goto L16
            java.lang.String r2 = r6.f4718j
            goto Le
        L16:
            java.util.HashMap<java.lang.String, java.lang.String> r2 = r0.f4806h
            if (r2 == 0) goto L1d
            r2.clear()
        L1d:
            java.util.HashMap r1 = com.comviva.webaxn.utils.C0755x1.m6188f(r1)
            r0.f4806h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.C0703g0.m5466a(java.lang.String, wj, mj, lj, yj, com.comviva.webaxn.utils.e, com.comviva.webaxn.ui.o1):void");
    }

    /* renamed from: a */
    public void m5467a(String str, boolean z) {
        try {
            this.f4809k.load(null);
            this.f4810l.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes("CBC").setUserAuthenticationRequired(true).setEncryptionPaddings("PKCS7Padding").build());
            this.f4810l.generateKey();
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

    /* renamed from: b */
    public void m5468b() {
        m5469c();
    }

    /* renamed from: c */
    public void m5469c() {
        DialogFragmentC0674y dialogFragmentC0674y;
        Activity activity;
        try {
            this.f4809k = KeyStore.getInstance("AndroidKeyStore");
            try {
                this.f4810l = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                try {
                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                    Cipher.getInstance("AES/CBC/PKCS7Padding");
                    try {
                        if (m5471e() && m5470d()) {
                            m5467a("default_key", true);
                            m5467a("key_not_invalidated", false);
                        }
                        if (m5464a(cipher, "default_key")) {
                            dialogFragmentC0674y = new DialogFragmentC0674y();
                            dialogFragmentC0674y.m5158a(new FingerprintManager.CryptoObject(cipher));
                            dialogFragmentC0674y.m5159a(DialogFragmentC0674y.d.FINGERPRINT);
                            activity = (Activity) this.f4799a;
                        } else {
                            dialogFragmentC0674y = new DialogFragmentC0674y();
                            dialogFragmentC0674y.m5158a(new FingerprintManager.CryptoObject(cipher));
                            dialogFragmentC0674y.m5159a(DialogFragmentC0674y.d.NEW_FINGERPRINT_ENROLLED);
                            activity = (Activity) this.f4799a;
                        }
                        dialogFragmentC0674y.show(activity.getFragmentManager(), "myFragment");
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

    /* renamed from: d */
    public boolean m5470d() {
        if (this.f4808j.hasEnrolledFingerprints()) {
            return true;
        }
        Toast.makeText(this.f4799a, "Go to 'Settings -> Security -> Fingerprint' and register at least one fingerprint", 1).show();
        return false;
    }

    /* renamed from: e */
    public boolean m5471e() {
        if (this.f4807i.isKeyguardSecure()) {
            return true;
        }
        Toast.makeText(this.f4799a, "Secure lock screen hasn't set up.\nGo to 'Settings -> Security -> Fingerprint' to set up a fingerprint", 1).show();
        return false;
    }

    /* renamed from: f */
    public void m5472f() {
        if (TextUtils.isEmpty(this.f4806h.get("onfailure")) || this.f4800b.m16298a(this.f4806h.get("onfailure"), false, this.f4803e, this.f4804f, this.f4801c, this.f4802d)) {
            return;
        }
        C3440xj m6134a = C0755x1.m6134a(this.f4806h.get("onfailure"), this.f4801c.m14145i());
        if (m6134a != null) {
            this.f4801c.m14121a(m6134a);
        }
        if (this.f4800b.m16263a(this.f4806h.get("onfailure"), false, false, this.f4801c, false, false, this.f4805g, this.f4802d) > 0) {
            this.f4800b.m16258E();
        }
    }

    /* renamed from: g */
    public void m5473g() {
        if (TextUtils.isEmpty(this.f4806h.get("onsuccess")) || this.f4800b.m16298a(this.f4806h.get("onsuccess"), false, this.f4803e, this.f4804f, this.f4801c, this.f4802d)) {
            return;
        }
        C3440xj m6134a = C0755x1.m6134a(this.f4806h.get("onsuccess"), this.f4801c.m14145i());
        if (m6134a != null) {
            this.f4801c.m14121a(m6134a);
        }
        if (this.f4800b.m16263a(this.f4806h.get("onsuccess"), false, false, this.f4801c, false, false, this.f4805g, this.f4802d) > 0) {
            this.f4800b.m16258E();
        }
    }
}
