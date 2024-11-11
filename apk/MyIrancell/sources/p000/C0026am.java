package p000;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.C0794m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C0798q;

/* renamed from: am */
/* loaded from: classes.dex */
public final class C0026am implements n30<C3491yl> {

    /* renamed from: a */
    private final f70<InterfaceC3404wn> f116a;

    /* renamed from: b */
    private final f70<InterfaceC3404wn> f117b;

    /* renamed from: c */
    private final f70<InterfaceC2820jm> f118c;

    /* renamed from: d */
    private final f70<C0794m> f119d;

    /* renamed from: e */
    private final f70<C0798q> f120e;

    public C0026am(f70<InterfaceC3404wn> f70Var, f70<InterfaceC3404wn> f70Var2, f70<InterfaceC2820jm> f70Var3, f70<C0794m> f70Var4, f70<C0798q> f70Var5) {
        this.f116a = f70Var;
        this.f117b = f70Var2;
        this.f118c = f70Var3;
        this.f119d = f70Var4;
        this.f120e = f70Var5;
    }

    /* renamed from: a */
    public static C0026am m217a(f70<InterfaceC3404wn> f70Var, f70<InterfaceC3404wn> f70Var2, f70<InterfaceC2820jm> f70Var3, f70<C0794m> f70Var4, f70<C0798q> f70Var5) {
        return new C0026am(f70Var, f70Var2, f70Var3, f70Var4, f70Var5);
    }

    @Override // p000.f70
    public C3491yl get() {
        return new C3491yl(this.f116a.get(), this.f117b.get(), this.f118c.get(), this.f119d.get(), this.f120e.get());
    }
}
