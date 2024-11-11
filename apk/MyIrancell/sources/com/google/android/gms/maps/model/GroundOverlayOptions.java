package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import p000.InterfaceC2481fp;

/* loaded from: classes.dex */
public final class GroundOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GroundOverlayOptions> CREATOR = new C1639e();

    /* renamed from: b */
    private C1635a f7250b;

    /* renamed from: c */
    private LatLng f7251c;

    /* renamed from: d */
    private float f7252d;

    /* renamed from: e */
    private float f7253e;

    /* renamed from: f */
    private LatLngBounds f7254f;

    /* renamed from: g */
    private float f7255g;

    /* renamed from: h */
    private float f7256h;

    /* renamed from: i */
    private boolean f7257i;

    /* renamed from: j */
    private float f7258j;

    /* renamed from: k */
    private float f7259k;

    /* renamed from: l */
    private float f7260l;

    /* renamed from: m */
    private boolean f7261m;

    public GroundOverlayOptions() {
        this.f7257i = true;
        this.f7258j = 0.0f;
        this.f7259k = 0.5f;
        this.f7260l = 0.5f;
        this.f7261m = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GroundOverlayOptions(IBinder iBinder, LatLng latLng, float f, float f2, LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7, boolean z2) {
        this.f7257i = true;
        this.f7258j = 0.0f;
        this.f7259k = 0.5f;
        this.f7260l = 0.5f;
        this.f7261m = false;
        this.f7250b = new C1635a(InterfaceC2481fp.a.m11796a(iBinder));
        this.f7251c = latLng;
        this.f7252d = f;
        this.f7253e = f2;
        this.f7254f = latLngBounds;
        this.f7255g = f3;
        this.f7256h = f4;
        this.f7257i = z;
        this.f7258j = f5;
        this.f7259k = f6;
        this.f7260l = f7;
        this.f7261m = z2;
    }

    /* renamed from: j */
    public final float m9015j() {
        return this.f7259k;
    }

    /* renamed from: k */
    public final float m9016k() {
        return this.f7260l;
    }

    /* renamed from: l */
    public final float m9017l() {
        return this.f7255g;
    }

    /* renamed from: m */
    public final LatLngBounds m9018m() {
        return this.f7254f;
    }

    /* renamed from: n */
    public final float m9019n() {
        return this.f7253e;
    }

    /* renamed from: o */
    public final LatLng m9020o() {
        return this.f7251c;
    }

    /* renamed from: p */
    public final float m9021p() {
        return this.f7258j;
    }

    /* renamed from: q */
    public final float m9022q() {
        return this.f7252d;
    }

    /* renamed from: r */
    public final float m9023r() {
        return this.f7256h;
    }

    /* renamed from: s */
    public final boolean m9024s() {
        return this.f7261m;
    }

    /* renamed from: t */
    public final boolean m9025t() {
        return this.f7257i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7258a(parcel, 2, this.f7250b.m9068a().asBinder(), false);
        C1053b.m7260a(parcel, 3, (Parcelable) m9020o(), i, false);
        C1053b.m7254a(parcel, 4, m9022q());
        C1053b.m7254a(parcel, 5, m9019n());
        C1053b.m7260a(parcel, 6, (Parcelable) m9018m(), i, false);
        C1053b.m7254a(parcel, 7, m9017l());
        C1053b.m7254a(parcel, 8, m9023r());
        C1053b.m7269a(parcel, 9, m9025t());
        C1053b.m7254a(parcel, 10, m9021p());
        C1053b.m7254a(parcel, 11, m9015j());
        C1053b.m7254a(parcel, 12, m9016k());
        C1053b.m7269a(parcel, 13, m9024s());
        C1053b.m7251a(parcel, m7250a);
    }
}
