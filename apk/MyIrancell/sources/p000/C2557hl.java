package p000;

/* renamed from: hl */
/* loaded from: classes.dex */
public final class C2557hl implements InterfaceC3179ru<C3362vk> {
    @Override // p000.InterfaceC3179ru
    /* renamed from: a */
    public void mo3695a(Object obj, Object obj2) {
        C3362vk c3362vk = (C3362vk) obj;
        InterfaceC3223su interfaceC3223su = (InterfaceC3223su) obj2;
        if (c3362vk.m16036b() != null) {
            interfaceC3223su.mo15457a("mobileSubtype", c3362vk.m16036b().name());
        }
        if (c3362vk.m16037c() != null) {
            interfaceC3223su.mo15457a("networkType", c3362vk.m16037c().name());
        }
    }
}
