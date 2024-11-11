package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.InterfaceC2938mc;

/* renamed from: hc */
/* loaded from: classes.dex */
class C2548hc<K extends InterfaceC2938mc, V> {

    /* renamed from: a */
    private final a<K, V> f10466a = new a<>();

    /* renamed from: b */
    private final Map<K, a<K, V>> f10467b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hc$a */
    /* loaded from: classes.dex */
    public static class a<K, V> {

        /* renamed from: a */
        final K f10468a;

        /* renamed from: b */
        private List<V> f10469b;

        /* renamed from: c */
        a<K, V> f10470c;

        /* renamed from: d */
        a<K, V> f10471d;

        a() {
            this(null);
        }

        a(K k) {
            this.f10471d = this;
            this.f10470c = this;
            this.f10468a = k;
        }

        /* renamed from: a */
        public V m12205a() {
            int m12207b = m12207b();
            if (m12207b > 0) {
                return this.f10469b.remove(m12207b - 1);
            }
            return null;
        }

        /* renamed from: a */
        public void m12206a(V v) {
            if (this.f10469b == null) {
                this.f10469b = new ArrayList();
            }
            this.f10469b.add(v);
        }

        /* renamed from: b */
        public int m12207b() {
            List<V> list = this.f10469b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
    }

    /* renamed from: a */
    private void m12198a(a<K, V> aVar) {
        m12200c(aVar);
        a<K, V> aVar2 = this.f10466a;
        aVar.f10471d = aVar2;
        aVar.f10470c = aVar2.f10470c;
        m12201d(aVar);
    }

    /* renamed from: b */
    private void m12199b(a<K, V> aVar) {
        m12200c(aVar);
        a<K, V> aVar2 = this.f10466a;
        aVar.f10471d = aVar2.f10471d;
        aVar.f10470c = aVar2;
        m12201d(aVar);
    }

    /* renamed from: c */
    private static <K, V> void m12200c(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f10471d;
        aVar2.f10470c = aVar.f10470c;
        aVar.f10470c.f10471d = aVar2;
    }

    /* renamed from: d */
    private static <K, V> void m12201d(a<K, V> aVar) {
        aVar.f10470c.f10471d = aVar;
        aVar.f10471d.f10470c = aVar;
    }

    /* renamed from: a */
    public V m12202a() {
        a aVar = this.f10466a;
        while (true) {
            aVar = aVar.f10471d;
            if (aVar.equals(this.f10466a)) {
                return null;
            }
            V v = (V) aVar.m12205a();
            if (v != null) {
                return v;
            }
            m12200c(aVar);
            this.f10467b.remove(aVar.f10468a);
            ((InterfaceC2938mc) aVar.f10468a).mo3657a();
        }
    }

    /* renamed from: a */
    public V m12203a(K k) {
        a<K, V> aVar = this.f10467b.get(k);
        if (aVar == null) {
            aVar = new a<>(k);
            this.f10467b.put(k, aVar);
        } else {
            k.mo3657a();
        }
        m12198a(aVar);
        return aVar.m12205a();
    }

    /* renamed from: a */
    public void m12204a(K k, V v) {
        a<K, V> aVar = this.f10467b.get(k);
        if (aVar == null) {
            aVar = new a<>(k);
            m12199b(aVar);
            this.f10467b.put(k, aVar);
        } else {
            k.mo3657a();
        }
        aVar.m12206a(v);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (a aVar = this.f10466a.f10470c; !aVar.equals(this.f10466a); aVar = aVar.f10470c) {
            z = true;
            sb.append('{');
            sb.append(aVar.f10468a);
            sb.append(':');
            sb.append(aVar.m12207b());
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
