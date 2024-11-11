package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C0994d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.api.InterfaceC0982m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1022e;
import com.google.android.gms.common.internal.C1057u;
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
import p000.C0500c0;
import p000.C3369vr;
import p000.HandlerC2824jq;
import p000.InterfaceC3497yr;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.r2 */
/* loaded from: classes.dex */
public final class C0946r2 implements InterfaceC0925m1 {

    /* renamed from: a */
    private final Context f5945a;

    /* renamed from: b */
    private final C0940q0 f5946b;

    /* renamed from: c */
    private final Looper f5947c;

    /* renamed from: d */
    private final C0976z0 f5948d;

    /* renamed from: e */
    private final C0976z0 f5949e;

    /* renamed from: f */
    private final Map<C0859a.c<?>, C0976z0> f5950f;

    /* renamed from: h */
    private final C0859a.f f5952h;

    /* renamed from: i */
    private Bundle f5953i;

    /* renamed from: m */
    private final Lock f5957m;

    /* renamed from: g */
    private final Set<InterfaceC0931o> f5951g = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: j */
    private ConnectionResult f5954j = null;

    /* renamed from: k */
    private ConnectionResult f5955k = null;

    /* renamed from: l */
    private boolean f5956l = false;

    /* renamed from: n */
    @GuardedBy("mLock")
    private int f5958n = 0;

    private C0946r2(Context context, C0940q0 c0940q0, Lock lock, Looper looper, C0994d c0994d, Map<C0859a.c<?>, C0859a.f> map, Map<C0859a.c<?>, C0859a.f> map2, C1022e c1022e, C0859a.a<? extends InterfaceC3497yr, C3369vr> aVar, C0859a.f fVar, ArrayList<C0942q2> arrayList, ArrayList<C0942q2> arrayList2, Map<C0859a<?>, Boolean> map3, Map<C0859a<?>, Boolean> map4) {
        this.f5945a = context;
        this.f5946b = c0940q0;
        this.f5957m = lock;
        this.f5947c = looper;
        this.f5952h = fVar;
        this.f5948d = new C0976z0(context, c0940q0, lock, looper, c0994d, map2, null, map4, null, arrayList2, new C0954t2(this, null));
        this.f5949e = new C0976z0(context, this.f5946b, lock, looper, c0994d, map, c1022e, map3, aVar, arrayList, new C0962v2(this, null));
        C0500c0 c0500c0 = new C0500c0();
        Iterator<C0859a.c<?>> it = map2.keySet().iterator();
        while (it.hasNext()) {
            c0500c0.put(it.next(), this.f5948d);
        }
        Iterator<C0859a.c<?>> it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            c0500c0.put(it2.next(), this.f5949e);
        }
        this.f5950f = Collections.unmodifiableMap(c0500c0);
    }

    /* renamed from: a */
    public static C0946r2 m6853a(Context context, C0940q0 c0940q0, Lock lock, Looper looper, C0994d c0994d, Map<C0859a.c<?>, C0859a.f> map, C1022e c1022e, Map<C0859a<?>, Boolean> map2, C0859a.a<? extends InterfaceC3497yr, C3369vr> aVar, ArrayList<C0942q2> arrayList) {
        C0500c0 c0500c0 = new C0500c0();
        C0500c0 c0500c02 = new C0500c0();
        C0859a.f fVar = null;
        for (Map.Entry<C0859a.c<?>, C0859a.f> entry : map.entrySet()) {
            C0859a.f value = entry.getValue();
            if (value.mo6463e()) {
                fVar = value;
            }
            boolean mo6521n = value.mo6521n();
            C0859a.c<?> key = entry.getKey();
            if (mo6521n) {
                c0500c0.put(key, value);
            } else {
                c0500c02.put(key, value);
            }
        }
        C1057u.m7298b(!c0500c0.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        C0500c0 c0500c03 = new C0500c0();
        C0500c0 c0500c04 = new C0500c0();
        for (C0859a<?> c0859a : map2.keySet()) {
            C0859a.c<?> m6502a = c0859a.m6502a();
            if (c0500c0.containsKey(m6502a)) {
                c0500c03.put(c0859a, map2.get(c0859a));
            } else {
                if (!c0500c02.containsKey(m6502a)) {
                    throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                }
                c0500c04.put(c0859a, map2.get(c0859a));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C0942q2 c0942q2 = arrayList.get(i);
            i++;
            C0942q2 c0942q22 = c0942q2;
            if (c0500c03.containsKey(c0942q22.f5938a)) {
                arrayList2.add(c0942q22);
            } else {
                if (!c0500c04.containsKey(c0942q22.f5938a)) {
                    throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                }
                arrayList3.add(c0942q22);
            }
        }
        return new C0946r2(context, c0940q0, lock, looper, c0994d, c0500c0, c0500c02, c1022e, aVar, fVar, arrayList2, arrayList3, c0500c03, c0500c04);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: a */
    public final void m6855a(int i, boolean z) {
        this.f5946b.mo6820a(i, z);
        this.f5955k = null;
        this.f5954j = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m6856a(Bundle bundle) {
        Bundle bundle2 = this.f5953i;
        if (bundle2 == null) {
            this.f5953i = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    private final void m6857a(ConnectionResult connectionResult) {
        int i = this.f5958n;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f5958n = 0;
            }
            this.f5946b.mo6822a(connectionResult);
        }
        m6870i();
        this.f5958n = 0;
    }

    /* renamed from: b */
    private static boolean m6863b(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.m6488n();
    }

    /* renamed from: c */
    private final boolean m6864c(AbstractC0885d<? extends InterfaceC0982m, ? extends C0859a.b> abstractC0885d) {
        C0859a.c<? extends C0859a.b> m6641h = abstractC0885d.m6641h();
        C1057u.m7294a(this.f5950f.containsKey(m6641h), "GoogleApiClient is not configured to use the API required for this call.");
        return this.f5950f.get(m6641h).equals(this.f5949e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: h */
    public final void m6869h() {
        ConnectionResult connectionResult;
        if (!m6863b(this.f5954j)) {
            if (this.f5954j != null && m6863b(this.f5955k)) {
                this.f5949e.mo6810b();
                m6857a(this.f5954j);
                return;
            }
            ConnectionResult connectionResult2 = this.f5954j;
            if (connectionResult2 == null || (connectionResult = this.f5955k) == null) {
                return;
            }
            if (this.f5949e.f6036m < this.f5948d.f6036m) {
                connectionResult2 = connectionResult;
            }
            m6857a(connectionResult2);
            return;
        }
        if (!m6863b(this.f5955k) && !m6871j()) {
            ConnectionResult connectionResult3 = this.f5955k;
            if (connectionResult3 != null) {
                if (this.f5958n == 1) {
                    m6870i();
                    return;
                } else {
                    m6857a(connectionResult3);
                    this.f5948d.mo6810b();
                    return;
                }
            }
            return;
        }
        int i = this.f5958n;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                this.f5958n = 0;
            }
            this.f5946b.mo6821a(this.f5953i);
        }
        m6870i();
        this.f5958n = 0;
    }

    @GuardedBy("mLock")
    /* renamed from: i */
    private final void m6870i() {
        Iterator<InterfaceC0931o> it = this.f5951g.iterator();
        while (it.hasNext()) {
            it.next().mo6459a();
        }
        this.f5951g.clear();
    }

    @GuardedBy("mLock")
    /* renamed from: j */
    private final boolean m6871j() {
        ConnectionResult connectionResult = this.f5955k;
        return connectionResult != null && connectionResult.m6484j() == 4;
    }

    /* renamed from: k */
    private final PendingIntent m6872k() {
        if (this.f5952h == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f5945a, System.identityHashCode(this.f5946b), this.f5952h.mo6466m(), 134217728);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0925m1
    @GuardedBy("mLock")
    /* renamed from: a */
    public final <A extends C0859a.b, T extends AbstractC0885d<? extends InterfaceC0982m, A>> T mo6805a(T t) {
        if (!m6864c((AbstractC0885d<? extends InterfaceC0982m, ? extends C0859a.b>) t)) {
            return (T) this.f5948d.mo6805a((C0976z0) t);
        }
        if (!m6871j()) {
            return (T) this.f5949e.mo6805a((C0976z0) t);
        }
        t.m6639c(new Status(4, null, m6872k()));
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0925m1
    /* renamed from: a */
    public final void mo6806a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f5949e.mo6806a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f5948d.mo6806a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r2.f5958n == 1) goto L13;
     */
    @Override // com.google.android.gms.common.api.internal.InterfaceC0925m1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo6807a() {
        /*
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.f5957m
            r0.lock()
            com.google.android.gms.common.api.internal.z0 r0 = r2.f5948d     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0.mo6807a()     // Catch: java.lang.Throwable -> L28
            r1 = 1
            if (r0 == 0) goto L21
            com.google.android.gms.common.api.internal.z0 r0 = r2.f5949e     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0.mo6807a()     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L22
            boolean r0 = r2.m6871j()     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L22
            int r0 = r2.f5958n     // Catch: java.lang.Throwable -> L28
            if (r0 != r1) goto L21
            goto L22
        L21:
            r1 = 0
        L22:
            java.util.concurrent.locks.Lock r0 = r2.f5957m
            r0.unlock()
            return r1
        L28:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r2.f5957m
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C0946r2.mo6807a():boolean");
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0925m1
    /* renamed from: a */
    public final boolean mo6808a(InterfaceC0931o interfaceC0931o) {
        this.f5957m.lock();
        try {
            if ((!m6873g() && !mo6807a()) || this.f5949e.mo6807a()) {
                this.f5957m.unlock();
                return false;
            }
            this.f5951g.add(interfaceC0931o);
            if (this.f5958n == 0) {
                this.f5958n = 1;
            }
            this.f5955k = null;
            this.f5949e.mo6811c();
            return true;
        } finally {
            this.f5957m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0925m1
    @GuardedBy("mLock")
    /* renamed from: b */
    public final <A extends C0859a.b, R extends InterfaceC0982m, T extends AbstractC0885d<R, A>> T mo6809b(T t) {
        if (!m6864c((AbstractC0885d<? extends InterfaceC0982m, ? extends C0859a.b>) t)) {
            return (T) this.f5948d.mo6809b((C0976z0) t);
        }
        if (!m6871j()) {
            return (T) this.f5949e.mo6809b((C0976z0) t);
        }
        t.m6639c(new Status(4, null, m6872k()));
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0925m1
    @GuardedBy("mLock")
    /* renamed from: b */
    public final void mo6810b() {
        this.f5955k = null;
        this.f5954j = null;
        this.f5958n = 0;
        this.f5948d.mo6810b();
        this.f5949e.mo6810b();
        m6870i();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0925m1
    @GuardedBy("mLock")
    /* renamed from: c */
    public final void mo6811c() {
        this.f5958n = 2;
        this.f5956l = false;
        this.f5955k = null;
        this.f5954j = null;
        this.f5948d.mo6811c();
        this.f5949e.mo6811c();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0925m1
    @GuardedBy("mLock")
    /* renamed from: d */
    public final void mo6812d() {
        this.f5948d.mo6812d();
        this.f5949e.mo6812d();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0925m1
    @GuardedBy("mLock")
    /* renamed from: e */
    public final ConnectionResult mo6813e() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0925m1
    /* renamed from: f */
    public final void mo6814f() {
        this.f5957m.lock();
        try {
            boolean m6873g = m6873g();
            this.f5949e.mo6810b();
            this.f5955k = new ConnectionResult(4);
            if (m6873g) {
                new HandlerC2824jq(this.f5947c).post(new RunnableC0958u2(this));
            } else {
                m6870i();
            }
        } finally {
            this.f5957m.unlock();
        }
    }

    /* renamed from: g */
    public final boolean m6873g() {
        this.f5957m.lock();
        try {
            return this.f5958n == 2;
        } finally {
            this.f5957m.unlock();
        }
    }
}
