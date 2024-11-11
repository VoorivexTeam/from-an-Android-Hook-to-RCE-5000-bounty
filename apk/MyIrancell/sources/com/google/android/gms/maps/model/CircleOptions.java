package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import java.util.List;

/* loaded from: classes.dex */
public final class CircleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CircleOptions> CREATOR = new C1638d();

    /* renamed from: b */
    private LatLng f7237b;

    /* renamed from: c */
    private double f7238c;

    /* renamed from: d */
    private float f7239d;

    /* renamed from: e */
    private int f7240e;

    /* renamed from: f */
    private int f7241f;

    /* renamed from: g */
    private float f7242g;

    /* renamed from: h */
    private boolean f7243h;

    /* renamed from: i */
    private boolean f7244i;

    /* renamed from: j */
    private List<PatternItem> f7245j;

    public CircleOptions() {
        this.f7237b = null;
        this.f7238c = 0.0d;
        this.f7239d = 10.0f;
        this.f7240e = -16777216;
        this.f7241f = 0;
        this.f7242g = 0.0f;
        this.f7243h = true;
        this.f7244i = false;
        this.f7245j = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CircleOptions(LatLng latLng, double d, float f, int i, int i2, float f2, boolean z, boolean z2, List<PatternItem> list) {
        this.f7237b = null;
        this.f7238c = 0.0d;
        this.f7239d = 10.0f;
        this.f7240e = -16777216;
        this.f7241f = 0;
        this.f7242g = 0.0f;
        this.f7243h = true;
        this.f7244i = false;
        this.f7245j = null;
        this.f7237b = latLng;
        this.f7238c = d;
        this.f7239d = f;
        this.f7240e = i;
        this.f7241f = i2;
        this.f7242g = f2;
        this.f7243h = z;
        this.f7244i = z2;
        this.f7245j = list;
    }

    /* renamed from: j */
    public final LatLng m9006j() {
        return this.f7237b;
    }

    /* renamed from: k */
    public final int m9007k() {
        return this.f7241f;
    }

    /* renamed from: l */
    public final double m9008l() {
        return this.f7238c;
    }

    /* renamed from: m */
    public final int m9009m() {
        return this.f7240e;
    }

    /* renamed from: n */
    public final List<PatternItem> m9010n() {
        return this.f7245j;
    }

    /* renamed from: o */
    public final float m9011o() {
        return this.f7239d;
    }

    /* renamed from: p */
    public final float m9012p() {
        return this.f7242g;
    }

    /* renamed from: q */
    public final boolean m9013q() {
        return this.f7244i;
    }

    /* renamed from: r */
    public final boolean m9014r() {
        return this.f7243h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7260a(parcel, 2, (Parcelable) m9006j(), i, false);
        C1053b.m7253a(parcel, 3, m9008l());
        C1053b.m7254a(parcel, 4, m9011o());
        C1053b.m7255a(parcel, 5, m9009m());
        C1053b.m7255a(parcel, 6, m9007k());
        C1053b.m7254a(parcel, 7, m9012p());
        C1053b.m7269a(parcel, 8, m9014r());
        C1053b.m7269a(parcel, 9, m9013q());
        C1053b.m7279d(parcel, 10, m9010n(), false);
        C1053b.m7251a(parcel, m7250a);
    }
}
