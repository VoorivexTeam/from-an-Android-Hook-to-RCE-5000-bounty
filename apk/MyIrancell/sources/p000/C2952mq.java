package p000;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: mq */
/* loaded from: classes.dex */
public class C2952mq {
    static {
        C2952mq.class.getClassLoader();
    }

    private C2952mq() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m14172a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m14173a(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: a */
    public static void m14174a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* renamed from: a */
    public static void m14175a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public static boolean m14176a(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
