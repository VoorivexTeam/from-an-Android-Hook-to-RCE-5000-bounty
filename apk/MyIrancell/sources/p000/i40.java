package p000;

import java.util.concurrent.TimeUnit;
import p000.a80;
import p000.d80;
import p000.g80;
import p000.gb0;
import p000.m70;
import p000.na0;

/* loaded from: classes.dex */
public final class i40 {

    /* renamed from: a */
    private static gb0 f10566a;

    /* renamed from: i40$a */
    /* loaded from: classes.dex */
    public static class C2578a implements a80 {
        @Override // p000.a80
        public final i80 intercept(a80.InterfaceC0010a interfaceC0010a) {
            g80.C2502a m11924f = interfaceC0010a.mo99d().m11924f();
            m11924f.m11933b("Authentication", "Basic c2l4ZGVlfHNpeGRlZQ==");
            m11924f.m11933b("Content-Type", "application/json; charset=utf8");
            return interfaceC0010a.mo96a(m11924f.m11932a());
        }
    }

    /* renamed from: a */
    public static gb0 m12365a() {
        na0 na0Var = new na0();
        na0Var.m14308a(na0.EnumC2981a.NONE);
        m70.C2925a c2925a = new m70.C2925a();
        c2925a.m14068a(q40.f12693a, new String[0]);
        m70 m14069a = c2925a.m14069a();
        d80.C2379b c2379b = new d80.C2379b();
        c2379b.m11335a(m14069a);
        c2379b.m11337b(60L, TimeUnit.SECONDS);
        c2379b.m11332a(60L, TimeUnit.SECONDS);
        c2379b.m11333a(na0Var);
        c2379b.m11338b(new C2578a());
        d80 m11336a = c2379b.m11336a();
        if (f10566a == null) {
            gb0.C2507b c2507b = new gb0.C2507b();
            c2507b.m11990a(q40.f12693a);
            c2507b.m11992a(jb0.m13439a());
            c2507b.m11989a(m11336a);
            f10566a = c2507b.m11994a();
        }
        return f10566a;
    }
}
