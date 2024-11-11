package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class zzaf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaf> CREATOR = new C1151d();

    /* renamed from: b */
    private final int f6421b = 1;

    /* renamed from: c */
    private final String f6422c;

    /* renamed from: d */
    private final byte[] f6423d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaf(int i, String str, byte[] bArr) {
        C1057u.m7286a(str);
        this.f6422c = str;
        C1057u.m7286a(bArr);
        this.f6423d = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f6421b);
        C1053b.m7266a(parcel, 2, this.f6422c, false);
        C1053b.m7270a(parcel, 3, this.f6423d, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
