package defpackage;

import defpackage.yk;

/* loaded from: classes.dex */
final class rk extends yk {
    private final yk.b a;
    private final mk b;

    /* loaded from: classes.dex */
    static final class b extends yk.a {
        private yk.b a;
        private mk b;

        @Override // yk.a
        public yk.a a(mk mkVar) {
            this.b = mkVar;
            return this;
        }

        @Override // yk.a
        public yk.a a(yk.b bVar) {
            this.a = bVar;
            return this;
        }

        @Override // yk.a
        public yk a() {
            return new rk(this.a, this.b, null);
        }
    }

    /* synthetic */ rk(yk.b bVar, mk mkVar, a aVar) {
        this.a = bVar;
        this.b = mkVar;
    }

    public mk b() {
        return this.b;
    }

    public yk.b c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yk)) {
            return false;
        }
        yk.b bVar = this.a;
        if (bVar != null ? bVar.equals(((rk) obj).a) : ((rk) obj).a == null) {
            mk mkVar = this.b;
            mk mkVar2 = ((rk) obj).b;
            if (mkVar == null) {
                if (mkVar2 == null) {
                    return true;
                }
            } else if (mkVar.equals(mkVar2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        yk.b bVar = this.a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        mk mkVar = this.b;
        return hashCode ^ (mkVar != null ? mkVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.a + ", androidClientInfo=" + this.b + "}";
    }
}
