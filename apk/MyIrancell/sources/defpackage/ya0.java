package defpackage;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ya0 {
    private final Method a;
    private final List<?> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ya0(Method method, List<?> list) {
        this.a = method;
        this.b = Collections.unmodifiableList(list);
    }

    public String toString() {
        return String.format("%s.%s() %s", this.a.getDeclaringClass().getName(), this.a.getName(), this.b);
    }
}
