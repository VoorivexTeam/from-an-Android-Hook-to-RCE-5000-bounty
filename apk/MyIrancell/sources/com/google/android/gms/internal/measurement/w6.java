package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class w6 extends c7 {
    private final /* synthetic */ r6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private w6(r6 r6Var) {
        super(r6Var, null);
        this.c = r6Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ w6(r6 r6Var, u6 u6Var) {
        this(r6Var);
    }

    @Override // com.google.android.gms.internal.measurement.c7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new t6(this.c, null);
    }
}
