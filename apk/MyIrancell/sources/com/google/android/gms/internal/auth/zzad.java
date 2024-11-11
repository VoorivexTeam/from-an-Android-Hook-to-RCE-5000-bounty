package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new C1150c();

    /* renamed from: b */
    private final int f6419b = 1;

    /* renamed from: c */
    private final String f6420c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzad(int i, String str) {
        C1057u.m7286a(str);
        this.f6420c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f6419b);
        C1053b.m7266a(parcel, 2, this.f6420c, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
