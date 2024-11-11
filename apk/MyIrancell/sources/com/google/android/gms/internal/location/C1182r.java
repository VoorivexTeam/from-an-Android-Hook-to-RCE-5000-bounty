package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC0864f;
import com.google.android.gms.common.api.internal.C0915k;
import com.google.android.gms.common.api.internal.InterfaceC0890e;
import com.google.android.gms.common.internal.C1022e;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.location.C1574b;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.location.r */
/* loaded from: classes.dex */
public final class C1182r extends C1163c0 {

    /* renamed from: G */
    private final C1175k f6444G;

    public C1182r(Context context, Looper looper, AbstractC0864f.b bVar, AbstractC0864f.c cVar, String str, @Nullable C1022e c1022e) {
        super(context, looper, bVar, cVar, str, c1022e);
        this.f6444G = new C1175k(context, this.f6432F);
    }

    /* renamed from: a */
    public final void m7495a(C0915k.a<C1574b> aVar, InterfaceC1164d interfaceC1164d) {
        this.f6444G.m7487a(aVar, interfaceC1164d);
    }

    /* renamed from: a */
    public final void m7496a(zzbd zzbdVar, C0915k<C1574b> c0915k, InterfaceC1164d interfaceC1164d) {
        synchronized (this.f6444G) {
            this.f6444G.m7488a(zzbdVar, c0915k, interfaceC1164d);
        }
    }

    /* renamed from: a */
    public final void m7497a(LocationSettingsRequest locationSettingsRequest, InterfaceC0890e<LocationSettingsResult> interfaceC0890e, @Nullable String str) {
        m7094s();
        C1057u.m7294a(locationSettingsRequest != null, "locationSettingsRequest can't be null nor empty.");
        C1057u.m7294a(interfaceC0890e != null, "listener can't be null.");
        ((InterfaceC1170g) m7070A()).mo7482a(locationSettingsRequest, new BinderC1184t(interfaceC0890e), str);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d, com.google.android.gms.common.api.C0859a.f
    /* renamed from: b */
    public final void mo6515b() {
        synchronized (this.f6444G) {
            if (m7084a()) {
                try {
                    this.f6444G.m7486a();
                    this.f6444G.m7490b();
                } catch (Exception unused) {
                }
            }
            super.mo6515b();
        }
    }
}
