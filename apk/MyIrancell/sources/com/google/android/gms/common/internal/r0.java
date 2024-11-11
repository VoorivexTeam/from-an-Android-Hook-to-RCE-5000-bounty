package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.fp;
import defpackage.lq;

/* loaded from: classes.dex */
public final class r0 extends lq implements q0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public r0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.q0
    public final int b() {
        Parcel a = a(2, zza());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.common.internal.q0
    public final fp zzb() {
        Parcel a = a(1, zza());
        fp a2 = fp.a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
