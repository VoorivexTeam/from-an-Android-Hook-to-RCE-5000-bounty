package defpackage;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class zg {
    private static final tb<?, ?, ?> c = new tb<>(Object.class, Object.class, Object.class, Collections.singletonList(new ib(Object.class, Object.class, Object.class, Collections.emptyList(), new cg(), null)), null);
    private final c0<ii, tb<?, ?, ?>> a = new c0<>();
    private final AtomicReference<ii> b = new AtomicReference<>();

    private ii b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        ii andSet = this.b.getAndSet(null);
        if (andSet == null) {
            andSet = new ii();
        }
        andSet.a(cls, cls2, cls3);
        return andSet;
    }

    public <Data, TResource, Transcode> tb<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        tb<Data, TResource, Transcode> tbVar;
        ii b = b(cls, cls2, cls3);
        synchronized (this.a) {
            tbVar = (tb) this.a.get(b);
        }
        this.b.set(b);
        return tbVar;
    }

    public void a(Class<?> cls, Class<?> cls2, Class<?> cls3, tb<?, ?, ?> tbVar) {
        synchronized (this.a) {
            c0<ii, tb<?, ?, ?>> c0Var = this.a;
            ii iiVar = new ii(cls, cls2, cls3);
            if (tbVar == null) {
                tbVar = c;
            }
            c0Var.put(iiVar, tbVar);
        }
    }

    public boolean a(tb<?, ?, ?> tbVar) {
        return c.equals(tbVar);
    }
}
