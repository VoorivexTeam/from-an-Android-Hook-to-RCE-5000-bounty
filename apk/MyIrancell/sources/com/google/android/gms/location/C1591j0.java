package com.google.android.gms.location;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.location.C1158a;
import com.google.android.gms.internal.location.C1161b0;

/* renamed from: com.google.android.gms.location.j0 */
/* loaded from: classes.dex */
public final class C1591j0 extends C1158a implements InterfaceC1587h0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1591j0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationCallback");
    }

    @Override // com.google.android.gms.location.InterfaceC1587h0
    /* renamed from: a */
    public final void mo7492a(LocationAvailability locationAvailability) {
        Parcel m7466a = m7466a();
        C1161b0.m7473a(m7466a, locationAvailability);
        m7468b(2, m7466a);
    }

    @Override // com.google.android.gms.location.InterfaceC1587h0
    /* renamed from: a */
    public final void mo7493a(LocationResult locationResult) {
        Parcel m7466a = m7466a();
        C1161b0.m7473a(m7466a, locationResult);
        m7468b(1, m7466a);
    }
}
