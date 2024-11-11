package p000;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC0788g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC0800s;

/* renamed from: nm */
/* loaded from: classes.dex */
public final class C2994nm implements n30<InterfaceC0800s> {

    /* renamed from: a */
    private final f70<Context> f12340a;

    /* renamed from: b */
    private final f70<InterfaceC3132qm> f12341b;

    /* renamed from: c */
    private final f70<AbstractC0788g> f12342c;

    /* renamed from: d */
    private final f70<InterfaceC3404wn> f12343d;

    public C2994nm(f70<Context> f70Var, f70<InterfaceC3132qm> f70Var2, f70<AbstractC0788g> f70Var3, f70<InterfaceC3404wn> f70Var4) {
        this.f12340a = f70Var;
        this.f12341b = f70Var2;
        this.f12342c = f70Var3;
        this.f12343d = f70Var4;
    }

    /* renamed from: a */
    public static InterfaceC0800s m14337a(Context context, InterfaceC3132qm interfaceC3132qm, AbstractC0788g abstractC0788g, InterfaceC3404wn interfaceC3404wn) {
        InterfaceC0800s m14170a = AbstractC2948mm.m14170a(context, interfaceC3132qm, abstractC0788g, interfaceC3404wn);
        p30.m14711a(m14170a, "Cannot return null from a non-@Nullable @Provides method");
        return m14170a;
    }

    /* renamed from: a */
    public static C2994nm m14338a(f70<Context> f70Var, f70<InterfaceC3132qm> f70Var2, f70<AbstractC0788g> f70Var3, f70<InterfaceC3404wn> f70Var4) {
        return new C2994nm(f70Var, f70Var2, f70Var3, f70Var4);
    }

    @Override // p000.f70
    public InterfaceC0800s get() {
        return m14337a(this.f12340a.get(), this.f12341b.get(), this.f12342c.get(), this.f12343d.get());
    }
}
