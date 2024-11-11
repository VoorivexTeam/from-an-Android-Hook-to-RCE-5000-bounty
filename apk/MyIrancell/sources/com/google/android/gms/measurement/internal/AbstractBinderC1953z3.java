package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.BinderC1328j1;
import com.google.android.gms.internal.measurement.C1443r;
import java.util.Collection;

/* renamed from: com.google.android.gms.measurement.internal.z3 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1953z3 extends BinderC1328j1 implements InterfaceC1920w3 {
    public AbstractBinderC1953z3() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:1:0x0000. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.BinderC1328j1
    /* renamed from: a */
    protected final boolean mo7857a(int i, Parcel parcel, Parcel parcel2, int i2) {
        Collection mo9616a;
        switch (i) {
            case 1:
                mo9622a((zzan) C1443r.m8258a(parcel, zzan.CREATOR), (zzm) C1443r.m8258a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                mo9624a((zzkq) C1443r.m8258a(parcel, zzkq.CREATOR), (zzm) C1443r.m8258a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                mo9632d((zzm) C1443r.m8258a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                mo9623a((zzan) C1443r.m8258a(parcel, zzan.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                mo9625a((zzm) C1443r.m8258a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                mo9616a = mo9616a((zzm) C1443r.m8258a(parcel, zzm.CREATOR), C1443r.m8262a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(mo9616a);
                return true;
            case 9:
                byte[] mo9628a = mo9628a((zzan) C1443r.m8258a(parcel, zzan.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(mo9628a);
                return true;
            case 10:
                mo9621a(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String mo9630b = mo9630b((zzm) C1443r.m8258a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(mo9630b);
                return true;
            case 12:
                mo9627a((zzv) C1443r.m8258a(parcel, zzv.CREATOR), (zzm) C1443r.m8258a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                mo9626a((zzv) C1443r.m8258a(parcel, zzv.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                mo9616a = mo9620a(parcel.readString(), parcel.readString(), C1443r.m8262a(parcel), (zzm) C1443r.m8258a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(mo9616a);
                return true;
            case 15:
                mo9616a = mo9619a(parcel.readString(), parcel.readString(), parcel.readString(), C1443r.m8262a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(mo9616a);
                return true;
            case 16:
                mo9616a = mo9617a(parcel.readString(), parcel.readString(), (zzm) C1443r.m8258a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(mo9616a);
                return true;
            case 17:
                mo9616a = mo9618a(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(mo9616a);
                return true;
            case 18:
                mo9631c((zzm) C1443r.m8258a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
