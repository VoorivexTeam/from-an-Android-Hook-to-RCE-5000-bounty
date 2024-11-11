package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

/* loaded from: classes.dex */
public final class u implements Parcelable.Creator<zzbd> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbd createFromParcel(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        List<ClientIdentity> list = zzbd.i;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            int a2 = com.google.android.gms.common.internal.safeparcel.a.a(a);
            if (a2 != 1) {
                switch (a2) {
                    case 5:
                        list = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, ClientIdentity.CREATOR);
                        break;
                    case 6:
                        str = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                        break;
                    case 7:
                        z = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
                        break;
                    case 8:
                        z2 = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
                        break;
                    case 9:
                        z3 = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
                        break;
                    case 10:
                        str2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                        break;
                    default:
                        com.google.android.gms.common.internal.safeparcel.a.G(parcel, a);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, LocationRequest.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.r(parcel, b);
        return new zzbd(locationRequest, list, str, z, z2, z3, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbd[] newArray(int i) {
        return new zzbd[i];
    }
}
