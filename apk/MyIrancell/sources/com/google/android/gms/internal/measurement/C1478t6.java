package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.google.android.gms.internal.measurement.t6 */
/* loaded from: classes.dex */
final class C1478t6<K, V> implements Iterator<Map.Entry<K, V>> {

    /* renamed from: b */
    private int f6907b;

    /* renamed from: c */
    private Iterator<Map.Entry<K, V>> f6908c;

    /* renamed from: d */
    private final /* synthetic */ C1450r6 f6909d;

    private C1478t6(C1450r6 c1450r6) {
        List list;
        this.f6909d = c1450r6;
        list = this.f6909d.f6867c;
        this.f6907b = list.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1478t6(C1450r6 c1450r6, C1492u6 c1492u6) {
        this(c1450r6);
    }

    private final Iterator<Map.Entry<K, V>> zza() {
        Map map;
        if (this.f6908c == null) {
            map = this.f6909d.f6871g;
            this.f6908c = map.entrySet().iterator();
        }
        return this.f6908c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i = this.f6907b;
        if (i > 0) {
            list = this.f6909d.f6867c;
            if (i <= list.size()) {
                return true;
            }
        }
        return zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        Map.Entry<K, V> entry;
        if (zza().hasNext()) {
            entry = zza().next();
        } else {
            list = this.f6909d.f6867c;
            int i = this.f6907b - 1;
            this.f6907b = i;
            entry = (Map.Entry<K, V>) list.get(i);
        }
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
