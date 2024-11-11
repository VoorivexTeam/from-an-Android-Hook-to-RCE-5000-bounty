package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n6 {
    private static final n6 c = new n6();
    private final ConcurrentMap<Class<?>, q6<?>> b = new ConcurrentHashMap();
    private final p6 a = new o5();

    private n6() {
    }

    public static n6 a() {
        return c;
    }

    public final <T> q6<T> a(Class<T> cls) {
        r4.a(cls, "messageType");
        q6<T> q6Var = (q6) this.b.get(cls);
        if (q6Var != null) {
            return q6Var;
        }
        q6<T> a = this.a.a(cls);
        r4.a(cls, "messageType");
        r4.a(a, "schema");
        q6<T> q6Var2 = (q6) this.b.putIfAbsent(cls, a);
        return q6Var2 != null ? q6Var2 : a;
    }

    public final <T> q6<T> a(T t) {
        return a((Class) t.getClass());
    }
}
