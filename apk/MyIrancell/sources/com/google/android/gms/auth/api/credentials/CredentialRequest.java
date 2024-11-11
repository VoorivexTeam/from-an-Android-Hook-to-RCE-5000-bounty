package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialRequest> CREATOR = new C0816d();

    /* renamed from: b */
    private final int f5549b;

    /* renamed from: c */
    private final boolean f5550c;

    /* renamed from: d */
    private final String[] f5551d;

    /* renamed from: e */
    private final CredentialPickerConfig f5552e;

    /* renamed from: f */
    private final CredentialPickerConfig f5553f;

    /* renamed from: g */
    private final boolean f5554g;

    /* renamed from: h */
    private final String f5555h;

    /* renamed from: i */
    private final String f5556i;

    /* renamed from: j */
    private final boolean f5557j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CredentialRequest(int i, boolean z, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z2, String str, String str2, boolean z3) {
        this.f5549b = i;
        this.f5550c = z;
        C1057u.m7286a(strArr);
        this.f5551d = strArr;
        this.f5552e = credentialPickerConfig == null ? new CredentialPickerConfig.C0812a().m6370a() : credentialPickerConfig;
        this.f5553f = credentialPickerConfig2 == null ? new CredentialPickerConfig.C0812a().m6370a() : credentialPickerConfig2;
        if (i < 3) {
            this.f5554g = true;
            this.f5555h = null;
            this.f5556i = null;
        } else {
            this.f5554g = z2;
            this.f5555h = str;
            this.f5556i = str2;
        }
        this.f5557j = z3;
    }

    /* renamed from: j */
    public final String[] m6371j() {
        return this.f5551d;
    }

    /* renamed from: k */
    public final CredentialPickerConfig m6372k() {
        return this.f5553f;
    }

    /* renamed from: l */
    public final CredentialPickerConfig m6373l() {
        return this.f5552e;
    }

    /* renamed from: m */
    public final String m6374m() {
        return this.f5556i;
    }

    /* renamed from: n */
    public final String m6375n() {
        return this.f5555h;
    }

    /* renamed from: o */
    public final boolean m6376o() {
        return this.f5554g;
    }

    /* renamed from: p */
    public final boolean m6377p() {
        return this.f5550c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7269a(parcel, 1, m6377p());
        C1053b.m7272a(parcel, 2, m6371j(), false);
        C1053b.m7260a(parcel, 3, (Parcelable) m6373l(), i, false);
        C1053b.m7260a(parcel, 4, (Parcelable) m6372k(), i, false);
        C1053b.m7269a(parcel, 5, m6376o());
        C1053b.m7266a(parcel, 6, m6375n(), false);
        C1053b.m7266a(parcel, 7, m6374m(), false);
        C1053b.m7255a(parcel, 1000, this.f5549b);
        C1053b.m7269a(parcel, 8, this.f5557j);
        C1053b.m7251a(parcel, m7250a);
    }
}
