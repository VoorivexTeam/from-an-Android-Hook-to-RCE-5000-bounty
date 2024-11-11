package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.j4 */
/* loaded from: classes.dex */
public final class C1331j4 extends C1191a implements InterfaceC1344k2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1331j4(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1344k2
    /* renamed from: a */
    public final Bundle mo7937a(Bundle bundle) {
        Parcel m7503a = m7503a();
        C1443r.m8260a(m7503a, bundle);
        Parcel m7504a = m7504a(1, m7503a);
        Bundle bundle2 = (Bundle) C1443r.m8258a(m7504a, Bundle.CREATOR);
        m7504a.recycle();
        return bundle2;
    }
}
