package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public class ProxyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyRequest> CREATOR = new C0823b();

    /* renamed from: b */
    private final int f5568b;

    /* renamed from: c */
    public final String f5569c;

    /* renamed from: d */
    public final int f5570d;

    /* renamed from: e */
    public final long f5571e;

    /* renamed from: f */
    public final byte[] f5572f;

    /* renamed from: g */
    private Bundle f5573g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ProxyRequest(int i, String str, int i2, long j, byte[] bArr, Bundle bundle) {
        this.f5568b = i;
        this.f5569c = str;
        this.f5570d = i2;
        this.f5571e = j;
        this.f5572f = bArr;
        this.f5573g = bundle;
    }

    public String toString() {
        String str = this.f5569c;
        int i = this.f5570d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42);
        sb.append("ProxyRequest[ url: ");
        sb.append(str);
        sb.append(", method: ");
        sb.append(i);
        sb.append(" ]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7266a(parcel, 1, this.f5569c, false);
        C1053b.m7255a(parcel, 2, this.f5570d);
        C1053b.m7256a(parcel, 3, this.f5571e);
        C1053b.m7270a(parcel, 4, this.f5572f, false);
        C1053b.m7257a(parcel, 5, this.f5573g, false);
        C1053b.m7255a(parcel, 1000, this.f5568b);
        C1053b.m7251a(parcel, m7250a);
    }
}
