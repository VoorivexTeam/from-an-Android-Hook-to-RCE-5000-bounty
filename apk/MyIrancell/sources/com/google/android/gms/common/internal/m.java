package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.kq;
import defpackage.lq;
import defpackage.mq;

/* loaded from: classes.dex */
public interface m extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends kq implements m {

        /* renamed from: com.google.android.gms.common.internal.m$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0046a extends lq implements m {
            C0046a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            @Override // com.google.android.gms.common.internal.m
            public final Account d() {
                Parcel a = a(2, zza());
                Account account = (Account) mq.a(a, Account.CREATOR);
                a.recycle();
                return account;
            }
        }

        public static m a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof m ? (m) queryLocalInterface : new C0046a(iBinder);
        }
    }

    Account d();
}
