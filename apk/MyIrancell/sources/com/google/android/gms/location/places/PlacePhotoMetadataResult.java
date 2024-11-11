package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.InterfaceC0982m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

@Deprecated
/* loaded from: classes.dex */
public class PlacePhotoMetadataResult extends AbstractSafeParcelable implements InterfaceC0982m {
    public static final Parcelable.Creator<PlacePhotoMetadataResult> CREATOR = new C1608h();

    /* renamed from: b */
    private final Status f7121b;

    /* renamed from: c */
    private final DataHolder f7122c;

    public PlacePhotoMetadataResult(Status status, DataHolder dataHolder) {
        this.f7121b = status;
        this.f7122c = dataHolder;
        if (dataHolder == null) {
            return;
        }
        new C1603c(dataHolder);
    }

    @Override // com.google.android.gms.common.api.InterfaceC0982m
    /* renamed from: e */
    public Status mo6496e() {
        return this.f7121b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7260a(parcel, 1, (Parcelable) mo6496e(), i, false);
        C1053b.m7260a(parcel, 2, (Parcelable) this.f7122c, i, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
