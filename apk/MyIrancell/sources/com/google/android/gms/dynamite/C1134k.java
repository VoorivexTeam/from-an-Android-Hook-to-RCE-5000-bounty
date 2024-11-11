package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import p000.C2906lq;
import p000.C2952mq;
import p000.InterfaceC2481fp;

/* renamed from: com.google.android.gms.dynamite.k */
/* loaded from: classes.dex */
public final class C1134k extends C2906lq implements InterfaceC1135l {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1134k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    @Override // com.google.android.gms.dynamite.InterfaceC1135l
    /* renamed from: a */
    public final InterfaceC2481fp mo7459a(InterfaceC2481fp interfaceC2481fp, String str, int i, InterfaceC2481fp interfaceC2481fp2) {
        Parcel zza = zza();
        C2952mq.m14173a(zza, interfaceC2481fp);
        zza.writeString(str);
        zza.writeInt(i);
        C2952mq.m14173a(zza, interfaceC2481fp2);
        Parcel m13923a = m13923a(2, zza);
        InterfaceC2481fp m11796a = InterfaceC2481fp.a.m11796a(m13923a.readStrongBinder());
        m13923a.recycle();
        return m11796a;
    }

    @Override // com.google.android.gms.dynamite.InterfaceC1135l
    /* renamed from: b */
    public final InterfaceC2481fp mo7460b(InterfaceC2481fp interfaceC2481fp, String str, int i, InterfaceC2481fp interfaceC2481fp2) {
        Parcel zza = zza();
        C2952mq.m14173a(zza, interfaceC2481fp);
        zza.writeString(str);
        zza.writeInt(i);
        C2952mq.m14173a(zza, interfaceC2481fp2);
        Parcel m13923a = m13923a(3, zza);
        InterfaceC2481fp m11796a = InterfaceC2481fp.a.m11796a(m13923a.readStrongBinder());
        m13923a.recycle();
        return m11796a;
    }
}
