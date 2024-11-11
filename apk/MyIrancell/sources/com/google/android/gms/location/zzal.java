package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR = new C1622q();

    /* renamed from: b */
    private final List<String> f7195b;

    /* renamed from: c */
    private final PendingIntent f7196c;

    /* renamed from: d */
    private final String f7197d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzal(List<String> list, PendingIntent pendingIntent, String str) {
        this.f7195b = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f7196c = pendingIntent;
        this.f7197d = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7278c(parcel, 1, this.f7195b, false);
        C1053b.m7260a(parcel, 2, (Parcelable) this.f7196c, i, false);
        C1053b.m7266a(parcel, 3, this.f7197d, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
