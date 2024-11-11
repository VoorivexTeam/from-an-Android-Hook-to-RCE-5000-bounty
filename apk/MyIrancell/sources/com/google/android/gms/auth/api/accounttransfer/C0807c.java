package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;
import java.util.HashSet;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.c */
/* loaded from: classes.dex */
public final class C0807c implements Parcelable.Creator<zzr> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzr createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        zzt zztVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            int i2 = 1;
            if (m7215a != 1) {
                i2 = 2;
                if (m7215a != 2) {
                    i2 = 3;
                    if (m7215a != 3) {
                        i2 = 4;
                        if (m7215a != 4) {
                            i2 = 5;
                            if (m7215a != 5) {
                                C1052a.m7214G(parcel, m7216a);
                            } else {
                                str3 = C1052a.m7238o(parcel, m7216a);
                            }
                        } else {
                            str2 = C1052a.m7238o(parcel, m7216a);
                        }
                    } else {
                        str = C1052a.m7238o(parcel, m7216a);
                    }
                } else {
                    zztVar = (zzt) C1052a.m7217a(parcel, m7216a, zzt.CREATOR);
                }
            } else {
                i = C1052a.m7208A(parcel, m7216a);
            }
            hashSet.add(Integer.valueOf(i2));
        }
        if (parcel.dataPosition() == m7222b) {
            return new zzr(hashSet, i, zztVar, str, str2, str3);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(m7222b);
        throw new C1052a.a(sb.toString(), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzr[] newArray(int i) {
        return new zzr[i];
    }
}
