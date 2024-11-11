package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.j2;
import com.google.android.gms.common.api.internal.q0;
import com.google.android.gms.common.api.internal.q2;
import com.google.android.gms.common.api.internal.w1;
import com.google.android.gms.common.internal.e;
import defpackage.c0;
import defpackage.vr;
import defpackage.xr;
import defpackage.yr;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;

@Deprecated
/* loaded from: classes.dex */
public abstract class f {

    @GuardedBy("sAllClients")
    private static final Set<f> a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    /* loaded from: classes.dex */
    public static final class a {
        private Account a;
        private int d;
        private View e;
        private String f;
        private String g;
        private final Context i;
        private com.google.android.gms.common.api.internal.i k;
        private c m;
        private Looper n;
        private final Set<Scope> b = new HashSet();
        private final Set<Scope> c = new HashSet();
        private final Map<com.google.android.gms.common.api.a<?>, e.b> h = new c0();
        private final Map<com.google.android.gms.common.api.a<?>, a.d> j = new c0();
        private int l = -1;
        private com.google.android.gms.common.c o = com.google.android.gms.common.c.a();
        private a.AbstractC0041a<? extends yr, vr> p = xr.c;
        private final ArrayList<b> q = new ArrayList<>();
        private final ArrayList<c> r = new ArrayList<>();

        public a(Context context) {
            this.i = context;
            this.n = context.getMainLooper();
            this.f = context.getPackageName();
            this.g = context.getClass().getName();
        }

        public final a a(Handler handler) {
            com.google.android.gms.common.internal.u.a(handler, (Object) "Handler must not be null");
            this.n = handler.getLooper();
            return this;
        }

        public final a a(com.google.android.gms.common.api.a<? extends a.d.e> aVar) {
            com.google.android.gms.common.internal.u.a(aVar, "Api must not be null");
            this.j.put(aVar, null);
            List<Scope> a = aVar.c().a(null);
            this.c.addAll(a);
            this.b.addAll(a);
            return this;
        }

        public final <O extends a.d.c> a a(com.google.android.gms.common.api.a<O> aVar, O o) {
            com.google.android.gms.common.internal.u.a(aVar, "Api must not be null");
            com.google.android.gms.common.internal.u.a(o, "Null options are not permitted for this Api");
            this.j.put(aVar, o);
            List<Scope> a = aVar.c().a(o);
            this.c.addAll(a);
            this.b.addAll(a);
            return this;
        }

        public final a a(b bVar) {
            com.google.android.gms.common.internal.u.a(bVar, "Listener must not be null");
            this.q.add(bVar);
            return this;
        }

        public final a a(c cVar) {
            com.google.android.gms.common.internal.u.a(cVar, "Listener must not be null");
            this.r.add(cVar);
            return this;
        }

        /* JADX WARN: Type inference failed for: r4v18, types: [com.google.android.gms.common.api.a$f, java.lang.Object] */
        public final f a() {
            com.google.android.gms.common.internal.u.a(!this.j.isEmpty(), "must call addApi() to add at least one API");
            com.google.android.gms.common.internal.e b = b();
            com.google.android.gms.common.api.a<?> aVar = null;
            Map<com.google.android.gms.common.api.a<?>, e.b> f = b.f();
            c0 c0Var = new c0();
            c0 c0Var2 = new c0();
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (com.google.android.gms.common.api.a<?> aVar2 : this.j.keySet()) {
                a.d dVar = this.j.get(aVar2);
                boolean z2 = f.get(aVar2) != null;
                c0Var.put(aVar2, Boolean.valueOf(z2));
                q2 q2Var = new q2(aVar2, z2);
                arrayList.add(q2Var);
                a.AbstractC0041a<?, ?> d = aVar2.d();
                ?? a = d.a(this.i, this.n, b, (com.google.android.gms.common.internal.e) dVar, (b) q2Var, (c) q2Var);
                c0Var2.put(aVar2.a(), a);
                if (d.a() == 1) {
                    z = dVar != null;
                }
                if (a.e()) {
                    if (aVar != null) {
                        String b2 = aVar2.b();
                        String b3 = aVar.b();
                        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 21 + String.valueOf(b3).length());
                        sb.append(b2);
                        sb.append(" cannot be used with ");
                        sb.append(b3);
                        throw new IllegalStateException(sb.toString());
                    }
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                if (z) {
                    String b4 = aVar.b();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(b4).length() + 82);
                    sb2.append("With using ");
                    sb2.append(b4);
                    sb2.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                    throw new IllegalStateException(sb2.toString());
                }
                com.google.android.gms.common.internal.u.b(this.a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", aVar.b());
                com.google.android.gms.common.internal.u.b(this.b.equals(this.c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", aVar.b());
            }
            q0 q0Var = new q0(this.i, new ReentrantLock(), this.n, b, this.o, this.p, c0Var, this.q, this.r, c0Var2, this.l, q0.a((Iterable<a.f>) c0Var2.values(), true), arrayList, false);
            synchronized (f.a) {
                f.a.add(q0Var);
            }
            if (this.l >= 0) {
                j2.b(this.k).a(this.l, q0Var, this.m);
            }
            return q0Var;
        }

        public final com.google.android.gms.common.internal.e b() {
            vr vrVar = vr.k;
            if (this.j.containsKey(xr.e)) {
                vrVar = (vr) this.j.get(xr.e);
            }
            return new com.google.android.gms.common.internal.e(this.a, this.b, this.h, this.d, this.e, this.f, this.g, vrVar, false);
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface b extends com.google.android.gms.common.api.internal.f {
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface c extends com.google.android.gms.common.api.internal.m {
    }

    public static Set<f> h() {
        Set<f> set;
        synchronized (a) {
            set = a;
        }
        return set;
    }

    public abstract ConnectionResult a();

    public <A extends a.b, R extends m, T extends com.google.android.gms.common.api.internal.d<R, A>> T a(T t) {
        throw new UnsupportedOperationException();
    }

    public abstract void a(c cVar);

    public void a(w1 w1Var) {
        throw new UnsupportedOperationException();
    }

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public boolean a(com.google.android.gms.common.api.internal.o oVar) {
        throw new UnsupportedOperationException();
    }

    public abstract h<Status> b();

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends m, A>> T b(T t) {
        throw new UnsupportedOperationException();
    }

    public abstract void b(c cVar);

    public abstract void c();

    public abstract void d();

    public Context e() {
        throw new UnsupportedOperationException();
    }

    public Looper f() {
        throw new UnsupportedOperationException();
    }

    public void g() {
        throw new UnsupportedOperationException();
    }
}
