package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public class ResolveAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResolveAccountRequest> CREATOR = new C1027g0();

    /* renamed from: b */
    private final int f6130b;

    /* renamed from: c */
    private final Account f6131c;

    /* renamed from: d */
    private final int f6132d;

    /* renamed from: e */
    private final GoogleSignInAccount f6133e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ResolveAccountRequest(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f6130b = i;
        this.f6131c = account;
        this.f6132d = i2;
        this.f6133e = googleSignInAccount;
    }

    public ResolveAccountRequest(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    /* renamed from: d */
    public Account m7031d() {
        return this.f6131c;
    }

    /* renamed from: j */
    public int m7032j() {
        return this.f6132d;
    }

    /* renamed from: k */
    public GoogleSignInAccount m7033k() {
        return this.f6133e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f6130b);
        C1053b.m7260a(parcel, 2, (Parcelable) m7031d(), i, false);
        C1053b.m7255a(parcel, 3, m7032j());
        C1053b.m7260a(parcel, 4, (Parcelable) m7033k(), i, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
