package p000;

import com.bumptech.glide.C0563h;
import com.bumptech.glide.load.C0575i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p000.InterfaceC3031od;

/* renamed from: sd */
/* loaded from: classes.dex */
public class C3206sd {

    /* renamed from: e */
    private static final c f13082e = new c();

    /* renamed from: f */
    private static final InterfaceC3031od<Object, Object> f13083f = new a();

    /* renamed from: a */
    private final List<b<?, ?>> f13084a;

    /* renamed from: b */
    private final c f13085b;

    /* renamed from: c */
    private final Set<b<?, ?>> f13086c;

    /* renamed from: d */
    private final InterfaceC3283u1<List<Throwable>> f13087d;

    /* renamed from: sd$a */
    /* loaded from: classes.dex */
    private static class a implements InterfaceC3031od<Object, Object> {
        a() {
        }

        @Override // p000.InterfaceC3031od
        /* renamed from: a */
        public InterfaceC3031od.a<Object> mo137a(Object obj, int i, int i2, C0575i c0575i) {
            return null;
        }

        @Override // p000.InterfaceC3031od
        /* renamed from: a */
        public boolean mo138a(Object obj) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sd$b */
    /* loaded from: classes.dex */
    public static class b<Model, Data> {

        /* renamed from: a */
        private final Class<Model> f13088a;

        /* renamed from: b */
        final Class<Data> f13089b;

        /* renamed from: c */
        final InterfaceC3081pd<? extends Model, ? extends Data> f13090c;

        public b(Class<Model> cls, Class<Data> cls2, InterfaceC3081pd<? extends Model, ? extends Data> interfaceC3081pd) {
            this.f13088a = cls;
            this.f13089b = cls2;
            this.f13090c = interfaceC3081pd;
        }

        /* renamed from: a */
        public boolean m15403a(Class<?> cls) {
            return this.f13088a.isAssignableFrom(cls);
        }

        /* renamed from: a */
        public boolean m15404a(Class<?> cls, Class<?> cls2) {
            return m15403a(cls) && this.f13089b.isAssignableFrom(cls2);
        }
    }

    /* renamed from: sd$c */
    /* loaded from: classes.dex */
    static class c {
        c() {
        }

        /* renamed from: a */
        public <Model, Data> C3162rd<Model, Data> m15405a(List<InterfaceC3031od<Model, Data>> list, InterfaceC3283u1<List<Throwable>> interfaceC3283u1) {
            return new C3162rd<>(list, interfaceC3283u1);
        }
    }

    public C3206sd(InterfaceC3283u1<List<Throwable>> interfaceC3283u1) {
        this(interfaceC3283u1, f13082e);
    }

    C3206sd(InterfaceC3283u1<List<Throwable>> interfaceC3283u1, c cVar) {
        this.f13084a = new ArrayList();
        this.f13086c = new HashSet();
        this.f13087d = interfaceC3283u1;
        this.f13085b = cVar;
    }

    /* renamed from: a */
    private static <Model, Data> InterfaceC3031od<Model, Data> m15396a() {
        return (InterfaceC3031od<Model, Data>) f13083f;
    }

    /* renamed from: a */
    private <Model, Data> InterfaceC3031od<Model, Data> m15397a(b<?, ?> bVar) {
        Object mo139a = bVar.f13090c.mo139a(this);
        C2816ji.m13459a(mo139a);
        return (InterfaceC3031od) mo139a;
    }

    /* renamed from: a */
    private <Model, Data> void m15398a(Class<Model> cls, Class<Data> cls2, InterfaceC3081pd<? extends Model, ? extends Data> interfaceC3081pd, boolean z) {
        b<?, ?> bVar = new b<>(cls, cls2, interfaceC3081pd);
        List<b<?, ?>> list = this.f13084a;
        list.add(z ? list.size() : 0, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized <Model> List<InterfaceC3031od<Model, ?>> m15399a(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.f13084a) {
                if (!this.f13086c.contains(bVar) && bVar.m15403a(cls)) {
                    this.f13086c.add(bVar);
                    arrayList.add(m15397a(bVar));
                    this.f13086c.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.f13086c.clear();
            throw th;
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized <Model, Data> InterfaceC3031od<Model, Data> m15400a(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (b<?, ?> bVar : this.f13084a) {
                if (this.f13086c.contains(bVar)) {
                    z = true;
                } else if (bVar.m15404a(cls, cls2)) {
                    this.f13086c.add(bVar);
                    arrayList.add(m15397a(bVar));
                    this.f13086c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f13085b.m15405a(arrayList, this.f13087d);
            }
            if (arrayList.size() == 1) {
                return (InterfaceC3031od) arrayList.get(0);
            }
            if (!z) {
                throw new C0563h.c(cls, cls2);
            }
            return m15396a();
        } catch (Throwable th) {
            this.f13086c.clear();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized <Model, Data> void m15401a(Class<Model> cls, Class<Data> cls2, InterfaceC3081pd<? extends Model, ? extends Data> interfaceC3081pd) {
        m15398a(cls, cls2, interfaceC3081pd, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized List<Class<?>> m15402b(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.f13084a) {
            if (!arrayList.contains(bVar.f13089b) && bVar.m15403a(cls)) {
                arrayList.add(bVar.f13089b);
            }
        }
        return arrayList;
    }
}
