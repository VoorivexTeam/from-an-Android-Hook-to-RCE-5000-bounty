package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.l7 */
/* loaded from: classes.dex */
final class C1364l7 implements Iterator<String> {

    /* renamed from: b */
    private Iterator<String> f6718b;

    /* renamed from: c */
    private final /* synthetic */ C1334j7 f6719c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1364l7(C1334j7 c1334j7) {
        InterfaceC1302h5 interfaceC1302h5;
        this.f6719c = c1334j7;
        interfaceC1302h5 = this.f6719c.f6673b;
        this.f6718b = interfaceC1302h5.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6718b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f6718b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
