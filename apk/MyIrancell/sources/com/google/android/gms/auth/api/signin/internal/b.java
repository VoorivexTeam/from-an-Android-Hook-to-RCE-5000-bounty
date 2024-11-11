package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

/* loaded from: classes.dex */
public class b {
    private static final Lock c = new ReentrantLock();

    @GuardedBy("sLk")
    private static b d;
    private final Lock a = new ReentrantLock();

    @GuardedBy("mLk")
    private final SharedPreferences b;

    private b(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @Nullable
    private final GoogleSignInAccount a(String str) {
        String c2;
        if (!TextUtils.isEmpty(str) && (c2 = c(b("googleSignInAccount", str))) != null) {
            try {
                return GoogleSignInAccount.a(c2);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public static b a(Context context) {
        com.google.android.gms.common.internal.u.a(context);
        c.lock();
        try {
            if (d == null) {
                d = new b(context.getApplicationContext());
            }
            return d;
        } finally {
            c.unlock();
        }
    }

    private final void a(String str, String str2) {
        this.a.lock();
        try {
            this.b.edit().putString(str, str2).apply();
        } finally {
            this.a.unlock();
        }
    }

    @Nullable
    private final GoogleSignInOptions b(String str) {
        String c2;
        if (!TextUtils.isEmpty(str) && (c2 = c(b("googleSignInOptions", str))) != null) {
            try {
                return GoogleSignInOptions.a(c2);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    private static String b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    @Nullable
    private final String c(String str) {
        this.a.lock();
        try {
            return this.b.getString(str, null);
        } finally {
            this.a.unlock();
        }
    }

    private final void d(String str) {
        this.a.lock();
        try {
            this.b.edit().remove(str).apply();
        } finally {
            this.a.unlock();
        }
    }

    public void a() {
        this.a.lock();
        try {
            this.b.edit().clear().apply();
        } finally {
            this.a.unlock();
        }
    }

    public void a(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        com.google.android.gms.common.internal.u.a(googleSignInAccount);
        com.google.android.gms.common.internal.u.a(googleSignInOptions);
        a("defaultGoogleSignInAccount", googleSignInAccount.s());
        com.google.android.gms.common.internal.u.a(googleSignInAccount);
        com.google.android.gms.common.internal.u.a(googleSignInOptions);
        String s = googleSignInAccount.s();
        a(b("googleSignInAccount", s), googleSignInAccount.t());
        a(b("googleSignInOptions", s), googleSignInOptions.q());
    }

    @Nullable
    public GoogleSignInAccount b() {
        return a(c("defaultGoogleSignInAccount"));
    }

    @Nullable
    public GoogleSignInOptions c() {
        return b(c("defaultGoogleSignInAccount"));
    }

    @Nullable
    public String d() {
        return c("refreshToken");
    }

    public final void e() {
        String c2 = c("defaultGoogleSignInAccount");
        d("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(c2)) {
            return;
        }
        d(b("googleSignInAccount", c2));
        d(b("googleSignInOptions", c2));
    }
}
