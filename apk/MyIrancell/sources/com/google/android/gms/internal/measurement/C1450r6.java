package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.r6 */
/* loaded from: classes.dex */
public class C1450r6<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: b */
    private final int f6866b;

    /* renamed from: c */
    private List<C1199a7> f6867c;

    /* renamed from: d */
    private Map<K, V> f6868d;

    /* renamed from: e */
    private boolean f6869e;

    /* renamed from: f */
    private volatile C1229c7 f6870f;

    /* renamed from: g */
    private Map<K, V> f6871g;

    /* renamed from: h */
    private volatile C1520w6 f6872h;

    private C1450r6(int i) {
        this.f6866b = i;
        this.f6867c = Collections.emptyList();
        this.f6868d = Collections.emptyMap();
        this.f6871g = Collections.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1450r6(int i, C1492u6 c1492u6) {
        this(i);
    }

    /* renamed from: a */
    private final int m8303a(K k) {
        int size = this.f6867c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.f6867c.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) this.f6867c.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i2;
                }
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <FieldDescriptorType extends InterfaceC1271f4<FieldDescriptorType>> C1450r6<FieldDescriptorType, Object> m8306b(int i) {
        return new C1492u6(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final V m8308c(int i) {
        m8311f();
        V v = (V) this.f6867c.remove(i).getValue();
        if (!this.f6868d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m8312g().entrySet().iterator();
            this.f6867c.add(new C1199a7(this, it.next()));
            it.remove();
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final void m8311f() {
        if (this.f6869e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: g */
    private final SortedMap<K, V> m8312g() {
        m8311f();
        if (this.f6868d.isEmpty() && !(this.f6868d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f6868d = treeMap;
            this.f6871g = treeMap.descendingMap();
        }
        return (SortedMap) this.f6868d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final V m8313a(K k, V v) {
        m8311f();
        int m8303a = m8303a((C1450r6<K, V>) k);
        if (m8303a >= 0) {
            return (V) this.f6867c.get(m8303a).setValue(v);
        }
        m8311f();
        if (this.f6867c.isEmpty() && !(this.f6867c instanceof ArrayList)) {
            this.f6867c = new ArrayList(this.f6866b);
        }
        int i = -(m8303a + 1);
        if (i >= this.f6866b) {
            return m8312g().put(k, v);
        }
        int size = this.f6867c.size();
        int i2 = this.f6866b;
        if (size == i2) {
            C1199a7 remove = this.f6867c.remove(i2 - 1);
            m8312g().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.f6867c.add(i, new C1199a7(this, k, v));
        return null;
    }

    /* renamed from: a */
    public final Map.Entry<K, V> m8314a(int i) {
        return this.f6867c.get(i);
    }

    /* renamed from: a */
    public void mo8315a() {
        if (this.f6869e) {
            return;
        }
        this.f6868d = this.f6868d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f6868d);
        this.f6871g = this.f6871g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f6871g);
        this.f6869e = true;
    }

    /* renamed from: b */
    public final boolean m8316b() {
        return this.f6869e;
    }

    /* renamed from: c */
    public final int m8317c() {
        return this.f6867c.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m8311f();
        if (!this.f6867c.isEmpty()) {
            this.f6867c.clear();
        }
        if (this.f6868d.isEmpty()) {
            return;
        }
        this.f6868d.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m8303a((C1450r6<K, V>) comparable) >= 0 || this.f6868d.containsKey(comparable);
    }

    /* renamed from: d */
    public final Iterable<Map.Entry<K, V>> m8318d() {
        return this.f6868d.isEmpty() ? C1506v6.m8614a() : this.f6868d.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final Set<Map.Entry<K, V>> m8319e() {
        if (this.f6872h == null) {
            this.f6872h = new C1520w6(this, null);
        }
        return this.f6872h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f6870f == null) {
            this.f6870f = new C1229c7(this, null);
        }
        return this.f6870f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1450r6)) {
            return super.equals(obj);
        }
        C1450r6 c1450r6 = (C1450r6) obj;
        int size = size();
        if (size != c1450r6.size()) {
            return false;
        }
        int m8317c = m8317c();
        if (m8317c != c1450r6.m8317c()) {
            return entrySet().equals(c1450r6.entrySet());
        }
        for (int i = 0; i < m8317c; i++) {
            if (!m8314a(i).equals(c1450r6.m8314a(i))) {
                return false;
            }
        }
        if (m8317c != size) {
            return this.f6868d.equals(c1450r6.f6868d);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m8303a = m8303a((C1450r6<K, V>) comparable);
        return m8303a >= 0 ? (V) this.f6867c.get(m8303a).getValue() : this.f6868d.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int m8317c = m8317c();
        int i = 0;
        for (int i2 = 0; i2 < m8317c; i2++) {
            i += this.f6867c.get(i2).hashCode();
        }
        return this.f6868d.size() > 0 ? i + this.f6868d.hashCode() : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return m8313a((C1450r6<K, V>) obj, (Comparable) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m8311f();
        Comparable comparable = (Comparable) obj;
        int m8303a = m8303a((C1450r6<K, V>) comparable);
        if (m8303a >= 0) {
            return (V) m8308c(m8303a);
        }
        if (this.f6868d.isEmpty()) {
            return null;
        }
        return this.f6868d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f6867c.size() + this.f6868d.size();
    }
}
