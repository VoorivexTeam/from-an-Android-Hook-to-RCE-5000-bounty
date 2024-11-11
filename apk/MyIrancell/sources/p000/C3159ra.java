package p000;

import java.io.InputStream;
import p000.InterfaceC2890la;

/* renamed from: ra */
/* loaded from: classes.dex */
public final class C3159ra implements InterfaceC2890la<InputStream> {

    /* renamed from: a */
    private final C3435xe f12944a;

    /* renamed from: ra$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC2890la.a<InputStream> {

        /* renamed from: a */
        private final InterfaceC0475bc f12945a;

        public a(InterfaceC0475bc interfaceC0475bc) {
            this.f12945a = interfaceC0475bc;
        }

        @Override // p000.InterfaceC2890la.a
        /* renamed from: a */
        public Class<InputStream> mo11363a() {
            return InputStream.class;
        }

        @Override // p000.InterfaceC2890la.a
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public InterfaceC2890la<InputStream> mo11364a(InputStream inputStream) {
            return new C3159ra(inputStream, this.f12945a);
        }
    }

    C3159ra(InputStream inputStream, InterfaceC0475bc interfaceC0475bc) {
        C3435xe c3435xe = new C3435xe(inputStream, interfaceC0475bc);
        this.f12944a = c3435xe;
        c3435xe.mark(5242880);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.InterfaceC2890la
    /* renamed from: a */
    public InputStream mo11361a() {
        this.f12944a.reset();
        return this.f12944a;
    }

    @Override // p000.InterfaceC2890la
    /* renamed from: b */
    public void mo11362b() {
        this.f12944a.m16490c();
    }
}
