package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class zzkq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzkq> CREATOR = new C1937x9();

    /* renamed from: b */
    private final int f8224b;

    /* renamed from: c */
    public final String f8225c;

    /* renamed from: d */
    public final long f8226d;

    /* renamed from: e */
    public final Long f8227e;

    /* renamed from: f */
    public final String f8228f;

    /* renamed from: g */
    public final String f8229g;

    /* renamed from: h */
    public final Double f8230h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkq(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.f8224b = i;
        this.f8225c = str;
        this.f8226d = j;
        this.f8227e = l;
        if (i == 1) {
            this.f8230h = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f8230h = d;
        }
        this.f8228f = str2;
        this.f8229g = str3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkq(C1926w9 c1926w9) {
        this(c1926w9.f8151c, c1926w9.f8152d, c1926w9.f8153e, c1926w9.f8150b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkq(String str, long j, Object obj, String str2) {
        C1057u.m7296b(str);
        this.f8224b = 2;
        this.f8225c = str;
        this.f8226d = j;
        this.f8229g = str2;
        if (obj == null) {
            this.f8227e = null;
            this.f8230h = null;
            this.f8228f = null;
            return;
        }
        if (obj instanceof Long) {
            this.f8227e = (Long) obj;
            this.f8230h = null;
            this.f8228f = null;
        } else if (obj instanceof String) {
            this.f8227e = null;
            this.f8230h = null;
            this.f8228f = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("User attribute given of un-supported type");
            }
            this.f8227e = null;
            this.f8230h = (Double) obj;
            this.f8228f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkq(String str, long j, String str2) {
        C1057u.m7296b(str);
        this.f8224b = 2;
        this.f8225c = str;
        this.f8226d = 0L;
        this.f8227e = null;
        this.f8230h = null;
        this.f8228f = null;
        this.f8229g = null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f8224b);
        C1053b.m7266a(parcel, 2, this.f8225c, false);
        C1053b.m7256a(parcel, 3, this.f8226d);
        C1053b.m7265a(parcel, 4, this.f8227e, false);
        C1053b.m7263a(parcel, 5, (Float) null, false);
        C1053b.m7266a(parcel, 6, this.f8228f, false);
        C1053b.m7266a(parcel, 7, this.f8229g, false);
        C1053b.m7262a(parcel, 8, this.f8230h, false);
        C1053b.m7251a(parcel, m7250a);
    }

    public final Object zza() {
        Long l = this.f8227e;
        if (l != null) {
            return l;
        }
        Double d = this.f8230h;
        if (d != null) {
            return d;
        }
        String str = this.f8228f;
        if (str != null) {
            return str;
        }
        return null;
    }
}
