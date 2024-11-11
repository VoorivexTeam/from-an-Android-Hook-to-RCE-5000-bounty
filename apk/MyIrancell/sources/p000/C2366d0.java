package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: d0 */
/* loaded from: classes.dex */
public final class C2366d0<E> implements Collection<E>, Set<E> {

    /* renamed from: f */
    private static final int[] f9616f = new int[0];

    /* renamed from: g */
    private static final Object[] f9617g = new Object[0];

    /* renamed from: h */
    private static Object[] f9618h;

    /* renamed from: i */
    private static int f9619i;

    /* renamed from: j */
    private static Object[] f9620j;

    /* renamed from: k */
    private static int f9621k;

    /* renamed from: b */
    private int[] f9622b;

    /* renamed from: c */
    Object[] f9623c;

    /* renamed from: d */
    int f9624d;

    /* renamed from: e */
    private AbstractC2533h0<E, E> f9625e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d0$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC2533h0<E, E> {
        a() {
        }

        @Override // p000.AbstractC2533h0
        /* renamed from: a */
        protected int mo3507a(Object obj) {
            return C2366d0.this.indexOf(obj);
        }

        @Override // p000.AbstractC2533h0
        /* renamed from: a */
        protected Object mo3508a(int i, int i2) {
            return C2366d0.this.f9623c[i];
        }

        @Override // p000.AbstractC2533h0
        /* renamed from: a */
        protected E mo3509a(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // p000.AbstractC2533h0
        /* renamed from: a */
        protected void mo3510a() {
            C2366d0.this.clear();
        }

        @Override // p000.AbstractC2533h0
        /* renamed from: a */
        protected void mo3511a(int i) {
            C2366d0.this.m11228e(i);
        }

        @Override // p000.AbstractC2533h0
        /* renamed from: a */
        protected void mo3512a(E e, E e2) {
            C2366d0.this.add(e);
        }

        @Override // p000.AbstractC2533h0
        /* renamed from: b */
        protected int mo3513b(Object obj) {
            return C2366d0.this.indexOf(obj);
        }

        @Override // p000.AbstractC2533h0
        /* renamed from: b */
        protected Map<E, E> mo3514b() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // p000.AbstractC2533h0
        /* renamed from: c */
        protected int mo3515c() {
            return C2366d0.this.f9624d;
        }
    }

    public C2366d0() {
        this(0);
    }

    public C2366d0(int i) {
        if (i == 0) {
            this.f9622b = f9616f;
            this.f9623c = f9617g;
        } else {
            m11226g(i);
        }
        this.f9624d = 0;
    }

    /* renamed from: a */
    private int m11222a(Object obj, int i) {
        int i2 = this.f9624d;
        if (i2 == 0) {
            return -1;
        }
        int m11500a = C2409e0.m11500a(this.f9622b, i2, i);
        if (m11500a < 0 || obj.equals(this.f9623c[m11500a])) {
            return m11500a;
        }
        int i3 = m11500a + 1;
        while (i3 < i2 && this.f9622b[i3] == i) {
            if (obj.equals(this.f9623c[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = m11500a - 1; i4 >= 0 && this.f9622b[i4] == i; i4--) {
            if (obj.equals(this.f9623c[i4])) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    /* renamed from: a */
    private static void m11223a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C2366d0.class) {
                if (f9621k < 10) {
                    objArr[0] = f9620j;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f9620j = objArr;
                    f9621k++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C2366d0.class) {
                if (f9619i < 10) {
                    objArr[0] = f9618h;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f9618h = objArr;
                    f9619i++;
                }
            }
        }
    }

    /* renamed from: b */
    private AbstractC2533h0<E, E> m11224b() {
        if (this.f9625e == null) {
            this.f9625e = new a();
        }
        return this.f9625e;
    }

    /* renamed from: d */
    private int m11225d() {
        int i = this.f9624d;
        if (i == 0) {
            return -1;
        }
        int m11500a = C2409e0.m11500a(this.f9622b, i, 0);
        if (m11500a < 0 || this.f9623c[m11500a] == null) {
            return m11500a;
        }
        int i2 = m11500a + 1;
        while (i2 < i && this.f9622b[i2] == 0) {
            if (this.f9623c[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = m11500a - 1; i3 >= 0 && this.f9622b[i3] == 0; i3--) {
            if (this.f9623c[i3] == null) {
                return i3;
            }
        }
        return i2 ^ (-1);
    }

    /* renamed from: g */
    private void m11226g(int i) {
        if (i == 8) {
            synchronized (C2366d0.class) {
                if (f9620j != null) {
                    Object[] objArr = f9620j;
                    this.f9623c = objArr;
                    f9620j = (Object[]) objArr[0];
                    this.f9622b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f9621k--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C2366d0.class) {
                if (f9618h != null) {
                    Object[] objArr2 = f9618h;
                    this.f9623c = objArr2;
                    f9618h = (Object[]) objArr2[0];
                    this.f9622b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f9619i--;
                    return;
                }
            }
        }
        this.f9622b = new int[i];
        this.f9623c = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int m11222a;
        if (e == null) {
            m11222a = m11225d();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            m11222a = m11222a(e, hashCode);
        }
        if (m11222a >= 0) {
            return false;
        }
        int i2 = m11222a ^ (-1);
        int i3 = this.f9624d;
        if (i3 >= this.f9622b.length) {
            int i4 = 4;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i4 = 8;
            }
            int[] iArr = this.f9622b;
            Object[] objArr = this.f9623c;
            m11226g(i4);
            int[] iArr2 = this.f9622b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f9623c, 0, objArr.length);
            }
            m11223a(iArr, objArr, this.f9624d);
        }
        int i5 = this.f9624d;
        if (i2 < i5) {
            int[] iArr3 = this.f9622b;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.f9623c;
            System.arraycopy(objArr2, i2, objArr2, i6, this.f9624d - i2);
        }
        this.f9622b[i2] = i;
        this.f9623c[i2] = e;
        this.f9624d++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        m11227d(this.f9624d + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f9624d;
        if (i != 0) {
            m11223a(this.f9622b, this.f9623c, i);
            this.f9622b = f9616f;
            this.f9623c = f9617g;
            this.f9624d = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public void m11227d(int i) {
        int[] iArr = this.f9622b;
        if (iArr.length < i) {
            Object[] objArr = this.f9623c;
            m11226g(i);
            int i2 = this.f9624d;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f9622b, 0, i2);
                System.arraycopy(objArr, 0, this.f9623c, 0, this.f9624d);
            }
            m11223a(iArr, objArr, this.f9624d);
        }
    }

    /* renamed from: e */
    public E m11228e(int i) {
        Object[] objArr = this.f9623c;
        E e = (E) objArr[i];
        int i2 = this.f9624d;
        if (i2 <= 1) {
            m11223a(this.f9622b, objArr, i2);
            this.f9622b = f9616f;
            this.f9623c = f9617g;
            this.f9624d = 0;
        } else {
            int[] iArr = this.f9622b;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i3 = this.f9624d - 1;
                this.f9624d = i3;
                if (i < i3) {
                    int[] iArr2 = this.f9622b;
                    int i4 = i + 1;
                    System.arraycopy(iArr2, i4, iArr2, i, i3 - i);
                    Object[] objArr2 = this.f9623c;
                    System.arraycopy(objArr2, i4, objArr2, i, this.f9624d - i);
                }
                this.f9623c[this.f9624d] = null;
            } else {
                int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
                int[] iArr3 = this.f9622b;
                Object[] objArr3 = this.f9623c;
                m11226g(i5);
                this.f9624d--;
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.f9622b, 0, i);
                    System.arraycopy(objArr3, 0, this.f9623c, 0, i);
                }
                int i6 = this.f9624d;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr3, i7, this.f9622b, i, i6 - i);
                    System.arraycopy(objArr3, i7, this.f9623c, i, this.f9624d - i);
                }
            }
        }
        return e;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f9624d; i++) {
                try {
                    if (!set.contains(m11229f(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public E m11229f(int i) {
        return (E) this.f9623c[i];
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f9622b;
        int i = this.f9624d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public int indexOf(Object obj) {
        return obj == null ? m11225d() : m11222a(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f9624d <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return m11224b().m12066e().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        m11228e(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f9624d - 1; i >= 0; i--) {
            if (!collection.contains(this.f9623c[i])) {
                m11228e(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f9624d;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.f9624d;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f9623c, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f9624d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f9624d));
        }
        System.arraycopy(this.f9623c, 0, tArr, 0, this.f9624d);
        int length = tArr.length;
        int i = this.f9624d;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f9624d * 14);
        sb.append('{');
        for (int i = 0; i < this.f9624d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E m11229f = m11229f(i);
            if (m11229f != this) {
                sb.append(m11229f);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
