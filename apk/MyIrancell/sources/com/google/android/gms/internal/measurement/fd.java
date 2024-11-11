package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class fd extends a implements pc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public fd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.pc
    public final void a(Bundle bundle) {
        Parcel a = a();
        r.a(a, bundle);
        b(1, a);
    }
}
