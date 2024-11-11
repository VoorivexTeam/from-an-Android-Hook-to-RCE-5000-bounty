package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.k4 */
/* loaded from: classes.dex */
final class C1346k4 extends AbstractC1210b3<Float> implements InterfaceC1532x4<Float>, InterfaceC1333j6, RandomAccess {

    /* renamed from: c */
    private float[] f6696c;

    /* renamed from: d */
    private int f6697d;

    static {
        new C1346k4(new float[0], 0).zzb();
    }

    C1346k4() {
        this(new float[10], 0);
    }

    private C1346k4(float[] fArr, int i) {
        this.f6696c = fArr;
        this.f6697d = i;
    }

    /* renamed from: b */
    private final void m7950b(int i) {
        if (i < 0 || i >= this.f6697d) {
            throw new IndexOutOfBoundsException(m7951c(i));
        }
    }

    /* renamed from: c */
    private final String m7951c(int i) {
        int i2 = this.f6697d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1532x4
    /* renamed from: a */
    public final /* synthetic */ InterfaceC1532x4<Float> mo7796a(int i) {
        if (i >= this.f6697d) {
            return new C1346k4(Arrays.copyOf(this.f6696c, i), this.f6697d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final void m7952a(float f) {
        m7575b();
        int i = this.f6697d;
        float[] fArr = this.f6696c;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f6696c = fArr2;
        }
        float[] fArr3 = this.f6696c;
        int i2 = this.f6697d;
        this.f6697d = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        m7575b();
        if (i < 0 || i > (i2 = this.f6697d)) {
            throw new IndexOutOfBoundsException(m7951c(i));
        }
        float[] fArr = this.f6696c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f6696c, i, fArr2, i + 1, this.f6697d - i);
            this.f6696c = fArr2;
        }
        this.f6696c[i] = floatValue;
        this.f6697d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1210b3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m7952a(((Float) obj).floatValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1210b3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        m7575b();
        C1448r4.m8290a(collection);
        if (!(collection instanceof C1346k4)) {
            return super.addAll(collection);
        }
        C1346k4 c1346k4 = (C1346k4) collection;
        int i = c1346k4.f6697d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f6697d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f6696c;
        if (i3 > fArr.length) {
            this.f6696c = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(c1346k4.f6696c, 0, this.f6696c, this.f6697d, c1346k4.f6697d);
        this.f6697d = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1210b3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1346k4)) {
            return super.equals(obj);
        }
        C1346k4 c1346k4 = (C1346k4) obj;
        if (this.f6697d != c1346k4.f6697d) {
            return false;
        }
        float[] fArr = c1346k4.f6696c;
        for (int i = 0; i < this.f6697d; i++) {
            if (Float.floatToIntBits(this.f6696c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m7950b(i);
        return Float.valueOf(this.f6696c[i]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1210b3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f6697d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f6696c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m7575b();
        m7950b(i);
        float[] fArr = this.f6696c;
        float f = fArr[i];
        if (i < this.f6697d - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.f6697d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1210b3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m7575b();
        for (int i = 0; i < this.f6697d; i++) {
            if (obj.equals(Float.valueOf(this.f6696c[i]))) {
                float[] fArr = this.f6696c;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f6697d - i) - 1);
                this.f6697d--;
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
        float[] fArr = this.f6696c;
        System.arraycopy(fArr, i2, fArr, i, this.f6697d - i2);
        this.f6697d -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        m7575b();
        m7950b(i);
        float[] fArr = this.f6696c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6697d;
    }
}
