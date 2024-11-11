package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractBinderC1051s0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import javax.annotation.Nullable;
import p000.BinderC2521gp;
import p000.InterfaceC2481fp;

/* loaded from: classes.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new C1117w();

    /* renamed from: b */
    private final String f6372b;

    /* renamed from: c */
    @Nullable
    private final AbstractBinderC1073o f6373c;

    /* renamed from: d */
    private final boolean f6374d;

    /* renamed from: e */
    private final boolean f6375e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzj(String str, @Nullable IBinder iBinder, boolean z, boolean z2) {
        this.f6372b = str;
        this.f6373c = m7437a(iBinder);
        this.f6374d = z;
        this.f6375e = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzj(String str, @Nullable AbstractBinderC1073o abstractBinderC1073o, boolean z, boolean z2) {
        this.f6372b = str;
        this.f6373c = abstractBinderC1073o;
        this.f6374d = z;
        this.f6375e = z2;
    }

    @Nullable
    /* renamed from: a */
    private static AbstractBinderC1073o m7437a(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        try {
            InterfaceC2481fp zzb = AbstractBinderC1051s0.m7207a(iBinder).zzb();
            byte[] bArr = zzb == null ? null : (byte[]) BinderC2521gp.m12037a(zzb);
            if (bArr != null) {
                return new BinderC1076r(bArr);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7266a(parcel, 1, this.f6372b, false);
        AbstractBinderC1073o abstractBinderC1073o = this.f6373c;
        if (abstractBinderC1073o == null) {
            abstractBinderC1073o = null;
        } else {
            abstractBinderC1073o.asBinder();
        }
        C1053b.m7258a(parcel, 2, (IBinder) abstractBinderC1073o, false);
        C1053b.m7269a(parcel, 3, this.f6374d);
        C1053b.m7269a(parcel, 4, this.f6375e);
        C1053b.m7251a(parcel, m7250a);
    }
}
