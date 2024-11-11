package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.gd */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1295gd extends BinderC1328j1 implements InterfaceC1428pc {
    public AbstractBinderC1295gd() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.BinderC1328j1
    /* renamed from: a */
    protected final boolean mo7857a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo7833a((Bundle) C1443r.m8258a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
