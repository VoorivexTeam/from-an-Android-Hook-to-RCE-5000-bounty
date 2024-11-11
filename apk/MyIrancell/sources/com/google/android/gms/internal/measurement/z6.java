package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
final class z6<K, V> implements Iterator<Map.Entry<K, V>> {
    private int b;
    private boolean c;
    private Iterator<Map.Entry<K, V>> d;
    private final /* synthetic */ r6 e;

    private z6(r6 r6Var) {
        this.e = r6Var;
        this.b = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ z6(r6 r6Var, u6 u6Var) {
        this(r6Var);
    }

    private final Iterator<Map.Entry<K, V>> zza() {
        Map map;
        if (this.d == null) {
            map = this.e.d;
            this.d = map.entrySet().iterator();
        }
        return this.d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.b + 1;
        list = this.e.c;
        if (i >= list.size()) {
            map = this.e.d;
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
        this.c = true;
        int i = this.b + 1;
        this.b = i;
        list = this.e.c;
        if (i < list.size()) {
            list2 = this.e.c;
            next = (Map.Entry<K, V>) list2.get(this.b);
        } else {
            next = zza().next();
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.c = false;
        this.e.f();
        int i = this.b;
        list = this.e.c;
        if (i >= list.size()) {
            zza().remove();
            return;
        }
        r6 r6Var = this.e;
        int i2 = this.b;
        this.b = i2 - 1;
        r6Var.c(i2);
    }
}
