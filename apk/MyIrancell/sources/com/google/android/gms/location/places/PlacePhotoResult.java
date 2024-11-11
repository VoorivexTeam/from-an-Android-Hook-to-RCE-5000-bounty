package com.google.android.gms.location.places;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.InterfaceC0982m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

@Deprecated
/* loaded from: classes.dex */
public class PlacePhotoResult extends AbstractSafeParcelable implements InterfaceC0982m {
    public static final Parcelable.Creator<PlacePhotoResult> CREATOR = new C1609i();

    /* renamed from: b */
    private final Status f7123b;

    /* renamed from: c */
    private final BitmapTeleporter f7124c;

    /* renamed from: d */
    private final Bitmap f7125d;

    public PlacePhotoResult(Status status, BitmapTeleporter bitmapTeleporter) {
        this.f7123b = status;
        this.f7124c = bitmapTeleporter;
        this.f7125d = bitmapTeleporter != null ? bitmapTeleporter.m6979j() : null;
    }

    @Override // com.google.android.gms.common.api.InterfaceC0982m
    /* renamed from: e */
    public Status mo6496e() {
        return this.f7123b;
    }

    public String toString() {
        C1050s.a m7204a = C1050s.m7204a(this);
        m7204a.m7206a("status", this.f7123b);
        m7204a.m7206a("bitmap", this.f7125d);
        return m7204a.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7260a(parcel, 1, (Parcelable) mo6496e(), i, false);
        C1053b.m7260a(parcel, 2, (Parcelable) this.f7124c, i, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
