package p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: do */
/* loaded from: classes.dex */
public interface InterfaceC2396do extends IInterface {

    /* renamed from: do$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements InterfaceC2396do {

        /* renamed from: do$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C3565a implements InterfaceC2396do {

            /* renamed from: a */
            private IBinder f9874a;

            C3565a(IBinder iBinder) {
                this.f9874a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f9874a;
            }

            @Override // p000.InterfaceC2396do
            /* renamed from: d */
            public Bundle mo11471d(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f9874a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static InterfaceC2396do m11472a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC2396do)) ? new C3565a(iBinder) : (InterfaceC2396do) queryLocalInterface;
        }
    }

    /* renamed from: d */
    Bundle mo11471d(Bundle bundle);
}