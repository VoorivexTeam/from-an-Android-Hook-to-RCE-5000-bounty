package defpackage;

import defpackage.a80;
import defpackage.d80;
import defpackage.g80;
import defpackage.gb0;
import defpackage.na0;

/* loaded from: classes.dex */
public class n50 {
    private static gb0 a;
    private static na0.a b = na0.a.NONE;
    private static na0 c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements a80 {
        private b() {
        }

        @Override // defpackage.a80
        public i80 intercept(a80.a aVar) {
            g80 d = aVar.d();
            g80.a f = d.f();
            f.b("User-Agent", z40.K().h());
            f.a(d.e(), d.a());
            return aVar.a(f.a());
        }
    }

    static {
        na0 na0Var = new na0();
        na0Var.a(b);
        c = na0Var;
    }

    private static synchronized gb0 a() {
        gb0 gb0Var;
        synchronized (n50.class) {
            if (a == null) {
                d80.b bVar = new d80.b();
                bVar.a(c);
                bVar.a(new b());
                bVar.a(new o50());
                d80 a2 = bVar.a();
                gb0.b bVar2 = new gb0.b();
                bVar2.a(a2);
                bVar2.a("https://api.tapsell.ir/v2/");
                bVar2.a(jb0.a());
                a = bVar2.a();
            }
            gb0Var = a;
        }
        return gb0Var;
    }

    public static <S> S a(Class<S> cls) {
        return (S) a().a(cls);
    }
}
