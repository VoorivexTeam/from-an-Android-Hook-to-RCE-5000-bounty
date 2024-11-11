package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import defpackage.jq;
import defpackage.vr;
import defpackage.yr;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r2 implements m1 {
    private final Context a;
    private final q0 b;
    private final Looper c;
    private final z0 d;
    private final z0 e;
    private final Map<a.c<?>, z0> f;
    private final a.f h;
    private Bundle i;
    private final Lock m;
    private final Set<o> g = Collections.newSetFromMap(new WeakHashMap());
    private ConnectionResult j = null;
    private ConnectionResult k = null;
    private boolean l = false;

    @GuardedBy("mLock")
    private int n = 0;

    private r2(Context context, q0 q0Var, Lock lock, Looper looper, com.google.android.gms.common.d dVar, Map<a.c<?>, a.f> map, Map<a.c<?>, a.f> map2, com.google.android.gms.common.internal.e eVar, a.AbstractC0041a<? extends yr, vr> abstractC0041a, a.f fVar, ArrayList<q2> arrayList, ArrayList<q2> arrayList2, Map<com.google.android.gms.common.api.a<?>, Boolean> map3, Map<com.google.android.gms.common.api.a<?>, Boolean> map4) {
        this.a = context;
        this.b = q0Var;
        this.m = lock;
        this.c = looper;
        this.h = fVar;
        this.d = new z0(context, q0Var, lock, looper, dVar, map2, null, map4, null, arrayList2, new t2(this, null));
        this.e = new z0(context, this.b, lock, looper, dVar, map, eVar, map3, abstractC0041a, arrayList, new v2(this, null));
        defpackage.c0 c0Var = new defpackage.c0();
        Iterator<a.c<?>> it = map2.keySet().iterator();
        while (it.hasNext()) {
            c0Var.put(it.next(), this.d);
        }
        Iterator<a.c<?>> it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            c0Var.put(it2.next(), this.e);
        }
        this.f = Collections.unmodifiableMap(c0Var);
    }

    public static r2 a(Context context, q0 q0Var, Lock lock, Looper looper, com.google.android.gms.common.d dVar, Map<a.c<?>, a.f> map, com.google.android.gms.common.internal.e eVar, Map<com.google.android.gms.common.api.a<?>, Boolean> map2, a.AbstractC0041a<? extends yr, vr> abstractC0041a, ArrayList<q2> arrayList) {
        defpackage.c0 c0Var = new defpackage.c0();
        defpackage.c0 c0Var2 = new defpackage.c0();
        a.f fVar = null;
        for (Map.Entry<a.c<?>, a.f> entry : map.entrySet()) {
            a.f value = entry.getValue();
            if (value.e()) {
                fVar = value;
            }
            boolean n = value.n();
            a.c<?> key = entry.getKey();
            if (n) {
                c0Var.put(key, value);
            } else {
                c0Var2.put(key, value);
            }
        }
        com.google.android.gms.common.internal.u.b(!c0Var.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        defpackage.c0 c0Var3 = new defpackage.c0();
        defpackage.c0 c0Var4 = new defpackage.c0();
        for (com.google.android.gms.common.api.a<?> aVar : map2.keySet()) {
            a.c<?> a = aVar.a();
            if (c0Var.containsKey(a)) {
                c0Var3.put(aVar, map2.get(aVar));
            } else {
                if (!c0Var2.containsKey(a)) {
                    throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                }
                c0Var4.put(aVar, map2.get(aVar));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            q2 q2Var = arrayList.get(i);
            i++;
            q2 q2Var2 = q2Var;
            if (c0Var3.containsKey(q2Var2.a)) {
                arrayList2.add(q2Var2);
            } else {
                if (!c0Var4.containsKey(q2Var2.a)) {
                    throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                }
                arrayList3.add(q2Var2);
            }
        }
        return new r2(context, q0Var, lock, looper, dVar, c0Var, c0Var2, eVar, abstractC0041a, fVar, arrayList2, arrayList3, c0Var3, c0Var4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void a(int i, boolean z) {
        this.b.a(i, z);
        this.k = null;
        this.j = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Bundle bundle) {
        Bundle bundle2 = this.i;
        if (bundle2 == null) {
            this.i = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    @GuardedBy("mLock")
    private final void a(ConnectionResult connectionResult) {
        int i = this.n;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.n = 0;
            }
            this.b.a(connectionResult);
        }
        i();
        this.n = 0;
    }

    private static boolean b(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.n();
    }

    private final boolean c(d<? extends com.google.android.gms.common.api.m, ? extends a.b> dVar) {
        a.c<? extends a.b> h = dVar.h();
        com.google.android.gms.common.internal.u.a(this.f.containsKey(h), "GoogleApiClient is not configured to use the API required for this call.");
        return this.f.get(h).equals(this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void h() {
        ConnectionResult connectionResult;
        if (!b(this.j)) {
            if (this.j != null && b(this.k)) {
                this.e.b();
                a(this.j);
                return;
            }
            ConnectionResult connectionResult2 = this.j;
            if (connectionResult2 == null || (connectionResult = this.k) == null) {
                return;
            }
            if (this.e.m < this.d.m) {
                connectionResult2 = connectionResult;
            }
            a(connectionResult2);
            return;
        }
        if (!b(this.k) && !j()) {
            ConnectionResult connectionResult3 = this.k;
            if (connectionResult3 != null) {
                if (this.n == 1) {
                    i();
                    return;
                } else {
                    a(connectionResult3);
                    this.d.b();
                    return;
                }
            }
            return;
        }
        int i = this.n;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                this.n = 0;
            }
            this.b.a(this.i);
        }
        i();
        this.n = 0;
    }

    @GuardedBy("mLock")
    private final void i() {
        Iterator<o> it = this.g.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.g.clear();
    }

    @GuardedBy("mLock")
    private final boolean j() {
        ConnectionResult connectionResult = this.k;
        return connectionResult != null && connectionResult.j() == 4;
    }

    private final PendingIntent k() {
        if (this.h == null) {
            return null;
        }
        return PendingIntent.getActivity(this.a, System.identityHashCode(this.b), this.h.m(), 134217728);
    }

    @Override // com.google.android.gms.common.api.internal.m1
    @GuardedBy("mLock")
    public final <A extends a.b, T extends d<? extends com.google.android.gms.common.api.m, A>> T a(T t) {
        if (!c((d<? extends com.google.android.gms.common.api.m, ? extends a.b>) t)) {
            return (T) this.d.a((z0) t);
        }
        if (!j()) {
            return (T) this.e.a((z0) t);
        }
        t.c(new Status(4, null, k()));
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.m1
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.e.a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.d.a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r2.n == 1) goto L13;
     */
    @Override // com.google.android.gms.common.api.internal.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.m
            r0.lock()
            com.google.android.gms.common.api.internal.z0 r0 = r2.d     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0.a()     // Catch: java.lang.Throwable -> L28
            r1 = 1
            if (r0 == 0) goto L21
            com.google.android.gms.common.api.internal.z0 r0 = r2.e     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0.a()     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L22
            boolean r0 = r2.j()     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L22
            int r0 = r2.n     // Catch: java.lang.Throwable -> L28
            if (r0 != r1) goto L21
            goto L22
        L21:
            r1 = 0
        L22:
            java.util.concurrent.locks.Lock r0 = r2.m
            r0.unlock()
            return r1
        L28:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r2.m
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.r2.a():boolean");
    }

    @Override // com.google.android.gms.common.api.internal.m1
    public final boolean a(o oVar) {
        this.m.lock();
        try {
            if ((!g() && !a()) || this.e.a()) {
                this.m.unlock();
                return false;
            }
            this.g.add(oVar);
            if (this.n == 0) {
                this.n = 1;
            }
            this.k = null;
            this.e.c();
            return true;
        } finally {
            this.m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.m1
    @GuardedBy("mLock")
    public final <A extends a.b, R extends com.google.android.gms.common.api.m, T extends d<R, A>> T b(T t) {
        if (!c((d<? extends com.google.android.gms.common.api.m, ? extends a.b>) t)) {
            return (T) this.d.b((z0) t);
        }
        if (!j()) {
            return (T) this.e.b((z0) t);
        }
        t.c(new Status(4, null, k()));
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.m1
    @GuardedBy("mLock")
    public final void b() {
        this.k = null;
        this.j = null;
        this.n = 0;
        this.d.b();
        this.e.b();
        i();
    }

    @Override // com.google.android.gms.common.api.internal.m1
    @GuardedBy("mLock")
    public final void c() {
        this.n = 2;
        this.l = false;
        this.k = null;
        this.j = null;
        this.d.c();
        this.e.c();
    }

    @Override // com.google.android.gms.common.api.internal.m1
    @GuardedBy("mLock")
    public final void d() {
        this.d.d();
        this.e.d();
    }

    @Override // com.google.android.gms.common.api.internal.m1
    @GuardedBy("mLock")
    public final ConnectionResult e() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.m1
    public final void f() {
        this.m.lock();
        try {
            boolean g = g();
            this.e.b();
            this.k = new ConnectionResult(4);
            if (g) {
                new jq(this.c).post(new u2(this));
            } else {
                i();
            }
        } finally {
            this.m.unlock();
        }
    }

    public final boolean g() {
        this.m.lock();
        try {
            return this.n == 2;
        } finally {
            this.m.unlock();
        }
    }
}
