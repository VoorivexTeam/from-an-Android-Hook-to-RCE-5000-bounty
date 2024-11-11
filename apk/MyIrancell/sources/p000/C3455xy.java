package p000;

import java.util.regex.Pattern;

/* renamed from: xy */
/* loaded from: classes.dex */
public final class C3455xy extends AbstractC2914ly {

    /* renamed from: b */
    private final String f14081b;

    /* renamed from: c */
    private final String f14082c;

    static {
        Pattern.compile(":/*([^/@]+)@[^/]+");
    }

    public C3455xy(String str, String str2) {
        super(EnumC2960my.URI);
        this.f14081b = m16521a(str);
        this.f14082c = str2;
    }

    /* renamed from: a */
    private static String m16521a(String str) {
        String trim = str.trim();
        int indexOf = trim.indexOf(58);
        if (indexOf >= 0 && !m16522a(trim, indexOf)) {
            return trim;
        }
        return "http://" + trim;
    }

    /* renamed from: a */
    private static boolean m16522a(String str, int i) {
        int i2 = i + 1;
        int indexOf = str.indexOf(47, i2);
        if (indexOf < 0) {
            indexOf = str.length();
        }
        return AbstractC3102py.m14845a(str, i2, indexOf - i2);
    }

    @Override // p000.AbstractC2914ly
    /* renamed from: a */
    public String mo3459a() {
        StringBuilder sb = new StringBuilder(30);
        AbstractC2914ly.m13942a(this.f14082c, sb);
        AbstractC2914ly.m13942a(this.f14081b, sb);
        return sb.toString();
    }

    /* renamed from: c */
    public String m16523c() {
        return this.f14081b;
    }
}
