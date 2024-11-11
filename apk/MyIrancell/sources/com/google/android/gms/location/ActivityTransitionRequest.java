package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes.dex */
public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new C1627v();

    /* renamed from: e */
    public static final Comparator<ActivityTransition> f7053e = new C1626u();

    /* renamed from: b */
    private final List<ActivityTransition> f7054b;

    /* renamed from: c */
    private final String f7055c;

    /* renamed from: d */
    private final List<ClientIdentity> f7056d;

    public ActivityTransitionRequest(List<ActivityTransition> list, String str, List<ClientIdentity> list2) {
        C1057u.m7287a(list, "transitions can't be null");
        C1057u.m7294a(list.size() > 0, "transitions can't be empty.");
        TreeSet treeSet = new TreeSet(f7053e);
        for (ActivityTransition activityTransition : list) {
            C1057u.m7294a(treeSet.add(activityTransition), String.format("Found duplicated transition: %s.", activityTransition));
        }
        this.f7054b = Collections.unmodifiableList(list);
        this.f7055c = str;
        this.f7056d = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ActivityTransitionRequest.class == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            if (C1050s.m7205a(this.f7054b, activityTransitionRequest.f7054b) && C1050s.m7205a(this.f7055c, activityTransitionRequest.f7055c) && C1050s.m7205a(this.f7056d, activityTransitionRequest.f7056d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f7054b.hashCode() * 31;
        String str = this.f7055c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<ClientIdentity> list = this.f7056d;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f7054b);
        String str = this.f7055c;
        String valueOf2 = String.valueOf(this.f7056d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61 + String.valueOf(str).length() + String.valueOf(valueOf2).length());
        sb.append("ActivityTransitionRequest [mTransitions=");
        sb.append(valueOf);
        sb.append(", mTag='");
        sb.append(str);
        sb.append('\'');
        sb.append(", mClients=");
        sb.append(valueOf2);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7279d(parcel, 1, this.f7054b, false);
        C1053b.m7266a(parcel, 2, this.f7055c, false);
        C1053b.m7279d(parcel, 3, this.f7056d, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
