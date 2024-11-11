package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new C0853u();

    /* renamed from: b */
    private final String f5627b;

    /* renamed from: c */
    private GoogleSignInOptions f5628c;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        C1057u.m7296b(str);
        this.f5627b = str;
        this.f5628c = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f5627b.equals(signInConfiguration.f5627b)) {
            GoogleSignInOptions googleSignInOptions = this.f5628c;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f5628c;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        C0833a c0833a = new C0833a();
        c0833a.m6439a(this.f5627b);
        c0833a.m6439a(this.f5628c);
        return c0833a.m6438a();
    }

    /* renamed from: j */
    public final GoogleSignInOptions m6433j() {
        return this.f5628c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7266a(parcel, 2, this.f5627b, false);
        C1053b.m7260a(parcel, 5, (Parcelable) this.f5628c, i, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
