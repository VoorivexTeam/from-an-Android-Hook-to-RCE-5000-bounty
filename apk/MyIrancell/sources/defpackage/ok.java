package defpackage;

/* loaded from: classes.dex */
public final class ok implements ru<pk> {
    @Override // defpackage.ru
    public void a(Object obj, Object obj2) {
        pk pkVar = (pk) obj;
        su suVar = (su) obj2;
        if (pkVar.i() != Integer.MIN_VALUE) {
            suVar.a("sdkVersion", pkVar.i());
        }
        if (pkVar.f() != null) {
            suVar.a("model", pkVar.f());
        }
        if (pkVar.d() != null) {
            suVar.a("hardware", pkVar.d());
        }
        if (pkVar.b() != null) {
            suVar.a("device", pkVar.b());
        }
        if (pkVar.h() != null) {
            suVar.a("product", pkVar.h());
        }
        if (pkVar.g() != null) {
            suVar.a("osBuild", pkVar.g());
        }
        if (pkVar.e() != null) {
            suVar.a("manufacturer", pkVar.e());
        }
        if (pkVar.c() != null) {
            suVar.a("fingerprint", pkVar.c());
        }
    }
}
