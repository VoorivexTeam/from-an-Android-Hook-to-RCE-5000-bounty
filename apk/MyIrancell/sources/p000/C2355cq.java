package p000;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: cq */
/* loaded from: classes.dex */
public class C2355cq {
    static {
        C2355cq.class.getClassLoader();
    }

    private C2355cq() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m11206a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m11207a(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: a */
    public static void m11208a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* renamed from: a */
    public static void m11209a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }
}
