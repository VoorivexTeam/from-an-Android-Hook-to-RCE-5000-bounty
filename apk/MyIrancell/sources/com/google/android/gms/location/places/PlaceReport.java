package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public class PlaceReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<PlaceReport> CREATOR = new C1604d();

    /* renamed from: b */
    private final int f7126b;

    /* renamed from: c */
    private final String f7127c;

    /* renamed from: d */
    private final String f7128d;

    /* renamed from: e */
    private final String f7129e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PlaceReport(int i, String str, String str2, String str3) {
        this.f7126b = i;
        this.f7127c = str;
        this.f7128d = str2;
        this.f7129e = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlaceReport)) {
            return false;
        }
        PlaceReport placeReport = (PlaceReport) obj;
        return C1050s.m7205a(this.f7127c, placeReport.f7127c) && C1050s.m7205a(this.f7128d, placeReport.f7128d) && C1050s.m7205a(this.f7129e, placeReport.f7129e);
    }

    public int hashCode() {
        return C1050s.m7203a(this.f7127c, this.f7128d, this.f7129e);
    }

    /* renamed from: j */
    public String m8980j() {
        return this.f7127c;
    }

    /* renamed from: k */
    public String m8981k() {
        return this.f7128d;
    }

    public String toString() {
        C1050s.a m7204a = C1050s.m7204a(this);
        m7204a.m7206a("placeId", this.f7127c);
        m7204a.m7206a("tag", this.f7128d);
        if (!"unknown".equals(this.f7129e)) {
            m7204a.m7206a("source", this.f7129e);
        }
        return m7204a.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f7126b);
        C1053b.m7266a(parcel, 2, m8980j(), false);
        C1053b.m7266a(parcel, 3, m8981k(), false);
        C1053b.m7266a(parcel, 4, this.f7129e, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
