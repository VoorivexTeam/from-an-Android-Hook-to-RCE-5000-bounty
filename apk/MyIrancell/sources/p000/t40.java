package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import ir.tapsell.sdk.models.requestModels.userExtraInfo.AdInfo;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public class t40 {

    /* renamed from: t40$b */
    /* loaded from: classes.dex */
    private static final class ServiceConnectionC3236b implements ServiceConnection {

        /* renamed from: a */
        private final LinkedBlockingQueue<IBinder> f13193a;

        /* renamed from: b */
        boolean f13194b;

        private ServiceConnectionC3236b() {
            this.f13193a = new LinkedBlockingQueue<>(1);
            this.f13194b = false;
        }

        /* renamed from: a */
        public IBinder m15514a() {
            if (this.f13194b) {
                throw new IllegalStateException();
            }
            this.f13194b = true;
            return this.f13193a.take();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f13193a.put(iBinder);
            } catch (InterruptedException e) {
                i50.m12374c(e.getMessage());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: t40$c */
    /* loaded from: classes.dex */
    private static final class C3237c implements IInterface {

        /* renamed from: a */
        private IBinder f13195a;

        public C3237c(IBinder iBinder) {
            this.f13195a = iBinder;
        }

        /* renamed from: a */
        public String m15515a() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f13195a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: a */
        public boolean m15516a(boolean z) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(z ? 1 : 0);
                this.f13195a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f13195a;
        }
    }

    /* renamed from: a */
    public static AdInfo m15513a(Context context) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        ServiceConnectionC3236b serviceConnectionC3236b = new ServiceConnectionC3236b();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (!context.bindService(intent, serviceConnectionC3236b, 1)) {
            throw new IOException("Google Play connection failed");
        }
        try {
            C3237c c3237c = new C3237c(serviceConnectionC3236b.m15514a());
            return new AdInfo(c3237c.m15515a(), Boolean.valueOf(c3237c.m15516a(true)));
        } finally {
            context.unbindService(serviceConnectionC3236b);
        }
    }
}
