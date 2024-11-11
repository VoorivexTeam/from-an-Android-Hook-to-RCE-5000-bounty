package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.i;
import defpackage.ho;
import defpackage.vr;
import defpackage.yr;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class q0 extends com.google.android.gms.common.api.f implements n1 {
    private final Lock b;
    private boolean c;
    private final com.google.android.gms.common.internal.i d;
    private final int f;
    private final Context g;
    private final Looper h;
    private volatile boolean j;
    private long k;
    private long l;
    private final t0 m;
    private final com.google.android.gms.common.c n;
    private l1 o;
    final Map<a.c<?>, a.f> p;
    Set<Scope> q;
    private final com.google.android.gms.common.internal.e r;
    private final Map<com.google.android.gms.common.api.a<?>, Boolean> s;
    private final a.AbstractC0041a<? extends yr, vr> t;
    private final l u;
    private final ArrayList<q2> v;
    private Integer w;
    Set<w1> x;
    final b2 y;
    private final i.a z;
    private m1 e = null;
    final Queue<d<?, ?>> i = new LinkedList();

    public q0(Context context, Lock lock, Looper looper, com.google.android.gms.common.internal.e eVar, com.google.android.gms.common.c cVar, a.AbstractC0041a<? extends yr, vr> abstractC0041a, Map<com.google.android.gms.common.api.a<?>, Boolean> map, List<f.b> list, List<f.c> list2, Map<a.c<?>, a.f> map2, int i, int i2, ArrayList<q2> arrayList, boolean z) {
        this.k = com.google.android.gms.common.util.d.a() ? 10000L : 120000L;
        this.l = 5000L;
        this.q = new HashSet();
        this.u = new l();
        this.w = null;
        this.x = null;
        p0 p0Var = new p0(this);
        this.z = p0Var;
        this.g = context;
        this.b = lock;
        this.c = false;
        this.d = new com.google.android.gms.common.internal.i(looper, p0Var);
        this.h = looper;
        this.m = new t0(this, looper);
        this.n = cVar;
        this.f = i;
        if (i >= 0) {
            this.w = Integer.valueOf(i2);
        }
        this.s = map;
        this.p = map2;
        this.v = arrayList;
        this.y = new b2(this.p);
        Iterator<f.b> it = list.iterator();
        while (it.hasNext()) {
            this.d.a(it.next());
        }
        Iterator<f.c> it2 = list2.iterator();
        while (it2.hasNext()) {
            this.d.a(it2.next());
        }
        this.r = eVar;
        this.t = abstractC0041a;
    }

    public static int a(Iterable<a.f> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (a.f fVar : iterable) {
            if (fVar.n()) {
                z2 = true;
            }
            if (fVar.e()) {
                z3 = true;
            }
        }
        if (z2) {
            return (z3 && z) ? 2 : 1;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(com.google.android.gms.common.api.f fVar, q qVar, boolean z) {
        ho.d.a(fVar).a(new v0(this, qVar, z, fVar));
    }

    private final void b(int i) {
        Integer num = this.w;
        if (num == null) {
            this.w = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String c = c(i);
            String c2 = c(this.w.intValue());
            StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 51 + String.valueOf(c2).length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(c);
            sb.append(". Mode was already set to ");
            sb.append(c2);
            throw new IllegalStateException(sb.toString());
        }
        if (this.e != null) {
            return;
        }
        boolean z = false;
        boolean z2 = false;
        for (a.f fVar : this.p.values()) {
            if (fVar.n()) {
                z = true;
            }
            if (fVar.e()) {
                z2 = true;
            }
        }
        int intValue = this.w.intValue();
        if (intValue == 1) {
            if (!z) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        } else if (intValue == 2 && z) {
            if (this.c) {
                this.e = new w2(this.g, this.b, this.h, this.n, this.p, this.r, this.s, this.t, this.v, this, true);
                return;
            } else {
                this.e = r2.a(this.g, this, this.b, this.h, this.n, this.p, this.r, this.s, this.t, this.v);
                return;
            }
        }
        if (!this.c || z2) {
            this.e = new z0(this.g, this, this.b, this.h, this.n, this.p, this.r, this.s, this.t, this.v, this);
        } else {
            this.e = new w2(this.g, this.b, this.h, this.n, this.p, this.r, this.s, this.t, this.v, this, false);
        }
    }

    private static String c(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        this.b.lock();
        try {
            if (this.j) {
                p();
            }
        } finally {
            this.b.unlock();
        }
    }

    @GuardedBy("mLock")
    private final void p() {
        this.d.b();
        this.e.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        this.b.lock();
        try {
            if (l()) {
                p();
            }
        } finally {
            this.b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final ConnectionResult a() {
        boolean z = true;
        com.google.android.gms.common.internal.u.b(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.b.lock();
        try {
            if (this.f >= 0) {
                if (this.w == null) {
                    z = false;
                }
                com.google.android.gms.common.internal.u.b(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.w == null) {
                this.w = Integer.valueOf(a((Iterable<a.f>) this.p.values(), false));
            } else if (this.w.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            b(this.w.intValue());
            this.d.b();
            return this.e.e();
        } finally {
            this.b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final <A extends a.b, R extends com.google.android.gms.common.api.m, T extends d<R, A>> T a(T t) {
        com.google.android.gms.common.internal.u.a(t.h() != null, "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.p.containsKey(t.h());
        String b = t.g() != null ? t.g().b() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(b);
        sb.append(" required for this call.");
        com.google.android.gms.common.internal.u.a(containsKey, sb.toString());
        this.b.lock();
        try {
            if (this.e == null) {
                this.i.add(t);
            } else {
                t = (T) this.e.b(t);
            }
            return t;
        } finally {
            this.b.unlock();
        }
    }

    public final void a(int i) {
        this.b.lock();
        boolean z = true;
        if (i != 3 && i != 1 && i != 2) {
            z = false;
        }
        try {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(i);
            com.google.android.gms.common.internal.u.a(z, sb.toString());
            b(i);
            p();
        } finally {
            this.b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.n1
    @GuardedBy("mLock")
    public final void a(int i, boolean z) {
        if (i == 1 && !z && !this.j) {
            this.j = true;
            if (this.o == null && !com.google.android.gms.common.util.d.a()) {
                try {
                    this.o = this.n.a(this.g.getApplicationContext(), new x0(this));
                } catch (SecurityException unused) {
                }
            }
            t0 t0Var = this.m;
            t0Var.sendMessageDelayed(t0Var.obtainMessage(1), this.k);
            t0 t0Var2 = this.m;
            t0Var2.sendMessageDelayed(t0Var2.obtainMessage(2), this.l);
        }
        this.y.b();
        this.d.a(i);
        this.d.a();
        if (i == 2) {
            p();
        }
    }

    @Override // com.google.android.gms.common.api.internal.n1
    @GuardedBy("mLock")
    public final void a(Bundle bundle) {
        while (!this.i.isEmpty()) {
            b((q0) this.i.remove());
        }
        this.d.a(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.n1
    @GuardedBy("mLock")
    public final void a(ConnectionResult connectionResult) {
        if (!this.n.b(this.g, connectionResult.j())) {
            l();
        }
        if (this.j) {
            return;
        }
        this.d.a(connectionResult);
        this.d.a();
    }

    @Override // com.google.android.gms.common.api.f
    public final void a(f.c cVar) {
        this.d.a(cVar);
    }

    @Override // com.google.android.gms.common.api.f
    public final void a(w1 w1Var) {
        String str;
        Exception exc;
        this.b.lock();
        try {
            if (this.x == null) {
                str = "Attempted to remove pending transform when no transforms are registered.";
                exc = new Exception();
            } else if (this.x.remove(w1Var)) {
                if (!m()) {
                    this.e.d();
                }
            } else {
                str = "Failed to remove pending transform - this may lead to memory leaks!";
                exc = new Exception();
            }
            Log.wtf("GoogleApiClientImpl", str, exc);
        } finally {
            this.b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.g);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.j);
        printWriter.append(" mWorkQueue.size()=").print(this.i.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.y.a.size());
        m1 m1Var = this.e;
        if (m1Var != null) {
            m1Var.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final boolean a(o oVar) {
        m1 m1Var = this.e;
        return m1Var != null && m1Var.a(oVar);
    }

    @Override // com.google.android.gms.common.api.f
    public final com.google.android.gms.common.api.h<Status> b() {
        com.google.android.gms.common.internal.u.b(j(), "GoogleApiClient is not connected yet.");
        com.google.android.gms.common.internal.u.b(this.w.intValue() != 2, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        q qVar = new q(this);
        if (this.p.containsKey(ho.a)) {
            a(this, qVar, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            s0 s0Var = new s0(this, atomicReference, qVar);
            r0 r0Var = new r0(this, qVar);
            f.a aVar = new f.a(this.g);
            aVar.a(ho.c);
            aVar.a(s0Var);
            aVar.a(r0Var);
            aVar.a(this.m);
            com.google.android.gms.common.api.f a = aVar.a();
            atomicReference.set(a);
            a.c();
        }
        return qVar;
    }

    @Override // com.google.android.gms.common.api.f
    public final <A extends a.b, T extends d<? extends com.google.android.gms.common.api.m, A>> T b(T t) {
        com.google.android.gms.common.internal.u.a(t.h() != null, "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.p.containsKey(t.h());
        String b = t.g() != null ? t.g().b() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(b);
        sb.append(" required for this call.");
        com.google.android.gms.common.internal.u.a(containsKey, sb.toString());
        this.b.lock();
        try {
            if (this.e == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.j) {
                this.i.add(t);
                while (!this.i.isEmpty()) {
                    d<?, ?> remove = this.i.remove();
                    this.y.a(remove);
                    remove.c(Status.h);
                }
            } else {
                t = (T) this.e.a((m1) t);
            }
            return t;
        } finally {
            this.b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final void b(f.c cVar) {
        this.d.b(cVar);
    }

    @Override // com.google.android.gms.common.api.f
    public final void c() {
        this.b.lock();
        try {
            if (this.f >= 0) {
                com.google.android.gms.common.internal.u.b(this.w != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.w == null) {
                this.w = Integer.valueOf(a((Iterable<a.f>) this.p.values(), false));
            } else if (this.w.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            a(this.w.intValue());
        } finally {
            this.b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final void d() {
        this.b.lock();
        try {
            this.y.a();
            if (this.e != null) {
                this.e.b();
            }
            this.u.a();
            for (d<?, ?> dVar : this.i) {
                dVar.a((c2) null);
                dVar.a();
            }
            this.i.clear();
            if (this.e != null) {
                l();
                this.d.a();
            }
        } finally {
            this.b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final Context e() {
        return this.g;
    }

    @Override // com.google.android.gms.common.api.f
    public final Looper f() {
        return this.h;
    }

    @Override // com.google.android.gms.common.api.f
    public final void g() {
        m1 m1Var = this.e;
        if (m1Var != null) {
            m1Var.f();
        }
    }

    public final boolean j() {
        m1 m1Var = this.e;
        return m1Var != null && m1Var.a();
    }

    public final void k() {
        d();
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @GuardedBy("mLock")
    public final boolean l() {
        if (!this.j) {
            return false;
        }
        this.j = false;
        this.m.removeMessages(2);
        this.m.removeMessages(1);
        l1 l1Var = this.o;
        if (l1Var != null) {
            l1Var.a();
            this.o = null;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m() {
        this.b.lock();
        try {
            if (this.x != null) {
                return !this.x.isEmpty();
            }
            this.b.unlock();
            return false;
        } finally {
            this.b.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String n() {
        StringWriter stringWriter = new StringWriter();
        a("", (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
        return stringWriter.toString();
    }
}
