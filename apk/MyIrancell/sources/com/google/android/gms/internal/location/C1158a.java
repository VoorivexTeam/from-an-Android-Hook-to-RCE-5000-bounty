package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.location.a */
/* loaded from: classes.dex */
public class C1158a implements IInterface {

    /* renamed from: a */
    private final IBinder f6429a;

    /* renamed from: b */
    private final String f6430b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C1158a(IBinder iBinder, String str) {
        this.f6429a = iBinder;
        this.f6430b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel m7466a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f6430b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m7467a(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f6429a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f6429a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final void m7468b(int i, Parcel parcel) {
        try {
            this.f6429a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
