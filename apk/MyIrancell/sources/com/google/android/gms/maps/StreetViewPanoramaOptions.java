package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;
import p000.C3272tr;

/* loaded from: classes.dex */
public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOptions> CREATOR = new C1633b();

    /* renamed from: b */
    private StreetViewPanoramaCamera f7220b;

    /* renamed from: c */
    private String f7221c;

    /* renamed from: d */
    private LatLng f7222d;

    /* renamed from: e */
    private Integer f7223e;

    /* renamed from: f */
    private Boolean f7224f;

    /* renamed from: g */
    private Boolean f7225g;

    /* renamed from: h */
    private Boolean f7226h;

    /* renamed from: i */
    private Boolean f7227i;

    /* renamed from: j */
    private Boolean f7228j;

    /* renamed from: k */
    private StreetViewSource f7229k;

    public StreetViewPanoramaOptions() {
        this.f7224f = true;
        this.f7225g = true;
        this.f7226h = true;
        this.f7227i = true;
        this.f7229k = StreetViewSource.f7321c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public StreetViewPanoramaOptions(StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b, byte b2, byte b3, byte b4, byte b5, StreetViewSource streetViewSource) {
        this.f7224f = true;
        this.f7225g = true;
        this.f7226h = true;
        this.f7227i = true;
        this.f7229k = StreetViewSource.f7321c;
        this.f7220b = streetViewPanoramaCamera;
        this.f7222d = latLng;
        this.f7223e = num;
        this.f7221c = str;
        this.f7224f = C3272tr.m15665a(b);
        this.f7225g = C3272tr.m15665a(b2);
        this.f7226h = C3272tr.m15665a(b3);
        this.f7227i = C3272tr.m15665a(b4);
        this.f7228j = C3272tr.m15665a(b5);
        this.f7229k = streetViewSource;
    }

    /* renamed from: j */
    public final String m9001j() {
        return this.f7221c;
    }

    /* renamed from: k */
    public final LatLng m9002k() {
        return this.f7222d;
    }

    /* renamed from: l */
    public final Integer m9003l() {
        return this.f7223e;
    }

    /* renamed from: m */
    public final StreetViewSource m9004m() {
        return this.f7229k;
    }

    /* renamed from: n */
    public final StreetViewPanoramaCamera m9005n() {
        return this.f7220b;
    }

    public final String toString() {
        C1050s.a m7204a = C1050s.m7204a(this);
        m7204a.m7206a("PanoramaId", this.f7221c);
        m7204a.m7206a("Position", this.f7222d);
        m7204a.m7206a("Radius", this.f7223e);
        m7204a.m7206a("Source", this.f7229k);
        m7204a.m7206a("StreetViewPanoramaCamera", this.f7220b);
        m7204a.m7206a("UserNavigationEnabled", this.f7224f);
        m7204a.m7206a("ZoomGesturesEnabled", this.f7225g);
        m7204a.m7206a("PanningGesturesEnabled", this.f7226h);
        m7204a.m7206a("StreetNamesEnabled", this.f7227i);
        m7204a.m7206a("UseViewLifecycleInFragment", this.f7228j);
        return m7204a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7260a(parcel, 2, (Parcelable) m9005n(), i, false);
        C1053b.m7266a(parcel, 3, m9001j(), false);
        C1053b.m7260a(parcel, 4, (Parcelable) m9002k(), i, false);
        C1053b.m7264a(parcel, 5, m9003l(), false);
        C1053b.m7252a(parcel, 6, C3272tr.m15664a(this.f7224f));
        C1053b.m7252a(parcel, 7, C3272tr.m15664a(this.f7225g));
        C1053b.m7252a(parcel, 8, C3272tr.m15664a(this.f7226h));
        C1053b.m7252a(parcel, 9, C3272tr.m15664a(this.f7227i));
        C1053b.m7252a(parcel, 10, C3272tr.m15664a(this.f7228j));
        C1053b.m7260a(parcel, 11, (Parcelable) m9004m(), i, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
