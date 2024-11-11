package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.r5 */
/* loaded from: classes.dex */
public final class C1449r5<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: c */
    private static final C1449r5 f6864c;

    /* renamed from: b */
    private boolean f6865b;

    static {
        C1449r5 c1449r5 = new C1449r5();
        f6864c = c1449r5;
        c1449r5.f6865b = false;
    }

    private C1449r5() {
        this.f6865b = true;
    }

    private C1449r5(Map<K, V> map) {
        super(map);
        this.f6865b = true;
    }

    /* renamed from: a */
    private static int m8297a(Object obj) {
        if (obj instanceof byte[]) {
            return C1448r4.m8296c((byte[]) obj);
        }
        if (obj instanceof InterfaceC1434q4) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    /* renamed from: g */
    private final void m8298g() {
        if (!this.f6865b) {
            throw new UnsupportedOperationException();
        }
    }

    public static <K, V> C1449r5<K, V> zza() {
        return f6864c;
    }

    /* renamed from: a */
    public final C1449r5<K, V> m8299a() {
        return isEmpty() ? new C1449r5<>() : new C1449r5<>(this);
    }

    /* renamed from: a */
    public final void m8300a(C1449r5<K, V> c1449r5) {
        m8298g();
        if (c1449r5.isEmpty()) {
            return;
        }
        putAll(c1449r5);
    }

    /* renamed from: b */
    public final void m8301b() {
        this.f6865b = false;
    }

    /* renamed from: c */
    public final boolean m8302c() {
        return this.f6865b;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m8298g();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005c A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L5d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L59
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L16
        L14:
            r7 = 0
            goto L5a
        L16:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L1e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L59
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L35
            goto L14
        L35:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L52
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L52
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L56
        L52:
            boolean r3 = r4.equals(r3)
        L56:
            if (r3 != 0) goto L1e
            goto L14
        L59:
            r7 = 1
        L5a:
            if (r7 == 0) goto L5d
            return r0
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1449r5.equals(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i += m8297a(entry.getValue()) ^ m8297a(entry.getKey());
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        m8298g();
        C1448r4.m8290a(k);
        C1448r4.m8290a(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        m8298g();
        for (K k : map.keySet()) {
            C1448r4.m8290a(k);
            C1448r4.m8290a(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        m8298g();
        return (V) super.remove(obj);
    }
}
