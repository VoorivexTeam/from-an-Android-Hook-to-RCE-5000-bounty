package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public class AuthAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthAccountRequest> CREATOR = new C1063x();

    /* renamed from: b */
    private final int f6109b;

    /* renamed from: c */
    @Deprecated
    private final IBinder f6110c;

    /* renamed from: d */
    private final Scope[] f6111d;

    /* renamed from: e */
    private Integer f6112e;

    /* renamed from: f */
    private Integer f6113f;

    /* renamed from: g */
    private Account f6114g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AuthAccountRequest(int i, IBinder iBinder, Scope[] scopeArr, Integer num, Integer num2, Account account) {
        this.f6109b = i;
        this.f6110c = iBinder;
        this.f6111d = scopeArr;
        this.f6112e = num;
        this.f6113f = num2;
        this.f6114g = account;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f6109b);
        C1053b.m7258a(parcel, 2, this.f6110c, false);
        C1053b.m7271a(parcel, 3, (Parcelable[]) this.f6111d, i, false);
        C1053b.m7264a(parcel, 4, this.f6112e, false);
        C1053b.m7264a(parcel, 5, this.f6113f, false);
        C1053b.m7260a(parcel, 6, (Parcelable) this.f6114g, i, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
