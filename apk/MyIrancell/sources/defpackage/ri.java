package defpackage;

/* loaded from: classes.dex */
public class ri extends yi {
    private int b;
    private int c;
    private String d;

    public ri(int i) {
        this.a = i;
    }

    public void a(int i) {
        this.c = i;
        this.b = 0;
    }

    public void a(String str) {
        this.d = str;
        this.b = 1;
    }

    public String b() {
        if (this.b == 1) {
            return this.d;
        }
        throw new wi(12);
    }

    public int c() {
        if (this.b == 0) {
            return this.c;
        }
        throw new wi(12);
    }

    public int d() {
        return this.b;
    }
}
