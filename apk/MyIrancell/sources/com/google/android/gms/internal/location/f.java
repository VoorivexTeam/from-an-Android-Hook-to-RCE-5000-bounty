package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class f extends a implements d {
    /* JADX INFO: Access modifiers changed from: package-private */
    public f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // com.google.android.gms.internal.location.d
    public final void a(zzad zzadVar) {
        Parcel a = a();
        b0.a(a, zzadVar);
        b(1, a);
    }
}
