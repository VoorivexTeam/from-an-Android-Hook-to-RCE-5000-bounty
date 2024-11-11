package p000;

/* renamed from: cl */
/* loaded from: classes.dex */
public final class C0526cl implements InterfaceC3179ru<C3213sk> {
    @Override // p000.InterfaceC3179ru
    /* renamed from: a */
    public void mo3695a(Object obj, Object obj2) {
        C3213sk c3213sk = (C3213sk) obj;
        InterfaceC3223su interfaceC3223su = (InterfaceC3223su) obj2;
        interfaceC3223su.mo15456a("eventTimeMs", c3213sk.mo3417a()).mo15456a("eventUptimeMs", c3213sk.mo3418b()).mo15456a("timezoneOffsetSeconds", c3213sk.mo3419c());
        if (c3213sk.m15441f() != null) {
            interfaceC3223su.mo15457a("sourceExtension", c3213sk.m15441f());
        }
        if (c3213sk.m15442g() != null) {
            interfaceC3223su.mo15457a("sourceExtensionJsonProto3", c3213sk.m15442g());
        }
        if (c3213sk.m15439d() != Integer.MIN_VALUE) {
            interfaceC3223su.mo15455a("eventCode", c3213sk.m15439d());
        }
        if (c3213sk.m15440e() != null) {
            interfaceC3223su.mo15457a("networkConnectionInfo", c3213sk.m15440e());
        }
    }
}
