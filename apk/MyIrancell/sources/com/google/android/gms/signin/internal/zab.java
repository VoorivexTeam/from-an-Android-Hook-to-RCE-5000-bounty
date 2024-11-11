package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.InterfaceC0982m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class zab extends AbstractSafeParcelable implements InterfaceC0982m {
    public static final Parcelable.Creator<zab> CREATOR = new C1961b();

    /* renamed from: b */
    private final int f8269b;

    /* renamed from: c */
    private int f8270c;

    /* renamed from: d */
    private Intent f8271d;

    public zab() {
        this(0, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zab(int i, int i2, Intent intent) {
        this.f8269b = i;
        this.f8270c = i2;
        this.f8271d = intent;
    }

    private zab(int i, Intent intent) {
        this(2, 0, null);
    }

    @Override // com.google.android.gms.common.api.InterfaceC0982m
    /* renamed from: e */
    public final Status mo6496e() {
        return this.f8270c == 0 ? Status.f5668f : Status.f5672j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f8269b);
        C1053b.m7255a(parcel, 2, this.f8270c);
        C1053b.m7260a(parcel, 3, (Parcelable) this.f8271d, i, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
