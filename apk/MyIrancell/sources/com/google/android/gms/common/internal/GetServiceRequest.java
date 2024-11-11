package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C0994d;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.InterfaceC1038m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new C1037l0();

    /* renamed from: b */
    private final int f6118b;

    /* renamed from: c */
    private final int f6119c;

    /* renamed from: d */
    private int f6120d;

    /* renamed from: e */
    String f6121e;

    /* renamed from: f */
    IBinder f6122f;

    /* renamed from: g */
    Scope[] f6123g;

    /* renamed from: h */
    Bundle f6124h;

    /* renamed from: i */
    Account f6125i;

    /* renamed from: j */
    Feature[] f6126j;

    /* renamed from: k */
    Feature[] f6127k;

    /* renamed from: l */
    private boolean f6128l;

    /* renamed from: m */
    private int f6129m;

    public GetServiceRequest(int i) {
        this.f6118b = 4;
        this.f6120d = C0994d.f6050a;
        this.f6119c = i;
        this.f6128l = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z, int i4) {
        this.f6118b = i;
        this.f6119c = i2;
        this.f6120d = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f6121e = "com.google.android.gms";
        } else {
            this.f6121e = str;
        }
        if (i < 2) {
            this.f6125i = iBinder != null ? BinderC1014a.m7041a(InterfaceC1038m.a.m7175a(iBinder)) : null;
        } else {
            this.f6122f = iBinder;
            this.f6125i = account;
        }
        this.f6123g = scopeArr;
        this.f6124h = bundle;
        this.f6126j = featureArr;
        this.f6127k = featureArr2;
        this.f6128l = z;
        this.f6129m = i4;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f6118b);
        C1053b.m7255a(parcel, 2, this.f6119c);
        C1053b.m7255a(parcel, 3, this.f6120d);
        C1053b.m7266a(parcel, 4, this.f6121e, false);
        C1053b.m7258a(parcel, 5, this.f6122f, false);
        C1053b.m7271a(parcel, 6, (Parcelable[]) this.f6123g, i, false);
        C1053b.m7257a(parcel, 7, this.f6124h, false);
        C1053b.m7260a(parcel, 8, (Parcelable) this.f6125i, i, false);
        C1053b.m7271a(parcel, 10, (Parcelable[]) this.f6126j, i, false);
        C1053b.m7271a(parcel, 11, (Parcelable[]) this.f6127k, i, false);
        C1053b.m7269a(parcel, 12, this.f6128l);
        C1053b.m7255a(parcel, 13, this.f6129m);
        C1053b.m7251a(parcel, m7250a);
    }
}
