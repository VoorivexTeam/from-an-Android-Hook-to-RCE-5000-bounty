package defpackage;

import defpackage.t;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class s<K, V> extends t<K, V> {
    private HashMap<K, t.c<K, V>> f = new HashMap<>();

    @Override // defpackage.t
    protected t.c<K, V> a(K k) {
        return this.f.get(k);
    }

    @Override // defpackage.t
    public V b(K k, V v) {
        t.c<K, V> a = a(k);
        if (a != null) {
            return a.c;
        }
        this.f.put(k, a(k, v));
        return null;
    }

    public Map.Entry<K, V> b(K k) {
        if (contains(k)) {
            return this.f.get(k).e;
        }
        return null;
    }

    public boolean contains(K k) {
        return this.f.containsKey(k);
    }

    @Override // defpackage.t
    public V remove(K k) {
        V v = (V) super.remove(k);
        this.f.remove(k);
        return v;
    }
}
