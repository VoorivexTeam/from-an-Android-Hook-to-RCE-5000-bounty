package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p000.BinderC2869kq;
import p000.C2952mq;

/* renamed from: com.google.android.gms.common.internal.o */
/* loaded from: classes.dex */
public interface InterfaceC1042o extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.o$a */
    /* loaded from: classes.dex */
    public static abstract class a extends BinderC2869kq implements InterfaceC1042o {
        public a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        @Override // p000.BinderC2869kq
        /* renamed from: a */
        protected final boolean mo7184a(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                mo7112a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C2952mq.m14172a(parcel, Bundle.CREATOR));
            } else if (i == 2) {
                mo7111a(parcel.readInt(), (Bundle) C2952mq.m14172a(parcel, Bundle.CREATOR));
            } else {
                if (i != 3) {
                    return false;
                }
                mo7113a(parcel.readInt(), parcel.readStrongBinder(), (zza) C2952mq.m14172a(parcel, zza.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: a */
    void mo7111a(int i, Bundle bundle);

    /* renamed from: a */
    void mo7112a(int i, IBinder iBinder, Bundle bundle);

    /* renamed from: a */
    void mo7113a(int i, IBinder iBinder, zza zzaVar);
}
