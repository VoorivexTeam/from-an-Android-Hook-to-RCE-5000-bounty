package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public class ActivityTransition extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransition> CREATOR = new C1624s();

    /* renamed from: b */
    private final int f7048b;

    /* renamed from: c */
    private final int f7049c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ActivityTransition(int i, int i2) {
        this.f7048b = i;
        this.f7049c = i2;
    }

    /* renamed from: a */
    public static void m8935a(int i) {
        boolean z = i >= 0 && i <= 1;
        StringBuilder sb = new StringBuilder(41);
        sb.append("Transition type ");
        sb.append(i);
        sb.append(" is not valid.");
        C1057u.m7294a(z, sb.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        return this.f7048b == activityTransition.f7048b && this.f7049c == activityTransition.f7049c;
    }

    public int hashCode() {
        return C1050s.m7203a(Integer.valueOf(this.f7048b), Integer.valueOf(this.f7049c));
    }

    /* renamed from: j */
    public int m8936j() {
        return this.f7048b;
    }

    /* renamed from: k */
    public int m8937k() {
        return this.f7049c;
    }

    public String toString() {
        int i = this.f7048b;
        int i2 = this.f7049c;
        StringBuilder sb = new StringBuilder(75);
        sb.append("ActivityTransition [mActivityType=");
        sb.append(i);
        sb.append(", mTransitionType=");
        sb.append(i2);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, m8936j());
        C1053b.m7255a(parcel, 2, m8937k());
        C1053b.m7251a(parcel, m7250a);
    }
}
