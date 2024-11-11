package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import com.google.android.gms.location.BinderC1583f0;
import com.google.android.gms.location.InterfaceC1581e0;

/* loaded from: classes.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new C1169f0();

    /* renamed from: b */
    private int f6477b;

    /* renamed from: c */
    private zzm f6478c;

    /* renamed from: d */
    private InterfaceC1581e0 f6479d;

    /* renamed from: e */
    private InterfaceC1164d f6480e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzo(int i, zzm zzmVar, IBinder iBinder, IBinder iBinder2) {
        this.f6477b = i;
        this.f6478c = zzmVar;
        InterfaceC1164d interfaceC1164d = null;
        this.f6479d = iBinder == null ? null : BinderC1583f0.m8970a(iBinder);
        if (iBinder2 != null && iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            interfaceC1164d = queryLocalInterface instanceof InterfaceC1164d ? (InterfaceC1164d) queryLocalInterface : new C1168f(iBinder2);
        }
        this.f6480e = interfaceC1164d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f6477b);
        C1053b.m7260a(parcel, 2, (Parcelable) this.f6478c, i, false);
        InterfaceC1581e0 interfaceC1581e0 = this.f6479d;
        C1053b.m7258a(parcel, 3, interfaceC1581e0 == null ? null : interfaceC1581e0.asBinder(), false);
        InterfaceC1164d interfaceC1164d = this.f6480e;
        C1053b.m7258a(parcel, 4, interfaceC1164d != null ? interfaceC1164d.asBinder() : null, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
