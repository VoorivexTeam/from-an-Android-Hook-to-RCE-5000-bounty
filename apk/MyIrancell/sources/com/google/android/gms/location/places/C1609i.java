package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.location.places.i */
/* loaded from: classes.dex */
public final class C1609i implements Parcelable.Creator<PlacePhotoResult> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PlacePhotoResult createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        Status status = null;
        BitmapTeleporter bitmapTeleporter = null;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            if (m7215a == 1) {
                status = (Status) C1052a.m7217a(parcel, m7216a, Status.CREATOR);
            } else if (m7215a != 2) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                bitmapTeleporter = (BitmapTeleporter) C1052a.m7217a(parcel, m7216a, BitmapTeleporter.CREATOR);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new PlacePhotoResult(status, bitmapTeleporter);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PlacePhotoResult[] newArray(int i) {
        return new PlacePhotoResult[i];
    }
}
