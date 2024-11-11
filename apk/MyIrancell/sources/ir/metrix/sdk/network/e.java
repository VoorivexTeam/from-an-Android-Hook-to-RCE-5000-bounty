package ir.metrix.sdk.network;

import defpackage.a80;
import defpackage.d80;
import defpackage.g80;
import defpackage.gb0;
import defpackage.i80;
import defpackage.jb0;
import defpackage.na0;
import defpackage.wb0;
import ir.metrix.sdk.GsonHelper;
import ir.metrix.sdk.ai;

/* loaded from: classes.dex */
public class e {
    private static gb0.b a;
    private static gb0 b;
    private static na0.a c;
    private static na0 d;
    private static d80.b e;

    static {
        gb0.b bVar = new gb0.b();
        bVar.a("https://analytics.metrix.ir");
        bVar.a(wb0.a());
        bVar.a(jb0.a(GsonHelper.a()));
        a = bVar;
        b = bVar.a();
        c = na0.a.NONE;
        na0 na0Var = new na0();
        na0Var.a(c);
        d = na0Var;
        e = new d80.b();
    }

    public static <S> S a(Class<S> cls) {
        if (!e.b().contains(d)) {
            e.a(d);
            e.a(new a80() { // from class: ir.metrix.sdk.network.e.1
                @Override // defpackage.a80
                public i80 intercept(a80.a aVar) {
                    g80 d2 = aVar.d();
                    g80.a f = d2.f();
                    f.b("User-Agent", e.a());
                    f.a(d2.e(), d2.a());
                    return aVar.a(f.a());
                }
            });
            a.a(e.a());
            b = a.a();
        }
        return (S) b.a(cls);
    }

    static /* synthetic */ String a() {
        return b();
    }

    private static String b() {
        String property = System.getProperty("http.agent");
        if (property != null) {
            property = ai.e(property);
        }
        return (property == null || property.isEmpty()) ? "Android-Agent" : property;
    }
}
