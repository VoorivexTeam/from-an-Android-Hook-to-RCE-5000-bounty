package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new C1588i();

    /* renamed from: b */
    private int f7069b;

    /* renamed from: c */
    private long f7070c;

    /* renamed from: d */
    private long f7071d;

    /* renamed from: e */
    private boolean f7072e;

    /* renamed from: f */
    private long f7073f;

    /* renamed from: g */
    private int f7074g;

    /* renamed from: h */
    private float f7075h;

    /* renamed from: i */
    private long f7076i;

    public LocationRequest() {
        this.f7069b = 102;
        this.f7070c = 3600000L;
        this.f7071d = 600000L;
        this.f7072e = false;
        this.f7073f = Long.MAX_VALUE;
        this.f7074g = Integer.MAX_VALUE;
        this.f7075h = 0.0f;
        this.f7076i = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4) {
        this.f7069b = i;
        this.f7070c = j;
        this.f7071d = j2;
        this.f7072e = z;
        this.f7073f = j3;
        this.f7074g = i2;
        this.f7075h = f;
        this.f7076i = j4;
    }

    /* renamed from: a */
    private static void m8947a(long j) {
        if (j >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("invalid interval: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public final LocationRequest m8948b(long j) {
        m8947a(j);
        this.f7072e = true;
        this.f7071d = j;
        return this;
    }

    /* renamed from: c */
    public final LocationRequest m8949c(long j) {
        m8947a(j);
        this.f7070c = j;
        if (!this.f7072e) {
            double d = j;
            Double.isNaN(d);
            this.f7071d = (long) (d / 6.0d);
        }
        return this;
    }

    /* renamed from: d */
    public final LocationRequest m8950d(int i) {
        if (i == 100 || i == 102 || i == 104 || i == 105) {
            this.f7069b = i;
            return this;
        }
        StringBuilder sb = new StringBuilder(28);
        sb.append("invalid quality: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        return this.f7069b == locationRequest.f7069b && this.f7070c == locationRequest.f7070c && this.f7071d == locationRequest.f7071d && this.f7072e == locationRequest.f7072e && this.f7073f == locationRequest.f7073f && this.f7074g == locationRequest.f7074g && this.f7075h == locationRequest.f7075h && m8951j() == locationRequest.m8951j();
    }

    public final int hashCode() {
        return C1050s.m7203a(Integer.valueOf(this.f7069b), Long.valueOf(this.f7070c), Float.valueOf(this.f7075h), Long.valueOf(this.f7076i));
    }

    /* renamed from: j */
    public final long m8951j() {
        long j = this.f7076i;
        long j2 = this.f7070c;
        return j < j2 ? j2 : j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        int i = this.f7069b;
        sb.append(i != 100 ? i != 102 ? i != 104 ? i != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.f7069b != 105) {
            sb.append(" requested=");
            sb.append(this.f7070c);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.f7071d);
        sb.append("ms");
        if (this.f7076i > this.f7070c) {
            sb.append(" maxWait=");
            sb.append(this.f7076i);
            sb.append("ms");
        }
        if (this.f7075h > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.f7075h);
            sb.append("m");
        }
        long j = this.f7073f;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = j - SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(elapsedRealtime);
            sb.append("ms");
        }
        if (this.f7074g != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f7074g);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f7069b);
        C1053b.m7256a(parcel, 2, this.f7070c);
        C1053b.m7256a(parcel, 3, this.f7071d);
        C1053b.m7269a(parcel, 4, this.f7072e);
        C1053b.m7256a(parcel, 5, this.f7073f);
        C1053b.m7255a(parcel, 6, this.f7074g);
        C1053b.m7254a(parcel, 7, this.f7075h);
        C1053b.m7256a(parcel, 8, this.f7076i);
        C1053b.m7251a(parcel, m7250a);
    }
}
