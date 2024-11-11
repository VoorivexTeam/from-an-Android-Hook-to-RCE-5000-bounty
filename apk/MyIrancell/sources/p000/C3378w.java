package p000;

import android.content.res.ColorStateList;

/* renamed from: w */
/* loaded from: classes.dex */
class C3378w implements InterfaceC3506z {
    /* renamed from: j */
    private C0001a0 m16069j(InterfaceC3457y interfaceC3457y) {
        return (C0001a0) interfaceC3457y.m16529d();
    }

    @Override // p000.InterfaceC3506z
    /* renamed from: a */
    public float mo16070a(InterfaceC3457y interfaceC3457y) {
        return m16069j(interfaceC3457y).m14b();
    }

    @Override // p000.InterfaceC3506z
    /* renamed from: a */
    public void mo15885a() {
    }

    @Override // p000.InterfaceC3506z
    /* renamed from: a */
    public void mo16071a(InterfaceC3457y interfaceC3457y, float f) {
        m16069j(interfaceC3457y).m11a(f);
    }

    @Override // p000.InterfaceC3506z
    /* renamed from: a */
    public void mo16072a(InterfaceC3457y interfaceC3457y, ColorStateList colorStateList) {
        m16069j(interfaceC3457y).m13a(colorStateList);
    }

    @Override // p000.InterfaceC3506z
    /* renamed from: b */
    public ColorStateList mo16073b(InterfaceC3457y interfaceC3457y) {
        return m16069j(interfaceC3457y).m10a();
    }

    @Override // p000.InterfaceC3506z
    /* renamed from: b */
    public void mo16074b(InterfaceC3457y interfaceC3457y, float f) {
        interfaceC3457y.m16524a().setElevation(f);
    }

    @Override // p000.InterfaceC3506z
    /* renamed from: c */
    public float mo16075c(InterfaceC3457y interfaceC3457y) {
        return interfaceC3457y.m16524a().getElevation();
    }

    @Override // p000.InterfaceC3506z
    /* renamed from: c */
    public void mo16076c(InterfaceC3457y interfaceC3457y, float f) {
        m16069j(interfaceC3457y).m12a(f, interfaceC3457y.m16528c(), interfaceC3457y.m16527b());
        m16082i(interfaceC3457y);
    }

    @Override // p000.InterfaceC3506z
    /* renamed from: d */
    public float mo16077d(InterfaceC3457y interfaceC3457y) {
        return m16069j(interfaceC3457y).m15c();
    }

    @Override // p000.InterfaceC3506z
    /* renamed from: e */
    public float mo16078e(InterfaceC3457y interfaceC3457y) {
        return mo16077d(interfaceC3457y) * 2.0f;
    }

    @Override // p000.InterfaceC3506z
    /* renamed from: f */
    public float mo16079f(InterfaceC3457y interfaceC3457y) {
        return mo16077d(interfaceC3457y) * 2.0f;
    }

    @Override // p000.InterfaceC3506z
    /* renamed from: g */
    public void mo16080g(InterfaceC3457y interfaceC3457y) {
        mo16076c(interfaceC3457y, mo16070a(interfaceC3457y));
    }

    @Override // p000.InterfaceC3506z
    /* renamed from: h */
    public void mo16081h(InterfaceC3457y interfaceC3457y) {
        mo16076c(interfaceC3457y, mo16070a(interfaceC3457y));
    }

    /* renamed from: i */
    public void m16082i(InterfaceC3457y interfaceC3457y) {
        if (!interfaceC3457y.m16528c()) {
            interfaceC3457y.m16526a(0, 0, 0, 0);
            return;
        }
        float mo16070a = mo16070a(interfaceC3457y);
        float mo16077d = mo16077d(interfaceC3457y);
        int ceil = (int) Math.ceil(C0443b0.m3238a(mo16070a, mo16077d, interfaceC3457y.m16527b()));
        int ceil2 = (int) Math.ceil(C0443b0.m3241b(mo16070a, mo16077d, interfaceC3457y.m16527b()));
        interfaceC3457y.m16526a(ceil, ceil2, ceil, ceil2);
    }
}
