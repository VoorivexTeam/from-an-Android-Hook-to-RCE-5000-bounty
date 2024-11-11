package p000;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ah */
/* loaded from: classes.dex */
public class C0021ah {

    /* renamed from: a */
    private final AtomicReference<C2596ii> f103a = new AtomicReference<>();

    /* renamed from: b */
    private final C0500c0<C2596ii, List<Class<?>>> f104b = new C0500c0<>();

    /* renamed from: a */
    public List<Class<?>> m153a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        C2596ii andSet = this.f103a.getAndSet(null);
        if (andSet == null) {
            andSet = new C2596ii(cls, cls2, cls3);
        } else {
            andSet.m12458a(cls, cls2, cls3);
        }
        synchronized (this.f104b) {
            list = this.f104b.get(andSet);
        }
        this.f103a.set(andSet);
        return list;
    }

    /* renamed from: a */
    public void m154a(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.f104b) {
            this.f104b.put(new C2596ii(cls, cls2, cls3), list);
        }
    }
}
