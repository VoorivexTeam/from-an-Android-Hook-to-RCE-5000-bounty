package com.google.android.gms.internal.measurement;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.d5 */
/* loaded from: classes.dex */
final class C1242d5<K> implements Map.Entry<K, Object> {

    /* renamed from: b */
    private Map.Entry<K, C1212b5> f6565b;

    private C1242d5(Map.Entry<K, C1212b5> entry) {
        this.f6565b = entry;
    }

    /* renamed from: a */
    public final C1212b5 m7766a() {
        return this.f6565b.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f6565b.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f6565b.getValue() == null) {
            return null;
        }
        C1212b5.m7583c();
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof InterfaceC1533x5) {
            return this.f6565b.getValue().m7829a((InterfaceC1533x5) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
