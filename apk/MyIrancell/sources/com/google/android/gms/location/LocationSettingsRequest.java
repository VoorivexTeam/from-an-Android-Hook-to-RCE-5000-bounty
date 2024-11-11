package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new C1596m();

    /* renamed from: b */
    private final List<LocationRequest> f7079b;

    /* renamed from: c */
    private final boolean f7080c;

    /* renamed from: d */
    private final boolean f7081d;

    /* renamed from: e */
    private zzae f7082e;

    /* renamed from: com.google.android.gms.location.LocationSettingsRequest$a */
    /* loaded from: classes.dex */
    public static final class C1571a {

        /* renamed from: a */
        private final ArrayList<LocationRequest> f7083a = new ArrayList<>();

        /* renamed from: b */
        private boolean f7084b = false;

        /* renamed from: c */
        private boolean f7085c = false;

        /* renamed from: a */
        public final C1571a m8954a(LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.f7083a.add(locationRequest);
            }
            return this;
        }

        /* renamed from: a */
        public final LocationSettingsRequest m8955a() {
            return new LocationSettingsRequest(this.f7083a, this.f7084b, this.f7085c, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationSettingsRequest(List<LocationRequest> list, boolean z, boolean z2, zzae zzaeVar) {
        this.f7079b = list;
        this.f7080c = z;
        this.f7081d = z2;
        this.f7082e = zzaeVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7279d(parcel, 1, Collections.unmodifiableList(this.f7079b), false);
        C1053b.m7269a(parcel, 2, this.f7080c);
        C1053b.m7269a(parcel, 3, this.f7081d);
        C1053b.m7260a(parcel, 5, (Parcelable) this.f7082e, i, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
