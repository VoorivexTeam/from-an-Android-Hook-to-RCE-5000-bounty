package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: h0 */
/* loaded from: classes.dex */
public abstract class AbstractC2533h0<K, V> {

    /* renamed from: a */
    AbstractC2533h0<K, V>.b f10349a;

    /* renamed from: b */
    AbstractC2533h0<K, V>.c f10350b;

    /* renamed from: c */
    AbstractC2533h0<K, V>.e f10351c;

    /* renamed from: h0$a */
    /* loaded from: classes.dex */
    final class a<T> implements Iterator<T> {

        /* renamed from: b */
        final int f10352b;

        /* renamed from: c */
        int f10353c;

        /* renamed from: d */
        int f10354d;

        /* renamed from: e */
        boolean f10355e = false;

        a(int i) {
            this.f10352b = i;
            this.f10353c = AbstractC2533h0.this.mo3515c();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10354d < this.f10353c;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = (T) AbstractC2533h0.this.mo3508a(this.f10354d, this.f10352b);
            this.f10354d++;
            this.f10355e = true;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f10355e) {
                throw new IllegalStateException();
            }
            int i = this.f10354d - 1;
            this.f10354d = i;
            this.f10353c--;
            this.f10355e = false;
            AbstractC2533h0.this.mo3511a(i);
        }
    }

    /* renamed from: h0$b */
    /* loaded from: classes.dex */
    final class b implements Set<Map.Entry<K, V>> {
        b() {
        }

        /* renamed from: a */
        public boolean m12068a(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            m12068a((Map.Entry) obj);
            throw null;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int mo3515c = AbstractC2533h0.this.mo3515c();
            for (Map.Entry<K, V> entry : collection) {
                AbstractC2533h0.this.mo3512a((AbstractC2533h0) entry.getKey(), (K) entry.getValue());
            }
            return mo3515c != AbstractC2533h0.this.mo3515c();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC2533h0.this.mo3510a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int mo3507a = AbstractC2533h0.this.mo3507a(entry.getKey());
            if (mo3507a < 0) {
                return false;
            }
            return C2409e0.m11502a(AbstractC2533h0.this.mo3508a(mo3507a, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC2533h0.m12060a((Set) this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int mo3515c = AbstractC2533h0.this.mo3515c() - 1; mo3515c >= 0; mo3515c--) {
                Object mo3508a = AbstractC2533h0.this.mo3508a(mo3515c, 0);
                Object mo3508a2 = AbstractC2533h0.this.mo3508a(mo3515c, 1);
                i += (mo3508a == null ? 0 : mo3508a.hashCode()) ^ (mo3508a2 == null ? 0 : mo3508a2.hashCode());
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC2533h0.this.mo3515c() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC2533h0.this.mo3515c();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: h0$c */
    /* loaded from: classes.dex */
    final class c implements Set<K> {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC2533h0.this.mo3510a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC2533h0.this.mo3507a(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return AbstractC2533h0.m12059a((Map) AbstractC2533h0.this.mo3514b(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC2533h0.m12060a((Set) this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int mo3515c = AbstractC2533h0.this.mo3515c() - 1; mo3515c >= 0; mo3515c--) {
                Object mo3508a = AbstractC2533h0.this.mo3508a(mo3515c, 0);
                i += mo3508a == null ? 0 : mo3508a.hashCode();
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC2533h0.this.mo3515c() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int mo3507a = AbstractC2533h0.this.mo3507a(obj);
            if (mo3507a < 0) {
                return false;
            }
            AbstractC2533h0.this.mo3511a(mo3507a);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return AbstractC2533h0.m12061b(AbstractC2533h0.this.mo3514b(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return AbstractC2533h0.m12062c(AbstractC2533h0.this.mo3514b(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC2533h0.this.mo3515c();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return AbstractC2533h0.this.m12064b(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC2533h0.this.m12063a(tArr, 0);
        }
    }

    /* renamed from: h0$d */
    /* loaded from: classes.dex */
    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: b */
        int f10359b;

        /* renamed from: d */
        boolean f10361d = false;

        /* renamed from: c */
        int f10360c = -1;

        d() {
            this.f10359b = AbstractC2533h0.this.mo3515c() - 1;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f10361d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return C2409e0.m11502a(entry.getKey(), AbstractC2533h0.this.mo3508a(this.f10360c, 0)) && C2409e0.m11502a(entry.getValue(), AbstractC2533h0.this.mo3508a(this.f10360c, 1));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f10361d) {
                return (K) AbstractC2533h0.this.mo3508a(this.f10360c, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f10361d) {
                return (V) AbstractC2533h0.this.mo3508a(this.f10360c, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10360c < this.f10359b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f10361d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object mo3508a = AbstractC2533h0.this.mo3508a(this.f10360c, 0);
            Object mo3508a2 = AbstractC2533h0.this.mo3508a(this.f10360c, 1);
            return (mo3508a == null ? 0 : mo3508a.hashCode()) ^ (mo3508a2 != null ? mo3508a2.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            next();
            return this;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f10360c++;
            this.f10361d = true;
            return this;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f10361d) {
                throw new IllegalStateException();
            }
            AbstractC2533h0.this.mo3511a(this.f10360c);
            this.f10360c--;
            this.f10359b--;
            this.f10361d = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (this.f10361d) {
                return (V) AbstractC2533h0.this.mo3509a(this.f10360c, (int) v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: h0$e */
    /* loaded from: classes.dex */
    final class e implements Collection<V> {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            AbstractC2533h0.this.mo3510a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC2533h0.this.mo3513b(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return AbstractC2533h0.this.mo3515c() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int mo3513b = AbstractC2533h0.this.mo3513b(obj);
            if (mo3513b < 0) {
                return false;
            }
            AbstractC2533h0.this.mo3511a(mo3513b);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int mo3515c = AbstractC2533h0.this.mo3515c();
            int i = 0;
            boolean z = false;
            while (i < mo3515c) {
                if (collection.contains(AbstractC2533h0.this.mo3508a(i, 1))) {
                    AbstractC2533h0.this.mo3511a(i);
                    i--;
                    mo3515c--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int mo3515c = AbstractC2533h0.this.mo3515c();
            int i = 0;
            boolean z = false;
            while (i < mo3515c) {
                if (!collection.contains(AbstractC2533h0.this.mo3508a(i, 1))) {
                    AbstractC2533h0.this.mo3511a(i);
                    i--;
                    mo3515c--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return AbstractC2533h0.this.mo3515c();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return AbstractC2533h0.this.m12064b(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC2533h0.this.m12063a(tArr, 1);
        }
    }

    /* renamed from: a */
    public static <K, V> boolean m12059a(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static <T> boolean m12060a(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static <K, V> boolean m12061b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    /* renamed from: c */
    public static <K, V> boolean m12062c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: a */
    protected abstract int mo3507a(Object obj);

    /* renamed from: a */
    protected abstract Object mo3508a(int i, int i2);

    /* renamed from: a */
    protected abstract V mo3509a(int i, V v);

    /* renamed from: a */
    protected abstract void mo3510a();

    /* renamed from: a */
    protected abstract void mo3511a(int i);

    /* renamed from: a */
    protected abstract void mo3512a(K k, V v);

    /* renamed from: a */
    public <T> T[] m12063a(T[] tArr, int i) {
        int mo3515c = mo3515c();
        if (tArr.length < mo3515c) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), mo3515c));
        }
        for (int i2 = 0; i2 < mo3515c; i2++) {
            tArr[i2] = mo3508a(i2, i);
        }
        if (tArr.length > mo3515c) {
            tArr[mo3515c] = null;
        }
        return tArr;
    }

    /* renamed from: b */
    protected abstract int mo3513b(Object obj);

    /* renamed from: b */
    protected abstract Map<K, V> mo3514b();

    /* renamed from: b */
    public Object[] m12064b(int i) {
        int mo3515c = mo3515c();
        Object[] objArr = new Object[mo3515c];
        for (int i2 = 0; i2 < mo3515c; i2++) {
            objArr[i2] = mo3508a(i2, i);
        }
        return objArr;
    }

    /* renamed from: c */
    protected abstract int mo3515c();

    /* renamed from: d */
    public Set<Map.Entry<K, V>> m12065d() {
        if (this.f10349a == null) {
            this.f10349a = new b();
        }
        return this.f10349a;
    }

    /* renamed from: e */
    public Set<K> m12066e() {
        if (this.f10350b == null) {
            this.f10350b = new c();
        }
        return this.f10350b;
    }

    /* renamed from: f */
    public Collection<V> m12067f() {
        if (this.f10351c == null) {
            this.f10351c = new e();
        }
        return this.f10351c;
    }
}
