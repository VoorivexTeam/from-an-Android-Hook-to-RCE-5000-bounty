package defpackage;

/* loaded from: classes.dex */
public final class zk implements ru<rk> {
    @Override // defpackage.ru
    public void a(Object obj, Object obj2) {
        rk rkVar = (rk) obj;
        su suVar = (su) obj2;
        if (rkVar.c() != null) {
            suVar.a("clientType", rkVar.c().name());
        }
        if (rkVar.b() != null) {
            suVar.a("androidClientInfo", rkVar.b());
        }
    }
}
