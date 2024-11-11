package p000;

import p000.AbstractC3490yk;

/* renamed from: rk */
/* loaded from: classes.dex */
final class C3169rk extends AbstractC3490yk {

    /* renamed from: a */
    private final AbstractC3490yk.b f12973a;

    /* renamed from: b */
    private final AbstractC2946mk f12974b;

    /* renamed from: rk$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC3490yk.a {

        /* renamed from: a */
        private AbstractC3490yk.b f12975a;

        /* renamed from: b */
        private AbstractC2946mk f12976b;

        @Override // p000.AbstractC3490yk.a
        /* renamed from: a */
        public AbstractC3490yk.a mo15283a(AbstractC2946mk abstractC2946mk) {
            this.f12976b = abstractC2946mk;
            return this;
        }

        @Override // p000.AbstractC3490yk.a
        /* renamed from: a */
        public AbstractC3490yk.a mo15284a(AbstractC3490yk.b bVar) {
            this.f12975a = bVar;
            return this;
        }

        @Override // p000.AbstractC3490yk.a
        /* renamed from: a */
        public AbstractC3490yk mo15285a() {
            return new C3169rk(this.f12975a, this.f12976b, null);
        }
    }

    /* synthetic */ C3169rk(AbstractC3490yk.b bVar, AbstractC2946mk abstractC2946mk, a aVar) {
        this.f12973a = bVar;
        this.f12974b = abstractC2946mk;
    }

    /* renamed from: b */
    public AbstractC2946mk m15281b() {
        return this.f12974b;
    }

    /* renamed from: c */
    public AbstractC3490yk.b m15282c() {
        return this.f12973a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3490yk)) {
            return false;
        }
        AbstractC3490yk.b bVar = this.f12973a;
        if (bVar != null ? bVar.equals(((C3169rk) obj).f12973a) : ((C3169rk) obj).f12973a == null) {
            AbstractC2946mk abstractC2946mk = this.f12974b;
            AbstractC2946mk abstractC2946mk2 = ((C3169rk) obj).f12974b;
            if (abstractC2946mk == null) {
                if (abstractC2946mk2 == null) {
                    return true;
                }
            } else if (abstractC2946mk.equals(abstractC2946mk2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        AbstractC3490yk.b bVar = this.f12973a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC2946mk abstractC2946mk = this.f12974b;
        return hashCode ^ (abstractC2946mk != null ? abstractC2946mk.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f12973a + ", androidClientInfo=" + this.f12974b + "}";
    }
}
