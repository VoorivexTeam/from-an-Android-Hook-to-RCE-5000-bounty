package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.j7 */
/* loaded from: classes.dex */
public final class C1334j7 extends AbstractList<String> implements InterfaceC1302h5, RandomAccess {

    /* renamed from: b */
    private final InterfaceC1302h5 f6673b;

    public C1334j7(InterfaceC1302h5 interfaceC1302h5) {
        this.f6673b = interfaceC1302h5;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1302h5
    /* renamed from: a */
    public final List<?> mo7797a() {
        return this.f6673b.mo7797a();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1302h5
    /* renamed from: a */
    public final void mo7798a(AbstractC1300h3 abstractC1300h3) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1302h5
    /* renamed from: b */
    public final Object mo7799b(int i) {
        return this.f6673b.mo7799b(i);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1302h5
    /* renamed from: c */
    public final InterfaceC1302h5 mo7800c() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.f6673b.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new C1364l7(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new C1379m7(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6673b.size();
    }
}
