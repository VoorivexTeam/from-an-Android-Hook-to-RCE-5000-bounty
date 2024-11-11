package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.firebase.components.m */
/* loaded from: classes.dex */
class C2065m {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.components.m$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private final C2056d<?> f8832a;

        /* renamed from: b */
        private final Set<b> f8833b = new HashSet();

        /* renamed from: c */
        private final Set<b> f8834c = new HashSet();

        b(C2056d<?> c2056d) {
            this.f8832a = c2056d;
        }

        /* renamed from: a */
        C2056d<?> m10562a() {
            return this.f8832a;
        }

        /* renamed from: a */
        void m10563a(b bVar) {
            this.f8833b.add(bVar);
        }

        /* renamed from: b */
        Set<b> m10564b() {
            return this.f8833b;
        }

        /* renamed from: b */
        void m10565b(b bVar) {
            this.f8834c.add(bVar);
        }

        /* renamed from: c */
        void m10566c(b bVar) {
            this.f8834c.remove(bVar);
        }

        /* renamed from: c */
        boolean m10567c() {
            return this.f8833b.isEmpty();
        }

        /* renamed from: d */
        boolean m10568d() {
            return this.f8834c.isEmpty();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.components.m$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        private final Class<?> f8835a;

        /* renamed from: b */
        private final boolean f8836b;

        private c(Class<?> cls, boolean z) {
            this.f8835a = cls;
            this.f8836b = z;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f8835a.equals(this.f8835a) && cVar.f8836b == this.f8836b;
        }

        public int hashCode() {
            return ((this.f8835a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f8836b).hashCode();
        }
    }

    /* renamed from: a */
    private static Set<b> m10559a(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.m10568d()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10560a(List<C2056d<?>> list) {
        Set<b> m10561b = m10561b(list);
        Set<b> m10559a = m10559a(m10561b);
        int i = 0;
        while (!m10559a.isEmpty()) {
            b next = m10559a.iterator().next();
            m10559a.remove(next);
            i++;
            for (b bVar : next.m10564b()) {
                bVar.m10566c(next);
                if (bVar.m10568d()) {
                    m10559a.add(bVar);
                }
            }
        }
        if (i == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : m10561b) {
            if (!bVar2.m10568d() && !bVar2.m10567c()) {
                arrayList.add(bVar2.m10562a());
            }
        }
        throw new C2067o(arrayList);
    }

    /* renamed from: b */
    private static Set<b> m10561b(List<C2056d<?>> list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator<C2056d<?>> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (C2066n c2066n : bVar.m10562a().m10527a()) {
                            if (c2066n.m10574b() && (set = (Set) hashMap.get(new c(c2066n.m10573a(), c2066n.m10576d()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.m10563a(bVar2);
                                    bVar2.m10565b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            C2056d<?> next = it.next();
            b bVar3 = new b(next);
            for (Class<? super Object> cls : next.m10529c()) {
                c cVar = new c(cls, !next.m10533g());
                if (!hashMap.containsKey(cVar)) {
                    hashMap.put(cVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(cVar);
                if (!set2.isEmpty() && !cVar.f8836b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
                set2.add(bVar3);
            }
        }
    }
}
