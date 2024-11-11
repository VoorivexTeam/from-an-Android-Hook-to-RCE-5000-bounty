package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.common.data.e */
/* loaded from: classes.dex */
public final class C1000e implements Parcelable.Creator<BitmapTeleporter> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ BitmapTeleporter createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        int i = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        int i2 = 0;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            if (m7215a == 1) {
                i = C1052a.m7208A(parcel, m7216a);
            } else if (m7215a == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) C1052a.m7217a(parcel, m7216a, ParcelFileDescriptor.CREATOR);
            } else if (m7215a != 3) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                i2 = C1052a.m7208A(parcel, m7216a);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new BitmapTeleporter(i, parcelFileDescriptor, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ BitmapTeleporter[] newArray(int i) {
        return new BitmapTeleporter[i];
    }
}
