package p000;

import android.content.Context;
import com.google.firebase.components.C2056d;
import com.google.firebase.components.C2066n;
import com.google.firebase.components.InterfaceC2057e;
import p000.InterfaceC2487fv;

/* renamed from: ev */
/* loaded from: classes.dex */
public class C2446ev implements InterfaceC2487fv {

    /* renamed from: a */
    private C2527gv f10041a;

    private C2446ev(Context context) {
        this.f10041a = C2527gv.m12040a(context);
    }

    /* renamed from: a */
    public static C2056d<InterfaceC2487fv> m11637a() {
        C2056d.b m10520a = C2056d.m10520a(InterfaceC2487fv.class);
        m10520a.m10540a(C2066n.m10571b(Context.class));
        m10520a.m10539a(C2403dv.m11486a());
        return m10520a.m10541b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ InterfaceC2487fv m11638a(InterfaceC2057e interfaceC2057e) {
        return new C2446ev((Context) interfaceC2057e.mo10516a(Context.class));
    }

    @Override // p000.InterfaceC2487fv
    /* renamed from: a */
    public InterfaceC2487fv.a mo11639a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean m12042a = this.f10041a.m12042a(str, currentTimeMillis);
        boolean m12041a = this.f10041a.m12041a(currentTimeMillis);
        return (m12042a && m12041a) ? InterfaceC2487fv.a.COMBINED : m12041a ? InterfaceC2487fv.a.GLOBAL : m12042a ? InterfaceC2487fv.a.SDK : InterfaceC2487fv.a.NONE;
    }
}
