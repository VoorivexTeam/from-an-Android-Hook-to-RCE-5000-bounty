package p000;

import p000.AbstractC3214sl;

/* renamed from: jl */
/* loaded from: classes.dex */
final class C2819jl extends AbstractC3214sl {

    /* renamed from: a */
    private final AbstractC3266tl f11533a;

    /* renamed from: b */
    private final String f11534b;

    /* renamed from: c */
    private final AbstractC2516gk<?> f11535c;

    /* renamed from: d */
    private final InterfaceC2598ik<?, byte[]> f11536d;

    /* renamed from: e */
    private final C2476fk f11537e;

    /* renamed from: jl$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC3214sl.a {

        /* renamed from: a */
        private AbstractC3266tl f11538a;

        /* renamed from: b */
        private String f11539b;

        /* renamed from: c */
        private AbstractC2516gk<?> f11540c;

        /* renamed from: d */
        private InterfaceC2598ik<?, byte[]> f11541d;

        /* renamed from: e */
        private C2476fk f11542e;

        @Override // p000.AbstractC3214sl.a
        /* renamed from: a */
        AbstractC3214sl.a mo13505a(C2476fk c2476fk) {
            if (c2476fk == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f11542e = c2476fk;
            return this;
        }

        @Override // p000.AbstractC3214sl.a
        /* renamed from: a */
        AbstractC3214sl.a mo13506a(AbstractC2516gk<?> abstractC2516gk) {
            if (abstractC2516gk == null) {
                throw new NullPointerException("Null event");
            }
            this.f11540c = abstractC2516gk;
            return this;
        }

        @Override // p000.AbstractC3214sl.a
        /* renamed from: a */
        AbstractC3214sl.a mo13507a(InterfaceC2598ik<?, byte[]> interfaceC2598ik) {
            if (interfaceC2598ik == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f11541d = interfaceC2598ik;
            return this;
        }

        @Override // p000.AbstractC3214sl.a
        /* renamed from: a */
        public AbstractC3214sl.a mo13508a(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f11539b = str;
            return this;
        }

        @Override // p000.AbstractC3214sl.a
        /* renamed from: a */
        public AbstractC3214sl.a mo13509a(AbstractC3266tl abstractC3266tl) {
            if (abstractC3266tl == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f11538a = abstractC3266tl;
            return this;
        }

        @Override // p000.AbstractC3214sl.a
        /* renamed from: a */
        public AbstractC3214sl mo13510a() {
            String str = "";
            if (this.f11538a == null) {
                str = " transportContext";
            }
            if (this.f11539b == null) {
                str = str + " transportName";
            }
            if (this.f11540c == null) {
                str = str + " event";
            }
            if (this.f11541d == null) {
                str = str + " transformer";
            }
            if (this.f11542e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C2819jl(this.f11538a, this.f11539b, this.f11540c, this.f11541d, this.f11542e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }

    private C2819jl(AbstractC3266tl abstractC3266tl, String str, AbstractC2516gk<?> abstractC2516gk, InterfaceC2598ik<?, byte[]> interfaceC2598ik, C2476fk c2476fk) {
        this.f11533a = abstractC3266tl;
        this.f11534b = str;
        this.f11535c = abstractC2516gk;
        this.f11536d = interfaceC2598ik;
        this.f11537e = c2476fk;
    }

    @Override // p000.AbstractC3214sl
    /* renamed from: a */
    public C2476fk mo13500a() {
        return this.f11537e;
    }

    @Override // p000.AbstractC3214sl
    /* renamed from: b */
    AbstractC2516gk<?> mo13501b() {
        return this.f11535c;
    }

    @Override // p000.AbstractC3214sl
    /* renamed from: d */
    InterfaceC2598ik<?, byte[]> mo13502d() {
        return this.f11536d;
    }

    @Override // p000.AbstractC3214sl
    /* renamed from: e */
    public AbstractC3266tl mo13503e() {
        return this.f11533a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3214sl)) {
            return false;
        }
        AbstractC3214sl abstractC3214sl = (AbstractC3214sl) obj;
        return this.f11533a.equals(abstractC3214sl.mo13503e()) && this.f11534b.equals(abstractC3214sl.mo13504f()) && this.f11535c.equals(abstractC3214sl.mo13501b()) && this.f11536d.equals(abstractC3214sl.mo13502d()) && this.f11537e.equals(abstractC3214sl.mo13500a());
    }

    @Override // p000.AbstractC3214sl
    /* renamed from: f */
    public String mo13504f() {
        return this.f11534b;
    }

    public int hashCode() {
        return ((((((((this.f11533a.hashCode() ^ 1000003) * 1000003) ^ this.f11534b.hashCode()) * 1000003) ^ this.f11535c.hashCode()) * 1000003) ^ this.f11536d.hashCode()) * 1000003) ^ this.f11537e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f11533a + ", transportName=" + this.f11534b + ", event=" + this.f11535c + ", transformer=" + this.f11536d + ", encoding=" + this.f11537e + "}";
    }
}
