package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: c0 */
/* loaded from: classes.dex */
public class C0500c0<K, V> extends C2573i0<K, V> implements Map<K, V> {

    /* renamed from: i */
    AbstractC2533h0<K, V> f2890i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c0$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC2533h0<K, V> {
        a() {
        }

        @Override // p000.AbstractC2533h0
        /* renamed from: a */
        protected int mo3507a(Object obj) {
            return C0500c0.this.m12306a(obj);
        }

        @Override // p000.AbstractC2533h0
        /* renamed from: a */
        protected Object mo3508a(int i, int i2) {
            return C0500c0.this.f10539c[(i << 1) + i2];
        }

        @Override // p000.AbstractC2533h0
        /* renamed from: a */
        protected V mo3509a(int i, V v) {
            return C0500c0.this.mo3396a(i, (int) v);
        }

        @Override // p000.AbstractC2533h0
        /* renamed from: a */
        protected void mo3510a() {
            C0500c0.this.clear();
        }

        @Override // p000.AbstractC2533h0
        /* renamed from: a */
        protected void mo3511a(int i) {
            C0500c0.this.mo3398c(i);
        }

        @Override // p000.AbstractC2533h0
        /* renamed from: a */
        protected void mo3512a(K k, V v) {
            C0500c0.this.put(k, v);
        }

        @Override // p000.AbstractC2533h0
        /* renamed from: b */
        protected int mo3513b(Object obj) {
            return C0500c0.this.m12309b(obj);
        }

        @Override // p000.AbstractC2533h0
        /* renamed from: b */
        protected Map<K, V> mo3514b() {
            return C0500c0.this;
        }

        @Override // p000.AbstractC2533h0
        /* renamed from: c */
        protected int mo3515c() {
            return C0500c0.this.f10540d;
        }
    }

    public C0500c0() {
    }

    public C0500c0(int i) {
        super(i);
    }

    public C0500c0(C2573i0 c2573i0) {
        super(c2573i0);
    }

    /* renamed from: b */
    private AbstractC2533h0<K, V> m3505b() {
        if (this.f2890i == null) {
            this.f2890i = new a();
        }
        return this.f2890i;
    }

    /* renamed from: a */
    public boolean m3506a(Collection<?> collection) {
        return AbstractC2533h0.m12062c(this, collection);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m3505b().m12065d();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m3505b().m12066e();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m12308a(this.f10540d + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return m3505b().m12067f();
    }
}
