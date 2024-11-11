package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.C1052a;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

/* renamed from: com.google.android.gms.internal.location.u */
/* loaded from: classes.dex */
public final class C1185u implements Parcelable.Creator<zzbd> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbd createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        List<ClientIdentity> list = zzbd.f6449i;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            if (m7215a != 1) {
                switch (m7215a) {
                    case 5:
                        list = C1052a.m7226c(parcel, m7216a, ClientIdentity.CREATOR);
                        break;
                    case 6:
                        str = C1052a.m7238o(parcel, m7216a);
                        break;
                    case 7:
                        z = C1052a.m7242s(parcel, m7216a);
                        break;
                    case 8:
                        z2 = C1052a.m7242s(parcel, m7216a);
                        break;
                    case 9:
                        z3 = C1052a.m7242s(parcel, m7216a);
                        break;
                    case 10:
                        str2 = C1052a.m7238o(parcel, m7216a);
                        break;
                    default:
                        C1052a.m7214G(parcel, m7216a);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) C1052a.m7217a(parcel, m7216a, LocationRequest.CREATOR);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new zzbd(locationRequest, list, str, z, z2, z3, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbd[] newArray(int i) {
        return new zzbd[i];
    }
}
