package defpackage;

import com.google.firebase.components.d;
import com.google.firebase.components.e;
import com.google.firebase.components.n;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class mv implements rv {
    private final String a;
    private final nv b;

    mv(Set<pv> set, nv nvVar) {
        this.a = a(set);
        this.b = nvVar;
    }

    private static String a(Set<pv> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<pv> it = set.iterator();
        while (it.hasNext()) {
            pv next = it.next();
            sb.append(next.a());
            sb.append('/');
            sb.append(next.b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ rv a(e eVar) {
        return new mv(eVar.b(pv.class), nv.b());
    }

    public static d<rv> b() {
        d.b a = d.a(rv.class);
        a.a(n.c(pv.class));
        a.a(lv.a());
        return a.b();
    }

    @Override // defpackage.rv
    public String a() {
        if (this.b.a().isEmpty()) {
            return this.a;
        }
        return this.a + ' ' + a(this.b.a());
    }
}
