package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

@Deprecated
/* loaded from: classes.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new C1066y0();

    /* renamed from: b */
    private final int f6278b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzs(int i) {
        this.f6278b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f6278b);
        C1053b.m7251a(parcel, m7250a);
    }
}
