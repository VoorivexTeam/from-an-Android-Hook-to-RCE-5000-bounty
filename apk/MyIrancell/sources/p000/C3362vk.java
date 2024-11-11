package p000;

import p000.AbstractC2517gl;

/* renamed from: vk */
/* loaded from: classes.dex */
final class C3362vk extends AbstractC2517gl {

    /* renamed from: a */
    private final AbstractC2517gl.c f13697a;

    /* renamed from: b */
    private final AbstractC2517gl.b f13698b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vk$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC2517gl.a {

        /* renamed from: a */
        private AbstractC2517gl.c f13699a;

        /* renamed from: b */
        private AbstractC2517gl.b f13700b;

        @Override // p000.AbstractC2517gl.a
        /* renamed from: a */
        public AbstractC2517gl.a mo12031a(AbstractC2517gl.b bVar) {
            this.f13700b = bVar;
            return this;
        }

        @Override // p000.AbstractC2517gl.a
        /* renamed from: a */
        public AbstractC2517gl.a mo12032a(AbstractC2517gl.c cVar) {
            this.f13699a = cVar;
            return this;
        }

        @Override // p000.AbstractC2517gl.a
        /* renamed from: a */
        public AbstractC2517gl mo12033a() {
            return new C3362vk(this.f13699a, this.f13700b, null);
        }
    }

    /* synthetic */ C3362vk(AbstractC2517gl.c cVar, AbstractC2517gl.b bVar, a aVar) {
        this.f13697a = cVar;
        this.f13698b = bVar;
    }

    /* renamed from: b */
    public AbstractC2517gl.b m16036b() {
        return this.f13698b;
    }

    /* renamed from: c */
    public AbstractC2517gl.c m16037c() {
        return this.f13697a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2517gl)) {
            return false;
        }
        AbstractC2517gl.c cVar = this.f13697a;
        if (cVar != null ? cVar.equals(((C3362vk) obj).f13697a) : ((C3362vk) obj).f13697a == null) {
            AbstractC2517gl.b bVar = this.f13698b;
            AbstractC2517gl.b bVar2 = ((C3362vk) obj).f13698b;
            if (bVar == null) {
                if (bVar2 == null) {
                    return true;
                }
            } else if (bVar.equals(bVar2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        AbstractC2517gl.c cVar = this.f13697a;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC2517gl.b bVar = this.f13698b;
        return hashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f13697a + ", mobileSubtype=" + this.f13698b + "}";
    }
}
