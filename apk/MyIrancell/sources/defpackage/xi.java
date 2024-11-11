package defpackage;

/* loaded from: classes.dex */
public class xi {
    private int a;
    private int b;
    private String c;

    public String a() {
        if (this.a == 1) {
            return this.c;
        }
        throw new wi(12);
    }

    public void a(int i) {
        this.b = i;
        this.a = 0;
    }

    public void a(String str) {
        this.c = str;
        this.a = 1;
    }

    public int b() {
        if (this.a == 0) {
            return this.b;
        }
        throw new wi(12);
    }

    public int c() {
        return this.a;
    }
}
