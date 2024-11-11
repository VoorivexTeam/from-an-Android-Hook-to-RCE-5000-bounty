package defpackage;

/* loaded from: classes.dex */
public final class c10 {
    private final int a;
    private final int[] b;
    private final hw[] c;

    public c10(int i, int[] iArr, int i2, int i3, int i4) {
        this.a = i;
        this.b = iArr;
        float f = i4;
        this.c = new hw[]{new hw(i2, f), new hw(i3, f)};
    }

    public hw[] a() {
        return this.c;
    }

    public int[] b() {
        return this.b;
    }

    public int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c10) && this.a == ((c10) obj).a;
    }

    public int hashCode() {
        return this.a;
    }
}
