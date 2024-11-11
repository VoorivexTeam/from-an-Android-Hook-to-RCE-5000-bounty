package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import p000.BinderC2869kq;

/* renamed from: com.google.android.gms.common.internal.t0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1056t0 extends BinderC2869kq implements InterfaceC1058u0 {
    /* renamed from: a */
    public static InterfaceC1058u0 m7284a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof InterfaceC1058u0 ? (InterfaceC1058u0) queryLocalInterface : new C1060v0(iBinder);
    }
}
