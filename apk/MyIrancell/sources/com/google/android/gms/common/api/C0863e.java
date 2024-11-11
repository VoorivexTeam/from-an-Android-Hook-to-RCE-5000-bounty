package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.AbstractC0864f;
import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.api.C0859a.d;
import com.google.android.gms.common.api.internal.AbstractC0885d;
import com.google.android.gms.common.api.internal.AbstractC0927n;
import com.google.android.gms.common.api.internal.AbstractC0943r;
import com.google.android.gms.common.api.internal.AbstractC0951t;
import com.google.android.gms.common.api.internal.BinderC0953t1;
import com.google.android.gms.common.api.internal.C0870a;
import com.google.android.gms.common.api.internal.C0875b;
import com.google.android.gms.common.api.internal.C0899g;
import com.google.android.gms.common.api.internal.C0909i1;
import com.google.android.gms.common.api.internal.C0915k;
import com.google.android.gms.common.api.internal.InterfaceC0935p;
import com.google.android.gms.common.internal.C1022e;
import com.google.android.gms.common.internal.C1057u;
import java.util.Collections;
import p000.AbstractC2871ks;
import p000.C2908ls;

/* renamed from: com.google.android.gms.common.api.e */
/* loaded from: classes.dex */
public class C0863e<O extends C0859a.d> implements InterfaceC0865g<O> {

    /* renamed from: a */
    private final Context f5682a;

    /* renamed from: b */
    private final C0859a<O> f5683b;

    /* renamed from: c */
    private final O f5684c;

    /* renamed from: d */
    private final C0875b<O> f5685d;

    /* renamed from: e */
    private final Looper f5686e;

    /* renamed from: f */
    private final int f5687f;

    /* renamed from: g */
    private final AbstractC0864f f5688g;

    /* renamed from: h */
    private final InterfaceC0935p f5689h;

    /* renamed from: i */
    protected final C0899g f5690i;

    /* renamed from: com.google.android.gms.common.api.e$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: c */
        public static final a f5691c = new C3562a().m6548a();

        /* renamed from: a */
        public final InterfaceC0935p f5692a;

        /* renamed from: b */
        public final Looper f5693b;

        /* renamed from: com.google.android.gms.common.api.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C3562a {

            /* renamed from: a */
            private InterfaceC0935p f5694a;

            /* renamed from: b */
            private Looper f5695b;

            /* renamed from: a */
            public C3562a m6547a(InterfaceC0935p interfaceC0935p) {
                C1057u.m7287a(interfaceC0935p, "StatusExceptionMapper must not be null.");
                this.f5694a = interfaceC0935p;
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: a */
            public a m6548a() {
                if (this.f5694a == null) {
                    this.f5694a = new C0870a();
                }
                if (this.f5695b == null) {
                    this.f5695b = Looper.getMainLooper();
                }
                return new a(this.f5694a, this.f5695b);
            }
        }

        private a(InterfaceC0935p interfaceC0935p, Account account, Looper looper) {
            this.f5692a = interfaceC0935p;
            this.f5693b = looper;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C0863e(Context context, C0859a<O> c0859a, Looper looper) {
        C1057u.m7287a(context, "Null context is not permitted.");
        C1057u.m7287a(c0859a, "Api must not be null.");
        C1057u.m7287a(looper, "Looper must not be null.");
        this.f5682a = context.getApplicationContext();
        this.f5683b = c0859a;
        this.f5684c = null;
        this.f5686e = looper;
        this.f5685d = C0875b.m6615a(c0859a);
        this.f5688g = new C0909i1(this);
        C0899g m6693a = C0899g.m6693a(this.f5682a);
        this.f5690i = m6693a;
        this.f5687f = m6693a.m6717b();
        this.f5689h = new C0870a();
    }

    public C0863e(Context context, C0859a<O> c0859a, O o, a aVar) {
        C1057u.m7287a(context, "Null context is not permitted.");
        C1057u.m7287a(c0859a, "Api must not be null.");
        C1057u.m7287a(aVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f5682a = context.getApplicationContext();
        this.f5683b = c0859a;
        this.f5684c = o;
        this.f5686e = aVar.f5693b;
        this.f5685d = C0875b.m6616a(c0859a, o);
        this.f5688g = new C0909i1(this);
        C0899g m6693a = C0899g.m6693a(this.f5682a);
        this.f5690i = m6693a;
        this.f5687f = m6693a.m6717b();
        this.f5689h = aVar.f5692a;
        this.f5690i.m6714a((C0863e<?>) this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0863e(android.content.Context r2, com.google.android.gms.common.api.C0859a<O> r3, O r4, com.google.android.gms.common.api.internal.InterfaceC0935p r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.e$a$a r0 = new com.google.android.gms.common.api.e$a$a
            r0.<init>()
            r0.m6547a(r5)
            com.google.android.gms.common.api.e$a r5 = r0.m6548a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C0863e.<init>(android.content.Context, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, com.google.android.gms.common.api.internal.p):void");
    }

    /* renamed from: a */
    private final <A extends C0859a.b, T extends AbstractC0885d<? extends InterfaceC0982m, A>> T m6531a(int i, T t) {
        t.m6591f();
        this.f5690i.m6715a(this, i, (AbstractC0885d<? extends InterfaceC0982m, C0859a.b>) t);
        return t;
    }

    /* renamed from: a */
    private final <TResult, A extends C0859a.b> AbstractC2871ks<TResult> m6532a(int i, AbstractC0943r<A, TResult> abstractC0943r) {
        C2908ls c2908ls = new C2908ls();
        this.f5690i.m6716a(this, i, abstractC0943r, c2908ls, this.f5689h);
        return c2908ls.m13924a();
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [com.google.android.gms.common.api.a$f] */
    /* renamed from: a */
    public C0859a.f mo6533a(Looper looper, C0899g.a<O> aVar) {
        return this.f5683b.m6505d().mo6386a(this.f5682a, looper, m6542c().m7131a(), (C1022e) this.f5684c, (AbstractC0864f.b) aVar, (AbstractC0864f.c) aVar);
    }

    @Override // com.google.android.gms.common.api.InterfaceC0865g
    /* renamed from: a */
    public C0875b<O> mo6534a() {
        return this.f5685d;
    }

    /* renamed from: a */
    public <A extends C0859a.b, T extends AbstractC0885d<? extends InterfaceC0982m, A>> T m6535a(T t) {
        m6531a(0, (int) t);
        return t;
    }

    /* renamed from: a */
    public BinderC0953t1 mo6536a(Context context, Handler handler) {
        return new BinderC0953t1(context, handler, m6542c().m7131a());
    }

    /* renamed from: a */
    public AbstractC2871ks<Boolean> m6537a(C0915k.a<?> aVar) {
        C1057u.m7287a(aVar, "Listener key cannot be null.");
        return this.f5690i.m6709a(this, aVar);
    }

    @Deprecated
    /* renamed from: a */
    public <A extends C0859a.b, T extends AbstractC0927n<A, ?>, U extends AbstractC0951t<A, ?>> AbstractC2871ks<Void> m6538a(T t, U u) {
        C1057u.m7286a(t);
        C1057u.m7286a(u);
        C1057u.m7287a(t.m6817b(), "Listener has already been released.");
        C1057u.m7287a(u.m6877a(), "Listener has already been released.");
        C1057u.m7294a(t.m6817b().equals(u.m6877a()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.f5690i.m6710a(this, (AbstractC0927n<C0859a.b, ?>) t, (AbstractC0951t<C0859a.b, ?>) u);
    }

    /* renamed from: a */
    public <TResult, A extends C0859a.b> AbstractC2871ks<TResult> m6539a(AbstractC0943r<A, TResult> abstractC0943r) {
        return m6532a(1, abstractC0943r);
    }

    /* renamed from: b */
    public AbstractC0864f m6540b() {
        return this.f5688g;
    }

    /* renamed from: b */
    public <A extends C0859a.b, T extends AbstractC0885d<? extends InterfaceC0982m, A>> T m6541b(T t) {
        m6531a(1, (int) t);
        return t;
    }

    /* renamed from: c */
    protected C1022e.a m6542c() {
        Account m6507d;
        GoogleSignInAccount m6508i;
        GoogleSignInAccount m6508i2;
        C1022e.a aVar = new C1022e.a();
        O o = this.f5684c;
        if (!(o instanceof C0859a.d.b) || (m6508i2 = ((C0859a.d.b) o).m6508i()) == null) {
            O o2 = this.f5684c;
            m6507d = o2 instanceof C0859a.d.a ? ((C0859a.d.a) o2).m6507d() : null;
        } else {
            m6507d = m6508i2.m6392d();
        }
        aVar.m7128a(m6507d);
        O o3 = this.f5684c;
        aVar.m7130a((!(o3 instanceof C0859a.d.b) || (m6508i = ((C0859a.d.b) o3).m6508i()) == null) ? Collections.emptySet() : m6508i.m6400q());
        aVar.m7129a(this.f5682a.getClass().getName());
        aVar.m7132b(this.f5682a.getPackageName());
        return aVar;
    }

    /* renamed from: d */
    public final C0859a<O> m6543d() {
        return this.f5683b;
    }

    /* renamed from: e */
    public Context m6544e() {
        return this.f5682a;
    }

    /* renamed from: f */
    public final int m6545f() {
        return this.f5687f;
    }

    /* renamed from: g */
    public Looper m6546g() {
        return this.f5686e;
    }
}
