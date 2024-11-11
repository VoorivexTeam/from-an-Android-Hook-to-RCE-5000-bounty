package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class ConnectionResult extends AbstractSafeParcelable {

    /* renamed from: b */
    private final int f5656b;

    /* renamed from: c */
    private final int f5657c;

    /* renamed from: d */
    private final PendingIntent f5658d;

    /* renamed from: e */
    private final String f5659e;

    /* renamed from: f */
    public static final ConnectionResult f5655f = new ConnectionResult(0);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new C1070l();

    public ConnectionResult(int i) {
        this(i, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f5656b = i;
        this.f5657c = i2;
        this.f5658d = pendingIntent;
        this.f5659e = str;
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m6483a(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f5657c == connectionResult.f5657c && C1050s.m7205a(this.f5658d, connectionResult.f5658d) && C1050s.m7205a(this.f5659e, connectionResult.f5659e);
    }

    public final int hashCode() {
        return C1050s.m7203a(Integer.valueOf(this.f5657c), this.f5658d, this.f5659e);
    }

    /* renamed from: j */
    public final int m6484j() {
        return this.f5657c;
    }

    /* renamed from: k */
    public final String m6485k() {
        return this.f5659e;
    }

    /* renamed from: l */
    public final PendingIntent m6486l() {
        return this.f5658d;
    }

    /* renamed from: m */
    public final boolean m6487m() {
        return (this.f5657c == 0 || this.f5658d == null) ? false : true;
    }

    /* renamed from: n */
    public final boolean m6488n() {
        return this.f5657c == 0;
    }

    public final String toString() {
        C1050s.a m7204a = C1050s.m7204a(this);
        m7204a.m7206a("statusCode", m6483a(this.f5657c));
        m7204a.m7206a("resolution", this.f5658d);
        m7204a.m7206a("message", this.f5659e);
        return m7204a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f5656b);
        C1053b.m7255a(parcel, 2, m6484j());
        C1053b.m7260a(parcel, 3, (Parcelable) m6486l(), i, false);
        C1053b.m7266a(parcel, 4, m6485k(), false);
        C1053b.m7251a(parcel, m7250a);
    }
}
