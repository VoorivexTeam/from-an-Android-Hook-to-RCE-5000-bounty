package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.i1;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.api.internal.t1;
import com.google.android.gms.common.internal.e;
import defpackage.ks;
import defpackage.ls;
import java.util.Collections;

/* loaded from: classes.dex */
public class e<O extends a.d> implements g<O> {
    private final Context a;
    private final com.google.android.gms.common.api.a<O> b;
    private final O c;
    private final com.google.android.gms.common.api.internal.b<O> d;
    private final Looper e;
    private final int f;
    private final f g;
    private final com.google.android.gms.common.api.internal.p h;
    protected final com.google.android.gms.common.api.internal.g i;

    /* loaded from: classes.dex */
    public static class a {
        public static final a c = new C0044a().a();
        public final com.google.android.gms.common.api.internal.p a;
        public final Looper b;

        /* renamed from: com.google.android.gms.common.api.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0044a {
            private com.google.android.gms.common.api.internal.p a;
            private Looper b;

            public C0044a a(com.google.android.gms.common.api.internal.p pVar) {
                com.google.android.gms.common.internal.u.a(pVar, "StatusExceptionMapper must not be null.");
                this.a = pVar;
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a a() {
                if (this.a == null) {
                    this.a = new com.google.android.gms.common.api.internal.a();
                }
                if (this.b == null) {
                    this.b = Looper.getMainLooper();
                }
                return new a(this.a, this.b);
            }
        }

        private a(com.google.android.gms.common.api.internal.p pVar, Account account, Looper looper) {
            this.a = pVar;
            this.b = looper;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e(Context context, com.google.android.gms.common.api.a<O> aVar, Looper looper) {
        com.google.android.gms.common.internal.u.a(context, "Null context is not permitted.");
        com.google.android.gms.common.internal.u.a(aVar, "Api must not be null.");
        com.google.android.gms.common.internal.u.a(looper, "Looper must not be null.");
        this.a = context.getApplicationContext();
        this.b = aVar;
        this.c = null;
        this.e = looper;
        this.d = com.google.android.gms.common.api.internal.b.a(aVar);
        this.g = new i1(this);
        com.google.android.gms.common.api.internal.g a2 = com.google.android.gms.common.api.internal.g.a(this.a);
        this.i = a2;
        this.f = a2.b();
        this.h = new com.google.android.gms.common.api.internal.a();
    }

    public e(Context context, com.google.android.gms.common.api.a<O> aVar, O o, a aVar2) {
        com.google.android.gms.common.internal.u.a(context, "Null context is not permitted.");
        com.google.android.gms.common.internal.u.a(aVar, "Api must not be null.");
        com.google.android.gms.common.internal.u.a(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.a = context.getApplicationContext();
        this.b = aVar;
        this.c = o;
        this.e = aVar2.b;
        this.d = com.google.android.gms.common.api.internal.b.a(aVar, o);
        this.g = new i1(this);
        com.google.android.gms.common.api.internal.g a2 = com.google.android.gms.common.api.internal.g.a(this.a);
        this.i = a2;
        this.f = a2.b();
        this.h = aVar2.a;
        this.i.a((e<?>) this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(android.content.Context r2, com.google.android.gms.common.api.a<O> r3, O r4, com.google.android.gms.common.api.internal.p r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.e$a$a r0 = new com.google.android.gms.common.api.e$a$a
            r0.<init>()
            r0.a(r5)
            com.google.android.gms.common.api.e$a r5 = r0.a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.e.<init>(android.content.Context, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, com.google.android.gms.common.api.internal.p):void");
    }

    private final <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends m, A>> T a(int i, T t) {
        t.f();
        this.i.a(this, i, (com.google.android.gms.common.api.internal.d<? extends m, a.b>) t);
        return t;
    }

    private final <TResult, A extends a.b> ks<TResult> a(int i, com.google.android.gms.common.api.internal.r<A, TResult> rVar) {
        ls lsVar = new ls();
        this.i.a(this, i, rVar, lsVar, this.h);
        return lsVar.a();
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [com.google.android.gms.common.api.a$f] */
    public a.f a(Looper looper, g.a<O> aVar) {
        return this.b.d().a(this.a, looper, c().a(), (com.google.android.gms.common.internal.e) this.c, (f.b) aVar, (f.c) aVar);
    }

    @Override // com.google.android.gms.common.api.g
    public com.google.android.gms.common.api.internal.b<O> a() {
        return this.d;
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends m, A>> T a(T t) {
        a(0, (int) t);
        return t;
    }

    public t1 a(Context context, Handler handler) {
        return new t1(context, handler, c().a());
    }

    public ks<Boolean> a(k.a<?> aVar) {
        com.google.android.gms.common.internal.u.a(aVar, "Listener key cannot be null.");
        return this.i.a(this, aVar);
    }

    @Deprecated
    public <A extends a.b, T extends com.google.android.gms.common.api.internal.n<A, ?>, U extends com.google.android.gms.common.api.internal.t<A, ?>> ks<Void> a(T t, U u) {
        com.google.android.gms.common.internal.u.a(t);
        com.google.android.gms.common.internal.u.a(u);
        com.google.android.gms.common.internal.u.a(t.b(), "Listener has already been released.");
        com.google.android.gms.common.internal.u.a(u.a(), "Listener has already been released.");
        com.google.android.gms.common.internal.u.a(t.b().equals(u.a()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.i.a(this, (com.google.android.gms.common.api.internal.n<a.b, ?>) t, (com.google.android.gms.common.api.internal.t<a.b, ?>) u);
    }

    public <TResult, A extends a.b> ks<TResult> a(com.google.android.gms.common.api.internal.r<A, TResult> rVar) {
        return a(1, rVar);
    }

    public f b() {
        return this.g;
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends m, A>> T b(T t) {
        a(1, (int) t);
        return t;
    }

    protected e.a c() {
        Account d;
        GoogleSignInAccount i;
        GoogleSignInAccount i2;
        e.a aVar = new e.a();
        O o = this.c;
        if (!(o instanceof a.d.b) || (i2 = ((a.d.b) o).i()) == null) {
            O o2 = this.c;
            d = o2 instanceof a.d.InterfaceC0042a ? ((a.d.InterfaceC0042a) o2).d() : null;
        } else {
            d = i2.d();
        }
        aVar.a(d);
        O o3 = this.c;
        aVar.a((!(o3 instanceof a.d.b) || (i = ((a.d.b) o3).i()) == null) ? Collections.emptySet() : i.q());
        aVar.a(this.a.getClass().getName());
        aVar.b(this.a.getPackageName());
        return aVar;
    }

    public final com.google.android.gms.common.api.a<O> d() {
        return this.b;
    }

    public Context e() {
        return this.a;
    }

    public final int f() {
        return this.f;
    }

    public Looper g() {
        return this.e;
    }
}
