package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.fp;
import defpackage.lq;
import defpackage.mq;

/* loaded from: classes.dex */
public final class k extends lq implements l {
    /* JADX INFO: Access modifiers changed from: package-private */
    public k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    @Override // com.google.android.gms.dynamite.l
    public final fp a(fp fpVar, String str, int i, fp fpVar2) {
        Parcel zza = zza();
        mq.a(zza, fpVar);
        zza.writeString(str);
        zza.writeInt(i);
        mq.a(zza, fpVar2);
        Parcel a = a(2, zza);
        fp a2 = fp.a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    @Override // com.google.android.gms.dynamite.l
    public final fp b(fp fpVar, String str, int i, fp fpVar2) {
        Parcel zza = zza();
        mq.a(zza, fpVar);
        zza.writeString(str);
        zza.writeInt(i);
        mq.a(zza, fpVar2);
        Parcel a = a(3, zza);
        fp a2 = fp.a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
