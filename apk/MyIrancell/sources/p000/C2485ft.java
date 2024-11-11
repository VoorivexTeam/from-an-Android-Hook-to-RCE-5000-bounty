package p000;

import android.app.Activity;
import com.google.android.gms.common.api.internal.InterfaceC0911j;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.internal.C1057u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ft */
/* loaded from: classes.dex */
public final class C2485ft<TResult> extends AbstractC2871ks<TResult> {

    /* renamed from: a */
    private final Object f10144a = new Object();

    /* renamed from: b */
    private final C2401dt<TResult> f10145b = new C2401dt<>();

    /* renamed from: c */
    @GuardedBy("mLock")
    private boolean f10146c;

    /* renamed from: d */
    private volatile boolean f10147d;

    /* renamed from: e */
    @GuardedBy("mLock")
    private TResult f10148e;

    /* renamed from: f */
    @GuardedBy("mLock")
    private Exception f10149f;

    /* renamed from: ft$a */
    /* loaded from: classes.dex */
    private static class a extends LifecycleCallback {

        /* renamed from: c */
        private final List<WeakReference<InterfaceC2358ct<?>>> f10150c;

        private a(InterfaceC0911j interfaceC0911j) {
            super(interfaceC0911j);
            this.f10150c = new ArrayList();
            this.f5733b.mo6626a("TaskOnStopCallback", this);
        }

        /* renamed from: b */
        public static a m11827b(Activity activity) {
            InterfaceC0911j m6593a = LifecycleCallback.m6593a(activity);
            a aVar = (a) m6593a.mo6625a("TaskOnStopCallback", a.class);
            return aVar == null ? new a(m6593a) : aVar;
        }

        /* renamed from: a */
        public final <T> void m11828a(InterfaceC2358ct<T> interfaceC2358ct) {
            synchronized (this.f10150c) {
                this.f10150c.add(new WeakReference<>(interfaceC2358ct));
            }
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        /* renamed from: e */
        public void mo6603e() {
            synchronized (this.f10150c) {
                Iterator<WeakReference<InterfaceC2358ct<?>>> it = this.f10150c.iterator();
                while (it.hasNext()) {
                    InterfaceC2358ct<?> interfaceC2358ct = it.next().get();
                    if (interfaceC2358ct != null) {
                        interfaceC2358ct.cancel();
                    }
                }
                this.f10150c.clear();
            }
        }
    }

    @GuardedBy("mLock")
    /* renamed from: g */
    private final void m11798g() {
        C1057u.m7298b(this.f10146c, "Task is not yet complete");
    }

    @GuardedBy("mLock")
    /* renamed from: h */
    private final void m11799h() {
        C1057u.m7298b(!this.f10146c, "Task is already complete");
    }

    @GuardedBy("mLock")
    /* renamed from: i */
    private final void m11800i() {
        if (this.f10147d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: j */
    private final void m11801j() {
        synchronized (this.f10144a) {
            if (this.f10146c) {
                this.f10145b.m11483a(this);
            }
        }
    }

    @Override // p000.AbstractC2871ks
    /* renamed from: a */
    public final Exception mo11802a() {
        Exception exc;
        synchronized (this.f10144a) {
            exc = this.f10149f;
        }
        return exc;
    }

    @Override // p000.AbstractC2871ks
    /* renamed from: a */
    public final <X extends Throwable> TResult mo11803a(Class<X> cls) {
        TResult tresult;
        synchronized (this.f10144a) {
            m11798g();
            m11800i();
            if (cls.isInstance(this.f10149f)) {
                throw cls.cast(this.f10149f);
            }
            if (this.f10149f != null) {
                throw new C2786is(this.f10149f);
            }
            tresult = this.f10148e;
        }
        return tresult;
    }

    @Override // p000.AbstractC2871ks
    /* renamed from: a */
    public final AbstractC2871ks<TResult> mo11804a(Activity activity, InterfaceC2484fs<TResult> interfaceC2484fs) {
        C3317us c3317us = new C3317us(C2954ms.f12177a, interfaceC2484fs);
        this.f10145b.m11482a(c3317us);
        a.m11827b(activity).m11828a(c3317us);
        m11801j();
        return this;
    }

    @Override // p000.AbstractC2871ks
    /* renamed from: a */
    public final AbstractC2871ks<TResult> mo11805a(Activity activity, InterfaceC2524gs interfaceC2524gs) {
        C3409ws c3409ws = new C3409ws(C2954ms.f12177a, interfaceC2524gs);
        this.f10145b.m11482a(c3409ws);
        a.m11827b(activity).m11828a(c3409ws);
        m11801j();
        return this;
    }

    @Override // p000.AbstractC2871ks
    /* renamed from: a */
    public final AbstractC2871ks<TResult> mo11806a(Activity activity, InterfaceC2564hs<? super TResult> interfaceC2564hs) {
        C3498ys c3498ys = new C3498ys(C2954ms.f12177a, interfaceC2564hs);
        this.f10145b.m11482a(c3498ys);
        a.m11827b(activity).m11828a(c3498ys);
        m11801j();
        return this;
    }

    @Override // p000.AbstractC2871ks
    /* renamed from: a */
    public final <TContinuationResult> AbstractC2871ks<TContinuationResult> mo11807a(InterfaceC2400ds<TResult, TContinuationResult> interfaceC2400ds) {
        return mo11811a(C2954ms.f12177a, interfaceC2400ds);
    }

    @Override // p000.AbstractC2871ks
    /* renamed from: a */
    public final AbstractC2871ks<TResult> mo11808a(InterfaceC2484fs<TResult> interfaceC2484fs) {
        mo11813a(C2954ms.f12177a, interfaceC2484fs);
        return this;
    }

    @Override // p000.AbstractC2871ks
    /* renamed from: a */
    public final AbstractC2871ks<TResult> mo11809a(InterfaceC2524gs interfaceC2524gs) {
        mo11814a(C2954ms.f12177a, interfaceC2524gs);
        return this;
    }

    @Override // p000.AbstractC2871ks
    /* renamed from: a */
    public final AbstractC2871ks<TResult> mo11810a(InterfaceC2564hs<? super TResult> interfaceC2564hs) {
        mo11815a(C2954ms.f12177a, interfaceC2564hs);
        return this;
    }

    @Override // p000.AbstractC2871ks
    /* renamed from: a */
    public final <TContinuationResult> AbstractC2871ks<TContinuationResult> mo11811a(Executor executor, InterfaceC2400ds<TResult, TContinuationResult> interfaceC2400ds) {
        C2485ft c2485ft = new C2485ft();
        this.f10145b.m11482a(new C3057os(executor, interfaceC2400ds, c2485ft));
        m11801j();
        return c2485ft;
    }

    @Override // p000.AbstractC2871ks
    /* renamed from: a */
    public final AbstractC2871ks<TResult> mo11812a(Executor executor, InterfaceC2443es interfaceC2443es) {
        this.f10145b.m11482a(new C3221ss(executor, interfaceC2443es));
        m11801j();
        return this;
    }

    @Override // p000.AbstractC2871ks
    /* renamed from: a */
    public final AbstractC2871ks<TResult> mo11813a(Executor executor, InterfaceC2484fs<TResult> interfaceC2484fs) {
        this.f10145b.m11482a(new C3317us(executor, interfaceC2484fs));
        m11801j();
        return this;
    }

    @Override // p000.AbstractC2871ks
    /* renamed from: a */
    public final AbstractC2871ks<TResult> mo11814a(Executor executor, InterfaceC2524gs interfaceC2524gs) {
        this.f10145b.m11482a(new C3409ws(executor, interfaceC2524gs));
        m11801j();
        return this;
    }

    @Override // p000.AbstractC2871ks
    /* renamed from: a */
    public final AbstractC2871ks<TResult> mo11815a(Executor executor, InterfaceC2564hs<? super TResult> interfaceC2564hs) {
        this.f10145b.m11482a(new C3498ys(executor, interfaceC2564hs));
        m11801j();
        return this;
    }

    @Override // p000.AbstractC2871ks
    /* renamed from: a */
    public final <TContinuationResult> AbstractC2871ks<TContinuationResult> mo11816a(Executor executor, InterfaceC2826js<TResult, TContinuationResult> interfaceC2826js) {
        C2485ft c2485ft = new C2485ft();
        this.f10145b.m11482a(new C0435at(executor, interfaceC2826js, c2485ft));
        m11801j();
        return c2485ft;
    }

    /* renamed from: a */
    public final void m11817a(Exception exc) {
        C1057u.m7287a(exc, "Exception must not be null");
        synchronized (this.f10144a) {
            m11799h();
            this.f10146c = true;
            this.f10149f = exc;
        }
        this.f10145b.m11483a(this);
    }

    /* renamed from: a */
    public final void m11818a(TResult tresult) {
        synchronized (this.f10144a) {
            m11799h();
            this.f10146c = true;
            this.f10148e = tresult;
        }
        this.f10145b.m11483a(this);
    }

    @Override // p000.AbstractC2871ks
    /* renamed from: b */
    public final TResult mo11819b() {
        TResult tresult;
        synchronized (this.f10144a) {
            m11798g();
            m11800i();
            if (this.f10149f != null) {
                throw new C2786is(this.f10149f);
            }
            tresult = this.f10148e;
        }
        return tresult;
    }

    @Override // p000.AbstractC2871ks
    /* renamed from: b */
    public final <TContinuationResult> AbstractC2871ks<TContinuationResult> mo11820b(Executor executor, InterfaceC2400ds<TResult, AbstractC2871ks<TContinuationResult>> interfaceC2400ds) {
        C2485ft c2485ft = new C2485ft();
        this.f10145b.m11482a(new C3138qs(executor, interfaceC2400ds, c2485ft));
        m11801j();
        return c2485ft;
    }

    /* renamed from: b */
    public final boolean m11821b(Exception exc) {
        C1057u.m7287a(exc, "Exception must not be null");
        synchronized (this.f10144a) {
            if (this.f10146c) {
                return false;
            }
            this.f10146c = true;
            this.f10149f = exc;
            this.f10145b.m11483a(this);
            return true;
        }
    }

    /* renamed from: b */
    public final boolean m11822b(TResult tresult) {
        synchronized (this.f10144a) {
            if (this.f10146c) {
                return false;
            }
            this.f10146c = true;
            this.f10148e = tresult;
            this.f10145b.m11483a(this);
            return true;
        }
    }

    @Override // p000.AbstractC2871ks
    /* renamed from: c */
    public final boolean mo11823c() {
        return this.f10147d;
    }

    @Override // p000.AbstractC2871ks
    /* renamed from: d */
    public final boolean mo11824d() {
        boolean z;
        synchronized (this.f10144a) {
            z = this.f10146c;
        }
        return z;
    }

    @Override // p000.AbstractC2871ks
    /* renamed from: e */
    public final boolean mo11825e() {
        boolean z;
        synchronized (this.f10144a) {
            z = this.f10146c && !this.f10147d && this.f10149f == null;
        }
        return z;
    }

    /* renamed from: f */
    public final boolean m11826f() {
        synchronized (this.f10144a) {
            if (this.f10146c) {
                return false;
            }
            this.f10146c = true;
            this.f10147d = true;
            this.f10145b.m11483a(this);
            return true;
        }
    }
}
