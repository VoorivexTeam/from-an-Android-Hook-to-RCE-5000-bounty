package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class sp extends qp implements tp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public sp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    @Override // defpackage.tp
    public final void a(vp vpVar) {
        Parcel zza = zza();
        rp.a(zza, vpVar);
        a(1, zza);
    }
}
