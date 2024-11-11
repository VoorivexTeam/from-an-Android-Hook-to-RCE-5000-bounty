package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m implements Iterator<String> {
    private Iterator<String> b;
    private final /* synthetic */ zzam c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(zzam zzamVar) {
        Bundle bundle;
        this.c = zzamVar;
        bundle = this.c.b;
        this.b = bundle.keySet().iterator();
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
        throw new UnsupportedOperationException("Remove not supported");
    }
}
