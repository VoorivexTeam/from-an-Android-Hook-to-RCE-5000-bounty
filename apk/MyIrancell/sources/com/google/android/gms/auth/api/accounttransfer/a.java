package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator<zzl> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzl createFromParcel(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        ArrayList arrayList = null;
        zzo zzoVar = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            int a2 = com.google.android.gms.common.internal.safeparcel.a.a(a);
            int i3 = 1;
            if (a2 != 1) {
                i3 = 2;
                if (a2 != 2) {
                    i3 = 3;
                    if (a2 != 3) {
                        i3 = 4;
                        if (a2 != 4) {
                            com.google.android.gms.common.internal.safeparcel.a.G(parcel, a);
                        } else {
                            zzoVar = (zzo) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, zzo.CREATOR);
                        }
                    } else {
                        i2 = com.google.android.gms.common.internal.safeparcel.a.A(parcel, a);
                    }
                } else {
                    arrayList = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, zzr.CREATOR);
                }
            } else {
                i = com.google.android.gms.common.internal.safeparcel.a.A(parcel, a);
            }
            hashSet.add(Integer.valueOf(i3));
        }
        if (parcel.dataPosition() == b) {
            return new zzl(hashSet, i, arrayList, i2, zzoVar);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new a.C0047a(sb.toString(), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzl[] newArray(int i) {
        return new zzl[i];
    }
}
