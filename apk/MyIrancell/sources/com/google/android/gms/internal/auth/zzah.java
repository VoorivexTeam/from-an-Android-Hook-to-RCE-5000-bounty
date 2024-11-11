package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new C1152e();

    /* renamed from: b */
    private final int f6424b = 1;

    /* renamed from: c */
    private final String f6425c;

    /* renamed from: d */
    private final PendingIntent f6426d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzah(int i, String str, PendingIntent pendingIntent) {
        C1057u.m7286a(str);
        this.f6425c = str;
        C1057u.m7286a(pendingIntent);
        this.f6426d = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f6424b);
        C1053b.m7266a(parcel, 2, this.f6425c, false);
        C1053b.m7260a(parcel, 3, (Parcelable) this.f6426d, i, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
