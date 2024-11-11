package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: up */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3314up extends BinderC2997np implements InterfaceC3367vp {
    public AbstractBinderC3314up() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    @Override // p000.BinderC2997np
    /* renamed from: a */
    protected final boolean mo14380a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo16044c((Status) C3174rp.m15290a(parcel, Status.CREATOR));
        return true;
    }
}
