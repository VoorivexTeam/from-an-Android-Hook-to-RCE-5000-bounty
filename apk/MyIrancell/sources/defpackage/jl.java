package defpackage;

import defpackage.sl;

/* loaded from: classes.dex */
final class jl extends sl {
    private final tl a;
    private final String b;
    private final gk<?> c;
    private final ik<?, byte[]> d;
    private final fk e;

    /* loaded from: classes.dex */
    static final class b extends sl.a {
        private tl a;
        private String b;
        private gk<?> c;
        private ik<?, byte[]> d;
        private fk e;

        @Override // sl.a
        sl.a a(fk fkVar) {
            if (fkVar == null) {
                throw new NullPointerException("Null encoding");
            }
            this.e = fkVar;
            return this;
        }

        @Override // sl.a
        sl.a a(gk<?> gkVar) {
            if (gkVar == null) {
                throw new NullPointerException("Null event");
            }
            this.c = gkVar;
            return this;
        }

        @Override // sl.a
        sl.a a(ik<?, byte[]> ikVar) {
            if (ikVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.d = ikVar;
            return this;
        }

        @Override // sl.a
        public sl.a a(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.b = str;
            return this;
        }

        @Override // sl.a
        public sl.a a(tl tlVar) {
            if (tlVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.a = tlVar;
            return this;
        }

        @Override // sl.a
        public sl a() {
            String str = "";
            if (this.a == null) {
                str = " transportContext";
            }
            if (this.b == null) {
                str = str + " transportName";
            }
            if (this.c == null) {
                str = str + " event";
            }
            if (this.d == null) {
                str = str + " transformer";
            }
            if (this.e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new jl(this.a, this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }

    private jl(tl tlVar, String str, gk<?> gkVar, ik<?, byte[]> ikVar, fk fkVar) {
        this.a = tlVar;
        this.b = str;
        this.c = gkVar;
        this.d = ikVar;
        this.e = fkVar;
    }

    @Override // defpackage.sl
    public fk a() {
        return this.e;
    }

    @Override // defpackage.sl
    gk<?> b() {
        return this.c;
    }

    @Override // defpackage.sl
    ik<?, byte[]> d() {
        return this.d;
    }

    @Override // defpackage.sl
    public tl e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sl)) {
            return false;
        }
        sl slVar = (sl) obj;
        return this.a.equals(slVar.e()) && this.b.equals(slVar.f()) && this.c.equals(slVar.b()) && this.d.equals(slVar.d()) && this.e.equals(slVar.a());
    }

    @Override // defpackage.sl
    public String f() {
        return this.b;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.a + ", transportName=" + this.b + ", event=" + this.c + ", transformer=" + this.d + ", encoding=" + this.e + "}";
    }
}
