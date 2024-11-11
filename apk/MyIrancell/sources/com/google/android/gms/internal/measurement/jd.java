package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class jd extends a implements hd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public jd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.hd
    public final void a(String str, String str2, Bundle bundle, long j) {
        Parcel a = a();
        a.writeString(str);
        a.writeString(str2);
        r.a(a, bundle);
        a.writeLong(j);
        b(1, a);
    }

    @Override // com.google.android.gms.internal.measurement.hd
    public final int zza() {
        Parcel a = a(2, a());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
