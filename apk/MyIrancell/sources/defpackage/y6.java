package defpackage;

/* loaded from: classes.dex */
public class y6 {
    private final float[] a;
    private final int[] b;

    public y6(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public void a(y6 y6Var, y6 y6Var2, float f) {
        if (y6Var.b.length == y6Var2.b.length) {
            for (int i = 0; i < y6Var.b.length; i++) {
                this.a[i] = t9.c(y6Var.a[i], y6Var2.a[i], f);
                this.b[i] = o9.a(f, y6Var.b[i], y6Var2.b[i]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + y6Var.b.length + " vs " + y6Var2.b.length + ")");
    }

    public int[] a() {
        return this.b;
    }

    public float[] b() {
        return this.a;
    }

    public int c() {
        return this.b.length;
    }
}
