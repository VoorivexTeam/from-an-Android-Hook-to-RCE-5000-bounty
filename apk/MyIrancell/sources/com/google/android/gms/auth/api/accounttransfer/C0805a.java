package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.a */
/* loaded from: classes.dex */
public final class C0805a implements Parcelable.Creator<zzl> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzl createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        ArrayList arrayList = null;
        zzo zzoVar = null;
        int i2 = 0;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            int i3 = 1;
            if (m7215a != 1) {
                i3 = 2;
                if (m7215a != 2) {
                    i3 = 3;
                    if (m7215a != 3) {
                        i3 = 4;
                        if (m7215a != 4) {
                            C1052a.m7214G(parcel, m7216a);
                        } else {
                            zzoVar = (zzo) C1052a.m7217a(parcel, m7216a, zzo.CREATOR);
                        }
                    } else {
                        i2 = C1052a.m7208A(parcel, m7216a);
                    }
                } else {
                    arrayList = C1052a.m7226c(parcel, m7216a, zzr.CREATOR);
                }
            } else {
                i = C1052a.m7208A(parcel, m7216a);
            }
            hashSet.add(Integer.valueOf(i3));
        }
        if (parcel.dataPosition() == m7222b) {
            return new zzl(hashSet, i, arrayList, i2, zzoVar);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(m7222b);
        throw new C1052a.a(sb.toString(), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzl[] newArray(int i) {
        return new zzl[i];
    }
}
