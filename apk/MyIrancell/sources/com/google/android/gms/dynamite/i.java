package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.fp;
import defpackage.lq;
import defpackage.mq;

/* loaded from: classes.dex */
public final class i extends lq implements j {
    /* JADX INFO: Access modifiers changed from: package-private */
    public i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    @Override // com.google.android.gms.dynamite.j
    public final int a(fp fpVar, String str, boolean z) {
        Parcel zza = zza();
        mq.a(zza, fpVar);
        zza.writeString(str);
        mq.a(zza, z);
        Parcel a = a(5, zza);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.dynamite.j
    public final fp a(fp fpVar, String str, int i) {
        Parcel zza = zza();
        mq.a(zza, fpVar);
        zza.writeString(str);
        zza.writeInt(i);
        Parcel a = a(4, zza);
        fp a2 = fp.a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    @Override // com.google.android.gms.dynamite.j
    public final int b(fp fpVar, String str, boolean z) {
        Parcel zza = zza();
        mq.a(zza, fpVar);
        zza.writeString(str);
        mq.a(zza, z);
        Parcel a = a(3, zza);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.dynamite.j
    public final fp b(fp fpVar, String str, int i) {
        Parcel zza = zza();
        mq.a(zza, fpVar);
        zza.writeString(str);
        zza.writeInt(i);
        Parcel a = a(2, zza);
        fp a2 = fp.a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    @Override // com.google.android.gms.dynamite.j
    public final int g() {
        Parcel a = a(6, zza());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
