package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class hb0<T> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> hb0<T> a(gb0 gb0Var, Method method) {
        eb0 a = eb0.a(gb0Var, method);
        Type genericReturnType = method.getGenericReturnType();
        if (ib0.d(genericReturnType)) {
            throw ib0.a(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType != Void.TYPE) {
            return xa0.a(gb0Var, method, a);
        }
        throw ib0.a(method, "Service methods cannot return void.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T a(Object[] objArr);
}
