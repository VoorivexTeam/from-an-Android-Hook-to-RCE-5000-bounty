package defpackage;

/* loaded from: classes.dex */
public class y9 {
    private float a;
    private float b;

    public y9() {
        this(1.0f, 1.0f);
    }

    public y9(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public float a() {
        return this.a;
    }

    public boolean a(float f, float f2) {
        return this.a == f && this.b == f2;
    }

    public float b() {
        return this.b;
    }

    public void b(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public String toString() {
        return a() + "x" + b();
    }
}
