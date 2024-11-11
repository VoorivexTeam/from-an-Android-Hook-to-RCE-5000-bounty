package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.j1 */
/* loaded from: classes.dex */
public class BinderC1328j1 extends Binder implements IInterface {
    /* JADX INFO: Access modifiers changed from: protected */
    public BinderC1328j1(String str) {
        attachInterface(this, str);
    }

    /* renamed from: a */
    protected boolean mo7857a(int i, Parcel parcel, Parcel parcel2, int i2) {
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
        return mo7857a(i, parcel, parcel2, i2);
    }
}
