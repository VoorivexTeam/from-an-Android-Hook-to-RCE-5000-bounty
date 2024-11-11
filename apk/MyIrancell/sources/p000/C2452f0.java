package p000;

/* renamed from: f0 */
/* loaded from: classes.dex */
public class C2452f0<E> implements Cloneable {

    /* renamed from: f */
    private static final Object f10051f = new Object();

    /* renamed from: b */
    private boolean f10052b;

    /* renamed from: c */
    private long[] f10053c;

    /* renamed from: d */
    private Object[] f10054d;

    /* renamed from: e */
    private int f10055e;

    public C2452f0() {
        this(10);
    }

    public C2452f0(int i) {
        this.f10052b = false;
        if (i == 0) {
            this.f10053c = C2409e0.f9890b;
            this.f10054d = C2409e0.f9891c;
        } else {
            int m11504c = C2409e0.m11504c(i);
            this.f10053c = new long[m11504c];
            this.f10054d = new Object[m11504c];
        }
        this.f10055e = 0;
    }

    /* renamed from: c */
    private void m11645c() {
        int i = this.f10055e;
        long[] jArr = this.f10053c;
        Object[] objArr = this.f10054d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f10051f) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f10052b = false;
        this.f10055e = i2;
    }

    /* renamed from: a */
    public long m11646a(int i) {
        if (this.f10052b) {
            m11645c();
        }
        return this.f10053c[i];
    }

    /* renamed from: a */
    public void m11647a() {
        int i = this.f10055e;
        Object[] objArr = this.f10054d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f10055e = 0;
        this.f10052b = false;
    }

    /* renamed from: a */
    public void m11648a(long j, E e) {
        int i = this.f10055e;
        if (i != 0 && j <= this.f10053c[i - 1]) {
            m11656c(j, e);
            return;
        }
        if (this.f10052b && this.f10055e >= this.f10053c.length) {
            m11645c();
        }
        int i2 = this.f10055e;
        if (i2 >= this.f10053c.length) {
            int m11504c = C2409e0.m11504c(i2 + 1);
            long[] jArr = new long[m11504c];
            Object[] objArr = new Object[m11504c];
            long[] jArr2 = this.f10053c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f10054d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f10053c = jArr;
            this.f10054d = objArr;
        }
        this.f10053c[i2] = j;
        this.f10054d[i2] = e;
        this.f10055e = i2 + 1;
    }

    /* renamed from: a */
    public boolean m11649a(long j) {
        return m11657d(j) >= 0;
    }

    /* renamed from: b */
    public int m11650b() {
        if (this.f10052b) {
            m11645c();
        }
        return this.f10055e;
    }

    /* renamed from: b */
    public E m11651b(long j, E e) {
        int m11501a = C2409e0.m11501a(this.f10053c, this.f10055e, j);
        if (m11501a >= 0) {
            Object[] objArr = this.f10054d;
            if (objArr[m11501a] != f10051f) {
                return (E) objArr[m11501a];
            }
        }
        return e;
    }

    /* renamed from: b */
    public void m11652b(int i) {
        Object[] objArr = this.f10054d;
        Object obj = objArr[i];
        Object obj2 = f10051f;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f10052b = true;
        }
    }

    /* renamed from: b */
    public void m11653b(long j) {
        int m11501a = C2409e0.m11501a(this.f10053c, this.f10055e, j);
        if (m11501a >= 0) {
            Object[] objArr = this.f10054d;
            Object obj = objArr[m11501a];
            Object obj2 = f10051f;
            if (obj != obj2) {
                objArr[m11501a] = obj2;
                this.f10052b = true;
            }
        }
    }

    /* renamed from: c */
    public E m11654c(int i) {
        if (this.f10052b) {
            m11645c();
        }
        return (E) this.f10054d[i];
    }

    /* renamed from: c */
    public E m11655c(long j) {
        return m11651b(j, null);
    }

    /* renamed from: c */
    public void m11656c(long j, E e) {
        int m11501a = C2409e0.m11501a(this.f10053c, this.f10055e, j);
        if (m11501a >= 0) {
            this.f10054d[m11501a] = e;
            return;
        }
        int i = m11501a ^ (-1);
        if (i < this.f10055e) {
            Object[] objArr = this.f10054d;
            if (objArr[i] == f10051f) {
                this.f10053c[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f10052b && this.f10055e >= this.f10053c.length) {
            m11645c();
            i = C2409e0.m11501a(this.f10053c, this.f10055e, j) ^ (-1);
        }
        int i2 = this.f10055e;
        if (i2 >= this.f10053c.length) {
            int m11504c = C2409e0.m11504c(i2 + 1);
            long[] jArr = new long[m11504c];
            Object[] objArr2 = new Object[m11504c];
            long[] jArr2 = this.f10053c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f10054d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f10053c = jArr;
            this.f10054d = objArr2;
        }
        int i3 = this.f10055e;
        if (i3 - i != 0) {
            long[] jArr3 = this.f10053c;
            int i4 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
            Object[] objArr4 = this.f10054d;
            System.arraycopy(objArr4, i, objArr4, i4, this.f10055e - i);
        }
        this.f10053c[i] = j;
        this.f10054d[i] = e;
        this.f10055e++;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public C2452f0<E> m16982clone() {
        try {
            C2452f0<E> c2452f0 = (C2452f0) super.clone();
            c2452f0.f10053c = (long[]) this.f10053c.clone();
            c2452f0.f10054d = (Object[]) this.f10054d.clone();
            return c2452f0;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public int m11657d(long j) {
        if (this.f10052b) {
            m11645c();
        }
        return C2409e0.m11501a(this.f10053c, this.f10055e, j);
    }

    public String toString() {
        if (m11650b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f10055e * 28);
        sb.append('{');
        for (int i = 0; i < this.f10055e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m11646a(i));
            sb.append('=');
            E m11654c = m11654c(i);
            if (m11654c != this) {
                sb.append(m11654c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
