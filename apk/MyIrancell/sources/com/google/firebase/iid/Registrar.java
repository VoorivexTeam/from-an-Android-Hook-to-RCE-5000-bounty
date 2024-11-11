package com.google.firebase.iid;

import androidx.annotation.Keep;
import com.google.firebase.C2052c;
import com.google.firebase.components.C2056d;
import com.google.firebase.components.C2066n;
import com.google.firebase.components.InterfaceC2060h;
import java.util.Arrays;
import java.util.List;
import p000.C3141qv;
import p000.InterfaceC2360cv;
import p000.InterfaceC2487fv;
import p000.InterfaceC2567hv;
import p000.InterfaceC3180rv;

@Keep
/* loaded from: classes.dex */
public final class Registrar implements InterfaceC2060h {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.iid.Registrar$a */
    /* loaded from: classes.dex */
    public static class C2078a implements InterfaceC2567hv {
        public C2078a(FirebaseInstanceId firebaseInstanceId) {
        }
    }

    @Override // com.google.firebase.components.InterfaceC2060h
    @Keep
    public final List<C2056d<?>> getComponents() {
        C2056d.b m10520a = C2056d.m10520a(FirebaseInstanceId.class);
        m10520a.m10540a(C2066n.m10571b(C2052c.class));
        m10520a.m10540a(C2066n.m10571b(InterfaceC2360cv.class));
        m10520a.m10540a(C2066n.m10571b(InterfaceC3180rv.class));
        m10520a.m10540a(C2066n.m10571b(InterfaceC2487fv.class));
        m10520a.m10539a(C2107m.f8927a);
        m10520a.m10538a();
        C2056d m10541b = m10520a.m10541b();
        C2056d.b m10520a2 = C2056d.m10520a(InterfaceC2567hv.class);
        m10520a2.m10540a(C2066n.m10571b(FirebaseInstanceId.class));
        m10520a2.m10539a(C2109n.f8932a);
        return Arrays.asList(m10541b, m10520a2.m10541b(), C3141qv.m15134a("fire-iid", "20.0.2"));
    }
}
