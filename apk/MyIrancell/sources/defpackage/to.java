package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class to extends bq implements uo {
    /* JADX INFO: Access modifiers changed from: package-private */
    public to(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    @Override // defpackage.uo
    public final void a(so soVar) {
        Parcel a = a();
        cq.a(a, soVar);
        b(1, a);
    }
}
