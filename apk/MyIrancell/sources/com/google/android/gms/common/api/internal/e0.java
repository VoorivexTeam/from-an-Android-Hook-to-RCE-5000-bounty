package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.signin.internal.zak;
import defpackage.vr;
import defpackage.yr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class e0 implements w0 {
    private final z0 a;
    private final Lock b;
    private final Context c;
    private final com.google.android.gms.common.d d;
    private ConnectionResult e;
    private int f;
    private int h;
    private yr k;
    private boolean l;
    private boolean m;
    private boolean n;
    private com.google.android.gms.common.internal.m o;
    private boolean p;
    private boolean q;
    private final com.google.android.gms.common.internal.e r;
    private final Map<com.google.android.gms.common.api.a<?>, Boolean> s;
    private final a.AbstractC0041a<? extends yr, vr> t;
    private int g = 0;
    private final Bundle i = new Bundle();
    private final Set<a.c> j = new HashSet();
    private ArrayList<Future<?>> u = new ArrayList<>();

    public e0(z0 z0Var, com.google.android.gms.common.internal.e eVar, Map<com.google.android.gms.common.api.a<?>, Boolean> map, com.google.android.gms.common.d dVar, a.AbstractC0041a<? extends yr, vr> abstractC0041a, Lock lock, Context context) {
        this.a = z0Var;
        this.r = eVar;
        this.s = map;
        this.d = dVar;
        this.t = abstractC0041a;
        this.b = lock;
        this.c = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void a(zak zakVar) {
        if (b(0)) {
            ConnectionResult j = zakVar.j();
            if (!j.n()) {
                if (!a(j)) {
                    b(j);
                    return;
                } else {
                    g();
                    e();
                    return;
                }
            }
            ResolveAccountResponse k = zakVar.k();
            ConnectionResult k2 = k.k();
            if (k2.n()) {
                this.n = true;
                this.o = k.j();
                this.p = k.l();
                this.q = k.m();
                e();
                return;
            }
            String valueOf = String.valueOf(k2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
            sb.append("Sign-in succeeded with resolve account failure: ");
            sb.append(valueOf);
            Log.wtf("GACConnecting", sb.toString(), new Exception());
            b(k2);
        }
    }

    @GuardedBy("mLock")
    private final void a(boolean z) {
        yr yrVar = this.k;
        if (yrVar != null) {
            if (yrVar.a() && z) {
                this.k.d();
            }
            this.k.b();
            if (this.r.k()) {
                this.k = null;
            }
            this.o = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final boolean a(ConnectionResult connectionResult) {
        return this.l && !connectionResult.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void b(ConnectionResult connectionResult) {
        h();
        a(!connectionResult.m());
        this.a.a(connectionResult);
        this.a.o.a(connectionResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if ((r5.m() || r4.d.a(r5.j()) != null) != false) goto L12;
     */
    @javax.annotation.concurrent.GuardedBy("mLock")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.google.android.gms.common.ConnectionResult r5, com.google.android.gms.common.api.a<?> r6, boolean r7) {
        /*
            r4 = this;
            com.google.android.gms.common.api.a$e r0 = r6.c()
            int r0 = r0.a()
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L24
            boolean r7 = r5.m()
            if (r7 == 0) goto L14
        L12:
            r7 = 1
            goto L22
        L14:
            com.google.android.gms.common.d r7 = r4.d
            int r3 = r5.j()
            android.content.Intent r7 = r7.a(r3)
            if (r7 == 0) goto L21
            goto L12
        L21:
            r7 = 0
        L22:
            if (r7 == 0) goto L2d
        L24:
            com.google.android.gms.common.ConnectionResult r7 = r4.e
            if (r7 == 0) goto L2c
            int r7 = r4.f
            if (r0 >= r7) goto L2d
        L2c:
            r1 = 1
        L2d:
            if (r1 == 0) goto L33
            r4.e = r5
            r4.f = r0
        L33:
            com.google.android.gms.common.api.internal.z0 r7 = r4.a
            java.util.Map<com.google.android.gms.common.api.a$c<?>, com.google.android.gms.common.ConnectionResult> r7 = r7.g
            com.google.android.gms.common.api.a$c r6 = r6.a()
            r7.put(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.e0.b(com.google.android.gms.common.ConnectionResult, com.google.android.gms.common.api.a, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final boolean b(int i) {
        if (this.g == i) {
            return true;
        }
        this.a.n.n();
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("Unexpected callback in ");
        sb.append(valueOf);
        sb.toString();
        int i2 = this.h;
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("mRemainingConnections=");
        sb2.append(i2);
        sb2.toString();
        String c = c(this.g);
        String c2 = c(i);
        StringBuilder sb3 = new StringBuilder(String.valueOf(c).length() + 70 + String.valueOf(c2).length());
        sb3.append("GoogleApiClient connecting is in step ");
        sb3.append(c);
        sb3.append(" but received callback for step ");
        sb3.append(c2);
        sb3.toString();
        new Exception();
        b(new ConnectionResult(8, null));
        return false;
    }

    private static String c(int i) {
        return i != 0 ? i != 1 ? "UNKNOWN" : "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final boolean d() {
        ConnectionResult connectionResult;
        int i = this.h - 1;
        this.h = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            this.a.n.n();
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            connectionResult = new ConnectionResult(8, null);
        } else {
            connectionResult = this.e;
            if (connectionResult == null) {
                return true;
            }
            this.a.m = this.f;
        }
        b(connectionResult);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void e() {
        if (this.h != 0) {
            return;
        }
        if (!this.m || this.n) {
            ArrayList arrayList = new ArrayList();
            this.g = 1;
            this.h = this.a.f.size();
            for (a.c<?> cVar : this.a.f.keySet()) {
                if (!this.a.g.containsKey(cVar)) {
                    arrayList.add(this.a.f.get(cVar));
                } else if (d()) {
                    f();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.u.add(a1.a().submit(new k0(this, arrayList)));
        }
    }

    @GuardedBy("mLock")
    private final void f() {
        this.a.i();
        a1.a().execute(new d0(this));
        yr yrVar = this.k;
        if (yrVar != null) {
            if (this.p) {
                yrVar.a(this.o, this.q);
            }
            a(false);
        }
        Iterator<a.c<?>> it = this.a.g.keySet().iterator();
        while (it.hasNext()) {
            this.a.f.get(it.next()).b();
        }
        this.a.o.a(this.i.isEmpty() ? null : this.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void g() {
        this.m = false;
        this.a.n.q = Collections.emptySet();
        for (a.c<?> cVar : this.j) {
            if (!this.a.g.containsKey(cVar)) {
                this.a.g.put(cVar, new ConnectionResult(17, null));
            }
        }
    }

    private final void h() {
        ArrayList<Future<?>> arrayList = this.u;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Future<?> future = arrayList.get(i);
            i++;
            future.cancel(true);
        }
        this.u.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<Scope> i() {
        if (this.r == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(this.r.i());
        Map<com.google.android.gms.common.api.a<?>, e.b> f = this.r.f();
        for (com.google.android.gms.common.api.a<?> aVar : f.keySet()) {
            if (!this.a.g.containsKey(aVar.a())) {
                hashSet.addAll(f.get(aVar).a);
            }
        }
        return hashSet;
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final <A extends a.b, T extends d<? extends com.google.android.gms.common.api.m, A>> T a(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.w0
    @GuardedBy("mLock")
    public final void a() {
        this.a.g.clear();
        this.m = false;
        d0 d0Var = null;
        this.e = null;
        this.g = 0;
        this.l = true;
        this.n = false;
        this.p = false;
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (com.google.android.gms.common.api.a<?> aVar : this.s.keySet()) {
            a.f fVar = this.a.f.get(aVar.a());
            z |= aVar.c().a() == 1;
            boolean booleanValue = this.s.get(aVar).booleanValue();
            if (fVar.n()) {
                this.m = true;
                if (booleanValue) {
                    this.j.add(aVar.a());
                } else {
                    this.l = false;
                }
            }
            hashMap.put(fVar, new g0(this, aVar, booleanValue));
        }
        if (z) {
            this.m = false;
        }
        if (this.m) {
            this.r.a(Integer.valueOf(System.identityHashCode(this.a.n)));
            l0 l0Var = new l0(this, d0Var);
            a.AbstractC0041a<? extends yr, vr> abstractC0041a = this.t;
            Context context = this.c;
            Looper f = this.a.n.f();
            com.google.android.gms.common.internal.e eVar = this.r;
            this.k = abstractC0041a.a(context, f, eVar, (com.google.android.gms.common.internal.e) eVar.j(), (f.b) l0Var, (f.c) l0Var);
        }
        this.h = this.a.f.size();
        this.u.add(a1.a().submit(new f0(this, hashMap)));
    }

    @Override // com.google.android.gms.common.api.internal.w0
    @GuardedBy("mLock")
    public final void a(int i) {
        b(new ConnectionResult(8, null));
    }

    @Override // com.google.android.gms.common.api.internal.w0
    @GuardedBy("mLock")
    public final void a(ConnectionResult connectionResult, com.google.android.gms.common.api.a<?> aVar, boolean z) {
        if (b(1)) {
            b(connectionResult, aVar, z);
            if (d()) {
                f();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final <A extends a.b, R extends com.google.android.gms.common.api.m, T extends d<R, A>> T b(T t) {
        this.a.n.i.add(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.w0
    @GuardedBy("mLock")
    public final void b(Bundle bundle) {
        if (b(1)) {
            if (bundle != null) {
                this.i.putAll(bundle);
            }
            if (d()) {
                f();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.w0
    @GuardedBy("mLock")
    public final boolean b() {
        h();
        a(true);
        this.a.a((ConnectionResult) null);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final void c() {
    }
}
