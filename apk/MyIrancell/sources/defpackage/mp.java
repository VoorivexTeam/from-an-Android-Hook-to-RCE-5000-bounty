package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class mp extends hp implements kp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public mp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // defpackage.kp
    public final boolean b() {
        Parcel a = a(6, a());
        boolean a2 = jp.a(a);
        a.recycle();
        return a2;
    }

    @Override // defpackage.kp
    public final boolean b(boolean z) {
        Parcel a = a();
        jp.a(a, true);
        Parcel a2 = a(2, a);
        boolean a3 = jp.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // defpackage.kp
    public final String f() {
        Parcel a = a(1, a());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
