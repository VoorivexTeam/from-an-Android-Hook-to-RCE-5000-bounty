package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = new C0855b();

    /* renamed from: b */
    private final int f5477b;

    /* renamed from: c */
    private int f5478c;

    /* renamed from: d */
    @Deprecated
    private String f5479d;

    /* renamed from: e */
    private Account f5480e;

    public AccountChangeEventsRequest() {
        this.f5477b = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AccountChangeEventsRequest(int i, int i2, String str, Account account) {
        this.f5477b = i;
        this.f5478c = i2;
        this.f5479d = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f5480e = account;
        } else {
            this.f5480e = new Account(str, "com.google");
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f5477b);
        C1053b.m7255a(parcel, 2, this.f5478c);
        C1053b.m7266a(parcel, 3, this.f5479d, false);
        C1053b.m7260a(parcel, 4, (Parcelable) this.f5480e, i, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
