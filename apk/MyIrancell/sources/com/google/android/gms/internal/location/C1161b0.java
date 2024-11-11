package com.google.android.gms.internal.location;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.location.b0 */
/* loaded from: classes.dex */
public class C1161b0 {
    static {
        C1161b0.class.getClassLoader();
    }

    private C1161b0() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m7471a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m7472a(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: a */
    public static void m7473a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* renamed from: a */
    public static void m7474a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }
}
