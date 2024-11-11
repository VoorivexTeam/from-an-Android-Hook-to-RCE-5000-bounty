package p000;

/* renamed from: zk */
/* loaded from: classes.dex */
public final class C3532zk implements InterfaceC3179ru<C3169rk> {
    @Override // p000.InterfaceC3179ru
    /* renamed from: a */
    public void mo3695a(Object obj, Object obj2) {
        C3169rk c3169rk = (C3169rk) obj;
        InterfaceC3223su interfaceC3223su = (InterfaceC3223su) obj2;
        if (c3169rk.m15282c() != null) {
            interfaceC3223su.mo15457a("clientType", c3169rk.m15282c().name());
        }
        if (c3169rk.m15281b() != null) {
            interfaceC3223su.mo15457a("androidClientInfo", c3169rk.m15281b());
        }
    }
}
