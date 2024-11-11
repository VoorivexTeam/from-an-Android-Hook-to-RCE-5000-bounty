package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.l5 */
/* loaded from: classes.dex */
public final class C1362l5 extends AbstractC1210b3<Long> implements InterfaceC1490u4, InterfaceC1333j6, RandomAccess {

    /* renamed from: e */
    private static final C1362l5 f6712e;

    /* renamed from: c */
    private long[] f6713c;

    /* renamed from: d */
    private int f6714d;

    static {
        C1362l5 c1362l5 = new C1362l5(new long[0], 0);
        f6712e = c1362l5;
        c1362l5.zzb();
    }

    C1362l5() {
        this(new long[10], 0);
    }

    private C1362l5(long[] jArr, int i) {
        this.f6713c = jArr;
        this.f6714d = i;
    }

    /* renamed from: a */
    public static C1362l5 m7961a() {
        return f6712e;
    }

    /* renamed from: d */
    private final void m7962d(int i) {
        if (i < 0 || i >= this.f6714d) {
            throw new IndexOutOfBoundsException(m7963e(i));
        }
    }

    /* renamed from: e */
    private final String m7963e(int i) {
        int i2 = this.f6714d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1490u4
    /* renamed from: a */
    public final void mo7964a(long j) {
        m7575b();
        int i = this.f6714d;
        long[] jArr = this.f6713c;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f6713c = jArr2;
        }
        long[] jArr3 = this.f6713c;
        int i2 = this.f6714d;
        this.f6714d = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        m7575b();
        if (i < 0 || i > (i2 = this.f6714d)) {
            throw new IndexOutOfBoundsException(m7963e(i));
        }
        long[] jArr = this.f6713c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f6713c, i, jArr2, i + 1, this.f6714d - i);
            this.f6713c = jArr2;
        }
        this.f6713c[i] = longValue;
        this.f6714d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1210b3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        mo7964a(((Long) obj).longValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1210b3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        m7575b();
        C1448r4.m8290a(collection);
        if (!(collection instanceof C1362l5)) {
            return super.addAll(collection);
        }
        C1362l5 c1362l5 = (C1362l5) collection;
        int i = c1362l5.f6714d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f6714d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f6713c;
        if (i3 > jArr.length) {
            this.f6713c = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(c1362l5.f6713c, 0, this.f6713c, this.f6714d, c1362l5.f6714d);
        this.f6714d = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1490u4
    /* renamed from: b */
    public final long mo7965b(int i) {
        m7962d(i);
        return this.f6713c[i];
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1532x4
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC1490u4 mo7796a(int i) {
        if (i >= this.f6714d) {
            return new C1362l5(Arrays.copyOf(this.f6713c, i), this.f6714d);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1210b3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1362l5)) {
            return super.equals(obj);
        }
        C1362l5 c1362l5 = (C1362l5) obj;
        if (this.f6714d != c1362l5.f6714d) {
            return false;
        }
        long[] jArr = c1362l5.f6713c;
        for (int i = 0; i < this.f6714d; i++) {
            if (this.f6713c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(mo7965b(i));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1210b3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f6714d; i2++) {
            i = (i * 31) + C1448r4.m8288a(this.f6713c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m7575b();
        m7962d(i);
        long[] jArr = this.f6713c;
        long j = jArr[i];
        if (i < this.f6714d - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.f6714d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1210b3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m7575b();
        for (int i = 0; i < this.f6714d; i++) {
            if (obj.equals(Long.valueOf(this.f6713c[i]))) {
                long[] jArr = this.f6713c;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f6714d - i) - 1);
                this.f6714d--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        m7575b();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f6713c;
        System.arraycopy(jArr, i2, jArr, i, this.f6714d - i2);
        this.f6714d -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        m7575b();
        m7962d(i);
        long[] jArr = this.f6713c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6714d;
    }
}
