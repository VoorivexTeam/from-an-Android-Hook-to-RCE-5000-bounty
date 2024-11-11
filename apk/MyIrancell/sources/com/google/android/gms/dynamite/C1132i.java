package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import p000.C2906lq;
import p000.C2952mq;
import p000.InterfaceC2481fp;

/* renamed from: com.google.android.gms.dynamite.i */
/* loaded from: classes.dex */
public final class C1132i extends C2906lq implements InterfaceC1133j {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1132i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    @Override // com.google.android.gms.dynamite.InterfaceC1133j
    /* renamed from: a */
    public final int mo7454a(InterfaceC2481fp interfaceC2481fp, String str, boolean z) {
        Parcel zza = zza();
        C2952mq.m14173a(zza, interfaceC2481fp);
        zza.writeString(str);
        C2952mq.m14175a(zza, z);
        Parcel m13923a = m13923a(5, zza);
        int readInt = m13923a.readInt();
        m13923a.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.dynamite.InterfaceC1133j
    /* renamed from: a */
    public final InterfaceC2481fp mo7455a(InterfaceC2481fp interfaceC2481fp, String str, int i) {
        Parcel zza = zza();
        C2952mq.m14173a(zza, interfaceC2481fp);
        zza.writeString(str);
        zza.writeInt(i);
        Parcel m13923a = m13923a(4, zza);
        InterfaceC2481fp m11796a = InterfaceC2481fp.a.m11796a(m13923a.readStrongBinder());
        m13923a.recycle();
        return m11796a;
    }

    @Override // com.google.android.gms.dynamite.InterfaceC1133j
    /* renamed from: b */
    public final int mo7456b(InterfaceC2481fp interfaceC2481fp, String str, boolean z) {
        Parcel zza = zza();
        C2952mq.m14173a(zza, interfaceC2481fp);
        zza.writeString(str);
        C2952mq.m14175a(zza, z);
        Parcel m13923a = m13923a(3, zza);
        int readInt = m13923a.readInt();
        m13923a.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.dynamite.InterfaceC1133j
    /* renamed from: b */
    public final InterfaceC2481fp mo7457b(InterfaceC2481fp interfaceC2481fp, String str, int i) {
        Parcel zza = zza();
        C2952mq.m14173a(zza, interfaceC2481fp);
        zza.writeString(str);
        zza.writeInt(i);
        Parcel m13923a = m13923a(2, zza);
        InterfaceC2481fp m11796a = InterfaceC2481fp.a.m11796a(m13923a.readStrongBinder());
        m13923a.recycle();
        return m11796a;
    }

    @Override // com.google.android.gms.dynamite.InterfaceC1133j
    /* renamed from: g */
    public final int mo7458g() {
        Parcel m13923a = m13923a(6, zza());
        int readInt = m13923a.readInt();
        m13923a.recycle();
        return readInt;
    }
}
