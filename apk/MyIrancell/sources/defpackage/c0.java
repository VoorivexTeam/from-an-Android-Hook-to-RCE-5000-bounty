package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class c0<K, V> extends i0<K, V> implements Map<K, V> {
    h0<K, V> i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h0<K, V> {
        a() {
        }

        @Override // defpackage.h0
        protected int a(Object obj) {
            return c0.this.a(obj);
        }

        @Override // defpackage.h0
        protected Object a(int i, int i2) {
            return c0.this.c[(i << 1) + i2];
        }

        @Override // defpackage.h0
        protected V a(int i, V v) {
            return c0.this.a(i, (int) v);
        }

        @Override // defpackage.h0
        protected void a() {
            c0.this.clear();
        }

        @Override // defpackage.h0
        protected void a(int i) {
            c0.this.c(i);
        }

        @Override // defpackage.h0
        protected void a(K k, V v) {
            c0.this.put(k, v);
        }

        @Override // defpackage.h0
        protected int b(Object obj) {
            return c0.this.b(obj);
        }

        @Override // defpackage.h0
        protected Map<K, V> b() {
            return c0.this;
        }

        @Override // defpackage.h0
        protected int c() {
            return c0.this.d;
        }
    }

    public c0() {
    }

    public c0(int i) {
        super(i);
    }

    public c0(i0 i0Var) {
        super(i0Var);
    }

    private h0<K, V> b() {
        if (this.i == null) {
            this.i = new a();
        }
        return this.i;
    }

    public boolean a(Collection<?> collection) {
        return h0.c(this, collection);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return b().d();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return b().e();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        a(this.d + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return b().f();
    }
}
