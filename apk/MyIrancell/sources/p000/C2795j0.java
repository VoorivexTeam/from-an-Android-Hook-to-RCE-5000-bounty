package p000;

/* renamed from: j0 */
/* loaded from: classes.dex */
public class C2795j0<E> implements Cloneable {

    /* renamed from: f */
    private static final Object f11380f = new Object();

    /* renamed from: b */
    private boolean f11381b;

    /* renamed from: c */
    private int[] f11382c;

    /* renamed from: d */
    private Object[] f11383d;

    /* renamed from: e */
    private int f11384e;

    public C2795j0() {
        this(10);
    }

    public C2795j0(int i) {
        this.f11381b = false;
        if (i == 0) {
            this.f11382c = C2409e0.f9889a;
            this.f11383d = C2409e0.f9891c;
        } else {
            int m11503b = C2409e0.m11503b(i);
            this.f11382c = new int[m11503b];
            this.f11383d = new Object[m11503b];
        }
        this.f11384e = 0;
    }

    /* renamed from: c */
    private void m13276c() {
        int i = this.f11384e;
        int[] iArr = this.f11382c;
        Object[] objArr = this.f11383d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f11380f) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f11381b = false;
        this.f11384e = i2;
    }

    /* renamed from: a */
    public void m13277a() {
        int i = this.f11384e;
        Object[] objArr = this.f11383d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f11384e = 0;
        this.f11381b = false;
    }

    /* renamed from: a */
    public void m13278a(int i) {
        int m11500a = C2409e0.m11500a(this.f11382c, this.f11384e, i);
        if (m11500a >= 0) {
            Object[] objArr = this.f11383d;
            Object obj = objArr[m11500a];
            Object obj2 = f11380f;
            if (obj != obj2) {
                objArr[m11500a] = obj2;
                this.f11381b = true;
            }
        }
    }

    /* renamed from: a */
    public void m13279a(int i, E e) {
        int i2 = this.f11384e;
        if (i2 != 0 && i <= this.f11382c[i2 - 1]) {
            m13284c(i, e);
            return;
        }
        if (this.f11381b && this.f11384e >= this.f11382c.length) {
            m13276c();
        }
        int i3 = this.f11384e;
        if (i3 >= this.f11382c.length) {
            int m11503b = C2409e0.m11503b(i3 + 1);
            int[] iArr = new int[m11503b];
            Object[] objArr = new Object[m11503b];
            int[] iArr2 = this.f11382c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f11383d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f11382c = iArr;
            this.f11383d = objArr;
        }
        this.f11382c[i3] = i;
        this.f11383d[i3] = e;
        this.f11384e = i3 + 1;
    }

    /* renamed from: b */
    public int m13280b() {
        if (this.f11381b) {
            m13276c();
        }
        return this.f11384e;
    }

    /* renamed from: b */
    public E m13281b(int i) {
        return m13282b(i, null);
    }

    /* renamed from: b */
    public E m13282b(int i, E e) {
        int m11500a = C2409e0.m11500a(this.f11382c, this.f11384e, i);
        if (m11500a >= 0) {
            Object[] objArr = this.f11383d;
            if (objArr[m11500a] != f11380f) {
                return (E) objArr[m11500a];
            }
        }
        return e;
    }

    /* renamed from: c */
    public int m13283c(int i) {
        if (this.f11381b) {
            m13276c();
        }
        return C2409e0.m11500a(this.f11382c, this.f11384e, i);
    }

    /* renamed from: c */
    public void m13284c(int i, E e) {
        int m11500a = C2409e0.m11500a(this.f11382c, this.f11384e, i);
        if (m11500a >= 0) {
            this.f11383d[m11500a] = e;
            return;
        }
        int i2 = m11500a ^ (-1);
        if (i2 < this.f11384e) {
            Object[] objArr = this.f11383d;
            if (objArr[i2] == f11380f) {
                this.f11382c[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f11381b && this.f11384e >= this.f11382c.length) {
            m13276c();
            i2 = C2409e0.m11500a(this.f11382c, this.f11384e, i) ^ (-1);
        }
        int i3 = this.f11384e;
        if (i3 >= this.f11382c.length) {
            int m11503b = C2409e0.m11503b(i3 + 1);
            int[] iArr = new int[m11503b];
            Object[] objArr2 = new Object[m11503b];
            int[] iArr2 = this.f11382c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f11383d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f11382c = iArr;
            this.f11383d = objArr2;
        }
        int i4 = this.f11384e;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.f11382c;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            Object[] objArr4 = this.f11383d;
            System.arraycopy(objArr4, i2, objArr4, i5, this.f11384e - i2);
        }
        this.f11382c[i2] = i;
        this.f11383d[i2] = e;
        this.f11384e++;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public C2795j0<E> m16986clone() {
        try {
            C2795j0<E> c2795j0 = (C2795j0) super.clone();
            c2795j0.f11382c = (int[]) this.f11382c.clone();
            c2795j0.f11383d = (Object[]) this.f11383d.clone();
            return c2795j0;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public int m13285d(int i) {
        if (this.f11381b) {
            m13276c();
        }
        return this.f11382c[i];
    }

    /* renamed from: e */
    public void m13286e(int i) {
        m13278a(i);
    }

    /* renamed from: f */
    public E m13287f(int i) {
        if (this.f11381b) {
            m13276c();
        }
        return (E) this.f11383d[i];
    }

    public String toString() {
        if (m13280b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f11384e * 28);
        sb.append('{');
        for (int i = 0; i < this.f11384e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m13285d(i));
            sb.append('=');
            E m13287f = m13287f(i);
            if (m13287f != this) {
                sb.append(m13287f);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
