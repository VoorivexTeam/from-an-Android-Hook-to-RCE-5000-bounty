package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
class dg implements kg {
    private final Set<lg> a = Collections.newSetFromMap(new WeakHashMap());
    private boolean b;
    private boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.c = true;
        Iterator it = ki.a(this.a).iterator();
        while (it.hasNext()) {
            ((lg) it.next()).d();
        }
    }

    @Override // defpackage.kg
    public void a(lg lgVar) {
        this.a.add(lgVar);
        if (this.c) {
            lgVar.d();
        } else if (this.b) {
            lgVar.a();
        } else {
            lgVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.b = true;
        Iterator it = ki.a(this.a).iterator();
        while (it.hasNext()) {
            ((lg) it.next()).a();
        }
    }

    @Override // defpackage.kg
    public void b(lg lgVar) {
        this.a.remove(lgVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.b = false;
        Iterator it = ki.a(this.a).iterator();
        while (it.hasNext()) {
            ((lg) it.next()).b();
        }
    }
}
