package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import com.google.android.gms.location.AbstractBinderC1589i0;
import com.google.android.gms.location.AbstractBinderC1595l0;
import com.google.android.gms.location.InterfaceC1587h0;
import com.google.android.gms.location.InterfaceC1593k0;

/* loaded from: classes.dex */
public final class zzbf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbf> CREATOR = new C1186v();

    /* renamed from: b */
    private int f6457b;

    /* renamed from: c */
    private zzbd f6458c;

    /* renamed from: d */
    private InterfaceC1593k0 f6459d;

    /* renamed from: e */
    private PendingIntent f6460e;

    /* renamed from: f */
    private InterfaceC1587h0 f6461f;

    /* renamed from: g */
    private InterfaceC1164d f6462g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbf(int i, zzbd zzbdVar, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        this.f6457b = i;
        this.f6458c = zzbdVar;
        InterfaceC1164d interfaceC1164d = null;
        this.f6459d = iBinder == null ? null : AbstractBinderC1595l0.m8973a(iBinder);
        this.f6460e = pendingIntent;
        this.f6461f = iBinder2 == null ? null : AbstractBinderC1589i0.m8972a(iBinder2);
        if (iBinder3 != null && iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            interfaceC1164d = queryLocalInterface instanceof InterfaceC1164d ? (InterfaceC1164d) queryLocalInterface : new C1168f(iBinder3);
        }
        this.f6462g = interfaceC1164d;
    }

    /* renamed from: a */
    public static zzbf m7500a(InterfaceC1587h0 interfaceC1587h0, InterfaceC1164d interfaceC1164d) {
        return new zzbf(2, null, null, null, interfaceC1587h0.asBinder(), interfaceC1164d != null ? interfaceC1164d.asBinder() : null);
    }

    /* renamed from: a */
    public static zzbf m7501a(InterfaceC1593k0 interfaceC1593k0, InterfaceC1164d interfaceC1164d) {
        return new zzbf(2, null, interfaceC1593k0.asBinder(), null, null, interfaceC1164d != null ? interfaceC1164d.asBinder() : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f6457b);
        C1053b.m7260a(parcel, 2, (Parcelable) this.f6458c, i, false);
        InterfaceC1593k0 interfaceC1593k0 = this.f6459d;
        C1053b.m7258a(parcel, 3, interfaceC1593k0 == null ? null : interfaceC1593k0.asBinder(), false);
        C1053b.m7260a(parcel, 4, (Parcelable) this.f6460e, i, false);
        InterfaceC1587h0 interfaceC1587h0 = this.f6461f;
        C1053b.m7258a(parcel, 5, interfaceC1587h0 == null ? null : interfaceC1587h0.asBinder(), false);
        InterfaceC1164d interfaceC1164d = this.f6462g;
        C1053b.m7258a(parcel, 6, interfaceC1164d != null ? interfaceC1164d.asBinder() : null, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
