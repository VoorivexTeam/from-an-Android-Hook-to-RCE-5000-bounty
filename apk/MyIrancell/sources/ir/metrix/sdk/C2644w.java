package ir.metrix.sdk;

/* renamed from: ir.metrix.sdk.w */
/* loaded from: classes.dex */
public class C2644w {

    /* renamed from: a */
    private static C2644w f10837a;

    /* renamed from: b */
    private String f10838b = null;

    private C2644w() {
    }

    /* renamed from: a */
    public static synchronized C2644w m12685a() {
        C2644w c2644w;
        synchronized (C2644w.class) {
            if (f10837a == null) {
                f10837a = new C2644w();
            }
            c2644w = f10837a;
        }
        return c2644w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m12686a(String str) {
        this.f10838b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public String m12687b() {
        return this.f10838b;
    }
}
