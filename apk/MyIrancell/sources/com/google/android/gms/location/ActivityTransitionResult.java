package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ActivityTransitionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionResult> CREATOR = new C1628w();

    /* renamed from: b */
    private final List<ActivityTransitionEvent> f7057b;

    public ActivityTransitionResult(List<ActivityTransitionEvent> list) {
        C1057u.m7287a(list, "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i = 1; i < list.size(); i++) {
                C1057u.m7293a(list.get(i).m8939k() >= list.get(i + (-1)).m8939k());
            }
        }
        this.f7057b = Collections.unmodifiableList(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ActivityTransitionResult.class != obj.getClass()) {
            return false;
        }
        return this.f7057b.equals(((ActivityTransitionResult) obj).f7057b);
    }

    public int hashCode() {
        return this.f7057b.hashCode();
    }

    /* renamed from: j */
    public List<ActivityTransitionEvent> m8941j() {
        return this.f7057b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7279d(parcel, 1, m8941j(), false);
        C1053b.m7251a(parcel, m7250a);
    }
}
