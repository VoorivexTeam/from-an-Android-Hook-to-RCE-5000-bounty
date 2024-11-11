package defpackage;

import com.bumptech.glide.h;
import com.bumptech.glide.load.i;
import defpackage.od;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class sd {
    private static final c e = new c();
    private static final od<Object, Object> f = new a();
    private final List<b<?, ?>> a;
    private final c b;
    private final Set<b<?, ?>> c;
    private final u1<List<Throwable>> d;

    /* loaded from: classes.dex */
    private static class a implements od<Object, Object> {
        a() {
        }

        @Override // defpackage.od
        public od.a<Object> a(Object obj, int i, int i2, i iVar) {
            return null;
        }

        @Override // defpackage.od
        public boolean a(Object obj) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b<Model, Data> {
        private final Class<Model> a;
        final Class<Data> b;
        final pd<? extends Model, ? extends Data> c;

        public b(Class<Model> cls, Class<Data> cls2, pd<? extends Model, ? extends Data> pdVar) {
            this.a = cls;
            this.b = cls2;
            this.c = pdVar;
        }

        public boolean a(Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return a(cls) && this.b.isAssignableFrom(cls2);
        }
    }

    /* loaded from: classes.dex */
    static class c {
        c() {
        }

        public <Model, Data> rd<Model, Data> a(List<od<Model, Data>> list, u1<List<Throwable>> u1Var) {
            return new rd<>(list, u1Var);
        }
    }

    public sd(u1<List<Throwable>> u1Var) {
        this(u1Var, e);
    }

    sd(u1<List<Throwable>> u1Var, c cVar) {
        this.a = new ArrayList();
        this.c = new HashSet();
        this.d = u1Var;
        this.b = cVar;
    }

    private static <Model, Data> od<Model, Data> a() {
        return (od<Model, Data>) f;
    }

    private <Model, Data> od<Model, Data> a(b<?, ?> bVar) {
        Object a2 = bVar.c.a(this);
        ji.a(a2);
        return (od) a2;
    }

    private <Model, Data> void a(Class<Model> cls, Class<Data> cls2, pd<? extends Model, ? extends Data> pdVar, boolean z) {
        b<?, ?> bVar = new b<>(cls, cls2, pdVar);
        List<b<?, ?>> list = this.a;
        list.add(z ? list.size() : 0, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized <Model> List<od<Model, ?>> a(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.a) {
                if (!this.c.contains(bVar) && bVar.a(cls)) {
                    this.c.add(bVar);
                    arrayList.add(a(bVar));
                    this.c.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
        return arrayList;
    }

    public synchronized <Model, Data> od<Model, Data> a(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (b<?, ?> bVar : this.a) {
                if (this.c.contains(bVar)) {
                    z = true;
                } else if (bVar.a(cls, cls2)) {
                    this.c.add(bVar);
                    arrayList.add(a(bVar));
                    this.c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.b.a(arrayList, this.d);
            }
            if (arrayList.size() == 1) {
                return (od) arrayList.get(0);
            }
            if (!z) {
                throw new h.c(cls, cls2);
            }
            return a();
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, pd<? extends Model, ? extends Data> pdVar) {
        a(cls, cls2, pdVar, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized List<Class<?>> b(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.a) {
            if (!arrayList.contains(bVar.b) && bVar.a(cls)) {
                arrayList.add(bVar.b);
            }
        }
        return arrayList;
    }
}
