package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.fp;
import defpackage.kq;
import defpackage.mq;

/* loaded from: classes.dex */
public abstract class s0 extends kq implements q0 {
    public s0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static q0 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof q0 ? (q0) queryLocalInterface : new r0(iBinder);
    }

    @Override // defpackage.kq
    protected final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            fp zzb = zzb();
            parcel2.writeNoException();
            mq.a(parcel2, zzb);
        } else {
            if (i != 2) {
                return false;
            }
            int b = b();
            parcel2.writeNoException();
            parcel2.writeInt(b);
        }
        return true;
    }
}
