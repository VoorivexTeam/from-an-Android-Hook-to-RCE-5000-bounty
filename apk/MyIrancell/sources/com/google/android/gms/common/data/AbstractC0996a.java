package com.google.android.gms.common.data;

import java.util.Iterator;

/* renamed from: com.google.android.gms.common.data.a */
/* loaded from: classes.dex */
public abstract class AbstractC0996a<T> implements InterfaceC0997b<T> {

    /* renamed from: b */
    protected final DataHolder f6068b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0996a(DataHolder dataHolder) {
        this.f6068b = dataHolder;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        mo6938d();
    }

    @Override // com.google.android.gms.common.api.InterfaceC0979j
    /* renamed from: d */
    public void mo6938d() {
        DataHolder dataHolder = this.f6068b;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @Override // com.google.android.gms.common.data.InterfaceC0997b
    public int getCount() {
        DataHolder dataHolder = this.f6068b;
        if (dataHolder == null) {
            return 0;
        }
        return dataHolder.getCount();
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new C0998c(this);
    }
}
