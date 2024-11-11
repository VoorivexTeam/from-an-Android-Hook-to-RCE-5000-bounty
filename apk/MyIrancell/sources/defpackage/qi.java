package defpackage;

import java.util.Vector;

/* loaded from: classes.dex */
public class qi extends yi {
    private int b;
    private int c;
    private Vector<ri> d = new Vector<>();

    public qi(int i) {
        this.a = i;
    }

    public void a(int i) {
        this.c = i;
        this.b = 0;
    }

    public void a(int i, int i2) {
        ri riVar = new ri(i2);
        riVar.a(i);
        this.d.addElement(riVar);
    }

    public void a(String str) {
        this.b = 1;
    }

    public void a(String str, int i) {
        ri riVar = new ri(i);
        riVar.a(str);
        this.d.addElement(riVar);
    }

    public int b() {
        if (this.b == 0) {
            return this.c;
        }
        throw new wi(12);
    }

    public int c() {
        return this.b;
    }

    public Vector<ri> d() {
        return this.d;
    }
}
