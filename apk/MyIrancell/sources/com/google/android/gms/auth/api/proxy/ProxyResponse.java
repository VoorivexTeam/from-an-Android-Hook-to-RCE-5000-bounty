package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public class ProxyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyResponse> CREATOR = new C0824c();

    /* renamed from: b */
    private final int f5574b;

    /* renamed from: c */
    public final int f5575c;

    /* renamed from: d */
    public final PendingIntent f5576d;

    /* renamed from: e */
    public final int f5577e;

    /* renamed from: f */
    private final Bundle f5578f;

    /* renamed from: g */
    public final byte[] f5579g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ProxyResponse(int i, int i2, PendingIntent pendingIntent, int i3, Bundle bundle, byte[] bArr) {
        this.f5574b = i;
        this.f5575c = i2;
        this.f5577e = i3;
        this.f5578f = bundle;
        this.f5579g = bArr;
        this.f5576d = pendingIntent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f5575c);
        C1053b.m7260a(parcel, 2, (Parcelable) this.f5576d, i, false);
        C1053b.m7255a(parcel, 3, this.f5577e);
        C1053b.m7257a(parcel, 4, this.f5578f, false);
        C1053b.m7270a(parcel, 5, this.f5579g, false);
        C1053b.m7255a(parcel, 1000, this.f5574b);
        C1053b.m7251a(parcel, m7250a);
    }
}
