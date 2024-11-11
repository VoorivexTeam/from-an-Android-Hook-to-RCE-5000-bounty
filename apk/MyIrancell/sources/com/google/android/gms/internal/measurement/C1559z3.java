package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.z3 */
/* loaded from: classes.dex */
final class C1559z3 extends AbstractC1210b3<Double> implements InterfaceC1532x4<Double>, InterfaceC1333j6, RandomAccess {

    /* renamed from: c */
    private double[] f7022c;

    /* renamed from: d */
    private int f7023d;

    static {
        new C1559z3(new double[0], 0).zzb();
    }

    C1559z3() {
        this(new double[10], 0);
    }

    private C1559z3(double[] dArr, int i) {
        this.f7022c = dArr;
        this.f7023d = i;
    }

    /* renamed from: b */
    private final void m8930b(int i) {
        if (i < 0 || i >= this.f7023d) {
            throw new IndexOutOfBoundsException(m8931c(i));
        }
    }

    /* renamed from: c */
    private final String m8931c(int i) {
        int i2 = this.f7023d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1532x4
    /* renamed from: a */
    public final /* synthetic */ InterfaceC1532x4<Double> mo7796a(int i) {
        if (i >= this.f7023d) {
            return new C1559z3(Arrays.copyOf(this.f7022c, i), this.f7023d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final void m8932a(double d) {
        m7575b();
        int i = this.f7023d;
        double[] dArr = this.f7022c;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f7022c = dArr2;
        }
        double[] dArr3 = this.f7022c;
        int i2 = this.f7023d;
        this.f7023d = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        m7575b();
        if (i < 0 || i > (i2 = this.f7023d)) {
            throw new IndexOutOfBoundsException(m8931c(i));
        }
        double[] dArr = this.f7022c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f7022c, i, dArr2, i + 1, this.f7023d - i);
            this.f7022c = dArr2;
        }
        this.f7022c[i] = doubleValue;
        this.f7023d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1210b3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m8932a(((Double) obj).doubleValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1210b3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        m7575b();
        C1448r4.m8290a(collection);
        if (!(collection instanceof C1559z3)) {
            return super.addAll(collection);
        }
        C1559z3 c1559z3 = (C1559z3) collection;
        int i = c1559z3.f7023d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f7023d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.f7022c;
        if (i3 > dArr.length) {
            this.f7022c = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(c1559z3.f7022c, 0, this.f7022c, this.f7023d, c1559z3.f7023d);
        this.f7023d = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1210b3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1559z3)) {
            return super.equals(obj);
        }
        C1559z3 c1559z3 = (C1559z3) obj;
        if (this.f7023d != c1559z3.f7023d) {
            return false;
        }
        double[] dArr = c1559z3.f7022c;
        for (int i = 0; i < this.f7023d; i++) {
            if (Double.doubleToLongBits(this.f7022c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m8930b(i);
        return Double.valueOf(this.f7022c[i]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1210b3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f7023d; i2++) {
            i = (i * 31) + C1448r4.m8288a(Double.doubleToLongBits(this.f7022c[i2]));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m7575b();
        m8930b(i);
        double[] dArr = this.f7022c;
        double d = dArr[i];
        if (i < this.f7023d - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.f7023d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1210b3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m7575b();
        for (int i = 0; i < this.f7023d; i++) {
            if (obj.equals(Double.valueOf(this.f7022c[i]))) {
                double[] dArr = this.f7022c;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f7023d - i) - 1);
                this.f7023d--;
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
        double[] dArr = this.f7022c;
        System.arraycopy(dArr, i2, dArr, i, this.f7023d - i2);
        this.f7023d -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        m7575b();
        m8930b(i);
        double[] dArr = this.f7022c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7023d;
    }
}
