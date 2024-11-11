package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C0990u();

    /* renamed from: b */
    private final int f5666b;

    /* renamed from: c */
    private final String f5667c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Scope(int i, String str) {
        C1057u.m7288a(str, (Object) "scopeUri must not be null or empty");
        this.f5666b = i;
        this.f5667c = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f5667c.equals(((Scope) obj).f5667c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5667c.hashCode();
    }

    /* renamed from: j */
    public final String m6494j() {
        return this.f5667c;
    }

    public final String toString() {
        return this.f5667c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f5666b);
        C1053b.m7266a(parcel, 2, m6494j(), false);
        C1053b.m7251a(parcel, m7250a);
    }
}
