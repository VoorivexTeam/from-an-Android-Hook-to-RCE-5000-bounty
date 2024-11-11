package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import java.util.List;

/* loaded from: classes.dex */
public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new C1623r();

    /* renamed from: b */
    private List<DetectedActivity> f7043b;

    /* renamed from: c */
    private long f7044c;

    /* renamed from: d */
    private long f7045d;

    /* renamed from: e */
    private int f7046e;

    /* renamed from: f */
    private Bundle f7047f;

    public ActivityRecognitionResult(List<DetectedActivity> list, long j, long j2, int i, Bundle bundle) {
        C1057u.m7294a(list != null && list.size() > 0, "Must have at least 1 detected activity");
        C1057u.m7294a(j > 0 && j2 > 0, "Must set times");
        this.f7043b = list;
        this.f7044c = j;
        this.f7045d = j2;
        this.f7046e = i;
        this.f7047f = bundle;
    }

    /* renamed from: a */
    private static boolean m8934a(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return true;
        }
        if ((bundle == null && bundle2 != null) || ((bundle != null && bundle2 == null) || bundle.size() != bundle2.size())) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            if (bundle.get(str) == null) {
                if (bundle2.get(str) != null) {
                    return false;
                }
            } else if (bundle.get(str) instanceof Bundle) {
                if (!m8934a(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else if (!bundle.get(str).equals(bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ActivityRecognitionResult.class == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            if (this.f7044c == activityRecognitionResult.f7044c && this.f7045d == activityRecognitionResult.f7045d && this.f7046e == activityRecognitionResult.f7046e && C1050s.m7205a(this.f7043b, activityRecognitionResult.f7043b) && m8934a(this.f7047f, activityRecognitionResult.f7047f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C1050s.m7203a(Long.valueOf(this.f7044c), Long.valueOf(this.f7045d), Integer.valueOf(this.f7046e), this.f7043b, this.f7047f);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f7043b);
        long j = this.f7044c;
        long j2 = this.f7045d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 124);
        sb.append("ActivityRecognitionResult [probableActivities=");
        sb.append(valueOf);
        sb.append(", timeMillis=");
        sb.append(j);
        sb.append(", elapsedRealtimeMillis=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7279d(parcel, 1, this.f7043b, false);
        C1053b.m7256a(parcel, 2, this.f7044c);
        C1053b.m7256a(parcel, 3, this.f7045d);
        C1053b.m7255a(parcel, 4, this.f7046e);
        C1053b.m7257a(parcel, 5, this.f7047f, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
