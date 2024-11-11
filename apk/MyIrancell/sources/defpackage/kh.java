package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.e;
import com.bumptech.glide.g;
import defpackage.kb;
import defpackage.li;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class kh<R> implements fh, sh, jh, li.f {
    private static final u1<kh<?>> D = li.a(150, new a());
    private static final boolean E = Log.isLoggable("Request", 2);
    private int A;
    private int B;
    private RuntimeException C;
    private boolean b;
    private final String c;
    private final ni d;
    private hh<R> e;
    private gh f;
    private Context g;
    private e h;
    private Object i;
    private Class<R> j;
    private dh<?> k;
    private int l;
    private int m;
    private g n;
    private th<R> o;
    private List<hh<R>> p;
    private kb q;
    private xh<? super R> r;
    private Executor s;
    private vb<R> t;
    private kb.d u;
    private long v;
    private b w;
    private Drawable x;
    private Drawable y;
    private Drawable z;

    /* loaded from: classes.dex */
    class a implements li.d<kh<?>> {
        a() {
        }

        @Override // li.d
        public kh<?> a() {
            return new kh<>();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum b {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    kh() {
        this.c = E ? String.valueOf(super.hashCode()) : null;
        this.d = ni.b();
    }

    private static int a(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * i);
    }

    private Drawable a(int i) {
        return ff.a(this.h, i, this.k.v() != null ? this.k.v() : this.g.getTheme());
    }

    private synchronized void a(Context context, e eVar, Object obj, Class<R> cls, dh<?> dhVar, int i, int i2, g gVar, th<R> thVar, hh<R> hhVar, List<hh<R>> list, gh ghVar, kb kbVar, xh<? super R> xhVar, Executor executor) {
        this.g = context;
        this.h = eVar;
        this.i = obj;
        this.j = cls;
        this.k = dhVar;
        this.l = i;
        this.m = i2;
        this.n = gVar;
        this.o = thVar;
        this.e = hhVar;
        this.p = list;
        this.f = ghVar;
        this.q = kbVar;
        this.r = xhVar;
        this.s = executor;
        this.w = b.PENDING;
        if (this.C == null && eVar.g()) {
            this.C = new RuntimeException("Glide request origin trace");
        }
    }

    private void a(String str) {
        String str2 = str + " this: " + this.c;
    }

    private synchronized void a(qb qbVar, int i) {
        boolean z;
        this.d.a();
        qbVar.a(this.C);
        int e = this.h.e();
        if (e <= i) {
            String str = "Load failed for " + this.i + " with size [" + this.A + "x" + this.B + "]";
            if (e <= 4) {
                qbVar.a("Glide");
            }
        }
        this.u = null;
        this.w = b.FAILED;
        boolean z2 = true;
        this.b = true;
        try {
            if (this.p != null) {
                Iterator<hh<R>> it = this.p.iterator();
                z = false;
                while (it.hasNext()) {
                    z |= it.next().a(qbVar, this.i, this.o, p());
                }
            } else {
                z = false;
            }
            if (this.e == null || !this.e.a(qbVar, this.i, this.o, p())) {
                z2 = false;
            }
            if (!(z | z2)) {
                s();
            }
            this.b = false;
            q();
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    private void a(vb<?> vbVar) {
        this.q.b(vbVar);
        this.t = null;
    }

    private synchronized void a(vb<R> vbVar, R r, com.bumptech.glide.load.a aVar) {
        boolean z;
        boolean p = p();
        this.w = b.COMPLETE;
        this.t = vbVar;
        if (this.h.e() <= 3) {
            String str = "Finished loading " + r.getClass().getSimpleName() + " from " + aVar + " for " + this.i + " with size [" + this.A + "x" + this.B + "] in " + fi.a(this.v) + " ms";
        }
        boolean z2 = true;
        this.b = true;
        try {
            if (this.p != null) {
                Iterator<hh<R>> it = this.p.iterator();
                z = false;
                while (it.hasNext()) {
                    z |= it.next().a(r, this.i, this.o, aVar, p);
                }
            } else {
                z = false;
            }
            if (this.e == null || !this.e.a(r, this.i, this.o, aVar, p)) {
                z2 = false;
            }
            if (!(z2 | z)) {
                this.o.a(r, this.r.a(aVar, p));
            }
            this.b = false;
            r();
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    private synchronized boolean a(kh<?> khVar) {
        boolean z;
        synchronized (khVar) {
            z = (this.p == null ? 0 : this.p.size()) == (khVar.p == null ? 0 : khVar.p.size());
        }
        return z;
    }

    public static <R> kh<R> b(Context context, e eVar, Object obj, Class<R> cls, dh<?> dhVar, int i, int i2, g gVar, th<R> thVar, hh<R> hhVar, List<hh<R>> list, gh ghVar, kb kbVar, xh<? super R> xhVar, Executor executor) {
        kh<R> khVar = (kh) D.a();
        if (khVar == null) {
            khVar = new kh<>();
        }
        khVar.a(context, eVar, obj, cls, dhVar, i, i2, gVar, thVar, hhVar, list, ghVar, kbVar, xhVar, executor);
        return khVar;
    }

    private void h() {
        if (this.b) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private boolean i() {
        gh ghVar = this.f;
        return ghVar == null || ghVar.f(this);
    }

    private boolean j() {
        gh ghVar = this.f;
        return ghVar == null || ghVar.c(this);
    }

    private boolean k() {
        gh ghVar = this.f;
        return ghVar == null || ghVar.d(this);
    }

    private void l() {
        h();
        this.d.a();
        this.o.a((sh) this);
        kb.d dVar = this.u;
        if (dVar != null) {
            dVar.a();
            this.u = null;
        }
    }

    private Drawable m() {
        if (this.x == null) {
            Drawable h = this.k.h();
            this.x = h;
            if (h == null && this.k.g() > 0) {
                this.x = a(this.k.g());
            }
        }
        return this.x;
    }

    private Drawable n() {
        if (this.z == null) {
            Drawable j = this.k.j();
            this.z = j;
            if (j == null && this.k.k() > 0) {
                this.z = a(this.k.k());
            }
        }
        return this.z;
    }

    private Drawable o() {
        if (this.y == null) {
            Drawable p = this.k.p();
            this.y = p;
            if (p == null && this.k.q() > 0) {
                this.y = a(this.k.q());
            }
        }
        return this.y;
    }

    private boolean p() {
        gh ghVar = this.f;
        return ghVar == null || !ghVar.e();
    }

    private void q() {
        gh ghVar = this.f;
        if (ghVar != null) {
            ghVar.a(this);
        }
    }

    private void r() {
        gh ghVar = this.f;
        if (ghVar != null) {
            ghVar.e(this);
        }
    }

    private synchronized void s() {
        if (j()) {
            Drawable n = this.i == null ? n() : null;
            if (n == null) {
                n = m();
            }
            if (n == null) {
                n = o();
            }
            this.o.a(n);
        }
    }

    @Override // defpackage.fh
    public synchronized void a() {
        h();
        this.d.a();
        this.v = fi.a();
        if (this.i == null) {
            if (ki.b(this.l, this.m)) {
                this.A = this.l;
                this.B = this.m;
            }
            a(new qb("Received null model"), n() == null ? 5 : 3);
            return;
        }
        if (this.w == b.RUNNING) {
            throw new IllegalArgumentException("Cannot restart a running request");
        }
        if (this.w == b.COMPLETE) {
            a((vb<?>) this.t, com.bumptech.glide.load.a.MEMORY_CACHE);
            return;
        }
        this.w = b.WAITING_FOR_SIZE;
        if (ki.b(this.l, this.m)) {
            a(this.l, this.m);
        } else {
            this.o.b(this);
        }
        if ((this.w == b.RUNNING || this.w == b.WAITING_FOR_SIZE) && j()) {
            this.o.b(o());
        }
        if (E) {
            a("finished run method in " + fi.a(this.v));
        }
    }

    @Override // defpackage.sh
    public synchronized void a(int i, int i2) {
        try {
            this.d.a();
            if (E) {
                a("Got onSizeReady in " + fi.a(this.v));
            }
            if (this.w != b.WAITING_FOR_SIZE) {
                return;
            }
            this.w = b.RUNNING;
            float u = this.k.u();
            this.A = a(i, u);
            this.B = a(i2, u);
            if (E) {
                a("finished setup for calling load in " + fi.a(this.v));
            }
            try {
                try {
                    this.u = this.q.a(this.h, this.i, this.k.t(), this.A, this.B, this.k.s(), this.j, this.n, this.k.c(), this.k.w(), this.k.D(), this.k.B(), this.k.m(), this.k.z(), this.k.y(), this.k.x(), this.k.l(), this, this.s);
                    if (this.w != b.RUNNING) {
                        this.u = null;
                    }
                    if (E) {
                        a("finished onSizeReady in " + fi.a(this.v));
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // defpackage.jh
    public synchronized void a(qb qbVar) {
        a(qbVar, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jh
    public synchronized void a(vb<?> vbVar, com.bumptech.glide.load.a aVar) {
        this.d.a();
        this.u = null;
        if (vbVar == null) {
            a(new qb("Expected to receive a Resource<R> with an object of " + this.j + " inside, but instead got null."));
            return;
        }
        Object obj = vbVar.get();
        if (obj != null && this.j.isAssignableFrom(obj.getClass())) {
            if (k()) {
                a(vbVar, obj, aVar);
                return;
            } else {
                a(vbVar);
                this.w = b.COMPLETE;
                return;
            }
        }
        a(vbVar);
        StringBuilder sb = new StringBuilder();
        sb.append("Expected to receive an object of ");
        sb.append(this.j);
        sb.append(" but instead got ");
        sb.append(obj != null ? obj.getClass() : "");
        sb.append("{");
        sb.append(obj);
        sb.append("} inside Resource{");
        sb.append(vbVar);
        sb.append("}.");
        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
        a(new qb(sb.toString()));
    }

    @Override // defpackage.fh
    public synchronized void b() {
        h();
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = -1;
        this.m = -1;
        this.o = null;
        this.p = null;
        this.e = null;
        this.f = null;
        this.r = null;
        this.u = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = -1;
        this.B = -1;
        this.C = null;
        D.a(this);
    }

    @Override // defpackage.fh
    public synchronized boolean b(fh fhVar) {
        boolean z = false;
        if (!(fhVar instanceof kh)) {
            return false;
        }
        kh<?> khVar = (kh) fhVar;
        synchronized (khVar) {
            if (this.l == khVar.l && this.m == khVar.m && ki.a(this.i, khVar.i) && this.j.equals(khVar.j) && this.k.equals(khVar.k) && this.n == khVar.n && a(khVar)) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.fh
    public synchronized boolean c() {
        return this.w == b.FAILED;
    }

    @Override // defpackage.fh
    public synchronized void clear() {
        h();
        this.d.a();
        if (this.w == b.CLEARED) {
            return;
        }
        l();
        if (this.t != null) {
            a((vb<?>) this.t);
        }
        if (i()) {
            this.o.c(o());
        }
        this.w = b.CLEARED;
    }

    @Override // defpackage.fh
    public synchronized boolean d() {
        return this.w == b.CLEARED;
    }

    @Override // li.f
    public ni e() {
        return this.d;
    }

    @Override // defpackage.fh
    public synchronized boolean f() {
        return g();
    }

    @Override // defpackage.fh
    public synchronized boolean g() {
        return this.w == b.COMPLETE;
    }

    @Override // defpackage.fh
    public synchronized boolean isRunning() {
        boolean z;
        if (this.w != b.RUNNING) {
            z = this.w == b.WAITING_FOR_SIZE;
        }
        return z;
    }
}
