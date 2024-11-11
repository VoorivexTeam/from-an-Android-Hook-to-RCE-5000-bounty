package com.google.android.gms.location.places;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public class AddPlaceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AddPlaceRequest> CREATOR = new C1605e();

    /* renamed from: b */
    private final String f7103b;

    /* renamed from: c */
    private final LatLng f7104c;

    /* renamed from: d */
    private final String f7105d;

    /* renamed from: e */
    private final List<Integer> f7106e;

    /* renamed from: f */
    private final String f7107f;

    /* renamed from: g */
    private final Uri f7108g;

    public AddPlaceRequest(String str, LatLng latLng, String str2, List<Integer> list, String str3, Uri uri) {
        C1057u.m7296b(str);
        this.f7103b = str;
        C1057u.m7286a(latLng);
        this.f7104c = latLng;
        C1057u.m7296b(str2);
        this.f7105d = str2;
        C1057u.m7286a(list);
        this.f7106e = new ArrayList(list);
        boolean z = true;
        C1057u.m7294a(!r1.isEmpty(), "At least one place type should be provided.");
        if (TextUtils.isEmpty(str3) && uri == null) {
            z = false;
        }
        C1057u.m7294a(z, "One of phone number or URI should be provided.");
        this.f7107f = str3;
        this.f7108g = uri;
    }

    /* renamed from: f */
    public String m8974f() {
        return this.f7105d;
    }

    /* renamed from: h */
    public LatLng m8975h() {
        return this.f7104c;
    }

    /* renamed from: j */
    public String m8976j() {
        return this.f7103b;
    }

    /* renamed from: k */
    public String m8977k() {
        return this.f7107f;
    }

    /* renamed from: l */
    public List<Integer> m8978l() {
        return this.f7106e;
    }

    /* renamed from: m */
    public Uri m8979m() {
        return this.f7108g;
    }

    public String toString() {
        C1050s.a m7204a = C1050s.m7204a(this);
        m7204a.m7206a("name", this.f7103b);
        m7204a.m7206a("latLng", this.f7104c);
        m7204a.m7206a("address", this.f7105d);
        m7204a.m7206a("placeTypes", this.f7106e);
        m7204a.m7206a("phoneNumer", this.f7107f);
        m7204a.m7206a("websiteUri", this.f7108g);
        return m7204a.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7266a(parcel, 1, m8976j(), false);
        C1053b.m7260a(parcel, 2, (Parcelable) m8975h(), i, false);
        C1053b.m7266a(parcel, 3, m8974f(), false);
        C1053b.m7267a(parcel, 4, m8978l(), false);
        C1053b.m7266a(parcel, 5, m8977k(), false);
        C1053b.m7260a(parcel, 6, (Parcelable) m8979m(), i, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
