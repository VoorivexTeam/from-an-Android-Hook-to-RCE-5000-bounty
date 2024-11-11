package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public class c6 {
    private final List<j7> a;
    private final char b;
    private final double c;
    private final String d;
    private final String e;

    public c6(List<j7> list, char c, double d, double d2, String str, String str2) {
        this.a = list;
        this.b = c;
        this.c = d2;
        this.d = str;
        this.e = str2;
    }

    public static int a(char c, String str, String str2) {
        return ((((0 + c) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<j7> a() {
        return this.a;
    }

    public double b() {
        return this.c;
    }

    public int hashCode() {
        return a(this.b, this.e, this.d);
    }
}
