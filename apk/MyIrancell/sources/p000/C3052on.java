package p000;

/* renamed from: on */
/* loaded from: classes.dex */
public final class C3052on implements n30<C2995nn> {

    /* renamed from: a */
    private final f70<InterfaceC3404wn> f12517a;

    /* renamed from: b */
    private final f70<InterfaceC3404wn> f12518b;

    /* renamed from: c */
    private final f70<AbstractC3171rm> f12519c;

    /* renamed from: d */
    private final f70<C3216sn> f12520d;

    public C3052on(f70<InterfaceC3404wn> f70Var, f70<InterfaceC3404wn> f70Var2, f70<AbstractC3171rm> f70Var3, f70<C3216sn> f70Var4) {
        this.f12517a = f70Var;
        this.f12518b = f70Var2;
        this.f12519c = f70Var3;
        this.f12520d = f70Var4;
    }

    /* renamed from: a */
    public static C3052on m14646a(f70<InterfaceC3404wn> f70Var, f70<InterfaceC3404wn> f70Var2, f70<AbstractC3171rm> f70Var3, f70<C3216sn> f70Var4) {
        return new C3052on(f70Var, f70Var2, f70Var3, f70Var4);
    }

    @Override // p000.f70
    public C2995nn get() {
        return new C2995nn(this.f12517a.get(), this.f12518b.get(), this.f12519c.get(), this.f12520d.get());
    }
}
