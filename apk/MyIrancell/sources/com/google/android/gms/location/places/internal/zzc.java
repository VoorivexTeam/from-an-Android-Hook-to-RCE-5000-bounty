package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new C1618i();

    /* renamed from: b */
    private final String f7174b;

    /* renamed from: c */
    private final String f7175c;

    /* renamed from: d */
    private final List<Integer> f7176d;

    /* renamed from: e */
    private final List<zzb> f7177e;

    /* renamed from: f */
    private final int f7178f;

    /* renamed from: g */
    private final String f7179g;

    /* renamed from: h */
    private final List<zzb> f7180h;

    /* renamed from: i */
    private final String f7181i;

    /* renamed from: j */
    private final List<zzb> f7182j;

    static {
        Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzc(String str, List<Integer> list, int i, String str2, List<zzb> list2, String str3, List<zzb> list3, String str4, List<zzb> list4) {
        this.f7175c = str;
        this.f7176d = list;
        this.f7178f = i;
        this.f7174b = str2;
        this.f7177e = list2;
        this.f7179g = str3;
        this.f7180h = list3;
        this.f7181i = str4;
        this.f7182j = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzc)) {
            return false;
        }
        zzc zzcVar = (zzc) obj;
        return C1050s.m7205a(this.f7175c, zzcVar.f7175c) && C1050s.m7205a(this.f7176d, zzcVar.f7176d) && C1050s.m7205a(Integer.valueOf(this.f7178f), Integer.valueOf(zzcVar.f7178f)) && C1050s.m7205a(this.f7174b, zzcVar.f7174b) && C1050s.m7205a(this.f7177e, zzcVar.f7177e) && C1050s.m7205a(this.f7179g, zzcVar.f7179g) && C1050s.m7205a(this.f7180h, zzcVar.f7180h) && C1050s.m7205a(this.f7181i, zzcVar.f7181i) && C1050s.m7205a(this.f7182j, zzcVar.f7182j);
    }

    public final int hashCode() {
        return C1050s.m7203a(this.f7175c, this.f7176d, Integer.valueOf(this.f7178f), this.f7174b, this.f7177e, this.f7179g, this.f7180h, this.f7181i, this.f7182j);
    }

    public final String toString() {
        C1050s.a m7204a = C1050s.m7204a(this);
        m7204a.m7206a("placeId", this.f7175c);
        m7204a.m7206a("placeTypes", this.f7176d);
        m7204a.m7206a("fullText", this.f7174b);
        m7204a.m7206a("fullTextMatchedSubstrings", this.f7177e);
        m7204a.m7206a("primaryText", this.f7179g);
        m7204a.m7206a("primaryTextMatchedSubstrings", this.f7180h);
        m7204a.m7206a("secondaryText", this.f7181i);
        m7204a.m7206a("secondaryTextMatchedSubstrings", this.f7182j);
        return m7204a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7266a(parcel, 1, this.f7174b, false);
        C1053b.m7266a(parcel, 2, this.f7175c, false);
        C1053b.m7267a(parcel, 3, this.f7176d, false);
        C1053b.m7279d(parcel, 4, this.f7177e, false);
        C1053b.m7255a(parcel, 5, this.f7178f);
        C1053b.m7266a(parcel, 6, this.f7179g, false);
        C1053b.m7279d(parcel, 7, this.f7180h, false);
        C1053b.m7266a(parcel, 8, this.f7181i, false);
        C1053b.m7279d(parcel, 9, this.f7182j, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
