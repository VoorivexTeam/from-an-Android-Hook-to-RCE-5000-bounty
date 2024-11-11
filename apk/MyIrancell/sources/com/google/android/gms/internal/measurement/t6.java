package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
final class t6<K, V> implements Iterator<Map.Entry<K, V>> {
    private int b;
    private Iterator<Map.Entry<K, V>> c;
    private final /* synthetic */ r6 d;

    private t6(r6 r6Var) {
        List list;
        this.d = r6Var;
        list = this.d.c;
        this.b = list.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ t6(r6 r6Var, u6 u6Var) {
        this(r6Var);
    }

    private final Iterator<Map.Entry<K, V>> zza() {
        Map map;
        if (this.c == null) {
            map = this.d.g;
            this.c = map.entrySet().iterator();
        }
        return this.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i = this.b;
        if (i > 0) {
            list = this.d.c;
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
            list = this.d.c;
            int i = this.b - 1;
            this.b = i;
            entry = (Map.Entry<K, V>) list.get(i);
        }
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
