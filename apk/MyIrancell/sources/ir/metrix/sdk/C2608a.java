package ir.metrix.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: ir.metrix.sdk.a */
/* loaded from: classes.dex */
class C2608a {

    /* renamed from: ir.metrix.sdk.a$a */
    /* loaded from: classes.dex */
    private static final class a implements ServiceConnection {

        /* renamed from: a */
        boolean f10672a;

        /* renamed from: b */
        private final LinkedBlockingQueue<IBinder> f10673b;

        private a() {
            this.f10673b = new LinkedBlockingQueue<>(1);
            this.f10672a = false;
        }

        /* renamed from: a */
        public IBinder m12502a() {
            if (this.f10672a) {
                throw new IllegalStateException();
            }
            this.f10672a = true;
            return this.f10673b.take();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f10673b.put(iBinder);
            } catch (InterruptedException e) {
                C2610ab.m12529b("AdvertisingIdClient", e.getMessage());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: ir.metrix.sdk.a$b */
    /* loaded from: classes.dex */
    private static final class b implements IInterface {

        /* renamed from: a */
        private IBinder f10674a;

        public b(IBinder iBinder) {
            this.f10674a = iBinder;
        }

        /* renamed from: a */
        public String m12503a() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f10674a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: a */
        public boolean m12504a(boolean z) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(z ? 1 : 0);
                this.f10674a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f10674a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2620c m12501a(Context context) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            a aVar = new a();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            if (!context.bindService(intent, aVar, 1)) {
                throw new IOException("Google Play connection failed");
            }
            try {
                try {
                    b bVar = new b(aVar.m12502a());
                    return new C2620c(bVar.m12503a(), Boolean.valueOf(bVar.m12504a(true)));
                } catch (Exception e) {
                    throw e;
                }
            } finally {
                context.unbindService(aVar);
            }
        } catch (Exception e2) {
            throw e2;
        }
    }
}
