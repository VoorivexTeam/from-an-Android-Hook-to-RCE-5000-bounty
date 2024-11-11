package p000;

import java.util.Map;
import p000.AbstractC3089pl;

/* renamed from: il */
/* loaded from: classes.dex */
final class C2599il extends AbstractC3089pl {

    /* renamed from: a */
    private final String f10639a;

    /* renamed from: b */
    private final Integer f10640b;

    /* renamed from: c */
    private final C3050ol f10641c;

    /* renamed from: d */
    private final long f10642d;

    /* renamed from: e */
    private final long f10643e;

    /* renamed from: f */
    private final Map<String, String> f10644f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: il$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC3089pl.a {

        /* renamed from: a */
        private String f10645a;

        /* renamed from: b */
        private Integer f10646b;

        /* renamed from: c */
        private C3050ol f10647c;

        /* renamed from: d */
        private Long f10648d;

        /* renamed from: e */
        private Long f10649e;

        /* renamed from: f */
        private Map<String, String> f10650f;

        @Override // p000.AbstractC3089pl.a
        /* renamed from: a */
        public AbstractC3089pl.a mo12484a(long j) {
            this.f10648d = Long.valueOf(j);
            return this;
        }

        @Override // p000.AbstractC3089pl.a
        /* renamed from: a */
        public AbstractC3089pl.a mo12485a(Integer num) {
            this.f10646b = num;
            return this;
        }

        @Override // p000.AbstractC3089pl.a
        /* renamed from: a */
        public AbstractC3089pl.a mo12486a(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f10645a = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p000.AbstractC3089pl.a
        /* renamed from: a */
        public AbstractC3089pl.a mo12487a(Map<String, String> map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f10650f = map;
            return this;
        }

        @Override // p000.AbstractC3089pl.a
        /* renamed from: a */
        public AbstractC3089pl.a mo12488a(C3050ol c3050ol) {
            if (c3050ol == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f10647c = c3050ol;
            return this;
        }

        @Override // p000.AbstractC3089pl.a
        /* renamed from: a */
        public AbstractC3089pl mo12489a() {
            String str = "";
            if (this.f10645a == null) {
                str = " transportName";
            }
            if (this.f10647c == null) {
                str = str + " encodedPayload";
            }
            if (this.f10648d == null) {
                str = str + " eventMillis";
            }
            if (this.f10649e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f10650f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C2599il(this.f10645a, this.f10646b, this.f10647c, this.f10648d.longValue(), this.f10649e.longValue(), this.f10650f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.AbstractC3089pl.a
        /* renamed from: b */
        protected Map<String, String> mo12490b() {
            Map<String, String> map = this.f10650f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // p000.AbstractC3089pl.a
        /* renamed from: b */
        public AbstractC3089pl.a mo12491b(long j) {
            this.f10649e = Long.valueOf(j);
            return this;
        }
    }

    private C2599il(String str, Integer num, C3050ol c3050ol, long j, long j2, Map<String, String> map) {
        this.f10639a = str;
        this.f10640b = num;
        this.f10641c = c3050ol;
        this.f10642d = j;
        this.f10643e = j2;
        this.f10644f = map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000.AbstractC3089pl
    /* renamed from: a */
    public Map<String, String> mo12478a() {
        return this.f10644f;
    }

    @Override // p000.AbstractC3089pl
    /* renamed from: b */
    public Integer mo12479b() {
        return this.f10640b;
    }

    @Override // p000.AbstractC3089pl
    /* renamed from: c */
    public C3050ol mo12480c() {
        return this.f10641c;
    }

    @Override // p000.AbstractC3089pl
    /* renamed from: d */
    public long mo12481d() {
        return this.f10642d;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3089pl)) {
            return false;
        }
        AbstractC3089pl abstractC3089pl = (AbstractC3089pl) obj;
        return this.f10639a.equals(abstractC3089pl.mo12482f()) && ((num = this.f10640b) != null ? num.equals(abstractC3089pl.mo12479b()) : abstractC3089pl.mo12479b() == null) && this.f10641c.equals(abstractC3089pl.mo12480c()) && this.f10642d == abstractC3089pl.mo12481d() && this.f10643e == abstractC3089pl.mo12483g() && this.f10644f.equals(abstractC3089pl.mo12478a());
    }

    @Override // p000.AbstractC3089pl
    /* renamed from: f */
    public String mo12482f() {
        return this.f10639a;
    }

    @Override // p000.AbstractC3089pl
    /* renamed from: g */
    public long mo12483g() {
        return this.f10643e;
    }

    public int hashCode() {
        int hashCode = (this.f10639a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f10640b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f10641c.hashCode()) * 1000003;
        long j = this.f10642d;
        int i = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f10643e;
        return ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f10644f.hashCode();
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f10639a + ", code=" + this.f10640b + ", encodedPayload=" + this.f10641c + ", eventMillis=" + this.f10642d + ", uptimeMillis=" + this.f10643e + ", autoMetadata=" + this.f10644f + "}";
    }
}
