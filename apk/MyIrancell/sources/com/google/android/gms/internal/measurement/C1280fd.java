package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.fd */
/* loaded from: classes.dex */
public final class C1280fd extends C1191a implements InterfaceC1428pc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1280fd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1428pc
    /* renamed from: a */
    public final void mo7833a(Bundle bundle) {
        Parcel m7503a = m7503a();
        C1443r.m8260a(m7503a, bundle);
        m7505b(1, m7503a);
    }
}
