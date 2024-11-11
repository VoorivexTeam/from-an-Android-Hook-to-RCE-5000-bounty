package p000;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC0788g;

/* renamed from: lm */
/* loaded from: classes.dex */
public final class C2902lm implements n30<AbstractC0788g> {

    /* renamed from: a */
    private final f70<InterfaceC3404wn> f11914a;

    public C2902lm(f70<InterfaceC3404wn> f70Var) {
        this.f11914a = f70Var;
    }

    /* renamed from: a */
    public static AbstractC0788g m13919a(InterfaceC3404wn interfaceC3404wn) {
        AbstractC0788g m13742a = AbstractC2865km.m13742a(interfaceC3404wn);
        p30.m14711a(m13742a, "Cannot return null from a non-@Nullable @Provides method");
        return m13742a;
    }

    /* renamed from: a */
    public static C2902lm m13920a(f70<InterfaceC3404wn> f70Var) {
        return new C2902lm(f70Var);
    }

    @Override // p000.f70
    public AbstractC0788g get() {
        return m13919a(this.f11914a.get());
    }
}
