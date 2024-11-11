package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new C1071m();

    /* renamed from: b */
    private final String f5660b;

    /* renamed from: c */
    @Deprecated
    private final int f5661c;

    /* renamed from: d */
    private final long f5662d;

    public Feature(String str, int i, long j) {
        this.f5660b = str;
        this.f5661c = i;
        this.f5662d = j;
    }

    public Feature(String str, long j) {
        this.f5660b = str;
        this.f5662d = j;
        this.f5661c = -1;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((m6489j() != null && m6489j().equals(feature.m6489j())) || (m6489j() == null && feature.m6489j() == null)) && m6490k() == feature.m6490k()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C1050s.m7203a(m6489j(), Long.valueOf(m6490k()));
    }

    /* renamed from: j */
    public String m6489j() {
        return this.f5660b;
    }

    /* renamed from: k */
    public long m6490k() {
        long j = this.f5662d;
        return j == -1 ? this.f5661c : j;
    }

    public String toString() {
        C1050s.a m7204a = C1050s.m7204a(this);
        m7204a.m7206a("name", m6489j());
        m7204a.m7206a("version", Long.valueOf(m6490k()));
        return m7204a.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7266a(parcel, 1, m6489j(), false);
        C1053b.m7255a(parcel, 2, this.f5661c);
        C1053b.m7256a(parcel, 3, m6490k());
        C1053b.m7251a(parcel, m7250a);
    }
}
