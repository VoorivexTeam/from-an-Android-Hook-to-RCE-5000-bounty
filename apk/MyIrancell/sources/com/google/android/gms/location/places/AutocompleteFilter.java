package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public class AutocompleteFilter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AutocompleteFilter> CREATOR = new C1606f();

    /* renamed from: b */
    private final int f7109b;

    /* renamed from: c */
    private final boolean f7110c;

    /* renamed from: d */
    private final List<Integer> f7111d;

    /* renamed from: e */
    private final String f7112e;

    /* renamed from: f */
    private final int f7113f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutocompleteFilter(int i, boolean z, List<Integer> list, String str) {
        this.f7109b = i;
        this.f7111d = list;
        this.f7113f = (list == null || list.isEmpty()) ? 0 : list.iterator().next().intValue();
        this.f7112e = str;
        if (this.f7109b <= 0) {
            this.f7110c = !z;
        } else {
            this.f7110c = z;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutocompleteFilter)) {
            return false;
        }
        AutocompleteFilter autocompleteFilter = (AutocompleteFilter) obj;
        return this.f7113f == autocompleteFilter.f7113f && this.f7110c == autocompleteFilter.f7110c && this.f7112e == autocompleteFilter.f7112e;
    }

    public int hashCode() {
        return C1050s.m7203a(Boolean.valueOf(this.f7110c), Integer.valueOf(this.f7113f), this.f7112e);
    }

    public String toString() {
        C1050s.a m7204a = C1050s.m7204a(this);
        m7204a.m7206a("includeQueryPredictions", Boolean.valueOf(this.f7110c));
        m7204a.m7206a("typeFilter", Integer.valueOf(this.f7113f));
        m7204a.m7206a("country", this.f7112e);
        return m7204a.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7269a(parcel, 1, this.f7110c);
        C1053b.m7267a(parcel, 2, this.f7111d, false);
        C1053b.m7266a(parcel, 3, this.f7112e, false);
        C1053b.m7255a(parcel, 1000, this.f7109b);
        C1053b.m7251a(parcel, m7250a);
    }
}
