package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.f3 */
/* loaded from: classes.dex */
final class C1270f3 extends AbstractC1210b3<Boolean> implements InterfaceC1532x4<Boolean>, InterfaceC1333j6, RandomAccess {

    /* renamed from: c */
    private boolean[] f6611c;

    /* renamed from: d */
    private int f6612d;

    static {
        new C1270f3(new boolean[0], 0).zzb();
    }

    C1270f3() {
        this(new boolean[10], 0);
    }

    private C1270f3(boolean[] zArr, int i) {
        this.f6611c = zArr;
        this.f6612d = i;
    }

    /* renamed from: b */
    private final void m7819b(int i) {
        if (i < 0 || i >= this.f6612d) {
            throw new IndexOutOfBoundsException(m7820c(i));
        }
    }

    /* renamed from: c */
    private final String m7820c(int i) {
        int i2 = this.f6612d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1532x4
    /* renamed from: a */
    public final /* synthetic */ InterfaceC1532x4<Boolean> mo7796a(int i) {
        if (i >= this.f6612d) {
            return new C1270f3(Arrays.copyOf(this.f6611c, i), this.f6612d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final void m7821a(boolean z) {
        m7575b();
        int i = this.f6612d;
        boolean[] zArr = this.f6611c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f6611c = zArr2;
        }
        boolean[] zArr3 = this.f6611c;
        int i2 = this.f6612d;
        this.f6612d = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m7575b();
        if (i < 0 || i > (i2 = this.f6612d)) {
            throw new IndexOutOfBoundsException(m7820c(i));
        }
        boolean[] zArr = this.f6611c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f6611c, i, zArr2, i + 1, this.f6612d - i);
            this.f6611c = zArr2;
        }
        this.f6611c[i] = booleanValue;
        this.f6612d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1210b3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m7821a(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1210b3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        m7575b();
        C1448r4.m8290a(collection);
        if (!(collection instanceof C1270f3)) {
            return super.addAll(collection);
        }
        C1270f3 c1270f3 = (C1270f3) collection;
        int i = c1270f3.f6612d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f6612d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f6611c;
        if (i3 > zArr.length) {
            this.f6611c = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(c1270f3.f6611c, 0, this.f6611c, this.f6612d, c1270f3.f6612d);
        this.f6612d = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1210b3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1270f3)) {
            return super.equals(obj);
        }
        C1270f3 c1270f3 = (C1270f3) obj;
        if (this.f6612d != c1270f3.f6612d) {
            return false;
        }
        boolean[] zArr = c1270f3.f6611c;
        for (int i = 0; i < this.f6612d; i++) {
            if (this.f6611c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m7819b(i);
        return Boolean.valueOf(this.f6611c[i]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1210b3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f6612d; i2++) {
            i = (i * 31) + C1448r4.m8289a(this.f6611c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m7575b();
        m7819b(i);
        boolean[] zArr = this.f6611c;
        boolean z = zArr[i];
        if (i < this.f6612d - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.f6612d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1210b3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m7575b();
        for (int i = 0; i < this.f6612d; i++) {
            if (obj.equals(Boolean.valueOf(this.f6611c[i]))) {
                boolean[] zArr = this.f6611c;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f6612d - i) - 1);
                this.f6612d--;
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
        boolean[] zArr = this.f6611c;
        System.arraycopy(zArr, i2, zArr, i, this.f6612d - i2);
        this.f6612d -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m7575b();
        m7819b(i);
        boolean[] zArr = this.f6611c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6612d;
    }
}
