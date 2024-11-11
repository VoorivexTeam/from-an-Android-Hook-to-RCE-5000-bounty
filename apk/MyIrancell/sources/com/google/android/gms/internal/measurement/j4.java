package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class j4 extends a implements k2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public j4(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.k2
    public final Bundle a(Bundle bundle) {
        Parcel a = a();
        r.a(a, bundle);
        Parcel a2 = a(1, a);
        Bundle bundle2 = (Bundle) r.a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle2;
    }
}
