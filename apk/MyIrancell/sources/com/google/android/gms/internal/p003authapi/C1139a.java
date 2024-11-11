package com.google.android.gms.internal.p003authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.auth-api.a */
/* loaded from: classes.dex */
public class C1139a implements IInterface {

    /* renamed from: a */
    private final IBinder f6409a;

    /* renamed from: b */
    private final String f6410b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C1139a(IBinder iBinder, String str) {
        this.f6409a = iBinder;
        this.f6410b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel m7461a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f6410b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m7462a(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f6409a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f6409a;
    }
}
