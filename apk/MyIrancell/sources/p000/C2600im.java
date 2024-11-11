package p000;

import com.google.android.datatransport.runtime.backends.InterfaceC0773e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC0800s;
import java.util.concurrent.Executor;

/* renamed from: im */
/* loaded from: classes.dex */
public final class C2600im implements n30<C2558hm> {

    /* renamed from: a */
    private final f70<Executor> f10651a;

    /* renamed from: b */
    private final f70<InterfaceC0773e> f10652b;

    /* renamed from: c */
    private final f70<InterfaceC0800s> f10653c;

    /* renamed from: d */
    private final f70<InterfaceC3132qm> f10654d;

    /* renamed from: e */
    private final f70<InterfaceC3365vn> f10655e;

    public C2600im(f70<Executor> f70Var, f70<InterfaceC0773e> f70Var2, f70<InterfaceC0800s> f70Var3, f70<InterfaceC3132qm> f70Var4, f70<InterfaceC3365vn> f70Var5) {
        this.f10651a = f70Var;
        this.f10652b = f70Var2;
        this.f10653c = f70Var3;
        this.f10654d = f70Var4;
        this.f10655e = f70Var5;
    }

    /* renamed from: a */
    public static C2600im m12492a(f70<Executor> f70Var, f70<InterfaceC0773e> f70Var2, f70<InterfaceC0800s> f70Var3, f70<InterfaceC3132qm> f70Var4, f70<InterfaceC3365vn> f70Var5) {
        return new C2600im(f70Var, f70Var2, f70Var3, f70Var4, f70Var5);
    }

    @Override // p000.f70
    public C2558hm get() {
        return new C2558hm(this.f10651a.get(), this.f10652b.get(), this.f10653c.get(), this.f10654d.get(), this.f10655e.get());
    }
}
