package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Base64;
import com.google.android.gms.common.util.C1108n;
import com.google.firebase.C2052c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.firebase.iid.k */
/* loaded from: classes.dex */
public final class C2103k {

    /* renamed from: a */
    private final Context f8918a;

    /* renamed from: b */
    @GuardedBy("this")
    private String f8919b;

    /* renamed from: c */
    @GuardedBy("this")
    private String f8920c;

    /* renamed from: d */
    @GuardedBy("this")
    private int f8921d;

    /* renamed from: e */
    @GuardedBy("this")
    private int f8922e = 0;

    public C2103k(Context context) {
        this.f8918a = context;
    }

    /* renamed from: a */
    private final PackageInfo m10654a(String str) {
        try {
            return this.f8918a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            sb.toString();
            return null;
        }
    }

    /* renamed from: a */
    public static String m10655a(C2052c c2052c) {
        String m10590b = c2052c.m10506c().m10590b();
        if (m10590b != null) {
            return m10590b;
        }
        String m10589a = c2052c.m10506c().m10589a();
        if (!m10589a.startsWith("1:")) {
            return m10589a;
        }
        String[] split = m10589a.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    public static String m10656a(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private final synchronized void m10657e() {
        PackageInfo m10654a = m10654a(this.f8918a.getPackageName());
        if (m10654a != null) {
            this.f8919b = Integer.toString(m10654a.versionCode);
            this.f8920c = m10654a.versionName;
        }
    }

    /* renamed from: a */
    public final synchronized int m10658a() {
        if (this.f8922e != 0) {
            return this.f8922e;
        }
        PackageManager packageManager = this.f8918a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        if (!C1108n.m7404j()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f8922e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f8922e = 2;
            return 2;
        }
        if (C1108n.m7404j()) {
            this.f8922e = 2;
        } else {
            this.f8922e = 1;
        }
        return this.f8922e;
    }

    /* renamed from: b */
    public final synchronized String m10659b() {
        if (this.f8919b == null) {
            m10657e();
        }
        return this.f8919b;
    }

    /* renamed from: c */
    public final synchronized String m10660c() {
        if (this.f8920c == null) {
            m10657e();
        }
        return this.f8920c;
    }

    /* renamed from: d */
    public final synchronized int m10661d() {
        PackageInfo m10654a;
        if (this.f8921d == 0 && (m10654a = m10654a("com.google.android.gms")) != null) {
            this.f8921d = m10654a.versionCode;
        }
        return this.f8921d;
    }
}
