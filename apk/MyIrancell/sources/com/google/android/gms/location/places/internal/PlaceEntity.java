package com.google.android.gms.location.places.internal;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import com.google.android.gms.location.places.InterfaceC1601a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class PlaceEntity extends AbstractSafeParcelable implements ReflectedParcelable, InterfaceC1601a {
    public static final Parcelable.Creator<PlaceEntity> CREATOR = new C1610a();

    /* renamed from: b */
    private final String f7130b;

    /* renamed from: c */
    private final LatLng f7131c;

    /* renamed from: d */
    private final float f7132d;

    /* renamed from: e */
    private final LatLngBounds f7133e;

    /* renamed from: f */
    private final String f7134f;

    /* renamed from: g */
    private final Uri f7135g;

    /* renamed from: h */
    private final boolean f7136h;

    /* renamed from: i */
    private final float f7137i;

    /* renamed from: j */
    private final int f7138j;

    /* renamed from: k */
    private final List<Integer> f7139k;

    /* renamed from: l */
    private final String f7140l;

    /* renamed from: m */
    private final String f7141m;

    /* renamed from: n */
    private final String f7142n;

    /* renamed from: o */
    private final List<String> f7143o;

    /* renamed from: p */
    private final zzal f7144p;

    /* renamed from: q */
    private final zzai f7145q;

    /* renamed from: r */
    private final String f7146r;

    /* renamed from: s */
    private Locale f7147s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PlaceEntity(String str, List<Integer> list, String str2, String str3, String str4, List<String> list2, LatLng latLng, float f, LatLngBounds latLngBounds, String str5, Uri uri, boolean z, float f2, int i, zzal zzalVar, zzai zzaiVar, String str6) {
        this.f7130b = str;
        this.f7139k = Collections.unmodifiableList(list);
        this.f7140l = str2;
        this.f7141m = str3;
        this.f7142n = str4;
        this.f7143o = list2 != null ? list2 : Collections.emptyList();
        this.f7131c = latLng;
        this.f7132d = f;
        this.f7133e = latLngBounds;
        this.f7134f = str5 != null ? str5 : "UTC";
        this.f7135g = uri;
        this.f7136h = z;
        this.f7137i = f2;
        this.f7138j = i;
        this.f7147s = null;
        this.f7144p = zzalVar;
        this.f7145q = zzaiVar;
        this.f7146r = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceEntity)) {
            return false;
        }
        PlaceEntity placeEntity = (PlaceEntity) obj;
        return this.f7130b.equals(placeEntity.f7130b) && C1050s.m7205a(this.f7147s, placeEntity.f7147s);
    }

    @Override // com.google.android.gms.location.places.InterfaceC1601a
    /* renamed from: f */
    public final /* synthetic */ CharSequence mo8982f() {
        return this.f7141m;
    }

    @Override // com.google.android.gms.location.places.InterfaceC1601a
    /* renamed from: h */
    public final LatLng mo8983h() {
        return this.f7131c;
    }

    public final int hashCode() {
        return C1050s.m7203a(this.f7130b, this.f7147s);
    }

    /* renamed from: j */
    public final String m8984j() {
        return this.f7130b;
    }

    /* renamed from: k */
    public final /* synthetic */ CharSequence m8985k() {
        return this.f7140l;
    }

    /* renamed from: l */
    public final /* synthetic */ CharSequence m8986l() {
        return this.f7142n;
    }

    /* renamed from: m */
    public final List<Integer> m8987m() {
        return this.f7139k;
    }

    /* renamed from: n */
    public final int m8988n() {
        return this.f7138j;
    }

    /* renamed from: o */
    public final float m8989o() {
        return this.f7137i;
    }

    /* renamed from: p */
    public final LatLngBounds m8990p() {
        return this.f7133e;
    }

    /* renamed from: q */
    public final Uri m8991q() {
        return this.f7135g;
    }

    @SuppressLint({"DefaultLocale"})
    public final String toString() {
        C1050s.a m7204a = C1050s.m7204a(this);
        m7204a.m7206a("id", this.f7130b);
        m7204a.m7206a("placeTypes", this.f7139k);
        m7204a.m7206a("locale", this.f7147s);
        m7204a.m7206a("name", this.f7140l);
        m7204a.m7206a("address", this.f7141m);
        m7204a.m7206a("phoneNumber", this.f7142n);
        m7204a.m7206a("latlng", this.f7131c);
        m7204a.m7206a("viewport", this.f7133e);
        m7204a.m7206a("websiteUri", this.f7135g);
        m7204a.m7206a("isPermanentlyClosed", Boolean.valueOf(this.f7136h));
        m7204a.m7206a("priceLevel", Integer.valueOf(this.f7138j));
        return m7204a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7266a(parcel, 1, m8984j(), false);
        C1053b.m7260a(parcel, 4, (Parcelable) mo8983h(), i, false);
        C1053b.m7254a(parcel, 5, this.f7132d);
        C1053b.m7260a(parcel, 6, (Parcelable) m8990p(), i, false);
        C1053b.m7266a(parcel, 7, this.f7134f, false);
        C1053b.m7260a(parcel, 8, (Parcelable) m8991q(), i, false);
        C1053b.m7269a(parcel, 9, this.f7136h);
        C1053b.m7254a(parcel, 10, m8989o());
        C1053b.m7255a(parcel, 11, m8988n());
        C1053b.m7266a(parcel, 14, (String) mo8982f(), false);
        C1053b.m7266a(parcel, 15, (String) m8986l(), false);
        C1053b.m7278c(parcel, 17, this.f7143o, false);
        C1053b.m7266a(parcel, 19, (String) m8985k(), false);
        C1053b.m7267a(parcel, 20, m8987m(), false);
        C1053b.m7260a(parcel, 21, (Parcelable) this.f7144p, i, false);
        C1053b.m7260a(parcel, 22, (Parcelable) this.f7145q, i, false);
        C1053b.m7266a(parcel, 23, this.f7146r, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
