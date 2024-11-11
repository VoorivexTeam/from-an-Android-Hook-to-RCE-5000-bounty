package com.google.android.gms.common.data;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class a<T> implements b<T> {
    protected final DataHolder b;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(DataHolder dataHolder) {
        this.b = dataHolder;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d();
    }

    @Override // com.google.android.gms.common.api.j
    public void d() {
        DataHolder dataHolder = this.b;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @Override // com.google.android.gms.common.data.b
    public int getCount() {
        DataHolder dataHolder = this.b;
        if (dataHolder == null) {
            return 0;
        }
        return dataHolder.getCount();
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new c(this);
    }
}
