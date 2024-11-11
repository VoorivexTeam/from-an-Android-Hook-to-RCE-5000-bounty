package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import defpackage.kq;

/* loaded from: classes.dex */
public abstract class t0 extends kq implements u0 {
    public static u0 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof u0 ? (u0) queryLocalInterface : new v0(iBinder);
    }
}
