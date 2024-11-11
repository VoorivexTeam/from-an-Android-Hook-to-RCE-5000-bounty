package com.google.android.gms.auth.api;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.g;
import com.google.android.gms.auth.api.signin.internal.h;
import com.google.android.gms.common.api.a;

/* loaded from: classes.dex */
public final class a {
    public static final a.g<com.google.android.gms.internal.p000authapi.e> a = new a.g<>();
    public static final a.g<h> b = new a.g<>();
    private static final a.AbstractC0041a<com.google.android.gms.internal.p000authapi.e, C0039a> c = new e();
    private static final a.AbstractC0041a<h, GoogleSignInOptions> d = new f();
    public static final com.google.android.gms.common.api.a<GoogleSignInOptions> e;
    public static final com.google.android.gms.auth.api.signin.a f;

    @Deprecated
    /* renamed from: com.google.android.gms.auth.api.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0039a implements a.d.f {
        private final boolean b;

        @Deprecated
        /* renamed from: com.google.android.gms.auth.api.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0040a {
            protected Boolean a = false;

            public C0039a a() {
                return new C0039a(this);
            }
        }

        static {
            new C0040a().a();
        }

        public C0039a(C0040a c0040a) {
            this.b = c0040a.a.booleanValue();
        }

        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", null);
            bundle.putBoolean("force_save_dialog", this.b);
            return bundle;
        }
    }

    static {
        com.google.android.gms.common.api.a<c> aVar = b.c;
        new com.google.android.gms.common.api.a("Auth.CREDENTIALS_API", c, a);
        e = new com.google.android.gms.common.api.a<>("Auth.GOOGLE_SIGN_IN_API", d, b);
        com.google.android.gms.auth.api.proxy.a aVar2 = b.d;
        new com.google.android.gms.internal.p000authapi.d();
        f = new g();
    }
}
