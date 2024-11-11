package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.e5 */
/* loaded from: classes.dex */
public final class C1257e5 extends AbstractC1210b3<String> implements InterfaceC1302h5, RandomAccess {

    /* renamed from: d */
    private static final C1257e5 f6597d;

    /* renamed from: c */
    private final List<Object> f6598c;

    static {
        C1257e5 c1257e5 = new C1257e5();
        f6597d = c1257e5;
        c1257e5.zzb();
    }

    public C1257e5() {
        this(10);
    }

    public C1257e5(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    private C1257e5(ArrayList<Object> arrayList) {
        this.f6598c = arrayList;
    }

    /* renamed from: a */
    private static String m7795a(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC1300h3 ? ((AbstractC1300h3) obj).zzb() : C1448r4.m8295b((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1532x4
    /* renamed from: a */
    public final /* synthetic */ InterfaceC1532x4 mo7796a(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.f6598c);
        return new C1257e5((ArrayList<Object>) arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1302h5
    /* renamed from: a */
    public final List<?> mo7797a() {
        return Collections.unmodifiableList(this.f6598c);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1302h5
    /* renamed from: a */
    public final void mo7798a(AbstractC1300h3 abstractC1300h3) {
        m7575b();
        this.f6598c.add(abstractC1300h3);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        m7575b();
        this.f6598c.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1210b3, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        m7575b();
        if (collection instanceof InterfaceC1302h5) {
            collection = ((InterfaceC1302h5) collection).mo7797a();
        }
        boolean addAll = this.f6598c.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1210b3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1302h5
    /* renamed from: b */
    public final Object mo7799b(int i) {
        return this.f6598c.get(i);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1302h5
    /* renamed from: c */
    public final InterfaceC1302h5 mo7800c() {
        return zza() ? new C1334j7(this) : this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1210b3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m7575b();
        this.f6598c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        Object obj = this.f6598c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC1300h3) {
            AbstractC1300h3 abstractC1300h3 = (AbstractC1300h3) obj;
            String zzb = abstractC1300h3.zzb();
            if (abstractC1300h3.mo7880b()) {
                this.f6598c.set(i, zzb);
            }
            return zzb;
        }
        byte[] bArr = (byte[]) obj;
        String m8295b = C1448r4.m8295b(bArr);
        if (C1448r4.m8294a(bArr)) {
            this.f6598c.set(i, m8295b);
        }
        return m8295b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m7575b();
        Object remove = this.f6598c.remove(i);
        ((AbstractList) this).modCount++;
        return m7795a(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        m7575b();
        return m7795a(this.f6598c.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6598c.size();
    }
}
