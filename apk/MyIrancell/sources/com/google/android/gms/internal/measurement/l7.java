package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: classes.dex */
final class l7 implements Iterator<String> {
    private Iterator<String> b;
    private final /* synthetic */ j7 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l7(j7 j7Var) {
        h5 h5Var;
        this.c = j7Var;
        h5Var = this.c.b;
        this.b = h5Var.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
