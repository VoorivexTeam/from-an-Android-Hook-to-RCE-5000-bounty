package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import p000.InterfaceC2481fp;

/* loaded from: classes.dex */
public final class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new C1643i();

    /* renamed from: b */
    private LatLng f7267b;

    /* renamed from: c */
    private String f7268c;

    /* renamed from: d */
    private String f7269d;

    /* renamed from: e */
    private C1635a f7270e;

    /* renamed from: f */
    private float f7271f;

    /* renamed from: g */
    private float f7272g;

    /* renamed from: h */
    private boolean f7273h;

    /* renamed from: i */
    private boolean f7274i;

    /* renamed from: j */
    private boolean f7275j;

    /* renamed from: k */
    private float f7276k;

    /* renamed from: l */
    private float f7277l;

    /* renamed from: m */
    private float f7278m;

    /* renamed from: n */
    private float f7279n;

    /* renamed from: o */
    private float f7280o;

    public MarkerOptions() {
        this.f7271f = 0.5f;
        this.f7272g = 1.0f;
        this.f7274i = true;
        this.f7275j = false;
        this.f7276k = 0.0f;
        this.f7277l = 0.5f;
        this.f7278m = 0.0f;
        this.f7279n = 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MarkerOptions(LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7) {
        this.f7271f = 0.5f;
        this.f7272g = 1.0f;
        this.f7274i = true;
        this.f7275j = false;
        this.f7276k = 0.0f;
        this.f7277l = 0.5f;
        this.f7278m = 0.0f;
        this.f7279n = 1.0f;
        this.f7267b = latLng;
        this.f7268c = str;
        this.f7269d = str2;
        this.f7270e = iBinder == null ? null : new C1635a(InterfaceC2481fp.a.m11796a(iBinder));
        this.f7271f = f;
        this.f7272g = f2;
        this.f7273h = z;
        this.f7274i = z2;
        this.f7275j = z3;
        this.f7276k = f3;
        this.f7277l = f4;
        this.f7278m = f5;
        this.f7279n = f6;
        this.f7280o = f7;
    }

    /* renamed from: j */
    public final float m9026j() {
        return this.f7279n;
    }

    /* renamed from: k */
    public final float m9027k() {
        return this.f7271f;
    }

    /* renamed from: l */
    public final float m9028l() {
        return this.f7272g;
    }

    /* renamed from: m */
    public final float m9029m() {
        return this.f7277l;
    }

    /* renamed from: n */
    public final float m9030n() {
        return this.f7278m;
    }

    /* renamed from: o */
    public final LatLng m9031o() {
        return this.f7267b;
    }

    /* renamed from: p */
    public final float m9032p() {
        return this.f7276k;
    }

    /* renamed from: q */
    public final String m9033q() {
        return this.f7269d;
    }

    /* renamed from: r */
    public final String m9034r() {
        return this.f7268c;
    }

    /* renamed from: s */
    public final float m9035s() {
        return this.f7280o;
    }

    /* renamed from: t */
    public final boolean m9036t() {
        return this.f7273h;
    }

    /* renamed from: u */
    public final boolean m9037u() {
        return this.f7275j;
    }

    /* renamed from: v */
    public final boolean m9038v() {
        return this.f7274i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7260a(parcel, 2, (Parcelable) m9031o(), i, false);
        C1053b.m7266a(parcel, 3, m9034r(), false);
        C1053b.m7266a(parcel, 4, m9033q(), false);
        C1635a c1635a = this.f7270e;
        C1053b.m7258a(parcel, 5, c1635a == null ? null : c1635a.m9068a().asBinder(), false);
        C1053b.m7254a(parcel, 6, m9027k());
        C1053b.m7254a(parcel, 7, m9028l());
        C1053b.m7269a(parcel, 8, m9036t());
        C1053b.m7269a(parcel, 9, m9038v());
        C1053b.m7269a(parcel, 10, m9037u());
        C1053b.m7254a(parcel, 11, m9032p());
        C1053b.m7254a(parcel, 12, m9029m());
        C1053b.m7254a(parcel, 13, m9030n());
        C1053b.m7254a(parcel, 14, m9026j());
        C1053b.m7254a(parcel, 15, m9035s());
        C1053b.m7251a(parcel, m7250a);
    }
}
