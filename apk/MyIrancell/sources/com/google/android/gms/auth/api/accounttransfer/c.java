package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator<zzr> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzr createFromParcel(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        zzt zztVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            int a2 = com.google.android.gms.common.internal.safeparcel.a.a(a);
            int i2 = 1;
            if (a2 != 1) {
                i2 = 2;
                if (a2 != 2) {
                    i2 = 3;
                    if (a2 != 3) {
                        i2 = 4;
                        if (a2 != 4) {
                            i2 = 5;
                            if (a2 != 5) {
                                com.google.android.gms.common.internal.safeparcel.a.G(parcel, a);
                            } else {
                                str3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                            }
                        } else {
                            str2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                        }
                    } else {
                        str = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    }
                } else {
                    zztVar = (zzt) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, zzt.CREATOR);
                }
            } else {
                i = com.google.android.gms.common.internal.safeparcel.a.A(parcel, a);
            }
            hashSet.add(Integer.valueOf(i2));
        }
        if (parcel.dataPosition() == b) {
            return new zzr(hashSet, i, zztVar, str, str2, str3);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new a.C0047a(sb.toString(), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzr[] newArray(int i) {
        return new zzr[i];
    }
}
