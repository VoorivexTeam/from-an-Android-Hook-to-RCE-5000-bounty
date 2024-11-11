package defpackage;

/* loaded from: classes.dex */
public final class cl implements ru<sk> {
    @Override // defpackage.ru
    public void a(Object obj, Object obj2) {
        sk skVar = (sk) obj;
        su suVar = (su) obj2;
        suVar.a("eventTimeMs", skVar.a()).a("eventUptimeMs", skVar.b()).a("timezoneOffsetSeconds", skVar.c());
        if (skVar.f() != null) {
            suVar.a("sourceExtension", skVar.f());
        }
        if (skVar.g() != null) {
            suVar.a("sourceExtensionJsonProto3", skVar.g());
        }
        if (skVar.d() != Integer.MIN_VALUE) {
            suVar.a("eventCode", skVar.d());
        }
        if (skVar.e() != null) {
            suVar.a("networkConnectionInfo", skVar.e());
        }
    }
}
