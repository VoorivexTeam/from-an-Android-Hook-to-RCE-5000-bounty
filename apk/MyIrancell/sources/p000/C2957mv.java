package p000;

import com.google.firebase.components.C2056d;
import com.google.firebase.components.C2066n;
import com.google.firebase.components.InterfaceC2057e;
import java.util.Iterator;
import java.util.Set;

/* renamed from: mv */
/* loaded from: classes.dex */
public class C2957mv implements InterfaceC3180rv {

    /* renamed from: a */
    private final String f12183a;

    /* renamed from: b */
    private final C3003nv f12184b;

    C2957mv(Set<AbstractC3099pv> set, C3003nv c3003nv) {
        this.f12183a = m14181a(set);
        this.f12184b = c3003nv;
    }

    /* renamed from: a */
    private static String m14181a(Set<AbstractC3099pv> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<AbstractC3099pv> it = set.iterator();
        while (it.hasNext()) {
            AbstractC3099pv next = it.next();
            sb.append(next.mo13751a());
            sb.append('/');
            sb.append(next.mo13752b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ InterfaceC3180rv m14182a(InterfaceC2057e interfaceC2057e) {
        return new C2957mv(interfaceC2057e.mo10517b(AbstractC3099pv.class), C3003nv.m14392b());
    }

    /* renamed from: b */
    public static C2056d<InterfaceC3180rv> m14183b() {
        C2056d.b m10520a = C2056d.m10520a(InterfaceC3180rv.class);
        m10520a.m10540a(C2066n.m10572c(AbstractC3099pv.class));
        m10520a.m10539a(C2911lv.m13933a());
        return m10520a.m10541b();
    }

    @Override // p000.InterfaceC3180rv
    /* renamed from: a */
    public String mo14184a() {
        if (this.f12184b.m14393a().isEmpty()) {
            return this.f12183a;
        }
        return this.f12183a + ' ' + m14181a(this.f12184b.m14393a());
    }
}
