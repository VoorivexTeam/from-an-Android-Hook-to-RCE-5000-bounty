package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new C1065y();

    /* renamed from: b */
    private final int f6116b;

    /* renamed from: c */
    private final String f6117c;

    public ClientIdentity(int i, String str) {
        this.f6116b = i;
        this.f6117c = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ClientIdentity)) {
            ClientIdentity clientIdentity = (ClientIdentity) obj;
            if (clientIdentity.f6116b == this.f6116b && C1050s.m7205a(clientIdentity.f6117c, this.f6117c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f6116b;
    }

    public String toString() {
        int i = this.f6116b;
        String str = this.f6117c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f6116b);
        C1053b.m7266a(parcel, 2, this.f6117c, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
