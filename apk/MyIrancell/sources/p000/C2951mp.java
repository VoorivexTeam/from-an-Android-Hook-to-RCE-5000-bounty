package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: mp */
/* loaded from: classes.dex */
public final class C2951mp extends C2561hp implements InterfaceC2868kp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2951mp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // p000.InterfaceC2868kp
    /* renamed from: b */
    public final boolean mo13744b() {
        Parcel m12242a = m12242a(6, m12241a());
        boolean m13514a = C2823jp.m13514a(m12242a);
        m12242a.recycle();
        return m13514a;
    }

    @Override // p000.InterfaceC2868kp
    /* renamed from: b */
    public final boolean mo13745b(boolean z) {
        Parcel m12241a = m12241a();
        C2823jp.m13513a(m12241a, true);
        Parcel m12242a = m12242a(2, m12241a);
        boolean m13514a = C2823jp.m13514a(m12242a);
        m12242a.recycle();
        return m13514a;
    }

    @Override // p000.InterfaceC2868kp
    /* renamed from: f */
    public final String mo13746f() {
        Parcel m12242a = m12242a(1, m12241a());
        String readString = m12242a.readString();
        m12242a.recycle();
        return readString;
    }
}
