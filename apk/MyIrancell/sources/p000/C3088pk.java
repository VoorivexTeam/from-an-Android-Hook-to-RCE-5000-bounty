package p000;

import p000.AbstractC2946mk;

/* renamed from: pk */
/* loaded from: classes.dex */
final class C3088pk extends AbstractC2946mk {

    /* renamed from: a */
    private final int f12612a;

    /* renamed from: b */
    private final String f12613b;

    /* renamed from: c */
    private final String f12614c;

    /* renamed from: d */
    private final String f12615d;

    /* renamed from: e */
    private final String f12616e;

    /* renamed from: f */
    private final String f12617f;

    /* renamed from: g */
    private final String f12618g;

    /* renamed from: h */
    private final String f12619h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pk$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC2946mk.a {

        /* renamed from: a */
        private Integer f12620a;

        /* renamed from: b */
        private String f12621b;

        /* renamed from: c */
        private String f12622c;

        /* renamed from: d */
        private String f12623d;

        /* renamed from: e */
        private String f12624e;

        /* renamed from: f */
        private String f12625f;

        /* renamed from: g */
        private String f12626g;

        /* renamed from: h */
        private String f12627h;

        @Override // p000.AbstractC2946mk.a
        /* renamed from: a */
        public AbstractC2946mk.a mo14161a(int i) {
            this.f12620a = Integer.valueOf(i);
            return this;
        }

        @Override // p000.AbstractC2946mk.a
        /* renamed from: a */
        public AbstractC2946mk.a mo14162a(String str) {
            this.f12623d = str;
            return this;
        }

        @Override // p000.AbstractC2946mk.a
        /* renamed from: a */
        public AbstractC2946mk mo14163a() {
            String str = "";
            if (this.f12620a == null) {
                str = " sdkVersion";
            }
            if (str.isEmpty()) {
                return new C3088pk(this.f12620a.intValue(), this.f12621b, this.f12622c, this.f12623d, this.f12624e, this.f12625f, this.f12626g, this.f12627h, null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.AbstractC2946mk.a
        /* renamed from: b */
        public AbstractC2946mk.a mo14164b(String str) {
            this.f12627h = str;
            return this;
        }

        @Override // p000.AbstractC2946mk.a
        /* renamed from: c */
        public AbstractC2946mk.a mo14165c(String str) {
            this.f12622c = str;
            return this;
        }

        @Override // p000.AbstractC2946mk.a
        /* renamed from: d */
        public AbstractC2946mk.a mo14166d(String str) {
            this.f12626g = str;
            return this;
        }

        @Override // p000.AbstractC2946mk.a
        /* renamed from: e */
        public AbstractC2946mk.a mo14167e(String str) {
            this.f12621b = str;
            return this;
        }

        @Override // p000.AbstractC2946mk.a
        /* renamed from: f */
        public AbstractC2946mk.a mo14168f(String str) {
            this.f12625f = str;
            return this;
        }

        @Override // p000.AbstractC2946mk.a
        /* renamed from: g */
        public AbstractC2946mk.a mo14169g(String str) {
            this.f12624e = str;
            return this;
        }
    }

    /* synthetic */ C3088pk(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, a aVar) {
        this.f12612a = i;
        this.f12613b = str;
        this.f12614c = str2;
        this.f12615d = str3;
        this.f12616e = str4;
        this.f12617f = str5;
        this.f12618g = str6;
        this.f12619h = str7;
    }

    /* renamed from: b */
    public String m14793b() {
        return this.f12615d;
    }

    /* renamed from: c */
    public String m14794c() {
        return this.f12619h;
    }

    /* renamed from: d */
    public String m14795d() {
        return this.f12614c;
    }

    /* renamed from: e */
    public String m14796e() {
        return this.f12618g;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2946mk)) {
            return false;
        }
        C3088pk c3088pk = (C3088pk) ((AbstractC2946mk) obj);
        if (this.f12612a == c3088pk.f12612a && ((str = this.f12613b) != null ? str.equals(c3088pk.f12613b) : c3088pk.f12613b == null) && ((str2 = this.f12614c) != null ? str2.equals(c3088pk.f12614c) : c3088pk.f12614c == null) && ((str3 = this.f12615d) != null ? str3.equals(c3088pk.f12615d) : c3088pk.f12615d == null) && ((str4 = this.f12616e) != null ? str4.equals(c3088pk.f12616e) : c3088pk.f12616e == null) && ((str5 = this.f12617f) != null ? str5.equals(c3088pk.f12617f) : c3088pk.f12617f == null) && ((str6 = this.f12618g) != null ? str6.equals(c3088pk.f12618g) : c3088pk.f12618g == null)) {
            String str7 = this.f12619h;
            String str8 = c3088pk.f12619h;
            if (str7 == null) {
                if (str8 == null) {
                    return true;
                }
            } else if (str7.equals(str8)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public String m14797f() {
        return this.f12613b;
    }

    /* renamed from: g */
    public String m14798g() {
        return this.f12617f;
    }

    /* renamed from: h */
    public String m14799h() {
        return this.f12616e;
    }

    public int hashCode() {
        int i = (this.f12612a ^ 1000003) * 1000003;
        String str = this.f12613b;
        int hashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f12614c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f12615d;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f12616e;
        int hashCode4 = (hashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f12617f;
        int hashCode5 = (hashCode4 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f12618g;
        int hashCode6 = (hashCode5 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f12619h;
        return hashCode6 ^ (str7 != null ? str7.hashCode() : 0);
    }

    /* renamed from: i */
    public int m14800i() {
        return this.f12612a;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.f12612a + ", model=" + this.f12613b + ", hardware=" + this.f12614c + ", device=" + this.f12615d + ", product=" + this.f12616e + ", osBuild=" + this.f12617f + ", manufacturer=" + this.f12618g + ", fingerprint=" + this.f12619h + "}";
    }
}
