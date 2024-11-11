package p000;

import java.util.List;
import p000.AbstractC2393dl;

/* renamed from: tk */
/* loaded from: classes.dex */
final class C3265tk extends AbstractC2393dl {

    /* renamed from: a */
    private final long f13322a;

    /* renamed from: b */
    private final long f13323b;

    /* renamed from: c */
    private final AbstractC3490yk f13324c;

    /* renamed from: d */
    private final int f13325d;

    /* renamed from: e */
    private final String f13326e;

    /* renamed from: f */
    private final List<AbstractC0484bl> f13327f;

    /* renamed from: g */
    private final EnumC2992nk f13328g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: tk$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC2393dl.a {

        /* renamed from: a */
        private Long f13329a;

        /* renamed from: b */
        private Long f13330b;

        /* renamed from: c */
        private AbstractC3490yk f13331c;

        /* renamed from: d */
        private Integer f13332d;

        /* renamed from: e */
        private String f13333e;

        /* renamed from: f */
        private List<AbstractC0484bl> f13334f;

        /* renamed from: g */
        private EnumC2992nk f13335g;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p000.AbstractC2393dl.a
        /* renamed from: a */
        public AbstractC2393dl.a mo11459a(int i) {
            this.f13332d = Integer.valueOf(i);
            return this;
        }

        @Override // p000.AbstractC2393dl.a
        /* renamed from: a */
        public AbstractC2393dl.a mo11460a(long j) {
            this.f13329a = Long.valueOf(j);
            return this;
        }

        @Override // p000.AbstractC2393dl.a
        /* renamed from: a */
        AbstractC2393dl.a mo11461a(String str) {
            this.f13333e = str;
            return this;
        }

        @Override // p000.AbstractC2393dl.a
        /* renamed from: a */
        public AbstractC2393dl.a mo11462a(List<AbstractC0484bl> list) {
            this.f13334f = list;
            return this;
        }

        @Override // p000.AbstractC2393dl.a
        /* renamed from: a */
        public AbstractC2393dl.a mo11463a(EnumC2992nk enumC2992nk) {
            this.f13335g = enumC2992nk;
            return this;
        }

        @Override // p000.AbstractC2393dl.a
        /* renamed from: a */
        public AbstractC2393dl.a mo11464a(AbstractC3490yk abstractC3490yk) {
            this.f13331c = abstractC3490yk;
            return this;
        }

        @Override // p000.AbstractC2393dl.a
        /* renamed from: a */
        public AbstractC2393dl mo11465a() {
            String str = "";
            if (this.f13329a == null) {
                str = " requestTimeMs";
            }
            if (this.f13330b == null) {
                str = str + " requestUptimeMs";
            }
            if (this.f13332d == null) {
                str = str + " logSource";
            }
            if (str.isEmpty()) {
                return new C3265tk(this.f13329a.longValue(), this.f13330b.longValue(), this.f13331c, this.f13332d.intValue(), this.f13333e, this.f13334f, this.f13335g, null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.AbstractC2393dl.a
        /* renamed from: b */
        public AbstractC2393dl.a mo11467b(long j) {
            this.f13330b = Long.valueOf(j);
            return this;
        }
    }

    /* synthetic */ C3265tk(long j, long j2, AbstractC3490yk abstractC3490yk, int i, String str, List list, EnumC2992nk enumC2992nk, a aVar) {
        this.f13322a = j;
        this.f13323b = j2;
        this.f13324c = abstractC3490yk;
        this.f13325d = i;
        this.f13326e = str;
        this.f13327f = list;
        this.f13328g = enumC2992nk;
    }

    /* renamed from: b */
    public AbstractC3490yk m15651b() {
        return this.f13324c;
    }

    /* renamed from: c */
    public List<AbstractC0484bl> m15652c() {
        return this.f13327f;
    }

    /* renamed from: d */
    public int m15653d() {
        return this.f13325d;
    }

    /* renamed from: e */
    public String m15654e() {
        return this.f13326e;
    }

    public boolean equals(Object obj) {
        AbstractC3490yk abstractC3490yk;
        String str;
        List<AbstractC0484bl> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2393dl)) {
            return false;
        }
        C3265tk c3265tk = (C3265tk) ((AbstractC2393dl) obj);
        if (this.f13322a == c3265tk.f13322a && this.f13323b == c3265tk.f13323b && ((abstractC3490yk = this.f13324c) != null ? abstractC3490yk.equals(c3265tk.f13324c) : c3265tk.f13324c == null) && this.f13325d == c3265tk.f13325d && ((str = this.f13326e) != null ? str.equals(c3265tk.f13326e) : c3265tk.f13326e == null) && ((list = this.f13327f) != null ? list.equals(c3265tk.f13327f) : c3265tk.f13327f == null)) {
            EnumC2992nk enumC2992nk = this.f13328g;
            EnumC2992nk enumC2992nk2 = c3265tk.f13328g;
            if (enumC2992nk == null) {
                if (enumC2992nk2 == null) {
                    return true;
                }
            } else if (enumC2992nk.equals(enumC2992nk2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public long m15655f() {
        return this.f13322a;
    }

    /* renamed from: g */
    public long m15656g() {
        return this.f13323b;
    }

    public int hashCode() {
        long j = this.f13322a;
        long j2 = this.f13323b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        AbstractC3490yk abstractC3490yk = this.f13324c;
        int hashCode = (((i ^ (abstractC3490yk == null ? 0 : abstractC3490yk.hashCode())) * 1000003) ^ this.f13325d) * 1000003;
        String str = this.f13326e;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<AbstractC0484bl> list = this.f13327f;
        int hashCode3 = (hashCode2 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        EnumC2992nk enumC2992nk = this.f13328g;
        return hashCode3 ^ (enumC2992nk != null ? enumC2992nk.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f13322a + ", requestUptimeMs=" + this.f13323b + ", clientInfo=" + this.f13324c + ", logSource=" + this.f13325d + ", logSourceName=" + this.f13326e + ", logEvents=" + this.f13327f + ", qosTier=" + this.f13328g + "}";
    }
}
