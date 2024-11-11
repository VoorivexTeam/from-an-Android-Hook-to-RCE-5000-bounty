package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* loaded from: classes.dex */
public final class m {
    private static m d;
    private b a;
    private GoogleSignInAccount b;
    private GoogleSignInOptions c;

    private m(Context context) {
        b a = b.a(context);
        this.a = a;
        this.b = a.b();
        this.c = this.a.c();
    }

    public static synchronized m a(Context context) {
        m b;
        synchronized (m.class) {
            b = b(context.getApplicationContext());
        }
        return b;
    }

    private static synchronized m b(Context context) {
        m mVar;
        synchronized (m.class) {
            if (d == null) {
                d = new m(context);
            }
            mVar = d;
        }
        return mVar;
    }

    public final synchronized void a() {
        this.a.a();
    }

    public final synchronized void a(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.a.a(googleSignInAccount, googleSignInOptions);
        this.b = googleSignInAccount;
        this.c = googleSignInOptions;
    }
}
