package com.google.android.gms.location;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class j0 extends com.google.android.gms.internal.location.a implements h0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public j0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationCallback");
    }

    @Override // com.google.android.gms.location.h0
    public final void a(LocationAvailability locationAvailability) {
        Parcel a = a();
        com.google.android.gms.internal.location.b0.a(a, locationAvailability);
        b(2, a);
    }

    @Override // com.google.android.gms.location.h0
    public final void a(LocationResult locationResult) {
        Parcel a = a();
        com.google.android.gms.internal.location.b0.a(a, locationResult);
        b(1, a);
    }
}
