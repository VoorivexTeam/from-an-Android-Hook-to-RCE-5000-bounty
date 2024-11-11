package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p000.BinderC2869kq;
import p000.C2952mq;
import p000.InterfaceC2481fp;

/* renamed from: com.google.android.gms.common.internal.s0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1051s0 extends BinderC2869kq implements InterfaceC1047q0 {
    public AbstractBinderC1051s0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: a */
    public static InterfaceC1047q0 m7207a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof InterfaceC1047q0 ? (InterfaceC1047q0) queryLocalInterface : new C1049r0(iBinder);
    }

    @Override // p000.BinderC2869kq
    /* renamed from: a */
    protected final boolean mo7184a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            InterfaceC2481fp zzb = zzb();
            parcel2.writeNoException();
            C2952mq.m14173a(parcel2, zzb);
        } else {
            if (i != 2) {
                return false;
            }
            int mo7200b = mo7200b();
            parcel2.writeNoException();
            parcel2.writeInt(mo7200b);
        }
        return true;
    }
}
