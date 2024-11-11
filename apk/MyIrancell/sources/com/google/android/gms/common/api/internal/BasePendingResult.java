package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.AbstractC0864f;
import com.google.android.gms.common.api.AbstractC0866h;
import com.google.android.gms.common.api.InterfaceC0979j;
import com.google.android.gms.common.api.InterfaceC0982m;
import com.google.android.gms.common.api.InterfaceC0983n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.InterfaceC1040n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p000.HandlerC2824jq;

@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends InterfaceC0982m> extends AbstractC0866h<R> {

    /* renamed from: p */
    static final ThreadLocal<Boolean> f5716p = new C0938p2();

    /* renamed from: a */
    private final Object f5717a;

    /* renamed from: b */
    private final HandlerC0868a<R> f5718b;

    /* renamed from: c */
    private final WeakReference<AbstractC0864f> f5719c;

    /* renamed from: d */
    private final CountDownLatch f5720d;

    /* renamed from: e */
    private final ArrayList<AbstractC0866h.a> f5721e;

    /* renamed from: f */
    private InterfaceC0983n<? super R> f5722f;

    /* renamed from: g */
    private final AtomicReference<InterfaceC0883c2> f5723g;

    /* renamed from: h */
    private R f5724h;

    /* renamed from: i */
    private Status f5725i;

    /* renamed from: j */
    private volatile boolean f5726j;

    /* renamed from: k */
    private boolean f5727k;

    /* renamed from: l */
    private boolean f5728l;

    /* renamed from: m */
    private InterfaceC1040n f5729m;

    @KeepName
    private C0869b mResultGuardian;

    /* renamed from: n */
    private volatile C0965w1<R> f5730n;

    /* renamed from: o */
    private boolean f5731o;

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    /* loaded from: classes.dex */
    public static class HandlerC0868a<R extends InterfaceC0982m> extends HandlerC2824jq {
        public HandlerC0868a(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void m6592a(InterfaceC0983n<? super R> interfaceC0983n, R r) {
            BasePendingResult.m6580c(interfaceC0983n);
            sendMessage(obtainMessage(1, new Pair(interfaceC0983n, r)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    ((BasePendingResult) message.obj).m6586b(Status.f5671i);
                    return;
                }
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
                return;
            }
            Pair pair = (Pair) message.obj;
            InterfaceC0983n interfaceC0983n = (InterfaceC0983n) pair.first;
            InterfaceC0982m interfaceC0982m = (InterfaceC0982m) pair.second;
            try {
                interfaceC0983n.mo6886a(interfaceC0982m);
            } catch (RuntimeException e) {
                BasePendingResult.m6581c(interfaceC0982m);
                throw e;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$b */
    /* loaded from: classes.dex */
    public final class C0869b {
        private C0869b() {
        }

        /* synthetic */ C0869b(BasePendingResult basePendingResult, C0938p2 c0938p2) {
            this();
        }

        protected final void finalize() {
            BasePendingResult.m6581c(BasePendingResult.this.f5724h);
            super.finalize();
        }
    }

    @Deprecated
    BasePendingResult() {
        this.f5717a = new Object();
        this.f5720d = new CountDownLatch(1);
        this.f5721e = new ArrayList<>();
        this.f5723g = new AtomicReference<>();
        this.f5731o = false;
        this.f5718b = new HandlerC0868a<>(Looper.getMainLooper());
        this.f5719c = new WeakReference<>(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BasePendingResult(AbstractC0864f abstractC0864f) {
        this.f5717a = new Object();
        this.f5720d = new CountDownLatch(1);
        this.f5721e = new ArrayList<>();
        this.f5723g = new AtomicReference<>();
        this.f5731o = false;
        this.f5718b = new HandlerC0868a<>(abstractC0864f != null ? abstractC0864f.mo6563f() : Looper.getMainLooper());
        this.f5719c = new WeakReference<>(abstractC0864f);
    }

    /* renamed from: b */
    private static <R extends InterfaceC0982m> InterfaceC0983n<R> m6578b(InterfaceC0983n<R> interfaceC0983n) {
        return interfaceC0983n;
    }

    /* renamed from: b */
    private final void m6579b(R r) {
        this.f5724h = r;
        C0938p2 c0938p2 = null;
        this.f5729m = null;
        this.f5720d.countDown();
        this.f5725i = this.f5724h.mo6496e();
        if (this.f5727k) {
            this.f5722f = null;
        } else if (this.f5722f != null) {
            this.f5718b.removeMessages(2);
            this.f5718b.m6592a(this.f5722f, m6582g());
        } else if (this.f5724h instanceof InterfaceC0979j) {
            this.mResultGuardian = new C0869b(this, c0938p2);
        }
        ArrayList<AbstractC0866h.a> arrayList = this.f5721e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            AbstractC0866h.a aVar = arrayList.get(i);
            i++;
            aVar.mo6575a(this.f5725i);
        }
        this.f5721e.clear();
    }

    /* renamed from: c */
    static /* synthetic */ InterfaceC0983n m6580c(InterfaceC0983n interfaceC0983n) {
        m6578b(interfaceC0983n);
        return interfaceC0983n;
    }

    /* renamed from: c */
    public static void m6581c(InterfaceC0982m interfaceC0982m) {
        if (interfaceC0982m instanceof InterfaceC0979j) {
            try {
                ((InterfaceC0979j) interfaceC0982m).mo6938d();
            } catch (RuntimeException unused) {
                String valueOf = String.valueOf(interfaceC0982m);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                sb.toString();
            }
        }
    }

    /* renamed from: g */
    private final R m6582g() {
        R r;
        synchronized (this.f5717a) {
            C1057u.m7298b(!this.f5726j, "Result has already been consumed.");
            C1057u.m7298b(m6588c(), "Result is not ready.");
            r = this.f5724h;
            this.f5724h = null;
            this.f5722f = null;
            this.f5726j = true;
        }
        InterfaceC0883c2 andSet = this.f5723g.getAndSet(null);
        if (andSet != null) {
            andSet.mo6606a(this);
        }
        return r;
    }

    @Override // com.google.android.gms.common.api.AbstractC0866h
    /* renamed from: a */
    public final R mo6572a(long j, TimeUnit timeUnit) {
        if (j > 0) {
            C1057u.m7300c("await must not be called on the UI thread when time is greater than zero.");
        }
        C1057u.m7298b(!this.f5726j, "Result has already been consumed.");
        C1057u.m7298b(this.f5730n == null, "Cannot await if then() has been called.");
        try {
            if (!this.f5720d.await(j, timeUnit)) {
                m6586b(Status.f5671i);
            }
        } catch (InterruptedException unused) {
            m6586b(Status.f5669g);
        }
        C1057u.m7298b(m6588c(), "Result is not ready.");
        return m6582g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract R mo6471a(Status status);

    /* renamed from: a */
    public void m6583a() {
        synchronized (this.f5717a) {
            if (!this.f5727k && !this.f5726j) {
                if (this.f5729m != null) {
                    try {
                        this.f5729m.cancel();
                    } catch (RemoteException unused) {
                    }
                }
                m6581c(this.f5724h);
                this.f5727k = true;
                m6579b((BasePendingResult<R>) mo6471a(Status.f5672j));
            }
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC0866h
    /* renamed from: a */
    public final void mo6573a(AbstractC0866h.a aVar) {
        C1057u.m7294a(aVar != null, "Callback cannot be null.");
        synchronized (this.f5717a) {
            if (m6588c()) {
                aVar.mo6575a(this.f5725i);
            } else {
                this.f5721e.add(aVar);
            }
        }
    }

    /* renamed from: a */
    public final void m6584a(InterfaceC0883c2 interfaceC0883c2) {
        this.f5723g.set(interfaceC0883c2);
    }

    /* renamed from: a */
    public final void m6585a(R r) {
        synchronized (this.f5717a) {
            if (this.f5728l || this.f5727k) {
                m6581c(r);
                return;
            }
            m6588c();
            boolean z = true;
            C1057u.m7298b(!m6588c(), "Results have already been set");
            if (this.f5726j) {
                z = false;
            }
            C1057u.m7298b(z, "Result has already been consumed");
            m6579b((BasePendingResult<R>) r);
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC0866h
    /* renamed from: a */
    public final void mo6574a(InterfaceC0983n<? super R> interfaceC0983n) {
        synchronized (this.f5717a) {
            if (interfaceC0983n == null) {
                this.f5722f = null;
                return;
            }
            boolean z = true;
            C1057u.m7298b(!this.f5726j, "Result has already been consumed.");
            if (this.f5730n != null) {
                z = false;
            }
            C1057u.m7298b(z, "Cannot set callbacks if then() has been called.");
            if (m6587b()) {
                return;
            }
            if (m6588c()) {
                this.f5718b.m6592a(interfaceC0983n, m6582g());
            } else {
                this.f5722f = interfaceC0983n;
            }
        }
    }

    /* renamed from: b */
    public final void m6586b(Status status) {
        synchronized (this.f5717a) {
            if (!m6588c()) {
                m6585a((BasePendingResult<R>) mo6471a(status));
                this.f5728l = true;
            }
        }
    }

    /* renamed from: b */
    public boolean m6587b() {
        boolean z;
        synchronized (this.f5717a) {
            z = this.f5727k;
        }
        return z;
    }

    /* renamed from: c */
    public final boolean m6588c() {
        return this.f5720d.getCount() == 0;
    }

    /* renamed from: d */
    public final Integer m6589d() {
        return null;
    }

    /* renamed from: e */
    public final boolean m6590e() {
        boolean m6587b;
        synchronized (this.f5717a) {
            if (this.f5719c.get() == null || !this.f5731o) {
                m6583a();
            }
            m6587b = m6587b();
        }
        return m6587b;
    }

    /* renamed from: f */
    public final void m6591f() {
        this.f5731o = this.f5731o || f5716p.get().booleanValue();
    }
}
