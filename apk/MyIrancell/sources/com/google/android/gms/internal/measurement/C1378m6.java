package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.m6 */
/* loaded from: classes.dex */
final class C1378m6<E> extends AbstractC1210b3<E> implements RandomAccess {

    /* renamed from: e */
    private static final C1378m6<Object> f6745e;

    /* renamed from: c */
    private E[] f6746c;

    /* renamed from: d */
    private int f6747d;

    static {
        C1378m6<Object> c1378m6 = new C1378m6<>(new Object[0], 0);
        f6745e = c1378m6;
        c1378m6.zzb();
    }

    private C1378m6(E[] eArr, int i) {
        this.f6746c = eArr;
        this.f6747d = i;
    }

    /* renamed from: a */
    public static <E> C1378m6<E> m8025a() {
        return (C1378m6<E>) f6745e;
    }

    /* renamed from: b */
    private final void m8026b(int i) {
        if (i < 0 || i >= this.f6747d) {
            throw new IndexOutOfBoundsException(m8027c(i));
        }
    }

    /* renamed from: c */
    private final String m8027c(int i) {
        int i2 = this.f6747d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1532x4
    /* renamed from: a */
    public final /* synthetic */ InterfaceC1532x4 mo7796a(int i) {
        if (i >= this.f6747d) {
            return new C1378m6(Arrays.copyOf(this.f6746c, i), this.f6747d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        m7575b();
        if (i < 0 || i > (i2 = this.f6747d)) {
            throw new IndexOutOfBoundsException(m8027c(i));
        }
        E[] eArr = this.f6746c;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f6746c, i, eArr2, i + 1, this.f6747d - i);
            this.f6746c = eArr2;
        }
        this.f6746c[i] = e;
        this.f6747d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1210b3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        m7575b();
        int i = this.f6747d;
        E[] eArr = this.f6746c;
        if (i == eArr.length) {
            this.f6746c = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f6746c;
        int i2 = this.f6747d;
        this.f6747d = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        m8026b(i);
        return this.f6746c[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i) {
        m7575b();
        m8026b(i);
        E[] eArr = this.f6746c;
        E e = eArr[i];
        if (i < this.f6747d - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (r2 - i) - 1);
        }
        this.f6747d--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        m7575b();
        m8026b(i);
        E[] eArr = this.f6746c;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6747d;
    }
}
