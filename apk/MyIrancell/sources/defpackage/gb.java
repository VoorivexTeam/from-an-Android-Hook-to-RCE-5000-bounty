package defpackage;

import com.bumptech.glide.e;
import com.bumptech.glide.h;
import com.bumptech.glide.load.d;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;
import com.bumptech.glide.load.l;
import defpackage.hb;
import defpackage.od;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class gb<Transcode> {
    private final List<od.a<?>> a = new ArrayList();
    private final List<g> b = new ArrayList();
    private e c;
    private Object d;
    private int e;
    private int f;
    private Class<?> g;
    private hb.e h;
    private i i;
    private Map<Class<?>, l<?>> j;
    private Class<Transcode> k;
    private boolean l;
    private boolean m;
    private g n;
    private com.bumptech.glide.g o;
    private jb p;
    private boolean q;
    private boolean r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public <X> d<X> a(X x) {
        return this.c.f().c(x);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <Z> k<Z> a(vb<Z> vbVar) {
        return this.c.f().a((vb) vbVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<od<File, ?>> a(File file) {
        return this.c.f().a((h) file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <Data> tb<Data, ?, Transcode> a(Class<Data> cls) {
        return this.c.f().a(cls, this.g, this.k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.c = null;
        this.d = null;
        this.n = null;
        this.g = null;
        this.k = null;
        this.i = null;
        this.o = null;
        this.j = null;
        this.p = null;
        this.a.clear();
        this.l = false;
        this.b.clear();
        this.m = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public <R> void a(e eVar, Object obj, g gVar, int i, int i2, jb jbVar, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar2, i iVar, Map<Class<?>, l<?>> map, boolean z, boolean z2, hb.e eVar2) {
        this.c = eVar;
        this.d = obj;
        this.n = gVar;
        this.e = i;
        this.f = i2;
        this.p = jbVar;
        this.g = cls;
        this.h = eVar2;
        this.k = cls2;
        this.o = gVar2;
        this.i = iVar;
        this.j = map;
        this.q = z;
        this.r = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(g gVar) {
        List<od.a<?>> g = g();
        int size = g.size();
        for (int i = 0; i < size; i++) {
            if (g.get(i).a.equals(gVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bc b() {
        return this.c.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <Z> l<Z> b(Class<Z> cls) {
        l<Z> lVar = (l) this.j.get(cls);
        if (lVar == null) {
            Iterator<Map.Entry<Class<?>, l<?>>> it = this.j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, l<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    lVar = (l) next.getValue();
                    break;
                }
            }
        }
        if (lVar != null) {
            return lVar;
        }
        if (!this.j.isEmpty() || !this.q) {
            return fe.a();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(vb<?> vbVar) {
        return this.c.f().b(vbVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<g> c() {
        if (!this.m) {
            this.m = true;
            this.b.clear();
            List<od.a<?>> g = g();
            int size = g.size();
            for (int i = 0; i < size; i++) {
                od.a<?> aVar = g.get(i);
                if (!this.b.contains(aVar.a)) {
                    this.b.add(aVar.a);
                }
                for (int i2 = 0; i2 < aVar.b.size(); i2++) {
                    if (!this.b.contains(aVar.b.get(i2))) {
                        this.b.add(aVar.b.get(i2));
                    }
                }
            }
        }
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean c(Class<?> cls) {
        return a((Class) cls) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public oc d() {
        return this.h.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public jb e() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<od.a<?>> g() {
        if (!this.l) {
            this.l = true;
            this.a.clear();
            List a = this.c.f().a((h) this.d);
            int size = a.size();
            for (int i = 0; i < size; i++) {
                od.a<?> a2 = ((od) a.get(i)).a(this.d, this.e, this.f, this.i);
                if (a2 != null) {
                    this.a.add(a2);
                }
            }
        }
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Class<?> h() {
        return this.d.getClass();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i i() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.bumptech.glide.g j() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Class<?>> k() {
        return this.c.f().b(this.d.getClass(), this.g, this.k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g l() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Class<?> m() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int n() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o() {
        return this.r;
    }
}
