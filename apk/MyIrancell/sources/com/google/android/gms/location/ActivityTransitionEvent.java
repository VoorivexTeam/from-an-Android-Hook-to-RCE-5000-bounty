package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public class ActivityTransitionEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionEvent> CREATOR = new C1625t();

    /* renamed from: b */
    private final int f7050b;

    /* renamed from: c */
    private final int f7051c;

    /* renamed from: d */
    private final long f7052d;

    public ActivityTransitionEvent(int i, int i2, long j) {
        DetectedActivity.m8942b(i);
        ActivityTransition.m8935a(i2);
        this.f7050b = i;
        this.f7051c = i2;
        this.f7052d = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        return this.f7050b == activityTransitionEvent.f7050b && this.f7051c == activityTransitionEvent.f7051c && this.f7052d == activityTransitionEvent.f7052d;
    }

    public int hashCode() {
        return C1050s.m7203a(Integer.valueOf(this.f7050b), Integer.valueOf(this.f7051c), Long.valueOf(this.f7052d));
    }

    /* renamed from: j */
    public int m8938j() {
        return this.f7050b;
    }

    /* renamed from: k */
    public long m8939k() {
        return this.f7052d;
    }

    /* renamed from: l */
    public int m8940l() {
        return this.f7051c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f7050b;
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("ActivityType ");
        sb2.append(i);
        sb.append(sb2.toString());
        sb.append(" ");
        int i2 = this.f7051c;
        StringBuilder sb3 = new StringBuilder(26);
        sb3.append("TransitionType ");
        sb3.append(i2);
        sb.append(sb3.toString());
        sb.append(" ");
        long j = this.f7052d;
        StringBuilder sb4 = new StringBuilder(41);
        sb4.append("ElapsedRealTimeNanos ");
        sb4.append(j);
        sb.append(sb4.toString());
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, m8938j());
        C1053b.m7255a(parcel, 2, m8940l());
        C1053b.m7256a(parcel, 3, m8939k());
        C1053b.m7251a(parcel, m7250a);
    }
}
