package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.InterfaceC0890e;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: com.google.android.gms.internal.location.t */
/* loaded from: classes.dex */
final class BinderC1184t extends AbstractBinderC1174j {

    /* renamed from: a */
    private InterfaceC0890e<LocationSettingsResult> f6445a;

    public BinderC1184t(InterfaceC0890e<LocationSettingsResult> interfaceC0890e) {
        C1057u.m7294a(interfaceC0890e != null, "listener can't be null.");
        this.f6445a = interfaceC0890e;
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1173i
    /* renamed from: a */
    public final void mo7484a(LocationSettingsResult locationSettingsResult) {
        this.f6445a.mo6636a(locationSettingsResult);
        this.f6445a = null;
    }
}
