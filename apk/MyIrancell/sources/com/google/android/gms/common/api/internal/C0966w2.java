package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.C0994d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.api.InterfaceC0982m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1022e;
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
import p000.C0500c0;
import p000.C3369vr;
import p000.ExecutorC3494yo;
import p000.InterfaceC3497yr;

/* renamed from: com.google.android.gms.common.api.internal.w2 */
/* loaded from: classes.dex */
public final class C0966w2 implements InterfaceC0925m1 {

    /* renamed from: c */
    private final Map<C0859a<?>, Boolean> f5997c;

    /* renamed from: d */
    private final C0899g f5998d;

    /* renamed from: e */
    private final C0940q0 f5999e;

    /* renamed from: f */
    private final Lock f6000f;

    /* renamed from: g */
    private final Looper f6001g;

    /* renamed from: h */
    private final C0994d f6002h;

    /* renamed from: i */
    private final Condition f6003i;

    /* renamed from: j */
    private final C1022e f6004j;

    /* renamed from: k */
    private final boolean f6005k;

    /* renamed from: l */
    private final boolean f6006l;

    /* renamed from: n */
    @GuardedBy("mLock")
    private boolean f6008n;

    /* renamed from: o */
    @GuardedBy("mLock")
    private Map<C0875b<?>, ConnectionResult> f6009o;

    /* renamed from: p */
    @GuardedBy("mLock")
    private Map<C0875b<?>, ConnectionResult> f6010p;

    /* renamed from: q */
    @GuardedBy("mLock")
    private C0955u f6011q;

    /* renamed from: r */
    @GuardedBy("mLock")
    private ConnectionResult f6012r;

    /* renamed from: a */
    private final Map<C0859a.c<?>, C0970x2<?>> f5995a = new HashMap();

    /* renamed from: b */
    private final Map<C0859a.c<?>, C0970x2<?>> f5996b = new HashMap();

    /* renamed from: m */
    private final Queue<AbstractC0885d<?, ?>> f6007m = new LinkedList();

    public C0966w2(Context context, Lock lock, Looper looper, C0994d c0994d, Map<C0859a.c<?>, C0859a.f> map, C1022e c1022e, Map<C0859a<?>, Boolean> map2, C0859a.a<? extends InterfaceC3497yr, C3369vr> aVar, ArrayList<C0942q2> arrayList, C0940q0 c0940q0, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        this.f6000f = lock;
        this.f6001g = looper;
        this.f6003i = lock.newCondition();
        this.f6002h = c0994d;
        this.f5999e = c0940q0;
        this.f5997c = map2;
        this.f6004j = c1022e;
        this.f6005k = z;
        HashMap hashMap = new HashMap();
        for (C0859a<?> c0859a : map2.keySet()) {
            hashMap.put(c0859a.m6502a(), c0859a);
        }
        HashMap hashMap2 = new HashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C0942q2 c0942q2 = arrayList.get(i);
            i++;
            C0942q2 c0942q22 = c0942q2;
            hashMap2.put(c0942q22.f5938a, c0942q22);
        }
        boolean z5 = false;
        boolean z6 = true;
        boolean z7 = false;
        for (Map.Entry<C0859a.c<?>, C0859a.f> entry : map.entrySet()) {
            C0859a c0859a2 = (C0859a) hashMap.get(entry.getKey());
            C0859a.f value = entry.getValue();
            if (value.m6517h()) {
                z4 = z6;
                if (this.f5997c.get(c0859a2).booleanValue()) {
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
            C0970x2<?> c0970x2 = new C0970x2<>(context, c0859a2, looper, value, (C0942q2) hashMap2.get(c0859a2), c1022e, aVar);
            this.f5995a.put(entry.getKey(), c0970x2);
            if (value.mo6521n()) {
                this.f5996b.put(entry.getKey(), c0970x2);
            }
            z5 = z2;
            z6 = z4;
            z7 = z3;
        }
        this.f6006l = (!z5 || z6 || z7) ? false : true;
        this.f5998d = C0899g.m6699e();
    }

    /* renamed from: a */
    private final ConnectionResult m6896a(C0859a.c<?> cVar) {
        this.f6000f.lock();
        try {
            C0970x2<?> c0970x2 = this.f5995a.get(cVar);
            if (this.f6009o != null && c0970x2 != null) {
                return this.f6009o.get(c0970x2.mo6534a());
            }
            this.f6000f.unlock();
            return null;
        } finally {
            this.f6000f.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ boolean m6901a(C0966w2 c0966w2, boolean z) {
        c0966w2.f6008n = false;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m6902a(C0970x2<?> c0970x2, ConnectionResult connectionResult) {
        return !connectionResult.m6488n() && !connectionResult.m6487m() && this.f5997c.get(c0970x2.m6543d()).booleanValue() && c0970x2.m6924h().m6517h() && this.f6002h.mo6965c(connectionResult.m6484j());
    }

    /* renamed from: c */
    private final <T extends AbstractC0885d<? extends InterfaceC0982m, ? extends C0859a.b>> boolean m6906c(T t) {
        C0859a.c<?> m6641h = t.m6641h();
        ConnectionResult m6896a = m6896a(m6641h);
        if (m6896a == null || m6896a.m6484j() != 4) {
            return false;
        }
        t.m6639c(new Status(4, null, this.f5998d.m6708a(this.f5995a.get(m6641h).mo6534a(), System.identityHashCode(this.f5999e))));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: h */
    public final void m6912h() {
        if (this.f6004j == null) {
            this.f5999e.f5928q = Collections.emptySet();
            return;
        }
        HashSet hashSet = new HashSet(this.f6004j.m7125i());
        Map<C0859a<?>, C1022e.b> m7122f = this.f6004j.m7122f();
        for (C0859a<?> c0859a : m7122f.keySet()) {
            ConnectionResult m6921a = m6921a(c0859a);
            if (m6921a != null && m6921a.m6488n()) {
                hashSet.addAll(m7122f.get(c0859a).f6208a);
            }
        }
        this.f5999e.f5928q = hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: i */
    public final void m6913i() {
        while (!this.f6007m.isEmpty()) {
            mo6805a((C0966w2) this.f6007m.remove());
        }
        this.f5999e.mo6821a((Bundle) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: j */
    public final ConnectionResult m6915j() {
        int i = 0;
        ConnectionResult connectionResult = null;
        ConnectionResult connectionResult2 = null;
        int i2 = 0;
        for (C0970x2<?> c0970x2 : this.f5995a.values()) {
            C0859a<?> m6543d = c0970x2.m6543d();
            ConnectionResult connectionResult3 = this.f6009o.get(c0970x2.mo6534a());
            if (!connectionResult3.m6488n() && (!this.f5997c.get(m6543d).booleanValue() || connectionResult3.m6487m() || this.f6002h.mo6965c(connectionResult3.m6484j()))) {
                if (connectionResult3.m6484j() == 4 && this.f6005k) {
                    int m6509a = m6543d.m6504c().m6509a();
                    if (connectionResult2 == null || i2 > m6509a) {
                        connectionResult2 = connectionResult3;
                        i2 = m6509a;
                    }
                } else {
                    int m6509a2 = m6543d.m6504c().m6509a();
                    if (connectionResult == null || i > m6509a2) {
                        connectionResult = connectionResult3;
                        i = m6509a2;
                    }
                }
            }
        }
        return (connectionResult == null || connectionResult2 == null || i <= i2) ? connectionResult : connectionResult2;
    }

    /* renamed from: k */
    private final boolean m6918k() {
        this.f6000f.lock();
        try {
            if (this.f6008n && this.f6005k) {
                Iterator<C0859a.c<?>> it = this.f5996b.keySet().iterator();
                while (it.hasNext()) {
                    ConnectionResult m6896a = m6896a(it.next());
                    if (m6896a != null && m6896a.m6488n()) {
                    }
                }
                this.f6000f.unlock();
                return true;
            }
            return false;
        } finally {
            this.f6000f.unlock();
        }
    }

    /* renamed from: a */
    public final ConnectionResult m6921a(C0859a<?> c0859a) {
        return m6896a(c0859a.m6502a());
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0925m1
    /* renamed from: a */
    public final <A extends C0859a.b, T extends AbstractC0885d<? extends InterfaceC0982m, A>> T mo6805a(T t) {
        C0859a.c<A> m6641h = t.m6641h();
        if (this.f6005k && m6906c((C0966w2) t)) {
            return t;
        }
        this.f5999e.f5936y.m6620a(t);
        this.f5995a.get(m6641h).m6541b(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0925m1
    /* renamed from: a */
    public final void mo6806a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0925m1
    /* renamed from: a */
    public final boolean mo6807a() {
        boolean z;
        this.f6000f.lock();
        try {
            if (this.f6009o != null) {
                if (this.f6012r == null) {
                    z = true;
                    return z;
                }
            }
            z = false;
            return z;
        } finally {
            this.f6000f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0925m1
    /* renamed from: a */
    public final boolean mo6808a(InterfaceC0931o interfaceC0931o) {
        this.f6000f.lock();
        try {
            if (!this.f6008n || m6918k()) {
                this.f6000f.unlock();
                return false;
            }
            this.f5998d.m6719c();
            this.f6011q = new C0955u(this, interfaceC0931o);
            this.f5998d.m6711a(this.f5996b.values()).mo11813a(new ExecutorC3494yo(this.f6001g), this.f6011q);
            this.f6000f.unlock();
            return true;
        } catch (Throwable th) {
            this.f6000f.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0925m1
    /* renamed from: b */
    public final <A extends C0859a.b, R extends InterfaceC0982m, T extends AbstractC0885d<R, A>> T mo6809b(T t) {
        if (this.f6005k && m6906c((C0966w2) t)) {
            return t;
        }
        if (!mo6807a()) {
            this.f6007m.add(t);
            return t;
        }
        this.f5999e.f5936y.m6620a(t);
        this.f5995a.get(t.m6641h()).m6535a((C0970x2<?>) t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0925m1
    /* renamed from: b */
    public final void mo6810b() {
        this.f6000f.lock();
        try {
            this.f6008n = false;
            this.f6009o = null;
            this.f6010p = null;
            if (this.f6011q != null) {
                this.f6011q.m6885a();
                this.f6011q = null;
            }
            this.f6012r = null;
            while (!this.f6007m.isEmpty()) {
                AbstractC0885d<?, ?> remove = this.f6007m.remove();
                remove.m6584a((InterfaceC0883c2) null);
                remove.m6583a();
            }
            this.f6003i.signalAll();
        } finally {
            this.f6000f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0925m1
    /* renamed from: c */
    public final void mo6811c() {
        this.f6000f.lock();
        try {
            if (!this.f6008n) {
                this.f6008n = true;
                this.f6009o = null;
                this.f6010p = null;
                this.f6011q = null;
                this.f6012r = null;
                this.f5998d.m6719c();
                this.f5998d.m6711a(this.f5995a.values()).mo11813a(new ExecutorC3494yo(this.f6001g), new C0974y2(this));
            }
        } finally {
            this.f6000f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0925m1
    /* renamed from: d */
    public final void mo6812d() {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0925m1
    @GuardedBy("mLock")
    /* renamed from: e */
    public final ConnectionResult mo6813e() {
        mo6811c();
        while (m6922g()) {
            try {
                this.f6003i.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (mo6807a()) {
            return ConnectionResult.f5655f;
        }
        ConnectionResult connectionResult = this.f6012r;
        return connectionResult != null ? connectionResult : new ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0925m1
    /* renamed from: f */
    public final void mo6814f() {
        this.f6000f.lock();
        try {
            this.f5998d.m6712a();
            if (this.f6011q != null) {
                this.f6011q.m6885a();
                this.f6011q = null;
            }
            if (this.f6010p == null) {
                this.f6010p = new C0500c0(this.f5996b.size());
            }
            ConnectionResult connectionResult = new ConnectionResult(4);
            Iterator<C0970x2<?>> it = this.f5996b.values().iterator();
            while (it.hasNext()) {
                this.f6010p.put(it.next().mo6534a(), connectionResult);
            }
            if (this.f6009o != null) {
                this.f6009o.putAll(this.f6010p);
            }
        } finally {
            this.f6000f.unlock();
        }
    }

    /* renamed from: g */
    public final boolean m6922g() {
        boolean z;
        this.f6000f.lock();
        try {
            if (this.f6009o == null) {
                if (this.f6008n) {
                    z = true;
                    return z;
                }
            }
            z = false;
            return z;
        } finally {
            this.f6000f.unlock();
        }
    }
}
