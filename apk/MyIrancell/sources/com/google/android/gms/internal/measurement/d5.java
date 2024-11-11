package com.google.android.gms.internal.measurement;

import java.util.Map;

/* loaded from: classes.dex */
final class d5<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, b5> b;

    private d5(Map.Entry<K, b5> entry) {
        this.b = entry;
    }

    public final b5 a() {
        return this.b.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.b.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.b.getValue() == null) {
            return null;
        }
        b5.c();
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof x5) {
            return this.b.getValue().a((x5) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
