package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C0993c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC0864f;
import com.google.android.gms.common.api.AbstractC0866h;
import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.api.InterfaceC0982m;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1022e;
import com.google.android.gms.common.internal.C1030i;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.util.C1098d;
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
import p000.C2560ho;
import p000.C3369vr;
import p000.InterfaceC3497yr;

/* renamed from: com.google.android.gms.common.api.internal.q0 */
/* loaded from: classes.dex */
public final class C0940q0 extends AbstractC0864f implements InterfaceC0929n1 {

    /* renamed from: b */
    private final Lock f5913b;

    /* renamed from: c */
    private boolean f5914c;

    /* renamed from: d */
    private final C1030i f5915d;

    /* renamed from: f */
    private final int f5917f;

    /* renamed from: g */
    private final Context f5918g;

    /* renamed from: h */
    private final Looper f5919h;

    /* renamed from: j */
    private volatile boolean f5921j;

    /* renamed from: k */
    private long f5922k;

    /* renamed from: l */
    private long f5923l;

    /* renamed from: m */
    private final HandlerC0952t0 f5924m;

    /* renamed from: n */
    private final C0993c f5925n;

    /* renamed from: o */
    private C0921l1 f5926o;

    /* renamed from: p */
    final Map<C0859a.c<?>, C0859a.f> f5927p;

    /* renamed from: q */
    Set<Scope> f5928q;

    /* renamed from: r */
    private final C1022e f5929r;

    /* renamed from: s */
    private final Map<C0859a<?>, Boolean> f5930s;

    /* renamed from: t */
    private final C0859a.a<? extends InterfaceC3497yr, C3369vr> f5931t;

    /* renamed from: u */
    private final C0919l f5932u;

    /* renamed from: v */
    private final ArrayList<C0942q2> f5933v;

    /* renamed from: w */
    private Integer f5934w;

    /* renamed from: x */
    Set<C0965w1> f5935x;

    /* renamed from: y */
    final C0878b2 f5936y;

    /* renamed from: z */
    private final C1030i.a f5937z;

    /* renamed from: e */
    private InterfaceC0925m1 f5916e = null;

    /* renamed from: i */
    final Queue<AbstractC0885d<?, ?>> f5920i = new LinkedList();

    public C0940q0(Context context, Lock lock, Looper looper, C1022e c1022e, C0993c c0993c, C0859a.a<? extends InterfaceC3497yr, C3369vr> aVar, Map<C0859a<?>, Boolean> map, List<AbstractC0864f.b> list, List<AbstractC0864f.c> list2, Map<C0859a.c<?>, C0859a.f> map2, int i, int i2, ArrayList<C0942q2> arrayList, boolean z) {
        this.f5922k = C1098d.m7373a() ? 10000L : 120000L;
        this.f5923l = 5000L;
        this.f5928q = new HashSet();
        this.f5932u = new C0919l();
        this.f5934w = null;
        this.f5935x = null;
        C0936p0 c0936p0 = new C0936p0(this);
        this.f5937z = c0936p0;
        this.f5918g = context;
        this.f5913b = lock;
        this.f5914c = false;
        this.f5915d = new C1030i(looper, c0936p0);
        this.f5919h = looper;
        this.f5924m = new HandlerC0952t0(this, looper);
        this.f5925n = c0993c;
        this.f5917f = i;
        if (i >= 0) {
            this.f5934w = Integer.valueOf(i2);
        }
        this.f5930s = map;
        this.f5927p = map2;
        this.f5933v = arrayList;
        this.f5936y = new C0878b2(this.f5927p);
        Iterator<AbstractC0864f.b> it = list.iterator();
        while (it.hasNext()) {
            this.f5915d.m7154a(it.next());
        }
        Iterator<AbstractC0864f.c> it2 = list2.iterator();
        while (it2.hasNext()) {
            this.f5915d.m7155a(it2.next());
        }
        this.f5929r = c1022e;
        this.f5931t = aVar;
    }

    /* renamed from: a */
    public static int m6827a(Iterable<C0859a.f> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (C0859a.f fVar : iterable) {
            if (fVar.mo6521n()) {
                z2 = true;
            }
            if (fVar.mo6463e()) {
                z3 = true;
            }
        }
        if (z2) {
            return (z3 && z) ? 2 : 1;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m6828a(AbstractC0864f abstractC0864f, C0939q c0939q, boolean z) {
        C2560ho.f10505d.mo13512a(abstractC0864f).mo6574a(new C0960v0(this, c0939q, z, abstractC0864f));
    }

    /* renamed from: b */
    private final void m6831b(int i) {
        Integer num = this.f5934w;
        if (num == null) {
            this.f5934w = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String m6834c = m6834c(i);
            String m6834c2 = m6834c(this.f5934w.intValue());
            StringBuilder sb = new StringBuilder(String.valueOf(m6834c).length() + 51 + String.valueOf(m6834c2).length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(m6834c);
            sb.append(". Mode was already set to ");
            sb.append(m6834c2);
            throw new IllegalStateException(sb.toString());
        }
        if (this.f5916e != null) {
            return;
        }
        boolean z = false;
        boolean z2 = false;
        for (C0859a.f fVar : this.f5927p.values()) {
            if (fVar.mo6521n()) {
                z = true;
            }
            if (fVar.mo6463e()) {
                z2 = true;
            }
        }
        int intValue = this.f5934w.intValue();
        if (intValue == 1) {
            if (!z) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        } else if (intValue == 2 && z) {
            if (this.f5914c) {
                this.f5916e = new C0966w2(this.f5918g, this.f5913b, this.f5919h, this.f5925n, this.f5927p, this.f5929r, this.f5930s, this.f5931t, this.f5933v, this, true);
                return;
            } else {
                this.f5916e = C0946r2.m6853a(this.f5918g, this, this.f5913b, this.f5919h, this.f5925n, this.f5927p, this.f5929r, this.f5930s, this.f5931t, this.f5933v);
                return;
            }
        }
        if (!this.f5914c || z2) {
            this.f5916e = new C0976z0(this.f5918g, this, this.f5913b, this.f5919h, this.f5925n, this.f5927p, this.f5929r, this.f5930s, this.f5931t, this.f5933v, this);
        } else {
            this.f5916e = new C0966w2(this.f5918g, this.f5913b, this.f5919h, this.f5925n, this.f5927p, this.f5929r, this.f5930s, this.f5931t, this.f5933v, this, false);
        }
    }

    /* renamed from: c */
    private static String m6834c(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final void m6835o() {
        this.f5913b.lock();
        try {
            if (this.f5921j) {
                m6836p();
            }
        } finally {
            this.f5913b.unlock();
        }
    }

    @GuardedBy("mLock")
    /* renamed from: p */
    private final void m6836p() {
        this.f5915d.m7156b();
        this.f5916e.mo6811c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final void m6837q() {
        this.f5913b.lock();
        try {
            if (m6841l()) {
                m6836p();
            }
        } finally {
            this.f5913b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC0864f
    /* renamed from: a */
    public final ConnectionResult mo6551a() {
        boolean z = true;
        C1057u.m7298b(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.f5913b.lock();
        try {
            if (this.f5917f >= 0) {
                if (this.f5934w == null) {
                    z = false;
                }
                C1057u.m7298b(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f5934w == null) {
                this.f5934w = Integer.valueOf(m6827a((Iterable<C0859a.f>) this.f5927p.values(), false));
            } else if (this.f5934w.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            m6831b(this.f5934w.intValue());
            this.f5915d.m7156b();
            return this.f5916e.mo6813e();
        } finally {
            this.f5913b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC0864f
    /* renamed from: a */
    public final <A extends C0859a.b, R extends InterfaceC0982m, T extends AbstractC0885d<R, A>> T mo6552a(T t) {
        C1057u.m7294a(t.m6641h() != null, "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.f5927p.containsKey(t.m6641h());
        String m6503b = t.m6640g() != null ? t.m6640g().m6503b() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(m6503b).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(m6503b);
        sb.append(" required for this call.");
        C1057u.m7294a(containsKey, sb.toString());
        this.f5913b.lock();
        try {
            if (this.f5916e == null) {
                this.f5920i.add(t);
            } else {
                t = (T) this.f5916e.mo6809b(t);
            }
            return t;
        } finally {
            this.f5913b.unlock();
        }
    }

    /* renamed from: a */
    public final void m6838a(int i) {
        this.f5913b.lock();
        boolean z = true;
        if (i != 3 && i != 1 && i != 2) {
            z = false;
        }
        try {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(i);
            C1057u.m7294a(z, sb.toString());
            m6831b(i);
            m6836p();
        } finally {
            this.f5913b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0929n1
    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo6820a(int i, boolean z) {
        if (i == 1 && !z && !this.f5921j) {
            this.f5921j = true;
            if (this.f5926o == null && !C1098d.m7373a()) {
                try {
                    this.f5926o = this.f5925n.m6959a(this.f5918g.getApplicationContext(), new C0968x0(this));
                } catch (SecurityException unused) {
                }
            }
            HandlerC0952t0 handlerC0952t0 = this.f5924m;
            handlerC0952t0.sendMessageDelayed(handlerC0952t0.obtainMessage(1), this.f5922k);
            HandlerC0952t0 handlerC0952t02 = this.f5924m;
            handlerC0952t02.sendMessageDelayed(handlerC0952t02.obtainMessage(2), this.f5923l);
        }
        this.f5936y.m6621b();
        this.f5915d.m7151a(i);
        this.f5915d.m7150a();
        if (i == 2) {
            m6836p();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0929n1
    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo6821a(Bundle bundle) {
        while (!this.f5920i.isEmpty()) {
            mo6558b((C0940q0) this.f5920i.remove());
        }
        this.f5915d.m7152a(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0929n1
    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo6822a(ConnectionResult connectionResult) {
        if (!this.f5925n.m6975b(this.f5918g, connectionResult.m6484j())) {
            m6841l();
        }
        if (this.f5921j) {
            return;
        }
        this.f5915d.m7153a(connectionResult);
        this.f5915d.m7150a();
    }

    @Override // com.google.android.gms.common.api.AbstractC0864f
    /* renamed from: a */
    public final void mo6553a(AbstractC0864f.c cVar) {
        this.f5915d.m7155a(cVar);
    }

    @Override // com.google.android.gms.common.api.AbstractC0864f
    /* renamed from: a */
    public final void mo6554a(C0965w1 c0965w1) {
        String str;
        Exception exc;
        this.f5913b.lock();
        try {
            if (this.f5935x == null) {
                str = "Attempted to remove pending transform when no transforms are registered.";
                exc = new Exception();
            } else if (this.f5935x.remove(c0965w1)) {
                if (!m6842m()) {
                    this.f5916e.mo6812d();
                }
            } else {
                str = "Failed to remove pending transform - this may lead to memory leaks!";
                exc = new Exception();
            }
            Log.wtf("GoogleApiClientImpl", str, exc);
        } finally {
            this.f5913b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC0864f
    /* renamed from: a */
    public final void mo6555a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f5918g);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.f5921j);
        printWriter.append(" mWorkQueue.size()=").print(this.f5920i.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f5936y.f5747a.size());
        InterfaceC0925m1 interfaceC0925m1 = this.f5916e;
        if (interfaceC0925m1 != null) {
            interfaceC0925m1.mo6806a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC0864f
    /* renamed from: a */
    public final boolean mo6556a(InterfaceC0931o interfaceC0931o) {
        InterfaceC0925m1 interfaceC0925m1 = this.f5916e;
        return interfaceC0925m1 != null && interfaceC0925m1.mo6808a(interfaceC0931o);
    }

    @Override // com.google.android.gms.common.api.AbstractC0864f
    /* renamed from: b */
    public final AbstractC0866h<Status> mo6557b() {
        C1057u.m7298b(m6839j(), "GoogleApiClient is not connected yet.");
        C1057u.m7298b(this.f5934w.intValue() != 2, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        C0939q c0939q = new C0939q(this);
        if (this.f5927p.containsKey(C2560ho.f10502a)) {
            m6828a(this, c0939q, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            C0948s0 c0948s0 = new C0948s0(this, atomicReference, c0939q);
            C0944r0 c0944r0 = new C0944r0(this, c0939q);
            AbstractC0864f.a aVar = new AbstractC0864f.a(this.f5918g);
            aVar.m6566a(C2560ho.f10504c);
            aVar.m6568a(c0948s0);
            aVar.m6569a(c0944r0);
            aVar.m6565a(this.f5924m);
            AbstractC0864f m6570a = aVar.m6570a();
            atomicReference.set(m6570a);
            m6570a.mo6560c();
        }
        return c0939q;
    }

    @Override // com.google.android.gms.common.api.AbstractC0864f
    /* renamed from: b */
    public final <A extends C0859a.b, T extends AbstractC0885d<? extends InterfaceC0982m, A>> T mo6558b(T t) {
        C1057u.m7294a(t.m6641h() != null, "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.f5927p.containsKey(t.m6641h());
        String m6503b = t.m6640g() != null ? t.m6640g().m6503b() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(m6503b).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(m6503b);
        sb.append(" required for this call.");
        C1057u.m7294a(containsKey, sb.toString());
        this.f5913b.lock();
        try {
            if (this.f5916e == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.f5921j) {
                this.f5920i.add(t);
                while (!this.f5920i.isEmpty()) {
                    AbstractC0885d<?, ?> remove = this.f5920i.remove();
                    this.f5936y.m6620a(remove);
                    remove.m6639c(Status.f5670h);
                }
            } else {
                t = (T) this.f5916e.mo6805a((InterfaceC0925m1) t);
            }
            return t;
        } finally {
            this.f5913b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC0864f
    /* renamed from: b */
    public final void mo6559b(AbstractC0864f.c cVar) {
        this.f5915d.m7157b(cVar);
    }

    @Override // com.google.android.gms.common.api.AbstractC0864f
    /* renamed from: c */
    public final void mo6560c() {
        this.f5913b.lock();
        try {
            if (this.f5917f >= 0) {
                C1057u.m7298b(this.f5934w != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f5934w == null) {
                this.f5934w = Integer.valueOf(m6827a((Iterable<C0859a.f>) this.f5927p.values(), false));
            } else if (this.f5934w.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            m6838a(this.f5934w.intValue());
        } finally {
            this.f5913b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC0864f
    /* renamed from: d */
    public final void mo6561d() {
        this.f5913b.lock();
        try {
            this.f5936y.m6619a();
            if (this.f5916e != null) {
                this.f5916e.mo6810b();
            }
            this.f5932u.m6799a();
            for (AbstractC0885d<?, ?> abstractC0885d : this.f5920i) {
                abstractC0885d.m6584a((InterfaceC0883c2) null);
                abstractC0885d.m6583a();
            }
            this.f5920i.clear();
            if (this.f5916e != null) {
                m6841l();
                this.f5915d.m7150a();
            }
        } finally {
            this.f5913b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC0864f
    /* renamed from: e */
    public final Context mo6562e() {
        return this.f5918g;
    }

    @Override // com.google.android.gms.common.api.AbstractC0864f
    /* renamed from: f */
    public final Looper mo6563f() {
        return this.f5919h;
    }

    @Override // com.google.android.gms.common.api.AbstractC0864f
    /* renamed from: g */
    public final void mo6564g() {
        InterfaceC0925m1 interfaceC0925m1 = this.f5916e;
        if (interfaceC0925m1 != null) {
            interfaceC0925m1.mo6814f();
        }
    }

    /* renamed from: j */
    public final boolean m6839j() {
        InterfaceC0925m1 interfaceC0925m1 = this.f5916e;
        return interfaceC0925m1 != null && interfaceC0925m1.mo6807a();
    }

    /* renamed from: k */
    public final void m6840k() {
        mo6561d();
        mo6560c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @GuardedBy("mLock")
    /* renamed from: l */
    public final boolean m6841l() {
        if (!this.f5921j) {
            return false;
        }
        this.f5921j = false;
        this.f5924m.removeMessages(2);
        this.f5924m.removeMessages(1);
        C0921l1 c0921l1 = this.f5926o;
        if (c0921l1 != null) {
            c0921l1.m6800a();
            this.f5926o = null;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean m6842m() {
        this.f5913b.lock();
        try {
            if (this.f5935x != null) {
                return !this.f5935x.isEmpty();
            }
            this.f5913b.unlock();
            return false;
        } finally {
            this.f5913b.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public final String m6843n() {
        StringWriter stringWriter = new StringWriter();
        mo6555a("", (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
        return stringWriter.toString();
    }
}
