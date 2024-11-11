package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.zzj;
import p000.C2906lq;
import p000.C2952mq;
import p000.InterfaceC2481fp;

/* renamed from: com.google.android.gms.common.internal.v0 */
/* loaded from: classes.dex */
public final class C1060v0 extends C2906lq implements InterfaceC1058u0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1060v0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1058u0
    /* renamed from: a */
    public final boolean mo7301a(zzj zzjVar, InterfaceC2481fp interfaceC2481fp) {
        Parcel zza = zza();
        C2952mq.m14174a(zza, zzjVar);
        C2952mq.m14173a(zza, interfaceC2481fp);
        Parcel m13923a = m13923a(5, zza);
        boolean m14176a = C2952mq.m14176a(m13923a);
        m13923a.recycle();
        return m14176a;
    }
}
