package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.C1057u;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.common.data.c */
/* loaded from: classes.dex */
public class C0998c<T> implements Iterator<T> {

    /* renamed from: b */
    protected final InterfaceC0997b<T> f6069b;

    /* renamed from: c */
    protected int f6070c;

    public C0998c(InterfaceC0997b<T> interfaceC0997b) {
        C1057u.m7286a(interfaceC0997b);
        this.f6069b = interfaceC0997b;
        this.f6070c = -1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6070c < this.f6069b.getCount() - 1;
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            InterfaceC0997b<T> interfaceC0997b = this.f6069b;
            int i = this.f6070c + 1;
            this.f6070c = i;
            return interfaceC0997b.get(i);
        }
        int i2 = this.f6070c;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Cannot advance the iterator beyond ");
        sb.append(i2);
        throw new NoSuchElementException(sb.toString());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
