package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;

/* loaded from: classes.dex */
public final class i implements Parcelable.Creator<PlacePhotoResult> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PlacePhotoResult createFromParcel(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        Status status = null;
        BitmapTeleporter bitmapTeleporter = null;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            int a2 = com.google.android.gms.common.internal.safeparcel.a.a(a);
            if (a2 == 1) {
                status = (Status) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, Status.CREATOR);
            } else if (a2 != 2) {
                com.google.android.gms.common.internal.safeparcel.a.G(parcel, a);
            } else {
                bitmapTeleporter = (BitmapTeleporter) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, BitmapTeleporter.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.r(parcel, b);
        return new PlacePhotoResult(status, bitmapTeleporter);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PlacePhotoResult[] newArray(int i) {
        return new PlacePhotoResult[i];
    }
}
