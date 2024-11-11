package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.a */
/* loaded from: classes.dex */
public class C1191a implements IInterface {

    /* renamed from: a */
    private final IBinder f6481a;

    /* renamed from: b */
    private final String f6482b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C1191a(IBinder iBinder, String str) {
        this.f6481a = iBinder;
        this.f6482b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel m7503a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f6482b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel m7504a(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f6481a.transact(i, parcel, obtain, 0);
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
        return this.f6481a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final void m7505b(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f6481a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
