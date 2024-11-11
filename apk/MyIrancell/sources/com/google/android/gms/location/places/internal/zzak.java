package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class zzak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzak> CREATOR = new C1612c();

    /* renamed from: b */
    private final PlaceEntity f7153b;

    /* renamed from: c */
    private final float f7154c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzak(PlaceEntity placeEntity, float f) {
        this.f7153b = placeEntity;
        this.f7154c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzak)) {
            return false;
        }
        zzak zzakVar = (zzak) obj;
        return this.f7153b.equals(zzakVar.f7153b) && this.f7154c == zzakVar.f7154c;
    }

    public final int hashCode() {
        return C1050s.m7203a(this.f7153b, Float.valueOf(this.f7154c));
    }

    public final String toString() {
        C1050s.a m7204a = C1050s.m7204a(this);
        m7204a.m7206a("place", this.f7153b);
        m7204a.m7206a("likelihood", Float.valueOf(this.f7154c));
        return m7204a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7260a(parcel, 1, (Parcelable) this.f7153b, i, false);
        C1053b.m7254a(parcel, 2, this.f7154c);
        C1053b.m7251a(parcel, m7250a);
    }
}
