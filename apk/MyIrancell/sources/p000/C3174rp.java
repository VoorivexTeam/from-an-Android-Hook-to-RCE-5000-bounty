package p000;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: rp */
/* loaded from: classes.dex */
public class C3174rp {
    static {
        C3174rp.class.getClassLoader();
    }

    private C3174rp() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m15290a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m15291a(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }
}
