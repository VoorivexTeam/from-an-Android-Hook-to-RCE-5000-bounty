package p000;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: lp */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2905lp extends BinderC2603ip implements InterfaceC2868kp {
    /* renamed from: a */
    public static InterfaceC2868kp m13922a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof InterfaceC2868kp ? (InterfaceC2868kp) queryLocalInterface : new C2951mp(iBinder);
    }
}
