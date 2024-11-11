package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public class DetectedActivity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DetectedActivity> CREATOR;

    /* renamed from: d */
    private static final int[] f7058d;

    /* renamed from: b */
    private int f7059b;

    /* renamed from: c */
    private int f7060c;

    static {
        new C1629x();
        f7058d = new int[]{0, 1, 2, 3, 7, 8, 16, 17};
        CREATOR = new C1630y();
    }

    public DetectedActivity(int i, int i2) {
        this.f7059b = i;
        this.f7060c = i2;
    }

    /* renamed from: b */
    public static void m8942b(int i) {
        boolean z = false;
        for (int i2 : f7058d) {
            if (i2 == i) {
                z = true;
            }
        }
        if (z) {
            return;
        }
        StringBuilder sb = new StringBuilder(81);
        sb.append(i);
        sb.append(" is not a valid DetectedActivity supported by Activity Transition API.");
        sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DetectedActivity.class == obj.getClass()) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            if (this.f7059b == detectedActivity.f7059b && this.f7060c == detectedActivity.f7060c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C1050s.m7203a(Integer.valueOf(this.f7059b), Integer.valueOf(this.f7060c));
    }

    /* renamed from: j */
    public int m8943j() {
        return this.f7060c;
    }

    /* renamed from: k */
    public int m8944k() {
        int i = this.f7059b;
        if (i > 19 || i < 0) {
            return 4;
        }
        return i;
    }

    public String toString() {
        String str;
        int m8944k = m8944k();
        if (m8944k == 0) {
            str = "IN_VEHICLE";
        } else if (m8944k == 1) {
            str = "ON_BICYCLE";
        } else if (m8944k == 2) {
            str = "ON_FOOT";
        } else if (m8944k == 3) {
            str = "STILL";
        } else if (m8944k == 4) {
            str = "UNKNOWN";
        } else if (m8944k == 5) {
            str = "TILTING";
        } else if (m8944k == 7) {
            str = "WALKING";
        } else if (m8944k != 8) {
            switch (m8944k) {
                case 16:
                    str = "IN_ROAD_VEHICLE";
                    break;
                case 17:
                    str = "IN_RAIL_VEHICLE";
                    break;
                case 18:
                    str = "IN_TWO_WHEELER_VEHICLE";
                    break;
                case 19:
                    str = "IN_FOUR_WHEELER_VEHICLE";
                    break;
                default:
                    str = Integer.toString(m8944k);
                    break;
            }
        } else {
            str = "RUNNING";
        }
        int i = this.f7060c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 48);
        sb.append("DetectedActivity [type=");
        sb.append(str);
        sb.append(", confidence=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f7059b);
        C1053b.m7255a(parcel, 2, this.f7060c);
        C1053b.m7251a(parcel, m7250a);
    }
}
