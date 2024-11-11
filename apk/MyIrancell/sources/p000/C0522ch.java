package p000;

import com.bumptech.glide.load.InterfaceC0577k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ch */
/* loaded from: classes.dex */
public class C0522ch {

    /* renamed from: a */
    private final List<a<?>> f3012a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ch$a */
    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a */
        private final Class<T> f3013a;

        /* renamed from: b */
        final InterfaceC0577k<T> f3014b;

        a(Class<T> cls, InterfaceC0577k<T> interfaceC0577k) {
            this.f3013a = cls;
            this.f3014b = interfaceC0577k;
        }

        /* renamed from: a */
        boolean m3679a(Class<?> cls) {
            return this.f3013a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <Z> InterfaceC0577k<Z> m3677a(Class<Z> cls) {
        int size = this.f3012a.size();
        for (int i = 0; i < size; i++) {
            a<?> aVar = this.f3012a.get(i);
            if (aVar.m3679a(cls)) {
                return (InterfaceC0577k<Z>) aVar.f3014b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public synchronized <Z> void m3678a(Class<Z> cls, InterfaceC0577k<Z> interfaceC0577k) {
        this.f3012a.add(new a<>(cls, interfaceC0577k));
    }
}
