package p000;

import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class x80 {

    /* renamed from: a */
    private final Set<k80> f14003a = new LinkedHashSet();

    /* renamed from: a */
    public synchronized void m16463a(k80 k80Var) {
        this.f14003a.remove(k80Var);
    }

    /* renamed from: b */
    public synchronized void m16464b(k80 k80Var) {
        this.f14003a.add(k80Var);
    }

    /* renamed from: c */
    public synchronized boolean m16465c(k80 k80Var) {
        return this.f14003a.contains(k80Var);
    }
}
