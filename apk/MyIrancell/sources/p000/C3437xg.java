package p000;

import com.bumptech.glide.load.InterfaceC0570d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: xg */
/* loaded from: classes.dex */
public class C3437xg {

    /* renamed from: a */
    private final List<a<?>> f14049a = new ArrayList();

    /* renamed from: xg$a */
    /* loaded from: classes.dex */
    private static final class a<T> {

        /* renamed from: a */
        private final Class<T> f14050a;

        /* renamed from: b */
        final InterfaceC0570d<T> f14051b;

        a(Class<T> cls, InterfaceC0570d<T> interfaceC0570d) {
            this.f14050a = cls;
            this.f14051b = interfaceC0570d;
        }

        /* renamed from: a */
        boolean m16493a(Class<?> cls) {
            return this.f14050a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <T> InterfaceC0570d<T> m16491a(Class<T> cls) {
        for (a<?> aVar : this.f14049a) {
            if (aVar.m16493a(cls)) {
                return (InterfaceC0570d<T>) aVar.f14051b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public synchronized <T> void m16492a(Class<T> cls, InterfaceC0570d<T> interfaceC0570d) {
        this.f14049a.add(new a<>(cls, interfaceC0570d));
    }
}
