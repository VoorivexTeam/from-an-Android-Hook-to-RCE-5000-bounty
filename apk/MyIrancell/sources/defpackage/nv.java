package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class nv {
    private static volatile nv b;
    private final Set<pv> a = new HashSet();

    nv() {
    }

    public static nv b() {
        nv nvVar = b;
        if (nvVar == null) {
            synchronized (nv.class) {
                nvVar = b;
                if (nvVar == null) {
                    nvVar = new nv();
                    b = nvVar;
                }
            }
        }
        return nvVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<pv> a() {
        Set<pv> unmodifiableSet;
        synchronized (this.a) {
            unmodifiableSet = Collections.unmodifiableSet(this.a);
        }
        return unmodifiableSet;
    }
}
