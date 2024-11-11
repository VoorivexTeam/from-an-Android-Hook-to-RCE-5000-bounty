package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzam extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzam> CREATOR = new C1816n();

    /* renamed from: b */
    private final Bundle f8219b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzam(Bundle bundle) {
        this.f8219b = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object m9967a(String str) {
        return this.f8219b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final Long m9968b(String str) {
        return Long.valueOf(this.f8219b.getLong(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final Double m9969c(String str) {
        return Double.valueOf(this.f8219b.getDouble(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final String m9970d(String str) {
        return this.f8219b.getString(str);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new C1804m(this);
    }

    public final String toString() {
        return this.f8219b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7257a(parcel, 2, zzb(), false);
        C1053b.m7251a(parcel, m7250a);
    }

    public final int zza() {
        return this.f8219b.size();
    }

    public final Bundle zzb() {
        return new Bundle(this.f8219b);
    }
}
