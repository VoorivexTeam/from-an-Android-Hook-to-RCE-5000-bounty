package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbd extends AbstractSafeParcelable {

    /* renamed from: b */
    private LocationRequest f6450b;

    /* renamed from: c */
    private List<ClientIdentity> f6451c;

    /* renamed from: d */
    private String f6452d;

    /* renamed from: e */
    private boolean f6453e;

    /* renamed from: f */
    private boolean f6454f;

    /* renamed from: g */
    private boolean f6455g;

    /* renamed from: h */
    private String f6456h;

    /* renamed from: i */
    static final List<ClientIdentity> f6449i = Collections.emptyList();
    public static final Parcelable.Creator<zzbd> CREATOR = new C1185u();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbd(LocationRequest locationRequest, List<ClientIdentity> list, String str, boolean z, boolean z2, boolean z3, String str2) {
        this.f6450b = locationRequest;
        this.f6451c = list;
        this.f6452d = str;
        this.f6453e = z;
        this.f6454f = z2;
        this.f6455g = z3;
        this.f6456h = str2;
    }

    @Deprecated
    /* renamed from: a */
    public static zzbd m7499a(LocationRequest locationRequest) {
        return new zzbd(locationRequest, f6449i, null, false, false, false, null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbd)) {
            return false;
        }
        zzbd zzbdVar = (zzbd) obj;
        return C1050s.m7205a(this.f6450b, zzbdVar.f6450b) && C1050s.m7205a(this.f6451c, zzbdVar.f6451c) && C1050s.m7205a(this.f6452d, zzbdVar.f6452d) && this.f6453e == zzbdVar.f6453e && this.f6454f == zzbdVar.f6454f && this.f6455g == zzbdVar.f6455g && C1050s.m7205a(this.f6456h, zzbdVar.f6456h);
    }

    public final int hashCode() {
        return this.f6450b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6450b);
        if (this.f6452d != null) {
            sb.append(" tag=");
            sb.append(this.f6452d);
        }
        if (this.f6456h != null) {
            sb.append(" moduleId=");
            sb.append(this.f6456h);
        }
        sb.append(" hideAppOps=");
        sb.append(this.f6453e);
        sb.append(" clients=");
        sb.append(this.f6451c);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f6454f);
        if (this.f6455g) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7260a(parcel, 1, (Parcelable) this.f6450b, i, false);
        C1053b.m7279d(parcel, 5, this.f6451c, false);
        C1053b.m7266a(parcel, 6, this.f6452d, false);
        C1053b.m7269a(parcel, 7, this.f6453e);
        C1053b.m7269a(parcel, 8, this.f6454f);
        C1053b.m7269a(parcel, 9, this.f6455g);
        C1053b.m7266a(parcel, 10, this.f6456h, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
