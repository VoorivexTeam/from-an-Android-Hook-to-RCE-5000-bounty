package p000;

import java.util.HashMap;
import java.util.Map;
import p000.C3229t;

/* renamed from: s */
/* loaded from: classes.dex */
public class C3185s<K, V> extends C3229t<K, V> {

    /* renamed from: f */
    private HashMap<K, C3229t.c<K, V>> f12998f = new HashMap<>();

    @Override // p000.C3229t
    /* renamed from: a */
    protected C3229t.c<K, V> mo15300a(K k) {
        return this.f12998f.get(k);
    }

    @Override // p000.C3229t
    /* renamed from: b */
    public V mo15301b(K k, V v) {
        C3229t.c<K, V> mo15300a = mo15300a(k);
        if (mo15300a != null) {
            return mo15300a.f13157c;
        }
        this.f12998f.put(k, m15462a(k, v));
        return null;
    }

    /* renamed from: b */
    public Map.Entry<K, V> m15302b(K k) {
        if (contains(k)) {
            return this.f12998f.get(k).f13159e;
        }
        return null;
    }

    public boolean contains(K k) {
        return this.f12998f.containsKey(k);
    }

    @Override // p000.C3229t
    public V remove(K k) {
        V v = (V) super.remove(k);
        this.f12998f.remove(k);
        return v;
    }
}
