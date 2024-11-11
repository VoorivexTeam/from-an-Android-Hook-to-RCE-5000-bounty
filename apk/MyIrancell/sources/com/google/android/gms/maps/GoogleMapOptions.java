package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import p000.C3272tr;

/* loaded from: classes.dex */
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new C1632a();

    /* renamed from: b */
    private Boolean f7203b;

    /* renamed from: c */
    private Boolean f7204c;

    /* renamed from: d */
    private int f7205d;

    /* renamed from: e */
    private CameraPosition f7206e;

    /* renamed from: f */
    private Boolean f7207f;

    /* renamed from: g */
    private Boolean f7208g;

    /* renamed from: h */
    private Boolean f7209h;

    /* renamed from: i */
    private Boolean f7210i;

    /* renamed from: j */
    private Boolean f7211j;

    /* renamed from: k */
    private Boolean f7212k;

    /* renamed from: l */
    private Boolean f7213l;

    /* renamed from: m */
    private Boolean f7214m;

    /* renamed from: n */
    private Boolean f7215n;

    /* renamed from: o */
    private Float f7216o;

    /* renamed from: p */
    private Float f7217p;

    /* renamed from: q */
    private LatLngBounds f7218q;

    /* renamed from: r */
    private Boolean f7219r;

    public GoogleMapOptions() {
        this.f7205d = -1;
        this.f7216o = null;
        this.f7217p = null;
        this.f7218q = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleMapOptions(byte b, byte b2, int i, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, Float f, Float f2, LatLngBounds latLngBounds, byte b12) {
        this.f7205d = -1;
        this.f7216o = null;
        this.f7217p = null;
        this.f7218q = null;
        this.f7203b = C3272tr.m15665a(b);
        this.f7204c = C3272tr.m15665a(b2);
        this.f7205d = i;
        this.f7206e = cameraPosition;
        this.f7207f = C3272tr.m15665a(b3);
        this.f7208g = C3272tr.m15665a(b4);
        this.f7209h = C3272tr.m15665a(b5);
        this.f7210i = C3272tr.m15665a(b6);
        this.f7211j = C3272tr.m15665a(b7);
        this.f7212k = C3272tr.m15665a(b8);
        this.f7213l = C3272tr.m15665a(b9);
        this.f7214m = C3272tr.m15665a(b10);
        this.f7215n = C3272tr.m15665a(b11);
        this.f7216o = f;
        this.f7217p = f2;
        this.f7218q = latLngBounds;
        this.f7219r = C3272tr.m15665a(b12);
    }

    /* renamed from: j */
    public final CameraPosition m8996j() {
        return this.f7206e;
    }

    /* renamed from: k */
    public final LatLngBounds m8997k() {
        return this.f7218q;
    }

    /* renamed from: l */
    public final int m8998l() {
        return this.f7205d;
    }

    /* renamed from: m */
    public final Float m8999m() {
        return this.f7217p;
    }

    /* renamed from: n */
    public final Float m9000n() {
        return this.f7216o;
    }

    public final String toString() {
        C1050s.a m7204a = C1050s.m7204a(this);
        m7204a.m7206a("MapType", Integer.valueOf(this.f7205d));
        m7204a.m7206a("LiteMode", this.f7213l);
        m7204a.m7206a("Camera", this.f7206e);
        m7204a.m7206a("CompassEnabled", this.f7208g);
        m7204a.m7206a("ZoomControlsEnabled", this.f7207f);
        m7204a.m7206a("ScrollGesturesEnabled", this.f7209h);
        m7204a.m7206a("ZoomGesturesEnabled", this.f7210i);
        m7204a.m7206a("TiltGesturesEnabled", this.f7211j);
        m7204a.m7206a("RotateGesturesEnabled", this.f7212k);
        m7204a.m7206a("ScrollGesturesEnabledDuringRotateOrZoom", this.f7219r);
        m7204a.m7206a("MapToolbarEnabled", this.f7214m);
        m7204a.m7206a("AmbientEnabled", this.f7215n);
        m7204a.m7206a("MinZoomPreference", this.f7216o);
        m7204a.m7206a("MaxZoomPreference", this.f7217p);
        m7204a.m7206a("LatLngBoundsForCameraTarget", this.f7218q);
        m7204a.m7206a("ZOrderOnTop", this.f7203b);
        m7204a.m7206a("UseViewLifecycleInFragment", this.f7204c);
        return m7204a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7252a(parcel, 2, C3272tr.m15664a(this.f7203b));
        C1053b.m7252a(parcel, 3, C3272tr.m15664a(this.f7204c));
        C1053b.m7255a(parcel, 4, m8998l());
        C1053b.m7260a(parcel, 5, (Parcelable) m8996j(), i, false);
        C1053b.m7252a(parcel, 6, C3272tr.m15664a(this.f7207f));
        C1053b.m7252a(parcel, 7, C3272tr.m15664a(this.f7208g));
        C1053b.m7252a(parcel, 8, C3272tr.m15664a(this.f7209h));
        C1053b.m7252a(parcel, 9, C3272tr.m15664a(this.f7210i));
        C1053b.m7252a(parcel, 10, C3272tr.m15664a(this.f7211j));
        C1053b.m7252a(parcel, 11, C3272tr.m15664a(this.f7212k));
        C1053b.m7252a(parcel, 12, C3272tr.m15664a(this.f7213l));
        C1053b.m7252a(parcel, 14, C3272tr.m15664a(this.f7214m));
        C1053b.m7252a(parcel, 15, C3272tr.m15664a(this.f7215n));
        C1053b.m7263a(parcel, 16, m9000n(), false);
        C1053b.m7263a(parcel, 17, m8999m(), false);
        C1053b.m7260a(parcel, 18, (Parcelable) m8997k(), i, false);
        C1053b.m7252a(parcel, 19, C3272tr.m15664a(this.f7219r));
        C1053b.m7251a(parcel, m7250a);
    }
}
