package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.C1057u;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

/* renamed from: com.google.android.gms.auth.api.signin.internal.b */
/* loaded from: classes.dex */
public class C0834b {

    /* renamed from: c */
    private static final Lock f5638c = new ReentrantLock();

    /* renamed from: d */
    @GuardedBy("sLk")
    private static C0834b f5639d;

    /* renamed from: a */
    private final Lock f5640a = new ReentrantLock();

    /* renamed from: b */
    @GuardedBy("mLk")
    private final SharedPreferences f5641b;

    private C0834b(Context context) {
        this.f5641b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @Nullable
    /* renamed from: a */
    private final GoogleSignInAccount m6441a(String str) {
        String m6446c;
        if (!TextUtils.isEmpty(str) && (m6446c = m6446c(m6445b("googleSignInAccount", str))) != null) {
            try {
                return GoogleSignInAccount.m6389a(m6446c);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C0834b m6442a(Context context) {
        C1057u.m7286a(context);
        f5638c.lock();
        try {
            if (f5639d == null) {
                f5639d = new C0834b(context.getApplicationContext());
            }
            return f5639d;
        } finally {
            f5638c.unlock();
        }
    }

    /* renamed from: a */
    private final void m6443a(String str, String str2) {
        this.f5640a.lock();
        try {
            this.f5641b.edit().putString(str, str2).apply();
        } finally {
            this.f5640a.unlock();
        }
    }

    @Nullable
    /* renamed from: b */
    private final GoogleSignInOptions m6444b(String str) {
        String m6446c;
        if (!TextUtils.isEmpty(str) && (m6446c = m6446c(m6445b("googleSignInOptions", str))) != null) {
            try {
                return GoogleSignInOptions.m6404a(m6446c);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    private static String m6445b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    @Nullable
    /* renamed from: c */
    private final String m6446c(String str) {
        this.f5640a.lock();
        try {
            return this.f5641b.getString(str, null);
        } finally {
            this.f5640a.unlock();
        }
    }

    /* renamed from: d */
    private final void m6447d(String str) {
        this.f5640a.lock();
        try {
            this.f5641b.edit().remove(str).apply();
        } finally {
            this.f5640a.unlock();
        }
    }

    /* renamed from: a */
    public void m6448a() {
        this.f5640a.lock();
        try {
            this.f5641b.edit().clear().apply();
        } finally {
            this.f5640a.unlock();
        }
    }

    /* renamed from: a */
    public void m6449a(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        C1057u.m7286a(googleSignInAccount);
        C1057u.m7286a(googleSignInOptions);
        m6443a("defaultGoogleSignInAccount", googleSignInAccount.m6402s());
        C1057u.m7286a(googleSignInAccount);
        C1057u.m7286a(googleSignInOptions);
        String m6402s = googleSignInAccount.m6402s();
        m6443a(m6445b("googleSignInAccount", m6402s), googleSignInAccount.m6403t());
        m6443a(m6445b("googleSignInOptions", m6402s), googleSignInOptions.m6425q());
    }

    @Nullable
    /* renamed from: b */
    public GoogleSignInAccount m6450b() {
        return m6441a(m6446c("defaultGoogleSignInAccount"));
    }

    @Nullable
    /* renamed from: c */
    public GoogleSignInOptions m6451c() {
        return m6444b(m6446c("defaultGoogleSignInAccount"));
    }

    @Nullable
    /* renamed from: d */
    public String m6452d() {
        return m6446c("refreshToken");
    }

    /* renamed from: e */
    public final void m6453e() {
        String m6446c = m6446c("defaultGoogleSignInAccount");
        m6447d("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(m6446c)) {
            return;
        }
        m6447d(m6445b("googleSignInAccount", m6446c));
        m6447d(m6445b("googleSignInOptions", m6446c));
    }
}
