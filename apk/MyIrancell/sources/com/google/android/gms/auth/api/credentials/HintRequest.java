package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new C0817e();

    /* renamed from: b */
    private final int f5558b;

    /* renamed from: c */
    private final CredentialPickerConfig f5559c;

    /* renamed from: d */
    private final boolean f5560d;

    /* renamed from: e */
    private final boolean f5561e;

    /* renamed from: f */
    private final String[] f5562f;

    /* renamed from: g */
    private final boolean f5563g;

    /* renamed from: h */
    private final String f5564h;

    /* renamed from: i */
    private final String f5565i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, String[] strArr, boolean z3, String str, String str2) {
        this.f5558b = i;
        C1057u.m7286a(credentialPickerConfig);
        this.f5559c = credentialPickerConfig;
        this.f5560d = z;
        this.f5561e = z2;
        C1057u.m7286a(strArr);
        this.f5562f = strArr;
        if (this.f5558b < 2) {
            this.f5563g = true;
            this.f5564h = null;
            this.f5565i = null;
        } else {
            this.f5563g = z3;
            this.f5564h = str;
            this.f5565i = str2;
        }
    }

    /* renamed from: j */
    public final String[] m6378j() {
        return this.f5562f;
    }

    /* renamed from: k */
    public final CredentialPickerConfig m6379k() {
        return this.f5559c;
    }

    /* renamed from: l */
    public final String m6380l() {
        return this.f5565i;
    }

    /* renamed from: m */
    public final String m6381m() {
        return this.f5564h;
    }

    /* renamed from: n */
    public final boolean m6382n() {
        return this.f5560d;
    }

    /* renamed from: o */
    public final boolean m6383o() {
        return this.f5563g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7260a(parcel, 1, (Parcelable) m6379k(), i, false);
        C1053b.m7269a(parcel, 2, m6382n());
        C1053b.m7269a(parcel, 3, this.f5561e);
        C1053b.m7272a(parcel, 4, m6378j(), false);
        C1053b.m7269a(parcel, 5, m6383o());
        C1053b.m7266a(parcel, 6, m6381m(), false);
        C1053b.m7266a(parcel, 7, m6380l(), false);
        C1053b.m7255a(parcel, 1000, this.f5558b);
        C1053b.m7251a(parcel, m7250a);
    }
}
