package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class x80 {
    private final Set<k80> a = new LinkedHashSet();

    public synchronized void a(k80 k80Var) {
        this.a.remove(k80Var);
    }

    public synchronized void b(k80 k80Var) {
        this.a.add(k80Var);
    }

    public synchronized boolean c(k80 k80Var) {
        return this.a.contains(k80Var);
    }
}
