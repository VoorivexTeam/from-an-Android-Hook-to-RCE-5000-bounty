package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.u;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class c<T> implements Iterator<T> {
    protected final b<T> b;
    protected int c;

    public c(b<T> bVar) {
        u.a(bVar);
        this.b = bVar;
        this.c = -1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.c < this.b.getCount() - 1;
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            b<T> bVar = this.b;
            int i = this.c + 1;
            this.c = i;
            return bVar.get(i);
        }
        int i2 = this.c;
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
