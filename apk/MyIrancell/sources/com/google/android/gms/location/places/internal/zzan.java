package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzan> CREATOR = new C1619j();

    /* renamed from: b */
    private final int f7157b;

    /* renamed from: c */
    private final int f7158c;

    /* renamed from: d */
    private final int f7159d;

    /* renamed from: e */
    private final int f7160e;

    /* renamed from: f */
    private final int f7161f;

    /* renamed from: g */
    private final int f7162g;

    /* renamed from: h */
    private final List<zzao> f7163h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzan(int i, int i2, int i3, int i4, int i5, int i6, List<zzao> list) {
        this.f7157b = i;
        this.f7158c = i2;
        this.f7159d = i3;
        this.f7160e = i4;
        this.f7161f = i5;
        this.f7162g = i6;
        this.f7163h = Collections.unmodifiableList(list);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f7157b);
        C1053b.m7255a(parcel, 2, this.f7158c);
        C1053b.m7255a(parcel, 3, this.f7159d);
        C1053b.m7255a(parcel, 4, this.f7160e);
        C1053b.m7255a(parcel, 5, this.f7161f);
        C1053b.m7255a(parcel, 6, this.f7162g);
        C1053b.m7279d(parcel, 7, this.f7163h, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
