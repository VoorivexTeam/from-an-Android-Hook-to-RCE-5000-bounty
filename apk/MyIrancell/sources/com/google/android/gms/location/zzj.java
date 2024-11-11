package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new C1631z();

    /* renamed from: b */
    private boolean f7198b;

    /* renamed from: c */
    private long f7199c;

    /* renamed from: d */
    private float f7200d;

    /* renamed from: e */
    private long f7201e;

    /* renamed from: f */
    private int f7202f;

    public zzj() {
        this(true, 50L, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzj(boolean z, long j, float f, long j2, int i) {
        this.f7198b = z;
        this.f7199c = j;
        this.f7200d = f;
        this.f7201e = j2;
        this.f7202f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        return this.f7198b == zzjVar.f7198b && this.f7199c == zzjVar.f7199c && Float.compare(this.f7200d, zzjVar.f7200d) == 0 && this.f7201e == zzjVar.f7201e && this.f7202f == zzjVar.f7202f;
    }

    public final int hashCode() {
        return C1050s.m7203a(Boolean.valueOf(this.f7198b), Long.valueOf(this.f7199c), Float.valueOf(this.f7200d), Long.valueOf(this.f7201e), Integer.valueOf(this.f7202f));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.f7198b);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.f7199c);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.f7200d);
        long j = this.f7201e;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = j - SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(elapsedRealtime);
            sb.append("ms");
        }
        if (this.f7202f != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f7202f);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7269a(parcel, 1, this.f7198b);
        C1053b.m7256a(parcel, 2, this.f7199c);
        C1053b.m7254a(parcel, 3, this.f7200d);
        C1053b.m7256a(parcel, 4, this.f7201e);
        C1053b.m7255a(parcel, 5, this.f7202f);
        C1053b.m7251a(parcel, m7250a);
    }
}
