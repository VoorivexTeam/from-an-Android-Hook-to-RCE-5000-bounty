package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: bg */
/* loaded from: classes.dex */
public class C0479bg {

    /* renamed from: a */
    private final List<a<?, ?>> f2799a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bg$a */
    /* loaded from: classes.dex */
    public static final class a<Z, R> {

        /* renamed from: a */
        private final Class<Z> f2800a;

        /* renamed from: b */
        private final Class<R> f2801b;

        /* renamed from: c */
        final InterfaceC0020ag<Z, R> f2802c;

        a(Class<Z> cls, Class<R> cls2, InterfaceC0020ag<Z, R> interfaceC0020ag) {
            this.f2800a = cls;
            this.f2801b = cls2;
            this.f2802c = interfaceC0020ag;
        }

        /* renamed from: a */
        public boolean m3389a(Class<?> cls, Class<?> cls2) {
            return this.f2800a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f2801b);
        }
    }

    /* renamed from: a */
    public synchronized <Z, R> InterfaceC0020ag<Z, R> m3386a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C0521cg.m3676a();
        }
        for (a<?, ?> aVar : this.f2799a) {
            if (aVar.m3389a(cls, cls2)) {
                return (InterfaceC0020ag<Z, R>) aVar.f2802c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    /* renamed from: a */
    public synchronized <Z, R> void m3387a(Class<Z> cls, Class<R> cls2, InterfaceC0020ag<Z, R> interfaceC0020ag) {
        this.f2799a.add(new a<>(cls, cls2, interfaceC0020ag));
    }

    /* renamed from: b */
    public synchronized <Z, R> List<Class<R>> m3388b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator<a<?, ?>> it = this.f2799a.iterator();
        while (it.hasNext()) {
            if (it.next().m3389a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }
}
