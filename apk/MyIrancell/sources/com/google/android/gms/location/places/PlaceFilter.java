package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Deprecated
/* loaded from: classes.dex */
public final class PlaceFilter extends zzb {
    public static final Parcelable.Creator<PlaceFilter> CREATOR = new C1607g();

    /* renamed from: b */
    private final List<Integer> f7114b;

    /* renamed from: c */
    private final boolean f7115c;

    /* renamed from: d */
    private final List<zzp> f7116d;

    /* renamed from: e */
    private final List<String> f7117e;

    /* renamed from: f */
    private final Set<Integer> f7118f;

    /* renamed from: g */
    private final Set<zzp> f7119g;

    /* renamed from: h */
    private final Set<String> f7120h;

    static {
        new PlaceFilter();
    }

    public PlaceFilter() {
        this(false, null);
    }

    private PlaceFilter(Collection<Integer> collection, boolean z, Collection<String> collection2, Collection<zzp> collection3) {
        this((List<Integer>) zzb.m8993a((Collection) null), z, (List<String>) zzb.m8993a(collection2), (List<zzp>) zzb.m8993a((Collection) null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PlaceFilter(List<Integer> list, boolean z, List<String> list2, List<zzp> list3) {
        this.f7114b = list;
        this.f7115c = z;
        this.f7116d = list3;
        this.f7117e = list2;
        this.f7118f = zzb.m8994a((List) list);
        this.f7119g = zzb.m8994a((List) this.f7116d);
        this.f7120h = zzb.m8994a((List) this.f7117e);
    }

    public PlaceFilter(boolean z, Collection<String> collection) {
        this((Collection<Integer>) null, z, collection, (Collection<zzp>) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceFilter)) {
            return false;
        }
        PlaceFilter placeFilter = (PlaceFilter) obj;
        return this.f7118f.equals(placeFilter.f7118f) && this.f7115c == placeFilter.f7115c && this.f7119g.equals(placeFilter.f7119g) && this.f7120h.equals(placeFilter.f7120h);
    }

    public final int hashCode() {
        return C1050s.m7203a(this.f7118f, Boolean.valueOf(this.f7115c), this.f7119g, this.f7120h);
    }

    public final String toString() {
        C1050s.a m7204a = C1050s.m7204a(this);
        if (!this.f7118f.isEmpty()) {
            m7204a.m7206a("types", this.f7118f);
        }
        m7204a.m7206a("requireOpenNow", Boolean.valueOf(this.f7115c));
        if (!this.f7120h.isEmpty()) {
            m7204a.m7206a("placeIds", this.f7120h);
        }
        if (!this.f7119g.isEmpty()) {
            m7204a.m7206a("requestedUserDataTypes", this.f7119g);
        }
        return m7204a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7267a(parcel, 1, this.f7114b, false);
        C1053b.m7269a(parcel, 3, this.f7115c);
        C1053b.m7279d(parcel, 4, this.f7116d, false);
        C1053b.m7278c(parcel, 6, this.f7117e, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
