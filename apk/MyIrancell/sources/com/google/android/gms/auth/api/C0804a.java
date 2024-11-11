package com.google.android.gms.auth.api;

import android.os.Bundle;
import com.google.android.gms.auth.api.proxy.InterfaceC0822a;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.InterfaceC0826a;
import com.google.android.gms.auth.api.signin.internal.C0839g;
import com.google.android.gms.auth.api.signin.internal.C0840h;
import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.internal.p003authapi.C1142d;
import com.google.android.gms.internal.p003authapi.C1143e;

/* renamed from: com.google.android.gms.auth.api.a */
/* loaded from: classes.dex */
public final class C0804a {

    /* renamed from: a */
    public static final C0859a.g<C1143e> f5490a = new C0859a.g<>();

    /* renamed from: b */
    public static final C0859a.g<C0840h> f5491b = new C0859a.g<>();

    /* renamed from: c */
    private static final C0859a.a<C1143e, a> f5492c = new C0820e();

    /* renamed from: d */
    private static final C0859a.a<C0840h, GoogleSignInOptions> f5493d = new C0821f();

    /* renamed from: e */
    public static final C0859a<GoogleSignInOptions> f5494e;

    /* renamed from: f */
    public static final InterfaceC0826a f5495f;

    @Deprecated
    /* renamed from: com.google.android.gms.auth.api.a$a */
    /* loaded from: classes.dex */
    public static class a implements C0859a.d.f {

        /* renamed from: b */
        private final boolean f5496b;

        @Deprecated
        /* renamed from: com.google.android.gms.auth.api.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C3560a {

            /* renamed from: a */
            protected Boolean f5497a = false;

            /* renamed from: a */
            public a m6349a() {
                return new a(this);
            }
        }

        static {
            new C3560a().m6349a();
        }

        public a(C3560a c3560a) {
            this.f5496b = c3560a.f5497a.booleanValue();
        }

        /* renamed from: a */
        public final Bundle m6348a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", null);
            bundle.putBoolean("force_save_dialog", this.f5496b);
            return bundle;
        }
    }

    static {
        C0859a<C0811c> c0859a = C0810b.f5532c;
        new C0859a("Auth.CREDENTIALS_API", f5492c, f5490a);
        f5494e = new C0859a<>("Auth.GOOGLE_SIGN_IN_API", f5493d, f5491b);
        InterfaceC0822a interfaceC0822a = C0810b.f5533d;
        new C1142d();
        f5495f = new C0839g();
    }
}
