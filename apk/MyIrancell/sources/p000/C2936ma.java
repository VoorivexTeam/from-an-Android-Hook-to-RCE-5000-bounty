package p000;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p000.InterfaceC2890la;

/* renamed from: ma */
/* loaded from: classes.dex */
public class C2936ma {

    /* renamed from: b */
    private static final InterfaceC2890la.a<?> f12133b = new a();

    /* renamed from: a */
    private final Map<Class<?>, InterfaceC2890la.a<?>> f12134a = new HashMap();

    /* renamed from: ma$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC2890la.a<Object> {
        a() {
        }

        @Override // p000.InterfaceC2890la.a
        /* renamed from: a */
        public Class<Object> mo11363a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // p000.InterfaceC2890la.a
        /* renamed from: a */
        public InterfaceC2890la<Object> mo11364a(Object obj) {
            return new b(obj);
        }
    }

    /* renamed from: ma$b */
    /* loaded from: classes.dex */
    private static final class b implements InterfaceC2890la<Object> {

        /* renamed from: a */
        private final Object f12135a;

        b(Object obj) {
            this.f12135a = obj;
        }

        @Override // p000.InterfaceC2890la
        /* renamed from: a */
        public Object mo11361a() {
            return this.f12135a;
        }

        @Override // p000.InterfaceC2890la
        /* renamed from: b */
        public void mo11362b() {
        }
    }

    /* renamed from: a */
    public synchronized <T> InterfaceC2890la<T> m14096a(T t) {
        InterfaceC2890la.a<?> aVar;
        C2816ji.m13459a(t);
        aVar = this.f12134a.get(t.getClass());
        if (aVar == null) {
            Iterator<InterfaceC2890la.a<?>> it = this.f12134a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC2890la.a<?> next = it.next();
                if (next.mo11363a().isAssignableFrom(t.getClass())) {
                    aVar = next;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = f12133b;
        }
        return (InterfaceC2890la<T>) aVar.mo11364a(t);
    }

    /* renamed from: a */
    public synchronized void m14097a(InterfaceC2890la.a<?> aVar) {
        this.f12134a.put(aVar.mo11363a(), aVar);
    }
}
