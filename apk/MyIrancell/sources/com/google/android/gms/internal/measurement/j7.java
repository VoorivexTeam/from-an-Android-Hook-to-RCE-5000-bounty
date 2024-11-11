package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class j7 extends AbstractList<String> implements h5, RandomAccess {
    private final h5 b;

    public j7(h5 h5Var) {
        this.b = h5Var;
    }

    @Override // com.google.android.gms.internal.measurement.h5
    public final List<?> a() {
        return this.b.a();
    }

    @Override // com.google.android.gms.internal.measurement.h5
    public final void a(h3 h3Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.h5
    public final Object b(int i) {
        return this.b.b(i);
    }

    @Override // com.google.android.gms.internal.measurement.h5
    public final h5 c() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.b.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new l7(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new m7(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }
}
