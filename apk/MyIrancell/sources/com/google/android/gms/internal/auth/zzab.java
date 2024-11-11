package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new C1149b();

    /* renamed from: b */
    private final int f6416b = 1;

    /* renamed from: c */
    private final String f6417c;

    /* renamed from: d */
    private final int f6418d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzab(int i, String str, int i2) {
        C1057u.m7286a(str);
        this.f6417c = str;
        this.f6418d = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f6416b);
        C1053b.m7266a(parcel, 2, this.f6417c, false);
        C1053b.m7255a(parcel, 3, this.f6418d);
        C1053b.m7251a(parcel, m7250a);
    }
}
