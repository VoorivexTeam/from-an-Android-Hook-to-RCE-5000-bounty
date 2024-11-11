package p000;

/* renamed from: ok */
/* loaded from: classes.dex */
public final class C3038ok implements InterfaceC3179ru<C3088pk> {
    @Override // p000.InterfaceC3179ru
    /* renamed from: a */
    public void mo3695a(Object obj, Object obj2) {
        C3088pk c3088pk = (C3088pk) obj;
        InterfaceC3223su interfaceC3223su = (InterfaceC3223su) obj2;
        if (c3088pk.m14800i() != Integer.MIN_VALUE) {
            interfaceC3223su.mo15455a("sdkVersion", c3088pk.m14800i());
        }
        if (c3088pk.m14797f() != null) {
            interfaceC3223su.mo15457a("model", c3088pk.m14797f());
        }
        if (c3088pk.m14795d() != null) {
            interfaceC3223su.mo15457a("hardware", c3088pk.m14795d());
        }
        if (c3088pk.m14793b() != null) {
            interfaceC3223su.mo15457a("device", c3088pk.m14793b());
        }
        if (c3088pk.m14799h() != null) {
            interfaceC3223su.mo15457a("product", c3088pk.m14799h());
        }
        if (c3088pk.m14798g() != null) {
            interfaceC3223su.mo15457a("osBuild", c3088pk.m14798g());
        }
        if (c3088pk.m14796e() != null) {
            interfaceC3223su.mo15457a("manufacturer", c3088pk.m14796e());
        }
        if (c3088pk.m14794c() != null) {
            interfaceC3223su.mo15457a("fingerprint", c3088pk.m14794c());
        }
    }
}
