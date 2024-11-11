package defpackage;

import android.os.Build;
import android.util.Log;
import com.bumptech.glide.h;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;
import com.bumptech.glide.load.l;
import defpackage.fb;
import defpackage.ib;
import defpackage.li;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class hb<R> implements fb.a, Runnable, Comparable<hb<?>>, li.f {
    private Object A;
    private com.bumptech.glide.load.a B;
    private ka<?> C;
    private volatile fb D;
    private volatile boolean E;
    private volatile boolean F;
    private final e e;
    private final u1<hb<?>> f;
    private com.bumptech.glide.e i;
    private com.bumptech.glide.load.g j;
    private com.bumptech.glide.g k;
    private nb l;
    private int m;
    private int n;
    private jb o;
    private i p;
    private b<R> q;
    private int r;
    private h s;
    private g t;
    private long u;
    private boolean v;
    private Object w;
    private Thread x;
    private com.bumptech.glide.load.g y;
    private com.bumptech.glide.load.g z;
    private final gb<R> b = new gb<>();
    private final List<Throwable> c = new ArrayList();
    private final ni d = ni.b();
    private final d<?> g = new d<>();
    private final f h = new f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[com.bumptech.glide.load.c.values().length];
            c = iArr;
            try {
                iArr[com.bumptech.glide.load.c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[com.bumptech.glide.load.c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[h.values().length];
            b = iArr2;
            try {
                iArr2[h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b<R> {
        void a(hb<?> hbVar);

        void a(qb qbVar);

        void a(vb<R> vbVar, com.bumptech.glide.load.a aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c<Z> implements ib.a<Z> {
        private final com.bumptech.glide.load.a a;

        c(com.bumptech.glide.load.a aVar) {
            this.a = aVar;
        }

        @Override // ib.a
        public vb<Z> a(vb<Z> vbVar) {
            return hb.this.a(this.a, vbVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d<Z> {
        private com.bumptech.glide.load.g a;
        private k<Z> b;
        private ub<Z> c;

        d() {
        }

        void a() {
            this.a = null;
            this.b = null;
            this.c = null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        <X> void a(com.bumptech.glide.load.g gVar, k<X> kVar, ub<X> ubVar) {
            this.a = gVar;
            this.b = kVar;
            this.c = ubVar;
        }

        void a(e eVar, i iVar) {
            mi.a("DecodeJob.encode");
            try {
                eVar.a().a(this.a, new eb(this.b, this.c, iVar));
            } finally {
                this.c.a();
                mi.a();
            }
        }

        boolean b() {
            return this.c != null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface e {
        oc a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f {
        private boolean a;
        private boolean b;
        private boolean c;

        f() {
        }

        private boolean b(boolean z) {
            return (this.c || z || this.b) && this.a;
        }

        synchronized boolean a() {
            this.b = true;
            return b(false);
        }

        synchronized boolean a(boolean z) {
            this.a = true;
            return b(z);
        }

        synchronized boolean b() {
            this.c = true;
            return b(false);
        }

        synchronized void c() {
            this.b = false;
            this.a = false;
            this.c = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public hb(e eVar, u1<hb<?>> u1Var) {
        this.e = eVar;
        this.f = u1Var;
    }

    private i a(com.bumptech.glide.load.a aVar) {
        i iVar = this.p;
        if (Build.VERSION.SDK_INT < 26) {
            return iVar;
        }
        boolean z = aVar == com.bumptech.glide.load.a.RESOURCE_DISK_CACHE || this.b.o();
        Boolean bool = (Boolean) iVar.a(qe.h);
        if (bool != null && (!bool.booleanValue() || z)) {
            return iVar;
        }
        i iVar2 = new i();
        iVar2.a(this.p);
        iVar2.a(qe.h, Boolean.valueOf(z));
        return iVar2;
    }

    private h a(h hVar) {
        int i = a.b[hVar.ordinal()];
        if (i == 1) {
            return this.o.a() ? h.DATA_CACHE : a(h.DATA_CACHE);
        }
        if (i == 2) {
            return this.v ? h.FINISHED : h.SOURCE;
        }
        if (i == 3 || i == 4) {
            return h.FINISHED;
        }
        if (i == 5) {
            return this.o.b() ? h.RESOURCE_CACHE : a(h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + hVar);
    }

    private <Data> vb<R> a(Data data, com.bumptech.glide.load.a aVar) {
        return a((hb<R>) data, aVar, (tb<hb<R>, ResourceType, R>) this.b.a((Class) data.getClass()));
    }

    private <Data, ResourceType> vb<R> a(Data data, com.bumptech.glide.load.a aVar, tb<Data, ResourceType, R> tbVar) {
        i a2 = a(aVar);
        la<Data> b2 = this.i.f().b((com.bumptech.glide.h) data);
        try {
            return tbVar.a(b2, a2, this.m, this.n, new c(aVar));
        } finally {
            b2.b();
        }
    }

    private <Data> vb<R> a(ka<?> kaVar, Data data, com.bumptech.glide.load.a aVar) {
        if (data == null) {
            return null;
        }
        try {
            long a2 = fi.a();
            vb<R> a3 = a((hb<R>) data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                a("Decoded result " + a3, a2);
            }
            return a3;
        } finally {
            kaVar.b();
        }
    }

    private void a(String str, long j) {
        a(str, j, (String) null);
    }

    private void a(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(fi.a(j));
        sb.append(", load key: ");
        sb.append(this.l);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        sb.toString();
    }

    private void a(vb<R> vbVar, com.bumptech.glide.load.a aVar) {
        q();
        this.q.a(vbVar, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b(vb<R> vbVar, com.bumptech.glide.load.a aVar) {
        if (vbVar instanceof rb) {
            ((rb) vbVar).a();
        }
        ub ubVar = 0;
        if (this.g.b()) {
            vbVar = ub.b(vbVar);
            ubVar = vbVar;
        }
        a((vb) vbVar, aVar);
        this.s = h.ENCODE;
        try {
            if (this.g.b()) {
                this.g.a(this.e, this.p);
            }
            l();
        } finally {
            if (ubVar != 0) {
                ubVar.a();
            }
        }
    }

    private void h() {
        if (Log.isLoggable("DecodeJob", 2)) {
            a("Retrieved data", this.u, "data: " + this.A + ", cache key: " + this.y + ", fetcher: " + this.C);
        }
        vb<R> vbVar = null;
        try {
            vbVar = a(this.C, (ka<?>) this.A, this.B);
        } catch (qb e2) {
            e2.a(this.z, this.B);
            this.c.add(e2);
        }
        if (vbVar != null) {
            b(vbVar, this.B);
        } else {
            o();
        }
    }

    private fb i() {
        int i = a.b[this.s.ordinal()];
        if (i == 1) {
            return new wb(this.b, this);
        }
        if (i == 2) {
            return new cb(this.b, this);
        }
        if (i == 3) {
            return new zb(this.b, this);
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.s);
    }

    private int j() {
        return this.k.ordinal();
    }

    private void k() {
        q();
        this.q.a(new qb("Failed to load resource", new ArrayList(this.c)));
        m();
    }

    private void l() {
        if (this.h.a()) {
            n();
        }
    }

    private void m() {
        if (this.h.b()) {
            n();
        }
    }

    private void n() {
        this.h.c();
        this.g.a();
        this.b.a();
        this.E = false;
        this.i = null;
        this.j = null;
        this.p = null;
        this.k = null;
        this.l = null;
        this.q = null;
        this.s = null;
        this.D = null;
        this.x = null;
        this.y = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.u = 0L;
        this.F = false;
        this.w = null;
        this.c.clear();
        this.f.a(this);
    }

    private void o() {
        this.x = Thread.currentThread();
        this.u = fi.a();
        boolean z = false;
        while (!this.F && this.D != null && !(z = this.D.a())) {
            this.s = a(this.s);
            this.D = i();
            if (this.s == h.SOURCE) {
                d();
                return;
            }
        }
        if ((this.s == h.FINISHED || this.F) && !z) {
            k();
        }
    }

    private void p() {
        int i = a.a[this.t.ordinal()];
        if (i == 1) {
            this.s = a(h.INITIALIZE);
            this.D = i();
        } else if (i != 2) {
            if (i == 3) {
                h();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.t);
        }
        o();
    }

    private void q() {
        Throwable th;
        this.d.a();
        if (!this.E) {
            this.E = true;
            return;
        }
        if (this.c.isEmpty()) {
            th = null;
        } else {
            List<Throwable> list = this.c;
            th = list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(hb<?> hbVar) {
        int j = j() - hbVar.j();
        return j == 0 ? this.r - hbVar.r : j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public hb<R> a(com.bumptech.glide.e eVar, Object obj, nb nbVar, com.bumptech.glide.load.g gVar, int i, int i2, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar2, jb jbVar, Map<Class<?>, l<?>> map, boolean z, boolean z2, boolean z3, i iVar, b<R> bVar, int i3) {
        this.b.a(eVar, obj, gVar, i, i2, jbVar, cls, cls2, gVar2, iVar, map, z, z2, this.e);
        this.i = eVar;
        this.j = gVar;
        this.k = gVar2;
        this.l = nbVar;
        this.m = i;
        this.n = i2;
        this.o = jbVar;
        this.v = z3;
        this.p = iVar;
        this.q = bVar;
        this.r = i3;
        this.t = g.INITIALIZE;
        this.w = obj;
        return this;
    }

    <Z> vb<Z> a(com.bumptech.glide.load.a aVar, vb<Z> vbVar) {
        vb<Z> vbVar2;
        l<Z> lVar;
        com.bumptech.glide.load.c cVar;
        com.bumptech.glide.load.g dbVar;
        Class<?> cls = vbVar.get().getClass();
        k<Z> kVar = null;
        if (aVar != com.bumptech.glide.load.a.RESOURCE_DISK_CACHE) {
            l<Z> b2 = this.b.b(cls);
            lVar = b2;
            vbVar2 = b2.a(this.i, vbVar, this.m, this.n);
        } else {
            vbVar2 = vbVar;
            lVar = null;
        }
        if (!vbVar.equals(vbVar2)) {
            vbVar.b();
        }
        if (this.b.b((vb<?>) vbVar2)) {
            kVar = this.b.a((vb) vbVar2);
            cVar = kVar.a(this.p);
        } else {
            cVar = com.bumptech.glide.load.c.NONE;
        }
        k kVar2 = kVar;
        if (!this.o.a(!this.b.a(this.y), aVar, cVar)) {
            return vbVar2;
        }
        if (kVar2 == null) {
            throw new h.d(vbVar2.get().getClass());
        }
        int i = a.c[cVar.ordinal()];
        if (i == 1) {
            dbVar = new db(this.y, this.j);
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + cVar);
            }
            dbVar = new xb(this.b.b(), this.y, this.j, this.m, this.n, lVar, cls, this.p);
        }
        ub b3 = ub.b(vbVar2);
        this.g.a(dbVar, kVar2, b3);
        return b3;
    }

    @Override // fb.a
    public void a(com.bumptech.glide.load.g gVar, Exception exc, ka<?> kaVar, com.bumptech.glide.load.a aVar) {
        kaVar.b();
        qb qbVar = new qb("Fetching data failed", exc);
        qbVar.a(gVar, aVar, kaVar.a());
        this.c.add(qbVar);
        if (Thread.currentThread() == this.x) {
            o();
        } else {
            this.t = g.SWITCH_TO_SOURCE_SERVICE;
            this.q.a((hb<?>) this);
        }
    }

    @Override // fb.a
    public void a(com.bumptech.glide.load.g gVar, Object obj, ka<?> kaVar, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.g gVar2) {
        this.y = gVar;
        this.A = obj;
        this.C = kaVar;
        this.B = aVar;
        this.z = gVar2;
        if (Thread.currentThread() != this.x) {
            this.t = g.DECODE_DATA;
            this.q.a((hb<?>) this);
        } else {
            mi.a("DecodeJob.decodeFromRetrievedData");
            try {
                h();
            } finally {
                mi.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        if (this.h.a(z)) {
            n();
        }
    }

    @Override // fb.a
    public void d() {
        this.t = g.SWITCH_TO_SOURCE_SERVICE;
        this.q.a((hb<?>) this);
    }

    @Override // li.f
    public ni e() {
        return this.d;
    }

    public void f() {
        this.F = true;
        fb fbVar = this.D;
        if (fbVar != null) {
            fbVar.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        h a2 = a(h.INITIALIZE);
        return a2 == h.RESOURCE_CACHE || a2 == h.DATA_CACHE;
    }

    @Override // java.lang.Runnable
    public void run() {
        mi.a("DecodeJob#run(model=%s)", this.w);
        ka<?> kaVar = this.C;
        try {
            try {
                if (this.F) {
                    k();
                    return;
                }
                p();
                if (kaVar != null) {
                    kaVar.b();
                }
                mi.a();
            } finally {
                if (kaVar != null) {
                    kaVar.b();
                }
                mi.a();
            }
        } catch (bb e2) {
            throw e2;
        } catch (Throwable th) {
            if (Log.isLoggable("DecodeJob", 3)) {
                String str = "DecodeJob threw unexpectedly, isCancelled: " + this.F + ", stage: " + this.s;
            }
            if (this.s != h.ENCODE) {
                this.c.add(th);
                k();
            }
            if (!this.F) {
                throw th;
            }
            throw th;
        }
    }
}
