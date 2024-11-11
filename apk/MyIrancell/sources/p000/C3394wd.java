package p000;

import com.bumptech.glide.EnumC0562g;
import com.bumptech.glide.load.C0575i;
import com.bumptech.glide.load.EnumC0567a;
import p000.InterfaceC2853ka;
import p000.InterfaceC3031od;

/* renamed from: wd */
/* loaded from: classes.dex */
public class C3394wd<Model> implements InterfaceC3031od<Model, Model> {

    /* renamed from: a */
    private static final C3394wd<?> f13831a = new C3394wd<>();

    /* renamed from: wd$a */
    /* loaded from: classes.dex */
    public static class a<Model> implements InterfaceC3081pd<Model, Model> {

        /* renamed from: a */
        private static final a<?> f13832a = new a<>();

        @Deprecated
        public a() {
        }

        /* renamed from: a */
        public static <T> a<T> m16209a() {
            return (a<T>) f13832a;
        }

        @Override // p000.InterfaceC3081pd
        /* renamed from: a */
        public InterfaceC3031od<Model, Model> mo139a(C3206sd c3206sd) {
            return C3394wd.m16208a();
        }
    }

    /* renamed from: wd$b */
    /* loaded from: classes.dex */
    private static class b<Model> implements InterfaceC2853ka<Model> {

        /* renamed from: b */
        private final Model f13833b;

        b(Model model) {
            this.f13833b = model;
        }

        @Override // p000.InterfaceC2853ka
        /* renamed from: a */
        public Class<Model> mo3663a() {
            return (Class<Model>) this.f13833b.getClass();
        }

        @Override // p000.InterfaceC2853ka
        /* renamed from: a */
        public void mo3664a(EnumC0562g enumC0562g, InterfaceC2853ka.a<? super Model> aVar) {
            aVar.mo3639a((InterfaceC2853ka.a<? super Model>) this.f13833b);
        }

        @Override // p000.InterfaceC2853ka
        /* renamed from: b */
        public void mo3665b() {
        }

        @Override // p000.InterfaceC2853ka
        /* renamed from: c */
        public EnumC0567a mo3666c() {
            return EnumC0567a.LOCAL;
        }

        @Override // p000.InterfaceC2853ka
        public void cancel() {
        }
    }

    @Deprecated
    public C3394wd() {
    }

    /* renamed from: a */
    public static <T> C3394wd<T> m16208a() {
        return (C3394wd<T>) f13831a;
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a */
    public InterfaceC3031od.a<Model> mo137a(Model model, int i, int i2, C0575i c0575i) {
        return new InterfaceC3031od.a<>(new C3529zh(model), new b(model));
    }

    @Override // p000.InterfaceC3031od
    /* renamed from: a */
    public boolean mo138a(Model model) {
        return true;
    }
}
