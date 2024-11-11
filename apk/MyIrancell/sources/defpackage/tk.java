package defpackage;

import defpackage.dl;
import java.util.List;

/* loaded from: classes.dex */
final class tk extends dl {
    private final long a;
    private final long b;
    private final yk c;
    private final int d;
    private final String e;
    private final List<bl> f;
    private final nk g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends dl.a {
        private Long a;
        private Long b;
        private yk c;
        private Integer d;
        private String e;
        private List<bl> f;
        private nk g;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // dl.a
        public dl.a a(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        @Override // dl.a
        public dl.a a(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // dl.a
        dl.a a(String str) {
            this.e = str;
            return this;
        }

        @Override // dl.a
        public dl.a a(List<bl> list) {
            this.f = list;
            return this;
        }

        @Override // dl.a
        public dl.a a(nk nkVar) {
            this.g = nkVar;
            return this;
        }

        @Override // dl.a
        public dl.a a(yk ykVar) {
            this.c = ykVar;
            return this;
        }

        @Override // dl.a
        public dl a() {
            String str = "";
            if (this.a == null) {
                str = " requestTimeMs";
            }
            if (this.b == null) {
                str = str + " requestUptimeMs";
            }
            if (this.d == null) {
                str = str + " logSource";
            }
            if (str.isEmpty()) {
                return new tk(this.a.longValue(), this.b.longValue(), this.c, this.d.intValue(), this.e, this.f, this.g, null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // dl.a
        public dl.a b(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    /* synthetic */ tk(long j, long j2, yk ykVar, int i, String str, List list, nk nkVar, a aVar) {
        this.a = j;
        this.b = j2;
        this.c = ykVar;
        this.d = i;
        this.e = str;
        this.f = list;
        this.g = nkVar;
    }

    public yk b() {
        return this.c;
    }

    public List<bl> c() {
        return this.f;
    }

    public int d() {
        return this.d;
    }

    public String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        yk ykVar;
        String str;
        List<bl> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dl)) {
            return false;
        }
        tk tkVar = (tk) ((dl) obj);
        if (this.a == tkVar.a && this.b == tkVar.b && ((ykVar = this.c) != null ? ykVar.equals(tkVar.c) : tkVar.c == null) && this.d == tkVar.d && ((str = this.e) != null ? str.equals(tkVar.e) : tkVar.e == null) && ((list = this.f) != null ? list.equals(tkVar.f) : tkVar.f == null)) {
            nk nkVar = this.g;
            nk nkVar2 = tkVar.g;
            if (nkVar == null) {
                if (nkVar2 == null) {
                    return true;
                }
            } else if (nkVar.equals(nkVar2)) {
                return true;
            }
        }
        return false;
    }

    public long f() {
        return this.a;
    }

    public long g() {
        return this.b;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        yk ykVar = this.c;
        int hashCode = (((i ^ (ykVar == null ? 0 : ykVar.hashCode())) * 1000003) ^ this.d) * 1000003;
        String str = this.e;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<bl> list = this.f;
        int hashCode3 = (hashCode2 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        nk nkVar = this.g;
        return hashCode3 ^ (nkVar != null ? nkVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }
}
