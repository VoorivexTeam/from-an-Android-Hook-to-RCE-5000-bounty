package p000;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: nr */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2999nr extends BinderC3095pr implements InterfaceC2953mr {
    /* renamed from: a */
    public static InterfaceC2953mr m14382a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        return queryLocalInterface instanceof InterfaceC2953mr ? (InterfaceC2953mr) queryLocalInterface : new C3056or(iBinder);
    }
}
