package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.p4 */
/* loaded from: classes.dex */
public final class C1420p4 extends AbstractC1210b3<Integer> implements InterfaceC1504v4, InterfaceC1333j6, RandomAccess {

    /* renamed from: e */
    private static final C1420p4 f6831e;

    /* renamed from: c */
    private int[] f6832c;

    /* renamed from: d */
    private int f6833d;

    static {
        C1420p4 c1420p4 = new C1420p4(new int[0], 0);
        f6831e = c1420p4;
        c1420p4.zzb();
    }

    C1420p4() {
        this(new int[10], 0);
    }

    private C1420p4(int[] iArr, int i) {
        this.f6832c = iArr;
        this.f6833d = i;
    }

    /* renamed from: a */
    public static C1420p4 m8175a() {
        return f6831e;
    }

    /* renamed from: e */
    private final void m8176e(int i) {
        if (i < 0 || i >= this.f6833d) {
            throw new IndexOutOfBoundsException(m8177f(i));
        }
    }

    /* renamed from: f */
    private final String m8177f(int i) {
        int i2 = this.f6833d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        m7575b();
        if (i < 0 || i > (i2 = this.f6833d)) {
            throw new IndexOutOfBoundsException(m8177f(i));
        }
        int[] iArr = this.f6832c;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f6832c, i, iArr2, i + 1, this.f6833d - i);
            this.f6832c = iArr2;
        }
        this.f6832c[i] = intValue;
        this.f6833d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1210b3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m8180d(((Integer) obj).intValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1210b3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        m7575b();
        C1448r4.m8290a(collection);
        if (!(collection instanceof C1420p4)) {
            return super.addAll(collection);
        }
        C1420p4 c1420p4 = (C1420p4) collection;
        int i = c1420p4.f6833d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f6833d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f6832c;
        if (i3 > iArr.length) {
            this.f6832c = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c1420p4.f6832c, 0, this.f6832c, this.f6833d, c1420p4.f6833d);
        this.f6833d = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1532x4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final InterfaceC1504v4 mo7796a(int i) {
        if (i >= this.f6833d) {
            return new C1420p4(Arrays.copyOf(this.f6832c, i), this.f6833d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public final int m8179c(int i) {
        m8176e(i);
        return this.f6832c[i];
    }

    /* renamed from: d */
    public final void m8180d(int i) {
        m7575b();
        int i2 = this.f6833d;
        int[] iArr = this.f6832c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f6832c = iArr2;
        }
        int[] iArr3 = this.f6832c;
        int i3 = this.f6833d;
        this.f6833d = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1210b3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1420p4)) {
            return super.equals(obj);
        }
        C1420p4 c1420p4 = (C1420p4) obj;
        if (this.f6833d != c1420p4.f6833d) {
            return false;
        }
        int[] iArr = c1420p4.f6832c;
        for (int i = 0; i < this.f6833d; i++) {
            if (this.f6832c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(m8179c(i));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1210b3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f6833d; i2++) {
            i = (i * 31) + this.f6832c[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m7575b();
        m8176e(i);
        int[] iArr = this.f6832c;
        int i2 = iArr[i];
        if (i < this.f6833d - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f6833d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1210b3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m7575b();
        for (int i = 0; i < this.f6833d; i++) {
            if (obj.equals(Integer.valueOf(this.f6832c[i]))) {
                int[] iArr = this.f6832c;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f6833d - i) - 1);
                this.f6833d--;
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
        int[] iArr = this.f6832c;
        System.arraycopy(iArr, i2, iArr, i, this.f6833d - i2);
        this.f6833d -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        m7575b();
        m8176e(i);
        int[] iArr = this.f6832c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6833d;
    }
}
