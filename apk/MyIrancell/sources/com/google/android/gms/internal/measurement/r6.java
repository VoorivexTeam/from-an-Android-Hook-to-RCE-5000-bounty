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
/* loaded from: classes.dex */
public class r6<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int b;
    private List<a7> c;
    private Map<K, V> d;
    private boolean e;
    private volatile c7 f;
    private Map<K, V> g;
    private volatile w6 h;

    private r6(int i) {
        this.b = i;
        this.c = Collections.emptyList();
        this.d = Collections.emptyMap();
        this.g = Collections.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ r6(int i, u6 u6Var) {
        this(i);
    }

    private final int a(K k) {
        int size = this.c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.c.get(size).getKey());
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
            int compareTo2 = k.compareTo((Comparable) this.c.get(i2).getKey());
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
    public static <FieldDescriptorType extends f4<FieldDescriptorType>> r6<FieldDescriptorType, Object> b(int i) {
        return new u6(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V c(int i) {
        f();
        V v = (V) this.c.remove(i).getValue();
        if (!this.d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = g().entrySet().iterator();
            this.c.add(new a7(this, it.next()));
            it.remove();
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        if (this.e) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> g() {
        f();
        if (this.d.isEmpty() && !(this.d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.d = treeMap;
            this.g = treeMap.descendingMap();
        }
        return (SortedMap) this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V a(K k, V v) {
        f();
        int a = a((r6<K, V>) k);
        if (a >= 0) {
            return (V) this.c.get(a).setValue(v);
        }
        f();
        if (this.c.isEmpty() && !(this.c instanceof ArrayList)) {
            this.c = new ArrayList(this.b);
        }
        int i = -(a + 1);
        if (i >= this.b) {
            return g().put(k, v);
        }
        int size = this.c.size();
        int i2 = this.b;
        if (size == i2) {
            a7 remove = this.c.remove(i2 - 1);
            g().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.c.add(i, new a7(this, k, v));
        return null;
    }

    public final Map.Entry<K, V> a(int i) {
        return this.c.get(i);
    }

    public void a() {
        if (this.e) {
            return;
        }
        this.d = this.d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.d);
        this.g = this.g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.g);
        this.e = true;
    }

    public final boolean b() {
        return this.e;
    }

    public final int c() {
        return this.c.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        f();
        if (!this.c.isEmpty()) {
            this.c.clear();
        }
        if (this.d.isEmpty()) {
            return;
        }
        this.d.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a((r6<K, V>) comparable) >= 0 || this.d.containsKey(comparable);
    }

    public final Iterable<Map.Entry<K, V>> d() {
        return this.d.isEmpty() ? v6.a() : this.d.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> e() {
        if (this.h == null) {
            this.h = new w6(this, null);
        }
        return this.h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f == null) {
            this.f = new c7(this, null);
        }
        return this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6)) {
            return super.equals(obj);
        }
        r6 r6Var = (r6) obj;
        int size = size();
        if (size != r6Var.size()) {
            return false;
        }
        int c = c();
        if (c != r6Var.c()) {
            return entrySet().equals(r6Var.entrySet());
        }
        for (int i = 0; i < c; i++) {
            if (!a(i).equals(r6Var.a(i))) {
                return false;
            }
        }
        if (c != size) {
            return this.d.equals(r6Var.d);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a((r6<K, V>) comparable);
        return a >= 0 ? (V) this.c.get(a).getValue() : this.d.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int c = c();
        int i = 0;
        for (int i2 = 0; i2 < c; i2++) {
            i += this.c.get(i2).hashCode();
        }
        return this.d.size() > 0 ? i + this.d.hashCode() : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return a((r6<K, V>) obj, (Comparable) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int a = a((r6<K, V>) comparable);
        if (a >= 0) {
            return (V) c(a);
        }
        if (this.d.isEmpty()) {
            return null;
        }
        return this.d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.c.size() + this.d.size();
    }
}
