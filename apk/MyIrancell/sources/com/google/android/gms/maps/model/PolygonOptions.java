package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class PolygonOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolygonOptions> CREATOR = new C1646l();

    /* renamed from: b */
    private final List<LatLng> f7286b;

    /* renamed from: c */
    private final List<List<LatLng>> f7287c;

    /* renamed from: d */
    private float f7288d;

    /* renamed from: e */
    private int f7289e;

    /* renamed from: f */
    private int f7290f;

    /* renamed from: g */
    private float f7291g;

    /* renamed from: h */
    private boolean f7292h;

    /* renamed from: i */
    private boolean f7293i;

    /* renamed from: j */
    private boolean f7294j;

    /* renamed from: k */
    private int f7295k;

    /* renamed from: l */
    private List<PatternItem> f7296l;

    public PolygonOptions() {
        this.f7288d = 10.0f;
        this.f7289e = -16777216;
        this.f7290f = 0;
        this.f7291g = 0.0f;
        this.f7292h = true;
        this.f7293i = false;
        this.f7294j = false;
        this.f7295k = 0;
        this.f7296l = null;
        this.f7286b = new ArrayList();
        this.f7287c = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PolygonOptions(List<LatLng> list, List list2, float f, int i, int i2, float f2, boolean z, boolean z2, boolean z3, int i3, List<PatternItem> list3) {
        this.f7288d = 10.0f;
        this.f7289e = -16777216;
        this.f7290f = 0;
        this.f7291g = 0.0f;
        this.f7292h = true;
        this.f7293i = false;
        this.f7294j = false;
        this.f7295k = 0;
        this.f7296l = null;
        this.f7286b = list;
        this.f7287c = list2;
        this.f7288d = f;
        this.f7289e = i;
        this.f7290f = i2;
        this.f7291g = f2;
        this.f7292h = z;
        this.f7293i = z2;
        this.f7294j = z3;
        this.f7295k = i3;
        this.f7296l = list3;
    }

    /* renamed from: j */
    public final int m9039j() {
        return this.f7290f;
    }

    /* renamed from: k */
    public final List<LatLng> m9040k() {
        return this.f7286b;
    }

    /* renamed from: l */
    public final int m9041l() {
        return this.f7289e;
    }

    /* renamed from: m */
    public final int m9042m() {
        return this.f7295k;
    }

    /* renamed from: n */
    public final List<PatternItem> m9043n() {
        return this.f7296l;
    }

    /* renamed from: o */
    public final float m9044o() {
        return this.f7288d;
    }

    /* renamed from: p */
    public final float m9045p() {
        return this.f7291g;
    }

    /* renamed from: q */
    public final boolean m9046q() {
        return this.f7294j;
    }

    /* renamed from: r */
    public final boolean m9047r() {
        return this.f7293i;
    }

    /* renamed from: s */
    public final boolean m9048s() {
        return this.f7292h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7279d(parcel, 2, m9040k(), false);
        C1053b.m7276b(parcel, 3, this.f7287c, false);
        C1053b.m7254a(parcel, 4, m9044o());
        C1053b.m7255a(parcel, 5, m9041l());
        C1053b.m7255a(parcel, 6, m9039j());
        C1053b.m7254a(parcel, 7, m9045p());
        C1053b.m7269a(parcel, 8, m9048s());
        C1053b.m7269a(parcel, 9, m9047r());
        C1053b.m7269a(parcel, 10, m9046q());
        C1053b.m7255a(parcel, 11, m9042m());
        C1053b.m7279d(parcel, 12, m9043n(), false);
        C1053b.m7251a(parcel, m7250a);
    }
}
