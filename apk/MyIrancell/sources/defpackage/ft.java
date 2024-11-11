package defpackage;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.internal.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ft<TResult> extends ks<TResult> {
    private final Object a = new Object();
    private final dt<TResult> b = new dt<>();

    @GuardedBy("mLock")
    private boolean c;
    private volatile boolean d;

    @GuardedBy("mLock")
    private TResult e;

    @GuardedBy("mLock")
    private Exception f;

    /* loaded from: classes.dex */
    private static class a extends LifecycleCallback {
        private final List<WeakReference<ct<?>>> c;

        private a(j jVar) {
            super(jVar);
            this.c = new ArrayList();
            this.b.a("TaskOnStopCallback", this);
        }

        public static a b(Activity activity) {
            j a = LifecycleCallback.a(activity);
            a aVar = (a) a.a("TaskOnStopCallback", a.class);
            return aVar == null ? new a(a) : aVar;
        }

        public final <T> void a(ct<T> ctVar) {
            synchronized (this.c) {
                this.c.add(new WeakReference<>(ctVar));
            }
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        public void e() {
            synchronized (this.c) {
                Iterator<WeakReference<ct<?>>> it = this.c.iterator();
                while (it.hasNext()) {
                    ct<?> ctVar = it.next().get();
                    if (ctVar != null) {
                        ctVar.cancel();
                    }
                }
                this.c.clear();
            }
        }
    }

    @GuardedBy("mLock")
    private final void g() {
        u.b(this.c, "Task is not yet complete");
    }

    @GuardedBy("mLock")
    private final void h() {
        u.b(!this.c, "Task is already complete");
    }

    @GuardedBy("mLock")
    private final void i() {
        if (this.d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void j() {
        synchronized (this.a) {
            if (this.c) {
                this.b.a(this);
            }
        }
    }

    @Override // defpackage.ks
    public final Exception a() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // defpackage.ks
    public final <X extends Throwable> TResult a(Class<X> cls) {
        TResult tresult;
        synchronized (this.a) {
            g();
            i();
            if (cls.isInstance(this.f)) {
                throw cls.cast(this.f);
            }
            if (this.f != null) {
                throw new is(this.f);
            }
            tresult = this.e;
        }
        return tresult;
    }

    @Override // defpackage.ks
    public final ks<TResult> a(Activity activity, fs<TResult> fsVar) {
        us usVar = new us(ms.a, fsVar);
        this.b.a(usVar);
        a.b(activity).a(usVar);
        j();
        return this;
    }

    @Override // defpackage.ks
    public final ks<TResult> a(Activity activity, gs gsVar) {
        ws wsVar = new ws(ms.a, gsVar);
        this.b.a(wsVar);
        a.b(activity).a(wsVar);
        j();
        return this;
    }

    @Override // defpackage.ks
    public final ks<TResult> a(Activity activity, hs<? super TResult> hsVar) {
        ys ysVar = new ys(ms.a, hsVar);
        this.b.a(ysVar);
        a.b(activity).a(ysVar);
        j();
        return this;
    }

    @Override // defpackage.ks
    public final <TContinuationResult> ks<TContinuationResult> a(ds<TResult, TContinuationResult> dsVar) {
        return a(ms.a, dsVar);
    }

    @Override // defpackage.ks
    public final ks<TResult> a(fs<TResult> fsVar) {
        a(ms.a, fsVar);
        return this;
    }

    @Override // defpackage.ks
    public final ks<TResult> a(gs gsVar) {
        a(ms.a, gsVar);
        return this;
    }

    @Override // defpackage.ks
    public final ks<TResult> a(hs<? super TResult> hsVar) {
        a(ms.a, hsVar);
        return this;
    }

    @Override // defpackage.ks
    public final <TContinuationResult> ks<TContinuationResult> a(Executor executor, ds<TResult, TContinuationResult> dsVar) {
        ft ftVar = new ft();
        this.b.a(new os(executor, dsVar, ftVar));
        j();
        return ftVar;
    }

    @Override // defpackage.ks
    public final ks<TResult> a(Executor executor, es esVar) {
        this.b.a(new ss(executor, esVar));
        j();
        return this;
    }

    @Override // defpackage.ks
    public final ks<TResult> a(Executor executor, fs<TResult> fsVar) {
        this.b.a(new us(executor, fsVar));
        j();
        return this;
    }

    @Override // defpackage.ks
    public final ks<TResult> a(Executor executor, gs gsVar) {
        this.b.a(new ws(executor, gsVar));
        j();
        return this;
    }

    @Override // defpackage.ks
    public final ks<TResult> a(Executor executor, hs<? super TResult> hsVar) {
        this.b.a(new ys(executor, hsVar));
        j();
        return this;
    }

    @Override // defpackage.ks
    public final <TContinuationResult> ks<TContinuationResult> a(Executor executor, js<TResult, TContinuationResult> jsVar) {
        ft ftVar = new ft();
        this.b.a(new at(executor, jsVar, ftVar));
        j();
        return ftVar;
    }

    public final void a(Exception exc) {
        u.a(exc, "Exception must not be null");
        synchronized (this.a) {
            h();
            this.c = true;
            this.f = exc;
        }
        this.b.a(this);
    }

    public final void a(TResult tresult) {
        synchronized (this.a) {
            h();
            this.c = true;
            this.e = tresult;
        }
        this.b.a(this);
    }

    @Override // defpackage.ks
    public final TResult b() {
        TResult tresult;
        synchronized (this.a) {
            g();
            i();
            if (this.f != null) {
                throw new is(this.f);
            }
            tresult = this.e;
        }
        return tresult;
    }

    @Override // defpackage.ks
    public final <TContinuationResult> ks<TContinuationResult> b(Executor executor, ds<TResult, ks<TContinuationResult>> dsVar) {
        ft ftVar = new ft();
        this.b.a(new qs(executor, dsVar, ftVar));
        j();
        return ftVar;
    }

    public final boolean b(Exception exc) {
        u.a(exc, "Exception must not be null");
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.f = exc;
            this.b.a(this);
            return true;
        }
    }

    public final boolean b(TResult tresult) {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.e = tresult;
            this.b.a(this);
            return true;
        }
    }

    @Override // defpackage.ks
    public final boolean c() {
        return this.d;
    }

    @Override // defpackage.ks
    public final boolean d() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // defpackage.ks
    public final boolean e() {
        boolean z;
        synchronized (this.a) {
            z = this.c && !this.d && this.f == null;
        }
        return z;
    }

    public final boolean f() {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.d = true;
            this.b.a(this);
            return true;
        }
    }
}
