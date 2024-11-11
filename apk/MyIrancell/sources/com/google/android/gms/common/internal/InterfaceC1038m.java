package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p000.BinderC2869kq;
import p000.C2906lq;
import p000.C2952mq;

/* renamed from: com.google.android.gms.common.internal.m */
/* loaded from: classes.dex */
public interface InterfaceC1038m extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.m$a */
    /* loaded from: classes.dex */
    public static abstract class a extends BinderC2869kq implements InterfaceC1038m {

        /* renamed from: com.google.android.gms.common.internal.m$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C3563a extends C2906lq implements InterfaceC1038m {
            C3563a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            @Override // com.google.android.gms.common.internal.InterfaceC1038m
            /* renamed from: d */
            public final Account mo7174d() {
                Parcel m13923a = m13923a(2, zza());
                Account account = (Account) C2952mq.m14172a(m13923a, Account.CREATOR);
                m13923a.recycle();
                return account;
            }
        }

        /* renamed from: a */
        public static InterfaceC1038m m7175a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof InterfaceC1038m ? (InterfaceC1038m) queryLocalInterface : new C3563a(iBinder);
        }
    }

    /* renamed from: d */
    Account mo7174d();
}
