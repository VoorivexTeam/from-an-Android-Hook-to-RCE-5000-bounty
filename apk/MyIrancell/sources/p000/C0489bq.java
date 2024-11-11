package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bq */
/* loaded from: classes.dex */
public class C0489bq implements IInterface {

    /* renamed from: a */
    private final IBinder f2819a;

    /* renamed from: b */
    private final String f2820b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C0489bq(IBinder iBinder, String str) {
        this.f2819a = iBinder;
        this.f2820b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel m3435a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f2820b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m3436a(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f2819a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f2819a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final void m3437b(int i, Parcel parcel) {
        try {
            this.f2819a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
