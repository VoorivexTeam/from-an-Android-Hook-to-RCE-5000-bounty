package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.m */
/* loaded from: classes.dex */
public final class C1804m implements Iterator<String> {

    /* renamed from: b */
    private Iterator<String> f7753b;

    /* renamed from: c */
    private final /* synthetic */ zzam f7754c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1804m(zzam zzamVar) {
        Bundle bundle;
        this.f7754c = zzamVar;
        bundle = this.f7754c.f8219b;
        this.f7753b = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7753b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f7753b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
