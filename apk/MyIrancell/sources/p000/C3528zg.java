package p000;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zg */
/* loaded from: classes.dex */
public class C3528zg {

    /* renamed from: c */
    private static final C3256tb<?, ?, ?> f14450c = new C3256tb<>(Object.class, Object.class, Object.class, Collections.singletonList(new C2586ib(Object.class, Object.class, Object.class, Collections.emptyList(), new C0521cg(), null)), null);

    /* renamed from: a */
    private final C0500c0<C2596ii, C3256tb<?, ?, ?>> f14451a = new C0500c0<>();

    /* renamed from: b */
    private final AtomicReference<C2596ii> f14452b = new AtomicReference<>();

    /* renamed from: b */
    private C2596ii m16922b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        C2596ii andSet = this.f14452b.getAndSet(null);
        if (andSet == null) {
            andSet = new C2596ii();
        }
        andSet.m12458a(cls, cls2, cls3);
        return andSet;
    }

    /* renamed from: a */
    public <Data, TResource, Transcode> C3256tb<Data, TResource, Transcode> m16923a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C3256tb<Data, TResource, Transcode> c3256tb;
        C2596ii m16922b = m16922b(cls, cls2, cls3);
        synchronized (this.f14451a) {
            c3256tb = (C3256tb) this.f14451a.get(m16922b);
        }
        this.f14452b.set(m16922b);
        return c3256tb;
    }

    /* renamed from: a */
    public void m16924a(Class<?> cls, Class<?> cls2, Class<?> cls3, C3256tb<?, ?, ?> c3256tb) {
        synchronized (this.f14451a) {
            C0500c0<C2596ii, C3256tb<?, ?, ?>> c0500c0 = this.f14451a;
            C2596ii c2596ii = new C2596ii(cls, cls2, cls3);
            if (c3256tb == null) {
                c3256tb = f14450c;
            }
            c0500c0.put(c2596ii, c3256tb);
        }
    }

    /* renamed from: a */
    public boolean m16925a(C3256tb<?, ?, ?> c3256tb) {
        return f14450c.equals(c3256tb);
    }
}
