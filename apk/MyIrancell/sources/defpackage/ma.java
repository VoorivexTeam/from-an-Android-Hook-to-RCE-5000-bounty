package defpackage;

import defpackage.la;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class ma {
    private static final la.a<?> b = new a();
    private final Map<Class<?>, la.a<?>> a = new HashMap();

    /* loaded from: classes.dex */
    class a implements la.a<Object> {
        a() {
        }

        @Override // la.a
        public Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // la.a
        public la<Object> a(Object obj) {
            return new b(obj);
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements la<Object> {
        private final Object a;

        b(Object obj) {
            this.a = obj;
        }

        @Override // defpackage.la
        public Object a() {
            return this.a;
        }

        @Override // defpackage.la
        public void b() {
        }
    }

    public synchronized <T> la<T> a(T t) {
        la.a<?> aVar;
        ji.a(t);
        aVar = this.a.get(t.getClass());
        if (aVar == null) {
            Iterator<la.a<?>> it = this.a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                la.a<?> next = it.next();
                if (next.a().isAssignableFrom(t.getClass())) {
                    aVar = next;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = b;
        }
        return (la<T>) aVar.a(t);
    }

    public synchronized void a(la.a<?> aVar) {
        this.a.put(aVar.a(), aVar);
    }
}
