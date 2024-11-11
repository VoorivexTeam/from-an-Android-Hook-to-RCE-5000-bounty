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
import com.google.android.gms.common.C0993c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.AbstractC0864f;
import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.api.C0863e;
import com.google.android.gms.common.api.C0987r;
import com.google.android.gms.common.api.InterfaceC0865g;
import com.google.android.gms.common.api.InterfaceC0982m;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0915k;
import com.google.android.gms.common.internal.AbstractC1020d;
import com.google.android.gms.common.internal.C1036l;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.C1059v;
import com.google.android.gms.common.internal.InterfaceC1038m;
import com.google.android.gms.common.util.C1096b;
import com.google.android.gms.common.util.C1108n;
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
import p000.AbstractC2871ks;
import p000.C0500c0;
import p000.C2366d0;
import p000.C2908ls;
import p000.HandlerC2824jq;
import p000.InterfaceC3497yr;

/* renamed from: com.google.android.gms.common.api.internal.g */
/* loaded from: classes.dex */
public class C0899g implements Handler.Callback {

    /* renamed from: n */
    public static final Status f5806n = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: o */
    private static final Status f5807o = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: p */
    private static final Object f5808p = new Object();

    /* renamed from: q */
    @GuardedBy("lock")
    private static C0899g f5809q;

    /* renamed from: d */
    private final Context f5813d;

    /* renamed from: e */
    private final C0993c f5814e;

    /* renamed from: f */
    private final C1036l f5815f;

    /* renamed from: m */
    private final Handler f5822m;

    /* renamed from: a */
    private long f5810a = 5000;

    /* renamed from: b */
    private long f5811b = 120000;

    /* renamed from: c */
    private long f5812c = 10000;

    /* renamed from: g */
    private final AtomicInteger f5816g = new AtomicInteger(1);

    /* renamed from: h */
    private final AtomicInteger f5817h = new AtomicInteger(0);

    /* renamed from: i */
    private final Map<C0875b<?>, a<?>> f5818i = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: j */
    @GuardedBy("lock")
    private C0967x f5819j = null;

    /* renamed from: k */
    @GuardedBy("lock")
    private final Set<C0875b<?>> f5820k = new C2366d0();

    /* renamed from: l */
    private final Set<C0875b<?>> f5821l = new C2366d0();

    /* renamed from: com.google.android.gms.common.api.internal.g$a */
    /* loaded from: classes.dex */
    public class a<O extends C0859a.d> implements AbstractC0864f.b, AbstractC0864f.c, InterfaceC0950s2 {

        /* renamed from: b */
        private final C0859a.f f5824b;

        /* renamed from: c */
        private final C0859a.b f5825c;

        /* renamed from: d */
        private final C0875b<O> f5826d;

        /* renamed from: e */
        private final C0874a3 f5827e;

        /* renamed from: h */
        private final int f5830h;

        /* renamed from: i */
        private final BinderC0953t1 f5831i;

        /* renamed from: j */
        private boolean f5832j;

        /* renamed from: a */
        private final Queue<AbstractC0941q1> f5823a = new LinkedList();

        /* renamed from: f */
        private final Set<C0918k2> f5828f = new HashSet();

        /* renamed from: g */
        private final Map<C0915k.a<?>, C0937p1> f5829g = new HashMap();

        /* renamed from: k */
        private final List<c> f5833k = new ArrayList();

        /* renamed from: l */
        private ConnectionResult f5834l = null;

        public a(C0863e<O> c0863e) {
            C0859a.f mo6533a = c0863e.mo6533a(C0899g.this.f5822m.getLooper(), this);
            this.f5824b = mo6533a;
            this.f5825c = mo6533a instanceof C1059v ? ((C1059v) mo6533a).m7302F() : mo6533a;
            this.f5826d = c0863e.mo6534a();
            this.f5827e = new C0874a3();
            this.f5830h = c0863e.m6545f();
            if (this.f5824b.mo6521n()) {
                this.f5831i = c0863e.mo6536a(C0899g.this.f5813d, C0899g.this.f5822m);
            } else {
                this.f5831i = null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        private final Feature m6720a(Feature[] featureArr) {
            if (featureArr != null && featureArr.length != 0) {
                Feature[] m6519k = this.f5824b.m6519k();
                if (m6519k == null) {
                    m6519k = new Feature[0];
                }
                C0500c0 c0500c0 = new C0500c0(m6519k.length);
                for (Feature feature : m6519k) {
                    c0500c0.put(feature.m6489j(), Long.valueOf(feature.m6490k()));
                }
                for (Feature feature2 : featureArr) {
                    if (!c0500c0.containsKey(feature2.m6489j()) || ((Long) c0500c0.get(feature2.m6489j())).longValue() < feature2.m6490k()) {
                        return feature2;
                    }
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public final void m6723a(c cVar) {
            if (this.f5833k.contains(cVar) && !this.f5832j) {
                if (this.f5824b.m6514a()) {
                    m6736p();
                } else {
                    m6739a();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public final boolean m6725a(boolean z) {
            C1057u.m7290a(C0899g.this.f5822m);
            if (!this.f5824b.m6514a() || this.f5829g.size() != 0) {
                return false;
            }
            if (!this.f5827e.m6612a()) {
                this.f5824b.mo6515b();
                return true;
            }
            if (z) {
                m6738r();
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final void m6728b(c cVar) {
            Feature[] mo6769b;
            if (this.f5833k.remove(cVar)) {
                C0899g.this.f5822m.removeMessages(15, cVar);
                C0899g.this.f5822m.removeMessages(16, cVar);
                Feature feature = cVar.f5843b;
                ArrayList arrayList = new ArrayList(this.f5823a.size());
                for (AbstractC0941q1 abstractC0941q1 : this.f5823a) {
                    if ((abstractC0941q1 instanceof AbstractC0956u0) && (mo6769b = ((AbstractC0956u0) abstractC0941q1).mo6769b((a<?>) this)) != null && C1096b.m7368a(mo6769b, feature)) {
                        arrayList.add(abstractC0941q1);
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    AbstractC0941q1 abstractC0941q12 = (AbstractC0941q1) obj;
                    this.f5823a.remove(abstractC0941q12);
                    abstractC0941q12.mo6684a(new C0987r(feature));
                }
            }
        }

        /* renamed from: b */
        private final boolean m6729b(AbstractC0941q1 abstractC0941q1) {
            if (!(abstractC0941q1 instanceof AbstractC0956u0)) {
                m6731c(abstractC0941q1);
                return true;
            }
            AbstractC0956u0 abstractC0956u0 = (AbstractC0956u0) abstractC0941q1;
            Feature m6720a = m6720a(abstractC0956u0.mo6769b((a<?>) this));
            if (m6720a == null) {
                m6731c(abstractC0941q1);
                return true;
            }
            if (!abstractC0956u0.mo6770c(this)) {
                abstractC0956u0.mo6684a(new C0987r(m6720a));
                return false;
            }
            c cVar = new c(this.f5826d, m6720a, null);
            int indexOf = this.f5833k.indexOf(cVar);
            if (indexOf >= 0) {
                c cVar2 = this.f5833k.get(indexOf);
                C0899g.this.f5822m.removeMessages(15, cVar2);
                C0899g.this.f5822m.sendMessageDelayed(Message.obtain(C0899g.this.f5822m, 15, cVar2), C0899g.this.f5810a);
                return false;
            }
            this.f5833k.add(cVar);
            C0899g.this.f5822m.sendMessageDelayed(Message.obtain(C0899g.this.f5822m, 15, cVar), C0899g.this.f5810a);
            C0899g.this.f5822m.sendMessageDelayed(Message.obtain(C0899g.this.f5822m, 16, cVar), C0899g.this.f5811b);
            ConnectionResult connectionResult = new ConnectionResult(2, null);
            if (m6732c(connectionResult)) {
                return false;
            }
            C0899g.this.m6718b(connectionResult, this.f5830h);
            return false;
        }

        /* renamed from: c */
        private final void m6731c(AbstractC0941q1 abstractC0941q1) {
            abstractC0941q1.mo6682a(this.f5827e, m6748d());
            try {
                abstractC0941q1.mo6683a((a<?>) this);
            } catch (DeadObjectException unused) {
                mo6688a(1);
                this.f5824b.mo6515b();
            }
        }

        /* renamed from: c */
        private final boolean m6732c(ConnectionResult connectionResult) {
            synchronized (C0899g.f5808p) {
                if (C0899g.this.f5819j == null || !C0899g.this.f5820k.contains(this.f5826d)) {
                    return false;
                }
                C0899g.this.f5819j.m6803b(connectionResult, this.f5830h);
                return true;
            }
        }

        /* renamed from: d */
        private final void m6733d(ConnectionResult connectionResult) {
            for (C0918k2 c0918k2 : this.f5828f) {
                String str = null;
                if (C1050s.m7205a(connectionResult, ConnectionResult.f5655f)) {
                    str = this.f5824b.m6520l();
                }
                c0918k2.m6795a(this.f5826d, connectionResult, str);
            }
            this.f5828f.clear();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public final void m6734n() {
            m6754j();
            m6733d(ConnectionResult.f5655f);
            m6737q();
            Iterator<C0937p1> it = this.f5829g.values().iterator();
            while (it.hasNext()) {
                C0937p1 next = it.next();
                if (m6720a(next.f5911a.m6818c()) == null) {
                    try {
                        next.f5911a.mo6816a(this.f5825c, new C2908ls<>());
                    } catch (DeadObjectException unused) {
                        mo6688a(1);
                        this.f5824b.mo6515b();
                    } catch (RemoteException unused2) {
                    }
                }
                it.remove();
            }
            m6736p();
            m6738r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public final void m6735o() {
            m6754j();
            this.f5832j = true;
            this.f5827e.m6614c();
            C0899g.this.f5822m.sendMessageDelayed(Message.obtain(C0899g.this.f5822m, 9, this.f5826d), C0899g.this.f5810a);
            C0899g.this.f5822m.sendMessageDelayed(Message.obtain(C0899g.this.f5822m, 11, this.f5826d), C0899g.this.f5811b);
            C0899g.this.f5815f.m7173a();
        }

        /* renamed from: p */
        private final void m6736p() {
            ArrayList arrayList = new ArrayList(this.f5823a);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                AbstractC0941q1 abstractC0941q1 = (AbstractC0941q1) obj;
                if (!this.f5824b.m6514a()) {
                    return;
                }
                if (m6729b(abstractC0941q1)) {
                    this.f5823a.remove(abstractC0941q1);
                }
            }
        }

        /* renamed from: q */
        private final void m6737q() {
            if (this.f5832j) {
                C0899g.this.f5822m.removeMessages(11, this.f5826d);
                C0899g.this.f5822m.removeMessages(9, this.f5826d);
                this.f5832j = false;
            }
        }

        /* renamed from: r */
        private final void m6738r() {
            C0899g.this.f5822m.removeMessages(12, this.f5826d);
            C0899g.this.f5822m.sendMessageDelayed(C0899g.this.f5822m.obtainMessage(12, this.f5826d), C0899g.this.f5812c);
        }

        /* renamed from: a */
        public final void m6739a() {
            C1057u.m7290a(C0899g.this.f5822m);
            if (this.f5824b.m6514a() || this.f5824b.m6518j()) {
                return;
            }
            int m7172a = C0899g.this.f5815f.m7172a(C0899g.this.f5813d, this.f5824b);
            if (m7172a != 0) {
                mo6740a(new ConnectionResult(m7172a, null));
                return;
            }
            b bVar = new b(this.f5824b, this.f5826d);
            if (this.f5824b.mo6521n()) {
                this.f5831i.m6883a(bVar);
            }
            this.f5824b.m6510a(bVar);
        }

        @Override // com.google.android.gms.common.api.internal.InterfaceC0895f
        /* renamed from: a */
        public final void mo6688a(int i) {
            if (Looper.myLooper() == C0899g.this.f5822m.getLooper()) {
                m6735o();
            } else {
                C0899g.this.f5822m.post(new RunnableC0897f1(this));
            }
        }

        @Override // com.google.android.gms.common.api.internal.InterfaceC0923m
        /* renamed from: a */
        public final void mo6740a(ConnectionResult connectionResult) {
            C1057u.m7290a(C0899g.this.f5822m);
            BinderC0953t1 binderC0953t1 = this.f5831i;
            if (binderC0953t1 != null) {
                binderC0953t1.m6884h();
            }
            m6754j();
            C0899g.this.f5815f.m7173a();
            m6733d(connectionResult);
            if (connectionResult.m6484j() == 4) {
                m6742a(C0899g.f5807o);
                return;
            }
            if (this.f5823a.isEmpty()) {
                this.f5834l = connectionResult;
                return;
            }
            if (m6732c(connectionResult) || C0899g.this.m6718b(connectionResult, this.f5830h)) {
                return;
            }
            if (connectionResult.m6484j() == 18) {
                this.f5832j = true;
            }
            if (this.f5832j) {
                C0899g.this.f5822m.sendMessageDelayed(Message.obtain(C0899g.this.f5822m, 9, this.f5826d), C0899g.this.f5810a);
                return;
            }
            String m6617a = this.f5826d.m6617a();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(m6617a).length() + 63 + String.valueOf(valueOf).length());
            sb.append("API: ");
            sb.append(m6617a);
            sb.append(" is not available on this device. Connection failed with: ");
            sb.append(valueOf);
            m6742a(new Status(17, sb.toString()));
        }

        @Override // com.google.android.gms.common.api.internal.InterfaceC0950s2
        /* renamed from: a */
        public final void mo6741a(ConnectionResult connectionResult, C0859a<?> c0859a, boolean z) {
            if (Looper.myLooper() == C0899g.this.f5822m.getLooper()) {
                mo6740a(connectionResult);
            } else {
                C0899g.this.f5822m.post(new RunnableC0892e1(this, connectionResult));
            }
        }

        /* renamed from: a */
        public final void m6742a(Status status) {
            C1057u.m7290a(C0899g.this.f5822m);
            Iterator<AbstractC0941q1> it = this.f5823a.iterator();
            while (it.hasNext()) {
                it.next().mo6681a(status);
            }
            this.f5823a.clear();
        }

        /* renamed from: a */
        public final void m6743a(C0918k2 c0918k2) {
            C1057u.m7290a(C0899g.this.f5822m);
            this.f5828f.add(c0918k2);
        }

        /* renamed from: a */
        public final void m6744a(AbstractC0941q1 abstractC0941q1) {
            C1057u.m7290a(C0899g.this.f5822m);
            if (this.f5824b.m6514a()) {
                if (m6729b(abstractC0941q1)) {
                    m6738r();
                    return;
                } else {
                    this.f5823a.add(abstractC0941q1);
                    return;
                }
            }
            this.f5823a.add(abstractC0941q1);
            ConnectionResult connectionResult = this.f5834l;
            if (connectionResult == null || !connectionResult.m6487m()) {
                m6739a();
            } else {
                mo6740a(this.f5834l);
            }
        }

        /* renamed from: b */
        public final int m6745b() {
            return this.f5830h;
        }

        @Override // com.google.android.gms.common.api.internal.InterfaceC0895f
        /* renamed from: b */
        public final void mo6689b(Bundle bundle) {
            if (Looper.myLooper() == C0899g.this.f5822m.getLooper()) {
                m6734n();
            } else {
                C0899g.this.f5822m.post(new RunnableC0887d1(this));
            }
        }

        /* renamed from: b */
        public final void m6746b(ConnectionResult connectionResult) {
            C1057u.m7290a(C0899g.this.f5822m);
            this.f5824b.mo6515b();
            mo6740a(connectionResult);
        }

        /* renamed from: c */
        final boolean m6747c() {
            return this.f5824b.m6514a();
        }

        /* renamed from: d */
        public final boolean m6748d() {
            return this.f5824b.mo6521n();
        }

        /* renamed from: e */
        public final void m6749e() {
            C1057u.m7290a(C0899g.this.f5822m);
            if (this.f5832j) {
                m6739a();
            }
        }

        /* renamed from: f */
        public final C0859a.f m6750f() {
            return this.f5824b;
        }

        /* renamed from: g */
        public final void m6751g() {
            C1057u.m7290a(C0899g.this.f5822m);
            if (this.f5832j) {
                m6737q();
                m6742a(C0899g.this.f5814e.mo6964c(C0899g.this.f5813d) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
                this.f5824b.mo6515b();
            }
        }

        /* renamed from: h */
        public final void m6752h() {
            C1057u.m7290a(C0899g.this.f5822m);
            m6742a(C0899g.f5806n);
            this.f5827e.m6613b();
            for (C0915k.a aVar : (C0915k.a[]) this.f5829g.keySet().toArray(new C0915k.a[this.f5829g.size()])) {
                m6744a(new C0910i2(aVar, new C2908ls()));
            }
            m6733d(new ConnectionResult(4));
            if (this.f5824b.m6514a()) {
                this.f5824b.m6511a(new C0905h1(this));
            }
        }

        /* renamed from: i */
        public final Map<C0915k.a<?>, C0937p1> m6753i() {
            return this.f5829g;
        }

        /* renamed from: j */
        public final void m6754j() {
            C1057u.m7290a(C0899g.this.f5822m);
            this.f5834l = null;
        }

        /* renamed from: k */
        public final ConnectionResult m6755k() {
            C1057u.m7290a(C0899g.this.f5822m);
            return this.f5834l;
        }

        /* renamed from: l */
        public final boolean m6756l() {
            return m6725a(true);
        }

        /* renamed from: m */
        final InterfaceC3497yr m6757m() {
            BinderC0953t1 binderC0953t1 = this.f5831i;
            if (binderC0953t1 == null) {
                return null;
            }
            return binderC0953t1.m6882a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.common.api.internal.g$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC0957u1, AbstractC1020d.c {

        /* renamed from: a */
        private final C0859a.f f5836a;

        /* renamed from: b */
        private final C0875b<?> f5837b;

        /* renamed from: c */
        private InterfaceC1038m f5838c = null;

        /* renamed from: d */
        private Set<Scope> f5839d = null;

        /* renamed from: e */
        private boolean f5840e = false;

        public b(C0859a.f fVar, C0875b<?> c0875b) {
            this.f5836a = fVar;
            this.f5837b = c0875b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public final void m6759a() {
            InterfaceC1038m interfaceC1038m;
            if (!this.f5840e || (interfaceC1038m = this.f5838c) == null) {
                return;
            }
            this.f5836a.m6512a(interfaceC1038m, this.f5839d);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public static /* synthetic */ boolean m6760a(b bVar, boolean z) {
            bVar.f5840e = true;
            return true;
        }

        @Override // com.google.android.gms.common.internal.AbstractC1020d.c
        /* renamed from: a */
        public final void mo6763a(ConnectionResult connectionResult) {
            C0899g.this.f5822m.post(new RunnableC0913j1(this, connectionResult));
        }

        @Override // com.google.android.gms.common.api.internal.InterfaceC0957u1
        /* renamed from: a */
        public final void mo6764a(InterfaceC1038m interfaceC1038m, Set<Scope> set) {
            if (interfaceC1038m == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                mo6765b(new ConnectionResult(4));
            } else {
                this.f5838c = interfaceC1038m;
                this.f5839d = set;
                m6759a();
            }
        }

        @Override // com.google.android.gms.common.api.internal.InterfaceC0957u1
        /* renamed from: b */
        public final void mo6765b(ConnectionResult connectionResult) {
            ((a) C0899g.this.f5818i.get(this.f5837b)).m6746b(connectionResult);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.common.api.internal.g$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        private final C0875b<?> f5842a;

        /* renamed from: b */
        private final Feature f5843b;

        private c(C0875b<?> c0875b, Feature feature) {
            this.f5842a = c0875b;
            this.f5843b = feature;
        }

        /* synthetic */ c(C0875b c0875b, Feature feature, C0882c1 c0882c1) {
            this(c0875b, feature);
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof c)) {
                c cVar = (c) obj;
                if (C1050s.m7205a(this.f5842a, cVar.f5842a) && C1050s.m7205a(this.f5843b, cVar.f5843b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return C1050s.m7203a(this.f5842a, this.f5843b);
        }

        public final String toString() {
            C1050s.a m7204a = C1050s.m7204a(this);
            m7204a.m7206a("key", this.f5842a);
            m7204a.m7206a("feature", this.f5843b);
            return m7204a.toString();
        }
    }

    private C0899g(Context context, Looper looper, C0993c c0993c) {
        this.f5813d = context;
        this.f5822m = new HandlerC2824jq(looper, this);
        this.f5814e = c0993c;
        this.f5815f = new C1036l(c0993c);
        Handler handler = this.f5822m;
        handler.sendMessage(handler.obtainMessage(6));
    }

    /* renamed from: a */
    public static C0899g m6693a(Context context) {
        C0899g c0899g;
        synchronized (f5808p) {
            if (f5809q == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f5809q = new C0899g(context.getApplicationContext(), handlerThread.getLooper(), C0993c.m6949a());
            }
            c0899g = f5809q;
        }
        return c0899g;
    }

    /* renamed from: b */
    private final void m6695b(C0863e<?> c0863e) {
        C0875b<?> mo6534a = c0863e.mo6534a();
        a<?> aVar = this.f5818i.get(mo6534a);
        if (aVar == null) {
            aVar = new a<>(c0863e);
            this.f5818i.put(mo6534a, aVar);
        }
        if (aVar.m6748d()) {
            this.f5821l.add(mo6534a);
        }
        aVar.m6739a();
    }

    /* renamed from: d */
    public static void m6698d() {
        synchronized (f5808p) {
            if (f5809q != null) {
                C0899g c0899g = f5809q;
                c0899g.f5817h.incrementAndGet();
                c0899g.f5822m.sendMessageAtFrontOfQueue(c0899g.f5822m.obtainMessage(10));
            }
        }
    }

    /* renamed from: e */
    public static C0899g m6699e() {
        C0899g c0899g;
        synchronized (f5808p) {
            C1057u.m7287a(f5809q, "Must guarantee manager is non-null before using getInstance");
            c0899g = f5809q;
        }
        return c0899g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final PendingIntent m6708a(C0875b<?> c0875b, int i) {
        InterfaceC3497yr m6757m;
        a<?> aVar = this.f5818i.get(c0875b);
        if (aVar == null || (m6757m = aVar.m6757m()) == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f5813d, i, m6757m.mo6466m(), 134217728);
    }

    /* renamed from: a */
    public final <O extends C0859a.d> AbstractC2871ks<Boolean> m6709a(C0863e<O> c0863e, C0915k.a<?> aVar) {
        C2908ls c2908ls = new C2908ls();
        C0910i2 c0910i2 = new C0910i2(aVar, c2908ls);
        Handler handler = this.f5822m;
        handler.sendMessage(handler.obtainMessage(13, new C0933o1(c0910i2, this.f5817h.get(), c0863e)));
        return c2908ls.m13924a();
    }

    /* renamed from: a */
    public final <O extends C0859a.d> AbstractC2871ks<Void> m6710a(C0863e<O> c0863e, AbstractC0927n<C0859a.b, ?> abstractC0927n, AbstractC0951t<C0859a.b, ?> abstractC0951t) {
        C2908ls c2908ls = new C2908ls();
        C0906h2 c0906h2 = new C0906h2(new C0937p1(abstractC0927n, abstractC0951t), c2908ls);
        Handler handler = this.f5822m;
        handler.sendMessage(handler.obtainMessage(8, new C0933o1(c0906h2, this.f5817h.get(), c0863e)));
        return c2908ls.m13924a();
    }

    /* renamed from: a */
    public final AbstractC2871ks<Map<C0875b<?>, String>> m6711a(Iterable<? extends InterfaceC0865g<?>> iterable) {
        C0918k2 c0918k2 = new C0918k2(iterable);
        Handler handler = this.f5822m;
        handler.sendMessage(handler.obtainMessage(2, c0918k2));
        return c0918k2.m6794a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m6712a() {
        this.f5817h.incrementAndGet();
        Handler handler = this.f5822m;
        handler.sendMessage(handler.obtainMessage(10));
    }

    /* renamed from: a */
    public final void m6713a(ConnectionResult connectionResult, int i) {
        if (m6718b(connectionResult, i)) {
            return;
        }
        Handler handler = this.f5822m;
        handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
    }

    /* renamed from: a */
    public final void m6714a(C0863e<?> c0863e) {
        Handler handler = this.f5822m;
        handler.sendMessage(handler.obtainMessage(7, c0863e));
    }

    /* renamed from: a */
    public final <O extends C0859a.d> void m6715a(C0863e<O> c0863e, int i, AbstractC0885d<? extends InterfaceC0982m, C0859a.b> abstractC0885d) {
        C0893e2 c0893e2 = new C0893e2(i, abstractC0885d);
        Handler handler = this.f5822m;
        handler.sendMessage(handler.obtainMessage(4, new C0933o1(c0893e2, this.f5817h.get(), c0863e)));
    }

    /* renamed from: a */
    public final <O extends C0859a.d, ResultT> void m6716a(C0863e<O> c0863e, int i, AbstractC0943r<C0859a.b, ResultT> abstractC0943r, C2908ls<ResultT> c2908ls, InterfaceC0935p interfaceC0935p) {
        C0902g2 c0902g2 = new C0902g2(i, abstractC0943r, c2908ls, interfaceC0935p);
        Handler handler = this.f5822m;
        handler.sendMessage(handler.obtainMessage(4, new C0933o1(c0902g2, this.f5817h.get(), c0863e)));
    }

    /* renamed from: b */
    public final int m6717b() {
        return this.f5816g.getAndIncrement();
    }

    /* renamed from: b */
    final boolean m6718b(ConnectionResult connectionResult, int i) {
        return this.f5814e.m6961a(this.f5813d, connectionResult, i);
    }

    /* renamed from: c */
    public final void m6719c() {
        Handler handler = this.f5822m;
        handler.sendMessage(handler.obtainMessage(3));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        C2908ls<Boolean> m6926b;
        boolean valueOf;
        int i = message.what;
        a<?> aVar = null;
        switch (i) {
            case 1:
                this.f5812c = ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f5822m.removeMessages(12);
                for (C0875b<?> c0875b : this.f5818i.keySet()) {
                    Handler handler = this.f5822m;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c0875b), this.f5812c);
                }
                return true;
            case 2:
                C0918k2 c0918k2 = (C0918k2) message.obj;
                Iterator<C0875b<?>> it = c0918k2.m6796b().iterator();
                while (true) {
                    if (it.hasNext()) {
                        C0875b<?> next = it.next();
                        a<?> aVar2 = this.f5818i.get(next);
                        if (aVar2 == null) {
                            c0918k2.m6795a(next, new ConnectionResult(13), null);
                        } else if (aVar2.m6747c()) {
                            c0918k2.m6795a(next, ConnectionResult.f5655f, aVar2.m6750f().m6520l());
                        } else if (aVar2.m6755k() != null) {
                            c0918k2.m6795a(next, aVar2.m6755k(), null);
                        } else {
                            aVar2.m6743a(c0918k2);
                            aVar2.m6739a();
                        }
                    }
                }
                return true;
            case 3:
                for (a<?> aVar3 : this.f5818i.values()) {
                    aVar3.m6754j();
                    aVar3.m6739a();
                }
                return true;
            case 4:
            case 8:
            case 13:
                C0933o1 c0933o1 = (C0933o1) message.obj;
                a<?> aVar4 = this.f5818i.get(c0933o1.f5907c.mo6534a());
                if (aVar4 == null) {
                    m6695b(c0933o1.f5907c);
                    aVar4 = this.f5818i.get(c0933o1.f5907c.mo6534a());
                }
                if (!aVar4.m6748d() || this.f5817h.get() == c0933o1.f5906b) {
                    aVar4.m6744a(c0933o1.f5905a);
                } else {
                    c0933o1.f5905a.mo6681a(f5806n);
                    aVar4.m6752h();
                }
                return true;
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator<a<?>> it2 = this.f5818i.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        a<?> next2 = it2.next();
                        if (next2.m6745b() == i2) {
                            aVar = next2;
                        }
                    }
                }
                if (aVar != null) {
                    String mo6962b = this.f5814e.mo6962b(connectionResult.m6484j());
                    String m6485k = connectionResult.m6485k();
                    StringBuilder sb = new StringBuilder(String.valueOf(mo6962b).length() + 69 + String.valueOf(m6485k).length());
                    sb.append("Error resolution was canceled by the user, original error message: ");
                    sb.append(mo6962b);
                    sb.append(": ");
                    sb.append(m6485k);
                    aVar.m6742a(new Status(17, sb.toString()));
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i2);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                }
                return true;
            case 6:
                if (C1108n.m7395a() && (this.f5813d.getApplicationContext() instanceof Application)) {
                    ComponentCallbacks2C0880c.m6628a((Application) this.f5813d.getApplicationContext());
                    ComponentCallbacks2C0880c.m6629b().m6631a(new C0882c1(this));
                    if (!ComponentCallbacks2C0880c.m6629b().m6633a(true)) {
                        this.f5812c = 300000L;
                    }
                }
                return true;
            case 7:
                m6695b((C0863e<?>) message.obj);
                return true;
            case 9:
                if (this.f5818i.containsKey(message.obj)) {
                    this.f5818i.get(message.obj).m6749e();
                }
                return true;
            case 10:
                Iterator<C0875b<?>> it3 = this.f5821l.iterator();
                while (it3.hasNext()) {
                    this.f5818i.remove(it3.next()).m6752h();
                }
                this.f5821l.clear();
                return true;
            case 11:
                if (this.f5818i.containsKey(message.obj)) {
                    this.f5818i.get(message.obj).m6751g();
                }
                return true;
            case 12:
                if (this.f5818i.containsKey(message.obj)) {
                    this.f5818i.get(message.obj).m6756l();
                }
                return true;
            case 14:
                C0971y c0971y = (C0971y) message.obj;
                C0875b<?> m6925a = c0971y.m6925a();
                if (this.f5818i.containsKey(m6925a)) {
                    boolean m6725a = this.f5818i.get(m6925a).m6725a(false);
                    m6926b = c0971y.m6926b();
                    valueOf = Boolean.valueOf(m6725a);
                } else {
                    m6926b = c0971y.m6926b();
                    valueOf = false;
                }
                m6926b.m13926a((C2908ls<Boolean>) valueOf);
                return true;
            case 15:
                c cVar = (c) message.obj;
                if (this.f5818i.containsKey(cVar.f5842a)) {
                    this.f5818i.get(cVar.f5842a).m6723a(cVar);
                }
                return true;
            case 16:
                c cVar2 = (c) message.obj;
                if (this.f5818i.containsKey(cVar2.f5842a)) {
                    this.f5818i.get(cVar2.f5842a).m6728b(cVar2);
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
