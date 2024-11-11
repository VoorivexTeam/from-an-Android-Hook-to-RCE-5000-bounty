package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.C2052c;
import com.google.firebase.components.C2056d;
import com.google.firebase.components.C2066n;
import com.google.firebase.components.InterfaceC2060h;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Arrays;
import java.util.List;
import p000.AbstractC2516gk;
import p000.C2476fk;
import p000.InterfaceC2598ik;
import p000.InterfaceC2818jk;
import p000.InterfaceC2863kk;

@Keep
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements InterfaceC2060h {

    /* renamed from: com.google.firebase.messaging.FirebaseMessagingRegistrar$a */
    /* loaded from: classes.dex */
    public static class C2136a implements InterfaceC2863kk {
        @Override // p000.InterfaceC2863kk
        /* renamed from: a */
        public final <T> InterfaceC2818jk<T> mo10740a(String str, Class<T> cls, C2476fk c2476fk, InterfaceC2598ik<T, byte[]> interfaceC2598ik) {
            return new C2137b();
        }
    }

    /* renamed from: com.google.firebase.messaging.FirebaseMessagingRegistrar$b */
    /* loaded from: classes.dex */
    private static class C2137b<T> implements InterfaceC2818jk<T> {
        private C2137b() {
        }

        @Override // p000.InterfaceC2818jk
        /* renamed from: a */
        public final void mo10741a(AbstractC2516gk<T> abstractC2516gk) {
        }
    }

    @Override // com.google.firebase.components.InterfaceC2060h
    @Keep
    public List<C2056d<?>> getComponents() {
        C2056d.b m10520a = C2056d.m10520a(FirebaseMessaging.class);
        m10520a.m10540a(C2066n.m10571b(C2052c.class));
        m10520a.m10540a(C2066n.m10571b(FirebaseInstanceId.class));
        m10520a.m10540a(C2066n.m10570a(InterfaceC2863kk.class));
        m10520a.m10539a(C2150l.f9026a);
        m10520a.m10538a();
        return Arrays.asList(m10520a.m10541b());
    }
}
