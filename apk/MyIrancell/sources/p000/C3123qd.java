package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: qd */
/* loaded from: classes.dex */
public class C3123qd {

    /* renamed from: a */
    private final C3206sd f12785a;

    /* renamed from: b */
    private final a f12786b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qd$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final Map<Class<?>, C3575a<?>> f12787a = new HashMap();

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: qd$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C3575a<Model> {

            /* renamed from: a */
            final List<InterfaceC3031od<Model, ?>> f12788a;

            public C3575a(List<InterfaceC3031od<Model, ?>> list) {
                this.f12788a = list;
            }
        }

        a() {
        }

        /* renamed from: a */
        public <Model> List<InterfaceC3031od<Model, ?>> m15062a(Class<Model> cls) {
            C3575a<?> c3575a = this.f12787a.get(cls);
            if (c3575a == null) {
                return null;
            }
            return (List<InterfaceC3031od<Model, ?>>) c3575a.f12788a;
        }

        /* renamed from: a */
        public void m15063a() {
            this.f12787a.clear();
        }

        /* renamed from: a */
        public <Model> void m15064a(Class<Model> cls, List<InterfaceC3031od<Model, ?>> list) {
            if (this.f12787a.put(cls, new C3575a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    private C3123qd(C3206sd c3206sd) {
        this.f12786b = new a();
        this.f12785a = c3206sd;
    }

    public C3123qd(InterfaceC3283u1<List<Throwable>> interfaceC3283u1) {
        this(new C3206sd(interfaceC3283u1));
    }

    /* renamed from: b */
    private static <A> Class<A> m15057b(A a2) {
        return (Class<A>) a2.getClass();
    }

    /* renamed from: b */
    private synchronized <A> List<InterfaceC3031od<A, ?>> m15058b(Class<A> cls) {
        List<InterfaceC3031od<A, ?>> m15062a;
        m15062a = this.f12786b.m15062a(cls);
        if (m15062a == null) {
            m15062a = Collections.unmodifiableList(this.f12785a.m15399a(cls));
            this.f12786b.m15064a(cls, m15062a);
        }
        return m15062a;
    }

    /* renamed from: a */
    public synchronized List<Class<?>> m15059a(Class<?> cls) {
        return this.f12785a.m15402b(cls);
    }

    /* renamed from: a */
    public <A> List<InterfaceC3031od<A, ?>> m15060a(A a2) {
        List<InterfaceC3031od<A, ?>> m15058b = m15058b((Class) m15057b(a2));
        int size = m15058b.size();
        List<InterfaceC3031od<A, ?>> emptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            InterfaceC3031od<A, ?> interfaceC3031od = m15058b.get(i);
            if (interfaceC3031od.mo138a(a2)) {
                if (z) {
                    emptyList = new ArrayList<>(size - i);
                    z = false;
                }
                emptyList.add(interfaceC3031od);
            }
        }
        return emptyList;
    }

    /* renamed from: a */
    public synchronized <Model, Data> void m15061a(Class<Model> cls, Class<Data> cls2, InterfaceC3081pd<? extends Model, ? extends Data> interfaceC3081pd) {
        this.f12785a.m15401a(cls, cls2, interfaceC3081pd);
        this.f12786b.m15063a();
    }
}
