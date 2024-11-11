package p000;

import java.util.Map;

/* renamed from: fy */
/* loaded from: classes.dex */
public final class C2490fy extends AbstractC2914ly {

    /* renamed from: b */
    private final String f10159b;

    /* renamed from: c */
    private final String f10160c;

    /* renamed from: d */
    private final String f10161d;

    /* renamed from: e */
    private final String f10162e;

    /* renamed from: f */
    private final String f10163f;

    /* renamed from: g */
    private final String f10164g;

    /* renamed from: h */
    private final String f10165h;

    /* renamed from: i */
    private final String f10166i;

    /* renamed from: j */
    private final String f10167j;

    /* renamed from: k */
    private final String f10168k;

    /* renamed from: l */
    private final String f10169l;

    /* renamed from: m */
    private final String f10170m;

    /* renamed from: n */
    private final String f10171n;

    /* renamed from: o */
    private final Map<String, String> f10172o;

    public C2490fy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Map<String, String> map) {
        super(EnumC2960my.PRODUCT);
        this.f10159b = str;
        this.f10160c = str2;
        this.f10161d = str3;
        this.f10162e = str4;
        this.f10163f = str5;
        this.f10164g = str7;
        this.f10165h = str8;
        this.f10166i = str9;
        this.f10167j = str10;
        this.f10168k = str11;
        this.f10169l = str12;
        this.f10170m = str13;
        this.f10171n = str14;
        this.f10172o = map;
    }

    /* renamed from: a */
    private static int m11845a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: a */
    private static boolean m11846a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // p000.AbstractC2914ly
    /* renamed from: a */
    public String mo3459a() {
        return String.valueOf(this.f10159b);
    }

    /* renamed from: c */
    public String m11847c() {
        return this.f10159b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2490fy)) {
            return false;
        }
        C2490fy c2490fy = (C2490fy) obj;
        return m11846a(this.f10160c, c2490fy.f10160c) && m11846a(this.f10161d, c2490fy.f10161d) && m11846a(this.f10162e, c2490fy.f10162e) && m11846a(this.f10163f, c2490fy.f10163f) && m11846a(this.f10164g, c2490fy.f10164g) && m11846a(this.f10165h, c2490fy.f10165h) && m11846a(this.f10166i, c2490fy.f10166i) && m11846a(this.f10167j, c2490fy.f10167j) && m11846a(this.f10168k, c2490fy.f10168k) && m11846a(this.f10169l, c2490fy.f10169l) && m11846a(this.f10170m, c2490fy.f10170m) && m11846a(this.f10171n, c2490fy.f10171n) && m11846a(this.f10172o, c2490fy.f10172o);
    }

    public int hashCode() {
        return ((((((((((((m11845a(this.f10160c) ^ 0) ^ m11845a(this.f10161d)) ^ m11845a(this.f10162e)) ^ m11845a(this.f10163f)) ^ m11845a(this.f10164g)) ^ m11845a(this.f10165h)) ^ m11845a(this.f10166i)) ^ m11845a(this.f10167j)) ^ m11845a(this.f10168k)) ^ m11845a(this.f10169l)) ^ m11845a(this.f10170m)) ^ m11845a(this.f10171n)) ^ m11845a(this.f10172o);
    }
}
