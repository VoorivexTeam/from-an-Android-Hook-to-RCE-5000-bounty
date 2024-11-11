package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class sg implements lg {
    private final Set<th<?>> a = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.lg
    public void a() {
        Iterator it = ki.a(this.a).iterator();
        while (it.hasNext()) {
            ((th) it.next()).a();
        }
    }

    public void a(th<?> thVar) {
        this.a.add(thVar);
    }

    @Override // defpackage.lg
    public void b() {
        Iterator it = ki.a(this.a).iterator();
        while (it.hasNext()) {
            ((th) it.next()).b();
        }
    }

    public void b(th<?> thVar) {
        this.a.remove(thVar);
    }

    @Override // defpackage.lg
    public void d() {
        Iterator it = ki.a(this.a).iterator();
        while (it.hasNext()) {
            ((th) it.next()).d();
        }
    }

    public void e() {
        this.a.clear();
    }

    public List<th<?>> f() {
        return ki.a(this.a);
    }
}
