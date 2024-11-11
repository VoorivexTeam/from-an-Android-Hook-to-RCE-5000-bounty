package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;

/* renamed from: com.google.firebase.iid.v0 */
/* loaded from: classes.dex */
public final class C2126v0 implements InterfaceC2120s0 {

    /* renamed from: a */
    private final IBinder f8974a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2126v0(IBinder iBinder) {
        this.f8974a = iBinder;
    }

    @Override // com.google.firebase.iid.InterfaceC2120s0
    /* renamed from: a */
    public final void mo10689a(Message message) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
        obtain.writeInt(1);
        message.writeToParcel(obtain, 0);
        try {
            this.f8974a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8974a;
    }
}
