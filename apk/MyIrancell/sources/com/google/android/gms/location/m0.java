package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class m0 extends com.google.android.gms.internal.location.a implements k0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public m0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationListener");
    }

    @Override // com.google.android.gms.location.k0
    public final void a(Location location) {
        Parcel a = a();
        com.google.android.gms.internal.location.b0.a(a, location);
        b(1, a);
    }
}
