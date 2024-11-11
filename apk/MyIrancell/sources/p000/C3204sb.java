package p000;

import com.bumptech.glide.load.InterfaceC0573g;
import java.util.HashMap;
import java.util.Map;

/* renamed from: sb */
/* loaded from: classes.dex */
final class C3204sb {

    /* renamed from: a */
    private final Map<InterfaceC0573g, C2891lb<?>> f13074a = new HashMap();

    /* renamed from: b */
    private final Map<InterfaceC0573g, C2891lb<?>> f13075b = new HashMap();

    /* renamed from: a */
    private Map<InterfaceC0573g, C2891lb<?>> m15390a(boolean z) {
        return z ? this.f13075b : this.f13074a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C2891lb<?> m15391a(InterfaceC0573g interfaceC0573g, boolean z) {
        return m15390a(z).get(interfaceC0573g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m15392a(InterfaceC0573g interfaceC0573g, C2891lb<?> c2891lb) {
        m15390a(c2891lb.m13854f()).put(interfaceC0573g, c2891lb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m15393b(InterfaceC0573g interfaceC0573g, C2891lb<?> c2891lb) {
        Map<InterfaceC0573g, C2891lb<?>> m15390a = m15390a(c2891lb.m13854f());
        if (c2891lb.equals(m15390a.get(interfaceC0573g))) {
            m15390a.remove(interfaceC0573g);
        }
    }
}
