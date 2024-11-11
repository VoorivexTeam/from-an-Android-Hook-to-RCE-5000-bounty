package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: lq */
/* loaded from: classes.dex */
public class C2906lq implements IInterface {

    /* renamed from: a */
    private final IBinder f11916a;

    /* renamed from: b */
    private final String f11917b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C2906lq(IBinder iBinder, String str) {
        this.f11916a = iBinder;
        this.f11917b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel m13923a(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f11916a.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f11916a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel zza() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f11917b);
        return obtain;
    }
}
