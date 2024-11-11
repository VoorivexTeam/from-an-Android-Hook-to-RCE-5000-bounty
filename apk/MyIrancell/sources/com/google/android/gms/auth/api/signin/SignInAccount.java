package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new C0831f();

    /* renamed from: b */
    @Deprecated
    private String f5620b;

    /* renamed from: c */
    private GoogleSignInAccount f5621c;

    /* renamed from: d */
    @Deprecated
    private String f5622d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f5621c = googleSignInAccount;
        C1057u.m7288a(str, (Object) "8.3 and 8.4 SDKs require non-null email");
        this.f5620b = str;
        C1057u.m7288a(str2, (Object) "8.3 and 8.4 SDKs require non-null userId");
        this.f5622d = str2;
    }

    @Nullable
    /* renamed from: i */
    public final GoogleSignInAccount m6430i() {
        return this.f5621c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7266a(parcel, 4, this.f5620b, false);
        C1053b.m7260a(parcel, 7, (Parcelable) this.f5621c, i, false);
        C1053b.m7266a(parcel, 8, this.f5622d, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
