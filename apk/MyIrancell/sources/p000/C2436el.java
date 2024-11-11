package p000;

/* renamed from: el */
/* loaded from: classes.dex */
public final class C2436el implements InterfaceC3179ru<C3265tk> {
    @Override // p000.InterfaceC3179ru
    /* renamed from: a */
    public void mo3695a(Object obj, Object obj2) {
        C3265tk c3265tk = (C3265tk) obj;
        InterfaceC3223su interfaceC3223su = (InterfaceC3223su) obj2;
        interfaceC3223su.mo15456a("requestTimeMs", c3265tk.m15655f()).mo15456a("requestUptimeMs", c3265tk.m15656g());
        if (c3265tk.m15651b() != null) {
            interfaceC3223su.mo15457a("clientInfo", c3265tk.m15651b());
        }
        if (c3265tk.m15654e() != null) {
            interfaceC3223su.mo15457a("logSourceName", c3265tk.m15654e());
        } else {
            if (c3265tk.m15653d() == Integer.MIN_VALUE) {
                throw new C3140qu("Log request must have either LogSourceName or LogSource");
            }
            interfaceC3223su.mo15455a("logSource", c3265tk.m15653d());
        }
        if (c3265tk.m15652c().isEmpty()) {
            return;
        }
        interfaceC3223su.mo15457a("logEvent", c3265tk.m15652c());
    }
}
