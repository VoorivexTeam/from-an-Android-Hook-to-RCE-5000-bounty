package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.LocationSettingsRequest;

/* loaded from: classes.dex */
public final class h extends a implements g {
    /* JADX INFO: Access modifiers changed from: package-private */
    public h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // com.google.android.gms.internal.location.g
    public final void a(zzbf zzbfVar) {
        Parcel a = a();
        b0.a(a, zzbfVar);
        a(59, a);
    }

    @Override // com.google.android.gms.internal.location.g
    public final void a(zzo zzoVar) {
        Parcel a = a();
        b0.a(a, zzoVar);
        a(75, a);
    }

    @Override // com.google.android.gms.internal.location.g
    public final void a(LocationSettingsRequest locationSettingsRequest, i iVar, String str) {
        Parcel a = a();
        b0.a(a, locationSettingsRequest);
        b0.a(a, iVar);
        a.writeString(str);
        a(63, a);
    }

    @Override // com.google.android.gms.internal.location.g
    public final void d(boolean z) {
        Parcel a = a();
        b0.a(a, z);
        a(12, a);
    }
}
