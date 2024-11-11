package defpackage;

import defpackage.k70;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class xa0<ResponseT, ReturnT> extends hb0<ReturnT> {
    private final eb0 a;
    private final k70.a b;
    private final qa0<ResponseT, ReturnT> c;
    private final ta0<j80, ResponseT> d;

    private xa0(eb0 eb0Var, k70.a aVar, qa0<ResponseT, ReturnT> qa0Var, ta0<j80, ResponseT> ta0Var) {
        this.a = eb0Var;
        this.b = aVar;
        this.c = qa0Var;
        this.d = ta0Var;
    }

    private static <ResponseT> ta0<j80, ResponseT> a(gb0 gb0Var, Method method, Type type) {
        try {
            return gb0Var.b(type, method.getAnnotations());
        } catch (RuntimeException e) {
            throw ib0.a(method, e, "Unable to create converter for %s", type);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <ResponseT, ReturnT> xa0<ResponseT, ReturnT> a(gb0 gb0Var, Method method, eb0 eb0Var) {
        qa0 b = b(gb0Var, method);
        Type a = b.a();
        if (a == fb0.class || a == i80.class) {
            throw ib0.a(method, "'" + ib0.c(a).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (eb0Var.c.equals("HEAD") && !Void.class.equals(a)) {
            throw ib0.a(method, "HEAD method must use Void as response type.", new Object[0]);
        }
        return new xa0<>(eb0Var, gb0Var.b, b, a(gb0Var, method, a));
    }

    private static <ResponseT, ReturnT> qa0<ResponseT, ReturnT> b(gb0 gb0Var, Method method) {
        Type genericReturnType = method.getGenericReturnType();
        try {
            return (qa0<ResponseT, ReturnT>) gb0Var.a(genericReturnType, method.getAnnotations());
        } catch (RuntimeException e) {
            throw ib0.a(method, e, "Unable to create call adapter for %s", genericReturnType);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.hb0
    public ReturnT a(Object[] objArr) {
        return this.c.a(new za0(this.a, objArr, this.b, this.d));
    }
}
