package defpackage;

/* loaded from: classes.dex */
public class j0<E> implements Cloneable {
    private static final Object f = new Object();
    private boolean b;
    private int[] c;
    private Object[] d;
    private int e;

    public j0() {
        this(10);
    }

    public j0(int i) {
        this.b = false;
        if (i == 0) {
            this.c = e0.a;
            this.d = e0.c;
        } else {
            int b = e0.b(i);
            this.c = new int[b];
            this.d = new Object[b];
        }
        this.e = 0;
    }

    private void c() {
        int i = this.e;
        int[] iArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
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

    public void a(int i) {
        int a = e0.a(this.c, this.e, i);
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

    public void a(int i, E e) {
        int i2 = this.e;
        if (i2 != 0 && i <= this.c[i2 - 1]) {
            c(i, e);
            return;
        }
        if (this.b && this.e >= this.c.length) {
            c();
        }
        int i3 = this.e;
        if (i3 >= this.c.length) {
            int b = e0.b(i3 + 1);
            int[] iArr = new int[b];
            Object[] objArr = new Object[b];
            int[] iArr2 = this.c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.c = iArr;
            this.d = objArr;
        }
        this.c[i3] = i;
        this.d[i3] = e;
        this.e = i3 + 1;
    }

    public int b() {
        if (this.b) {
            c();
        }
        return this.e;
    }

    public E b(int i) {
        return b(i, null);
    }

    public E b(int i, E e) {
        int a = e0.a(this.c, this.e, i);
        if (a >= 0) {
            Object[] objArr = this.d;
            if (objArr[a] != f) {
                return (E) objArr[a];
            }
        }
        return e;
    }

    public int c(int i) {
        if (this.b) {
            c();
        }
        return e0.a(this.c, this.e, i);
    }

    public void c(int i, E e) {
        int a = e0.a(this.c, this.e, i);
        if (a >= 0) {
            this.d[a] = e;
            return;
        }
        int i2 = a ^ (-1);
        if (i2 < this.e) {
            Object[] objArr = this.d;
            if (objArr[i2] == f) {
                this.c[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.b && this.e >= this.c.length) {
            c();
            i2 = e0.a(this.c, this.e, i) ^ (-1);
        }
        int i3 = this.e;
        if (i3 >= this.c.length) {
            int b = e0.b(i3 + 1);
            int[] iArr = new int[b];
            Object[] objArr2 = new Object[b];
            int[] iArr2 = this.c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.c = iArr;
            this.d = objArr2;
        }
        int i4 = this.e;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.c;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            Object[] objArr4 = this.d;
            System.arraycopy(objArr4, i2, objArr4, i5, this.e - i2);
        }
        this.c[i2] = i;
        this.d[i2] = e;
        this.e++;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public j0<E> m8clone() {
        try {
            j0<E> j0Var = (j0) super.clone();
            j0Var.c = (int[]) this.c.clone();
            j0Var.d = (Object[]) this.d.clone();
            return j0Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public int d(int i) {
        if (this.b) {
            c();
        }
        return this.c[i];
    }

    public void e(int i) {
        a(i);
    }

    public E f(int i) {
        if (this.b) {
            c();
        }
        return (E) this.d[i];
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
            sb.append(d(i));
            sb.append('=');
            E f2 = f(i);
            if (f2 != this) {
                sb.append(f2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
