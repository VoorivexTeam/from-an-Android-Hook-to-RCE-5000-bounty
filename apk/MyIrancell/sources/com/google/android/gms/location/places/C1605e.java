package com.google.android.gms.location.places;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.location.places.e */
/* loaded from: classes.dex */
public final class C1605e implements Parcelable.Creator<AddPlaceRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AddPlaceRequest createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        String str = null;
        LatLng latLng = null;
        String str2 = null;
        ArrayList<Integer> arrayList = null;
        String str3 = null;
        Uri uri = null;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            switch (C1052a.m7215a(m7216a)) {
                case 1:
                    str = C1052a.m7238o(parcel, m7216a);
                    break;
                case 2:
                    latLng = (LatLng) C1052a.m7217a(parcel, m7216a, LatLng.CREATOR);
                    break;
                case 3:
                    str2 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 4:
                    arrayList = C1052a.m7234k(parcel, m7216a);
                    break;
                case 5:
                    str3 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 6:
                    uri = (Uri) C1052a.m7217a(parcel, m7216a, Uri.CREATOR);
                    break;
                default:
                    C1052a.m7214G(parcel, m7216a);
                    break;
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new AddPlaceRequest(str, latLng, str2, arrayList, str3, uri);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AddPlaceRequest[] newArray(int i) {
        return new AddPlaceRequest[i];
    }
}
