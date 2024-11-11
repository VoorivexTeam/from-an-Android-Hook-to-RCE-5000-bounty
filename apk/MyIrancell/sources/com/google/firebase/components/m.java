package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
class m {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {
        private final d<?> a;
        private final Set<b> b = new HashSet();
        private final Set<b> c = new HashSet();

        b(d<?> dVar) {
            this.a = dVar;
        }

        d<?> a() {
            return this.a;
        }

        void a(b bVar) {
            this.b.add(bVar);
        }

        Set<b> b() {
            return this.b;
        }

        void b(b bVar) {
            this.c.add(bVar);
        }

        void c(b bVar) {
            this.c.remove(bVar);
        }

        boolean c() {
            return this.b.isEmpty();
        }

        boolean d() {
            return this.c.isEmpty();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {
        private final Class<?> a;
        private final boolean b;

        private c(Class<?> cls, boolean z) {
            this.a = cls;
            this.b = z;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.a.equals(this.a) && cVar.b == this.b;
        }

        public int hashCode() {
            return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.b).hashCode();
        }
    }

    private static Set<b> a(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.d()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(List<d<?>> list) {
        Set<b> b2 = b(list);
        Set<b> a2 = a(b2);
        int i = 0;
        while (!a2.isEmpty()) {
            b next = a2.iterator().next();
            a2.remove(next);
            i++;
            for (b bVar : next.b()) {
                bVar.c(next);
                if (bVar.d()) {
                    a2.add(bVar);
                }
            }
        }
        if (i == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : b2) {
            if (!bVar2.d() && !bVar2.c()) {
                arrayList.add(bVar2.a());
            }
        }
        throw new o(arrayList);
    }

    private static Set<b> b(List<d<?>> list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator<d<?>> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (n nVar : bVar.a().a()) {
                            if (nVar.b() && (set = (Set) hashMap.get(new c(nVar.a(), nVar.d()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
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
            d<?> next = it.next();
            b bVar3 = new b(next);
            for (Class<? super Object> cls : next.c()) {
                c cVar = new c(cls, !next.g());
                if (!hashMap.containsKey(cVar)) {
                    hashMap.put(cVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(cVar);
                if (!set2.isEmpty() && !cVar.b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
                set2.add(bVar3);
            }
        }
    }
}
