package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.c5 */
/* loaded from: classes.dex */
final class C1227c5<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: b */
    private Iterator<Map.Entry<K, Object>> f6545b;

    public C1227c5(Iterator<Map.Entry<K, Object>> it) {
        this.f6545b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6545b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.f6545b.next();
        return next.getValue() instanceof C1212b5 ? new C1242d5(next) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f6545b.remove();
    }
}
