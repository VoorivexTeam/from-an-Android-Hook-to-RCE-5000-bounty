package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class qd {
    private final sd a;
    private final a b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {
        private final Map<Class<?>, C0079a<?>> a = new HashMap();

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: qd$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0079a<Model> {
            final List<od<Model, ?>> a;

            public C0079a(List<od<Model, ?>> list) {
                this.a = list;
            }
        }

        a() {
        }

        public <Model> List<od<Model, ?>> a(Class<Model> cls) {
            C0079a<?> c0079a = this.a.get(cls);
            if (c0079a == null) {
                return null;
            }
            return (List<od<Model, ?>>) c0079a.a;
        }

        public void a() {
            this.a.clear();
        }

        public <Model> void a(Class<Model> cls, List<od<Model, ?>> list) {
            if (this.a.put(cls, new C0079a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    private qd(sd sdVar) {
        this.b = new a();
        this.a = sdVar;
    }

    public qd(u1<List<Throwable>> u1Var) {
        this(new sd(u1Var));
    }

    private static <A> Class<A> b(A a2) {
        return (Class<A>) a2.getClass();
    }

    private synchronized <A> List<od<A, ?>> b(Class<A> cls) {
        List<od<A, ?>> a2;
        a2 = this.b.a(cls);
        if (a2 == null) {
            a2 = Collections.unmodifiableList(this.a.a(cls));
            this.b.a(cls, a2);
        }
        return a2;
    }

    public synchronized List<Class<?>> a(Class<?> cls) {
        return this.a.b(cls);
    }

    public <A> List<od<A, ?>> a(A a2) {
        List<od<A, ?>> b = b((Class) b(a2));
        int size = b.size();
        List<od<A, ?>> emptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            od<A, ?> odVar = b.get(i);
            if (odVar.a(a2)) {
                if (z) {
                    emptyList = new ArrayList<>(size - i);
                    z = false;
                }
                emptyList.add(odVar);
            }
        }
        return emptyList;
    }

    public synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, pd<? extends Model, ? extends Data> pdVar) {
        this.a.a(cls, cls2, pdVar);
        this.b.a();
    }
}
