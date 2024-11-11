package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class hb0<T> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> hb0<T> m12196a(gb0 gb0Var, Method method) {
        eb0 m11576a = eb0.m11576a(gb0Var, method);
        Type genericReturnType = method.getGenericReturnType();
        if (ib0.m12445d(genericReturnType)) {
            throw ib0.m12430a(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType != Void.TYPE) {
            return xa0.m16481a(gb0Var, method, m11576a);
        }
        throw ib0.m12430a(method, "Service methods cannot return void.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo12197a(Object[] objArr);
}
