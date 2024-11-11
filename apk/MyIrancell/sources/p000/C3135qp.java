package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: qp */
/* loaded from: classes.dex */
public class C3135qp implements IInterface {

    /* renamed from: a */
    private final IBinder f12822a;

    /* renamed from: b */
    private final String f12823b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C3135qp(IBinder iBinder, String str) {
        this.f12822a = iBinder;
        this.f12823b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m15129a(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f12822a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f12822a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel zza() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f12823b);
        return obtain;
    }
}
