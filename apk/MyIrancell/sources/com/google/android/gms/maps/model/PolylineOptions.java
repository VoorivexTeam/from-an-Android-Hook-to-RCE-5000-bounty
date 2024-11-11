package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class PolylineOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolylineOptions> CREATOR = new C1647m();

    /* renamed from: b */
    private final List<LatLng> f7297b;

    /* renamed from: c */
    private float f7298c;

    /* renamed from: d */
    private int f7299d;

    /* renamed from: e */
    private float f7300e;

    /* renamed from: f */
    private boolean f7301f;

    /* renamed from: g */
    private boolean f7302g;

    /* renamed from: h */
    private boolean f7303h;

    /* renamed from: i */
    private Cap f7304i;

    /* renamed from: j */
    private Cap f7305j;

    /* renamed from: k */
    private int f7306k;

    /* renamed from: l */
    private List<PatternItem> f7307l;

    public PolylineOptions() {
        this.f7298c = 10.0f;
        this.f7299d = -16777216;
        this.f7300e = 0.0f;
        this.f7301f = true;
        this.f7302g = false;
        this.f7303h = false;
        this.f7304i = new ButtCap();
        this.f7305j = new ButtCap();
        this.f7306k = 0;
        this.f7307l = null;
        this.f7297b = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PolylineOptions(List list, float f, int i, float f2, boolean z, boolean z2, boolean z3, Cap cap, Cap cap2, int i2, List<PatternItem> list2) {
        this.f7298c = 10.0f;
        this.f7299d = -16777216;
        this.f7300e = 0.0f;
        this.f7301f = true;
        this.f7302g = false;
        this.f7303h = false;
        this.f7304i = new ButtCap();
        this.f7305j = new ButtCap();
        this.f7306k = 0;
        this.f7307l = null;
        this.f7297b = list;
        this.f7298c = f;
        this.f7299d = i;
        this.f7300e = f2;
        this.f7301f = z;
        this.f7302g = z2;
        this.f7303h = z3;
        if (cap != null) {
            this.f7304i = cap;
        }
        if (cap2 != null) {
            this.f7305j = cap2;
        }
        this.f7306k = i2;
        this.f7307l = list2;
    }

    /* renamed from: j */
    public final int m9049j() {
        return this.f7299d;
    }

    /* renamed from: k */
    public final Cap m9050k() {
        return this.f7305j;
    }

    /* renamed from: l */
    public final int m9051l() {
        return this.f7306k;
    }

    /* renamed from: m */
    public final List<PatternItem> m9052m() {
        return this.f7307l;
    }

    /* renamed from: n */
    public final List<LatLng> m9053n() {
        return this.f7297b;
    }

    /* renamed from: o */
    public final Cap m9054o() {
        return this.f7304i;
    }

    /* renamed from: p */
    public final float m9055p() {
        return this.f7298c;
    }

    /* renamed from: q */
    public final float m9056q() {
        return this.f7300e;
    }

    /* renamed from: r */
    public final boolean m9057r() {
        return this.f7303h;
    }

    /* renamed from: s */
    public final boolean m9058s() {
        return this.f7302g;
    }

    /* renamed from: t */
    public final boolean m9059t() {
        return this.f7301f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7279d(parcel, 2, m9053n(), false);
        C1053b.m7254a(parcel, 3, m9055p());
        C1053b.m7255a(parcel, 4, m9049j());
        C1053b.m7254a(parcel, 5, m9056q());
        C1053b.m7269a(parcel, 6, m9059t());
        C1053b.m7269a(parcel, 7, m9058s());
        C1053b.m7269a(parcel, 8, m9057r());
        C1053b.m7260a(parcel, 9, (Parcelable) m9054o(), i, false);
        C1053b.m7260a(parcel, 10, (Parcelable) m9050k(), i, false);
        C1053b.m7255a(parcel, 11, m9051l());
        C1053b.m7279d(parcel, 12, m9052m(), false);
        C1053b.m7251a(parcel, m7250a);
    }
}
