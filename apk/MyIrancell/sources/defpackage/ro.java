package defpackage;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class ro extends aq implements so {
    public ro() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    @Override // defpackage.aq
    protected boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        e(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
