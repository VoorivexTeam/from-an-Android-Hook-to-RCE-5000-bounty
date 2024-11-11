package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.measurement.k5 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1347k5 extends BinderC1328j1 implements InterfaceC1344k2 {
    /* renamed from: a */
    public static InterfaceC1344k2 m7953a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof InterfaceC1344k2 ? (InterfaceC1344k2) queryLocalInterface : new C1331j4(iBinder);
    }
}
