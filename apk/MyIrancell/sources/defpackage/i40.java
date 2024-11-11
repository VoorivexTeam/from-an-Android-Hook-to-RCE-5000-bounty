package defpackage;

import defpackage.a80;
import defpackage.d80;
import defpackage.g80;
import defpackage.gb0;
import defpackage.m70;
import defpackage.na0;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class i40 {
    private static gb0 a;

    /* loaded from: classes.dex */
    public static class a implements a80 {
        @Override // defpackage.a80
        public final i80 intercept(a80.a aVar) {
            g80.a f = aVar.d().f();
            f.b("Authentication", "Basic c2l4ZGVlfHNpeGRlZQ==");
            f.b("Content-Type", "application/json; charset=utf8");
            return aVar.a(f.a());
        }
    }

    public static gb0 a() {
        na0 na0Var = new na0();
        na0Var.a(na0.a.NONE);
        m70.a aVar = new m70.a();
        aVar.a(q40.a, new String[0]);
        m70 a2 = aVar.a();
        d80.b bVar = new d80.b();
        bVar.a(a2);
        bVar.b(60L, TimeUnit.SECONDS);
        bVar.a(60L, TimeUnit.SECONDS);
        bVar.a(na0Var);
        bVar.b(new a());
        d80 a3 = bVar.a();
        if (a == null) {
            gb0.b bVar2 = new gb0.b();
            bVar2.a(q40.a);
            bVar2.a(jb0.a());
            bVar2.a(a3);
            a = bVar2.a();
        }
        return a;
    }
}
