package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.measurement.m7 */
/* loaded from: classes.dex */
final class C1379m7 implements ListIterator<String> {

    /* renamed from: b */
    private ListIterator<String> f6748b;

    /* renamed from: c */
    private final /* synthetic */ int f6749c;

    /* renamed from: d */
    private final /* synthetic */ C1334j7 f6750d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1379m7(C1334j7 c1334j7, int i) {
        InterfaceC1302h5 interfaceC1302h5;
        this.f6750d = c1334j7;
        this.f6749c = i;
        interfaceC1302h5 = this.f6750d.f6673b;
        this.f6748b = interfaceC1302h5.listIterator(this.f6749c);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f6748b.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f6748b.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f6748b.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f6748b.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.f6748b.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f6748b.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
