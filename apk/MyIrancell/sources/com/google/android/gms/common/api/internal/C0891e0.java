package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C0994d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC0864f;
import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.api.InterfaceC0982m;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C1022e;
import com.google.android.gms.common.internal.InterfaceC1038m;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.zak;
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
import p000.C3369vr;
import p000.InterfaceC3497yr;

/* renamed from: com.google.android.gms.common.api.internal.e0 */
/* loaded from: classes.dex */
public final class C0891e0 implements InterfaceC0964w0 {

    /* renamed from: a */
    private final C0976z0 f5774a;

    /* renamed from: b */
    private final Lock f5775b;

    /* renamed from: c */
    private final Context f5776c;

    /* renamed from: d */
    private final C0994d f5777d;

    /* renamed from: e */
    private ConnectionResult f5778e;

    /* renamed from: f */
    private int f5779f;

    /* renamed from: h */
    private int f5781h;

    /* renamed from: k */
    private InterfaceC3497yr f5784k;

    /* renamed from: l */
    private boolean f5785l;

    /* renamed from: m */
    private boolean f5786m;

    /* renamed from: n */
    private boolean f5787n;

    /* renamed from: o */
    private InterfaceC1038m f5788o;

    /* renamed from: p */
    private boolean f5789p;

    /* renamed from: q */
    private boolean f5790q;

    /* renamed from: r */
    private final C1022e f5791r;

    /* renamed from: s */
    private final Map<C0859a<?>, Boolean> f5792s;

    /* renamed from: t */
    private final C0859a.a<? extends InterfaceC3497yr, C3369vr> f5793t;

    /* renamed from: g */
    private int f5780g = 0;

    /* renamed from: i */
    private final Bundle f5782i = new Bundle();

    /* renamed from: j */
    private final Set<C0859a.c> f5783j = new HashSet();

    /* renamed from: u */
    private ArrayList<Future<?>> f5794u = new ArrayList<>();

    public C0891e0(C0976z0 c0976z0, C1022e c1022e, Map<C0859a<?>, Boolean> map, C0994d c0994d, C0859a.a<? extends InterfaceC3497yr, C3369vr> aVar, Lock lock, Context context) {
        this.f5774a = c0976z0;
        this.f5791r = c1022e;
        this.f5792s = map;
        this.f5777d = c0994d;
        this.f5793t = aVar;
        this.f5775b = lock;
        this.f5776c = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: a */
    public final void m6647a(zak zakVar) {
        if (m6654b(0)) {
            ConnectionResult m9983j = zakVar.m9983j();
            if (!m9983j.m6488n()) {
                if (!m6649a(m9983j)) {
                    m6652b(m9983j);
                    return;
                } else {
                    m6665g();
                    m6660e();
                    return;
                }
            }
            ResolveAccountResponse m9984k = zakVar.m9984k();
            ConnectionResult m7035k = m9984k.m7035k();
            if (m7035k.m6488n()) {
                this.f5787n = true;
                this.f5788o = m9984k.m7034j();
                this.f5789p = m9984k.m7036l();
                this.f5790q = m9984k.m7037m();
                m6660e();
                return;
            }
            String valueOf = String.valueOf(m7035k);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
            sb.append("Sign-in succeeded with resolve account failure: ");
            sb.append(valueOf);
            Log.wtf("GACConnecting", sb.toString(), new Exception());
            m6652b(m7035k);
        }
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    private final void m6648a(boolean z) {
        InterfaceC3497yr interfaceC3497yr = this.f5784k;
        if (interfaceC3497yr != null) {
            if (interfaceC3497yr.m6514a() && z) {
                this.f5784k.mo9975d();
            }
            this.f5784k.mo6515b();
            if (this.f5791r.m7127k()) {
                this.f5784k = null;
            }
            this.f5788o = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: a */
    public final boolean m6649a(ConnectionResult connectionResult) {
        return this.f5785l && !connectionResult.m6487m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: b */
    public final void m6652b(ConnectionResult connectionResult) {
        m6667h();
        m6648a(!connectionResult.m6487m());
        this.f5774a.m6932a(connectionResult);
        this.f5774a.f6038o.mo6822a(connectionResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if ((r5.m6487m() || r4.f5777d.m6971a(r5.m6484j()) != null) != false) goto L12;
     */
    @javax.annotation.concurrent.GuardedBy("mLock")
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6653b(com.google.android.gms.common.ConnectionResult r5, com.google.android.gms.common.api.C0859a<?> r6, boolean r7) {
        /*
            r4 = this;
            com.google.android.gms.common.api.a$e r0 = r6.m6504c()
            int r0 = r0.m6509a()
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L24
            boolean r7 = r5.m6487m()
            if (r7 == 0) goto L14
        L12:
            r7 = 1
            goto L22
        L14:
            com.google.android.gms.common.d r7 = r4.f5777d
            int r3 = r5.m6484j()
            android.content.Intent r7 = r7.m6971a(r3)
            if (r7 == 0) goto L21
            goto L12
        L21:
            r7 = 0
        L22:
            if (r7 == 0) goto L2d
        L24:
            com.google.android.gms.common.ConnectionResult r7 = r4.f5778e
            if (r7 == 0) goto L2c
            int r7 = r4.f5779f
            if (r0 >= r7) goto L2d
        L2c:
            r1 = 1
        L2d:
            if (r1 == 0) goto L33
            r4.f5778e = r5
            r4.f5779f = r0
        L33:
            com.google.android.gms.common.api.internal.z0 r7 = r4.f5774a
            java.util.Map<com.google.android.gms.common.api.a$c<?>, com.google.android.gms.common.ConnectionResult> r7 = r7.f6030g
            com.google.android.gms.common.api.a$c r6 = r6.m6502a()
            r7.put(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C0891e0.m6653b(com.google.android.gms.common.ConnectionResult, com.google.android.gms.common.api.a, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: b */
    public final boolean m6654b(int i) {
        if (this.f5780g == i) {
            return true;
        }
        this.f5774a.f6037n.m6843n();
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("Unexpected callback in ");
        sb.append(valueOf);
        sb.toString();
        int i2 = this.f5781h;
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("mRemainingConnections=");
        sb2.append(i2);
        sb2.toString();
        String m6656c = m6656c(this.f5780g);
        String m6656c2 = m6656c(i);
        StringBuilder sb3 = new StringBuilder(String.valueOf(m6656c).length() + 70 + String.valueOf(m6656c2).length());
        sb3.append("GoogleApiClient connecting is in step ");
        sb3.append(m6656c);
        sb3.append(" but received callback for step ");
        sb3.append(m6656c2);
        sb3.toString();
        new Exception();
        m6652b(new ConnectionResult(8, null));
        return false;
    }

    /* renamed from: c */
    private static String m6656c(int i) {
        return i != 0 ? i != 1 ? "UNKNOWN" : "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: d */
    public final boolean m6659d() {
        ConnectionResult connectionResult;
        int i = this.f5781h - 1;
        this.f5781h = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            this.f5774a.f6037n.m6843n();
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            connectionResult = new ConnectionResult(8, null);
        } else {
            connectionResult = this.f5778e;
            if (connectionResult == null) {
                return true;
            }
            this.f5774a.f6036m = this.f5779f;
        }
        m6652b(connectionResult);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: e */
    public final void m6660e() {
        if (this.f5781h != 0) {
            return;
        }
        if (!this.f5786m || this.f5787n) {
            ArrayList arrayList = new ArrayList();
            this.f5780g = 1;
            this.f5781h = this.f5774a.f6029f.size();
            for (C0859a.c<?> cVar : this.f5774a.f6029f.keySet()) {
                if (!this.f5774a.f6030g.containsKey(cVar)) {
                    arrayList.add(this.f5774a.f6029f.get(cVar));
                } else if (m6659d()) {
                    m6663f();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.f5794u.add(C0872a1.m6605a().submit(new C0916k0(this, arrayList)));
        }
    }

    @GuardedBy("mLock")
    /* renamed from: f */
    private final void m6663f() {
        this.f5774a.m6937i();
        C0872a1.m6605a().execute(new RunnableC0886d0(this));
        InterfaceC3497yr interfaceC3497yr = this.f5784k;
        if (interfaceC3497yr != null) {
            if (this.f5789p) {
                interfaceC3497yr.mo9972a(this.f5788o, this.f5790q);
            }
            m6648a(false);
        }
        Iterator<C0859a.c<?>> it = this.f5774a.f6030g.keySet().iterator();
        while (it.hasNext()) {
            this.f5774a.f6029f.get(it.next()).mo6515b();
        }
        this.f5774a.f6038o.mo6821a(this.f5782i.isEmpty() ? null : this.f5782i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: g */
    public final void m6665g() {
        this.f5786m = false;
        this.f5774a.f6037n.f5928q = Collections.emptySet();
        for (C0859a.c<?> cVar : this.f5783j) {
            if (!this.f5774a.f6030g.containsKey(cVar)) {
                this.f5774a.f6030g.put(cVar, new ConnectionResult(17, null));
            }
        }
    }

    /* renamed from: h */
    private final void m6667h() {
        ArrayList<Future<?>> arrayList = this.f5794u;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Future<?> future = arrayList.get(i);
            i++;
            future.cancel(true);
        }
        this.f5794u.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final Set<Scope> m6669i() {
        if (this.f5791r == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(this.f5791r.m7125i());
        Map<C0859a<?>, C1022e.b> m7122f = this.f5791r.m7122f();
        for (C0859a<?> c0859a : m7122f.keySet()) {
            if (!this.f5774a.f6030g.containsKey(c0859a.m6502a())) {
                hashSet.addAll(m7122f.get(c0859a).f6208a);
            }
        }
        return hashSet;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0964w0
    /* renamed from: a */
    public final <A extends C0859a.b, T extends AbstractC0885d<? extends InterfaceC0982m, A>> T mo6673a(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0964w0
    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo6674a() {
        this.f5774a.f6030g.clear();
        this.f5786m = false;
        RunnableC0886d0 runnableC0886d0 = null;
        this.f5778e = null;
        this.f5780g = 0;
        this.f5785l = true;
        this.f5787n = false;
        this.f5789p = false;
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (C0859a<?> c0859a : this.f5792s.keySet()) {
            C0859a.f fVar = this.f5774a.f6029f.get(c0859a.m6502a());
            z |= c0859a.m6504c().m6509a() == 1;
            boolean booleanValue = this.f5792s.get(c0859a).booleanValue();
            if (fVar.mo6521n()) {
                this.f5786m = true;
                if (booleanValue) {
                    this.f5783j.add(c0859a.m6502a());
                } else {
                    this.f5785l = false;
                }
            }
            hashMap.put(fVar, new C0900g0(this, c0859a, booleanValue));
        }
        if (z) {
            this.f5786m = false;
        }
        if (this.f5786m) {
            this.f5791r.m7117a(Integer.valueOf(System.identityHashCode(this.f5774a.f6037n)));
            C0920l0 c0920l0 = new C0920l0(this, runnableC0886d0);
            C0859a.a<? extends InterfaceC3497yr, C3369vr> aVar = this.f5793t;
            Context context = this.f5776c;
            Looper mo6563f = this.f5774a.f6037n.mo6563f();
            C1022e c1022e = this.f5791r;
            this.f5784k = aVar.mo6386a(context, mo6563f, c1022e, (C1022e) c1022e.m7126j(), (AbstractC0864f.b) c0920l0, (AbstractC0864f.c) c0920l0);
        }
        this.f5781h = this.f5774a.f6029f.size();
        this.f5794u.add(C0872a1.m6605a().submit(new C0896f0(this, hashMap)));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0964w0
    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo6675a(int i) {
        m6652b(new ConnectionResult(8, null));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0964w0
    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo6676a(ConnectionResult connectionResult, C0859a<?> c0859a, boolean z) {
        if (m6654b(1)) {
            m6653b(connectionResult, c0859a, z);
            if (m6659d()) {
                m6663f();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0964w0
    /* renamed from: b */
    public final <A extends C0859a.b, R extends InterfaceC0982m, T extends AbstractC0885d<R, A>> T mo6677b(T t) {
        this.f5774a.f6037n.f5920i.add(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0964w0
    @GuardedBy("mLock")
    /* renamed from: b */
    public final void mo6678b(Bundle bundle) {
        if (m6654b(1)) {
            if (bundle != null) {
                this.f5782i.putAll(bundle);
            }
            if (m6659d()) {
                m6663f();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0964w0
    @GuardedBy("mLock")
    /* renamed from: b */
    public final boolean mo6679b() {
        m6667h();
        m6648a(true);
        this.f5774a.m6932a((ConnectionResult) null);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0964w0
    /* renamed from: c */
    public final void mo6680c() {
    }
}
