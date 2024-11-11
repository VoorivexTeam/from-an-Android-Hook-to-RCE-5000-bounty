package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: com.google.android.gms.auth.api.signin.internal.m */
/* loaded from: classes.dex */
public final class C0845m {

    /* renamed from: d */
    private static C0845m f5650d;

    /* renamed from: a */
    private C0834b f5651a;

    /* renamed from: b */
    private GoogleSignInAccount f5652b;

    /* renamed from: c */
    private GoogleSignInOptions f5653c;

    private C0845m(Context context) {
        C0834b m6442a = C0834b.m6442a(context);
        this.f5651a = m6442a;
        this.f5652b = m6442a.m6450b();
        this.f5653c = this.f5651a.m6451c();
    }

    /* renamed from: a */
    public static synchronized C0845m m6474a(Context context) {
        C0845m m6475b;
        synchronized (C0845m.class) {
            m6475b = m6475b(context.getApplicationContext());
        }
        return m6475b;
    }

    /* renamed from: b */
    private static synchronized C0845m m6475b(Context context) {
        C0845m c0845m;
        synchronized (C0845m.class) {
            if (f5650d == null) {
                f5650d = new C0845m(context);
            }
            c0845m = f5650d;
        }
        return c0845m;
    }

    /* renamed from: a */
    public final synchronized void m6476a() {
        this.f5651a.m6448a();
    }

    /* renamed from: a */
    public final synchronized void m6477a(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f5651a.m6449a(googleSignInAccount, googleSignInOptions);
        this.f5652b = googleSignInAccount;
        this.f5653c = googleSignInOptions;
    }
}
