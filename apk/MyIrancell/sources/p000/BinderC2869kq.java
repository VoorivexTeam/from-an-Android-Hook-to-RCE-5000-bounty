package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: kq */
/* loaded from: classes.dex */
public class BinderC2869kq extends Binder implements IInterface {
    /* JADX INFO: Access modifiers changed from: protected */
    public BinderC2869kq(String str) {
        attachInterface(this, str);
    }

    /* renamed from: a */
    protected boolean mo7184a(int i, Parcel parcel, Parcel parcel2, int i2) {
        return false;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        return mo7184a(i, parcel, parcel2, i2);
    }
}
