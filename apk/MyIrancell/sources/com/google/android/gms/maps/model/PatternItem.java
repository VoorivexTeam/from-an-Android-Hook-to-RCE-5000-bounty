package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public class PatternItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PatternItem> CREATOR = new C1644j();

    /* renamed from: b */
    private final int f7281b;

    /* renamed from: c */
    private final Float f7282c;

    public PatternItem(int i, Float f) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < 0.0f)) {
            z = false;
        }
        String valueOf = String.valueOf(f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
        sb.append("Invalid PatternItem: type=");
        sb.append(i);
        sb.append(" length=");
        sb.append(valueOf);
        C1057u.m7294a(z, sb.toString());
        this.f7281b = i;
        this.f7282c = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        return this.f7281b == patternItem.f7281b && C1050s.m7205a(this.f7282c, patternItem.f7282c);
    }

    public int hashCode() {
        return C1050s.m7203a(Integer.valueOf(this.f7281b), this.f7282c);
    }

    public String toString() {
        int i = this.f7281b;
        String valueOf = String.valueOf(this.f7282c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("[PatternItem: type=");
        sb.append(i);
        sb.append(" length=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 2, this.f7281b);
        C1053b.m7263a(parcel, 3, this.f7282c, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
