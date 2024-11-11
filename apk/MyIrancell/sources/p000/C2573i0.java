package p000;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: i0 */
/* loaded from: classes.dex */
public class C2573i0<K, V> {

    /* renamed from: e */
    static Object[] f10534e;

    /* renamed from: f */
    static int f10535f;

    /* renamed from: g */
    static Object[] f10536g;

    /* renamed from: h */
    static int f10537h;

    /* renamed from: b */
    int[] f10538b;

    /* renamed from: c */
    Object[] f10539c;

    /* renamed from: d */
    int f10540d;

    public C2573i0() {
        this.f10538b = C2409e0.f9889a;
        this.f10539c = C2409e0.f9891c;
        this.f10540d = 0;
    }

    public C2573i0(int i) {
        if (i == 0) {
            this.f10538b = C2409e0.f9889a;
            this.f10539c = C2409e0.f9891c;
        } else {
            m12304e(i);
        }
        this.f10540d = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2573i0(C2573i0<K, V> c2573i0) {
        this();
        if (c2573i0 != 0) {
            mo3397a((C2573i0) c2573i0);
        }
    }

    /* renamed from: a */
    private static int m12302a(int[] iArr, int i, int i2) {
        try {
            return C2409e0.m11500a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    private static void m12303a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0500c0.class) {
                if (f10537h < 10) {
                    objArr[0] = f10536g;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f10536g = objArr;
                    f10537h++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0500c0.class) {
                if (f10535f < 10) {
                    objArr[0] = f10534e;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f10534e = objArr;
                    f10535f++;
                }
            }
        }
    }

    /* renamed from: e */
    private void m12304e(int i) {
        if (i == 8) {
            synchronized (C0500c0.class) {
                if (f10536g != null) {
                    Object[] objArr = f10536g;
                    this.f10539c = objArr;
                    f10536g = (Object[]) objArr[0];
                    this.f10538b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f10537h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0500c0.class) {
                if (f10534e != null) {
                    Object[] objArr2 = f10534e;
                    this.f10539c = objArr2;
                    f10534e = (Object[]) objArr2[0];
                    this.f10538b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f10535f--;
                    return;
                }
            }
        }
        this.f10538b = new int[i];
        this.f10539c = new Object[i << 1];
    }

    /* renamed from: a */
    int m12305a() {
        int i = this.f10540d;
        if (i == 0) {
            return -1;
        }
        int m12302a = m12302a(this.f10538b, i, 0);
        if (m12302a < 0 || this.f10539c[m12302a << 1] == null) {
            return m12302a;
        }
        int i2 = m12302a + 1;
        while (i2 < i && this.f10538b[i2] == 0) {
            if (this.f10539c[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = m12302a - 1; i3 >= 0 && this.f10538b[i3] == 0; i3--) {
            if (this.f10539c[i3 << 1] == null) {
                return i3;
            }
        }
        return i2 ^ (-1);
    }

    /* renamed from: a */
    public int m12306a(Object obj) {
        return obj == null ? m12305a() : m12307a(obj, obj.hashCode());
    }

    /* renamed from: a */
    int m12307a(Object obj, int i) {
        int i2 = this.f10540d;
        if (i2 == 0) {
            return -1;
        }
        int m12302a = m12302a(this.f10538b, i2, i);
        if (m12302a < 0 || obj.equals(this.f10539c[m12302a << 1])) {
            return m12302a;
        }
        int i3 = m12302a + 1;
        while (i3 < i2 && this.f10538b[i3] == i) {
            if (obj.equals(this.f10539c[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = m12302a - 1; i4 >= 0 && this.f10538b[i4] == i; i4--) {
            if (obj.equals(this.f10539c[i4 << 1])) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    /* renamed from: a */
    public V mo3396a(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f10539c;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    /* renamed from: a */
    public void m12308a(int i) {
        int i2 = this.f10540d;
        int[] iArr = this.f10538b;
        if (iArr.length < i) {
            Object[] objArr = this.f10539c;
            m12304e(i);
            if (this.f10540d > 0) {
                System.arraycopy(iArr, 0, this.f10538b, 0, i2);
                System.arraycopy(objArr, 0, this.f10539c, 0, i2 << 1);
            }
            m12303a(iArr, objArr, i2);
        }
        if (this.f10540d != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    public void mo3397a(C2573i0<? extends K, ? extends V> c2573i0) {
        int i = c2573i0.f10540d;
        m12308a(this.f10540d + i);
        if (this.f10540d != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(c2573i0.m12310b(i2), c2573i0.m12311d(i2));
            }
        } else if (i > 0) {
            System.arraycopy(c2573i0.f10538b, 0, this.f10538b, 0, i);
            System.arraycopy(c2573i0.f10539c, 0, this.f10539c, 0, i << 1);
            this.f10540d = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m12309b(Object obj) {
        int i = this.f10540d * 2;
        Object[] objArr = this.f10539c;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public K m12310b(int i) {
        return (K) this.f10539c[i << 1];
    }

    /* renamed from: c */
    public V mo3398c(int i) {
        Object[] objArr = this.f10539c;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.f10540d;
        int i4 = 0;
        if (i3 <= 1) {
            m12303a(this.f10538b, objArr, i3);
            this.f10538b = C2409e0.f9889a;
            this.f10539c = C2409e0.f9891c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f10538b;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int[] iArr2 = this.f10538b;
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr2, i6, iArr2, i, i7);
                    Object[] objArr2 = this.f10539c;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.f10539c;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                int i9 = i3 > 8 ? i3 + (i3 >> 1) : 8;
                int[] iArr3 = this.f10538b;
                Object[] objArr4 = this.f10539c;
                m12304e(i9);
                if (i3 != this.f10540d) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.f10538b, 0, i);
                    System.arraycopy(objArr4, 0, this.f10539c, 0, i2);
                }
                if (i < i5) {
                    int i10 = i + 1;
                    int i11 = i5 - i;
                    System.arraycopy(iArr3, i10, this.f10538b, i, i11);
                    System.arraycopy(objArr4, i10 << 1, this.f10539c, i2, i11 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 != this.f10540d) {
            throw new ConcurrentModificationException();
        }
        this.f10540d = i4;
        return v;
    }

    public void clear() {
        int i = this.f10540d;
        if (i > 0) {
            int[] iArr = this.f10538b;
            Object[] objArr = this.f10539c;
            this.f10538b = C2409e0.f9889a;
            this.f10539c = C2409e0.f9891c;
            this.f10540d = 0;
            m12303a(iArr, objArr, i);
        }
        if (this.f10540d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m12306a(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m12309b(obj) >= 0;
    }

    /* renamed from: d */
    public V m12311d(int i) {
        return (V) this.f10539c[(i << 1) + 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2573i0) {
            C2573i0 c2573i0 = (C2573i0) obj;
            if (size() != c2573i0.size()) {
                return false;
            }
            for (int i = 0; i < this.f10540d; i++) {
                try {
                    K m12310b = m12310b(i);
                    V m12311d = m12311d(i);
                    Object obj2 = c2573i0.get(m12310b);
                    if (m12311d == null) {
                        if (obj2 != null || !c2573i0.containsKey(m12310b)) {
                            return false;
                        }
                    } else if (!m12311d.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f10540d; i2++) {
                try {
                    K m12310b2 = m12310b(i2);
                    V m12311d2 = m12311d(i2);
                    Object obj3 = map.get(m12310b2);
                    if (m12311d2 == null) {
                        if (obj3 != null || !map.containsKey(m12310b2)) {
                            return false;
                        }
                    } else if (!m12311d2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        int m12306a = m12306a(obj);
        if (m12306a >= 0) {
            return (V) this.f10539c[(m12306a << 1) + 1];
        }
        return null;
    }

    public int hashCode() {
        int[] iArr = this.f10538b;
        Object[] objArr = this.f10539c;
        int i = this.f10540d;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public boolean isEmpty() {
        return this.f10540d <= 0;
    }

    public V put(K k, V v) {
        int i;
        int m12307a;
        int i2 = this.f10540d;
        if (k == null) {
            m12307a = m12305a();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            m12307a = m12307a(k, hashCode);
        }
        if (m12307a >= 0) {
            int i3 = (m12307a << 1) + 1;
            Object[] objArr = this.f10539c;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = m12307a ^ (-1);
        if (i2 >= this.f10538b.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            int[] iArr = this.f10538b;
            Object[] objArr2 = this.f10539c;
            m12304e(i5);
            if (i2 != this.f10540d) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f10538b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f10539c, 0, objArr2.length);
            }
            m12303a(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f10538b;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f10539c;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f10540d - i4) << 1);
        }
        int i7 = this.f10540d;
        if (i2 == i7) {
            int[] iArr4 = this.f10538b;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f10539c;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.f10540d = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V remove(Object obj) {
        int m12306a = m12306a(obj);
        if (m12306a >= 0) {
            return mo3398c(m12306a);
        }
        return null;
    }

    public int size() {
        return this.f10540d;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f10540d * 28);
        sb.append('{');
        for (int i = 0; i < this.f10540d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K m12310b = m12310b(i);
            if (m12310b != this) {
                sb.append(m12310b);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V m12311d = m12311d(i);
            if (m12311d != this) {
                sb.append(m12311d);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
