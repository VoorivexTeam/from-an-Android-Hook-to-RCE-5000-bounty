package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import p000.InterfaceC2481fp;

/* loaded from: classes.dex */
public class Cap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Cap> CREATOR = new C1637c();

    /* renamed from: b */
    private final int f7234b;

    /* renamed from: c */
    private final C1635a f7235c;

    /* renamed from: d */
    private final Float f7236d;

    /* JADX INFO: Access modifiers changed from: protected */
    public Cap(int i) {
        this(i, (C1635a) null, (Float) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Cap(int i, IBinder iBinder, Float f) {
        this(i, iBinder == null ? null : new C1635a(InterfaceC2481fp.a.m11796a(iBinder)), f);
    }

    private Cap(int i, C1635a c1635a, Float f) {
        C1057u.m7294a(i != 3 || (c1635a != null && (f != null && (f.floatValue() > 0.0f ? 1 : (f.floatValue() == 0.0f ? 0 : -1)) > 0)), String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", Integer.valueOf(i), c1635a, f));
        this.f7234b = i;
        this.f7235c = c1635a;
        this.f7236d = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.f7234b == cap.f7234b && C1050s.m7205a(this.f7235c, cap.f7235c) && C1050s.m7205a(this.f7236d, cap.f7236d);
    }

    public int hashCode() {
        return C1050s.m7203a(Integer.valueOf(this.f7234b), this.f7235c, this.f7236d);
    }

    public String toString() {
        int i = this.f7234b;
        StringBuilder sb = new StringBuilder(23);
        sb.append("[Cap: type=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 2, this.f7234b);
        C1635a c1635a = this.f7235c;
        C1053b.m7258a(parcel, 3, c1635a == null ? null : c1635a.m9068a().asBinder(), false);
        C1053b.m7263a(parcel, 4, this.f7236d, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
