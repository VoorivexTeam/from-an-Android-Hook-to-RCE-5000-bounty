package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new C1611b();

    /* renamed from: b */
    private final List<Integer> f7148b;

    /* renamed from: c */
    private final String f7149c;

    /* renamed from: d */
    private final Uri f7150d;

    /* renamed from: e */
    private final float f7151e;

    /* renamed from: f */
    private final int f7152f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzai(List<Integer> list, String str, Uri uri, float f, int i) {
        this.f7148b = Collections.unmodifiableList(list);
        this.f7149c = str;
        this.f7150d = uri;
        this.f7151e = f;
        this.f7152f = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7267a(parcel, 1, this.f7148b, false);
        C1053b.m7266a(parcel, 2, this.f7149c, false);
        C1053b.m7260a(parcel, 3, (Parcelable) this.f7150d, i, false);
        C1053b.m7254a(parcel, 4, this.f7151e);
        C1053b.m7255a(parcel, 5, this.f7152f);
        C1053b.m7251a(parcel, m7250a);
    }
}
