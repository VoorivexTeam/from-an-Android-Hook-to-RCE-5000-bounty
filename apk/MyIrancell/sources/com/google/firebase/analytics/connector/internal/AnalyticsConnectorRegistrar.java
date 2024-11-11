package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.C2052c;
import com.google.firebase.components.C2056d;
import com.google.firebase.components.C2066n;
import com.google.firebase.components.InterfaceC2060h;
import java.util.Arrays;
import java.util.List;
import p000.C3141qv;
import p000.InterfaceC2360cv;
import p000.InterfaceC2910lu;

@Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements InterfaceC2060h {
    @Override // com.google.firebase.components.InterfaceC2060h
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<C2056d<?>> getComponents() {
        C2056d.b m10520a = C2056d.m10520a(InterfaceC2910lu.class);
        m10520a.m10540a(C2066n.m10571b(C2052c.class));
        m10520a.m10540a(C2066n.m10571b(Context.class));
        m10520a.m10540a(C2066n.m10571b(InterfaceC2360cv.class));
        m10520a.m10539a(C2050b.f8788a);
        m10520a.m10542c();
        return Arrays.asList(m10520a.m10541b(), C3141qv.m15134a("fire-analytics", "17.2.2"));
    }
}
