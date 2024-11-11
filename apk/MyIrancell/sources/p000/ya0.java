package p000;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ya0 {

    /* renamed from: a */
    private final Method f14120a;

    /* renamed from: b */
    private final List<?> f14121b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ya0(Method method, List<?> list) {
        this.f14120a = method;
        this.f14121b = Collections.unmodifiableList(list);
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f14120a.getDeclaringClass().getName(), this.f14120a.getName(), this.f14121b);
    }
}
