package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.e;
import defpackage.vr;
import defpackage.yo;
import defpackage.yr;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class w2 implements m1 {
    private final Map<com.google.android.gms.common.api.a<?>, Boolean> c;
    private final g d;
    private final q0 e;
    private final Lock f;
    private final Looper g;
    private final com.google.android.gms.common.d h;
    private final Condition i;
    private final com.google.android.gms.common.internal.e j;
    private final boolean k;
    private final boolean l;

    @GuardedBy("mLock")
    private boolean n;

    @GuardedBy("mLock")
    private Map<b<?>, ConnectionResult> o;

    @GuardedBy("mLock")
    private Map<b<?>, ConnectionResult> p;

    @GuardedBy("mLock")
    private u q;

    @GuardedBy("mLock")
    private ConnectionResult r;
    private final Map<a.c<?>, x2<?>> a = new HashMap();
    private final Map<a.c<?>, x2<?>> b = new HashMap();
    private final Queue<d<?, ?>> m = new LinkedList();

    public w2(Context context, Lock lock, Looper looper, com.google.android.gms.common.d dVar, Map<a.c<?>, a.f> map, com.google.android.gms.common.internal.e eVar, Map<com.google.android.gms.common.api.a<?>, Boolean> map2, a.AbstractC0041a<? extends yr, vr> abstractC0041a, ArrayList<q2> arrayList, q0 q0Var, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        this.f = lock;
        this.g = looper;
        this.i = lock.newCondition();
        this.h = dVar;
        this.e = q0Var;
        this.c = map2;
        this.j = eVar;
        this.k = z;
        HashMap hashMap = new HashMap();
        for (com.google.android.gms.common.api.a<?> aVar : map2.keySet()) {
            hashMap.put(aVar.a(), aVar);
        }
        HashMap hashMap2 = new HashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            q2 q2Var = arrayList.get(i);
            i++;
            q2 q2Var2 = q2Var;
            hashMap2.put(q2Var2.a, q2Var2);
        }
        boolean z5 = false;
        boolean z6 = true;
        boolean z7 = false;
        for (Map.Entry<a.c<?>, a.f> entry : map.entrySet()) {
            com.google.android.gms.common.api.a aVar2 = (com.google.android.gms.common.api.a) hashMap.get(entry.getKey());
            a.f value = entry.getValue();
            if (value.h()) {
                z4 = z6;
                if (this.c.get(aVar2).booleanValue()) {
                    z3 = z7;
                    z2 = true;
                } else {
                    z2 = true;
                    z3 = true;
                }
            } else {
                z2 = z5;
                z3 = z7;
                z4 = false;
            }
            x2<?> x2Var = new x2<>(context, aVar2, looper, value, (q2) hashMap2.get(aVar2), eVar, abstractC0041a);
            this.a.put(entry.getKey(), x2Var);
            if (value.n()) {
                this.b.put(entry.getKey(), x2Var);
            }
            z5 = z2;
            z6 = z4;
            z7 = z3;
        }
        this.l = (!z5 || z6 || z7) ? false : true;
        this.d = g.e();
    }

    private final ConnectionResult a(a.c<?> cVar) {
        this.f.lock();
        try {
            x2<?> x2Var = this.a.get(cVar);
            if (this.o != null && x2Var != null) {
                return this.o.get(x2Var.a());
            }
            this.f.unlock();
            return null;
        } finally {
            this.f.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean a(w2 w2Var, boolean z) {
        w2Var.n = false;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a(x2<?> x2Var, ConnectionResult connectionResult) {
        return !connectionResult.n() && !connectionResult.m() && this.c.get(x2Var.d()).booleanValue() && x2Var.h().h() && this.h.c(connectionResult.j());
    }

    private final <T extends d<? extends com.google.android.gms.common.api.m, ? extends a.b>> boolean c(T t) {
        a.c<?> h = t.h();
        ConnectionResult a = a(h);
        if (a == null || a.j() != 4) {
            return false;
        }
        t.c(new Status(4, null, this.d.a(this.a.get(h).a(), System.identityHashCode(this.e))));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void h() {
        if (this.j == null) {
            this.e.q = Collections.emptySet();
            return;
        }
        HashSet hashSet = new HashSet(this.j.i());
        Map<com.google.android.gms.common.api.a<?>, e.b> f = this.j.f();
        for (com.google.android.gms.common.api.a<?> aVar : f.keySet()) {
            ConnectionResult a = a(aVar);
            if (a != null && a.n()) {
                hashSet.addAll(f.get(aVar).a);
            }
        }
        this.e.q = hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void i() {
        while (!this.m.isEmpty()) {
            a((w2) this.m.remove());
        }
        this.e.a((Bundle) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final ConnectionResult j() {
        int i = 0;
        ConnectionResult connectionResult = null;
        ConnectionResult connectionResult2 = null;
        int i2 = 0;
        for (x2<?> x2Var : this.a.values()) {
            com.google.android.gms.common.api.a<?> d = x2Var.d();
            ConnectionResult connectionResult3 = this.o.get(x2Var.a());
            if (!connectionResult3.n() && (!this.c.get(d).booleanValue() || connectionResult3.m() || this.h.c(connectionResult3.j()))) {
                if (connectionResult3.j() == 4 && this.k) {
                    int a = d.c().a();
                    if (connectionResult2 == null || i2 > a) {
                        connectionResult2 = connectionResult3;
                        i2 = a;
                    }
                } else {
                    int a2 = d.c().a();
                    if (connectionResult == null || i > a2) {
                        connectionResult = connectionResult3;
                        i = a2;
                    }
                }
            }
        }
        return (connectionResult == null || connectionResult2 == null || i <= i2) ? connectionResult : connectionResult2;
    }

    private final boolean k() {
        this.f.lock();
        try {
            if (this.n && this.k) {
                Iterator<a.c<?>> it = this.b.keySet().iterator();
                while (it.hasNext()) {
                    ConnectionResult a = a(it.next());
                    if (a != null && a.n()) {
                    }
                }
                this.f.unlock();
                return true;
            }
            return false;
        } finally {
            this.f.unlock();
        }
    }

    public final ConnectionResult a(com.google.android.gms.common.api.a<?> aVar) {
        return a(aVar.a());
    }

    @Override // com.google.android.gms.common.api.internal.m1
    public final <A extends a.b, T extends d<? extends com.google.android.gms.common.api.m, A>> T a(T t) {
        a.c<A> h = t.h();
        if (this.k && c((w2) t)) {
            return t;
        }
        this.e.y.a(t);
        this.a.get(h).b(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.m1
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // com.google.android.gms.common.api.internal.m1
    public final boolean a() {
        boolean z;
        this.f.lock();
        try {
            if (this.o != null) {
                if (this.r == null) {
                    z = true;
                    return z;
                }
            }
            z = false;
            return z;
        } finally {
            this.f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.m1
    public final boolean a(o oVar) {
        this.f.lock();
        try {
            if (!this.n || k()) {
                this.f.unlock();
                return false;
            }
            this.d.c();
            this.q = new u(this, oVar);
            this.d.a(this.b.values()).a(new yo(this.g), this.q);
            this.f.unlock();
            return true;
        } catch (Throwable th) {
            this.f.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.m1
    public final <A extends a.b, R extends com.google.android.gms.common.api.m, T extends d<R, A>> T b(T t) {
        if (this.k && c((w2) t)) {
            return t;
        }
        if (!a()) {
            this.m.add(t);
            return t;
        }
        this.e.y.a(t);
        this.a.get(t.h()).a((x2<?>) t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.m1
    public final void b() {
        this.f.lock();
        try {
            this.n = false;
            this.o = null;
            this.p = null;
            if (this.q != null) {
                this.q.a();
                this.q = null;
            }
            this.r = null;
            while (!this.m.isEmpty()) {
                d<?, ?> remove = this.m.remove();
                remove.a((c2) null);
                remove.a();
            }
            this.i.signalAll();
        } finally {
            this.f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.m1
    public final void c() {
        this.f.lock();
        try {
            if (!this.n) {
                this.n = true;
                this.o = null;
                this.p = null;
                this.q = null;
                this.r = null;
                this.d.c();
                this.d.a(this.a.values()).a(new yo(this.g), new y2(this));
            }
        } finally {
            this.f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.m1
    public final void d() {
    }

    @Override // com.google.android.gms.common.api.internal.m1
    @GuardedBy("mLock")
    public final ConnectionResult e() {
        c();
        while (g()) {
            try {
                this.i.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (a()) {
            return ConnectionResult.f;
        }
        ConnectionResult connectionResult = this.r;
        return connectionResult != null ? connectionResult : new ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.m1
    public final void f() {
        this.f.lock();
        try {
            this.d.a();
            if (this.q != null) {
                this.q.a();
                this.q = null;
            }
            if (this.p == null) {
                this.p = new defpackage.c0(this.b.size());
            }
            ConnectionResult connectionResult = new ConnectionResult(4);
            Iterator<x2<?>> it = this.b.values().iterator();
            while (it.hasNext()) {
                this.p.put(it.next().a(), connectionResult);
            }
            if (this.o != null) {
                this.o.putAll(this.p);
            }
        } finally {
            this.f.unlock();
        }
    }

    public final boolean g() {
        boolean z;
        this.f.lock();
        try {
            if (this.o == null) {
                if (this.n) {
                    z = true;
                    return z;
                }
            }
            z = false;
            return z;
        } finally {
            this.f.unlock();
        }
    }
}
