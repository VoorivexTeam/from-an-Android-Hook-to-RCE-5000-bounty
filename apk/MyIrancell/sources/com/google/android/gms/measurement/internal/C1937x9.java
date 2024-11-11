package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.measurement.internal.x9 */
/* loaded from: classes.dex */
public final class C1937x9 implements Parcelable.Creator<zzkq> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzkq createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            switch (C1052a.m7215a(m7216a)) {
                case 1:
                    i = C1052a.m7208A(parcel, m7216a);
                    break;
                case 2:
                    str = C1052a.m7238o(parcel, m7216a);
                    break;
                case 3:
                    j = C1052a.m7210C(parcel, m7216a);
                    break;
                case 4:
                    l = C1052a.m7211D(parcel, m7216a);
                    break;
                case 5:
                    f = C1052a.m7248y(parcel, m7216a);
                    break;
                case 6:
                    str2 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 7:
                    str3 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 8:
                    d = C1052a.m7246w(parcel, m7216a);
                    break;
                default:
                    C1052a.m7214G(parcel, m7216a);
                    break;
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new zzkq(i, str, j, l, f, str2, str3, d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzkq[] newArray(int i) {
        return new zzkq[i];
    }
}
