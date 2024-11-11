package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import java.util.Collection;

/* loaded from: classes.dex */
public abstract class z3 extends com.google.android.gms.internal.measurement.j1 implements w3 {
    public z3() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:1:0x0000. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.j1
    protected final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        Collection a;
        switch (i) {
            case 1:
                a((zzan) com.google.android.gms.internal.measurement.r.a(parcel, zzan.CREATOR), (zzm) com.google.android.gms.internal.measurement.r.a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                a((zzkq) com.google.android.gms.internal.measurement.r.a(parcel, zzkq.CREATOR), (zzm) com.google.android.gms.internal.measurement.r.a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                d((zzm) com.google.android.gms.internal.measurement.r.a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                a((zzan) com.google.android.gms.internal.measurement.r.a(parcel, zzan.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                a((zzm) com.google.android.gms.internal.measurement.r.a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                a = a((zzm) com.google.android.gms.internal.measurement.r.a(parcel, zzm.CREATOR), com.google.android.gms.internal.measurement.r.a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(a);
                return true;
            case 9:
                byte[] a2 = a((zzan) com.google.android.gms.internal.measurement.r.a(parcel, zzan.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(a2);
                return true;
            case 10:
                a(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String b = b((zzm) com.google.android.gms.internal.measurement.r.a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case 12:
                a((zzv) com.google.android.gms.internal.measurement.r.a(parcel, zzv.CREATOR), (zzm) com.google.android.gms.internal.measurement.r.a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                a((zzv) com.google.android.gms.internal.measurement.r.a(parcel, zzv.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                a = a(parcel.readString(), parcel.readString(), com.google.android.gms.internal.measurement.r.a(parcel), (zzm) com.google.android.gms.internal.measurement.r.a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a);
                return true;
            case 15:
                a = a(parcel.readString(), parcel.readString(), parcel.readString(), com.google.android.gms.internal.measurement.r.a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(a);
                return true;
            case 16:
                a = a(parcel.readString(), parcel.readString(), (zzm) com.google.android.gms.internal.measurement.r.a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a);
                return true;
            case 17:
                a = a(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(a);
                return true;
            case 18:
                c((zzm) com.google.android.gms.internal.measurement.r.a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
