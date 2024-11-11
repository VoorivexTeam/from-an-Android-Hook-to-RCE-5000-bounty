package p000;

import android.os.Parcel;

/* renamed from: ro */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3173ro extends BinderC0432aq implements InterfaceC3217so {
    public AbstractBinderC3173ro() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    @Override // p000.BinderC0432aq
    /* renamed from: a */
    protected boolean mo3179a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo14647e(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
