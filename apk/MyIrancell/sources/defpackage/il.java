package defpackage;

import defpackage.pl;
import java.util.Map;

/* loaded from: classes.dex */
final class il extends pl {
    private final String a;
    private final Integer b;
    private final ol c;
    private final long d;
    private final long e;
    private final Map<String, String> f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends pl.a {
        private String a;
        private Integer b;
        private ol c;
        private Long d;
        private Long e;
        private Map<String, String> f;

        @Override // pl.a
        public pl.a a(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // pl.a
        public pl.a a(Integer num) {
            this.b = num;
            return this;
        }

        @Override // pl.a
        public pl.a a(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.a = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // pl.a
        public pl.a a(Map<String, String> map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f = map;
            return this;
        }

        @Override // pl.a
        public pl.a a(ol olVar) {
            if (olVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.c = olVar;
            return this;
        }

        @Override // pl.a
        public pl a() {
            String str = "";
            if (this.a == null) {
                str = " transportName";
            }
            if (this.c == null) {
                str = str + " encodedPayload";
            }
            if (this.d == null) {
                str = str + " eventMillis";
            }
            if (this.e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new il(this.a, this.b, this.c, this.d.longValue(), this.e.longValue(), this.f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // pl.a
        protected Map<String, String> b() {
            Map<String, String> map = this.f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // pl.a
        public pl.a b(long j) {
            this.e = Long.valueOf(j);
            return this;
        }
    }

    private il(String str, Integer num, ol olVar, long j, long j2, Map<String, String> map) {
        this.a = str;
        this.b = num;
        this.c = olVar;
        this.d = j;
        this.e = j2;
        this.f = map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.pl
    public Map<String, String> a() {
        return this.f;
    }

    @Override // defpackage.pl
    public Integer b() {
        return this.b;
    }

    @Override // defpackage.pl
    public ol c() {
        return this.c;
    }

    @Override // defpackage.pl
    public long d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pl)) {
            return false;
        }
        pl plVar = (pl) obj;
        return this.a.equals(plVar.f()) && ((num = this.b) != null ? num.equals(plVar.b()) : plVar.b() == null) && this.c.equals(plVar.c()) && this.d == plVar.d() && this.e == plVar.g() && this.f.equals(plVar.a());
    }

    @Override // defpackage.pl
    public String f() {
        return this.a;
    }

    @Override // defpackage.pl
    public long g() {
        return this.e;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode();
    }

    public String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }
}
