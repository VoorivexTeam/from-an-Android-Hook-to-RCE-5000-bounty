package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.common.internal.p */
/* loaded from: classes.dex */
final class C1044p implements InterfaceC1046q {

    /* renamed from: a */
    private final IBinder f6254a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1044p(IBinder iBinder) {
        this.f6254a = iBinder;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1046q
    /* renamed from: a */
    public final void mo7195a(InterfaceC1042o interfaceC1042o, GetServiceRequest getServiceRequest) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(interfaceC1042o != null ? interfaceC1042o.asBinder() : null);
            if (getServiceRequest != null) {
                obtain.writeInt(1);
                getServiceRequest.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6254a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6254a;
    }
}
