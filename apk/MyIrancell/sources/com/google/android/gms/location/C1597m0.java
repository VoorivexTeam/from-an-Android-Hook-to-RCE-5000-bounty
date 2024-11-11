package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.location.C1158a;
import com.google.android.gms.internal.location.C1161b0;

/* renamed from: com.google.android.gms.location.m0 */
/* loaded from: classes.dex */
public final class C1597m0 extends C1158a implements InterfaceC1593k0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1597m0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationListener");
    }

    @Override // com.google.android.gms.location.InterfaceC1593k0
    /* renamed from: a */
    public final void mo7494a(Location location) {
        Parcel m7466a = m7466a();
        C1161b0.m7473a(m7466a, location);
        m7468b(1, m7466a);
    }
}
