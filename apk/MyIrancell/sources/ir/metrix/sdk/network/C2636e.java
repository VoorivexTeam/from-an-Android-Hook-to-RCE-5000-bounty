package ir.metrix.sdk.network;

import ir.metrix.sdk.C2617ai;
import ir.metrix.sdk.GsonHelper;
import p000.a80;
import p000.d80;
import p000.g80;
import p000.gb0;
import p000.i80;
import p000.jb0;
import p000.na0;
import p000.wb0;

/* renamed from: ir.metrix.sdk.network.e */
/* loaded from: classes.dex */
public class C2636e {

    /* renamed from: a */
    private static gb0.C2507b f10794a;

    /* renamed from: b */
    private static gb0 f10795b;

    /* renamed from: c */
    private static na0.EnumC2981a f10796c;

    /* renamed from: d */
    private static na0 f10797d;

    /* renamed from: e */
    private static d80.C2379b f10798e;

    static {
        gb0.C2507b c2507b = new gb0.C2507b();
        c2507b.m11990a("https://analytics.metrix.ir");
        c2507b.m11992a(wb0.m16198a());
        c2507b.m11992a(jb0.m13440a(GsonHelper.m12497a()));
        f10794a = c2507b;
        f10795b = c2507b.m11994a();
        f10796c = na0.EnumC2981a.NONE;
        na0 na0Var = new na0();
        na0Var.m14308a(f10796c);
        f10797d = na0Var;
        f10798e = new d80.C2379b();
    }

    /* renamed from: a */
    public static <S> S m12672a(Class<S> cls) {
        if (!f10798e.m11339b().contains(f10797d)) {
            f10798e.m11333a(f10797d);
            f10798e.m11333a(new a80() { // from class: ir.metrix.sdk.network.e.1
                @Override // p000.a80
                public i80 intercept(a80.InterfaceC0010a interfaceC0010a) {
                    g80 mo99d = interfaceC0010a.mo99d();
                    g80.C2502a m11924f = mo99d.m11924f();
                    m11924f.m11933b("User-Agent", C2636e.m12673a());
                    m11924f.m11928a(mo99d.m11923e(), mo99d.m11918a());
                    return interfaceC0010a.mo96a(m11924f.m11932a());
                }
            });
            f10794a.m11989a(f10798e.m11336a());
            f10795b = f10794a.m11994a();
        }
        return (S) f10795b.m11981a(cls);
    }

    /* renamed from: a */
    static /* synthetic */ String m12673a() {
        return m12674b();
    }

    /* renamed from: b */
    private static String m12674b() {
        String property = System.getProperty("http.agent");
        if (property != null) {
            property = C2617ai.m12556e(property);
        }
        return (property == null || property.isEmpty()) ? "Android-Agent" : property;
    }
}
