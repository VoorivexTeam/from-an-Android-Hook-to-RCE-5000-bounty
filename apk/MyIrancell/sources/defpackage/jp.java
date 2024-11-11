package defpackage;

import android.os.Parcel;

/* loaded from: classes.dex */
public class jp {
    static {
        jp.class.getClassLoader();
    }

    private jp() {
    }

    public static void a(Parcel parcel, boolean z) {
        parcel.writeInt(1);
    }

    public static boolean a(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
