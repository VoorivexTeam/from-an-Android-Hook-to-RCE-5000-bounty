package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.zzj;
import defpackage.fp;
import defpackage.lq;
import defpackage.mq;

/* loaded from: classes.dex */
public final class v0 extends lq implements u0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public v0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.u0
    public final boolean a(zzj zzjVar, fp fpVar) {
        Parcel zza = zza();
        mq.a(zza, zzjVar);
        mq.a(zza, fpVar);
        Parcel a = a(5, zza);
        boolean a2 = mq.a(a);
        a.recycle();
        return a2;
    }
}
