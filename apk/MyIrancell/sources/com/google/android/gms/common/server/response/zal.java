package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* loaded from: classes.dex */
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new C1084b();

    /* renamed from: b */
    private final int f6324b;

    /* renamed from: c */
    final String f6325c;

    /* renamed from: d */
    final FastJsonResponse.Field<?, ?> f6326d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zal(int i, String str, FastJsonResponse.Field<?, ?> field) {
        this.f6324b = i;
        this.f6325c = str;
        this.f6326d = field;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zal(String str, FastJsonResponse.Field<?, ?> field) {
        this.f6324b = 1;
        this.f6325c = str;
        this.f6326d = field;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f6324b);
        C1053b.m7266a(parcel, 2, this.f6325c, false);
        C1053b.m7260a(parcel, 3, (Parcelable) this.f6326d, i, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
