package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.s;
import defpackage.jq;
import defpackage.ks;
import defpackage.ls;
import defpackage.yr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public class g implements Handler.Callback {
    public static final Status n = new Status(4, "Sign-out occurred while this API call was in progress.");
    private static final Status o = new Status(4, "The user must be signed in to make this API call.");
    private static final Object p = new Object();

    @GuardedBy("lock")
    private static g q;
    private final Context d;
    private final com.google.android.gms.common.c e;
    private final com.google.android.gms.common.internal.l f;
    private final Handler m;
    private long a = 5000;
    private long b = 120000;
    private long c = 10000;
    private final AtomicInteger g = new AtomicInteger(1);
    private final AtomicInteger h = new AtomicInteger(0);
    private final Map<com.google.android.gms.common.api.internal.b<?>, a<?>> i = new ConcurrentHashMap(5, 0.75f, 1);

    @GuardedBy("lock")
    private x j = null;

    @GuardedBy("lock")
    private final Set<com.google.android.gms.common.api.internal.b<?>> k = new defpackage.d0();
    private final Set<com.google.android.gms.common.api.internal.b<?>> l = new defpackage.d0();

    /* loaded from: classes.dex */
    public class a<O extends a.d> implements f.b, f.c, s2 {
        private final a.f b;
        private final a.b c;
        private final com.google.android.gms.common.api.internal.b<O> d;
        private final a3 e;
        private final int h;
        private final t1 i;
        private boolean j;
        private final Queue<q1> a = new LinkedList();
        private final Set<k2> f = new HashSet();
        private final Map<k.a<?>, p1> g = new HashMap();
        private final List<c> k = new ArrayList();
        private ConnectionResult l = null;

        public a(com.google.android.gms.common.api.e<O> eVar) {
            a.f a = eVar.a(g.this.m.getLooper(), this);
            this.b = a;
            this.c = a instanceof com.google.android.gms.common.internal.v ? ((com.google.android.gms.common.internal.v) a).F() : a;
            this.d = eVar.a();
            this.e = new a3();
            this.h = eVar.f();
            if (this.b.n()) {
                this.i = eVar.a(g.this.d, g.this.m);
            } else {
                this.i = null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final Feature a(Feature[] featureArr) {
            if (featureArr != null && featureArr.length != 0) {
                Feature[] k = this.b.k();
                if (k == null) {
                    k = new Feature[0];
                }
                defpackage.c0 c0Var = new defpackage.c0(k.length);
                for (Feature feature : k) {
                    c0Var.put(feature.j(), Long.valueOf(feature.k()));
                }
                for (Feature feature2 : featureArr) {
                    if (!c0Var.containsKey(feature2.j()) || ((Long) c0Var.get(feature2.j())).longValue() < feature2.k()) {
                        return feature2;
                    }
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a(c cVar) {
            if (this.k.contains(cVar) && !this.j) {
                if (this.b.a()) {
                    p();
                } else {
                    a();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean a(boolean z) {
            com.google.android.gms.common.internal.u.a(g.this.m);
            if (!this.b.a() || this.g.size() != 0) {
                return false;
            }
            if (!this.e.a()) {
                this.b.b();
                return true;
            }
            if (z) {
                r();
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(c cVar) {
            Feature[] b;
            if (this.k.remove(cVar)) {
                g.this.m.removeMessages(15, cVar);
                g.this.m.removeMessages(16, cVar);
                Feature feature = cVar.b;
                ArrayList arrayList = new ArrayList(this.a.size());
                for (q1 q1Var : this.a) {
                    if ((q1Var instanceof u0) && (b = ((u0) q1Var).b((a<?>) this)) != null && com.google.android.gms.common.util.b.a(b, feature)) {
                        arrayList.add(q1Var);
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    q1 q1Var2 = (q1) obj;
                    this.a.remove(q1Var2);
                    q1Var2.a(new com.google.android.gms.common.api.r(feature));
                }
            }
        }

        private final boolean b(q1 q1Var) {
            if (!(q1Var instanceof u0)) {
                c(q1Var);
                return true;
            }
            u0 u0Var = (u0) q1Var;
            Feature a = a(u0Var.b((a<?>) this));
            if (a == null) {
                c(q1Var);
                return true;
            }
            if (!u0Var.c(this)) {
                u0Var.a(new com.google.android.gms.common.api.r(a));
                return false;
            }
            c cVar = new c(this.d, a, null);
            int indexOf = this.k.indexOf(cVar);
            if (indexOf >= 0) {
                c cVar2 = this.k.get(indexOf);
                g.this.m.removeMessages(15, cVar2);
                g.this.m.sendMessageDelayed(Message.obtain(g.this.m, 15, cVar2), g.this.a);
                return false;
            }
            this.k.add(cVar);
            g.this.m.sendMessageDelayed(Message.obtain(g.this.m, 15, cVar), g.this.a);
            g.this.m.sendMessageDelayed(Message.obtain(g.this.m, 16, cVar), g.this.b);
            ConnectionResult connectionResult = new ConnectionResult(2, null);
            if (c(connectionResult)) {
                return false;
            }
            g.this.b(connectionResult, this.h);
            return false;
        }

        private final void c(q1 q1Var) {
            q1Var.a(this.e, d());
            try {
                q1Var.a((a<?>) this);
            } catch (DeadObjectException unused) {
                a(1);
                this.b.b();
            }
        }

        private final boolean c(ConnectionResult connectionResult) {
            synchronized (g.p) {
                if (g.this.j == null || !g.this.k.contains(this.d)) {
                    return false;
                }
                g.this.j.b(connectionResult, this.h);
                return true;
            }
        }

        private final void d(ConnectionResult connectionResult) {
            for (k2 k2Var : this.f) {
                String str = null;
                if (com.google.android.gms.common.internal.s.a(connectionResult, ConnectionResult.f)) {
                    str = this.b.l();
                }
                k2Var.a(this.d, connectionResult, str);
            }
            this.f.clear();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void n() {
            j();
            d(ConnectionResult.f);
            q();
            Iterator<p1> it = this.g.values().iterator();
            while (it.hasNext()) {
                p1 next = it.next();
                if (a(next.a.c()) == null) {
                    try {
                        next.a.a(this.c, new ls<>());
                    } catch (DeadObjectException unused) {
                        a(1);
                        this.b.b();
                    } catch (RemoteException unused2) {
                    }
                }
                it.remove();
            }
            p();
            r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void o() {
            j();
            this.j = true;
            this.e.c();
            g.this.m.sendMessageDelayed(Message.obtain(g.this.m, 9, this.d), g.this.a);
            g.this.m.sendMessageDelayed(Message.obtain(g.this.m, 11, this.d), g.this.b);
            g.this.f.a();
        }

        private final void p() {
            ArrayList arrayList = new ArrayList(this.a);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                q1 q1Var = (q1) obj;
                if (!this.b.a()) {
                    return;
                }
                if (b(q1Var)) {
                    this.a.remove(q1Var);
                }
            }
        }

        private final void q() {
            if (this.j) {
                g.this.m.removeMessages(11, this.d);
                g.this.m.removeMessages(9, this.d);
                this.j = false;
            }
        }

        private final void r() {
            g.this.m.removeMessages(12, this.d);
            g.this.m.sendMessageDelayed(g.this.m.obtainMessage(12, this.d), g.this.c);
        }

        public final void a() {
            com.google.android.gms.common.internal.u.a(g.this.m);
            if (this.b.a() || this.b.j()) {
                return;
            }
            int a = g.this.f.a(g.this.d, this.b);
            if (a != 0) {
                a(new ConnectionResult(a, null));
                return;
            }
            b bVar = new b(this.b, this.d);
            if (this.b.n()) {
                this.i.a(bVar);
            }
            this.b.a(bVar);
        }

        @Override // com.google.android.gms.common.api.internal.f
        public final void a(int i) {
            if (Looper.myLooper() == g.this.m.getLooper()) {
                o();
            } else {
                g.this.m.post(new f1(this));
            }
        }

        @Override // com.google.android.gms.common.api.internal.m
        public final void a(ConnectionResult connectionResult) {
            com.google.android.gms.common.internal.u.a(g.this.m);
            t1 t1Var = this.i;
            if (t1Var != null) {
                t1Var.h();
            }
            j();
            g.this.f.a();
            d(connectionResult);
            if (connectionResult.j() == 4) {
                a(g.o);
                return;
            }
            if (this.a.isEmpty()) {
                this.l = connectionResult;
                return;
            }
            if (c(connectionResult) || g.this.b(connectionResult, this.h)) {
                return;
            }
            if (connectionResult.j() == 18) {
                this.j = true;
            }
            if (this.j) {
                g.this.m.sendMessageDelayed(Message.obtain(g.this.m, 9, this.d), g.this.a);
                return;
            }
            String a = this.d.a();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 63 + String.valueOf(valueOf).length());
            sb.append("API: ");
            sb.append(a);
            sb.append(" is not available on this device. Connection failed with: ");
            sb.append(valueOf);
            a(new Status(17, sb.toString()));
        }

        @Override // com.google.android.gms.common.api.internal.s2
        public final void a(ConnectionResult connectionResult, com.google.android.gms.common.api.a<?> aVar, boolean z) {
            if (Looper.myLooper() == g.this.m.getLooper()) {
                a(connectionResult);
            } else {
                g.this.m.post(new e1(this, connectionResult));
            }
        }

        public final void a(Status status) {
            com.google.android.gms.common.internal.u.a(g.this.m);
            Iterator<q1> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().a(status);
            }
            this.a.clear();
        }

        public final void a(k2 k2Var) {
            com.google.android.gms.common.internal.u.a(g.this.m);
            this.f.add(k2Var);
        }

        public final void a(q1 q1Var) {
            com.google.android.gms.common.internal.u.a(g.this.m);
            if (this.b.a()) {
                if (b(q1Var)) {
                    r();
                    return;
                } else {
                    this.a.add(q1Var);
                    return;
                }
            }
            this.a.add(q1Var);
            ConnectionResult connectionResult = this.l;
            if (connectionResult == null || !connectionResult.m()) {
                a();
            } else {
                a(this.l);
            }
        }

        public final int b() {
            return this.h;
        }

        @Override // com.google.android.gms.common.api.internal.f
        public final void b(Bundle bundle) {
            if (Looper.myLooper() == g.this.m.getLooper()) {
                n();
            } else {
                g.this.m.post(new d1(this));
            }
        }

        public final void b(ConnectionResult connectionResult) {
            com.google.android.gms.common.internal.u.a(g.this.m);
            this.b.b();
            a(connectionResult);
        }

        final boolean c() {
            return this.b.a();
        }

        public final boolean d() {
            return this.b.n();
        }

        public final void e() {
            com.google.android.gms.common.internal.u.a(g.this.m);
            if (this.j) {
                a();
            }
        }

        public final a.f f() {
            return this.b;
        }

        public final void g() {
            com.google.android.gms.common.internal.u.a(g.this.m);
            if (this.j) {
                q();
                a(g.this.e.c(g.this.d) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
                this.b.b();
            }
        }

        public final void h() {
            com.google.android.gms.common.internal.u.a(g.this.m);
            a(g.n);
            this.e.b();
            for (k.a aVar : (k.a[]) this.g.keySet().toArray(new k.a[this.g.size()])) {
                a(new i2(aVar, new ls()));
            }
            d(new ConnectionResult(4));
            if (this.b.a()) {
                this.b.a(new h1(this));
            }
        }

        public final Map<k.a<?>, p1> i() {
            return this.g;
        }

        public final void j() {
            com.google.android.gms.common.internal.u.a(g.this.m);
            this.l = null;
        }

        public final ConnectionResult k() {
            com.google.android.gms.common.internal.u.a(g.this.m);
            return this.l;
        }

        public final boolean l() {
            return a(true);
        }

        final yr m() {
            t1 t1Var = this.i;
            if (t1Var == null) {
                return null;
            }
            return t1Var.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements u1, d.c {
        private final a.f a;
        private final com.google.android.gms.common.api.internal.b<?> b;
        private com.google.android.gms.common.internal.m c = null;
        private Set<Scope> d = null;
        private boolean e = false;

        public b(a.f fVar, com.google.android.gms.common.api.internal.b<?> bVar) {
            this.a = fVar;
            this.b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a() {
            com.google.android.gms.common.internal.m mVar;
            if (!this.e || (mVar = this.c) == null) {
                return;
            }
            this.a.a(mVar, this.d);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static /* synthetic */ boolean a(b bVar, boolean z) {
            bVar.e = true;
            return true;
        }

        @Override // com.google.android.gms.common.internal.d.c
        public final void a(ConnectionResult connectionResult) {
            g.this.m.post(new j1(this, connectionResult));
        }

        @Override // com.google.android.gms.common.api.internal.u1
        public final void a(com.google.android.gms.common.internal.m mVar, Set<Scope> set) {
            if (mVar == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                b(new ConnectionResult(4));
            } else {
                this.c = mVar;
                this.d = set;
                a();
            }
        }

        @Override // com.google.android.gms.common.api.internal.u1
        public final void b(ConnectionResult connectionResult) {
            ((a) g.this.i.get(this.b)).b(connectionResult);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {
        private final com.google.android.gms.common.api.internal.b<?> a;
        private final Feature b;

        private c(com.google.android.gms.common.api.internal.b<?> bVar, Feature feature) {
            this.a = bVar;
            this.b = feature;
        }

        /* synthetic */ c(com.google.android.gms.common.api.internal.b bVar, Feature feature, c1 c1Var) {
            this(bVar, feature);
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof c)) {
                c cVar = (c) obj;
                if (com.google.android.gms.common.internal.s.a(this.a, cVar.a) && com.google.android.gms.common.internal.s.a(this.b, cVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return com.google.android.gms.common.internal.s.a(this.a, this.b);
        }

        public final String toString() {
            s.a a = com.google.android.gms.common.internal.s.a(this);
            a.a("key", this.a);
            a.a("feature", this.b);
            return a.toString();
        }
    }

    private g(Context context, Looper looper, com.google.android.gms.common.c cVar) {
        this.d = context;
        this.m = new jq(looper, this);
        this.e = cVar;
        this.f = new com.google.android.gms.common.internal.l(cVar);
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(6));
    }

    public static g a(Context context) {
        g gVar;
        synchronized (p) {
            if (q == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                q = new g(context.getApplicationContext(), handlerThread.getLooper(), com.google.android.gms.common.c.a());
            }
            gVar = q;
        }
        return gVar;
    }

    private final void b(com.google.android.gms.common.api.e<?> eVar) {
        com.google.android.gms.common.api.internal.b<?> a2 = eVar.a();
        a<?> aVar = this.i.get(a2);
        if (aVar == null) {
            aVar = new a<>(eVar);
            this.i.put(a2, aVar);
        }
        if (aVar.d()) {
            this.l.add(a2);
        }
        aVar.a();
    }

    public static void d() {
        synchronized (p) {
            if (q != null) {
                g gVar = q;
                gVar.h.incrementAndGet();
                gVar.m.sendMessageAtFrontOfQueue(gVar.m.obtainMessage(10));
            }
        }
    }

    public static g e() {
        g gVar;
        synchronized (p) {
            com.google.android.gms.common.internal.u.a(q, "Must guarantee manager is non-null before using getInstance");
            gVar = q;
        }
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final PendingIntent a(com.google.android.gms.common.api.internal.b<?> bVar, int i) {
        yr m;
        a<?> aVar = this.i.get(bVar);
        if (aVar == null || (m = aVar.m()) == null) {
            return null;
        }
        return PendingIntent.getActivity(this.d, i, m.m(), 134217728);
    }

    public final <O extends a.d> ks<Boolean> a(com.google.android.gms.common.api.e<O> eVar, k.a<?> aVar) {
        ls lsVar = new ls();
        i2 i2Var = new i2(aVar, lsVar);
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(13, new o1(i2Var, this.h.get(), eVar)));
        return lsVar.a();
    }

    public final <O extends a.d> ks<Void> a(com.google.android.gms.common.api.e<O> eVar, n<a.b, ?> nVar, t<a.b, ?> tVar) {
        ls lsVar = new ls();
        h2 h2Var = new h2(new p1(nVar, tVar), lsVar);
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(8, new o1(h2Var, this.h.get(), eVar)));
        return lsVar.a();
    }

    public final ks<Map<com.google.android.gms.common.api.internal.b<?>, String>> a(Iterable<? extends com.google.android.gms.common.api.g<?>> iterable) {
        k2 k2Var = new k2(iterable);
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(2, k2Var));
        return k2Var.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.h.incrementAndGet();
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(10));
    }

    public final void a(ConnectionResult connectionResult, int i) {
        if (b(connectionResult, i)) {
            return;
        }
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
    }

    public final void a(com.google.android.gms.common.api.e<?> eVar) {
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final <O extends a.d> void a(com.google.android.gms.common.api.e<O> eVar, int i, d<? extends com.google.android.gms.common.api.m, a.b> dVar) {
        e2 e2Var = new e2(i, dVar);
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(4, new o1(e2Var, this.h.get(), eVar)));
    }

    public final <O extends a.d, ResultT> void a(com.google.android.gms.common.api.e<O> eVar, int i, r<a.b, ResultT> rVar, ls<ResultT> lsVar, p pVar) {
        g2 g2Var = new g2(i, rVar, lsVar, pVar);
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(4, new o1(g2Var, this.h.get(), eVar)));
    }

    public final int b() {
        return this.g.getAndIncrement();
    }

    final boolean b(ConnectionResult connectionResult, int i) {
        return this.e.a(this.d, connectionResult, i);
    }

    public final void c() {
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(3));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        ls<Boolean> b2;
        boolean valueOf;
        int i = message.what;
        a<?> aVar = null;
        switch (i) {
            case 1:
                this.c = ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.m.removeMessages(12);
                for (com.google.android.gms.common.api.internal.b<?> bVar : this.i.keySet()) {
                    Handler handler = this.m;
                    handler.sendMessageDelayed(handler.obtainMessage(12, bVar), this.c);
                }
                return true;
            case 2:
                k2 k2Var = (k2) message.obj;
                Iterator<com.google.android.gms.common.api.internal.b<?>> it = k2Var.b().iterator();
                while (true) {
                    if (it.hasNext()) {
                        com.google.android.gms.common.api.internal.b<?> next = it.next();
                        a<?> aVar2 = this.i.get(next);
                        if (aVar2 == null) {
                            k2Var.a(next, new ConnectionResult(13), null);
                        } else if (aVar2.c()) {
                            k2Var.a(next, ConnectionResult.f, aVar2.f().l());
                        } else if (aVar2.k() != null) {
                            k2Var.a(next, aVar2.k(), null);
                        } else {
                            aVar2.a(k2Var);
                            aVar2.a();
                        }
                    }
                }
                return true;
            case 3:
                for (a<?> aVar3 : this.i.values()) {
                    aVar3.j();
                    aVar3.a();
                }
                return true;
            case 4:
            case 8:
            case 13:
                o1 o1Var = (o1) message.obj;
                a<?> aVar4 = this.i.get(o1Var.c.a());
                if (aVar4 == null) {
                    b(o1Var.c);
                    aVar4 = this.i.get(o1Var.c.a());
                }
                if (!aVar4.d() || this.h.get() == o1Var.b) {
                    aVar4.a(o1Var.a);
                } else {
                    o1Var.a.a(n);
                    aVar4.h();
                }
                return true;
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator<a<?>> it2 = this.i.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        a<?> next2 = it2.next();
                        if (next2.b() == i2) {
                            aVar = next2;
                        }
                    }
                }
                if (aVar != null) {
                    String b3 = this.e.b(connectionResult.j());
                    String k = connectionResult.k();
                    StringBuilder sb = new StringBuilder(String.valueOf(b3).length() + 69 + String.valueOf(k).length());
                    sb.append("Error resolution was canceled by the user, original error message: ");
                    sb.append(b3);
                    sb.append(": ");
                    sb.append(k);
                    aVar.a(new Status(17, sb.toString()));
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i2);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                }
                return true;
            case 6:
                if (com.google.android.gms.common.util.n.a() && (this.d.getApplicationContext() instanceof Application)) {
                    com.google.android.gms.common.api.internal.c.a((Application) this.d.getApplicationContext());
                    com.google.android.gms.common.api.internal.c.b().a(new c1(this));
                    if (!com.google.android.gms.common.api.internal.c.b().a(true)) {
                        this.c = 300000L;
                    }
                }
                return true;
            case 7:
                b((com.google.android.gms.common.api.e<?>) message.obj);
                return true;
            case 9:
                if (this.i.containsKey(message.obj)) {
                    this.i.get(message.obj).e();
                }
                return true;
            case 10:
                Iterator<com.google.android.gms.common.api.internal.b<?>> it3 = this.l.iterator();
                while (it3.hasNext()) {
                    this.i.remove(it3.next()).h();
                }
                this.l.clear();
                return true;
            case 11:
                if (this.i.containsKey(message.obj)) {
                    this.i.get(message.obj).g();
                }
                return true;
            case 12:
                if (this.i.containsKey(message.obj)) {
                    this.i.get(message.obj).l();
                }
                return true;
            case 14:
                y yVar = (y) message.obj;
                com.google.android.gms.common.api.internal.b<?> a2 = yVar.a();
                if (this.i.containsKey(a2)) {
                    boolean a3 = this.i.get(a2).a(false);
                    b2 = yVar.b();
                    valueOf = Boolean.valueOf(a3);
                } else {
                    b2 = yVar.b();
                    valueOf = false;
                }
                b2.a((ls<Boolean>) valueOf);
                return true;
            case 15:
                c cVar = (c) message.obj;
                if (this.i.containsKey(cVar.a)) {
                    this.i.get(cVar.a).a(cVar);
                }
                return true;
            case 16:
                c cVar2 = (c) message.obj;
                if (this.i.containsKey(cVar2.a)) {
                    this.i.get(cVar2.a).b(cVar2);
                }
                return true;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i);
                sb3.toString();
                return false;
        }
    }
}
