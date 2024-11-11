package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import p000.C2906lq;
import p000.InterfaceC2481fp;

/* renamed from: com.google.android.gms.common.internal.r0 */
/* loaded from: classes.dex */
public final class C1049r0 extends C2906lq implements InterfaceC1047q0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1049r0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1047q0
    /* renamed from: b */
    public final int mo7200b() {
        Parcel m13923a = m13923a(2, zza());
        int readInt = m13923a.readInt();
        m13923a.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1047q0
    public final InterfaceC2481fp zzb() {
        Parcel m13923a = m13923a(1, zza());
        InterfaceC2481fp m11796a = InterfaceC2481fp.a.m11796a(m13923a.readStrongBinder());
        m13923a.recycle();
        return m11796a;
    }
}
