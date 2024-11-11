package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.jd */
/* loaded from: classes.dex */
public final class C1340jd extends C1191a implements InterfaceC1310hd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1340jd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1310hd
    /* renamed from: a */
    public final void mo7910a(String str, String str2, Bundle bundle, long j) {
        Parcel m7503a = m7503a();
        m7503a.writeString(str);
        m7503a.writeString(str2);
        C1443r.m8260a(m7503a, bundle);
        m7503a.writeLong(j);
        m7505b(1, m7503a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1310hd
    public final int zza() {
        Parcel m7504a = m7504a(2, m7503a());
        int readInt = m7504a.readInt();
        m7504a.recycle();
        return readInt;
    }
}
