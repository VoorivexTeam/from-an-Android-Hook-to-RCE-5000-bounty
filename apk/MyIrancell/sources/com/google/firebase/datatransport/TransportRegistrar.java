package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.cct.C0764a;
import com.google.firebase.components.C2056d;
import com.google.firebase.components.C2066n;
import com.google.firebase.components.InterfaceC2057e;
import com.google.firebase.components.InterfaceC2060h;
import java.util.Collections;
import java.util.List;
import p000.C3491yl;
import p000.InterfaceC2863kk;

@Keep
/* loaded from: classes.dex */
public class TransportRegistrar implements InterfaceC2060h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ InterfaceC2863kk lambda$getComponents$0(InterfaceC2057e interfaceC2057e) {
        C3491yl.m16649a((Context) interfaceC2057e.mo10516a(Context.class));
        return C3491yl.m16651b().m16653a(C0764a.f5354g);
    }

    @Override // com.google.firebase.components.InterfaceC2060h
    public List<C2056d<?>> getComponents() {
        C2056d.b m10520a = C2056d.m10520a(InterfaceC2863kk.class);
        m10520a.m10540a(C2066n.m10571b(Context.class));
        m10520a.m10539a(C2076a.m10591a());
        return Collections.singletonList(m10520a.m10541b());
    }
}
