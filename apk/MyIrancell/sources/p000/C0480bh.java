package p000;

import com.bumptech.glide.load.InterfaceC0576j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: bh */
/* loaded from: classes.dex */
public class C0480bh {

    /* renamed from: a */
    private final List<String> f2803a = new ArrayList();

    /* renamed from: b */
    private final Map<String, List<a<?, ?>>> f2804b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bh$a */
    /* loaded from: classes.dex */
    public static class a<T, R> {

        /* renamed from: a */
        private final Class<T> f2805a;

        /* renamed from: b */
        final Class<R> f2806b;

        /* renamed from: c */
        final InterfaceC0576j<T, R> f2807c;

        public a(Class<T> cls, Class<R> cls2, InterfaceC0576j<T, R> interfaceC0576j) {
            this.f2805a = cls;
            this.f2806b = cls2;
            this.f2807c = interfaceC0576j;
        }

        /* renamed from: a */
        public boolean m3395a(Class<?> cls, Class<?> cls2) {
            return this.f2805a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f2806b);
        }
    }

    /* renamed from: a */
    private synchronized List<a<?, ?>> m3390a(String str) {
        List<a<?, ?>> list;
        if (!this.f2803a.contains(str)) {
            this.f2803a.add(str);
        }
        list = this.f2804b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f2804b.put(str, list);
        }
        return list;
    }

    /* renamed from: a */
    public synchronized <T, R> List<InterfaceC0576j<T, R>> m3391a(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f2803a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f2804b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.m3395a(cls, cls2)) {
                        arrayList.add(aVar.f2807c);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized <T, R> void m3392a(String str, InterfaceC0576j<T, R> interfaceC0576j, Class<T> cls, Class<R> cls2) {
        m3390a(str).add(new a<>(cls, cls2, interfaceC0576j));
    }

    /* renamed from: a */
    public synchronized void m3393a(List<String> list) {
        ArrayList<String> arrayList = new ArrayList(this.f2803a);
        this.f2803a.clear();
        this.f2803a.addAll(list);
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.f2803a.add(str);
            }
        }
    }

    /* renamed from: b */
    public synchronized <T, R> List<Class<R>> m3394b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f2803a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f2804b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.m3395a(cls, cls2) && !arrayList.contains(aVar.f2806b)) {
                        arrayList.add(aVar.f2806b);
                    }
                }
            }
        }
        return arrayList;
    }
}
