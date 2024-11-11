package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new C1078a();

    /* renamed from: b */
    private final int f6292b;

    /* renamed from: c */
    private final String f6293c;

    /* renamed from: d */
    private final int f6294d;

    public FavaDiagnosticsEntity(int i, String str, int i2) {
        this.f6292b = i;
        this.f6293c = str;
        this.f6294d = i2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f6292b);
        C1053b.m7266a(parcel, 2, this.f6293c, false);
        C1053b.m7255a(parcel, 3, this.f6294d);
        C1053b.m7251a(parcel, m7250a);
    }
}
