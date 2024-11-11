package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.internal.p003authapi.BinderC1140b;

/* renamed from: com.google.android.gms.auth.api.signin.internal.o */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0847o extends BinderC1140b implements InterfaceC0846n {
    public AbstractBinderC0847o() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // com.google.android.gms.internal.p003authapi.BinderC1140b
    /* renamed from: a */
    protected final boolean mo6480a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo6478m();
        } else {
            if (i != 2) {
                return false;
            }
            mo6479n();
        }
        return true;
    }
}
