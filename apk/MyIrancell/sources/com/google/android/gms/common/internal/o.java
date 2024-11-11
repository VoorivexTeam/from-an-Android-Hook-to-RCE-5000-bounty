package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.kq;
import defpackage.mq;

/* loaded from: classes.dex */
public interface o extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends kq implements o {
        public a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        @Override // defpackage.kq
        protected final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) mq.a(parcel, Bundle.CREATOR));
            } else if (i == 2) {
                a(parcel.readInt(), (Bundle) mq.a(parcel, Bundle.CREATOR));
            } else {
                if (i != 3) {
                    return false;
                }
                a(parcel.readInt(), parcel.readStrongBinder(), (zza) mq.a(parcel, zza.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void a(int i, Bundle bundle);

    void a(int i, IBinder iBinder, Bundle bundle);

    void a(int i, IBinder iBinder, zza zzaVar);
}
