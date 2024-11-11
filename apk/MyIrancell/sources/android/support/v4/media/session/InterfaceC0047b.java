package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: android.support.v4.media.session.b */
/* loaded from: classes.dex */
public interface InterfaceC0047b extends IInterface {

    /* renamed from: android.support.v4.media.session.b$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements InterfaceC0047b {

        /* renamed from: android.support.v4.media.session.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C3549a implements InterfaceC0047b {

            /* renamed from: a */
            private IBinder f189a;

            C3549a(IBinder iBinder) {
                this.f189a = iBinder;
            }

            @Override // android.support.v4.media.session.InterfaceC0047b
            /* renamed from: a */
            public void mo283a(InterfaceC0046a interfaceC0046a) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(interfaceC0046a != null ? interfaceC0046a.asBinder() : null);
                    this.f189a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f189a;
            }
        }

        /* renamed from: a */
        public static InterfaceC0047b m284a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0047b)) ? new C3549a(iBinder) : (InterfaceC0047b) queryLocalInterface;
        }
    }

    /* renamed from: a */
    void mo283a(InterfaceC0046a interfaceC0046a);
}
