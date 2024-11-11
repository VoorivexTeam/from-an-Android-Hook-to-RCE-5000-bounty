package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class e5 extends b3<String> implements h5, RandomAccess {
    private static final e5 d;
    private final List<Object> c;

    static {
        e5 e5Var = new e5();
        d = e5Var;
        e5Var.zzb();
    }

    public e5() {
        this(10);
    }

    public e5(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    private e5(ArrayList<Object> arrayList) {
        this.c = arrayList;
    }

    private static String a(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof h3 ? ((h3) obj).zzb() : r4.b((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.measurement.x4
    public final /* synthetic */ x4 a(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.c);
        return new e5((ArrayList<Object>) arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.h5
    public final List<?> a() {
        return Collections.unmodifiableList(this.c);
    }

    @Override // com.google.android.gms.internal.measurement.h5
    public final void a(h3 h3Var) {
        b();
        this.c.add(h3Var);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        b();
        this.c.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.b3, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        b();
        if (collection instanceof h5) {
            collection = ((h5) collection).a();
        }
        boolean addAll = this.c.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.measurement.b3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.measurement.h5
    public final Object b(int i) {
        return this.c.get(i);
    }

    @Override // com.google.android.gms.internal.measurement.h5
    public final h5 c() {
        return zza() ? new j7(this) : this;
    }

    @Override // com.google.android.gms.internal.measurement.b3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        Object obj = this.c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof h3) {
            h3 h3Var = (h3) obj;
            String zzb = h3Var.zzb();
            if (h3Var.b()) {
                this.c.set(i, zzb);
            }
            return zzb;
        }
        byte[] bArr = (byte[]) obj;
        String b = r4.b(bArr);
        if (r4.a(bArr)) {
            this.c.set(i, b);
        }
        return b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        b();
        Object remove = this.c.remove(i);
        ((AbstractList) this).modCount++;
        return a(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        b();
        return a(this.c.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }
}
