package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class c5<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> b;

    public c5(Iterator<Map.Entry<K, Object>> it) {
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.b.next();
        return next.getValue() instanceof b5 ? new d5(next) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.b.remove();
    }
}
