package defpackage;

/* loaded from: classes.dex */
public final class hl implements ru<vk> {
    @Override // defpackage.ru
    public void a(Object obj, Object obj2) {
        vk vkVar = (vk) obj;
        su suVar = (su) obj2;
        if (vkVar.b() != null) {
            suVar.a("mobileSubtype", vkVar.b().name());
        }
        if (vkVar.c() != null) {
            suVar.a("networkType", vkVar.c().name());
        }
    }
}
