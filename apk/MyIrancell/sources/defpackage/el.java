package defpackage;

/* loaded from: classes.dex */
public final class el implements ru<tk> {
    @Override // defpackage.ru
    public void a(Object obj, Object obj2) {
        tk tkVar = (tk) obj;
        su suVar = (su) obj2;
        suVar.a("requestTimeMs", tkVar.f()).a("requestUptimeMs", tkVar.g());
        if (tkVar.b() != null) {
            suVar.a("clientInfo", tkVar.b());
        }
        if (tkVar.e() != null) {
            suVar.a("logSourceName", tkVar.e());
        } else {
            if (tkVar.d() == Integer.MIN_VALUE) {
                throw new qu("Log request must have either LogSourceName or LogSource");
            }
            suVar.a("logSource", tkVar.d());
        }
        if (tkVar.c().isEmpty()) {
            return;
        }
        suVar.a("logEvent", tkVar.c());
    }
}
