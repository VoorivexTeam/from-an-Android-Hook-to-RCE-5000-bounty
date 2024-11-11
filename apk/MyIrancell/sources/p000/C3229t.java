package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: t */
/* loaded from: classes.dex */
public class C3229t<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b */
    c<K, V> f13152b;

    /* renamed from: c */
    private c<K, V> f13153c;

    /* renamed from: d */
    private WeakHashMap<f<K, V>, Boolean> f13154d = new WeakHashMap<>();

    /* renamed from: e */
    private int f13155e = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t$a */
    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p000.C3229t.e
        /* renamed from: b */
        c<K, V> mo15467b(c<K, V> cVar) {
            return cVar.f13159e;
        }

        @Override // p000.C3229t.e
        /* renamed from: c */
        c<K, V> mo15468c(c<K, V> cVar) {
            return cVar.f13158d;
        }
    }

    /* renamed from: t$b */
    /* loaded from: classes.dex */
    private static class b<K, V> extends e<K, V> {
        b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p000.C3229t.e
        /* renamed from: b */
        c<K, V> mo15467b(c<K, V> cVar) {
            return cVar.f13158d;
        }

        @Override // p000.C3229t.e
        /* renamed from: c */
        c<K, V> mo15468c(c<K, V> cVar) {
            return cVar.f13159e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t$c */
    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: b */
        final K f13156b;

        /* renamed from: c */
        final V f13157c;

        /* renamed from: d */
        c<K, V> f13158d;

        /* renamed from: e */
        c<K, V> f13159e;

        c(K k, V v) {
            this.f13156b = k;
            this.f13157c = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f13156b.equals(cVar.f13156b) && this.f13157c.equals(cVar.f13157c);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f13156b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f13157c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f13156b.hashCode() ^ this.f13157c.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f13156b + "=" + this.f13157c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t$d */
    /* loaded from: classes.dex */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b */
        private c<K, V> f13160b;

        /* renamed from: c */
        private boolean f13161c = true;

        d() {
        }

        @Override // p000.C3229t.f
        /* renamed from: a */
        public void mo15469a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f13160b;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f13159e;
                this.f13160b = cVar3;
                this.f13161c = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f13161c) {
                return C3229t.this.f13152b != null;
            }
            c<K, V> cVar = this.f13160b;
            return (cVar == null || cVar.f13158d == null) ? false : true;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f13161c) {
                this.f13161c = false;
                cVar = C3229t.this.f13152b;
            } else {
                c<K, V> cVar2 = this.f13160b;
                cVar = cVar2 != null ? cVar2.f13158d : null;
            }
            this.f13160b = cVar;
            return this.f13160b;
        }
    }

    /* renamed from: t$e */
    /* loaded from: classes.dex */
    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b */
        c<K, V> f13163b;

        /* renamed from: c */
        c<K, V> f13164c;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f13163b = cVar2;
            this.f13164c = cVar;
        }

        /* renamed from: a */
        private c<K, V> m15470a() {
            c<K, V> cVar = this.f13164c;
            c<K, V> cVar2 = this.f13163b;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo15468c(cVar);
        }

        @Override // p000.C3229t.f
        /* renamed from: a */
        public void mo15469a(c<K, V> cVar) {
            if (this.f13163b == cVar && cVar == this.f13164c) {
                this.f13164c = null;
                this.f13163b = null;
            }
            c<K, V> cVar2 = this.f13163b;
            if (cVar2 == cVar) {
                this.f13163b = mo15467b(cVar2);
            }
            if (this.f13164c == cVar) {
                this.f13164c = m15470a();
            }
        }

        /* renamed from: b */
        abstract c<K, V> mo15467b(c<K, V> cVar);

        /* renamed from: c */
        abstract c<K, V> mo15468c(c<K, V> cVar);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13164c != null;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f13164c;
            this.f13164c = m15470a();
            return cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t$f */
    /* loaded from: classes.dex */
    public interface f<K, V> {
        /* renamed from: a */
        void mo15469a(c<K, V> cVar);
    }

    /* renamed from: a */
    protected c<K, V> mo15300a(K k) {
        c<K, V> cVar = this.f13152b;
        while (cVar != null && !cVar.f13156b.equals(k)) {
            cVar = cVar.f13158d;
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public c<K, V> m15462a(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.f13155e++;
        c<K, V> cVar2 = this.f13153c;
        if (cVar2 == null) {
            this.f13152b = cVar;
        } else {
            cVar2.f13158d = cVar;
            cVar.f13159e = cVar2;
        }
        this.f13153c = cVar;
        return cVar;
    }

    /* renamed from: b */
    public V mo15301b(K k, V v) {
        c<K, V> mo15300a = mo15300a(k);
        if (mo15300a != null) {
            return mo15300a.f13157c;
        }
        m15462a(k, v);
        return null;
    }

    /* renamed from: b */
    public Iterator<Map.Entry<K, V>> m15463b() {
        b bVar = new b(this.f13153c, this.f13152b);
        this.f13154d.put(bVar, false);
        return bVar;
    }

    /* renamed from: d */
    public Map.Entry<K, V> m15464d() {
        return this.f13152b;
    }

    /* renamed from: e */
    public C3229t<K, V>.d m15465e() {
        C3229t<K, V>.d dVar = new d();
        this.f13154d.put(dVar, false);
        return dVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3229t)) {
            return false;
        }
        C3229t c3229t = (C3229t) obj;
        if (size() != c3229t.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = c3229t.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    /* renamed from: f */
    public Map.Entry<K, V> m15466f() {
        return this.f13153c;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f13152b, this.f13153c);
        this.f13154d.put(aVar, false);
        return aVar;
    }

    public V remove(K k) {
        c<K, V> mo15300a = mo15300a(k);
        if (mo15300a == null) {
            return null;
        }
        this.f13155e--;
        if (!this.f13154d.isEmpty()) {
            Iterator<f<K, V>> it = this.f13154d.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo15469a(mo15300a);
            }
        }
        c<K, V> cVar = mo15300a.f13159e;
        if (cVar != null) {
            cVar.f13158d = mo15300a.f13158d;
        } else {
            this.f13152b = mo15300a.f13158d;
        }
        c<K, V> cVar2 = mo15300a.f13158d;
        if (cVar2 != null) {
            cVar2.f13159e = mo15300a.f13159e;
        } else {
            this.f13153c = mo15300a.f13159e;
        }
        mo15300a.f13158d = null;
        mo15300a.f13159e = null;
        return mo15300a.f13157c;
    }

    public int size() {
        return this.f13155e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
