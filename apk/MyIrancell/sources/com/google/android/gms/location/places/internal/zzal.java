package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR = new C1613d();

    /* renamed from: b */
    private final List<zzao> f7155b;

    /* renamed from: c */
    private final List<zzan> f7156c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzal(List<zzao> list, List<zzan> list2) {
        this.f7155b = Collections.unmodifiableList(list);
        this.f7156c = Collections.unmodifiableList(list2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7279d(parcel, 1, this.f7155b, false);
        C1053b.m7279d(parcel, 2, this.f7156c, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
