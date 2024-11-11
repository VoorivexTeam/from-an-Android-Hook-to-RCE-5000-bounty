package defpackage;

import com.bumptech.glide.load.g;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class sb {
    private final Map<g, lb<?>> a = new HashMap();
    private final Map<g, lb<?>> b = new HashMap();

    private Map<g, lb<?>> a(boolean z) {
        return z ? this.b : this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public lb<?> a(g gVar, boolean z) {
        return a(z).get(gVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(g gVar, lb<?> lbVar) {
        a(lbVar.f()).put(gVar, lbVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(g gVar, lb<?> lbVar) {
        Map<g, lb<?>> a = a(lbVar.f());
        if (lbVar.equals(a.get(gVar))) {
            a.remove(gVar);
        }
    }
}
