package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import p000.AbstractBinderC2999nr;
import p000.InterfaceC2953mr;

/* loaded from: classes.dex */
public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new C1655u();

    /* renamed from: b */
    private InterfaceC2953mr f7326b;

    /* renamed from: c */
    private boolean f7327c;

    /* renamed from: d */
    private float f7328d;

    /* renamed from: e */
    private boolean f7329e;

    /* renamed from: f */
    private float f7330f;

    public TileOverlayOptions() {
        this.f7327c = true;
        this.f7329e = true;
        this.f7330f = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TileOverlayOptions(IBinder iBinder, boolean z, float f, boolean z2, float f2) {
        this.f7327c = true;
        this.f7329e = true;
        this.f7330f = 0.0f;
        InterfaceC2953mr m14382a = AbstractBinderC2999nr.m14382a(iBinder);
        this.f7326b = m14382a;
        if (m14382a != null) {
            new C1654t(this);
        }
        this.f7327c = z;
        this.f7328d = f;
        this.f7329e = z2;
        this.f7330f = f2;
    }

    /* renamed from: j */
    public final boolean m9064j() {
        return this.f7329e;
    }

    /* renamed from: k */
    public final float m9065k() {
        return this.f7330f;
    }

    /* renamed from: l */
    public final float m9066l() {
        return this.f7328d;
    }

    /* renamed from: m */
    public final boolean m9067m() {
        return this.f7327c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7258a(parcel, 2, this.f7326b.asBinder(), false);
        C1053b.m7269a(parcel, 3, m9067m());
        C1053b.m7254a(parcel, 4, m9066l());
        C1053b.m7269a(parcel, 5, m9064j());
        C1053b.m7254a(parcel, 6, m9065k());
        C1053b.m7251a(parcel, m7250a);
    }
}
