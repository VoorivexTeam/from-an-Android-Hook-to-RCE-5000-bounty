package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: aq */
/* loaded from: classes.dex */
public class BinderC0432aq extends Binder implements IInterface {
    /* JADX INFO: Access modifiers changed from: protected */
    public BinderC0432aq(String str) {
        attachInterface(this, str);
    }

    /* renamed from: a */
    protected boolean mo3179a(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw null;
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
        return mo3179a(i, parcel, parcel2, i2);
    }
}
