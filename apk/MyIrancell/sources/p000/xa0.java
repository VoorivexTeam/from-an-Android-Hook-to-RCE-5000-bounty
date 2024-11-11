package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import p000.k70;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class xa0<ResponseT, ReturnT> extends hb0<ReturnT> {

    /* renamed from: a */
    private final eb0 f14020a;

    /* renamed from: b */
    private final k70.InterfaceC2850a f14021b;

    /* renamed from: c */
    private final qa0<ResponseT, ReturnT> f14022c;

    /* renamed from: d */
    private final ta0<j80, ResponseT> f14023d;

    private xa0(eb0 eb0Var, k70.InterfaceC2850a interfaceC2850a, qa0<ResponseT, ReturnT> qa0Var, ta0<j80, ResponseT> ta0Var) {
        this.f14020a = eb0Var;
        this.f14021b = interfaceC2850a;
        this.f14022c = qa0Var;
        this.f14023d = ta0Var;
    }

    /* renamed from: a */
    private static <ResponseT> ta0<j80, ResponseT> m16480a(gb0 gb0Var, Method method, Type type) {
        try {
            return gb0Var.m11987b(type, method.getAnnotations());
        } catch (RuntimeException e) {
            throw ib0.m12432a(method, e, "Unable to create converter for %s", type);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <ResponseT, ReturnT> xa0<ResponseT, ReturnT> m16481a(gb0 gb0Var, Method method, eb0 eb0Var) {
        qa0 m16482b = m16482b(gb0Var, method);
        Type mo15037a = m16482b.mo15037a();
        if (mo15037a == fb0.class || mo15037a == i80.class) {
            throw ib0.m12430a(method, "'" + ib0.m12444c(mo15037a).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (eb0Var.f9977c.equals("HEAD") && !Void.class.equals(mo15037a)) {
            throw ib0.m12430a(method, "HEAD method must use Void as response type.", new Object[0]);
        }
        return new xa0<>(eb0Var, gb0Var.f10295b, m16482b, m16480a(gb0Var, method, mo15037a));
    }

    /* renamed from: b */
    private static <ResponseT, ReturnT> qa0<ResponseT, ReturnT> m16482b(gb0 gb0Var, Method method) {
        Type genericReturnType = method.getGenericReturnType();
        try {
            return (qa0<ResponseT, ReturnT>) gb0Var.m11982a(genericReturnType, method.getAnnotations());
        } catch (RuntimeException e) {
            throw ib0.m12432a(method, e, "Unable to create call adapter for %s", genericReturnType);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p000.hb0
    /* renamed from: a */
    public ReturnT mo12197a(Object[] objArr) {
        return this.f14022c.mo15036a(new za0(this.f14020a, objArr, this.f14021b, this.f14023d));
    }
}
