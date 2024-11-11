package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: dg */
/* loaded from: classes.dex */
class C2388dg implements InterfaceC2859kg {

    /* renamed from: a */
    private final Set<InterfaceC2896lg> f9808a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private boolean f9809b;

    /* renamed from: c */
    private boolean f9810c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m11365a() {
        this.f9810c = true;
        Iterator it = C2861ki.m13726a(this.f9808a).iterator();
        while (it.hasNext()) {
            ((InterfaceC2896lg) it.next()).mo3938d();
        }
    }

    @Override // p000.InterfaceC2859kg
    /* renamed from: a */
    public void mo11366a(InterfaceC2896lg interfaceC2896lg) {
        this.f9808a.add(interfaceC2896lg);
        if (this.f9810c) {
            interfaceC2896lg.mo3938d();
        } else if (this.f9809b) {
            interfaceC2896lg.mo3931a();
        } else {
            interfaceC2896lg.mo3936b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m11367b() {
        this.f9809b = true;
        Iterator it = C2861ki.m13726a(this.f9808a).iterator();
        while (it.hasNext()) {
            ((InterfaceC2896lg) it.next()).mo3931a();
        }
    }

    @Override // p000.InterfaceC2859kg
    /* renamed from: b */
    public void mo11368b(InterfaceC2896lg interfaceC2896lg) {
        this.f9808a.remove(interfaceC2896lg);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m11369c() {
        this.f9809b = false;
        Iterator it = C2861ki.m13726a(this.f9808a).iterator();
        while (it.hasNext()) {
            ((InterfaceC2896lg) it.next()).mo3936b();
        }
    }
}
