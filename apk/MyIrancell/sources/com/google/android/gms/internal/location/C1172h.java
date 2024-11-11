package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.LocationSettingsRequest;

/* renamed from: com.google.android.gms.internal.location.h */
/* loaded from: classes.dex */
public final class C1172h extends C1158a implements InterfaceC1170g {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1172h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1170g
    /* renamed from: a */
    public final void mo7480a(zzbf zzbfVar) {
        Parcel m7466a = m7466a();
        C1161b0.m7473a(m7466a, zzbfVar);
        m7467a(59, m7466a);
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1170g
    /* renamed from: a */
    public final void mo7481a(zzo zzoVar) {
        Parcel m7466a = m7466a();
        C1161b0.m7473a(m7466a, zzoVar);
        m7467a(75, m7466a);
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1170g
    /* renamed from: a */
    public final void mo7482a(LocationSettingsRequest locationSettingsRequest, InterfaceC1173i interfaceC1173i, String str) {
        Parcel m7466a = m7466a();
        C1161b0.m7473a(m7466a, locationSettingsRequest);
        C1161b0.m7472a(m7466a, interfaceC1173i);
        m7466a.writeString(str);
        m7467a(63, m7466a);
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1170g
    /* renamed from: d */
    public final void mo7483d(boolean z) {
        Parcel m7466a = m7466a();
        C1161b0.m7474a(m7466a, z);
        m7467a(12, m7466a);
    }
}
