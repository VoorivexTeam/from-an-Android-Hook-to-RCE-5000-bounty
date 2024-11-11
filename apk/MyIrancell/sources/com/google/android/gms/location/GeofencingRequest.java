package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import com.google.android.gms.internal.location.zzbh;
import java.util.List;

/* loaded from: classes.dex */
public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new C1579d0();

    /* renamed from: b */
    private final List<zzbh> f7061b;

    /* renamed from: c */
    private final int f7062c;

    /* renamed from: d */
    private final String f7063d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GeofencingRequest(List<zzbh> list, int i, String str) {
        this.f7061b = list;
        this.f7062c = i;
        this.f7063d = str;
    }

    /* renamed from: j */
    public int m8945j() {
        return this.f7062c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GeofencingRequest[");
        sb.append("geofences=");
        sb.append(this.f7061b);
        int i = this.f7062c;
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(", initialTrigger=");
        sb2.append(i);
        sb2.append(", ");
        sb.append(sb2.toString());
        String valueOf = String.valueOf(this.f7063d);
        sb.append(valueOf.length() != 0 ? "tag=".concat(valueOf) : new String("tag="));
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7279d(parcel, 1, this.f7061b, false);
        C1053b.m7255a(parcel, 2, m8945j());
        C1053b.m7266a(parcel, 3, this.f7063d, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
