package defpackage;

/* loaded from: classes.dex */
public class f0<E> implements Cloneable {
    private static final Object f = new Object();
    private boolean b;
    private long[] c;
    private Object[] d;
    private int e;

    public f0() {
        this(10);
    }

    public f0(int i) {
        this.b = false;
        if (i == 0) {
            this.c = e0.b;
            this.d = e0.c;
        } else {
            int c = e0.c(i);
            this.c = new long[c];
            this.d = new Object[c];
        }
        this.e = 0;
    }

    private void c() {
        int i = this.e;
        long[] jArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    public long a(int i) {
        if (this.b) {
            c();
        }
        return this.c[i];
    }

    public void a() {
        int i = this.e;
        Object[] objArr = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.b = false;
    }

    public void a(long j, E e) {
        int i = this.e;
        if (i != 0 && j <= this.c[i - 1]) {
            c(j, e);
            return;
        }
        if (this.b && this.e >= this.c.length) {
            c();
        }
        int i2 = this.e;
        if (i2 >= this.c.length) {
            int c = e0.c(i2 + 1);
            long[] jArr = new long[c];
            Object[] objArr = new Object[c];
            long[] jArr2 = this.c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.c = jArr;
            this.d = objArr;
        }
        this.c[i2] = j;
        this.d[i2] = e;
        this.e = i2 + 1;
    }

    public boolean a(long j) {
        return d(j) >= 0;
    }

    public int b() {
        if (this.b) {
            c();
        }
        return this.e;
    }

    public E b(long j, E e) {
        int a = e0.a(this.c, this.e, j);
        if (a >= 0) {
            Object[] objArr = this.d;
            if (objArr[a] != f) {
                return (E) objArr[a];
            }
        }
        return e;
    }

    public void b(int i) {
        Object[] objArr = this.d;
        Object obj = objArr[i];
        Object obj2 = f;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.b = true;
        }
    }

    public void b(long j) {
        int a = e0.a(this.c, this.e, j);
        if (a >= 0) {
            Object[] objArr = this.d;
            Object obj = objArr[a];
            Object obj2 = f;
            if (obj != obj2) {
                objArr[a] = obj2;
                this.b = true;
            }
        }
    }

    public E c(int i) {
        if (this.b) {
            c();
        }
        return (E) this.d[i];
    }

    public E c(long j) {
        return b(j, null);
    }

    public void c(long j, E e) {
        int a = e0.a(this.c, this.e, j);
        if (a >= 0) {
            this.d[a] = e;
            return;
        }
        int i = a ^ (-1);
        if (i < this.e) {
            Object[] objArr = this.d;
            if (objArr[i] == f) {
                this.c[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.b && this.e >= this.c.length) {
            c();
            i = e0.a(this.c, this.e, j) ^ (-1);
        }
        int i2 = this.e;
        if (i2 >= this.c.length) {
            int c = e0.c(i2 + 1);
            long[] jArr = new long[c];
            Object[] objArr2 = new Object[c];
            long[] jArr2 = this.c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.c = jArr;
            this.d = objArr2;
        }
        int i3 = this.e;
        if (i3 - i != 0) {
            long[] jArr3 = this.c;
            int i4 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
            Object[] objArr4 = this.d;
            System.arraycopy(objArr4, i, objArr4, i4, this.e - i);
        }
        this.c[i] = j;
        this.d[i] = e;
        this.e++;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public f0<E> m4clone() {
        try {
            f0<E> f0Var = (f0) super.clone();
            f0Var.c = (long[]) this.c.clone();
            f0Var.d = (Object[]) this.d.clone();
            return f0Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public int d(long j) {
        if (this.b) {
            c();
        }
        return e0.a(this.c, this.e, j);
    }

    public String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(a(i));
            sb.append('=');
            E c = c(i);
            if (c != this) {
                sb.append(c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
