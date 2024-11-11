package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new C0803a();

    /* renamed from: b */
    private final int f5471b;

    /* renamed from: c */
    private final long f5472c;

    /* renamed from: d */
    private final String f5473d;

    /* renamed from: e */
    private final int f5474e;

    /* renamed from: f */
    private final int f5475f;

    /* renamed from: g */
    private final String f5476g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AccountChangeEvent(int i, long j, String str, int i2, int i3, String str2) {
        this.f5471b = i;
        this.f5472c = j;
        C1057u.m7286a(str);
        this.f5473d = str;
        this.f5474e = i2;
        this.f5475f = i3;
        this.f5476g = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AccountChangeEvent) {
            AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
            if (this.f5471b == accountChangeEvent.f5471b && this.f5472c == accountChangeEvent.f5472c && C1050s.m7205a(this.f5473d, accountChangeEvent.f5473d) && this.f5474e == accountChangeEvent.f5474e && this.f5475f == accountChangeEvent.f5475f && C1050s.m7205a(this.f5476g, accountChangeEvent.f5476g)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C1050s.m7203a(Integer.valueOf(this.f5471b), Long.valueOf(this.f5472c), this.f5473d, Integer.valueOf(this.f5474e), Integer.valueOf(this.f5475f), this.f5476g);
    }

    public String toString() {
        int i = this.f5474e;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        String str2 = this.f5473d;
        String str3 = this.f5476g;
        int i2 = this.f5475f;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 91 + str.length() + String.valueOf(str3).length());
        sb.append("AccountChangeEvent {accountName = ");
        sb.append(str2);
        sb.append(", changeType = ");
        sb.append(str);
        sb.append(", changeData = ");
        sb.append(str3);
        sb.append(", eventIndex = ");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f5471b);
        C1053b.m7256a(parcel, 2, this.f5472c);
        C1053b.m7266a(parcel, 3, this.f5473d, false);
        C1053b.m7255a(parcel, 4, this.f5474e);
        C1053b.m7255a(parcel, 5, this.f5475f);
        C1053b.m7266a(parcel, 6, this.f5476g, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
