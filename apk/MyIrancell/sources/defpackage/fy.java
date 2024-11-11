package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class fy extends ly {
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;
    private final String n;
    private final Map<String, String> o;

    public fy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Map<String, String> map) {
        super(my.PRODUCT);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = str12;
        this.m = str13;
        this.n = str14;
        this.o = map;
    }

    private static int a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // defpackage.ly
    public String a() {
        return String.valueOf(this.b);
    }

    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof fy)) {
            return false;
        }
        fy fyVar = (fy) obj;
        return a(this.c, fyVar.c) && a(this.d, fyVar.d) && a(this.e, fyVar.e) && a(this.f, fyVar.f) && a(this.g, fyVar.g) && a(this.h, fyVar.h) && a(this.i, fyVar.i) && a(this.j, fyVar.j) && a(this.k, fyVar.k) && a(this.l, fyVar.l) && a(this.m, fyVar.m) && a(this.n, fyVar.n) && a(this.o, fyVar.o);
    }

    public int hashCode() {
        return ((((((((((((a(this.c) ^ 0) ^ a(this.d)) ^ a(this.e)) ^ a(this.f)) ^ a(this.g)) ^ a(this.h)) ^ a(this.i)) ^ a(this.j)) ^ a(this.k)) ^ a(this.l)) ^ a(this.m)) ^ a(this.n)) ^ a(this.o);
    }
}
