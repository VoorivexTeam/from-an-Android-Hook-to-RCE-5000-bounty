package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new C0815c();

    /* renamed from: b */
    private final int f5542b;

    /* renamed from: c */
    private final boolean f5543c;

    /* renamed from: d */
    private final boolean f5544d;

    /* renamed from: e */
    private final int f5545e;

    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialPickerConfig$a */
    /* loaded from: classes.dex */
    public static class C0812a {

        /* renamed from: a */
        private boolean f5546a = false;

        /* renamed from: b */
        private boolean f5547b = true;

        /* renamed from: c */
        private int f5548c = 1;

        /* renamed from: a */
        public CredentialPickerConfig m6370a() {
            return new CredentialPickerConfig(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CredentialPickerConfig(int i, boolean z, boolean z2, boolean z3, int i2) {
        this.f5542b = i;
        this.f5543c = z;
        this.f5544d = z2;
        if (i < 2) {
            this.f5545e = z3 ? 3 : 1;
        } else {
            this.f5545e = i2;
        }
    }

    private CredentialPickerConfig(C0812a c0812a) {
        this(2, c0812a.f5546a, c0812a.f5547b, false, c0812a.f5548c);
    }

    @Deprecated
    /* renamed from: j */
    public final boolean m6364j() {
        return this.f5545e == 3;
    }

    /* renamed from: k */
    public final boolean m6365k() {
        return this.f5543c;
    }

    /* renamed from: l */
    public final boolean m6366l() {
        return this.f5544d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7269a(parcel, 1, m6365k());
        C1053b.m7269a(parcel, 2, m6366l());
        C1053b.m7269a(parcel, 3, m6364j());
        C1053b.m7255a(parcel, 4, this.f5545e);
        C1053b.m7255a(parcel, 1000, this.f5542b);
        C1053b.m7251a(parcel, m7250a);
    }
}
