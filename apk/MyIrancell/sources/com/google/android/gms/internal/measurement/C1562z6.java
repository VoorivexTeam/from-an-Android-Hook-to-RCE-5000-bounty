package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.google.android.gms.internal.measurement.z6 */
/* loaded from: classes.dex */
final class C1562z6<K, V> implements Iterator<Map.Entry<K, V>> {

    /* renamed from: b */
    private int f7024b;

    /* renamed from: c */
    private boolean f7025c;

    /* renamed from: d */
    private Iterator<Map.Entry<K, V>> f7026d;

    /* renamed from: e */
    private final /* synthetic */ C1450r6 f7027e;

    private C1562z6(C1450r6 c1450r6) {
        this.f7027e = c1450r6;
        this.f7024b = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1562z6(C1450r6 c1450r6, C1492u6 c1492u6) {
        this(c1450r6);
    }

    private final Iterator<Map.Entry<K, V>> zza() {
        Map map;
        if (this.f7026d == null) {
            map = this.f7027e.f6868d;
            this.f7026d = map.entrySet().iterator();
        }
        return this.f7026d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.f7024b + 1;
        list = this.f7027e.f6867c;
        if (i >= list.size()) {
            map = this.f7027e.f6868d;
            if (map.isEmpty() || !zza().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        Map.Entry<K, V> next;
        List list2;
        this.f7025c = true;
        int i = this.f7024b + 1;
        this.f7024b = i;
        list = this.f7027e.f6867c;
        if (i < list.size()) {
            list2 = this.f7027e.f6867c;
            next = (Map.Entry<K, V>) list2.get(this.f7024b);
        } else {
            next = zza().next();
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.f7025c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f7025c = false;
        this.f7027e.m8311f();
        int i = this.f7024b;
        list = this.f7027e.f6867c;
        if (i >= list.size()) {
            zza().remove();
            return;
        }
        C1450r6 c1450r6 = this.f7027e;
        int i2 = this.f7024b;
        this.f7024b = i2 - 1;
        c1450r6.m8308c(i2);
    }
}
