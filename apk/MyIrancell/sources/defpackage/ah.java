package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class ah {
    private final AtomicReference<ii> a = new AtomicReference<>();
    private final c0<ii, List<Class<?>>> b = new c0<>();

    public List<Class<?>> a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        ii andSet = this.a.getAndSet(null);
        if (andSet == null) {
            andSet = new ii(cls, cls2, cls3);
        } else {
            andSet.a(cls, cls2, cls3);
        }
        synchronized (this.b) {
            list = this.b.get(andSet);
        }
        this.a.set(andSet);
        return list;
    }

    public void a(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.b) {
            this.b.put(new ii(cls, cls2, cls3), list);
        }
    }
}
