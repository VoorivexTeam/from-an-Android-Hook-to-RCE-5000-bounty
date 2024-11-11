package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: hp */
/* loaded from: classes.dex */
public class C2561hp implements IInterface {

    /* renamed from: a */
    private final IBinder f10506a;

    /* renamed from: b */
    private final String f10507b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C2561hp(IBinder iBinder, String str) {
        this.f10506a = iBinder;
        this.f10507b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel m12241a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f10507b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel m12242a(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f10506a.transact(i, parcel, obtain, 0);
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
        return this.f10506a;
    }
}
