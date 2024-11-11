package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class xy extends ly {
    private final String b;
    private final String c;

    static {
        Pattern.compile(":/*([^/@]+)@[^/]+");
    }

    public xy(String str, String str2) {
        super(my.URI);
        this.b = a(str);
        this.c = str2;
    }

    private static String a(String str) {
        String trim = str.trim();
        int indexOf = trim.indexOf(58);
        if (indexOf >= 0 && !a(trim, indexOf)) {
            return trim;
        }
        return "http://" + trim;
    }

    private static boolean a(String str, int i) {
        int i2 = i + 1;
        int indexOf = str.indexOf(47, i2);
        if (indexOf < 0) {
            indexOf = str.length();
        }
        return py.a(str, i2, indexOf - i2);
    }

    @Override // defpackage.ly
    public String a() {
        StringBuilder sb = new StringBuilder(30);
        ly.a(this.c, sb);
        ly.a(this.b, sb);
        return sb.toString();
    }

    public String c() {
        return this.b;
    }
}
