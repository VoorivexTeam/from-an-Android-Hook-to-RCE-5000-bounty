package com.google.android.gms.location.places;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e implements Parcelable.Creator<AddPlaceRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AddPlaceRequest createFromParcel(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        String str = null;
        LatLng latLng = null;
        String str2 = null;
        ArrayList<Integer> arrayList = null;
        String str3 = null;
        Uri uri = null;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    str = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                case 2:
                    latLng = (LatLng) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, LatLng.CREATOR);
                    break;
                case 3:
                    str2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                case 4:
                    arrayList = com.google.android.gms.common.internal.safeparcel.a.k(parcel, a);
                    break;
                case 5:
                    str3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                case 6:
                    uri = (Uri) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, Uri.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.G(parcel, a);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.r(parcel, b);
        return new AddPlaceRequest(str, latLng, str2, arrayList, str3, uri);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AddPlaceRequest[] newArray(int i) {
        return new AddPlaceRequest[i];
    }
}
