package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: sg */
/* loaded from: classes.dex */
public final class C3209sg implements InterfaceC2896lg {

    /* renamed from: a */
    private final Set<InterfaceC3262th<?>> f13113a = Collections.newSetFromMap(new WeakHashMap());

    @Override // p000.InterfaceC2896lg
    /* renamed from: a */
    public void mo3931a() {
        Iterator it = C2861ki.m13726a(this.f13113a).iterator();
        while (it.hasNext()) {
            ((InterfaceC3262th) it.next()).mo3931a();
        }
    }

    /* renamed from: a */
    public void m15431a(InterfaceC3262th<?> interfaceC3262th) {
        this.f13113a.add(interfaceC3262th);
    }

    @Override // p000.InterfaceC2896lg
    /* renamed from: b */
    public void mo3936b() {
        Iterator it = C2861ki.m13726a(this.f13113a).iterator();
        while (it.hasNext()) {
            ((InterfaceC3262th) it.next()).mo3936b();
        }
    }

    /* renamed from: b */
    public void m15432b(InterfaceC3262th<?> interfaceC3262th) {
        this.f13113a.remove(interfaceC3262th);
    }

    @Override // p000.InterfaceC2896lg
    /* renamed from: d */
    public void mo3938d() {
        Iterator it = C2861ki.m13726a(this.f13113a).iterator();
        while (it.hasNext()) {
            ((InterfaceC3262th) it.next()).mo3938d();
        }
    }

    /* renamed from: e */
    public void m15433e() {
        this.f13113a.clear();
    }

    /* renamed from: f */
    public List<InterfaceC3262th<?>> m15434f() {
        return C2861ki.m13726a(this.f13113a);
    }
}
