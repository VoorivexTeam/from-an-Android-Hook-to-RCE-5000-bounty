package p000;

import p000.a80;
import p000.d80;
import p000.g80;
import p000.gb0;
import p000.na0;

/* loaded from: classes.dex */
public class n50 {

    /* renamed from: a */
    private static gb0 f12217a;

    /* renamed from: b */
    private static na0.EnumC2981a f12218b = na0.EnumC2981a.NONE;

    /* renamed from: c */
    private static na0 f12219c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n50$b */
    /* loaded from: classes.dex */
    public static class C2970b implements a80 {
        private C2970b() {
        }

        @Override // p000.a80
        public i80 intercept(a80.InterfaceC0010a interfaceC0010a) {
            g80 mo99d = interfaceC0010a.mo99d();
            g80.C2502a m11924f = mo99d.m11924f();
            m11924f.m11933b("User-Agent", z40.m16734K().m16751h());
            m11924f.m11928a(mo99d.m11923e(), mo99d.m11918a());
            return interfaceC0010a.mo96a(m11924f.m11932a());
        }
    }

    static {
        na0 na0Var = new na0();
        na0Var.m14308a(f12218b);
        f12219c = na0Var;
    }

    /* renamed from: a */
    private static synchronized gb0 m14235a() {
        gb0 gb0Var;
        synchronized (n50.class) {
            if (f12217a == null) {
                d80.C2379b c2379b = new d80.C2379b();
                c2379b.m11333a(f12219c);
                c2379b.m11333a(new C2970b());
                c2379b.m11334a(new o50());
                d80 m11336a = c2379b.m11336a();
                gb0.C2507b c2507b = new gb0.C2507b();
                c2507b.m11989a(m11336a);
                c2507b.m11990a("https://api.tapsell.ir/v2/");
                c2507b.m11992a(jb0.m13439a());
                f12217a = c2507b.m11994a();
            }
            gb0Var = f12217a;
        }
        return gb0Var;
    }

    /* renamed from: a */
    public static <S> S m14236a(Class<S> cls) {
        return (S) m14235a().m11981a(cls);
    }
}
